package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cbv<V extends View> {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final V b;
    public final int c;
    public final int d;
    public final int e;
    public sr1 f;

    public cbv(V v) {
        this.b = v;
        Context context = v.getContext();
        this.c = bbv.c(context, R.attr.motionDurationMedium2, 300);
        this.d = bbv.c(context, R.attr.motionDurationShort3, 150);
        this.e = bbv.c(context, R.attr.motionDurationShort2, 100);
    }

    public final sr1 a() {
        if (this.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        sr1 sr1Var = this.f;
        this.f = null;
        return sr1Var;
    }
}
