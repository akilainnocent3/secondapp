package com.inmobi.media;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4075vn {
    public static final void a(ProgressBar progressBar, int i10) {
        kotlin.jvm.internal.m0.p(progressBar, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            progressBar.setProgress(i10, true);
        } else {
            progressBar.setProgress(i10);
        }
    }

    public static final boolean b(View view, ViewGroup parentView) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(parentView, "parentView");
        if (view.isAttachedToWindow()) {
            return a(view, parentView);
        }
        return false;
    }

    public static final boolean a(View view, ViewGroup parentView) {
        kotlin.jvm.internal.m0.p(view, "view");
        kotlin.jvm.internal.m0.p(parentView, "parentView");
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (kotlin.jvm.internal.m0.g(parent, parentView)) {
                return true;
            }
            parent = parent instanceof ViewGroup ? ((ViewGroup) parent).getParent() : null;
        }
        return false;
    }

    public static final void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
