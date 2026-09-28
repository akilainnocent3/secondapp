package defpackage;

import java.math.BigDecimal;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lel8;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class el8 extends j8i0 {
    public final ssw A;
    public final ssw<Boolean> B;
    public final ssw C;
    public final ssw<Boolean> D;
    public final ssw E;
    public final ssw<vhg<unj0>> F;
    public final ssw G;
    public final ku90<pdd0> H;
    public final ku90<pdd0> I;
    public final ha00 a;
    public BigDecimal b;
    public String c;
    public String d;
    public int e;
    public String f;
    public final ssw<String> i;
    public final ssw v;
    public final ssw<String> w;
    public final ssw y;
    public final ssw<String> z;

    public el8(ha00 ha00Var) {
        this.a = ha00Var;
        ssw<String> sswVar = new ssw<>();
        this.i = sswVar;
        this.v = sswVar;
        ssw<String> sswVar2 = new ssw<>();
        this.w = sswVar2;
        this.y = sswVar2;
        ssw<String> sswVar3 = new ssw<>();
        this.z = sswVar3;
        this.A = sswVar3;
        ssw<Boolean> sswVar4 = new ssw<>();
        this.B = sswVar4;
        this.C = sswVar4;
        ssw<Boolean> sswVar5 = new ssw<>();
        this.D = sswVar5;
        this.E = sswVar5;
        ssw<vhg<unj0>> sswVar6 = new ssw<>();
        this.F = sswVar6;
        this.G = sswVar6;
        ku90<pdd0> ku90Var = new ku90<>();
        this.H = ku90Var;
        this.I = ku90Var;
    }

    public final tnj0 x1(boolean z) {
        String str = this.d;
        if (str == null) {
            Intrinsics.n("phone");
            throw null;
        }
        BigDecimal bigDecimal = this.b;
        if (bigDecimal == null) {
            Intrinsics.n("amount");
            throw null;
        }
        return new tnj0(str, bigDecimal, this.e, z ? 1 : 0, this.f);
    }

    public final void y1(tnj0 tnj0Var) {
        this.D.m(Boolean.FALSE);
        this.B.m(Boolean.TRUE);
        et7 et7VarD = o8i0.d(this);
        bl8 bl8Var = new bl8(this, tnj0Var);
        ha00 ha00Var = this.a;
        ha00Var.getClass();
        jvd0 jvd0Var = ha00Var.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        ha00Var.c = kzh.d(new g1i(new yzh(new xzh(new qa00(ha00Var.a.d(new eal().j(tnj0Var))), new ra00(2, null)), new sa00(3, null)), new ta00(bl8Var, null)), et7VarD);
    }
}
