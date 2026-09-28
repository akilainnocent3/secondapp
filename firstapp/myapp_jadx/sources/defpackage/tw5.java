package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tw5 implements g26 {
    public final Context a;
    public final qw5 b;
    public final rg1 c;
    public final q36 d;
    public final q26 e;
    public final lse f;
    public final long g;
    public final n8e0 i;
    public final d46 j;
    public final mz5 k;
    public final k36 l;
    public final HashMap h = new HashMap();
    public final Object m = new Object();
    public ArrayList n = new ArrayList();

    public tw5(Context context, rg1 rg1Var, k36 k36Var, long j, d46 d46Var, n8e0 n8e0Var) throws uhn {
        this.a = context;
        this.c = rg1Var;
        q26 q26VarA = q26.a(context, rg1Var.b);
        this.e = q26VarA;
        this.f = lse.b(context);
        qw5 qw5Var = new qw5(q26VarA);
        this.b = qw5Var;
        q36 q36Var = new q36(qw5Var);
        this.d = q36Var;
        synchronized (qw5Var.a) {
            qw5Var.c.add(q36Var);
        }
        this.g = j;
        this.i = n8e0Var;
        this.j = d46Var;
        this.l = k36Var;
        try {
            List<String> listAsList = Arrays.asList(q26VarA.c());
            this.k = new mz5(listAsList, q26VarA, rg1Var.a);
            d(listAsList);
        } catch (rz5 e) {
            throw new uhn(new r36(e));
        }
    }

    @Override // defpackage.g26
    public final qx5 a(String str) throws r36 {
        synchronized (this.m) {
            if (!this.n.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        Context context = this.a;
        q26 q26Var = this.e;
        xx5 xx5VarH = h(str);
        qw5 qw5Var = this.b;
        q36 q36Var = this.d;
        rg1 rg1Var = this.c;
        return new qx5(context, q26Var, str, xx5VarH, qw5Var, q36Var, rg1Var.a, rg1Var.b, this.f, this.g, this.j);
    }

    @Override // defpackage.g26
    public final mz5 b() {
        return this.k;
    }

    @Override // defpackage.g26
    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.m) {
            linkedHashSet = new LinkedHashSet(this.n);
        }
        return linkedHashSet;
    }

    @Override // defpackage.y26
    public final void d(List<String> list) throws uhn {
        try {
            ArrayList arrayListG = g(j36.b(this, this.l, new ArrayList(list)));
            synchronized (this.m) {
                try {
                    if (this.n.equals(arrayListG)) {
                        return;
                    }
                    pgt.a("Camera2CameraFactory", "Updated available camera list: " + this.n + " -> " + arrayListG);
                    this.n = arrayListG;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (uhn e) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e);
            throw e;
        }
    }

    @Override // defpackage.g26
    public final q26 e() {
        return this.e;
    }

    @Override // defpackage.g26
    public final qw5 f() {
        return this.b;
    }

    public final ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (str.equals("0") || str.equals("1")) {
                arrayList2.add(str);
            } else if (i26.a(this.e, str)) {
                arrayList2.add(str);
            } else {
                pgt.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList2;
    }

    public final xx5 h(String str) throws r36 {
        HashMap map = this.h;
        try {
            xx5 xx5Var = (xx5) map.get(str);
            if (xx5Var != null) {
                return xx5Var;
            }
            xx5 xx5Var2 = new xx5(str, this.e, this.i);
            map.put(str, xx5Var2);
            return xx5Var2;
        } catch (rz5 e) {
            throw new r36(e);
        }
    }

    @Override // defpackage.g26
    public final void shutdown() {
        qw5 qw5Var = this.b;
        synchronized (qw5Var.a) {
            qw5Var.c.clear();
            qw5Var.d.clear();
            qw5Var.f.clear();
            qw5Var.e.clear();
            qw5Var.g = 0;
        }
        this.k.e();
    }
}
