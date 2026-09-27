package com.yandex.div.internal.widget.slider;

import dr.w2;
import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SliderView$animatorSecondaryListener$1 extends o0 implements l<Boolean, w2> {
    final /* synthetic */ SliderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderView$animatorSecondaryListener$1(SliderView sliderView) {
        super(1);
        this.this$0 = sliderView;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return w2.f79517a;
    }

    public final void invoke(boolean z10) {
        this.this$0.sliderSecondaryAnimator = null;
        if (z10) {
            return;
        }
        SliderView sliderView = this.this$0;
        sliderView.notifyThumbSecondaryChangedListeners(sliderView.prevThumbSecondaryValue, this.this$0.getThumbSecondaryValue());
    }
}
