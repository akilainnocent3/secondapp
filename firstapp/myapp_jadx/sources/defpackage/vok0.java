package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class vok0 implements ipk0, rok0 {
    public final HashMap a = new HashMap();

    @Override // defpackage.ipk0
    public final ipk0 a() {
        vok0 vok0Var = new vok0();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof rok0;
            HashMap map = vok0Var.a;
            if (z) {
                map.put((String) entry.getKey(), (ipk0) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((ipk0) entry.getValue()).a());
            }
        }
        return vok0Var;
    }

    @Override // defpackage.rok0
    public final ipk0 b(String str) {
        HashMap map = this.a;
        return map.containsKey(str) ? (ipk0) map.get(str) : ipk0.o;
    }

    @Override // defpackage.ipk0
    public ipk0 c(String str, g3l0 g3l0Var, ArrayList arrayList) {
        return "toString".equals(str) ? new ypk0(toString()) : rok0.d(this, new ypk0(str), g3l0Var, arrayList);
    }

    @Override // defpackage.rok0
    public final void e(String str, ipk0 ipk0Var) {
        HashMap map = this.a;
        if (ipk0Var == null) {
            map.remove(str);
        } else {
            map.put(str, ipk0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vok0) {
            return this.a.equals(((vok0) obj).a);
        }
        return false;
    }

    @Override // defpackage.rok0
    public final boolean f(String str) {
        return this.a.containsKey(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ipk0
    public final String zzc() {
        return "[object Object]";
    }

    @Override // defpackage.ipk0
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.ipk0
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.ipk0
    public final Iterator zzf() {
        return new mok0(this.a.keySet().iterator());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format(llGRV.xKgFPpc, str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
