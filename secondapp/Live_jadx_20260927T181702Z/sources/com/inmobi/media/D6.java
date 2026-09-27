package com.inmobi.media;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class D6 {
    public static final void a(ProgressBar progressBar, Fg progressConfig, float f10) {
        kotlin.jvm.internal.m0.p(progressBar, "<this>");
        kotlin.jvm.internal.m0.p(progressConfig, "progressConfig");
        progressBar.setProgressTintList(ColorStateList.valueOf(AbstractC4155z3.a(progressConfig.f54633c)));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(AbstractC4155z3.a(progressConfig.f54634d)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (progressConfig.f54635e * f10));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
