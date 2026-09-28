package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nzf {
    public final ijf0 a;
    public final ijf0 b;
    public final UiText c;
    public final uxs d;
    public final boolean e;
    public final boolean f;

    public nzf(ijf0 ijf0Var, ijf0 ijf0Var2, UiText uiText, uxs uxsVar, boolean z) {
        uiText.getClass();
        this.a = ijf0Var;
        this.b = ijf0Var2;
        this.c = uiText;
        this.d = uxsVar;
        this.e = z;
        this.f = !uiText.equals(vch0.a);
    }

    public static nzf a(nzf nzfVar, ijf0 ijf0Var, ijf0 ijf0Var2, UiText uiText, uxs uxsVar, boolean z, int i) {
        if ((i & 1) != 0) {
            ijf0Var = nzfVar.a;
        }
        ijf0 ijf0Var3 = ijf0Var;
        if ((i & 2) != 0) {
            ijf0Var2 = nzfVar.b;
        }
        ijf0 ijf0Var4 = ijf0Var2;
        if ((i & 4) != 0) {
            uiText = nzfVar.c;
        }
        UiText uiText2 = uiText;
        if ((i & 8) != 0) {
            uxsVar = nzfVar.d;
        }
        uxs uxsVar2 = uxsVar;
        if ((i & 16) != 0) {
            z = nzfVar.e;
        }
        nzfVar.getClass();
        ijf0Var3.getClass();
        ijf0Var4.getClass();
        uiText2.getClass();
        uxsVar2.getClass();
        return new nzf(ijf0Var3, ijf0Var4, uiText2, uxsVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzf)) {
            return false;
        }
        nzf nzfVar = (nzf) obj;
        return Intrinsics.g(this.a, nzfVar.a) && Intrinsics.g(this.b, nzfVar.b) && Intrinsics.g(this.c, nzfVar.c) && this.d == nzfVar.d && this.e == nzfVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + y45.a(this.d, yvf.a(ey1.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmailChangeVerifyIdentifyState(currentPassword=");
        sb.append(this.a);
        sb.append(", previousPassword=");
        sb.append(this.b);
        sb.append(", errorMessage=");
        sb.append(this.c);
        sb.append(", buttonStatus=");
        sb.append(this.d);
        sb.append(", isPasswordVisible=");
        return mq0.a(sb, this.e, ")");
    }

    public nzf() {
        this(0);
    }

    public nzf(int i) {
        this(new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), vch0.a, uxs.DISABLE, false);
    }
}
