package com.yandex.div.core.view2;

import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import dr.w2;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPlaceholderLoader$enqueueDecoding$future$1 extends o0 implements ds.l<ImageRepresentation, w2> {
    final /* synthetic */ LoadableImage $loadableImage;
    final /* synthetic */ ds.l<ImageRepresentation, w2> $onDecoded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DivPlaceholderLoader$enqueueDecoding$future$1(ds.l<? super ImageRepresentation, w2> lVar, LoadableImage loadableImage) {
        super(1);
        this.$onDecoded = lVar;
        this.$loadableImage = loadableImage;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(ImageRepresentation imageRepresentation) {
        invoke2(imageRepresentation);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.m ImageRepresentation imageRepresentation) {
        this.$onDecoded.invoke(imageRepresentation);
        this.$loadableImage.cleanLoadingTask();
    }
}
