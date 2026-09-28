package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ax20 implements yw20 {
    public final Context a;
    public final mpe0 b;
    public final int c;
    public final mpe0 d;
    public final mpe0 e;
    public boolean f;

    public ax20(Context context, xsh0 xsh0Var) {
        context.getClass();
        xsh0Var.getClass();
        this.a = context;
        this.b = hwr.b(new zw20(this, 0));
        this.c = Process.myPid();
        int i = 2;
        this.d = hwr.b(new vdb(xsh0Var, i));
        this.e = hwr.b(new wdb(this, i));
    }

    @Override // defpackage.yw20
    public final String a() {
        return (String) this.b.getValue();
    }

    @Override // defpackage.yw20
    public final boolean b(Map<String, xw20> map) {
        map.getClass();
        xw20 xw20Var = map.get(a());
        return (xw20Var != null && xw20Var.a == this.c && Intrinsics.g(xw20Var.b, (String) this.d.getValue())) ? false : true;
    }

    @Override // defpackage.yw20
    public final Map<String, xw20> c(Map<String, xw20> map) {
        mpe0 mpe0Var = this.d;
        if (map == null) {
            return jpu.b(new Pair(a(), new xw20(Process.myPid(), (String) mpe0Var.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new xw20(Process.myPid(), (String) mpe0Var.getValue()));
        return kpu.l(linkedHashMap);
    }

    @Override // defpackage.yw20
    public final void d() {
        this.f = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yw20
    public final boolean e(Map<String, xw20> map) {
        map.getClass();
        if (!this.f) {
            ArrayList arrayListA = dx20.a(this.a);
            ArrayList arrayList = new ArrayList();
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                cx20 cx20Var = (cx20) obj;
                xw20 xw20Var = map.get(cx20Var.a);
                Pair pair = xw20Var != null ? new Pair(cx20Var, xw20Var) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                Pair pair2 = (Pair) obj2;
                cx20 cx20Var2 = (cx20) pair2.a;
                xw20 xw20Var2 = (xw20) pair2.b;
                boolean zG = Intrinsics.g(a(), cx20Var2.a);
                int i3 = cx20Var2.b;
                if (zG) {
                    if (i3 != xw20Var2.a || !Intrinsics.g((String) this.d.getValue(), xw20Var2.b)) {
                    }
                } else if (i3 != xw20Var2.a) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.yw20
    public final Map<String, xw20> f() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return c(o2gVar);
    }
}
