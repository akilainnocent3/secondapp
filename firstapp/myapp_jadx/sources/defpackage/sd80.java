package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class sd80 implements pd80, gs5 {
    public final String a;
    public final yd80 b;
    public final int c;
    public final List<Annotation> d;
    public final HashSet e;
    public final String[] f;
    public final pd80[] g;
    public final List<Annotation>[] h;
    public final boolean[] i;
    public final Map<String, Integer> j;
    public final pd80[] k;
    public final mpe0 l;

    public sd80(String str, yd80 yd80Var, int i, List<? extends pd80> list, eq7 eq7Var) {
        yd80Var.getClass();
        list.getClass();
        this.a = str;
        this.b = yd80Var;
        this.c = i;
        this.d = eq7Var.b;
        ArrayList arrayList = eq7Var.c;
        this.e = CollectionsKt.y0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = fz9.b(eq7Var.e);
        this.h = (List[]) eq7Var.f.toArray(new List[0]);
        this.i = CollectionsKt.v0(eq7Var.g);
        strArr.getClass();
        gfn gfnVar = new gfn(new yx0(strArr, 0));
        ArrayList arrayList2 = new ArrayList(l48.r(gfnVar, 10));
        Iterator it = gfnVar.iterator();
        while (true) {
            hfn hfnVar = (hfn) it;
            if (!hfnVar.a.hasNext()) {
                this.j = kpu.k(arrayList2);
                this.k = fz9.b(list);
                this.l = hwr.b(new rd80(this, 0));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) hfnVar.next();
            arrayList2.add(new Pair(indexedValue.b, Integer.valueOf(indexedValue.a)));
        }
    }

    @Override // defpackage.gs5
    public final Set<String> a() {
        return this.e;
    }

    @Override // defpackage.pd80
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pd80
    public final int c(String str) {
        str.getClass();
        Integer num = this.j.get(str);
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
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sd80) {
            pd80 pd80Var = (pd80) obj;
            if (this.a.equals(pd80Var.h()) && Arrays.equals(this.k, ((sd80) obj).k)) {
                int iD = pd80Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        pd80[] pd80VarArr = this.g;
                        if (Intrinsics.g(pd80VarArr[i2].h(), pd80Var.g(i2).h()) && Intrinsics.g(pd80VarArr[i2].getKind(), pd80Var.g(i2).getKind())) {
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
        return this.h[i];
    }

    @Override // defpackage.pd80
    public final pd80 g(int i) {
        return this.g[i];
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return this.d;
    }

    @Override // defpackage.pd80
    public final yd80 getKind() {
        return this.b;
    }

    @Override // defpackage.pd80
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // defpackage.pd80
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return hgo.b(this);
    }
}
