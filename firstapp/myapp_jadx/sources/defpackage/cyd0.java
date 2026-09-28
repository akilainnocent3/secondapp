package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class cyd0 {
    public static final ptu.b a;
    public static final ptu.b b;

    public static class a<T> implements Consumer<T> {
        public Map<pg50, Map<oso, List<T>>> a;
        public Function<T, pg50> b;
        public Function<T, oso> c;
        public ptu d;

        @Override // java.util.function.Consumer
        public final void accept(T t) {
            pg50 pg50VarApply = this.b.apply(t);
            Map<oso, List<T>> map = this.a.get(pg50VarApply);
            if (map == null) {
                map = (Map) this.d.j.a();
                this.a.put(pg50VarApply, map);
            }
            oso osoVarApply = this.c.apply(t);
            List<T> list = map.get(osoVarApply);
            if (list == null) {
                list = (List) this.d.k.a();
                map.put(osoVarApply, list);
            }
            list.add(t);
        }
    }

    public static class b<K, V> implements BiConsumer<K, V> {
        public int a;
        public int b;
        public xxd0<K, V> c;
        public ptu d;

        @Override // java.util.function.BiConsumer
        public final void accept(K k, V v) {
            int iB = this.d.b();
            int iA = this.c.a(k, v, this.d);
            this.d.b[iB] = iA;
            this.a = s08.a(iA) + this.b + iA + this.a;
        }
    }

    static {
        AtomicInteger atomicInteger = ptu.m;
        a = new ptu.b();
        b = new ptu.b();
    }

    public static <K, V> int a(ek1 ek1Var, K k, V v, xxd0<K, V> xxd0Var, ptu ptuVar) {
        int iB = ptuVar.b();
        int iA = xxd0Var.a(k, v, ptuVar);
        int iA2 = s08.a(iA) + ek1Var.d() + iA;
        ptuVar.b[iB] = iA;
        return iA2;
    }

    public static int b(ek1 ek1Var, m21 m21Var, ptu ptuVar) {
        if (m21Var.isEmpty()) {
            return 0;
        }
        b bVar = (b) ptuVar.d(b, new ayd0());
        bVar.a = 0;
        bVar.b = ek1Var.d();
        bVar.c = f21.a;
        bVar.d = ptuVar;
        m21Var.forEach(bVar);
        return bVar.a;
    }

    public static <T> int c(ek1 ek1Var, List<? extends T> list, yxd0<T> yxd0Var, ptu ptuVar) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ek1Var.d();
        int iA = 0;
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            int iB = ptuVar.b();
            int iA2 = yxd0Var.a(t, ptuVar);
            ptuVar.b[iB] = iA2;
            iA += s08.a(iA2) + iD + iA2;
        }
        return iA;
    }

    public static <K, V> int d(ek1 ek1Var, Map<K, V> map, xxd0<K, V> xxd0Var, ptu ptuVar, ptu.b bVar) {
        if (map.isEmpty()) {
            return 0;
        }
        b bVar2 = (b) ptuVar.d(bVar, new zxd0());
        bVar2.a = 0;
        bVar2.b = ek1Var.d();
        bVar2.c = xxd0Var;
        bVar2.d = ptuVar;
        map.forEach(bVar2);
        return bVar2.a;
    }

    public static int e(ek1 ek1Var, String str, ptu ptuVar) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        ptuVar.getClass();
        int iB = ptuVar.a.b(str);
        int i = ptuVar.d;
        int[] iArr = ptuVar.b;
        if (i == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            ptuVar.b = iArr2;
            iArr = iArr2;
        }
        int i2 = ptuVar.d;
        ptuVar.d = i2 + 1;
        iArr[i2] = iB;
        if (iB == 0) {
            return 0;
        }
        return s08.a(iB) + iB + ek1Var.d();
    }
}
