package com.sportygames.speedybingo.data.dto;

import defpackage.ai50;
import defpackage.itu;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010JP\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;", "", "numbers", "", "", "multipliers", "", "payouts", "extraBallPrice", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;)V", "getNumbers", "()Ljava/util/List;", "getMultipliers", "getPayouts", "getExtraBallPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;)Lcom/sportygames/speedybingo/data/dto/SBGameResultDTO;", "equals", "", "other", "hashCode", "toString", "", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBGameResultDTO {
    public static final int $stable = 8;
    private final Double extraBallPrice;
    private final List<Double> multipliers;
    private final List<Integer> numbers;
    private final List<List<Double>> payouts;

    /* JADX WARN: Multi-variable type inference failed */
    public SBGameResultDTO(List<Integer> list, List<Double> list2, List<? extends List<Double>> list3, Double d) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.numbers = list;
        this.multipliers = list2;
        this.payouts = list3;
        this.extraBallPrice = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SBGameResultDTO copy$default(SBGameResultDTO sBGameResultDTO, List list, List list2, List list3, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sBGameResultDTO.numbers;
        }
        if ((i & 2) != 0) {
            list2 = sBGameResultDTO.multipliers;
        }
        if ((i & 4) != 0) {
            list3 = sBGameResultDTO.payouts;
        }
        if ((i & 8) != 0) {
            d = sBGameResultDTO.extraBallPrice;
        }
        return sBGameResultDTO.copy(list, list2, list3, d);
    }

    public final List<Integer> component1() {
        return this.numbers;
    }

    public final List<Double> component2() {
        return this.multipliers;
    }

    public final List<List<Double>> component3() {
        return this.payouts;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getExtraBallPrice() {
        return this.extraBallPrice;
    }

    public final SBGameResultDTO copy(List<Integer> numbers, List<Double> multipliers, List<? extends List<Double>> payouts, Double extraBallPrice) {
        numbers.getClass();
        multipliers.getClass();
        payouts.getClass();
        return new SBGameResultDTO(numbers, multipliers, payouts, extraBallPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBGameResultDTO)) {
            return false;
        }
        SBGameResultDTO sBGameResultDTO = (SBGameResultDTO) other;
        return Intrinsics.g(this.numbers, sBGameResultDTO.numbers) && Intrinsics.g(this.multipliers, sBGameResultDTO.multipliers) && Intrinsics.g(this.payouts, sBGameResultDTO.payouts) && Intrinsics.g(this.extraBallPrice, sBGameResultDTO.extraBallPrice);
    }

    public final Double getExtraBallPrice() {
        return this.extraBallPrice;
    }

    public final List<Double> getMultipliers() {
        return this.multipliers;
    }

    public final List<Integer> getNumbers() {
        return this.numbers;
    }

    public final List<List<Double>> getPayouts() {
        return this.payouts;
    }

    public int hashCode() {
        int iA = ai50.a(ai50.a(this.numbers.hashCode() * 31, 31, this.multipliers), 31, this.payouts);
        Double d = this.extraBallPrice;
        return iA + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SBGameResultDTO(numbers=");
        sb.append(this.numbers);
        sb.append(", multipliers=");
        sb.append(this.multipliers);
        sb.append(", payouts=");
        sb.append(this.payouts);
        sb.append(", extraBallPrice=");
        return itu.a(sb, this.extraBallPrice, ')');
    }
}
