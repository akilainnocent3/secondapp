package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes8.dex */
public final class gja0 extends y01 {
    public final Socket n;

    public gja0(Socket socket) {
        this.n = socket;
    }

    @Override // defpackage.y01
    public final IOException a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.y01
    public final void b() {
        Socket socket = this.n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!cdk0.a(e)) {
                throw e;
            }
            cdk0.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            cdk0.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
