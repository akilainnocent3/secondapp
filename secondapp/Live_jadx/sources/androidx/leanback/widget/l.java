package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<a2> f12772a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<Class<?>, Object> f12773b = new HashMap<>();

    @Override // androidx.leanback.widget.b2
    public a2 a(Object obj) {
        Object obj2;
        a2 a2VarA;
        if (obj == null) {
            return null;
        }
        Class<?> superclass = obj.getClass();
        do {
            obj2 = this.f12773b.get(superclass);
            if ((obj2 instanceof b2) && (a2VarA = ((b2) obj2).a(obj)) != null) {
                return a2VarA;
            }
            superclass = superclass.getSuperclass();
            if (obj2 != null) {
                break;
            }
        } while (superclass != null);
        return (a2) obj2;
    }

    @Override // androidx.leanback.widget.b2
    public a2[] b() {
        ArrayList<a2> arrayList = this.f12772a;
        return (a2[]) arrayList.toArray(new a2[arrayList.size()]);
    }

    public l c(Class<?> cls, a2 a2Var) {
        this.f12773b.put(cls, a2Var);
        if (!this.f12772a.contains(a2Var)) {
            this.f12772a.add(a2Var);
        }
        return this;
    }

    public l d(Class<?> cls, b2 b2Var) {
        this.f12773b.put(cls, b2Var);
        a2[] a2VarArrB = b2Var.b();
        for (int i10 = 0; i10 < a2VarArrB.length; i10++) {
            if (!this.f12772a.contains(a2VarArrB[i10])) {
                this.f12772a.add(a2VarArrB[i10]);
            }
        }
        return this;
    }
}
