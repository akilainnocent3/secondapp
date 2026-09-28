package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pmw implements tk3 {
    public final mt5 a;
    public final uy0 b;
    public final lrm c;
    public final jrm d;
    public final krm e;
    public final y8k f;
    public final p8k g;
    public final up3 h;
    public str<vp3> i;

    public pmw(uyx uyxVar, mt5 mt5Var, uy0 uy0Var, lrm lrmVar, jrm jrmVar, krm krmVar, y8k y8kVar, p8k p8kVar, up3 up3Var) {
        uy0Var.getClass();
        lrmVar.getClass();
        jrmVar.getClass();
        krmVar.getClass();
        up3Var.getClass();
        this.a = mt5Var;
        this.b = uy0Var;
        this.c = lrmVar;
        this.d = jrmVar;
        this.e = krmVar;
        this.f = y8kVar;
        this.g = p8kVar;
        this.h = up3Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    @Override // defpackage.tk3
    public final cvd0 a() {
        BigDecimal bigDecimal;
        Object bVar;
        BigDecimal bigDecimalB = b();
        jrm jrmVar = this.d;
        BigDecimal bigDecimal2 = jrmVar.m0() ? new BigDecimal(SimShareData.INSTANCE.getAutoBetTimes()) : BigDecimal.ONE;
        bigDecimal2.getClass();
        BigDecimal bigDecimalMultiply = bigDecimalB.multiply(bigDecimal2);
        bigDecimalMultiply.getClass();
        str<vp3> strVar = this.i;
        if (strVar == null) {
            Intrinsics.n("giftUseCases");
            throw null;
        }
        vp3 vp3Var = strVar.get();
        vp3Var.getClass();
        if (vp3Var.h(2, null)) {
            str<vp3> strVar2 = this.i;
            if (strVar2 == null) {
                Intrinsics.n("giftUseCases");
                throw null;
            }
            if (strVar2.get().j(2, 2)) {
                try {
                    zi50.a aVar = zi50.b;
                    bVar = new BigDecimal(this.h.c);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                bigDecimal = (BigDecimal) bVar;
                if (bigDecimal == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                bigDecimal.getClass();
            } else {
                bigDecimal = BigDecimal.ZERO;
                bigDecimal.getClass();
            }
        } else {
            bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
        }
        BigDecimal bigDecimalSubtract = bigDecimalMultiply.subtract(bigDecimal);
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalAdd = bigDecimalSubtract.add(this.a.a(bigDecimalSubtract));
        bigDecimalAdd.getClass();
        AssetsInfo assetsInfoC = this.b.c();
        BigDecimal bigDecimalB2 = assetsInfoC != null ? ty0.b(assetsInfoC) : null;
        return (bigDecimalB2 == null || bigDecimalAdd.compareTo(bigDecimalB2) <= 0 || jrmVar.D()) ? cvd0.e.a : new cvd0.c(bigDecimalAdd, bigDecimalB2);
    }

    public final BigDecimal b() {
        Object bVar;
        BigDecimal bigDecimal = uyx.a(this.c.d0().a).c;
        try {
            zi50.a aVar = zi50.b;
            krm krmVar = this.e;
            bVar = new BigDecimal(krmVar.P() ? krmVar.Q(krmVar.s().size()) : 1L);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_BET_SLIP);
            aVar3.p(thA, "Convert multipleChuanCount to number failed.", new Object[0]);
        }
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        if (bVar instanceof zi50.b) {
            bVar = bigDecimal2;
        }
        bVar.getClass();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply((BigDecimal) bVar);
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply;
    }

    public final cvd0 c() {
        BigDecimal bigDecimal = uyx.a(this.c.d0().a).c;
        y8k y8kVar = this.f;
        if (bigDecimal.compareTo(y8kVar.a()) < 0) {
            return new cvd0.d(y8kVar.a());
        }
        p8k p8kVar = this.g;
        return bigDecimal.compareTo(p8kVar.a()) > 0 ? new cvd0.b(p8kVar.a()) : a();
    }
}
