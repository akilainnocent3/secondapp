package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tvz {
    public final ijf0 a;
    public final ijf0 b;
    public final uf00<xvz> c;
    public final boolean d;
    public final xce0 e;
    public final String f;
    public final wuz g;
    public final boolean h;

    public tvz(ijf0 ijf0Var, uf00 uf00Var, int i) {
        this((i & 1) != 0 ? new ijf0((String) null, 0L, 7) : ijf0Var, new ijf0((String) null, 0L, 7), (i & 4) != 0 ? n1a0.c : uf00Var, false, xce0.b.a, "", null, false);
    }

    public static tvz a(tvz tvzVar, ijf0 ijf0Var, ijf0 ijf0Var2, uf00 uf00Var, boolean z, xce0 xce0Var, String str, wuz.a aVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            ijf0Var = tvzVar.a;
        }
        ijf0 ijf0Var3 = ijf0Var;
        if ((i & 2) != 0) {
            ijf0Var2 = tvzVar.b;
        }
        ijf0 ijf0Var4 = ijf0Var2;
        if ((i & 4) != 0) {
            uf00Var = tvzVar.c;
        }
        uf00 uf00Var2 = uf00Var;
        if ((i & 8) != 0) {
            z = tvzVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            xce0Var = tvzVar.e;
        }
        xce0 xce0Var2 = xce0Var;
        if ((i & 32) != 0) {
            str = tvzVar.f;
        }
        String str2 = str;
        wuz wuzVar = (i & 64) != 0 ? tvzVar.g : aVar;
        boolean z4 = (i & 128) != 0 ? tvzVar.h : z2;
        tvzVar.getClass();
        ijf0Var3.getClass();
        ijf0Var4.getClass();
        uf00Var2.getClass();
        xce0Var2.getClass();
        str2.getClass();
        return new tvz(ijf0Var3, ijf0Var4, uf00Var2, z3, xce0Var2, str2, wuzVar, z4);
    }

    public final boolean b() {
        return Intrinsics.g(this.a.a.b, this.b.a.b);
    }

    public final boolean c() {
        uf00<xvz> uf00Var = this.c;
        if (uf00Var.isEmpty()) {
            return false;
        }
        if (!uf00Var.isEmpty()) {
            Iterator<xvz> it = uf00Var.iterator();
            while (it.hasNext()) {
                if (!it.next().b) {
                    return false;
                }
            }
        }
        return this.b.a.b.length() > 0 && b() && !Intrinsics.g(this.e, xce0.c.a) && !this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvz)) {
            return false;
        }
        tvz tvzVar = (tvz) obj;
        return Intrinsics.g(this.a, tvzVar.a) && Intrinsics.g(this.b, tvzVar.b) && Intrinsics.g(this.c, tvzVar.c) && this.d == tvzVar.d && Intrinsics.g(this.e, tvzVar.e) && Intrinsics.g(this.f, tvzVar.f) && Intrinsics.g(this.g, tvzVar.g) && this.h == tvzVar.h;
    }

    public final int hashCode() {
        int iA = gmf0.a((this.e.hashCode() + mtg0.a(yvz.a(this.c, ey1.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31, 31, this.f);
        wuz wuzVar = this.g;
        return Boolean.hashCode(this.h) + ((iA + (wuzVar == null ? 0 : wuzVar.hashCode())) * 31);
    }

    public final String toString() {
        return "PasswordEntryScreenState(password=" + this.a + ", confirmPassword=" + this.b + ", ruleList=" + this.c + ", confirmError=" + this.d + ", submitStatus=" + this.e + ", apiError=" + this.f + ", dialog=" + this.g + ", showSuccessSnackbar=" + this.h + ")";
    }

    public tvz(ijf0 ijf0Var, ijf0 ijf0Var2, uf00<xvz> uf00Var, boolean z, xce0 xce0Var, String str, wuz wuzVar, boolean z2) {
        ijf0Var.getClass();
        uf00Var.getClass();
        xce0Var.getClass();
        this.a = ijf0Var;
        this.b = ijf0Var2;
        this.c = uf00Var;
        this.d = z;
        this.e = xce0Var;
        this.f = str;
        this.g = wuzVar;
        this.h = z2;
    }

    public tvz() {
        this(null, null, 255);
    }
}
