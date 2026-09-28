package com.sportygames.spin2win.model.response;

import defpackage.hxa;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jh\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/sportygames/spin2win/model/response/Spin2WinPlaceBetResponse;", "", "totalWinAmount", "", "giftAmount", "actualWinAmount", "houseDraw", "", "houseDrawColour", "", "currency", "individualBetResponseList", "", "Lcom/sportygames/spin2win/model/response/Spin2WinIndividualBetResponse;", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTotalWinAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGiftAmount", "getActualWinAmount", "getHouseDraw", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHouseDrawColour", "()Ljava/lang/String;", "getCurrency", "getIndividualBetResponseList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sportygames/spin2win/model/response/Spin2WinPlaceBetResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Spin2WinPlaceBetResponse {
    public static final int $stable = 8;
    private final Double actualWinAmount;
    private final String currency;
    private final Double giftAmount;
    private final Integer houseDraw;
    private final String houseDrawColour;
    private final List<Spin2WinIndividualBetResponse> individualBetResponseList;
    private final Double totalWinAmount;

    public Spin2WinPlaceBetResponse(Double d, Double d2, Double d3, Integer num, String str, String str2, List<Spin2WinIndividualBetResponse> list) {
        this.totalWinAmount = d;
        this.giftAmount = d2;
        this.actualWinAmount = d3;
        this.houseDraw = num;
        this.houseDrawColour = str;
        this.currency = str2;
        this.individualBetResponseList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Spin2WinPlaceBetResponse copy$default(Spin2WinPlaceBetResponse spin2WinPlaceBetResponse, Double d, Double d2, Double d3, Integer num, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = spin2WinPlaceBetResponse.totalWinAmount;
        }
        if ((i & 2) != 0) {
            d2 = spin2WinPlaceBetResponse.giftAmount;
        }
        if ((i & 4) != 0) {
            d3 = spin2WinPlaceBetResponse.actualWinAmount;
        }
        if ((i & 8) != 0) {
            num = spin2WinPlaceBetResponse.houseDraw;
        }
        if ((i & 16) != 0) {
            str = spin2WinPlaceBetResponse.houseDrawColour;
        }
        if ((i & 32) != 0) {
            str2 = spin2WinPlaceBetResponse.currency;
        }
        if ((i & 64) != 0) {
            list = spin2WinPlaceBetResponse.individualBetResponseList;
        }
        String str3 = str2;
        List list2 = list;
        String str4 = str;
        Double d4 = d3;
        return spin2WinPlaceBetResponse.copy(d, d2, d4, num, str4, str3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getTotalWinAmount() {
        return this.totalWinAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getActualWinAmount() {
        return this.actualWinAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHouseDraw() {
        return this.houseDraw;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHouseDrawColour() {
        return this.houseDrawColour;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final List<Spin2WinIndividualBetResponse> component7() {
        return this.individualBetResponseList;
    }

    public final Spin2WinPlaceBetResponse copy(Double totalWinAmount, Double giftAmount, Double actualWinAmount, Integer houseDraw, String houseDrawColour, String currency, List<Spin2WinIndividualBetResponse> individualBetResponseList) {
        return new Spin2WinPlaceBetResponse(totalWinAmount, giftAmount, actualWinAmount, houseDraw, houseDrawColour, currency, individualBetResponseList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Spin2WinPlaceBetResponse)) {
            return false;
        }
        Spin2WinPlaceBetResponse spin2WinPlaceBetResponse = (Spin2WinPlaceBetResponse) other;
        return Intrinsics.g(this.totalWinAmount, spin2WinPlaceBetResponse.totalWinAmount) && Intrinsics.g(this.giftAmount, spin2WinPlaceBetResponse.giftAmount) && Intrinsics.g(this.actualWinAmount, spin2WinPlaceBetResponse.actualWinAmount) && Intrinsics.g(this.houseDraw, spin2WinPlaceBetResponse.houseDraw) && Intrinsics.g(this.houseDrawColour, spin2WinPlaceBetResponse.houseDrawColour) && Intrinsics.g(this.currency, spin2WinPlaceBetResponse.currency) && Intrinsics.g(this.individualBetResponseList, spin2WinPlaceBetResponse.individualBetResponseList);
    }

    public final Double getActualWinAmount() {
        return this.actualWinAmount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final Integer getHouseDraw() {
        return this.houseDraw;
    }

    public final String getHouseDrawColour() {
        return this.houseDrawColour;
    }

    public final List<Spin2WinIndividualBetResponse> getIndividualBetResponseList() {
        return this.individualBetResponseList;
    }

    public final Double getTotalWinAmount() {
        return this.totalWinAmount;
    }

    public int hashCode() {
        Double d = this.totalWinAmount;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.giftAmount;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.actualWinAmount;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.houseDraw;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.houseDrawColour;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Spin2WinIndividualBetResponse> list = this.individualBetResponseList;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Double d = this.totalWinAmount;
        Double d2 = this.giftAmount;
        Double d3 = this.actualWinAmount;
        Integer num = this.houseDraw;
        String str = this.houseDrawColour;
        String str2 = this.currency;
        List<Spin2WinIndividualBetResponse> list = this.individualBetResponseList;
        StringBuilder sb = new StringBuilder("Spin2WinPlaceBetResponse(totalWinAmount=");
        sb.append(d);
        sb.append(", giftAmount=");
        sb.append(d2);
        sb.append(", actualWinAmount=");
        sb.append(d3);
        sb.append(", houseDraw=");
        sb.append(num);
        sb.append(", houseDrawColour=");
        hxa.c(sb, str, ", currency=", str2, ", individualBetResponseList=");
        return ng1.a(sb, list, ")");
    }
}
