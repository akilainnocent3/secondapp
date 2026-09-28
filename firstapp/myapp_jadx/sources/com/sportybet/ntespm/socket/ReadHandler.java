package com.sportybet.ntespm.socket;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import defpackage.b9p;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class ReadHandler extends Handler {
    public static final int MESSAGE_READ = 0;
    private final byte[] mHeaderBuffer;
    private Handler mMainThreadHandler;
    private final byte[] mTypeBuffer;

    public ReadHandler(Looper looper) {
        super(looper);
        this.mHeaderBuffer = new byte[4];
        this.mTypeBuffer = new byte[2];
    }

    private void read(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();
        readFullyOrThrow(inputStream, this.mHeaderBuffer, "Stream closed unexpectedly when reading header");
        int i = ByteBuffer.wrap(this.mHeaderBuffer).getInt();
        readFullyOrThrow(inputStream, this.mTypeBuffer, "Stream closed unexpectedly when reading type");
        short s = ByteBuffer.wrap(this.mTypeBuffer).getShort();
        byte[] bArr = new byte[i - 2];
        readFullyOrThrow(inputStream, bArr, "Stream closed unexpectedly when reading body");
        Handler handler = this.mMainThreadHandler;
        handler.sendMessage(handler.obtainMessage(1, s, 0, Pair.create(socket, bArr)));
    }

    private void readFullyOrThrow(InputStream inputStream, byte[] bArr, String str) throws IOException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = inputStream.read(bArr, i, bArr.length - i);
            if (i2 < 0) {
                b9p.a(str);
                return;
            }
            i += i2;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 0) {
            Socket socket = (Socket) message.obj;
            try {
                read(socket);
                sendMessage(Message.obtain(message));
            } catch (Throwable unused) {
                Handler handler = this.mMainThreadHandler;
                handler.sendMessage(handler.obtainMessage(2, socket));
            }
        }
    }

    public void setMainThreadHandler(Handler handler) {
        this.mMainThreadHandler = handler;
    }
}
