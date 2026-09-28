package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class vcl extends wcl {
    public final Handler b;
    public final String c;
    public final boolean d;
    public final vcl e;

    public vcl(Handler handler, String str, boolean z) {
        this.b = handler;
        this.c = str;
        this.d = z;
        this.e = z ? this : new vcl(handler, str, true);
    }

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.b.post(runnable)) {
            return;
        }
        l0(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vcl)) {
            return false;
        }
        vcl vclVar = (vcl) obj;
        return vclVar.b == this.b && vclVar.d == this.d;
    }

    @Override // defpackage.k5b
    public final boolean f0(CoroutineContext coroutineContext) {
        return (this.d && Intrinsics.g(Looper.myLooper(), this.b.getLooper())) ? false : true;
    }

    @Override // defpackage.wcl
    public final vcl h0() {
        return this.e;
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ System.identityHashCode(this.b);
    }

    @Override // defpackage.ekd
    public final void l(long j, final bc6 bc6Var) {
        Runnable runnable = new Runnable() { // from class: tcl
            @Override // java.lang.Runnable
            public final void run() {
                bc6Var.D(this, Unit.a);
            }
        };
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.b.postDelayed(runnable, j)) {
            bc6Var.t(new ucl(0, this, runnable));
        } else {
            l0(bc6Var.e, runnable);
        }
    }

    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        i9p.b(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        pfd pfdVar = fse.a;
        odd.b.d0(coroutineContext, runnable);
    }

    @Override // defpackage.wcl, defpackage.ekd
    public final wse m(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.b.postDelayed(runnable, j)) {
            return new wse() { // from class: scl
                @Override // defpackage.wse
                public final void dispose() {
                    this.a.b.removeCallbacks(runnable);
                }
            };
        }
        l0(coroutineContext, runnable);
        return lxx.a;
    }

    @Override // defpackage.wcl, defpackage.k5b
    public final String toString() {
        vcl vclVarH0;
        String string;
        pfd pfdVar = fse.a;
        wcl wclVar = gku.a;
        if (this == wclVar) {
            string = "Dispatchers.Main";
        } else {
            try {
                vclVarH0 = wclVar.h0();
            } catch (UnsupportedOperationException unused) {
                vclVarH0 = null;
            }
            string = this == vclVarH0 ? "Dispatchers.Main.immediate" : null;
        }
        if (string == null) {
            string = this.c;
            if (string == null) {
                string = this.b.toString();
            }
            if (this.d) {
                return yk10.a(string, ".immediate");
            }
        }
        return string;
    }

    public vcl(Handler handler) {
        this(handler, null, false);
    }
}
