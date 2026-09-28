package defpackage;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class il40 {
    public final RecyclerView a;
    public final View b;
    public final View c;
    public final AnimationSet d;
    public final AnimationSet e;
    public final gl40 f;

    /* JADX WARN: Type inference failed for: r5v3, types: [gl40] */
    public il40(RecyclerView recyclerView, View view, View view2) {
        this.a = recyclerView;
        this.b = view;
        this.c = view2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(true);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        this.d = animationSet;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setFillAfter(true);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(alphaAnimation2);
        this.e = animationSet2;
        this.f = new Runnable() { // from class: gl40
            @Override // java.lang.Runnable
            public final void run() {
                il40 il40Var = this.a;
                View view3 = il40Var.b;
                AnimationSet animationSet3 = il40Var.d;
                RecyclerView recyclerView2 = il40Var.a;
                boolean zCanScrollVertically = recyclerView2.canScrollVertically(1);
                if (animationSet3 != null) {
                    view3.setVisibility(zCanScrollVertically ? 0 : 8);
                    if (zCanScrollVertically) {
                        animationSet3.reset();
                        view3.clearAnimation();
                        view3.startAnimation(animationSet3);
                    }
                }
                View view4 = il40Var.c;
                AnimationSet animationSet4 = il40Var.e;
                boolean zCanScrollVertically2 = recyclerView2.canScrollVertically(-1);
                if (animationSet4 == null) {
                    return;
                }
                view4.setVisibility(zCanScrollVertically2 ? 0 : 8);
                if (zCanScrollVertically2) {
                    animationSet4.reset();
                    view4.clearAnimation();
                    view4.startAnimation(animationSet4);
                }
            }
        };
    }

    public final void a() {
        this.a.removeCallbacks(this.f);
        AnimationSet animationSet = this.d;
        if (animationSet != null) {
            animationSet.reset();
        }
        View view = this.b;
        view.clearAnimation();
        view.setVisibility(8);
        AnimationSet animationSet2 = this.e;
        if (animationSet2 != null) {
            animationSet2.reset();
        }
        View view2 = this.c;
        view2.clearAnimation();
        view2.setVisibility(8);
    }
}
