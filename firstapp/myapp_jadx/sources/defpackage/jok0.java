package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jok0 implements ipk0, rok0 {
    public final String a;
    public final HashMap b = new HashMap();

    public jok0(String str) {
        this.a = str;
    }

    @Override // defpackage.rok0
    public final ipk0 b(String str) {
        HashMap map = this.b;
        return map.containsKey(str) ? (ipk0) map.get(str) : ipk0.o;
    }

    @Override // defpackage.ipk0
    public final ipk0 c(String str, g3l0 g3l0Var, ArrayList arrayList) {
        return "toString".equals(str) ? new ypk0(this.a) : rok0.d(this, new ypk0(str), g3l0Var, arrayList);
    }

    @Override // defpackage.rok0
    public final void e(String str, ipk0 ipk0Var) {
        HashMap map = this.b;
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
        if (!(obj instanceof jok0)) {
            return false;
        }
        jok0 jok0Var = (jok0) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(jok0Var.a);
        }
        return false;
    }

    @Override // defpackage.rok0
    public final boolean f(String str) {
        return this.b.containsKey(str);
    }

    public abstract ipk0 g(g3l0 g3l0Var, List list);

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ipk0
    public final String zzc() {
        return this.a;
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
        return new mok0(this.b.keySet().iterator());
    }

    @Override // defpackage.ipk0
    public ipk0 a() {
        return this;
    }
}
