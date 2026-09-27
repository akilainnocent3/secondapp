package com.yandex.div.core.util;

import android.view.View;
import dr.w2;
import ds.a;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SingleTimeOnAttachCallback {

    @m
    private a<w2> onAttachAction;

    public SingleTimeOnAttachCallback(@l View view, @m a<w2> aVar) {
        this.onAttachAction = aVar;
        if (view.isAttachedToWindow()) {
            onAttach();
        }
    }

    public final void cancel() {
        this.onAttachAction = null;
    }

    public final void onAttach() {
        a<w2> aVar = this.onAttachAction;
        if (aVar != null) {
            aVar.invoke();
        }
        this.onAttachAction = null;
    }
}
