package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.giftselector.LNGiftSelectorViewModel$state$1", f = "LNGiftSelectorViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class heq extends tje0 implements iaj<qcn<? extends ocq>, jfq, scn<String, ? extends Boolean>, v1b<? super qcn<? extends hfq>>, Object> {
    public /* synthetic */ qcn a;
    public /* synthetic */ jfq b;
    public /* synthetic */ scn c;

    @Override // defpackage.iaj
    public final Object d(qcn<? extends ocq> qcnVar, jfq jfqVar, scn<String, ? extends Boolean> scnVar, v1b<? super qcn<? extends hfq>> v1bVar) {
        heq heqVar = new heq(4, v1bVar);
        heqVar.a = qcnVar;
        heqVar.b = jfqVar;
        heqVar.c = scnVar;
        return heqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn qcnVar = this.a;
        jfq jfqVar = this.b;
        scn scnVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        Iterator<E> it = qcnVar.iterator();
        while (true) {
            boolean zEquals = false;
            if (!it.hasNext()) {
                break;
            }
            ocq ocqVar = (ocq) it.next();
            String str = jfqVar.c.a;
            ocqVar.getClass();
            scnVar.getClass();
            String str2 = ocqVar.a;
            String str3 = ocqVar.d;
            String strA = ukd0.a(2, ocqVar.e, true, true);
            String strO = bwf0.o((6 & 4) != 0 ? 0 : 1, ocqVar.f, false);
            String str4 = ocqVar.b;
            String str5 = ocqVar.c;
            String str6 = ocqVar.a;
            boolean zG = Intrinsics.g(scnVar.get(str6), Boolean.TRUE);
            if (str != null) {
                zEquals = str.equals(str6);
            }
            arrayList.add(new hfq(str2, str3, strA, strO, str4, str5, zG, zEquals));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj2 = arrayList2.get(i2);
            i2++;
            if (((hfq) obj2).h) {
                break;
            }
            i++;
        }
        if (i > 0) {
            arrayList2.add(0, (hfq) arrayList2.remove(i));
        }
        return a4h.b(arrayList2);
    }
}
