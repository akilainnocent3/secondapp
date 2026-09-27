package yads;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d02 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f147980c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile d02 f147981d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f147982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f147983b;

    public d02(Handler handler) {
        this.f147982a = handler;
    }

    public final void a(final View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f147983b) {
                view.setAlpha(view.getAlpha() / 2);
                this.f147983b = true;
            }
            this.f147982a.postDelayed(new Runnable() { // from class: yads.jz3
                @Override // java.lang.Runnable
                public final void run() {
                    d02.a(this.f151327b, view);
                }
            }, 100L);
        }
    }

    public static final void a(d02 d02Var, View view) {
        if (d02Var.f147983b) {
            view.setAlpha(view.getAlpha() * 2);
            d02Var.f147983b = false;
        }
    }
}
