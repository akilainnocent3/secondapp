package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uh0 {
    public static final ThreadLocal<uh0> i = new ThreadLocal<>();
    public final d e;
    public c h;
    public final nj90<b, Long> a = new nj90<>();
    public final ArrayList<b> b = new ArrayList<>();
    public final a c = new a();
    public final th0 d = new th0(this);
    public boolean f = false;
    public float g = 1.0f;

    public class a {
        public a() {
        }
    }

    public interface b {
        boolean a(long j);
    }

    public class c {
        public vh0 a;

        public c() {
        }

        public final boolean a() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
            this.a = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    public static final class d {
        public final Choreographer a = Choreographer.getInstance();
        public final Looper b = Looper.myLooper();
    }

    public uh0(d dVar) {
        this.e = dVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, vh0] */
    public final void a(ckd0 ckd0Var) {
        ArrayList<b> arrayList = this.b;
        if (arrayList.size() == 0) {
            this.e.a.postFrameCallback(new wh0(this.d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                final c cVar = this.h;
                if (cVar == null) {
                    cVar = new c();
                    this.h = cVar;
                }
                if (cVar.a == null) {
                    ?? r4 = new ValueAnimator.DurationScaleChangeListener() { // from class: vh0
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            uh0.this.g = f;
                        }
                    };
                    cVar.a = r4;
                    ValueAnimator.registerDurationScaleChangeListener(r4);
                }
            }
        }
        if (arrayList.contains(ckd0Var)) {
            return;
        }
        arrayList.add(ckd0Var);
    }
}
