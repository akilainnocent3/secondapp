package com.sportygames.speedybingo.data.dto;

import defpackage.gpp;
import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBAutoSpinDTO;", "", "maxSpin", "", "minSpin", "stepSpin", "defaultSpin", "preDefined", "", "<init>", "(IIIILjava/util/List;)V", "getMaxSpin", "()I", "getMinSpin", "getStepSpin", "getDefaultSpin", "getPreDefined", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBAutoSpinDTO {
    public static final int $stable = 8;
    private final int defaultSpin;
    private final int maxSpin;
    private final int minSpin;
    private final List<Integer> preDefined;
    private final int stepSpin;

    public SBAutoSpinDTO(int i, int i2, int i3, int i4, List<Integer> list) {
        list.getClass();
        this.maxSpin = i;
        this.minSpin = i2;
        this.stepSpin = i3;
        this.defaultSpin = i4;
        this.preDefined = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SBAutoSpinDTO copy$default(SBAutoSpinDTO sBAutoSpinDTO, int i, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = sBAutoSpinDTO.maxSpin;
        }
        if ((i5 & 2) != 0) {
            i2 = sBAutoSpinDTO.minSpin;
        }
        if ((i5 & 4) != 0) {
            i3 = sBAutoSpinDTO.stepSpin;
        }
        if ((i5 & 8) != 0) {
            i4 = sBAutoSpinDTO.defaultSpin;
        }
        if ((i5 & 16) != 0) {
            list = sBAutoSpinDTO.preDefined;
        }
        List list2 = list;
        int i6 = i3;
        return sBAutoSpinDTO.copy(i, i2, i6, i4, list2);
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

    public final List<Integer> component5() {
        return this.preDefined;
    }

    public final SBAutoSpinDTO copy(int maxSpin, int minSpin, int stepSpin, int defaultSpin, List<Integer> preDefined) {
        preDefined.getClass();
        return new SBAutoSpinDTO(maxSpin, minSpin, stepSpin, defaultSpin, preDefined);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBAutoSpinDTO)) {
            return false;
        }
        SBAutoSpinDTO sBAutoSpinDTO = (SBAutoSpinDTO) other;
        return this.maxSpin == sBAutoSpinDTO.maxSpin && this.minSpin == sBAutoSpinDTO.minSpin && this.stepSpin == sBAutoSpinDTO.stepSpin && this.defaultSpin == sBAutoSpinDTO.defaultSpin && Intrinsics.g(this.preDefined, sBAutoSpinDTO.preDefined);
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

    public final List<Integer> getPreDefined() {
        return this.preDefined;
    }

    public final int getStepSpin() {
        return this.stepSpin;
    }

    public int hashCode() {
        return this.preDefined.hashCode() + gpp.a(this.defaultSpin, gpp.a(this.stepSpin, gpp.a(this.minSpin, Integer.hashCode(this.maxSpin) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SBAutoSpinDTO(maxSpin=");
        sb.append(this.maxSpin);
        sb.append(", minSpin=");
        sb.append(this.minSpin);
        sb.append(", stepSpin=");
        sb.append(this.stepSpin);
        sb.append(", defaultSpin=");
        sb.append(this.defaultSpin);
        sb.append(", preDefined=");
        return o8i.a(sb, this.preDefined, ')');
    }
}
