package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
@fae
public abstract class znz<T> extends AbstractList<T> {
    public static final /* synthetic */ int w = 0;
    public final wqz<?, T> a;
    public final v5b b;
    public final k5b c;
    public final hoz<T> d;
    public final c e;
    public final int f;
    public final ArrayList i;
    public final ArrayList v;

    public static abstract class a {
        public abstract void a(int i, int i2);

        public abstract void b(int i, int i2);

        public abstract void c(int i, int i2);
    }

    public static final class b {
        public static u1b a(k5b k5bVar, k5b k5bVar2, v5b v5bVar, c cVar, wqz.b.c cVar2, wqz wqzVar, Object obj) {
            wqzVar.getClass();
            v5bVar.getClass();
            k5bVar.getClass();
            k5bVar2.getClass();
            cVar.getClass();
            if (cVar2 == null) {
                cVar2 = (wqz.b.c) dj5.a(kotlin.coroutines.e.a, new aoz(wqzVar, new wqz.a.c(cVar.d, obj, cVar.c), null));
            }
            return new u1b(k5bVar, k5bVar2, v5bVar, cVar, cVar2, wqzVar, obj);
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;

        /* JADX INFO: loaded from: classes2.dex */
        public static final class a {
            public int a = -1;
            public int b = -1;
            public int c = -1;
            public boolean d = true;

            public final void b(int i) {
                if (i >= 1) {
                    this.a = i;
                } else {
                    hb5.a("Page size must be a positive number");
                }
            }

            public final c a() {
                int i = this.b;
                if (i < 0) {
                    i = this.a;
                    this.b = i;
                }
                int i2 = this.c;
                if (i2 < 0) {
                    i2 = this.a * 3;
                    this.c = i2;
                }
                boolean z = this.d;
                if (z || i != 0) {
                    return new c(this.a, i, i2, z);
                }
                hb5.a(LxHElgWAiSeM.sNfgCkBzttzEl);
                return null;
            }
        }

        public c(int i, int i2, int i3, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
        }
    }

    public static abstract class d {
        public hxs a;
        public hxs b;
        public hxs c;

        public d() {
            hxs.c cVar = hxs.c.c;
            this.a = cVar;
            this.b = cVar;
            this.c = cVar;
        }

        public abstract void a(kxs kxsVar, hxs hxsVar);

        public final void b(kxs kxsVar, hxs hxsVar) {
            hxsVar.getClass();
            int iOrdinal = kxsVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        if (Intrinsics.g(this.c, hxsVar)) {
                            return;
                        } else {
                            this.c = hxsVar;
                        }
                    }
                } else if (Intrinsics.g(this.b, hxsVar)) {
                    return;
                } else {
                    this.b = hxsVar;
                }
            } else if (Intrinsics.g(this.a, hxsVar)) {
                return;
            } else {
                this.a = hxsVar;
            }
            a(kxsVar, hxsVar);
        }
    }

    public static final class e extends qlr implements Function1<WeakReference<a>, Boolean> {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<a> weakReference) {
            WeakReference<a> weakReference2 = weakReference;
            weakReference2.getClass();
            return Boolean.valueOf(weakReference2.get() == null);
        }
    }

    public znz(wqz<?, T> wqzVar, v5b v5bVar, k5b k5bVar, hoz<T> hozVar, c cVar) {
        wqzVar.getClass();
        v5bVar.getClass();
        k5bVar.getClass();
        cVar.getClass();
        this.a = wqzVar;
        this.b = v5bVar;
        this.c = k5bVar;
        this.d = hozVar;
        this.e = cVar;
        this.f = (cVar.b * 2) + cVar.a;
        this.i = new ArrayList();
        this.v = new ArrayList();
    }

    public final void a(a aVar) {
        aVar.getClass();
        e eVar = e.a;
        ArrayList arrayList = this.i;
        p48.A(arrayList, eVar);
        arrayList.add(new WeakReference(aVar));
    }

    @fae
    public final void b(znz znzVar, a aVar) {
        if (znzVar != this) {
            int iA = this.d.a();
            int iA2 = znzVar.d.a();
            if (iA2 < iA) {
                if (iA2 > 0) {
                    aVar.a(0, iA2);
                }
                int i = iA - iA2;
                if (i > 0) {
                    aVar.b(iA2, i);
                }
            } else {
                if (iA > 0) {
                    aVar.a(0, iA);
                }
                int i2 = iA2 - iA;
                if (i2 != 0) {
                    aVar.c(iA, i2);
                }
            }
        }
        a(aVar);
    }

    public abstract void c(Function2<? super kxs, ? super hxs, Unit> function2);

    public abstract Object d();

    public wqz<?, T> e() {
        return this.a;
    }

    public abstract boolean f();

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return this.d.get(i);
    }

    public boolean h() {
        return f();
    }

    public final void i(int i) {
        hoz<T> hozVar = this.d;
        if (i < 0 || i >= hozVar.a()) {
            ks40.a(hozVar.a(), efe0.a(i, "Index: ", ", Size: "));
        } else {
            hozVar.i = f.e(i - hozVar.b, 0, hozVar.f - 1);
            j(i);
        }
    }

    public abstract void j(int i);

    public final void k(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.m0(this.i).iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(i, i2);
            }
        }
    }

    public final void l(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.m0(this.i).iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.b(i, i2);
            }
        }
    }

    public void m(hxs hxsVar) {
        hxsVar.getClass();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.a();
    }
}
