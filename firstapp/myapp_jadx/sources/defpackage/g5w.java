package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class g5w {
    public final ArrayList a;

    public g5w(p060 p060Var, p060 p060Var2) throws Throwable {
        Throwable th;
        Pair<giv.b, giv.b> pairA;
        Pair<giv.b, giv.b> pairA2;
        p060Var.getClass();
        p060Var2.getClass();
        int i = giv.e;
        giv givVarA = giv.a.a(new sd0(p060Var.b, p060Var.c), p060Var);
        giv givVarA2 = giv.a.a(new sd0(p060Var2.b, p060Var2.c), p060Var2);
        List<i430> list = givVarA.d;
        List<i430> list2 = givVarA2.d;
        list.getClass();
        list2.getClass();
        ngs ngsVarB = a.b();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).b instanceof ubh.a) {
                ngsVarB.add(list.get(i2));
            }
        }
        ngs ngsVarA = a.a(ngsVarB);
        ngs ngsVarB2 = a.b();
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (list2.get(i3).b instanceof ubh.a) {
                ngsVarB2.add(list2.get(i3));
            }
        }
        ngs ngsVarA2 = a.a(ngsVarB2);
        Pair pair = ngsVarA.getB() > ngsVarA2.getB() ? new Pair(jch.a(ngsVarA2, ngsVarA), ngsVarA2) : new Pair(ngsVarA, jch.a(ngsVarA, ngsVarA2));
        List list3 = (List) pair.a;
        List list4 = (List) pair.b;
        ngs ngsVarB3 = a.b();
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3 && i4 != list4.size(); i4++) {
            ngsVarB3.add(new Pair(Float.valueOf(((i430) list3.get(i4)).a), Float.valueOf(((i430) list4.get(i4)).a)));
        }
        Pair[] pairArr = (Pair[]) a.a(ngsVarB3).toArray(new Pair[0]);
        sze szeVar = new sze((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        gsw gswVar = szeVar.a;
        gsw gswVar2 = szeVar.b;
        float fA = cxh.a(gswVar, gswVar2, 0.0f);
        ArrayList arrayList = givVarA2.c;
        if (0.0f > fA || fA > 1.0f) {
            hb5.a("Cutting point is expected to be between 0 and 1");
            throw null;
        }
        if (fA < 1.0E-4f) {
            th = null;
        } else {
            int size4 = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= size4) {
                    i5 = -1;
                    break;
                }
                Object obj = arrayList.get(i6);
                i6++;
                giv.b bVar = (giv.b) obj;
                float f = bVar.c;
                if (fA <= bVar.d && f <= fA) {
                    break;
                } else {
                    i5++;
                }
            }
            Pair<giv.b, giv.b> pairA3 = ((giv.b) arrayList.get(i5)).a(fA);
            giv.b bVar2 = pairA3.a;
            ArrayList arrayListL = b.l(pairA3.b.a);
            int size5 = arrayList.size();
            for (int i7 = 1; i7 < size5; i7++) {
                arrayListL.add(((giv.b) arrayList.get((i7 + i5) % arrayList.size())).a);
            }
            th = null;
            arrayListL.add(bVar2.a);
            gsw gswVar3 = new gsw(arrayList.size() + 2);
            int size6 = arrayList.size() + 2;
            int i8 = 0;
            while (i8 < size6) {
                gswVar3.a(i8 == 0 ? 0.0f : i8 == arrayList.size() + 1 ? 1.0f : csh0.d(((giv.b) arrayList.get(((i5 + i8) - 1) % arrayList.size())).d - fA, 1.0f));
                i8++;
            }
            ngs ngsVarB4 = a.b();
            int size7 = list2.size();
            for (int i9 = 0; i9 < size7; i9++) {
                ngsVarB4.add(new i430(csh0.d(list2.get(i9).a - fA, 1.0f), list2.get(i9).b));
            }
            givVarA2 = new giv(givVarA2.b, a.a(ngsVarB4), arrayListL, gswVar3);
        }
        ArrayList arrayList2 = new ArrayList();
        giv.b bVar3 = (giv.b) CollectionsKt.V(0, givVarA);
        giv.b bVar4 = (giv.b) CollectionsKt.V(0, givVarA2);
        int i10 = 1;
        int i11 = 1;
        while (bVar3 != null && bVar4 != null) {
            float f2 = i11 == givVarA.c.size() ? 1.0f : bVar3.d;
            float fA2 = i10 == givVarA2.c.size() ? 1.0f : cxh.a(gswVar2, gswVar, csh0.d(bVar4.d + fA, 1.0f));
            float fMin = Math.min(f2, fA2);
            float f3 = 1.0E-6f + fMin;
            if (f2 > f3) {
                pairA = bVar3.a(fMin);
            } else {
                Pair<giv.b, giv.b> pair2 = new Pair<>(bVar3, CollectionsKt.V(i11, givVarA));
                i11++;
                pairA = pair2;
            }
            giv.b bVar5 = pairA.a;
            bVar3 = pairA.b;
            if (fA2 > f3) {
                pairA2 = bVar4.a(csh0.d(cxh.a(gswVar, gswVar2, fMin) - fA, 1.0f));
            } else {
                Pair<giv.b, giv.b> pair3 = new Pair<>(bVar4, CollectionsKt.V(i10, givVarA2));
                i10++;
                pairA2 = pair3;
            }
            giv.b bVar6 = pairA2.a;
            bVar4 = pairA2.b;
            arrayList2.add(new Pair(bVar5.a, bVar6.a));
        }
        if (bVar3 != null || bVar4 != null) {
            hb5.a(oLsIjJCWb.kEbmaVPddSpLD);
            throw th;
        }
        this.a = arrayList2;
    }
}
