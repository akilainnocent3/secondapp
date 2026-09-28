package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportybet.android.home.domain.DetectAppHookingUseCase$detectFridaServer$2", f = "DetectAppHookingUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yae extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yae(2, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((yae) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("127.0.0.1", 27402), 500);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = "GET /ws HTTP/1.1\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: CpxD2C5REVLHvsUC9YAoqg==\r\nSec-WebSocket-Version: 13\r\nHost: 127.0.0.1:27402\r\nUser-Agent: Frida/16.1.7\r\n\r\n".getBytes(Charsets.UTF_8);
            bytes.getClass();
            outputStream.write(bytes);
            inputStream.read(new byte[1024]);
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
