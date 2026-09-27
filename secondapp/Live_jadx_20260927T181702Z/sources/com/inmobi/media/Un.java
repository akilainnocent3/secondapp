package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Un {
    public static final boolean a(View adView, C4157z5 minDimension) {
        kotlin.jvm.internal.m0.p(adView, "adView");
        kotlin.jvm.internal.m0.p(minDimension, "minDimension");
        if (adView.getVisibility() == 0 && adView.getParent() != null && adView.isShown() && adView.getWidth() >= minDimension.f58244a && adView.getHeight() >= minDimension.f58245b) {
            if (adView.getHeight() * adView.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(View adView, Rect adViewRect, int i10, C4157z5 minDimension) {
        kotlin.jvm.internal.m0.p(adView, "adView");
        kotlin.jvm.internal.m0.p(adViewRect, "adViewRect");
        kotlin.jvm.internal.m0.p(minDimension, "minDimension");
        if (a(adView, minDimension)) {
            return ((long) 100) * (((long) adViewRect.height()) * ((long) adViewRect.width())) >= ((long) (i10 * (adView.getHeight() * adView.getWidth())));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    public static final boolean a(View adView, Rect adViewRect, int i10, List friendlyViews) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.m0.p(adView, "adView");
        kotlin.jvm.internal.m0.p(adViewRect, "adViewRect");
        kotlin.jvm.internal.m0.p(friendlyViews, "friendlyViews");
        float height = (i10 / 100.0f) * adView.getHeight() * adView.getWidth();
        View view = adView;
        while (view.getParent() instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            kotlin.jvm.internal.m0.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            Iterable iterableW1 = ms.u.W1(viewGroup.indexOfChild(view) + 1, viewGroup.getChildCount());
            if (!(iterableW1 instanceof Collection) || !((Collection) iterableW1).isEmpty()) {
                Iterator it = iterableW1.iterator();
                while (it.hasNext()) {
                    View childAt = viewGroup.getChildAt(((fr.f1) it).nextInt());
                    if (childAt.getVisibility() == 0) {
                        kotlin.jvm.internal.m0.m(childAt);
                        if (friendlyViews.contains(childAt)) {
                            continue;
                        } else {
                            Rect rect = new Rect();
                            childAt.getGlobalVisibleRect(rect);
                            Rect rect2 = new Rect();
                            boolean intersect = rect2.setIntersect(adViewRect, rect);
                            kotlin.jvm.internal.m0.p(adViewRect, "<this>");
                            int i11 = (adViewRect.bottom - adViewRect.top) * (adViewRect.right - adViewRect.left);
                            kotlin.jvm.internal.m0.p(rect2, "<this>");
                            int i12 = i11 - ((rect2.bottom - rect2.top) * (rect2.right - rect2.left));
                            if (intersect && i12 < height) {
                                kotlin.jvm.internal.m0.p(childAt, "<this>");
                                if (childAt.getAlpha() > 0.3f) {
                                    if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                        if (childAt.getBackground() instanceof ColorDrawable) {
                                            Drawable background = childAt.getBackground();
                                            kotlin.jvm.internal.m0.n(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            if (((ColorDrawable) background).getColor() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                        } else if (childAt.getBackground() == null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (childAt.getForeground() instanceof ColorDrawable) {
                                            Drawable foreground = childAt.getForeground();
                                            kotlin.jvm.internal.m0.n(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            if (((ColorDrawable) foreground).getColor() == 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                        } else if (childAt.getForeground() == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (!z10 || !z11) {
                                        }
                                    }
                                    return false;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            view = viewGroup;
        }
        return true;
    }
}
