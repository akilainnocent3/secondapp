package defpackage;

import com.sporty.android.core.model.common.Range;
import com.sporty.android.core.model.pay.BountyAndTaxConfigs;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lpjp;", "Lr2e;", "Lu290;", "Lmip;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pjp extends r2e implements mip {
    public final /* synthetic */ mip f1;
    public final h530 g1;
    public final psm h1;
    public final u290 i1;
    public final bod j1;
    public final mlu k1;
    public final v340 l1;
    public final wwd0 m1;
    public final mpe0 n1;
    public final ku90<Unit> o1;
    public final ku90 p1;
    public final ArrayList q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pjp(f9e f9eVar, uyx uyxVar, eth0 eth0Var, rak rakVar, c4k c4kVar, lyd lydVar, pgk pgkVar, v2k v2kVar, d100 d100Var, wl wlVar, uy0 uy0Var, sr10 sr10Var, lyz lyzVar, h530 h530Var, psm psmVar, b700 b700Var, mgb0 mgb0Var, uqm uqmVar, q900 q900Var, i390 i390Var, u290 u290Var, mip mipVar, rdd0 rdd0Var, bod bodVar, mlu mluVar, auo auoVar, cbg cbgVar, vu60 vu60Var) {
        super(f9eVar, uyxVar, eth0Var, rakVar, c4kVar, lydVar, pgkVar, v2kVar, d100Var, wlVar, uy0Var, sr10Var, lyzVar, psmVar, b700Var, mgb0Var, uqmVar, q900Var, i390Var, u290Var, rdd0Var, bodVar, mluVar, auoVar, cbgVar, vu60Var);
        d100Var.getClass();
        wlVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        h530Var.getClass();
        psmVar.getClass();
        b700Var.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        i390Var.getClass();
        u290Var.getClass();
        mipVar.getClass();
        rdd0Var.getClass();
        bodVar.getClass();
        mluVar.getClass();
        auoVar.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.f1 = mipVar;
        this.g1 = h530Var;
        this.h1 = psmVar;
        this.i1 = u290Var;
        this.j1 = bodVar;
        this.k1 = mluVar;
        this.l1 = e1i.e(uzh.b(new ojp(this.E0)), o8i0.d(this), q490.a.a, 10);
        this.m1 = xwd0.a(BigDecimal.ZERO);
        this.n1 = hwr.b(new f0k(this, 1));
        ku90<Unit> ku90Var = new ku90<>();
        this.o1 = ku90Var;
        this.p1 = ku90Var;
        this.q1 = CollectionsKt.i0(mipVar.a1(), this.d1);
    }

    @Override // defpackage.r2e, defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.q1;
    }

    @Override // defpackage.r2e, defpackage.k72
    public final List<c9p> E1() {
        ngs ngsVarB = a.b();
        ngsVarB.addAll(super.E1());
        ngsVarB.addAll(this.f1.h());
        return a.a(ngsVarB);
    }

    @Override // defpackage.mip
    public final uwd0<BountyAndTaxConfigs> N() {
        return this.f1.N();
    }

    public final String Q1(BigDecimal bigDecimal, List<? extends Range> list, boolean z) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return "-";
        }
        BigDecimal bigDecimalB = p54.b(new BigDecimal(u(bigDecimal, list)));
        if (z) {
            return "- " + bigDecimalB;
        }
        String string = bigDecimalB.toString();
        string.getClass();
        return string;
    }

    @Override // defpackage.mip
    public final List<lyh<lk50<Object>>> a1() {
        return this.f1.a1();
    }

    @Override // defpackage.mip
    public final List<c9p> h() {
        return this.f1.h();
    }

    @Override // defpackage.mip
    public final long u(BigDecimal bigDecimal, List<? extends Range> list) {
        bigDecimal.getClass();
        list.getClass();
        return this.f1.u(bigDecimal, list);
    }

    @Override // defpackage.m02, defpackage.u290
    public final uwd0<String> x0() {
        return this.i1.x0();
    }
}
