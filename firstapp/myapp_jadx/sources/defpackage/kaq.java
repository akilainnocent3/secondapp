package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kaq {
    public final qcn<Integer> a;
    public final String b;
    public final String c;
    public final String d;
    public final UiText e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final qrd0 j;
    public final s2q k;
    public final tsd0 l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final t2q p;
    public final boolean q;

    public kaq(uf00 uf00Var, String str, String str2, String str3, ColoredUiText coloredUiText, String str4, String str5, String str6, String str7, qrd0 qrd0Var, s2q s2qVar, tsd0 tsd0Var, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? n1a0.c : uf00Var, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? vch0.a : coloredUiText, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? null : qrd0Var, (i & 1024) != 0 ? s2q.a.a : s2qVar, (i & 2048) != 0 ? new tsd0(0) : tsd0Var, (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? false : z2, false, t2q.c.a, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kaq)) {
            return false;
        }
        kaq kaqVar = (kaq) obj;
        return Intrinsics.g(this.a, kaqVar.a) && Intrinsics.g(this.b, kaqVar.b) && Intrinsics.g(this.c, kaqVar.c) && Intrinsics.g(this.d, kaqVar.d) && Intrinsics.g(this.e, kaqVar.e) && Intrinsics.g(this.f, kaqVar.f) && Intrinsics.g(this.g, kaqVar.g) && Intrinsics.g(this.h, kaqVar.h) && Intrinsics.g(this.i, kaqVar.i) && Intrinsics.g(this.j, kaqVar.j) && Intrinsics.g(this.k, kaqVar.k) && Intrinsics.g(this.l, kaqVar.l) && this.m == kaqVar.m && this.n == kaqVar.n && this.o == kaqVar.o && Intrinsics.g(this.p, kaqVar.p) && this.q == kaqVar.q;
    }

    public final int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(yvf.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        qrd0 qrd0Var = this.j;
        return Boolean.hashCode(this.q) + ((this.p.hashCode() + mtg0.a(mtg0.a(mtg0.a((this.l.hashCode() + ((this.k.hashCode() + ((iA + (qrd0Var == null ? 0 : qrd0Var.hashCode())) * 31)) * 31)) * 31, 31, this.m), 31, this.n), 31, this.o)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNFeatureMatchQuickBetState(balls=");
        sb.append(this.a);
        sb.append(", lotteryName=");
        sb.append(this.b);
        sb.append(", marketName=");
        hxa.c(sb, this.c, ", odds=", this.d, ", betAmount=");
        sb.append(this.e);
        sb.append(", totalStake=");
        sb.append(this.f);
        sb.append(", potentialWin=");
        hxa.c(sb, this.g, ", aboutToPay=", this.h, ", currency=");
        sb.append(this.i);
        sb.append(", betError=");
        sb.append(this.j);
        sb.append(", topWarningHint=");
        sb.append(this.k);
        sb.append(", keyboardState=");
        sb.append(this.l);
        sb.append(", isStakeKeyboardVisible=");
        nng.a(", placeBetButtonEnabled=", ", isBetSubmitting=", sb, this.m, this.n);
        sb.append(this.o);
        sb.append(", betDialog=");
        sb.append(this.p);
        sb.append(", showBetErrorDialog=");
        return mq0.a(sb, this.q, ")");
    }

    public kaq(qcn<Integer> qcnVar, String str, String str2, String str3, UiText uiText, String str4, String str5, String str6, String str7, qrd0 qrd0Var, s2q s2qVar, tsd0 tsd0Var, boolean z, boolean z2, boolean z3, t2q t2qVar, boolean z4) {
        qcnVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        uiText.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        s2qVar.getClass();
        tsd0Var.getClass();
        t2qVar.getClass();
        this.a = qcnVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = uiText;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = qrd0Var;
        this.k = s2qVar;
        this.l = tsd0Var;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = t2qVar;
        this.q = z4;
    }

    public kaq() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, false, 131071);
    }
}
