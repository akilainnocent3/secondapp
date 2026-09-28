package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class kr10 implements pd80, gs5 {
    public final String a;
    public final o1k<?> b;
    public final int c;
    public int d;
    public final String[] e;
    public final List<Annotation>[] f;
    public final boolean[] g;
    public Map<String, Integer> h;
    public final ttr i;
    public final ttr j;
    public final ttr k;

    public kr10(String str, o1k<?> o1kVar, int i) {
        str.getClass();
        this.a = str;
        this.b = o1kVar;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.h = o2gVar;
        a1s a1sVar = a1s.b;
        int i4 = 2;
        this.i = hwr.a(a1sVar, new g5a(this, i4));
        this.j = hwr.a(a1sVar, new f6j(this, 1));
        this.k = hwr.a(a1sVar, new g6j(this, i4));
    }

    @Override // defpackage.gs5
    public final Set<String> a() {
        return this.h.keySet();
    }

    @Override // defpackage.pd80
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pd80
    public final int c(String str) {
        str.getClass();
        Integer num = this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.pd80
    public final int d() {
        return this.c;
    }

    @Override // defpackage.pd80
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kr10) {
            pd80 pd80Var = (pd80) obj;
            if (Intrinsics.g(this.a, pd80Var.h()) && Arrays.equals((pd80[]) this.j.getValue(), (pd80[]) ((kr10) obj).j.getValue())) {
                int iD = pd80Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.g(g(i2).h(), pd80Var.g(i2).h()) && Intrinsics.g(g(i2).getKind(), pd80Var.g(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.pd80
    public final List<Annotation> f(int i) {
        List<Annotation> list = this.f[i];
        return list == null ? m2g.a : list;
    }

    @Override // defpackage.pd80
    public pd80 g(int i) {
        return ((php[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return m2g.a;
    }

    @Override // defpackage.pd80
    public yd80 getKind() {
        return ebe0.a.a;
    }

    @Override // defpackage.pd80
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        return this.g[i];
    }

    @Override // defpackage.pd80
    public boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return hgo.b(this);
    }
}
