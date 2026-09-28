package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jdj {
    public final int a;
    public final String b;
    public final String c;
    public final uf00<Integer> d;
    public final c430 e;
    public final ijf0 f;
    public final iej g;
    public final uxs h;
    public final zs00 i;
    public final boolean j;

    public jdj(int i, String str, String str2, uf00 uf00Var, iej iejVar, int i2) {
        this((i2 & 1) != 0 ? R.drawable.flag_gh : i, (i2 & 2) != 0 ? "default" : str, (i2 & 4) != 0 ? "+886" : str2, (i2 & 8) != 0 ? n1a0.c : uf00Var, c430.a.a, new ijf0((String) null, 0L, 7), (i2 & 64) != 0 ? iej.a.a : iejVar, uxs.DISABLE, zs00.b.a);
    }

    public static jdj a(jdj jdjVar, ijf0 ijf0Var, iej.b bVar, uxs uxsVar, zs00 zs00Var, int i) {
        int i2 = jdjVar.a;
        String str = jdjVar.b;
        String str2 = jdjVar.c;
        uf00<Integer> uf00Var = jdjVar.d;
        c430 c430Var = jdjVar.e;
        if ((i & 32) != 0) {
            ijf0Var = jdjVar.f;
        }
        ijf0 ijf0Var2 = ijf0Var;
        iej iejVar = bVar;
        if ((i & 64) != 0) {
            iejVar = jdjVar.g;
        }
        iej iejVar2 = iejVar;
        if ((i & 128) != 0) {
            uxsVar = jdjVar.h;
        }
        uxs uxsVar2 = uxsVar;
        if ((i & 256) != 0) {
            zs00Var = jdjVar.i;
        }
        zs00 zs00Var2 = zs00Var;
        jdjVar.getClass();
        str.getClass();
        str2.getClass();
        uf00Var.getClass();
        c430Var.getClass();
        ijf0Var2.getClass();
        iejVar2.getClass();
        uxsVar2.getClass();
        zs00Var2.getClass();
        return new jdj(i2, str, str2, uf00Var, c430Var, ijf0Var2, iejVar2, uxsVar2, zs00Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdj)) {
            return false;
        }
        jdj jdjVar = (jdj) obj;
        return this.a == jdjVar.a && Intrinsics.g(this.b, jdjVar.b) && Intrinsics.g(this.c, jdjVar.c) && Intrinsics.g(this.d, jdjVar.d) && Intrinsics.g(this.e, jdjVar.e) && Intrinsics.g(this.f, jdjVar.f) && Intrinsics.g(this.g, jdjVar.g) && this.h == jdjVar.h && Intrinsics.g(this.i, jdjVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + y45.a(this.h, (this.g.hashCode() + ey1.b(this.f, (this.e.hashCode() + yvz.a(this.d, gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "GHRegisterState(countryFlag=", ", countryName=", this.b, ", callingCode=");
        sbA.append(this.c);
        sbA.append(", progressTextList=");
        sbA.append(this.d);
        sbA.append(", progressPositionState=");
        sbA.append(this.e);
        sbA.append(", phoneTextField=");
        sbA.append(this.f);
        sbA.append(", gpInfo=");
        sbA.append(this.g);
        sbA.append(", submitButtonStatus=");
        sbA.append(this.h);
        sbA.append(", submitData=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }

    public jdj(int i, String str, String str2, uf00<Integer> uf00Var, c430 c430Var, ijf0 ijf0Var, iej iejVar, uxs uxsVar, zs00 zs00Var) {
        str.getClass();
        str2.getClass();
        uf00Var.getClass();
        c430Var.getClass();
        iejVar.getClass();
        zs00Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = uf00Var;
        this.e = c430Var;
        this.f = ijf0Var;
        this.g = iejVar;
        this.h = uxsVar;
        this.i = zs00Var;
        this.j = uxsVar != uxs.LOADING;
    }

    public jdj() {
        this(0, null, null, null, null, 511);
    }
}
