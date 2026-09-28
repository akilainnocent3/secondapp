package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class cqe0 implements tk3 {
    public final mt5 a;
    public final uy0 b;
    public final lrm c;
    public final krm d;
    public final y8k e;
    public final p8k f;
    public final up3 g;
    public str<vp3> h;

    public cqe0(uyx uyxVar, mt5 mt5Var, uy0 uy0Var, lrm lrmVar, krm krmVar, y8k y8kVar, p8k p8kVar, up3 up3Var) {
        uy0Var.getClass();
        lrmVar.getClass();
        krmVar.getClass();
        up3Var.getClass();
        this.a = mt5Var;
        this.b = uy0Var;
        this.c = lrmVar;
        this.d = krmVar;
        this.e = y8kVar;
        this.f = p8kVar;
        this.g = up3Var;
    }

    @Override // defpackage.tk3
    public final cvd0 a() {
        BigDecimal bigDecimalSubtract = d().subtract(c());
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalAdd = bigDecimalSubtract.add(this.a.a(bigDecimalSubtract));
        bigDecimalAdd.getClass();
        AssetsInfo assetsInfoC = this.b.c();
        BigDecimal bigDecimalB = assetsInfoC != null ? ty0.b(assetsInfoC) : null;
        return (bigDecimalB == null || bigDecimalAdd.compareTo(bigDecimalB) <= 0) ? cvd0.e.a : new cvd0.c(bigDecimalAdd, bigDecimalB);
    }

    public final void b(int i, String str, String str2) {
        krm krmVar = this.d;
        if (i != -1) {
            krmVar.z(i, str, str2);
            return;
        }
        for (ln7 ln7Var : this.c.U()) {
            System.out.println((Object) lx5.a("chuanName=", str, ", chuan.chuanName=", ln7Var.b));
            if (!TextUtils.isEmpty(str) && Intrinsics.g(str, ln7Var.b)) {
                krmVar.z(ln7Var.a - krmVar.D(), str, str2);
                return;
            }
        }
    }

    public final BigDecimal c() {
        Object bVar;
        str<vp3> strVar = this.h;
        if (strVar == null) {
            Intrinsics.n("giftUseCases");
            throw null;
        }
        vp3 vp3Var = strVar.get();
        vp3Var.getClass();
        if (vp3Var.h(3, null)) {
            str<vp3> strVar2 = this.h;
            if (strVar2 == null) {
                Intrinsics.n("giftUseCases");
                throw null;
            }
            if (strVar2.get().j(3, 3)) {
                try {
                    zi50.a aVar = zi50.b;
                    bVar = new BigDecimal(this.g.c);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                BigDecimal bigDecimal = (BigDecimal) (bVar instanceof zi50.b ? null : bVar);
                if (bigDecimal == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                bigDecimal.getClass();
                return bigDecimal;
            }
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        bigDecimal2.getClass();
        return bigDecimal2;
    }

    public final BigDecimal d() {
        Object next;
        lrm lrmVar = this.c;
        List<ln7> listA0 = lrmVar.a0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA0) {
            if (!Intrinsics.g(((ln7) obj).b, ln7.a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (true) {
            next = null;
            if (i >= size) {
                break;
            }
            Object obj2 = arrayList.get(i);
            i++;
            imn imnVar = (imn) lrmVar.u().get(((ln7) obj2).b);
            BigDecimal bigDecimalMultiply = uyx.a(imnVar != null ? imnVar.a : null).c.multiply(new BigDecimal(imnVar != null ? imnVar.c : 0L));
            bigDecimalMultiply.getClass();
            arrayList2.add(bigDecimalMultiply);
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            next = it.next();
            while (it.hasNext()) {
                next = ((BigDecimal) next).add((BigDecimal) it.next());
                next.getClass();
            }
        }
        BigDecimal bigDecimal = (BigDecimal) next;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        bigDecimal2.getClass();
        return bigDecimal2;
    }
}
