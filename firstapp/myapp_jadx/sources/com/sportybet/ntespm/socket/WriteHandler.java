package com.sportybet.ntespm.socket;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.protobuf.MessageLite;
import com.sporty.android.core.model.MyLog;
import defpackage.bxg0;
import defpackage.itf0;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class WriteHandler extends Handler {
    public static final int MESSAGE_CLOSE = 5;
    public static final int MESSAGE_CONNECT = 0;
    public static final int MESSAGE_HEARTBEAT = 4;
    public static final int MESSAGE_REGISTER = 1;
    public static final int MESSAGE_SUBSCRIBE = 2;
    public static final int MESSAGE_UNSUBSCRIBE = 3;
    private Handler mMainThreadHandler;

    public WriteHandler(Looper looper) {
        super(looper);
    }

    private void sendDisconnectMessage(Socket socket) {
        Handler handler = this.mMainThreadHandler;
        handler.sendMessage(handler.obtainMessage(2, socket));
    }

    private boolean write(Socket socket, MessageLite messageLite, short s) {
        try {
            int serializedSize = messageLite.getSerializedSize();
            ByteBuffer byteBufferPut = ByteBuffer.allocate(serializedSize + 6).putInt(serializedSize + 2).putShort(s).put(messageLite.toByteArray());
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(byteBufferPut.array());
            outputStream.flush();
            return true;
        } catch (Exception unused) {
            sendDisconnectMessage(socket);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Pair pair = (Pair) message.obj;
            Socket socket = (Socket) pair.first;
            try {
                String[] strArrSplit = ((String) pair.second).split(":");
                socket.connect(new InetSocketAddress(strArrSplit[0], Integer.parseInt(strArrSplit[1])), 10000);
                Handler handler = this.mMainThreadHandler;
                handler.sendMessage(handler.obtainMessage(0, socket));
                return;
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SOCKET);
                aVar.p(e, "Socket connect error", new Object[0]);
                sendDisconnectMessage(socket);
                return;
            }
        }
        if (i == 1) {
            Pair pair2 = (Pair) message.obj;
            MessageLite messageLite = (MessageLite) pair2.second;
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SOCKET);
            aVar2.a("--> REGISTER, data: %s", messageLite);
            write((Socket) pair2.first, messageLite, (short) 1);
            return;
        }
        if (i == 2) {
            bxg0 bxg0Var = (bxg0) message.obj;
            MessageLite messageLite2 = (MessageLite) bxg0Var.b;
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_SOCKET);
            aVar3.a("--> SUBSCRIBE, data: %s", messageLite2);
            if (write((Socket) bxg0Var.a, messageLite2, (short) 2)) {
                Handler handler2 = this.mMainThreadHandler;
                handler2.sendMessage(handler2.obtainMessage(4, bxg0Var.c));
                return;
            }
            return;
        }
        if (i == 3) {
            bxg0 bxg0Var2 = (bxg0) message.obj;
            MessageLite messageLite3 = (MessageLite) bxg0Var2.b;
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_SOCKET);
            aVar4.a("--> UNSUBSCRIBE, data: %s", messageLite3);
            if (write((Socket) bxg0Var2.a, messageLite3, (short) 2)) {
                Handler handler3 = this.mMainThreadHandler;
                handler3.sendMessage(handler3.obtainMessage(5, bxg0Var2.c));
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            try {
                ((Socket) message.obj).close();
                return;
            } catch (IOException unused) {
                return;
            }
        }
        Pair pair3 = (Pair) message.obj;
        MessageLite messageLite4 = (MessageLite) pair3.second;
        itf0.a aVar5 = itf0.a;
        aVar5.q(MyLog.TAG_SOCKET);
        aVar5.a("--> HEARTBEAT, data: %s", messageLite4);
        if (write((Socket) pair3.first, messageLite4, (short) 0)) {
            removeMessages(4);
            sendMessageDelayed(Message.obtain(message), 5000L);
        }
    }

    public void setMainThreadHandler(Handler handler) {
        this.mMainThreadHandler = handler;
    }
}
