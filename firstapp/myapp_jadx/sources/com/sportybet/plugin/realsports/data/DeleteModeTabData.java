package com.sportybet.plugin.realsports.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/plugin/realsports/data/DeleteModeTabData;", "", "index", "", "firstLaunchDelete", "", "<init>", "(IZ)V", "getIndex", "()I", "setIndex", "(I)V", "getFirstLaunchDelete", "()Z", "setFirstLaunchDelete", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "common", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DeleteModeTabData {
    public static final int $stable = 8;
    private boolean firstLaunchDelete;
    private int index;

    public /* synthetic */ DeleteModeTabData(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }

    public static /* synthetic */ DeleteModeTabData copy$default(DeleteModeTabData deleteModeTabData, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deleteModeTabData.index;
        }
        if ((i2 & 2) != 0) {
            z = deleteModeTabData.firstLaunchDelete;
        }
        return deleteModeTabData.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFirstLaunchDelete() {
        return this.firstLaunchDelete;
    }

    public final DeleteModeTabData copy(int index, boolean firstLaunchDelete) {
        return new DeleteModeTabData(index, firstLaunchDelete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteModeTabData)) {
            return false;
        }
        DeleteModeTabData deleteModeTabData = (DeleteModeTabData) other;
        return this.index == deleteModeTabData.index && this.firstLaunchDelete == deleteModeTabData.firstLaunchDelete;
    }

    public final boolean getFirstLaunchDelete() {
        return this.firstLaunchDelete;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Boolean.hashCode(this.firstLaunchDelete) + (Integer.hashCode(this.index) * 31);
    }

    public final void setFirstLaunchDelete(boolean z) {
        this.firstLaunchDelete = z;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public String toString() {
        return "DeleteModeTabData(index=" + this.index + ", firstLaunchDelete=" + this.firstLaunchDelete + ")";
    }

    public DeleteModeTabData(int i, boolean z) {
        this.index = i;
        this.firstLaunchDelete = z;
    }
}
