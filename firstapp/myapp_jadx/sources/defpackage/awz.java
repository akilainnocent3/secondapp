package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class awz {
    public final ijf0 a;
    public final uf00<xvz> b;
    public final wh80 c;
    public final uf00<Integer> d;
    public final boolean e;
    public final boolean f;
    public final uxs g;
    public final c430 h;

    public awz(ijf0 ijf0Var, uf00<xvz> uf00Var, wh80 wh80Var, uf00<Integer> uf00Var2) {
        c430 bVar;
        uf00Var.getClass();
        wh80Var.getClass();
        uf00Var2.getClass();
        this.a = ijf0Var;
        this.b = uf00Var;
        this.c = wh80Var;
        this.d = uf00Var2;
        boolean z = true;
        this.e = !(wh80Var instanceof wh80.c);
        if ((wh80Var instanceof wh80.a) || ijf0Var.a.b.length() <= 0) {
            z = false;
            break;
        } else if (!uf00Var.isEmpty()) {
            Iterator<xvz> it = uf00Var.iterator();
            while (it.hasNext()) {
                if (!it.next().b) {
                    z = false;
                    break;
                }
            }
        }
        this.f = z;
        this.g = this.c instanceof wh80.c ? uxs.LOADING : z ? uxs.ENABLE : uxs.DISABLE;
        if (this.a.a.b.length() == 0) {
            bVar = c430.a.a;
        } else {
            bVar = new c430.b(0, z ? p780.i : p780.f);
        }
        this.h = bVar;
    }

    public static awz a(awz awzVar, ijf0 ijf0Var, uf00 uf00Var, wh80 wh80Var, uf00 uf00Var2, int i) {
        if ((i & 1) != 0) {
            ijf0Var = awzVar.a;
        }
        if ((i & 2) != 0) {
            uf00Var = awzVar.b;
        }
        if ((i & 4) != 0) {
            wh80Var = awzVar.c;
        }
        if ((i & 8) != 0) {
            uf00Var2 = awzVar.d;
        }
        awzVar.getClass();
        ijf0Var.getClass();
        uf00Var.getClass();
        wh80Var.getClass();
        uf00Var2.getClass();
        return new awz(ijf0Var, uf00Var, wh80Var, uf00Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awz)) {
            return false;
        }
        awz awzVar = (awz) obj;
        return Intrinsics.g(this.a, awzVar.a) && Intrinsics.g(this.b, awzVar.b) && Intrinsics.g(this.c, awzVar.c) && Intrinsics.g(this.d, awzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + yvz.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "PasswordState(password=" + this.a + ", ruleList=" + this.b + ", setPasswordData=" + this.c + ", progressTextList=" + this.d + ")";
    }

    public awz() {
        this(15, null);
    }

    public awz(int i, uf00 uf00Var) {
        ijf0 ijf0Var = new ijf0((String) null, 0L, 7);
        n1a0 n1a0Var = n1a0.c;
        this(ijf0Var, n1a0Var, wh80.b.a, (i & 8) != 0 ? n1a0Var : uf00Var);
    }
}
