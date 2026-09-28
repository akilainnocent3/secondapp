package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e0f extends pf implements iaj<x0f, m4f, l2f, v1b<? super j0f>, Object> {
    @Override // defpackage.iaj
    public final Object d(x0f x0fVar, m4f m4fVar, l2f l2fVar, v1b<? super j0f> v1bVar) {
        int iIntValue;
        BigDecimal bigDecimal;
        x0f x0fVar2 = x0fVar;
        m4f m4fVar2 = m4fVar;
        l2f l2fVar2 = l2fVar;
        ((g0f) this.a).getClass();
        d2f d2fVar = null;
        if (x0fVar2 == null) {
            return null;
        }
        y0f y0fVar = x0fVar2.e;
        int i = 0;
        boolean z = (y0fVar == null || (bigDecimal = y0fVar.a) == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0) ? false : true;
        int i2 = x0fVar2.b;
        d2f d2fVar2 = l2fVar2.b;
        if (l2fVar2.a == i2 && Intrinsics.g(m4fVar2, m4f.c.a)) {
            d2fVar = d2fVar2;
        }
        l2f l2fVar3 = new l2f(i2, d2fVar, Intrinsics.g(m4fVar2, m4f.d.a));
        int i3 = d2fVar != null ? d2fVar.a : 0;
        List<String> list = b3f.a;
        if (z) {
            uag uagVar = d2f.c;
            ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
            Iterator<T> it = uagVar.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((d2f) it.next()).a));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((Number) obj).intValue() != i3) {
                    arrayList2.add(obj);
                }
            }
            iIntValue = ((Number) CollectionsKt.k0(arrayList2, lx30.INSTANCE)).intValue();
        } else {
            iIntValue = i3;
        }
        return new j0f(i2, l2fVar3, new w2f(list.get(iIntValue), z ? b3f.b.get(i3) : b3f.c.get(i3)), z ? f3f.GOAL : f3f.NO_GOAL);
    }
}
