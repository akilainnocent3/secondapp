package com.sportygames.pocketrocket.model.response;

import defpackage.ffp;
import defpackage.gmf0;
import defpackage.hib0;
import defpackage.kwi;
import defpackage.nl;
import defpackage.nrg0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0019\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\nHÆ\u0003J\u0019\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\nHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0091\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001b¨\u00066"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/DetailResponse;", "", "defaultAmount", "", "maxPayoutAmount", "stepAmount", "currency", "", "defaultChips", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "autoBetChips", "minAmount", "maxAmount", "rocketType", "chatRoomId", "<init>", "(DDDLjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;DDLjava/lang/String;Ljava/lang/String;)V", "getDefaultAmount", "()D", "setDefaultAmount", "(D)V", "getMaxPayoutAmount", "setMaxPayoutAmount", "getStepAmount", "setStepAmount", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getDefaultChips", "()Ljava/util/ArrayList;", "getAutoBetChips", "getMinAmount", "getMaxAmount", "getRocketType", "getChatRoomId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailResponse {
    public static final int $stable = 8;
    private final ArrayList<Double> autoBetChips;
    private final String chatRoomId;
    private String currency;
    private double defaultAmount;
    private final ArrayList<Double> defaultChips;
    private final double maxAmount;
    private double maxPayoutAmount;
    private final double minAmount;
    private final String rocketType;
    private double stepAmount;

    public DetailResponse(double d, double d2, double d3, String str, ArrayList<Double> arrayList, ArrayList<Double> arrayList2, double d4, double d5, String str2, String str3) {
        arrayList.getClass();
        arrayList2.getClass();
        str2.getClass();
        this.defaultAmount = d;
        this.maxPayoutAmount = d2;
        this.stepAmount = d3;
        this.currency = str;
        this.defaultChips = arrayList;
        this.autoBetChips = arrayList2;
        this.minAmount = d4;
        this.maxAmount = d5;
        this.rocketType = str2;
        this.chatRoomId = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getMaxPayoutAmount() {
        return this.maxPayoutAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getStepAmount() {
        return this.stepAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final ArrayList<Double> component5() {
        return this.defaultChips;
    }

    public final ArrayList<Double> component6() {
        return this.autoBetChips;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRocketType() {
        return this.rocketType;
    }

    public final DetailResponse copy(double defaultAmount, double maxPayoutAmount, double stepAmount, String currency, ArrayList<Double> defaultChips, ArrayList<Double> autoBetChips, double minAmount, double maxAmount, String rocketType, String chatRoomId) {
        defaultChips.getClass();
        autoBetChips.getClass();
        rocketType.getClass();
        return new DetailResponse(defaultAmount, maxPayoutAmount, stepAmount, currency, defaultChips, autoBetChips, minAmount, maxAmount, rocketType, chatRoomId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailResponse)) {
            return false;
        }
        DetailResponse detailResponse = (DetailResponse) other;
        return Double.compare(this.defaultAmount, detailResponse.defaultAmount) == 0 && Double.compare(this.maxPayoutAmount, detailResponse.maxPayoutAmount) == 0 && Double.compare(this.stepAmount, detailResponse.stepAmount) == 0 && Intrinsics.g(this.currency, detailResponse.currency) && Intrinsics.g(this.defaultChips, detailResponse.defaultChips) && Intrinsics.g(this.autoBetChips, detailResponse.autoBetChips) && Double.compare(this.minAmount, detailResponse.minAmount) == 0 && Double.compare(this.maxAmount, detailResponse.maxAmount) == 0 && Intrinsics.g(this.rocketType, detailResponse.rocketType) && Intrinsics.g(this.chatRoomId, detailResponse.chatRoomId);
    }

    public final ArrayList<Double> getAutoBetChips() {
        return this.autoBetChips;
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final ArrayList<Double> getDefaultChips() {
        return this.defaultChips;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final double getMaxPayoutAmount() {
        return this.maxPayoutAmount;
    }

    public final double getMinAmount() {
        return this.minAmount;
    }

    public final String getRocketType() {
        return this.rocketType;
    }

    public final double getStepAmount() {
        return this.stepAmount;
    }

    public int hashCode() {
        int iA = nrg0.a(nrg0.a(Double.hashCode(this.defaultAmount) * 31, 31, this.maxPayoutAmount), 31, this.stepAmount);
        String str = this.currency;
        int iA2 = gmf0.a(nrg0.a(nrg0.a(nl.a(this.autoBetChips, nl.a(this.defaultChips, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.minAmount), 31, this.maxAmount), 31, this.rocketType);
        String str2 = this.chatRoomId;
        return iA2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setDefaultAmount(double d) {
        this.defaultAmount = d;
    }

    public final void setMaxPayoutAmount(double d) {
        this.maxPayoutAmount = d;
    }

    public final void setStepAmount(double d) {
        this.stepAmount = d;
    }

    public String toString() {
        double d = this.defaultAmount;
        double d2 = this.maxPayoutAmount;
        double d3 = this.stepAmount;
        String str = this.currency;
        ArrayList<Double> arrayList = this.defaultChips;
        ArrayList<Double> arrayList2 = this.autoBetChips;
        double d4 = this.minAmount;
        double d5 = this.maxAmount;
        String str2 = this.rocketType;
        String str3 = this.chatRoomId;
        StringBuilder sbA = ffp.a(d, "DetailResponse(defaultAmount=", ", maxPayoutAmount=");
        sbA.append(d2);
        hib0.b(d3, ", stepAmount=", ", currency=", sbA);
        sbA.append(str);
        sbA.append(", defaultChips=");
        sbA.append(arrayList);
        sbA.append(", autoBetChips=");
        sbA.append(arrayList2);
        sbA.append(", minAmount=");
        sbA.append(d4);
        hib0.b(d5, ", maxAmount=", ", rocketType=", sbA);
        return kwi.a(sbA, str2, ", chatRoomId=", str3, ")");
    }
}
