package uk.co.gluedit.tricks;

import com.google.common.io.Resources;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class Tricks {

    @Test
    public void testInts() {
        int a = 1;
        int b = 1;
        assertTrue(a == b);

        Integer c = new Integer(1);
        Integer d = new Integer(1);
        assertFalse(c == d);
        assertTrue(c.equals(d) && d.equals(c));
    }

    @Test
    public void testStrings() {
        String a = "blah";
        String b = "blah";
        String x = "b" + "lah";
        assertTrue(a == b);
        assertTrue(b == x);

        String c = new String("blah");
        String d = new String("blah");
        assertFalse(c == d);
        assertTrue(c.equals(d) && d.equals(c));
    }

    @Test
    public void testNio() throws IOException {
        RandomAccessFile file = new RandomAccessFile(Resources.getResource("nio-text-file.txt").getPath(), "rw");
        long fileLength = file.length();
        FileChannel channel = file.getChannel();
        ByteBuffer buffy = ByteBuffer.allocate(48);

        int bytesRead = channel.read(buffy);
        int total = bytesRead;
        System.out.println();
        while (bytesRead != -1) {
            assertTrue(bytesRead <= 48);
            // get ready to read from buffer
            buffy.flip();
            while (buffy.hasRemaining())
                System.out.print((char) buffy.get());
            // get ready for next read
            buffy.clear();
            bytesRead = channel.read(buffy);
            if (bytesRead > -1)
                total += bytesRead;
        }
        System.out.println();
        assertEquals(total, fileLength);
    }

    @Test
    public void testClientServer() throws IOException, InterruptedException {
        Thread serverThread = new Thread(() -> {
            try {
                ServerSocket sSock = new ServerSocket(9898);
                Socket cSock = sSock.accept();

                BufferedReader readMe = new BufferedReader(new InputStreamReader(cSock.getInputStream()));
                assertEquals("Hello world!", readMe.readLine());
                cSock.getOutputStream().write("Hello client!\n".getBytes());

                cSock.close();
                sSock.close();
            } catch (IOException e) {
                fail("Server error: " + e.getMessage());
            }
        });
        serverThread.start();
        sleep(100); // give the server a chance to start

        Socket s = new Socket("localhost", 9898);
        s.getOutputStream().write("Hello world!\n".getBytes());
        BufferedReader buffy = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String answer = buffy.readLine();
        assertEquals("Hello client!", answer);

        s.close();
    }

}
