package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import com.yandex.div.internal.drawable.ScalingDrawable;
import dr.w2;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2 extends o0 implements ds.l<Bitmap, w2> {
    final /* synthetic */ ScalingDrawable $scaleDrawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2(ScalingDrawable scalingDrawable) {
        super(1);
        this.$scaleDrawable = scalingDrawable;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l Bitmap bitmap) {
        this.$scaleDrawable.setBitmap(bitmap);
    }
}
