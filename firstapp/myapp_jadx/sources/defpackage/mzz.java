package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.e;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mzz {
    public final uma a;
    public final mma b;
    public final b c;
    public final Function2<a, Integer, Unit> d;
    public final boolean e;
    public final fv0<?> f;
    public final Object g;
    public final AtomicReference<ozz> h = new AtomicReference<>(ozz.c);
    public gz60<e> i;
    public final a350 j;
    public final ek40<Object> k;

    public mzz(uma umaVar, mma mmaVar, b bVar, utw utwVar, Function2 function2, boolean z, fch0 fch0Var, Object obj) {
        this.a = umaVar;
        this.b = mmaVar;
        this.c = bVar;
        this.d = function2;
        this.e = z;
        this.f = fch0Var;
        this.g = obj;
        stw<Object> stwVar = hz60.a;
        stwVar.getClass();
        this.i = stwVar;
        a350 a350Var = new a350();
        a350Var.g(utwVar, bVar.i0());
        this.j = a350Var;
        this.k = new ek40<>(fch0Var.c);
    }

    public final void a() throws Exception {
        AtomicReference<ozz> atomicReference = this.h;
        try {
            switch (atomicReference.get().ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    ozz ozzVar = ozz.f;
                    ozz ozzVar2 = ozz.i;
                    while (!atomicReference.compareAndSet(ozzVar, ozzVar2)) {
                        if (atomicReference.get() != ozzVar) {
                            lm20.b("Unexpected state change from: " + ozzVar + " to: " + ozzVar2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new uwx();
            }
        } catch (Exception e) {
            atomicReference.set(ozz.a);
            throw e;
        }
    }

    public final void b() {
        synchronized (this.g) {
            try {
                ek40<Object> ek40Var = this.k;
                fv0<?> fv0Var = this.f;
                fv0Var.getClass();
                ek40Var.k(fv0Var, this.j);
                this.j.c();
                this.j.d();
                this.j.b();
                this.a.F = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                this.j.b();
                this.a.F = null;
                throw th;
            }
        }
    }

    public final boolean c() {
        return this.h.get().compareTo(ozz.f) >= 0;
    }

    public final void d() {
        AtomicReference<ozz> atomicReference;
        ozz ozzVar = ozz.d;
        ozz ozzVar2 = ozz.f;
        do {
            atomicReference = this.h;
            if (atomicReference.compareAndSet(ozzVar, ozzVar2)) {
                return;
            }
        } while (atomicReference.get() == ozzVar);
        lm20.b("Unexpected state change from: " + ozzVar + " to: " + ozzVar2 + '.');
    }

    public final void e() {
        AtomicReference<ozz> atomicReference = this.h;
        ozz ozzVar = atomicReference.get();
        ozz ozzVar2 = ozz.d;
        if (ozzVar == ozzVar2) {
            return;
        }
        ozz ozzVar3 = ozz.f;
        while (!atomicReference.compareAndSet(ozzVar3, ozzVar2)) {
            if (atomicReference.get() != ozzVar3) {
                lm20.b("Unexpected state change from: " + ozzVar3 + " to: " + ozzVar2 + '.');
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:24:0x0071, B:25:0x0075, B:31:0x009d, B:33:0x00a5, B:28:0x007c, B:30:0x0082, B:35:0x00ab, B:36:0x00af, B:38:0x00b5, B:41:0x00bc, B:42:0x00d7, B:20:0x0048, B:22:0x004e, B:46:0x00e0, B:49:0x00ef, B:50:0x00f2, B:51:0x00f6, B:57:0x011e, B:59:0x0126, B:54:0x00fd, B:56:0x0103, B:64:0x0131, B:65:0x0134, B:66:0x0135, B:67:0x013c, B:68:0x013d, B:69:0x0144, B:23:0x0069, B:47:0x00e5), top: B:72:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:24:0x0071, B:25:0x0075, B:31:0x009d, B:33:0x00a5, B:28:0x007c, B:30:0x0082, B:35:0x00ab, B:36:0x00af, B:38:0x00b5, B:41:0x00bc, B:42:0x00d7, B:20:0x0048, B:22:0x004e, B:46:0x00e0, B:49:0x00ef, B:50:0x00f2, B:51:0x00f6, B:57:0x011e, B:59:0x0126, B:54:0x00fd, B:56:0x0103, B:64:0x0131, B:65:0x0134, B:66:0x0135, B:67:0x013c, B:68:0x013d, B:69:0x0144, B:23:0x0069, B:47:0x00e5), top: B:72:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0126 A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x0002, B:6:0x0019, B:7:0x001e, B:10:0x0022, B:11:0x0029, B:12:0x002a, B:13:0x0031, B:14:0x0032, B:15:0x003c, B:16:0x003d, B:17:0x0041, B:24:0x0071, B:25:0x0075, B:31:0x009d, B:33:0x00a5, B:28:0x007c, B:30:0x0082, B:35:0x00ab, B:36:0x00af, B:38:0x00b5, B:41:0x00bc, B:42:0x00d7, B:20:0x0048, B:22:0x004e, B:46:0x00e0, B:49:0x00ef, B:50:0x00f2, B:51:0x00f6, B:57:0x011e, B:59:0x0126, B:54:0x00fd, B:56:0x0103, B:64:0x0131, B:65:0x0134, B:66:0x0135, B:67:0x013c, B:68:0x013d, B:69:0x0144, B:23:0x0069, B:47:0x00e5), top: B:72:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:25:0x0075->B:82:?, LOOP_END, SYNTHETIC] */
    public final boolean f(atr atrVar) throws Exception {
        ozz ozzVar;
        ozz ozzVar2;
        AtomicReference<ozz> atomicReference = this.h;
        try {
            int iOrdinal = atomicReference.get().ordinal();
            uma umaVar = this.a;
            mma mmaVar = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    b bVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        bVar.z = 100;
                        bVar.y = true;
                    }
                    try {
                        this.i = mmaVar.b(umaVar, atrVar, this.d);
                        if (z) {
                            bVar.a0();
                        }
                        ozz ozzVar3 = ozz.c;
                        ozz ozzVar4 = ozz.d;
                        while (!atomicReference.compareAndSet(ozzVar3, ozzVar4)) {
                            if (atomicReference.get() != ozzVar3) {
                                lm20.b("Unexpected state change from: " + ozzVar3 + " to: " + ozzVar4 + '.');
                                if (this.i.b()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.i.b()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        if (z) {
                            bVar.a0();
                        }
                        throw th;
                    }
                case 3:
                    ozz ozzVar5 = ozz.d;
                    ozz ozzVar6 = ozz.e;
                    try {
                        while (!atomicReference.compareAndSet(ozzVar5, ozzVar6)) {
                            if (atomicReference.get() != ozzVar5) {
                                lm20.b("Unexpected state change from: " + ozzVar5 + " to: " + ozzVar6 + '.');
                                this.i = mmaVar.o(umaVar, atrVar, this.i);
                                ozzVar = ozz.e;
                                ozzVar2 = ozz.d;
                                while (!atomicReference.compareAndSet(ozzVar, ozzVar2)) {
                                    if (atomicReference.get() != ozzVar) {
                                        lm20.b("Unexpected state change from: " + ozzVar + " to: " + ozzVar2 + '.');
                                        if (this.i.b()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.i.b()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = mmaVar.o(umaVar, atrVar, this.i);
                        ozzVar = ozz.e;
                        ozzVar2 = ozz.d;
                        while (!atomicReference.compareAndSet(ozzVar, ozzVar2)) {
                            if (atomicReference.get() != ozzVar) {
                                lm20.b("Unexpected state change from: " + ozzVar + " to: " + ozzVar2 + '.');
                                if (this.i.b()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.i.b()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        ozz ozzVar7 = ozz.e;
                        ozz ozzVar8 = ozz.d;
                        while (!atomicReference.compareAndSet(ozzVar7, ozzVar8)) {
                            if (atomicReference.get() != ozzVar7) {
                                lm20.b("Unexpected state change from: " + ozzVar7 + " to: " + ozzVar8 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                case 4:
                    c.c("Recursive call to resume()");
                    throw new zrp();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new uwx();
            }
        } catch (Exception e) {
            atomicReference.set(ozz.a);
            throw e;
        }
    }
}
