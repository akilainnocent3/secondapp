package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class it90 implements tk3 {
    public final mt5 a;
    public final uy0 b;
    public final jrm c;
    public final lrm d;
    public final y8k e;
    public final p8k f;
    public final up3 g;
    public str<vp3> h;

    public it90(uyx uyxVar, mt5 mt5Var, uy0 uy0Var, jrm jrmVar, lrm lrmVar, y8k y8kVar, p8k p8kVar, ynh ynhVar, up3 up3Var) {
        uy0Var.getClass();
        jrmVar.getClass();
        lrmVar.getClass();
        up3Var.getClass();
        this.a = mt5Var;
        this.b = uy0Var;
        this.c = jrmVar;
        this.d = lrmVar;
        this.e = y8kVar;
        this.f = p8kVar;
        this.g = up3Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    @Override // defpackage.tk3
    public final cvd0 a() {
        BigDecimal bigDecimal;
        Object bVar;
        BigDecimal bigDecimalC = c();
        jrm jrmVar = this.c;
        BigDecimal bigDecimal2 = jrmVar.m0() ? new BigDecimal(SimShareData.INSTANCE.getAutoBetTimes()) : BigDecimal.ONE;
        bigDecimal2.getClass();
        BigDecimal bigDecimalMultiply = bigDecimalC.multiply(bigDecimal2);
        bigDecimalMultiply.getClass();
        str<vp3> strVar = this.h;
        if (strVar == null) {
            Intrinsics.n("giftUseCases");
            throw null;
        }
        vp3 vp3Var = strVar.get();
        vp3Var.getClass();
        if (vp3Var.h(1, null)) {
            str<vp3> strVar2 = this.h;
            if (strVar2 == null) {
                Intrinsics.n("giftUseCases");
                throw null;
            }
            if (strVar2.get().j(1, 1)) {
                try {
                    zi50.a aVar = zi50.b;
                    bVar = new BigDecimal(this.g.c);
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
        BigDecimal bigDecimalB = assetsInfoC != null ? ty0.b(assetsInfoC) : null;
        return (bigDecimalB == null || bigDecimalAdd.compareTo(bigDecimalB) <= 0 || jrmVar.D()) ? cvd0.e.a : new cvd0.c(bigDecimalAdd, bigDecimalB);
    }

    public final ArrayList b() {
        String strA;
        List<Selection> listA0 = CollectionsKt.A0(this.c.U());
        Map mapL = kpu.l(this.d.B());
        ArrayList arrayList = new ArrayList();
        for (Selection selection : listA0) {
            xyx xyxVarA = null;
            if (qz3.b(selection) && (strA = ynh.a(selection, mapL)) != null) {
                xyxVarA = uyx.a(strA);
            }
            if (xyxVarA != null) {
                arrayList.add(xyxVarA);
            }
        }
        return arrayList;
    }

    public final BigDecimal c() {
        Object obj;
        ArrayList arrayListB = b();
        ArrayList arrayList = new ArrayList(l48.r(arrayListB, 10));
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListB.get(i);
            i++;
            arrayList.add(((xyx) obj2).c);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = ((BigDecimal) next).add((BigDecimal) it.next());
                next.getClass();
            }
            obj = next;
        } else {
            obj = null;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        bigDecimal2.getClass();
        return bigDecimal2;
    }

    public final boolean d() {
        BigDecimal bigDecimalC = c();
        if (bigDecimalC.compareTo(this.e.a()) >= 0 && bigDecimalC.compareTo(this.f.a()) <= 0) {
            ArrayList arrayListB = b();
            if (arrayListB.isEmpty()) {
                return true;
            }
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                cvd0 cvd0VarE = e((xyx) obj);
                if (Intrinsics.g(cvd0VarE, cvd0.a.a) || Intrinsics.g(cvd0VarE, cvd0.e.a)) {
                }
            }
            return true;
        }
        return false;
    }

    public final cvd0 e(xyx xyxVar) {
        if (xyxVar != null) {
            BigDecimal bigDecimal = xyxVar.c;
            if (!xyxVar.equals(xyx.d)) {
                y8k y8kVar = this.e;
                if (bigDecimal.compareTo(y8kVar.a()) < 0) {
                    return new cvd0.d(y8kVar.a());
                }
                p8k p8kVar = this.f;
                return bigDecimal.compareTo(p8kVar.a()) > 0 ? new cvd0.b(p8kVar.a()) : a();
            }
        }
        return cvd0.a.a;
    }

    public final cvd0 f() {
        BigDecimal bigDecimalC = c();
        y8k y8kVar = this.e;
        if (bigDecimalC.compareTo(y8kVar.a()) < 0) {
            return new cvd0.d(y8kVar.a());
        }
        p8k p8kVar = this.f;
        return bigDecimalC.compareTo(p8kVar.a()) > 0 ? new cvd0.b(p8kVar.a()) : a();
    }
}
