package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface StorageManager {
    void addStorageLocation(@l com.unity3d.services.core.device.StorageManager.StorageType storageType, @l String str);

    @l
    Storage getStorage(@l com.unity3d.services.core.device.StorageManager.StorageType storageType);

    void hasInitialized();

    boolean hasStorage(@l com.unity3d.services.core.device.StorageManager.StorageType storageType);

    boolean init(@l Context context);

    void initStorage(@l com.unity3d.services.core.device.StorageManager.StorageType storageType);

    void removeStorage(@l com.unity3d.services.core.device.StorageManager.StorageType storageType);
}
