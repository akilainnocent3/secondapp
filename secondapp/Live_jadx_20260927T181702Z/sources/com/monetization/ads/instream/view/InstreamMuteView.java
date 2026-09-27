package com.monetization.ads.instream.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import cs.k;
import k.f;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.sm3;
import yads.ux1;
import yads.xx1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class InstreamMuteView extends ImageView implements ux1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sm3 f71838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f71839b;

    @k
    public InstreamMuteView(@l Context context) {
        this(context, null, 0, 6, null);
    }

    private static sm3 a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalInstreamMuteView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_on, R.drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_off, R.drawable.monetization_ads_internal_ic_sound_off_default);
        int i10 = R.string.monetization_ads_internal_instream_muted;
        int i11 = R.string.monetization_ads_internal_instream_unmuted;
        typedArrayObtainStyledAttributes.recycle();
        return new sm3(new xx1(resourceId2, resourceId, i10, i11));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        Resources resources = getResources();
        setMeasuredDimension(resources.getDimensionPixelSize(R.dimen.monetization_instream_internal_mute_width_v2), resources.getDimensionPixelSize(R.dimen.monetization_instream_internal_mute_height_v2));
    }

    @Override // yads.ux1
    public void setMuted(boolean z10) {
        this.f71839b = z10;
        this.f71838a.a(this, z10);
    }

    @k
    public InstreamMuteView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ InstreamMuteView(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @k
    public InstreamMuteView(@l Context context, @m AttributeSet attributeSet, @f int i10) {
        super(context, attributeSet, i10);
        this.f71838a = a(context, attributeSet);
        a();
    }

    private final void a() {
        setMuted(this.f71839b);
    }
}
