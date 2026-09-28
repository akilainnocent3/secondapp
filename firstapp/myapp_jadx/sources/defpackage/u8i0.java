package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class u8i0 implements AutoCloseable {
    public final String a;
    public final krp b;

    public u8i0(String str, krp krpVar) {
        this.a = str;
        this.b = krpVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        zn70 zn70Var = this.b.c;
        zn70Var.getClass();
        ConcurrentHashMap concurrentHashMap = zn70Var.c;
        qn70 qn70Var = (qn70) concurrentHashMap.get(this.a);
        if (qn70Var != null) {
            aon aonVar = zn70Var.a.d;
            aonVar.getClass();
            String str = qn70Var.b;
            int i = 0;
            ynn[] ynnVarArr = (ynn[]) aonVar.b.values().toArray(new ynn[0]);
            ArrayList arrayList = new ArrayList();
            for (ynn ynnVar : ynnVarArr) {
                if (ynnVar instanceof co70) {
                    arrayList.add(ynnVar);
                }
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((co70) obj).c.remove(str);
            }
            concurrentHashMap.remove(str);
        }
    }
}
