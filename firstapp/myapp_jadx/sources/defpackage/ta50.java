package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ta50<R> implements Future, d5f0, wa50<R> {
    public R a;
    public ca50 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public xzk f;

    public static class a {
    }

    @Override // defpackage.d5f0
    public final synchronized ca50 a() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.c = true;
                notifyAll();
                ca50 ca50Var = null;
                if (z) {
                    ca50 ca50Var2 = this.b;
                    this.b = null;
                    ca50Var = ca50Var2;
                }
                if (ca50Var != null) {
                    ca50Var.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.d5f0
    public final synchronized void e(Object obj) {
    }

    @Override // defpackage.wa50
    public final synchronized boolean f(R r, Object obj, d5f0<R> d5f0Var, cqc cqcVar, boolean z) {
        this.d = true;
        this.a = r;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return n(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.d5f0
    public final void i(pv90 pv90Var) throws Throwable {
        pv90Var.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.c || this.d || this.e;
    }

    @Override // defpackage.d5f0
    public final synchronized void j(ca50 ca50Var) {
        this.b = ca50Var;
    }

    @Override // defpackage.wa50
    public final synchronized boolean l(xzk xzkVar, Object obj, d5f0<R> d5f0Var, boolean z) {
        this.e = true;
        this.f = xzkVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.d5f0
    public final synchronized void m(Drawable drawable) {
    }

    public final synchronized R n(Long l) {
        if (!isDone()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.c) {
            throw new CancellationException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (this.d) {
            return this.a;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (this.c) {
            throw new CancellationException();
        }
        if (this.d) {
            return this.a;
        }
        throw new TimeoutException();
    }

    public final String toString() {
        ca50 ca50Var;
        String str;
        String strA = uf80.a(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                ca50Var = null;
                if (this.c) {
                    str = PBBetHistoryItemDTO.STATUS_CANCELLED;
                } else if (this.e) {
                    str = "FAILURE";
                } else if (this.d) {
                    str = "SUCCESS";
                } else {
                    str = PBBetHistoryItemDTO.STATUS_PENDING;
                    ca50Var = this.b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ca50Var == null) {
            return tug.a(strA, str, "]");
        }
        return strA + str + ", request=[" + ca50Var + "]]";
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        try {
            return n(null);
        } catch (TimeoutException e) {
            jb5.a(e);
            return null;
        }
    }

    @Override // defpackage.gbs
    public final void b() {
    }

    @Override // defpackage.gbs
    public final void c() {
    }

    @Override // defpackage.gbs
    public final void onDestroy() {
    }

    @Override // defpackage.d5f0
    public final void d(pv90 pv90Var) {
    }

    @Override // defpackage.d5f0
    public final void g(Drawable drawable) {
    }

    @Override // defpackage.d5f0
    public final void h(Drawable drawable) {
    }
}
