package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class MediaView extends RelativeLayout {
    private ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@l Context context) {
        super(context);
        m0.p(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            m0.S("imageView");
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            m0.S("imageView");
            imageView3 = null;
        }
        imageView3.setAdjustViewBounds(true);
        ImageView imageView4 = this.imageView;
        if (imageView4 == null) {
            m0.S("imageView");
        } else {
            imageView2 = imageView4;
        }
        addView(imageView2);
        requestLayout();
    }

    public final void destroy() {
        ImageView imageView = null;
        try {
            ImageView imageView2 = this.imageView;
            if (imageView2 == null) {
                m0.S("imageView");
                imageView2 = null;
            }
            Drawable drawable = imageView2.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            Logger.Companion.w("NativeAd", "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            m0.S("imageView");
            imageView3 = null;
        }
        imageView3.setImageDrawable(null);
        ImageView imageView4 = this.imageView;
        if (imageView4 == null) {
            m0.S("imageView");
            imageView4 = null;
        }
        if (imageView4.getParent() != null) {
            ImageView imageView5 = this.imageView;
            if (imageView5 == null) {
                m0.S("imageView");
                imageView5 = null;
            }
            ViewParent parent = imageView5.getParent();
            m0.n(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            ImageView imageView6 = this.imageView;
            if (imageView6 == null) {
                m0.S("imageView");
            } else {
                imageView = imageView6;
            }
            viewGroup.removeView(imageView);
        }
    }

    @l
    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        m0.S("imageView");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@l Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
        m0.p(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m0.p(context, "context");
        initView(context);
    }
}
