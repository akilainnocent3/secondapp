package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zuh {
    public static final zuh a = new zuh();
    public static final pfd b = fse.a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArrayList arrayList, x1b x1bVar) {
        wuh wuhVar;
        if (x1bVar instanceof wuh) {
            wuhVar = (wuh) x1bVar;
            int i = wuhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wuhVar.d = i - Integer.MIN_VALUE;
            } else {
                wuhVar = new wuh(this, x1bVar);
            }
        } else {
            wuhVar = new wuh(this, x1bVar);
        }
        Object obj = wuhVar.b;
        y5b y5bVar = y5b.a;
        int i2 = wuhVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            LinkedHashMap linkedHashMap = wuhVar.a;
            uj50.b(obj);
            return linkedHashMap;
        }
        uj50.b(obj);
        int size = arrayList.size();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (size >= 2) {
            if (size == 2) {
                linkedHashMap2.put(new Integer(2), new Double(1.0d));
                return linkedHashMap2;
            }
            Integer num = o4p.r.get(new Integer(size));
            xuh xuhVar = new xuh(num != null ? num.intValue() : 2, size, arrayList, new ConcurrentHashMap(), linkedHashMap2, null);
            wuhVar.a = linkedHashMap2;
            wuhVar.d = 1;
            if (w5b.d(xuhVar, wuhVar) == y5bVar) {
                return y5bVar;
            }
        }
        return linkedHashMap2;
    }
}
