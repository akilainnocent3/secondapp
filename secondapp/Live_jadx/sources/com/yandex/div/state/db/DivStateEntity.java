package com.yandex.div.state.db;

import f0.p;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStateEntity {

    @l
    private final String cardId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f76724id;
    private final long modificationTime;

    @l
    private final String path;

    @l
    private final String stateId;

    public DivStateEntity(int i10, @l String str, @l String str2, @l String str3, long j10) {
        this.f76724id = i10;
        this.cardId = str;
        this.path = str2;
        this.stateId = str3;
        this.modificationTime = j10;
    }

    public static /* synthetic */ DivStateEntity copy$default(DivStateEntity divStateEntity, int i10, String str, String str2, String str3, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = divStateEntity.f76724id;
        }
        if ((i11 & 2) != 0) {
            str = divStateEntity.cardId;
        }
        if ((i11 & 4) != 0) {
            str2 = divStateEntity.path;
        }
        if ((i11 & 8) != 0) {
            str3 = divStateEntity.stateId;
        }
        if ((i11 & 16) != 0) {
            j10 = divStateEntity.modificationTime;
        }
        long j11 = j10;
        return divStateEntity.copy(i10, str, str2, str3, j11);
    }

    public final int component1() {
        return this.f76724id;
    }

    @l
    public final String component2() {
        return this.cardId;
    }

    @l
    public final String component3() {
        return this.path;
    }

    @l
    public final String component4() {
        return this.stateId;
    }

    public final long component5() {
        return this.modificationTime;
    }

    @l
    public final DivStateEntity copy(int i10, @l String str, @l String str2, @l String str3, long j10) {
        return new DivStateEntity(i10, str, str2, str3, j10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivStateEntity)) {
            return false;
        }
        DivStateEntity divStateEntity = (DivStateEntity) obj;
        return this.f76724id == divStateEntity.f76724id && m0.g(this.cardId, divStateEntity.cardId) && m0.g(this.path, divStateEntity.path) && m0.g(this.stateId, divStateEntity.stateId) && this.modificationTime == divStateEntity.modificationTime;
    }

    @l
    public final String getCardId() {
        return this.cardId;
    }

    public final int getId() {
        return this.f76724id;
    }

    public final long getModificationTime() {
        return this.modificationTime;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    @l
    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        return (((((((this.f76724id * 31) + this.cardId.hashCode()) * 31) + this.path.hashCode()) * 31) + this.stateId.hashCode()) * 31) + p.a(this.modificationTime);
    }

    @l
    public String toString() {
        return "DivStateEntity(id=" + this.f76724id + ", cardId=" + this.cardId + ", path=" + this.path + ", stateId=" + this.stateId + ", modificationTime=" + this.modificationTime + ')';
    }
}
