package w5;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public final class w0 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.c1 f142483b;

    public w0(u4.c1 c1Var, @Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
        this.f142483b = c1Var;
    }

    public boolean a(@Nullable w0 w0Var) {
        if (this == w0Var) {
            return true;
        }
        if (w0Var != null) {
            Throwable cause = getCause();
            Throwable cause2 = w0Var.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (Objects.equals(this.f142483b, w0Var.f142483b) && Objects.equals(getMessage(), w0Var.getMessage())) {
                return true;
            }
        }
        return false;
    }
}
