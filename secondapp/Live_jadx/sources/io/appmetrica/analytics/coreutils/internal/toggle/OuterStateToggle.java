package io.appmetrica.analytics.coreutils.internal.toggle;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class OuterStateToggle extends SimpleThreadSafeToggle {
    public OuterStateToggle(boolean z10, @l String str) {
        super(z10, str);
    }

    public final void update(boolean z10) {
        super.updateState(z10);
    }
}
