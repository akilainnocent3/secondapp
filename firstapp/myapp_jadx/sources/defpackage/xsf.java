package defpackage;

import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.edit.viewmodel.EditSportsLimitsViewModel$publishFormChanges$1", f = "EditSportsLimitsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xsf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zsf a;
    public final /* synthetic */ muh0 b;
    public final /* synthetic */ muh0 c;
    public final /* synthetic */ muh0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsf(zsf zsfVar, muh0 muh0Var, muh0 muh0Var2, muh0 muh0Var3, v1b<? super xsf> v1bVar) {
        super(2, v1bVar);
        this.a = zsfVar;
        this.b = muh0Var;
        this.c = muh0Var2;
        this.d = muh0Var3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xsf(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xsf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uf00 uf00VarA;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zsf zsfVar = this.a;
        tsf tsfVar = zsfVar.e;
        scs scsVar = zsfVar.C;
        if (scsVar == null) {
            Intrinsics.n("limitType");
            throw null;
        }
        ijf0 ijf0Var = zsfVar.L;
        ijf0 ijf0Var2 = zsfVar.M;
        ijf0 ijf0Var3 = zsfVar.N;
        BigDecimal bigDecimal = zsfVar.F;
        BigDecimal bigDecimal2 = zsfVar.G;
        tsfVar.getClass();
        Integer numValueOf = Integer.valueOf(R.string.page_limits__min_vnum);
        ijf0Var.getClass();
        ijf0Var2.getClass();
        ijf0Var3.getClass();
        String strD = a8b.d();
        muh0 muh0Var = this.b;
        boolean z = muh0Var instanceof muh0.a;
        muh0.a aVar = z ? (muh0.a) muh0Var : null;
        Integer numValueOf2 = aVar != null ? Integer.valueOf(aVar.a) : null;
        Pair pair = new Pair(numValueOf, String.valueOf(bigDecimal));
        strD.getClass();
        pmn pmnVar = new pmn(R.string.page_limits__daily_limits, ijf0Var, z, numValueOf2, pair, strD);
        muh0 muh0Var2 = this.c;
        boolean z2 = muh0Var2 instanceof muh0.a;
        muh0.a aVar2 = z2 ? (muh0.a) muh0Var2 : null;
        pmn pmnVar2 = new pmn(R.string.page_limits__weekly_limits, ijf0Var2, z2, aVar2 != null ? Integer.valueOf(aVar2.a) : null, new Pair(numValueOf, String.valueOf(bigDecimal)), strD);
        muh0 muh0Var3 = this.d;
        boolean z3 = muh0Var3 instanceof muh0.a;
        muh0.a aVar3 = z3 ? (muh0.a) muh0Var3 : null;
        pmn pmnVar3 = new pmn(R.string.page_limits__monthly_limits, ijf0Var3, z3, aVar3 != null ? Integer.valueOf(aVar3.a) : null, new Pair(numValueOf, String.valueOf(bigDecimal)), strD);
        int iOrdinal = scsVar.ordinal();
        if (iOrdinal != 0) {
            uf00VarA = iOrdinal != 2 ? tsf.b() : tsf.b();
        } else {
            uf00VarA = tsf.a(strD, bigDecimal, bigDecimal2);
        }
        usf.c cVar = new usf.c(new wfb0(pmnVar, pmnVar2, pmnVar3, uf00VarA));
        zsfVar.E = cVar.a;
        wwd0 wwd0Var = zsfVar.a;
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
        wwd0 wwd0Var2 = zsfVar.H;
        uxs uxsVar = ((muh0Var instanceof muh0.b) && (muh0Var2 instanceof muh0.b) && (muh0Var3 instanceof muh0.b) && zsfVar.z1()) ? uxs.ENABLE : uxs.DISABLE;
        wwd0Var2.getClass();
        wwd0Var2.k(null, uxsVar);
        wwd0 wwd0Var3 = zsfVar.J;
        Boolean boolValueOf = Boolean.valueOf(zsfVar.z1());
        wwd0Var3.getClass();
        wwd0Var3.k(null, boolValueOf);
        return Unit.a;
    }
}
