package com.sportygames.goldmine.data.dto;

import defpackage.h70;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGBetResultDTO;", "", "index", "", "multiplier", "", "<init>", "(IF)V", "getIndex", "()I", "getMultiplier", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGBetResultDTO {
    public static final int $stable = 0;
    private final int index;
    private final float multiplier;

    public TGBetResultDTO(int i, float f) {
        this.index = i;
        this.multiplier = f;
    }

    public static /* synthetic */ TGBetResultDTO copy$default(TGBetResultDTO tGBetResultDTO, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tGBetResultDTO.index;
        }
        if ((i2 & 2) != 0) {
            f = tGBetResultDTO.multiplier;
        }
        return tGBetResultDTO.copy(i, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMultiplier() {
        return this.multiplier;
    }

    public final TGBetResultDTO copy(int index, float multiplier) {
        return new TGBetResultDTO(index, multiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGBetResultDTO)) {
            return false;
        }
        TGBetResultDTO tGBetResultDTO = (TGBetResultDTO) other;
        return this.index == tGBetResultDTO.index && Float.compare(this.multiplier, tGBetResultDTO.multiplier) == 0;
    }

    public final int getIndex() {
        return this.index;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return Float.hashCode(this.multiplier) + (Integer.hashCode(this.index) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGBetResultDTO(index=");
        sb.append(this.index);
        sb.append(", multiplier=");
        return h70.a(sb, this.multiplier, ')');
    }
}
