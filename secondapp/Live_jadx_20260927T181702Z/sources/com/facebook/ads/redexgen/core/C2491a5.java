package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2491a5 extends LinearLayout {
    public final Bitmap A00;

    public C2491a5(C2900gi c2900gi, EnumC2508aM enumC2508aM) {
        super(c2900gi);
        this.A00 = YN.A01(YM.AD_CHOICE_ICON);
        c2900gi.A0F().AAz(enumC2508aM.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c2900gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(XV.A0I, XV.A0I, XV.A0I, XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        YB.A0N(this, -859190839);
        YB.A0E(XV.A0C, this);
    }

    private void setAdChoiceIcon(C2900gi c2900gi) {
        ImageView imageView = new ImageView(c2900gi);
        YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, XV.A0U));
        addView(imageView);
    }
}
