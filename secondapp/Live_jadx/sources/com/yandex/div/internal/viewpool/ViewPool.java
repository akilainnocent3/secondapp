package com.yandex.div.internal.viewpool;

import android.view.View;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface ViewPool {
    void changeCapacity(@l String str, int i10);

    @l
    <T extends View> T obtain(@l String str);

    <T extends View> void register(@l String str, @l ViewFactory<T> viewFactory, int i10);

    void unregister(@l String str);
}
