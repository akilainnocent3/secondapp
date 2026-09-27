package com.yandex.div.core.util.mask;

import dr.w2;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class FixedLengthInputMask extends BaseInputMask {

    @l
    private final ds.l<Exception, w2> onError;

    /* JADX WARN: Multi-variable type inference failed */
    public FixedLengthInputMask(@l BaseInputMask.MaskData maskData, @l ds.l<? super Exception, w2> lVar) {
        super(maskData);
        this.onError = lVar;
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@l Exception exc) {
        this.onError.invoke(exc);
    }
}
