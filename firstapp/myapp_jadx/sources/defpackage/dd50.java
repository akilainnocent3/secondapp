package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dd50 {
    public final ijf0 a;
    public final boolean b;
    public final uxs c;
    public final UiText d;
    public final sb50 e;

    public dd50(int i) {
        this(new ijf0((String) null, 0L, 7), false, uxs.DISABLE, vch0.a, sb50.b.a);
    }

    public static dd50 a(dd50 dd50Var, ijf0 ijf0Var, boolean z, uxs uxsVar, UiText uiText, sb50 sb50Var, int i) {
        if ((i & 1) != 0) {
            ijf0Var = dd50Var.a;
        }
        ijf0 ijf0Var2 = ijf0Var;
        if ((i & 2) != 0) {
            z = dd50Var.b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            uxsVar = dd50Var.c;
        }
        uxs uxsVar2 = uxsVar;
        if ((i & 8) != 0) {
            uiText = dd50Var.d;
        }
        UiText uiText2 = uiText;
        if ((i & 16) != 0) {
            sb50Var = dd50Var.e;
        }
        sb50 sb50Var2 = sb50Var;
        dd50Var.getClass();
        ijf0Var2.getClass();
        uxsVar2.getClass();
        uiText2.getClass();
        sb50Var2.getClass();
        return new dd50(ijf0Var2, z2, uxsVar2, uiText2, sb50Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd50)) {
            return false;
        }
        dd50 dd50Var = (dd50) obj;
        return Intrinsics.g(this.a, dd50Var.a) && this.b == dd50Var.b && this.c == dd50Var.c && Intrinsics.g(this.d, dd50Var.d) && Intrinsics.g(this.e, dd50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + yvf.a(y45.a(this.c, mtg0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        return "ResetPasswordState(password=" + this.a + ", isPasswordVisible=" + this.b + ", buttonStatus=" + this.c + ", textFieldError=" + this.d + ", dialogState=" + this.e + ")";
    }

    public dd50(ijf0 ijf0Var, boolean z, uxs uxsVar, UiText uiText, sb50 sb50Var) {
        uiText.getClass();
        sb50Var.getClass();
        this.a = ijf0Var;
        this.b = z;
        this.c = uxsVar;
        this.d = uiText;
        this.e = sb50Var;
    }

    public dd50() {
        this(0);
    }
}
