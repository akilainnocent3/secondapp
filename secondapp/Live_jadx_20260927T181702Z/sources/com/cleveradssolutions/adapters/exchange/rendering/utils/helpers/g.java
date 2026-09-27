package com.cleveradssolutions.adapters.exchange.rendering.utils.helpers;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42529a = "zv";

    public static a a(Context context) {
        WindowInsets windowInsetsC = c(context);
        if (windowInsetsC == null) {
            return new a(0, 0, 0, 0);
        }
        if (Build.VERSION.SDK_INT < 30) {
            return new a(windowInsetsC.getStableInsetTop(), windowInsetsC.getStableInsetRight(), windowInsetsC.getStableInsetBottom(), windowInsetsC.getStableInsetLeft());
        }
        Insets insets = windowInsetsC.getInsets(WindowInsets.Type.navigationBars());
        return new a(insets.top, insets.right, insets.bottom, insets.left);
    }

    public static void b(View view) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(16, 16, 16, 16);
                view.setLayoutParams(layoutParams2);
            } else {
                if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                    com.cleveradssolutions.adapters.exchange.b.h(f42529a, "Can't reset margins.");
                    return;
                }
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams3.setMargins(16, 16, 16, 16);
                view.setLayoutParams(layoutParams3);
            }
        }
    }

    public static WindowInsets c(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().getRootWindowInsets();
        }
        com.cleveradssolutions.adapters.exchange.b.h(f42529a, "Can't get window insets, Context is not Activity type.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    public static a d(Context context) {
        int i10;
        DisplayCutout displayCutout;
        Display defaultDisplay;
        if (context != null && (i10 = Build.VERSION.SDK_INT) >= 28) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (i10 >= 30) {
                    defaultDisplay = activity.getDisplay();
                } else {
                    if (i10 >= 29) {
                        defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                    } else {
                        WindowInsets windowInsetsC = c(activity);
                        displayCutout = windowInsetsC != null ? windowInsetsC.getDisplayCutout() : null;
                    }
                    if (displayCutout != null) {
                        return new a(displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom(), displayCutout.getSafeInsetLeft());
                    }
                }
                displayCutout = defaultDisplay.getCutout();
                if (displayCutout != null) {
                    return new a(displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom(), displayCutout.getSafeInsetLeft());
                }
            } else {
                com.cleveradssolutions.adapters.exchange.b.h(f42529a, "Can't get window insets, Context is not Activity type.");
            }
        }
        return new a(0, 0, 0, 0);
    }

    public static void f(View view, Context context) {
        RelativeLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        a aVarA = a(context);
        a aVarD = d(context);
        a aVar = new a(aVarA.c() + aVarD.c(), aVarA.b() + aVarD.b(), aVarA.d() + aVarD.d(), aVarA.a() + aVarD.a());
        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            int i10 = layoutParams4.gravity;
            if ((i10 & 48) == 48) {
                layoutParams4.topMargin += aVar.c();
            }
            if ((i10 & 80) == 80) {
                layoutParams4.bottomMargin += aVar.d();
            }
            if ((i10 & 5) == 5) {
                layoutParams4.rightMargin += aVar.b();
            }
            layoutParams2 = layoutParams4;
            if ((i10 & 3) == 3) {
                layoutParams4.leftMargin += aVar.a();
                layoutParams2 = layoutParams4;
            }
        } else {
            if (!(layoutParams3 instanceof RelativeLayout.LayoutParams)) {
                com.cleveradssolutions.adapters.exchange.b.a(f42529a, "Can't set insets, unsupported LayoutParams type.");
                return;
            }
            layoutParams = (RelativeLayout.LayoutParams) layoutParams3;
            if (layoutParams.getRule(10) == -1) {
                layoutParams.topMargin += aVar.c();
            }
            if (layoutParams.getRule(12) == -1) {
                layoutParams.bottomMargin += aVar.d();
            }
            if (layoutParams.getRule(11) == -1 || layoutParams.getRule(21) == -1) {
                layoutParams.rightMargin += aVar.b();
            }
            if (layoutParams.getRule(9) == -1 || layoutParams.getRule(20) == -1) {
                layoutParams2 = layoutParams;
                layoutParams.leftMargin += aVar.a();
                layoutParams2 = layoutParams;
            }
        }
        layoutParams2 = layoutParams;
        view.setLayoutParams(layoutParams2);
    }

    public static void e(View view) {
    }
}
