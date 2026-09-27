package gx;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class r extends fx.j {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @oy.l
    public final Socket f87494u;

    public r(@oy.l Socket socket) {
        m0.p(socket, "socket");
        this.f87494u = socket;
    }

    @Override // fx.j
    @oy.l
    public IOException C(@oy.m IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // fx.j
    public void G() {
        try {
            this.f87494u.close();
        } catch (AssertionError e10) {
            if (!z.b(e10)) {
                throw e10;
            }
            z.f87542a.log(Level.WARNING, "Failed to close timed out socket " + this.f87494u, (Throwable) e10);
        } catch (Exception e11) {
            z.f87542a.log(Level.WARNING, "Failed to close timed out socket " + this.f87494u, (Throwable) e11);
        }
    }
}
