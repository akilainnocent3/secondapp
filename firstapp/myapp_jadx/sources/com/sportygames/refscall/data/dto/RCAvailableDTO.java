package com.sportygames.refscall.data.dto;

import defpackage.ruw;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/sportygames/refscall/data/dto/RCAvailableDTO;", "", "isAvailable", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "game-refscall_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RCAvailableDTO {
    public static final int $stable = 0;
    private final boolean isAvailable;

    public RCAvailableDTO(boolean z) {
        this.isAvailable = z;
    }

    public static /* synthetic */ RCAvailableDTO copy$default(RCAvailableDTO rCAvailableDTO, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rCAvailableDTO.isAvailable;
        }
        return rCAvailableDTO.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final RCAvailableDTO copy(boolean isAvailable) {
        return new RCAvailableDTO(isAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RCAvailableDTO) && this.isAvailable == ((RCAvailableDTO) other).isAvailable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAvailable);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public String toString() {
        return ruw.a(new StringBuilder("RCAvailableDTO(isAvailable="), this.isAvailable, ')');
    }
}
