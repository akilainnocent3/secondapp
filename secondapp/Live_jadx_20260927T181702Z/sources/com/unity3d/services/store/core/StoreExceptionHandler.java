package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface StoreExceptionHandler {
    void handleStoreException(@l StoreEvent storeEvent, int i10, @l Exception exc);
}
