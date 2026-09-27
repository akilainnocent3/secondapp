package ah;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class a0 extends IOException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f5034c = 2008;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5035b;

    public a0(int i10) {
        this.f5035b = i10;
    }

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof a0) && ((a0) cause).f5035b == 2008) {
                return true;
            }
        }
        return false;
    }

    public a0(@Nullable Throwable th2, int i10) {
        super(th2);
        this.f5035b = i10;
    }

    public a0(@Nullable String str, int i10) {
        super(str);
        this.f5035b = i10;
    }

    public a0(@Nullable String str, @Nullable Throwable th2, int i10) {
        super(str, th2);
        this.f5035b = i10;
    }
}
