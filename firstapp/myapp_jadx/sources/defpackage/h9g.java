package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h9g {
    public final ijf0 a;
    public final ijf0 b;
    public final UiText c;
    public final uxs d;
    public final boolean e;
    public final d9g f;
    public final boolean g;

    public h9g(ijf0 ijf0Var, ijf0 ijf0Var2, UiText uiText, uxs uxsVar, boolean z, d9g d9gVar) {
        uiText.getClass();
        d9gVar.getClass();
        this.a = ijf0Var;
        this.b = ijf0Var2;
        this.c = uiText;
        this.d = uxsVar;
        this.e = z;
        this.f = d9gVar;
        this.g = !uiText.equals(vch0.a);
    }

    public static h9g a(h9g h9gVar, ijf0 ijf0Var, ijf0 ijf0Var2, UiText uiText, uxs uxsVar, boolean z, d9g.a aVar, int i) {
        if ((i & 1) != 0) {
            ijf0Var = h9gVar.a;
        }
        ijf0 ijf0Var3 = ijf0Var;
        if ((i & 2) != 0) {
            ijf0Var2 = h9gVar.b;
        }
        ijf0 ijf0Var4 = ijf0Var2;
        if ((i & 4) != 0) {
            uiText = h9gVar.c;
        }
        UiText uiText2 = uiText;
        if ((i & 8) != 0) {
            uxsVar = h9gVar.d;
        }
        uxs uxsVar2 = uxsVar;
        if ((i & 16) != 0) {
            z = h9gVar.e;
        }
        boolean z2 = z;
        d9g d9gVar = aVar;
        if ((i & 32) != 0) {
            d9gVar = h9gVar.f;
        }
        d9g d9gVar2 = d9gVar;
        h9gVar.getClass();
        ijf0Var3.getClass();
        ijf0Var4.getClass();
        uiText2.getClass();
        uxsVar2.getClass();
        d9gVar2.getClass();
        return new h9g(ijf0Var3, ijf0Var4, uiText2, uxsVar2, z2, d9gVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9g)) {
            return false;
        }
        h9g h9gVar = (h9g) obj;
        return Intrinsics.g(this.a, h9gVar.a) && Intrinsics.g(this.b, h9gVar.b) && Intrinsics.g(this.c, h9gVar.c) && this.d == h9gVar.d && this.e == h9gVar.e && Intrinsics.g(this.f, h9gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + mtg0.a(y45.a(this.d, yvf.a(ey1.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        return "EnterPasswordState(currentPassword=" + this.a + ", previousPassword=" + this.b + ", errorMessage=" + this.c + ", buttonStatus=" + this.d + ", isPasswordVisible=" + this.e + ", dialogState=" + this.f + ")";
    }

    public h9g() {
        this(0);
    }

    public h9g(int i) {
        this(new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), vch0.a, uxs.DISABLE, false, d9g.b.a);
    }
}
