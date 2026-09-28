package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes8.dex */
public final class ptu {
    public static final AtomicInteger m = new AtomicInteger();
    public int c;
    public int d;
    public int f;
    public int g;
    public int[] b = new int[16];
    public Object[] e = new Object[16];
    public final a h = new a(16);
    public final a i = new a(8);
    public final c<Map<?, ?>> j = new c<>(new ltu(), new mtu());
    public final c<List<?>> k = new c<>(new ntu(), new otu());
    public Object[] l = new Object[16];
    public final o9e0 a = q9e0.a;

    public static class a {
        public final ArrayList a = new ArrayList();
        public int b;
        public final int c;

        public a(int i) {
            this.c = i;
        }

        public final byte[] a() {
            int i = this.b;
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                int i2 = this.b;
                this.b = i2 + 1;
                return (byte[]) arrayList.get(i2);
            }
            byte[] bArr = new byte[this.c];
            arrayList.add(bArr);
            this.b++;
            return bArr;
        }
    }

    public static class b {
        public final int a = ptu.m.getAndIncrement();
    }

    public static class c<T> {
        public final ArrayList a = new ArrayList();
        public int b;
        public final Supplier<T> c;
        public final Consumer<T> d;

        public c(Supplier<T> supplier, Consumer<T> consumer) {
            this.c = supplier;
            this.d = consumer;
        }

        public final T a() {
            int i = this.b;
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                int i2 = this.b;
                this.b = i2 + 1;
                return (T) arrayList.get(i2);
            }
            T t = this.c.get();
            arrayList.add(t);
            this.b++;
            return t;
        }
    }

    public final void a(Object obj) {
        int i = this.g;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.e = objArr2;
            objArr = objArr2;
        }
        int i2 = this.g;
        this.g = i2 + 1;
        objArr[i2] = obj;
    }

    public final int b() {
        int i = this.d;
        int[] iArr = this.b;
        if (i == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.b = iArr2;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        return i2;
    }

    public final <T> T c(Class<T> cls) {
        Object[] objArr = this.e;
        int i = this.f;
        this.f = i + 1;
        return cls.cast(objArr[i]);
    }

    public final <T> T d(b bVar, Supplier<T> supplier) {
        int i = bVar.a;
        Object[] objArr = this.l;
        if (i >= objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            this.l = objArr2;
            objArr = objArr2;
        }
        T t = (T) objArr[i];
        if (t != null) {
            return t;
        }
        T t2 = supplier.get();
        this.l[i] = t2;
        return t2;
    }

    public final int e() {
        int[] iArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return iArr[i];
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void f() {
        c<Map<?, ?>> cVar;
        this.c = 0;
        this.d = 0;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = null;
        }
        this.f = 0;
        this.g = 0;
        this.h.b = 0;
        this.i.b = 0;
        int i2 = 0;
        while (true) {
            cVar = this.j;
            if (i2 >= cVar.b) {
                break;
            }
            cVar.d.accept((T) cVar.a.get(i2));
            i2++;
        }
        cVar.b = 0;
        int i3 = 0;
        while (true) {
            c<List<?>> cVar2 = this.k;
            if (i3 >= cVar2.b) {
                cVar2.b = 0;
                return;
            } else {
                cVar2.d.accept((T) cVar2.a.get(i3));
                i3++;
            }
        }
    }
}
