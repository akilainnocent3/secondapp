package com.sportybet.feature.luckynumber.placebet.data.data;

import defpackage.pe4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0011Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNSelectionRefDTO;", "", "selectionIndex", "", "<init>", "(I)V", "getSelectionIndex", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNSelectionRefDTO {
    public static final int $stable = 0;
    private final int selectionIndex;

    public LNSelectionRefDTO(int i) {
        this.selectionIndex = i;
    }

    public static /* synthetic */ LNSelectionRefDTO copy$default(LNSelectionRefDTO lNSelectionRefDTO, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = lNSelectionRefDTO.selectionIndex;
        }
        return lNSelectionRefDTO.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSelectionIndex() {
        return this.selectionIndex;
    }

    public final LNSelectionRefDTO copy(int selectionIndex) {
        return new LNSelectionRefDTO(selectionIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LNSelectionRefDTO) && this.selectionIndex == ((LNSelectionRefDTO) other).selectionIndex;
    }

    public final int getSelectionIndex() {
        return this.selectionIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.selectionIndex);
    }

    public String toString() {
        return pe4.b(this.selectionIndex, "LNSelectionRefDTO(selectionIndex=", ")");
    }
}
