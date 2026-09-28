package okhttp3.internal.connection;

import defpackage.bc5;
import defpackage.cc5;
import defpackage.dgd;
import defpackage.fja0;
import defpackage.x740;
import defpackage.y740;
import defpackage.z7b;
import java.net.Socket;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/net/Socket;", "Lokhttp3/internal/connection/BufferedSocket;", "asBufferedSocket", "(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;", "Lfja0;", "(Lfja0;)Lokhttp3/internal/connection/BufferedSocket;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BufferedSocketKt {
    public static final BufferedSocket asBufferedSocket(Socket socket) {
        socket.getClass();
        return asBufferedSocket(new dgd(socket));
    }

    public static final BufferedSocket asBufferedSocket(fja0 fja0Var) {
        fja0Var.getClass();
        return new BufferedSocket(fja0Var) { // from class: okhttp3.internal.connection.BufferedSocketKt.asBufferedSocket.1
            public final fja0 a;
            public final y740 b;
            public final x740 c;

            {
                this.a = fja0Var;
                this.b = z7b.b(fja0Var.getSource());
                this.c = z7b.a(fja0Var.getSink());
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.fja0
            public void cancel() {
                this.a.cancel();
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.fja0
            public bc5 getSink() {
                return this.c;
            }

            @Override // okhttp3.internal.connection.BufferedSocket, defpackage.fja0
            public cc5 getSource() {
                return this.b;
            }
        };
    }
}
