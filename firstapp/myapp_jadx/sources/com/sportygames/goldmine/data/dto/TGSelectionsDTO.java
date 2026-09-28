package com.sportygames.goldmine.data.dto;

import defpackage.rr1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGSelectionsDTO;", "", "caves", "", "<init>", "(I)V", "getCaves", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGSelectionsDTO {
    public static final int $stable = 0;
    private final int caves;

    public TGSelectionsDTO(int i) {
        this.caves = i;
    }

    public static /* synthetic */ TGSelectionsDTO copy$default(TGSelectionsDTO tGSelectionsDTO, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tGSelectionsDTO.caves;
        }
        return tGSelectionsDTO.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCaves() {
        return this.caves;
    }

    public final TGSelectionsDTO copy(int caves) {
        return new TGSelectionsDTO(caves);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TGSelectionsDTO) && this.caves == ((TGSelectionsDTO) other).caves;
    }

    public final int getCaves() {
        return this.caves;
    }

    public int hashCode() {
        return Integer.hashCode(this.caves);
    }

    public String toString() {
        return rr1.b(new StringBuilder("TGSelectionsDTO(caves="), this.caves, ')');
    }
}
