package com.cleveradssolutions.internal.content.nativead;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f43449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f43450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f43451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TextView textView, ImageView imageView, k kVar, long j10) {
        super(j10, 1000L);
        this.f43449a = textView;
        this.f43450b = imageView;
        this.f43451c = kVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f43449a.setVisibility(8);
        this.f43450b.setVisibility(0);
        this.f43451c.f43455j = null;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
        this.f43449a.setText(String.valueOf(((int) (j10 / 1000)) + 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f43449a, "scaleX", 1.0f, 1.5f, 1.0f));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }
}
