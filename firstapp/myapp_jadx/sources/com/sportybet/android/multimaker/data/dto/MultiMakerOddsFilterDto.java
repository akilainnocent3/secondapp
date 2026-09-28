package com.sportybet.android.multimaker.data.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/android/multimaker/data/dto/MultiMakerOddsFilterDto;", "", "min", "", "max", "total", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getMin", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMax", "getTotal", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/sportybet/android/multimaker/data/dto/MultiMakerOddsFilterDto;", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerOddsFilterDto {
    public static final int $stable = 0;
    private final Float max;
    private final Float min;
    private final Float total;

    public /* synthetic */ MultiMakerOddsFilterDto(Float f, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Float.valueOf(1.0f) : f, (i & 2) != 0 ? Float.valueOf(Float.MAX_VALUE) : f2, (i & 4) != 0 ? null : f3);
    }

    public static /* synthetic */ MultiMakerOddsFilterDto copy$default(MultiMakerOddsFilterDto multiMakerOddsFilterDto, Float f, Float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = multiMakerOddsFilterDto.min;
        }
        if ((i & 2) != 0) {
            f2 = multiMakerOddsFilterDto.max;
        }
        if ((i & 4) != 0) {
            f3 = multiMakerOddsFilterDto.total;
        }
        return multiMakerOddsFilterDto.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getTotal() {
        return this.total;
    }

    public final MultiMakerOddsFilterDto copy(Float min, Float max, Float total) {
        return new MultiMakerOddsFilterDto(min, max, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiMakerOddsFilterDto)) {
            return false;
        }
        MultiMakerOddsFilterDto multiMakerOddsFilterDto = (MultiMakerOddsFilterDto) other;
        return Intrinsics.g(this.min, multiMakerOddsFilterDto.min) && Intrinsics.g(this.max, multiMakerOddsFilterDto.max) && Intrinsics.g(this.total, multiMakerOddsFilterDto.total);
    }

    public final Float getMax() {
        return this.max;
    }

    public final Float getMin() {
        return this.min;
    }

    public final Float getTotal() {
        return this.total;
    }

    public int hashCode() {
        Float f = this.min;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.max;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.total;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public String toString() {
        return "MultiMakerOddsFilterDto(min=" + this.min + ", max=" + this.max + ", total=" + this.total + ")";
    }

    public MultiMakerOddsFilterDto(Float f, Float f2, Float f3) {
        this.min = f;
        this.max = f2;
        this.total = f3;
    }

    public MultiMakerOddsFilterDto() {
        this(null, null, null, 7, null);
    }
}
