package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import defpackage.bj50;
import defpackage.dj50;
import defpackage.hce0;
import defpackage.hm20;
import defpackage.ijk0;
import defpackage.kd00;
import defpackage.kjk0;
import defpackage.ljk0;
import defpackage.s250;
import defpackage.x4l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePendingResult<R extends bj50> extends kd00<R> {
    public static final ijk0 j = new ijk0();
    public bj50 e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    private kjk0 resultGuardian;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public static class a<R extends bj50> extends ljk0 {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("BasePendingResult", hce0.a(i, "Don't know how to handle message: "), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).c(Status.v);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            dj50 dj50Var = (dj50) pair.first;
            bj50 bj50Var = (bj50) pair.second;
            try {
                dj50Var.a();
            } catch (RuntimeException e) {
                BasePendingResult.g(bj50Var);
                throw e;
            }
        }
    }

    public BasePendingResult(x4l x4lVar) {
        new a(x4lVar != null ? x4lVar.a() : Looper.getMainLooper());
        new WeakReference(x4lVar);
    }

    public static void g(bj50 bj50Var) {
        if (bj50Var instanceof s250) {
            try {
                ((s250) bj50Var).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(bj50Var)), e);
            }
        }
    }

    public final void a(kd00.a aVar) {
        synchronized (this.a) {
            try {
                if (d()) {
                    aVar.a(this.f);
                } else {
                    this.c.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract R b(Status status);

    @Deprecated
    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.b.getCount() == 0;
    }

    public final void e(R r) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    g(r);
                    return;
                }
                d();
                hm20.j("Results have already been set", !d());
                hm20.j("Result has already been consumed", !this.g);
                f(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(bj50 bj50Var) {
        this.e = bj50Var;
        this.f = bj50Var.getStatus();
        this.b.countDown();
        if (this.e instanceof s250) {
            this.resultGuardian = new kjk0(this);
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kd00.a) arrayList.get(i)).a(this.f);
        }
        arrayList.clear();
    }

    @Deprecated
    public BasePendingResult() {
        new a(Looper.getMainLooper());
        new WeakReference(null);
    }
}
