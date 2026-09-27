package qv;

import dr.w2;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jv.j2;
import kotlin.jvm.internal.s1;
import qv.n1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@j2
@s1({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n28#2:160\n28#2:162\n28#2:164\n28#2:166\n28#2:168\n28#2:170\n28#2:172\n16#3:161\n16#3:163\n16#3:165\n16#3:167\n16#3:169\n16#3:171\n16#3:173\n1#4:174\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160\n41#1:162\n43#1:164\n51#1:166\n60#1:168\n63#1:170\n72#1:172\n33#1:161\n41#1:163\n43#1:165\n51#1:167\n60#1:169\n63#1:171\n72#1:173\n*E\n"})
public class m1<T extends n1 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f123010b = AtomicIntegerFieldUpdater.newUpdater(m1.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public T[] f123011a;

    @dr.f1
    public final void a(@oy.l T t10) {
        t10.d(this);
        n1[] n1VarArrK = k();
        int iF = f();
        p(iF + 1);
        n1VarArrK[iF] = t10;
        t10.setIndex(iF);
        s(iF);
    }

    public final void b(@oy.l T t10) {
        synchronized (this) {
            a(t10);
            w2 w2Var = w2.f79517a;
        }
    }

    public final boolean c(@oy.l T t10, @oy.l ds.l<? super T, Boolean> lVar) {
        boolean z10;
        synchronized (this) {
            try {
                if (lVar.invoke(e()).booleanValue()) {
                    a(t10);
                    z10 = true;
                } else {
                    z10 = false;
                }
                kotlin.jvm.internal.j0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.j0.d(1);
                kotlin.jvm.internal.j0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.j0.c(1);
        return z10;
    }

    @oy.m
    public final T d(@oy.l ds.l<? super T, Boolean> lVar) {
        T t10;
        synchronized (this) {
            try {
                int iF = f();
                int i10 = 0;
                while (true) {
                    t10 = null;
                    if (i10 >= iF) {
                        break;
                    }
                    T[] tArr = this.f123011a;
                    if (tArr != null) {
                        t10 = (Object) tArr[i10];
                    }
                    kotlin.jvm.internal.m0.m(t10);
                    if (lVar.invoke(t10).booleanValue()) {
                        break;
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    @dr.f1
    @oy.m
    public final T e() {
        T[] tArr = this.f123011a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int f() {
        return f123010b.get(this);
    }

    public final /* synthetic */ int g() {
        return this._size$volatile;
    }

    public final boolean i() {
        return f() == 0;
    }

    @oy.m
    public final T j() {
        T t10;
        synchronized (this) {
            t10 = (T) e();
        }
        return t10;
    }

    public final T[] k() {
        T[] tArr = this.f123011a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new n1[4];
            this.f123011a = tArr2;
            return tArr2;
        }
        if (f() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, f() * 2);
        kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((n1[]) objArrCopyOf);
        this.f123011a = tArr3;
        return tArr3;
    }

    public final boolean l(@oy.l T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.c() == null) {
                z10 = false;
            } else {
                m(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    @dr.f1
    @oy.l
    public final T m(int i10) {
        T[] tArr = this.f123011a;
        kotlin.jvm.internal.m0.m(tArr);
        p(f() - 1);
        if (i10 < f()) {
            t(i10, f());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                kotlin.jvm.internal.m0.m(t10);
                T t11 = tArr[i11];
                kotlin.jvm.internal.m0.m(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    t(i10, i11);
                    s(i11);
                } else {
                    r(i10);
                }
            } else {
                r(i10);
            }
        }
        T t12 = tArr[f()];
        kotlin.jvm.internal.m0.m(t12);
        t12.d(null);
        t12.setIndex(-1);
        tArr[f()] = null;
        return t12;
    }

    @oy.m
    public final T n(@oy.l ds.l<? super T, Boolean> lVar) {
        synchronized (this) {
            int i10 = 1;
            try {
                n1 n1VarE = e();
                T t10 = null;
                if (n1VarE == null) {
                    kotlin.jvm.internal.j0.d(2);
                    return null;
                }
                if (lVar.invoke(n1VarE).booleanValue()) {
                    t10 = (T) m(0);
                }
                kotlin.jvm.internal.j0.d(i10);
                return t10;
            } finally {
                kotlin.jvm.internal.j0.d(i10);
                kotlin.jvm.internal.j0.c(i10);
            }
        }
    }

    @oy.m
    public final T o() {
        T t10;
        synchronized (this) {
            t10 = f() > 0 ? (T) m(0) : null;
        }
        return t10;
    }

    public final void p(int i10) {
        f123010b.set(this, i10);
    }

    public final /* synthetic */ void q(int i10) {
        this._size$volatile = i10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public final void r(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= f()) {
                return;
            }
            T[] tArr = this.f123011a;
            kotlin.jvm.internal.m0.m(tArr);
            int i13 = i11 + 2;
            if (i13 < f()) {
                T t10 = tArr[i13];
                kotlin.jvm.internal.m0.m(t10);
                T t11 = tArr[i12];
                kotlin.jvm.internal.m0.m(t11);
                if (((Comparable) t10).compareTo(t11) >= 0) {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            T t12 = tArr[i10];
            kotlin.jvm.internal.m0.m(t12);
            T t13 = tArr[i13];
            kotlin.jvm.internal.m0.m(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            t(i10, i13);
            i10 = i13;
        }
    }

    public final void s(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f123011a;
            kotlin.jvm.internal.m0.m(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            kotlin.jvm.internal.m0.m(t10);
            T t11 = tArr[i10];
            kotlin.jvm.internal.m0.m(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            t(i10, i11);
            i10 = i11;
        }
    }

    public final void t(int i10, int i11) {
        T[] tArr = this.f123011a;
        kotlin.jvm.internal.m0.m(tArr);
        T t10 = tArr[i11];
        kotlin.jvm.internal.m0.m(t10);
        T t11 = tArr[i10];
        kotlin.jvm.internal.m0.m(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
