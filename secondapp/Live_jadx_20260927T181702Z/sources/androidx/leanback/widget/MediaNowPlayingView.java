package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public class MediaNowPlayingView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f12093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f12094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f12095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ObjectAnimator f12096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ObjectAnimator f12097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ObjectAnimator f12098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearInterpolator f12099h;

    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f12099h = linearInterpolator;
        LayoutInflater.from(context).inflate(s3.a.j.Q, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(s3.a.h.f128731k);
        this.f12093b = imageView;
        ImageView imageView2 = (ImageView) findViewById(s3.a.h.f128735l);
        this.f12094c = imageView2;
        ImageView imageView3 = (ImageView) findViewById(s3.a.h.f128739m);
        this.f12095d = imageView3;
        imageView.setPivotY(imageView.getDrawable().getIntrinsicHeight());
        imageView2.setPivotY(imageView2.getDrawable().getIntrinsicHeight());
        imageView3.setPivotY(imageView3.getDrawable().getIntrinsicHeight());
        setDropScale(imageView);
        setDropScale(imageView2);
        setDropScale(imageView3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f);
        this.f12096e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(2320L);
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, "scaleY", 1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f);
        this.f12097f = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setDuration(2080L);
        objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView3, "scaleY", 0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f);
        this.f12098g = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setRepeatCount(-1);
        objectAnimatorOfFloat3.setDuration(2000L);
        objectAnimatorOfFloat3.setInterpolator(linearInterpolator);
    }

    public static void setDropScale(View view) {
        view.setScaleY(0.083333336f);
    }

    public final void a() {
        b(this.f12096e);
        b(this.f12097f);
        b(this.f12098g);
        this.f12093b.setVisibility(0);
        this.f12094c.setVisibility(0);
        this.f12095d.setVisibility(0);
    }

    public final void b(Animator animator) {
        if (animator.isStarted()) {
            return;
        }
        animator.start();
    }

    public final void c() {
        d(this.f12096e, this.f12093b);
        d(this.f12097f, this.f12094c);
        d(this.f12098g, this.f12095d);
        this.f12093b.setVisibility(8);
        this.f12094c.setVisibility(8);
        this.f12095d.setVisibility(8);
    }

    public final void d(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            setDropScale(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            c();
        } else {
            a();
        }
    }
}
