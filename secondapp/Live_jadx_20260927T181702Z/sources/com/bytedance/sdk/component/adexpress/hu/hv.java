package com.bytedance.sdk.component.adexpress.hu;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv extends FrameLayout {
    private ImageView hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private AnimatorSet f34303tq;

    public hv(Context context) {
        super(context);
        sd();
        vy();
    }

    private void sd() {
        ImageView imageView = new ImageView(getContext());
        this.hww = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.kub.vy(getContext(), "tt_white_hand"));
        int iHww = (int) com.bytedance.sdk.component.adexpress.vy.vgm.hww(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iHww, iHww);
        layoutParams.gravity = 17;
        addView(this.hww, layoutParams);
    }

    private void vy() {
        this.f34303tq = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.hww, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.hww, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f34303tq.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void hww() {
        AnimatorSet animatorSet = this.f34303tq;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void tq() {
        AnimatorSet animatorSet = this.f34303tq;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
