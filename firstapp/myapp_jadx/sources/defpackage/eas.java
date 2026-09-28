package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.sportybet.android.account.KycNativeCameraActivity;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class eas implements cbj<Void> {
    public final /* synthetic */ fas a;
    public final /* synthetic */ c46 b;
    public final /* synthetic */ KycNativeCameraActivity c;

    public eas(fas fasVar, c46 c46Var, KycNativeCameraActivity kycNativeCameraActivity) {
        this.a = fasVar;
        this.b = c46Var;
        this.c = kycNativeCameraActivity;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        qis<Void> qisVar;
        fas fasVar = this.a;
        final cas casVar = new cas(fasVar);
        if (kpf0.b()) {
            casVar.run();
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            km20.g("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: jpf0
                @Override // java.lang.Runnable
                public final void run() {
                    cas casVar2 = casVar;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    try {
                        casVar2.run();
                    } finally {
                        countDownLatch2.countDown();
                    }
                }
            }));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new hzo(e);
            }
        }
        final c46 c46Var = fasVar.e;
        if (c46Var != null) {
            synchronized (c46Var.b) {
                try {
                    c46Var.e.removeCallbacksAndMessages("retry_token");
                    int iOrdinal = c46Var.o.ordinal();
                    if (iOrdinal == 0) {
                        c46Var.o = c46.a.e;
                        qisVar = fcn.c.b;
                    } else {
                        if (iOrdinal == 1) {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                        if (iOrdinal == 2 || iOrdinal == 3) {
                            c46Var.o = c46.a.e;
                            c46.a(c46Var.q);
                            c46Var.p = nv5.a(new nv5.c() { // from class: z36
                                @Override // nv5.c
                                public final Object a(final nv5.a aVar) {
                                    qis qisVar2;
                                    final c46 c46Var2 = c46Var;
                                    c46Var2.n.e();
                                    final h36 h36Var = c46Var2.a;
                                    synchronized (h36Var.a) {
                                        try {
                                            boolean zIsEmpty = h36Var.b.isEmpty();
                                            nv5.d dVar = h36Var.d;
                                            qis qisVar3 = dVar;
                                            nv5.d dVar2 = dVar;
                                            if (zIsEmpty) {
                                                if (dVar == null) {
                                                    qisVar3 = fcn.c.b;
                                                }
                                                qisVar2 = qisVar3;
                                            } else {
                                                if (dVar == null) {
                                                    nv5.a<Void> aVar2 = new nv5.a<>();
                                                    nv5.d dVar3 = new nv5.d(aVar2);
                                                    aVar2.b = dVar3;
                                                    aVar2.a = ew5.class;
                                                    try {
                                                        synchronized (h36Var.a) {
                                                            h36Var.e = aVar2;
                                                        }
                                                        aVar2.a = "CameraRepository-deinit";
                                                    } catch (Exception e2) {
                                                        dVar3.a(e2);
                                                    }
                                                    h36Var.d = dVar3;
                                                    dVar2 = dVar3;
                                                }
                                                h36Var.c.addAll(h36Var.b.values());
                                                for (final n26 n26Var : h36Var.b.values()) {
                                                    n26Var.release().k(new Runnable() { // from class: g36
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            h36 h36Var2 = h36Var;
                                                            n26 n26Var2 = n26Var;
                                                            synchronized (h36Var2.a) {
                                                                try {
                                                                    h36Var2.c.remove(n26Var2);
                                                                    if (h36Var2.c.isEmpty()) {
                                                                        h36Var2.e.getClass();
                                                                        h36Var2.e.b(null);
                                                                        h36Var2.e = null;
                                                                        h36Var2.d = null;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    throw th2;
                                                                }
                                                            }
                                                        }
                                                    }, nqe.a());
                                                }
                                                h36Var.b.clear();
                                                qisVar2 = dVar2;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    qisVar2.k(new Runnable() { // from class: a46
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            c46 c46Var3 = c46Var2;
                                            nv5.a aVar3 = aVar;
                                            c46Var3.g.shutdown();
                                            if (c46Var3.f != null) {
                                                Executor executor = c46Var3.d;
                                                if (executor instanceof f26) {
                                                    f26 f26Var = (f26) executor;
                                                    synchronized (f26Var.a) {
                                                        try {
                                                            if (!f26Var.b.isShutdown()) {
                                                                f26Var.b.shutdown();
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                c46Var3.f.quit();
                                            }
                                            aVar3.b(null);
                                        }
                                    }, c46Var2.d);
                                    return "CameraX shutdownInternal";
                                }
                            });
                        }
                        qisVar = c46Var.p;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            qisVar = fcn.c.b;
        }
        qisVar.getClass();
        synchronized (fasVar.a) {
            fasVar.b = null;
            fasVar.c = qisVar;
            fasVar.g.clear();
            fasVar.h.clear();
            Unit unit = Unit.a;
        }
        fasVar.e = null;
        fasVar.f = null;
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r2) {
        c46 c46Var = this.b;
        fas fasVar = this.a;
        fasVar.e = c46Var;
        fasVar.f = o1b.a(this.c);
    }
}
