package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ComplexRebindReporter extends ForceRebindReporter {
    void onComplexRebindFatalNoState();

    void onComplexRebindNoDivInState();

    void onComplexRebindNoExistingParent();

    void onComplexRebindNothingToBind();

    void onComplexRebindSuccess();

    void onComplexRebindUnsupportedElementException(@l RebindTask.UnsupportedElementException unsupportedElementException);
}
