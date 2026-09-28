package com.sportygames.commons.models;

import com.sportygames.commons.models.enums.PagingFetchType;
import defpackage.dy5;
import defpackage.gpp;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sportygames/commons/models/PagingState;", "", "offset", "", "limit", "type", "Lcom/sportygames/commons/models/enums/PagingFetchType;", "<init>", "(IILcom/sportygames/commons/models/enums/PagingFetchType;)V", "getOffset", "()I", "getLimit", "getType", "()Lcom/sportygames/commons/models/enums/PagingFetchType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PagingState {
    public static final int $stable = 0;
    private final int limit;
    private final int offset;
    private final PagingFetchType type;

    public PagingState(int i, int i2, PagingFetchType pagingFetchType) {
        pagingFetchType.getClass();
        this.offset = i;
        this.limit = i2;
        this.type = pagingFetchType;
    }

    public static /* synthetic */ PagingState copy$default(PagingState pagingState, int i, int i2, PagingFetchType pagingFetchType, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = pagingState.offset;
        }
        if ((i3 & 2) != 0) {
            i2 = pagingState.limit;
        }
        if ((i3 & 4) != 0) {
            pagingFetchType = pagingState.type;
        }
        return pagingState.copy(i, i2, pagingFetchType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PagingFetchType getType() {
        return this.type;
    }

    public final PagingState copy(int offset, int limit, PagingFetchType type) {
        type.getClass();
        return new PagingState(offset, limit, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagingState)) {
            return false;
        }
        PagingState pagingState = (PagingState) other;
        return this.offset == pagingState.offset && this.limit == pagingState.limit && this.type == pagingState.type;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final PagingFetchType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + gpp.a(this.limit, Integer.hashCode(this.offset) * 31, 31);
    }

    public String toString() {
        int i = this.offset;
        int i2 = this.limit;
        PagingFetchType pagingFetchType = this.type;
        StringBuilder sbA = dy5.a("PagingState(offset=", i, i2, ", limit=", ", type=");
        sbA.append(pagingFetchType);
        sbA.append(")");
        return sbA.toString();
    }
}
