package com.unity3d.services.core.device;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class StorageEventInfo {

    @l
    private final StorageEvent eventType;

    @l
    private final StorageManager.StorageType storageType;

    @m
    private final Object value;

    public StorageEventInfo(@l StorageEvent eventType, @l StorageManager.StorageType storageType, @m Object obj) {
        m0.p(eventType, "eventType");
        m0.p(storageType, "storageType");
        this.eventType = eventType;
        this.storageType = storageType;
        this.value = obj;
    }

    public static /* synthetic */ StorageEventInfo copy$default(StorageEventInfo storageEventInfo, StorageEvent storageEvent, StorageManager.StorageType storageType, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            storageEvent = storageEventInfo.eventType;
        }
        if ((i10 & 2) != 0) {
            storageType = storageEventInfo.storageType;
        }
        if ((i10 & 4) != 0) {
            obj = storageEventInfo.value;
        }
        return storageEventInfo.copy(storageEvent, storageType, obj);
    }

    @l
    public final StorageEvent component1() {
        return this.eventType;
    }

    @l
    public final StorageManager.StorageType component2() {
        return this.storageType;
    }

    @m
    public final Object component3() {
        return this.value;
    }

    @l
    public final StorageEventInfo copy(@l StorageEvent eventType, @l StorageManager.StorageType storageType, @m Object obj) {
        m0.p(eventType, "eventType");
        m0.p(storageType, "storageType");
        return new StorageEventInfo(eventType, storageType, obj);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageEventInfo)) {
            return false;
        }
        StorageEventInfo storageEventInfo = (StorageEventInfo) obj;
        return this.eventType == storageEventInfo.eventType && this.storageType == storageEventInfo.storageType && m0.g(this.value, storageEventInfo.value);
    }

    @l
    public final StorageEvent getEventType() {
        return this.eventType;
    }

    @l
    public final StorageManager.StorageType getStorageType() {
        return this.storageType;
    }

    @m
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.eventType.hashCode() * 31) + this.storageType.hashCode()) * 31;
        Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @l
    public String toString() {
        return "StorageEventInfo(eventType=" + this.eventType + ", storageType=" + this.storageType + ", value=" + this.value + ')';
    }
}
