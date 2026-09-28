package defpackage;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes5.dex */
public final class oit {
    public static final mit a(Throwable th) {
        String str;
        th.getClass();
        Throwable th2 = (Throwable) ld80.h(fd80.c(th, new nit()));
        String simpleName = th2.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            simpleName = th2.getClass().getName();
        }
        if (th2 instanceof UnknownHostException) {
            str = "dns_resolution_failed";
        } else if (th2 instanceof SocketTimeoutException) {
            str = "timeout";
        } else if (th2 instanceof ConnectException) {
            str = "connection_failed";
        } else if (th2 instanceof SSLException) {
            str = "ssl_error";
        } else if (th2 instanceof SocketException) {
            str = "socket_error";
        } else {
            str = th2 instanceof InterruptedIOException ? "interrupted_io" : "unexpected_exception";
        }
        return new mit(simpleName, str);
    }
}
