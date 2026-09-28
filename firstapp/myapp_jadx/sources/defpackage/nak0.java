package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nak0 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final c430 e;
    public final ijf0 f;
    public final boolean g;
    public final iej h;
    public final boolean i;
    public final uxs j;
    public final sx40 k;
    public final awz l;
    public final boolean m;

    public /* synthetic */ nak0(int i, String str, String str2, iej iejVar, int i2) {
        this((i2 & 1) != 0 ? R.drawable.flag_za : i, (i2 & 2) != 0 ? "South Africa" : str, (i2 & 4) != 0 ? "+27" : str2, 3, new c430.b(0, p780.f), new ijf0((String) null, 0L, 7), true, (i2 & 128) != 0 ? iej.a.a : iejVar, (i2 & 256) == 0, uxs.DISABLE, sx40.b.a, new awz(15, null));
    }

    public static nak0 a(nak0 nak0Var, ijf0 ijf0Var, boolean z, boolean z2, uxs uxsVar, sx40 sx40Var, awz awzVar, int i) {
        int i2 = nak0Var.a;
        String str = nak0Var.b;
        String str2 = nak0Var.c;
        int i3 = nak0Var.d;
        c430 c430Var = nak0Var.e;
        if ((i & 32) != 0) {
            ijf0Var = nak0Var.f;
        }
        ijf0 ijf0Var2 = ijf0Var;
        boolean z3 = (i & 64) != 0 ? nak0Var.g : z;
        iej iejVar = nak0Var.h;
        boolean z4 = (i & 256) != 0 ? nak0Var.i : z2;
        uxs uxsVar2 = (i & 512) != 0 ? nak0Var.j : uxsVar;
        sx40 sx40Var2 = (i & 1024) != 0 ? nak0Var.k : sx40Var;
        awz awzVar2 = (i & 2048) != 0 ? nak0Var.l : awzVar;
        nak0Var.getClass();
        str.getClass();
        str2.getClass();
        c430Var.getClass();
        ijf0Var2.getClass();
        iejVar.getClass();
        uxsVar2.getClass();
        sx40Var2.getClass();
        awzVar2.getClass();
        return new nak0(i2, str, str2, i3, c430Var, ijf0Var2, z3, iejVar, z4, uxsVar2, sx40Var2, awzVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nak0)) {
            return false;
        }
        nak0 nak0Var = (nak0) obj;
        return this.a == nak0Var.a && Intrinsics.g(this.b, nak0Var.b) && Intrinsics.g(this.c, nak0Var.c) && this.d == nak0Var.d && Intrinsics.g(this.e, nak0Var.e) && Intrinsics.g(this.f, nak0Var.f) && this.g == nak0Var.g && Intrinsics.g(this.h, nak0Var.h) && this.i == nak0Var.i && this.j == nak0Var.j && Intrinsics.g(this.k, nak0Var.k) && Intrinsics.g(this.l, nak0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + y45.a(this.j, mtg0.a((this.h.hashCode() + mtg0.a(ey1.b(this.f, (this.e.hashCode() + gpp.a(this.d, gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31)) * 31, 31), 31, this.g)) * 31, 31, this.i), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "ZARegisterState(countryFlag=", ", countryName=", this.b, ", callingCode=");
        wxa.b(this.d, this.c, ", stepsCount=", ", progressPositionState=", sbA);
        sbA.append(this.e);
        sbA.append(", phoneTextField=");
        sbA.append(this.f);
        sbA.append(", isPhoneValid=");
        sbA.append(this.g);
        sbA.append(", gpInfo=");
        sbA.append(this.h);
        sbA.append(", conditionChecked=");
        sbA.append(this.i);
        sbA.append(", submitButtonStatus=");
        sbA.append(this.j);
        sbA.append(", submitData=");
        sbA.append(this.k);
        sbA.append(", passwordState=");
        sbA.append(this.l);
        sbA.append(")");
        return sbA.toString();
    }

    public nak0(int i, String str, String str2, int i2, c430 c430Var, ijf0 ijf0Var, boolean z, iej iejVar, boolean z2, uxs uxsVar, sx40 sx40Var, awz awzVar) {
        str.getClass();
        str2.getClass();
        iejVar.getClass();
        sx40Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = c430Var;
        this.f = ijf0Var;
        this.g = z;
        this.h = iejVar;
        this.i = z2;
        this.j = uxsVar;
        this.k = sx40Var;
        this.l = awzVar;
        this.m = uxsVar != uxs.LOADING;
    }

    public nak0() {
        this(0, null, null, null, 4095);
    }
}
