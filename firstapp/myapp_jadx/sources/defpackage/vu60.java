package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vu60 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final bv60 b;

    public static final class a<T> extends ssw<T> {
        public String l;
        public vu60 m;

        @Override // defpackage.njs
        public final void m(T t) {
            bv60 bv60Var;
            vu60 vu60Var = this.m;
            if (vu60Var != null && (bv60Var = vu60Var.b) != null) {
                bv60Var.a(t, this.l);
            }
            super.m(t);
        }
    }

    public vu60() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.b = new bv60(o2gVar);
    }

    public final boolean a(String str) {
        str.getClass();
        bv60 bv60Var = this.b;
        bv60Var.getClass();
        return bv60Var.a.containsKey(str);
    }

    public final <T> T b(String str) {
        T t;
        str.getClass();
        bv60 bv60Var = this.b;
        bv60Var.getClass();
        LinkedHashMap linkedHashMap = bv60Var.a;
        LinkedHashMap linkedHashMap2 = bv60Var.d;
        try {
            ztw ztwVar = (ztw) linkedHashMap2.get(str);
            if (ztwVar != null && (t = (T) ztwVar.getValue()) != null) {
                return t;
            }
            return (T) linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            bv60Var.c.remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final a c(String str) {
        Object obj;
        a aVar;
        bv60 bv60Var = this.b;
        LinkedHashMap linkedHashMap = bv60Var.d;
        LinkedHashMap linkedHashMap2 = bv60Var.a;
        if (linkedHashMap.containsKey(str)) {
            kb5.a(tug.a("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both."));
            return null;
        }
        LinkedHashMap linkedHashMap3 = this.a;
        Object obj2 = linkedHashMap3.get(str);
        if (obj2 == null) {
            if (linkedHashMap2.containsKey(str)) {
                obj = obj2;
                a aVar2 = new a(linkedHashMap2.get(str));
                aVar2.l = str;
                aVar2.m = this;
                aVar = aVar2;
            } else {
                obj = obj2;
                a aVar3 = new a();
                aVar3.l = str;
                aVar3.m = this;
                aVar = aVar3;
            }
            linkedHashMap3.put(str, aVar);
            obj = aVar;
        }
        obj = obj2;
        return (a) obj;
    }

    public final v340 d(Object obj, String str) {
        bv60 bv60Var = this.b;
        boolean zContainsKey = bv60Var.d.containsKey(str);
        LinkedHashMap linkedHashMap = bv60Var.a;
        if (zContainsKey) {
            LinkedHashMap linkedHashMap2 = bv60Var.d;
            Object objA = linkedHashMap2.get(str);
            if (objA == null) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, obj);
                }
                objA = xwd0.a(linkedHashMap.get(str));
                linkedHashMap2.put(str, objA);
            }
            return e1i.b((ztw) objA);
        }
        LinkedHashMap linkedHashMap3 = bv60Var.c;
        Object objA2 = linkedHashMap3.get(str);
        if (objA2 == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, obj);
            }
            objA2 = xwd0.a(linkedHashMap.get(str));
            linkedHashMap3.put(str, objA2);
        }
        return e1i.b((ztw) objA2);
    }

    public final void e(Object obj, String str) {
        Object obj2;
        str.getClass();
        if (obj != null) {
            ArrayList arrayList = cv60.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                do {
                    if (i < size) {
                        obj2 = arrayList.get(i);
                        i++;
                    }
                } while (!((Class) obj2).isInstance(obj));
            }
            efx.a(obj.getClass(), "Can't put value with type ", " into saved state");
            return;
        }
        ArrayList arrayList2 = cv60.a;
        Object obj3 = this.a.get(str);
        ssw sswVar = obj3 instanceof ssw ? (ssw) obj3 : null;
        if (sswVar != null) {
            sswVar.m(obj);
        }
        this.b.a(obj, str);
    }

    public vu60(xnu xnuVar) {
        this.b = new bv60(xnuVar);
    }
}
