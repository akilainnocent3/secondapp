package com.sportygames.goldmine.data.dto;

import defpackage.gpp;
import defpackage.rr1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGAutoSpinDTO;", "", "maxSpin", "", "minSpin", "stepSpin", "defaultSpin", "<init>", "(IIII)V", "getMaxSpin", "()I", "getMinSpin", "getStepSpin", "getDefaultSpin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGAutoSpinDTO {
    public static final int $stable = 0;
    private final int defaultSpin;
    private final int maxSpin;
    private final int minSpin;
    private final int stepSpin;

    public /* synthetic */ TGAutoSpinDTO(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 10 : i, (i5 & 2) != 0 ? 1 : i2, (i5 & 4) != 0 ? 1 : i3, (i5 & 8) != 0 ? 10 : i4);
    }

    public static /* synthetic */ TGAutoSpinDTO copy$default(TGAutoSpinDTO tGAutoSpinDTO, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = tGAutoSpinDTO.maxSpin;
        }
        if ((i5 & 2) != 0) {
            i2 = tGAutoSpinDTO.minSpin;
        }
        if ((i5 & 4) != 0) {
            i3 = tGAutoSpinDTO.stepSpin;
        }
        if ((i5 & 8) != 0) {
            i4 = tGAutoSpinDTO.defaultSpin;
        }
        return tGAutoSpinDTO.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxSpin() {
        return this.maxSpin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinSpin() {
        return this.minSpin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStepSpin() {
        return this.stepSpin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDefaultSpin() {
        return this.defaultSpin;
    }

    public final TGAutoSpinDTO copy(int maxSpin, int minSpin, int stepSpin, int defaultSpin) {
        return new TGAutoSpinDTO(maxSpin, minSpin, stepSpin, defaultSpin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGAutoSpinDTO)) {
            return false;
        }
        TGAutoSpinDTO tGAutoSpinDTO = (TGAutoSpinDTO) other;
        return this.maxSpin == tGAutoSpinDTO.maxSpin && this.minSpin == tGAutoSpinDTO.minSpin && this.stepSpin == tGAutoSpinDTO.stepSpin && this.defaultSpin == tGAutoSpinDTO.defaultSpin;
    }

    public final int getDefaultSpin() {
        return this.defaultSpin;
    }

    public final int getMaxSpin() {
        return this.maxSpin;
    }

    public final int getMinSpin() {
        return this.minSpin;
    }

    public final int getStepSpin() {
        return this.stepSpin;
    }

    public int hashCode() {
        return Integer.hashCode(this.defaultSpin) + gpp.a(this.stepSpin, gpp.a(this.minSpin, Integer.hashCode(this.maxSpin) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TGAutoSpinDTO(maxSpin=");
        sb.append(this.maxSpin);
        sb.append(", minSpin=");
        sb.append(this.minSpin);
        sb.append(", stepSpin=");
        sb.append(this.stepSpin);
        sb.append(", defaultSpin=");
        return rr1.b(sb, this.defaultSpin, ')');
    }

    public TGAutoSpinDTO(int i, int i2, int i3, int i4) {
        this.maxSpin = i;
        this.minSpin = i2;
        this.stepSpin = i3;
        this.defaultSpin = i4;
    }

    public TGAutoSpinDTO() {
        this(0, 0, 0, 0, 15, null);
    }
}
