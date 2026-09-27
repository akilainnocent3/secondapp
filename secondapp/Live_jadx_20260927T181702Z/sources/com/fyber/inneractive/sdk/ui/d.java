package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f47828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f47829b;

    public d(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.f47829b = fyberAdIdentifierLocal;
        this.f47828a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f47829b;
        if (fyberAdIdentifierLocal.f47801o) {
            fyberAdIdentifierLocal.f47799m.setImageResource(R.drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f47829b;
            FyberAdIdentifierLocal.a(fyberAdIdentifierLocal2.f47799m, fyberAdIdentifierLocal2.f47817g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.f47804r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.f47799m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.f47799m.setImageResource(R.drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.a(this.f47829b.f47799m, null);
        }
        this.f47828a.start();
        this.f47829b.f47802p = this.f47828a;
    }
}
