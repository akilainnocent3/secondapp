package com.yandex.div.internal.widget;

import android.os.Build;
import android.widget.TextView;
import com.yandex.div.core.annotations.InternalApi;
import k.j;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TextViewsKt {
    @j(api = 26)
    public static final boolean checkHyphenationSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final float getFontHeight(@l TextView textView) {
        return textView.getPaint().getFontMetrics(null);
    }

    public static final int getFontHeightInt(@l TextView textView) {
        return textView.getPaint().getFontMetricsInt(null);
    }

    public static final boolean isHyphenationEnabled(@l TextView textView) {
        return checkHyphenationSupported() && textView.getHyphenationFrequency() != 0;
    }

    public static final int lineAt(@l TextView textView, int i10) {
        if (textView.getLayout() == null) {
            return 0;
        }
        return textView.getLayout().getLineForVertical(i10);
    }

    @InternalApi
    public static final int textHeight(@l TextView textView, int i10) {
        if (textView.getLayout() == null) {
            return 0;
        }
        if (i10 <= 0) {
            return textView.getLayout().getHeight();
        }
        return i10 > textView.getLayout().getLineCount() ? textView.getLayout().getHeight() : textView.getLayout().getLineTop(i10) - textView.getLayout().getLineTop(0);
    }

    public static /* synthetic */ int textHeight$default(TextView textView, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return textHeight(textView, i10);
    }
}
