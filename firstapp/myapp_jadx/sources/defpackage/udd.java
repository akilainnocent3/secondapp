package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class udd implements sws {
    @Override // defpackage.sws
    public final long a(sws.c cVar) {
        Throwable cause = cVar.a;
        if ((cause instanceof ssz) || (cause instanceof FileNotFoundException) || (cause instanceof nom) || (cause instanceof nxs.g)) {
            return -9223372036854775807L;
        }
        while (cause != null) {
            if ((cause instanceof dqc) && ((dqc) cause).a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((cVar.b - 1) * 1000, 5000);
    }

    @Override // defpackage.sws
    public final int b(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // defpackage.sws
    public final sws.b c(sws.a aVar, sws.c cVar) {
        IOException iOException = cVar.a;
        if (!(iOException instanceof qom)) {
            return null;
        }
        int i = ((qom) iOException).c;
        if ((i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && aVar.a - aVar.b > 1) {
            return new sws.b(2, RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        }
        return null;
    }
}
