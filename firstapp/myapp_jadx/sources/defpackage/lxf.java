package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lxf {
    public final ijf0 a;
    public final ijf0 b;
    public final ijf0 c;
    public final UiText d;
    public final uxs e;
    public final vwf f;
    public final boolean g;
    public final boolean h;

    public lxf(ijf0 ijf0Var, ijf0 ijf0Var2, ijf0 ijf0Var3, UiText uiText, uxs uxsVar, vwf vwfVar) {
        uiText.getClass();
        this.a = ijf0Var;
        this.b = ijf0Var2;
        this.c = ijf0Var3;
        this.d = uiText;
        this.e = uxsVar;
        this.f = vwfVar;
        this.g = !Intrinsics.g(ijf0Var2.a.b, ijf0Var3.a.b);
        this.h = !uiText.equals(vch0.a);
    }

    public static lxf a(lxf lxfVar, ijf0 ijf0Var, ijf0 ijf0Var2, ijf0 ijf0Var3, UiText uiText, uxs uxsVar, vwf vwfVar, int i) {
        if ((i & 1) != 0) {
            ijf0Var = lxfVar.a;
        }
        ijf0 ijf0Var4 = ijf0Var;
        if ((i & 2) != 0) {
            ijf0Var2 = lxfVar.b;
        }
        ijf0 ijf0Var5 = ijf0Var2;
        if ((i & 4) != 0) {
            ijf0Var3 = lxfVar.c;
        }
        ijf0 ijf0Var6 = ijf0Var3;
        if ((i & 8) != 0) {
            uiText = lxfVar.d;
        }
        UiText uiText2 = uiText;
        if ((i & 16) != 0) {
            uxsVar = lxfVar.e;
        }
        uxs uxsVar2 = uxsVar;
        if ((i & 32) != 0) {
            vwfVar = lxfVar.f;
        }
        lxfVar.getClass();
        ijf0Var4.getClass();
        ijf0Var5.getClass();
        ijf0Var6.getClass();
        uiText2.getClass();
        uxsVar2.getClass();
        return new lxf(ijf0Var4, ijf0Var5, ijf0Var6, uiText2, uxsVar2, vwfVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxf)) {
            return false;
        }
        lxf lxfVar = (lxf) obj;
        return Intrinsics.g(this.a, lxfVar.a) && Intrinsics.g(this.b, lxfVar.b) && Intrinsics.g(this.c, lxfVar.c) && Intrinsics.g(this.d, lxfVar.d) && this.e == lxfVar.e && Intrinsics.g(this.f, lxfVar.f);
    }

    public final int hashCode() {
        int iA = y45.a(this.e, yvf.a(ey1.b(this.c, ey1.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
        vwf vwfVar = this.f;
        return iA + (vwfVar == null ? 0 : vwfVar.hashCode());
    }

    public final String toString() {
        return "EmailChangeNewEmailState(currentEmail=" + this.a + ", newEmail=" + this.b + ", confirmNewEmail=" + this.c + ", textFieldError=" + this.d + ", buttonStatus=" + this.e + ", dialogType=" + this.f + ")";
    }

    public lxf() {
        this(0);
    }

    public lxf(int i) {
        this(new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), vch0.a, uxs.DISABLE, null);
    }
}
