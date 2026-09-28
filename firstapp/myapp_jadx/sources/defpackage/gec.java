package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public final class gec implements sws {
    public final /* synthetic */ udd a = new udd();

    @Override // defpackage.sws
    public final long a(sws.c cVar) {
        IOException iOException = cVar.a;
        iOException.getClass();
        if (!(iOException instanceof qom)) {
            return ((iOException instanceof SocketTimeoutException) || (iOException instanceof UnknownHostException) || (iOException instanceof ConnectException)) ? 5000L : -9223372036854775807L;
        }
        int i = ((qom) iOException).c;
        return (500 > i || i >= 600) ? -9223372036854775807L : 5000L;
    }

    @Override // defpackage.sws
    public final int b(int i) {
        return 5;
    }

    @Override // defpackage.sws
    public final sws.b c(sws.a aVar, sws.c cVar) {
        return this.a.c(aVar, cVar);
    }
}
