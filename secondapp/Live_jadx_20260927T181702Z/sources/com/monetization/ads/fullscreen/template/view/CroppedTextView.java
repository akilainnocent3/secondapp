package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import cs.k;
import is.d;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class CroppedTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f71831a;

    @SuppressLint({"CustomViewStyleable"})
    @k
    public CroppedTextView(@l Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int lineHeight = getLineHeight();
        if (lineHeight > 0) {
            int iMin = Math.min((getMeasuredHeight() + d.L0(getLineHeight() * 0.05f)) / lineHeight, this.f71831a);
            if (iMin == getMinLines() && iMin == getMaxLines()) {
                return;
            }
            setLines(iMin);
            TextUtils.TruncateAt ellipsize = getEllipsize();
            setEllipsize(null);
            setEllipsize(ellipsize);
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public CroppedTextView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CroppedTextView(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @SuppressLint({"CustomViewStyleable"})
    @k
    public CroppedTextView(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f71831a = getMaxLines();
    }
}
