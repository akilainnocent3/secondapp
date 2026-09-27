package com.yandex.div.core.view2.divs;

import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionBinder$prepareMenu$2$1 implements OverflowMenuSubscriber.Listener {
    final /* synthetic */ OverflowMenuWrapper $overflowMenuWrapper;

    public DivActionBinder$prepareMenu$2$1(OverflowMenuWrapper overflowMenuWrapper) {
        this.$overflowMenuWrapper = overflowMenuWrapper;
    }

    @Override // com.yandex.div.internal.widget.menu.OverflowMenuSubscriber.Listener
    public final void dismiss() {
        this.$overflowMenuWrapper.dismiss();
    }
}
