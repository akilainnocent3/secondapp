package defpackage;

import android.animation.ObjectAnimator;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class m6g implements ess {
    public final String a;
    public msr b;
    public ObjectAnimator c;

    public m6g(msr msrVar, String str) {
        this.a = str;
        this.b = msrVar;
    }

    @Override // defpackage.ess
    public final void execute() {
        msr msrVar = this.b;
        if (msrVar == null) {
            return;
        }
        msrVar.I.setText(this.a);
        sn5.f(msrVar.K, R.string.simulate_game__full_time, new Object[0]);
        ObjectAnimator duration = ObjectAnimator.ofFloat(msrVar.e, "alpha", 0.0f, 1.0f).setDuration(1000L);
        this.c = duration;
        if (duration != null) {
            duration.start();
        }
    }

    @Override // defpackage.ess
    public final void release() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.b = null;
    }
}
