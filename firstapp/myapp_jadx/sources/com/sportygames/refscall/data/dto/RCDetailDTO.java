package com.sportygames.refscall.data.dto;

import defpackage.nl;
import defpackage.nrg0;
import defpackage.org0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/sportygames/refscall/data/dto/RCDetailDTO;", "", "defaultAmount", "", "betChipList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "minAmount", "maxAmount", "<init>", "(DLjava/util/ArrayList;DD)V", "getDefaultAmount", "()D", "getBetChipList", "()Ljava/util/ArrayList;", "getMinAmount", "getMaxAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "game-refscall_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RCDetailDTO {
    public static final int $stable = 8;
    private final ArrayList<Double> betChipList;
    private final double defaultAmount;
    private final double maxAmount;
    private final double minAmount;

    public RCDetailDTO(double d, ArrayList<Double> arrayList, double d2, double d3) {
        arrayList.getClass();
        this.defaultAmount = d;
        this.betChipList = arrayList;
        this.minAmount = d2;
        this.maxAmount = d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RCDetailDTO copy$default(RCDetailDTO rCDetailDTO, double d, ArrayList arrayList, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = rCDetailDTO.defaultAmount;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            arrayList = rCDetailDTO.betChipList;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            d2 = rCDetailDTO.minAmount;
        }
        double d5 = d2;
        if ((i & 8) != 0) {
            d3 = rCDetailDTO.maxAmount;
        }
        return rCDetailDTO.copy(d4, arrayList2, d5, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final ArrayList<Double> component2() {
        return this.betChipList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final RCDetailDTO copy(double defaultAmount, ArrayList<Double> betChipList, double minAmount, double maxAmount) {
        betChipList.getClass();
        return new RCDetailDTO(defaultAmount, betChipList, minAmount, maxAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RCDetailDTO)) {
            return false;
        }
        RCDetailDTO rCDetailDTO = (RCDetailDTO) other;
        return Double.compare(this.defaultAmount, rCDetailDTO.defaultAmount) == 0 && Intrinsics.g(this.betChipList, rCDetailDTO.betChipList) && Double.compare(this.minAmount, rCDetailDTO.minAmount) == 0 && Double.compare(this.maxAmount, rCDetailDTO.maxAmount) == 0;
    }

    public final ArrayList<Double> getBetChipList() {
        return this.betChipList;
    }

    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final double getMinAmount() {
        return this.minAmount;
    }

    public int hashCode() {
        return Double.hashCode(this.maxAmount) + nrg0.a(nl.a(this.betChipList, Double.hashCode(this.defaultAmount) * 31, 31), 31, this.minAmount);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RCDetailDTO(defaultAmount=");
        sb.append(this.defaultAmount);
        sb.append(", betChipList=");
        sb.append(this.betChipList);
        sb.append(", minAmount=");
        sb.append(this.minAmount);
        sb.append(", maxAmount=");
        return org0.a(sb, this.maxAmount, ')');
    }
}
