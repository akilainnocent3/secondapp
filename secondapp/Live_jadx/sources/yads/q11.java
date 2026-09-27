package yads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class q11 extends q30 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f154225d;

    public q11() {
        super(a(2008, 1));
        this.f154225d = 1;
    }

    public static int a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static q11 a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !ki.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new p11(iOException) : new q11(iOException, i11, i10);
    }

    public q11(IOException iOException, int i10, int i11) {
        super(iOException, a(i10, i11));
        this.f154225d = i11;
    }

    public q11(String str, int i10) {
        super(a(i10, 1), str);
        this.f154225d = 1;
    }

    public q11(String str, IOException iOException, int i10) {
        super(str, iOException, a(i10, 1));
        this.f154225d = 1;
    }
}
