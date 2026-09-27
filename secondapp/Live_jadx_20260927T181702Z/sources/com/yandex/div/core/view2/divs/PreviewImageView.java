package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import dr.o0;
import kotlin.jvm.internal.x;
import mq.dq;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class PreviewImageView extends AppCompatImageView {

    @oy.l
    public static final Companion Companion = new Companion(null);

    @oy.l
    private static final ImageView.ScaleType NO_SCALE = ImageView.ScaleType.CENTER;

    @oy.l
    private static final ImageView.ScaleType FIT = ImageView.ScaleType.FIT_CENTER;

    @oy.l
    private static final ImageView.ScaleType FILL = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dq.values().length];
            try {
                iArr[dq.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dq.NO_SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dq.FIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PreviewImageView(@oy.l Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        setVisibility(4);
    }

    private final Drawable tryScaleAccordingToDensity(Drawable drawable) {
        if (getScaleType() == NO_SCALE && (drawable instanceof BitmapDrawable)) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                bitmap.setDensity(160);
            }
            bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        }
        return drawable;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(@oy.m Bitmap bitmap) {
        if (getScaleType() == NO_SCALE && bitmap != null) {
            bitmap.setDensity(160);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@oy.m Drawable drawable) {
        super.setImageDrawable(drawable != null ? tryScaleAccordingToDensity(drawable) : null);
    }

    public final void setScale(@oy.l dq dqVar) {
        ImageView.ScaleType scaleType;
        int i10 = WhenMappings.$EnumSwitchMapping$0[dqVar.ordinal()];
        if (i10 == 1) {
            scaleType = FILL;
        } else if (i10 == 2) {
            scaleType = NO_SCALE;
        } else {
            if (i10 != 3) {
                throw new o0();
            }
            scaleType = FIT;
        }
        setScaleType(scaleType);
    }
}
