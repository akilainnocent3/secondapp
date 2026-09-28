package defpackage;

import android.app.Activity;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class ix20 implements ibs {
    public static final ix20 w = new ix20();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final kbs f = new kbs(this, true);
    public final hx20 i = new Runnable() { // from class: hx20
        @Override // java.lang.Runnable
        public final void run() {
            ix20 ix20Var = this.a;
            kbs kbsVar = ix20Var.f;
            if (ix20Var.b == 0) {
                ix20Var.c = true;
                kbsVar.g(s9s.a.ON_PAUSE);
            }
            if (ix20Var.a == 0 && ix20Var.c) {
                kbsVar.g(s9s.a.ON_STOP);
                ix20Var.d = true;
            }
        }
    };
    public final b v = new b();

    public static final class a {
        public static final void a(Activity activity, jx20.a aVar) {
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(aVar);
        }
    }

    public static final class b {
        public b() {
        }
    }

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.g(s9s.a.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.i);
            }
        }
    }

    @Override // defpackage.ibs
    public final s9s getLifecycle() {
        return this.f;
    }
}
