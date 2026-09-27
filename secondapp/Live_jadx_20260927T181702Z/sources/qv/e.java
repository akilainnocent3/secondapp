package qv;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.s1;
import nj.z2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f122955a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final z0 f122956b = new z0("CLOSED");

    public static final /* synthetic */ boolean b(AtomicIntegerArray atomicIntegerArray, int i10, int i11, ds.l<? super Integer, Boolean> lVar) {
        int i12;
        do {
            i12 = atomicIntegerArray.get(i10);
            if (!lVar.invoke(Integer.valueOf(i12)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i10, i12, i12 + i11));
        return true;
    }

    public static final /* synthetic */ boolean c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, int i10, ds.l<? super Integer, Boolean> lVar) {
        int i11;
        do {
            i11 = atomicIntegerFieldUpdater.get(obj);
            if (!lVar.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i11, i11 + i10));
        return true;
    }

    public static final /* synthetic */ boolean d(AtomicInteger atomicInteger, int i10, ds.l<? super Integer, Boolean> lVar) {
        int i11;
        do {
            i11 = atomicInteger.get();
            if (!lVar.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i11, i11 + i10));
        return true;
    }

    @oy.l
    public static final <N extends f<N>> N e(@oy.l N n10) {
        while (true) {
            Object objG = n10.g();
            if (objG == f122956b) {
                return n10;
            }
            f fVar = (f) objG;
            if (fVar != null) {
                n10 = (N) fVar;
            } else if (n10.o()) {
                return n10;
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> Object f(AtomicReferenceArray atomicReferenceArray, int i10, long j10, S s10, ds.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object objI = i(s10, j10, pVar);
            if (x0.h(objI)) {
                return objI;
            }
            w0 w0VarF = x0.f(objI);
            while (true) {
                w0 w0Var = (w0) atomicReferenceArray.get(i10);
                if (w0Var.f123045d >= w0VarF.f123045d) {
                    return objI;
                }
                if (!w0VarF.C()) {
                    break;
                }
                if (z2.a(atomicReferenceArray, i10, w0Var, w0VarF)) {
                    if (w0Var.v()) {
                        w0Var.q();
                    }
                    return objI;
                }
                if (w0VarF.v()) {
                    w0VarF.q();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> Object g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, long j10, S s10, ds.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object objI = i(s10, j10, pVar);
            if (x0.h(objI)) {
                return objI;
            }
            w0 w0VarF = x0.f(objI);
            while (true) {
                w0 w0Var = (w0) atomicReferenceFieldUpdater.get(obj);
                if (w0Var.f123045d >= w0VarF.f123045d) {
                    return objI;
                }
                if (!w0VarF.C()) {
                    break;
                }
                if (h0.b.a(atomicReferenceFieldUpdater, obj, w0Var, w0VarF)) {
                    if (w0Var.v()) {
                        w0Var.q();
                    }
                    return objI;
                }
                if (w0VarF.v()) {
                    w0VarF.q();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> Object h(AtomicReference atomicReference, long j10, S s10, ds.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object objI = i(s10, j10, pVar);
            if (x0.h(objI)) {
                return objI;
            }
            w0 w0VarF = x0.f(objI);
            while (true) {
                w0 w0Var = (w0) atomicReference.get();
                if (w0Var.f123045d >= w0VarF.f123045d) {
                    return objI;
                }
                if (!w0VarF.C()) {
                    break;
                }
                if (androidx.lifecycle.y.a(atomicReference, w0Var, w0VarF)) {
                    if (w0Var.v()) {
                        w0Var.q();
                    }
                    return objI;
                }
                if (w0VarF.v()) {
                    w0VarF.q();
                }
            }
        }
    }

    @oy.l
    public static final <S extends w0<S>> Object i(@oy.l S s10, long j10, @oy.l ds.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f123045d >= j10 && !s10.m()) {
                return x0.b(s10);
            }
            Object objG = s10.g();
            if (objG == f122956b) {
                return x0.b(f122956b);
            }
            S sInvoke = (S) ((f) objG);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s10.f123045d + 1), s10);
                if (s10.t(sInvoke)) {
                    if (s10.m()) {
                        s10.q();
                    }
                }
            }
            s10 = (Object) sInvoke;
        }
    }

    public static final /* synthetic */ <S extends w0<S>> boolean m(AtomicReferenceArray atomicReferenceArray, int i10, S s10) {
        while (true) {
            w0 w0Var = (w0) atomicReferenceArray.get(i10);
            if (w0Var.f123045d >= s10.f123045d) {
                return true;
            }
            if (!s10.C()) {
                return false;
            }
            if (z2.a(atomicReferenceArray, i10, w0Var, s10)) {
                if (w0Var.v()) {
                    w0Var.q();
                }
                return true;
            }
            if (s10.v()) {
                s10.q();
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> boolean n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, S s10) {
        while (true) {
            w0 w0Var = (w0) atomicReferenceFieldUpdater.get(obj);
            if (w0Var.f123045d >= s10.f123045d) {
                return true;
            }
            if (!s10.C()) {
                return false;
            }
            if (h0.b.a(atomicReferenceFieldUpdater, obj, w0Var, s10)) {
                if (w0Var.v()) {
                    w0Var.q();
                }
                return true;
            }
            if (s10.v()) {
                s10.q();
            }
        }
    }

    public static final /* synthetic */ <S extends w0<S>> boolean o(AtomicReference atomicReference, S s10) {
        while (true) {
            w0 w0Var = (w0) atomicReference.get();
            if (w0Var.f123045d >= s10.f123045d) {
                return true;
            }
            if (!s10.C()) {
                return false;
            }
            if (androidx.lifecycle.y.a(atomicReference, w0Var, s10)) {
                if (w0Var.v()) {
                    w0Var.q();
                }
                return true;
            }
            if (s10.v()) {
                s10.q();
            }
        }
    }
}
