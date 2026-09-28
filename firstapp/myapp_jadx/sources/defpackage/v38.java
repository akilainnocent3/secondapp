package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class v38 {

    public final class a extends qlr implements Function0<Boolean> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = m2g.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    bb80 bb80Var = (bb80) obj2;
                    bb80 bb80Var2 = (bb80) obj;
                    arrayList2.add(new gly((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (bb80Var2.g().c() >> 32)) - Float.intBitsToFloat((int) (bb80Var.g().c() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (bb80Var2.g().c() & 4294967295L)) - Float.intBitsToFloat((int) (bb80Var.g().c() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((gly) CollectionsKt.T(list)).a;
            } else {
                if (list.isEmpty()) {
                    ois.c("Empty collection can't be reduced.");
                }
                Object objT = CollectionsKt.T(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objT = new gly(gly.f(((gly) objT).a, ((gly) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((gly) objT).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }
}
