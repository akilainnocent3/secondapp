package yads;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t53 implements gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArgbEvaluator f155707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f155708c;

    public /* synthetic */ t53(int i10) {
        this(i10, new ArgbEvaluator());
    }

    @Override // yads.gf
    public final void a(View view) {
        TextView textView = (TextView) view;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f155707b, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f155706a));
        this.f155708c = valueAnimatorOfObject;
        s53 s53Var = new s53(textView);
        if (valueAnimatorOfObject != null) {
            valueAnimatorOfObject.addUpdateListener(s53Var);
        }
        ValueAnimator valueAnimator = this.f155708c;
        if (valueAnimator != null) {
            valueAnimator.setDuration(500);
        }
        ValueAnimator valueAnimator2 = this.f155708c;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // yads.gf
    public final void cancel() {
        ValueAnimator valueAnimator = this.f155708c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f155708c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public t53(int i10, ArgbEvaluator argbEvaluator) {
        this.f155706a = i10;
        this.f155707b = argbEvaluator;
    }
}
