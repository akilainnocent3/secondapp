package defpackage;

import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class zw0 extends ncn<w1h<?>, Object> implements b2h {
    public static final Comparator<w1h<?>> d = Comparator.comparing(new yw0());
    public static final zw0 e;
    public m21 c;

    static {
        zw0 zw0Var;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i = 0; i < array.length; i += 2) {
                w1h w1hVar = (w1h) array[i];
                if (w1hVar != null && w1hVar.getKey().isEmpty()) {
                    array[i] = null;
                }
            }
            zw0Var = new zw0(array, d);
        } else {
            zw0Var = new zw0(arrayList.toArray());
        }
        e = zw0Var;
    }

    @Override // defpackage.b2h
    public final m21 d() {
        m21 m21Var = this.c;
        if (m21Var != null) {
            return m21Var;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                break;
            }
            Object obj = objArr[i];
            Object obj2 = objArr[i + 1];
            e21 e21VarA = ((w1h) obj).a();
            if (e21VarA != null && !e21VarA.getKey().isEmpty() && obj2 != null) {
                arrayList.add(e21VarA);
                arrayList.add(obj2);
            }
            i += 2;
        }
        vw0 vw0VarF = (arrayList.size() != 2 || arrayList.get(0) == null) ? vw0.f(arrayList.toArray()) : new vw0(arrayList.toArray());
        this.c = vw0VarF;
        return vw0VarF;
    }
}
