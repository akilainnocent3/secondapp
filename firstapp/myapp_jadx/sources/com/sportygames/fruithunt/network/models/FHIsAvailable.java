package com.sportygames.fruithunt.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/sportygames/fruithunt/network/models/FHIsAvailable;", "", "isAvailable", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/sportygames/fruithunt/network/models/FHIsAvailable;", "equals", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FHIsAvailable {
    public static final int $stable = 0;
    private final Boolean isAvailable;

    public FHIsAvailable(Boolean bool) {
        this.isAvailable = bool;
    }

    public static /* synthetic */ FHIsAvailable copy$default(FHIsAvailable fHIsAvailable, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = fHIsAvailable.isAvailable;
        }
        return fHIsAvailable.copy(bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final FHIsAvailable copy(Boolean isAvailable) {
        return new FHIsAvailable(isAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FHIsAvailable) && Intrinsics.g(this.isAvailable, ((FHIsAvailable) other).isAvailable);
    }

    public int hashCode() {
        Boolean bool = this.isAvailable;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        return "FHIsAvailable(isAvailable=" + this.isAvailable + ")";
    }
}
