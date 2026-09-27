package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class nk3 {
    public static final void a(final View view) {
        ViewParent parent = view.getParent();
        final ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        if (kotlin.jvm.internal.m0.g(Looper.myLooper(), Looper.getMainLooper())) {
            viewGroup.removeView(view);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yads.v64
                @Override // java.lang.Runnable
                public final void run() {
                    nk3.a(viewGroup, view);
                }
            });
        }
    }

    public static final void a(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }
}
