package com.sportygames.pingpong.remote.models;

import defpackage.d5d;
import defpackage.ffp;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.nl;
import defpackage.nrg0;
import defpackage.uf80;
import defpackage.x03;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u0019\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\nHÆ\u0003J\u0019\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\nHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J¶\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u000fHÖ\u0001J\t\u0010A\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\tj\b\u0012\u0004\u0012\u00020\u0003`\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0012\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 ¨\u0006B"}, d2 = {"Lcom/sportygames/pingpong/remote/models/DetailResponse;", "", "defaultAmount", "", "maxPayoutAmount", "stepAmount", "currency", "", "defaultChips", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "autoBetChips", "minAmount", "maxAmount", "betIndex", "", "betCategoryType", "chatRoomId", "isManualSeedAllowed", "", "betCategoryEnum", "<init>", "(DDDLjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;DDIILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getDefaultAmount", "()D", "setDefaultAmount", "(D)V", "getMaxPayoutAmount", "setMaxPayoutAmount", "getStepAmount", "setStepAmount", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getDefaultChips", "()Ljava/util/ArrayList;", "getAutoBetChips", "getMinAmount", "getMaxAmount", "getBetIndex", "()I", "getBetCategoryType", "getChatRoomId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBetCategoryEnum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(DDDLjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;DDIILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/sportygames/pingpong/remote/models/DetailResponse;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailResponse {
    public static final int $stable = 8;
    private final ArrayList<Double> autoBetChips;
    private final String betCategoryEnum;
    private final int betCategoryType;
    private final int betIndex;
    private final String chatRoomId;
    private String currency;
    private double defaultAmount;
    private final ArrayList<Double> defaultChips;
    private final Boolean isManualSeedAllowed;
    private final double maxAmount;
    private double maxPayoutAmount;
    private final double minAmount;
    private double stepAmount;

    public /* synthetic */ DetailResponse(double d, double d2, double d3, String str, ArrayList arrayList, ArrayList arrayList2, double d4, double d5, int i, int i2, String str2, Boolean bool, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, str, arrayList, arrayList2, d4, d5, i, i2, str2, (i3 & 2048) != 0 ? Boolean.TRUE : bool, (i3 & 4096) != 0 ? "" : str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailResponse copy$default(DetailResponse detailResponse, double d, double d2, double d3, String str, ArrayList arrayList, ArrayList arrayList2, double d4, double d5, int i, int i2, String str2, Boolean bool, String str3, int i3, Object obj) {
        double d6 = (i3 & 1) != 0 ? detailResponse.defaultAmount : d;
        return detailResponse.copy(d6, (i3 & 2) != 0 ? detailResponse.maxPayoutAmount : d2, (i3 & 4) != 0 ? detailResponse.stepAmount : d3, (i3 & 8) != 0 ? detailResponse.currency : str, (i3 & 16) != 0 ? detailResponse.defaultChips : arrayList, (i3 & 32) != 0 ? detailResponse.autoBetChips : arrayList2, (i3 & 64) != 0 ? detailResponse.minAmount : d4, (i3 & 128) != 0 ? detailResponse.maxAmount : d5, (i3 & 256) != 0 ? detailResponse.betIndex : i, (i3 & 512) != 0 ? detailResponse.betCategoryType : i2, (i3 & 1024) != 0 ? detailResponse.chatRoomId : str2, (i3 & 2048) != 0 ? detailResponse.isManualSeedAllowed : bool, (i3 & 4096) != 0 ? detailResponse.betCategoryEnum : str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBetCategoryType() {
        return this.betCategoryType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsManualSeedAllowed() {
        return this.isManualSeedAllowed;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBetCategoryEnum() {
        return this.betCategoryEnum;
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
    public final int getBetIndex() {
        return this.betIndex;
    }

    public final DetailResponse copy(double defaultAmount, double maxPayoutAmount, double stepAmount, String currency, ArrayList<Double> defaultChips, ArrayList<Double> autoBetChips, double minAmount, double maxAmount, int betIndex, int betCategoryType, String chatRoomId, Boolean isManualSeedAllowed, String betCategoryEnum) {
        currency.getClass();
        defaultChips.getClass();
        autoBetChips.getClass();
        return new DetailResponse(defaultAmount, maxPayoutAmount, stepAmount, currency, defaultChips, autoBetChips, minAmount, maxAmount, betIndex, betCategoryType, chatRoomId, isManualSeedAllowed, betCategoryEnum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailResponse)) {
            return false;
        }
        DetailResponse detailResponse = (DetailResponse) other;
        return Double.compare(this.defaultAmount, detailResponse.defaultAmount) == 0 && Double.compare(this.maxPayoutAmount, detailResponse.maxPayoutAmount) == 0 && Double.compare(this.stepAmount, detailResponse.stepAmount) == 0 && Intrinsics.g(this.currency, detailResponse.currency) && Intrinsics.g(this.defaultChips, detailResponse.defaultChips) && Intrinsics.g(this.autoBetChips, detailResponse.autoBetChips) && Double.compare(this.minAmount, detailResponse.minAmount) == 0 && Double.compare(this.maxAmount, detailResponse.maxAmount) == 0 && this.betIndex == detailResponse.betIndex && this.betCategoryType == detailResponse.betCategoryType && Intrinsics.g(this.chatRoomId, detailResponse.chatRoomId) && Intrinsics.g(this.isManualSeedAllowed, detailResponse.isManualSeedAllowed) && Intrinsics.g(this.betCategoryEnum, detailResponse.betCategoryEnum);
    }

    public final ArrayList<Double> getAutoBetChips() {
        return this.autoBetChips;
    }

    public final String getBetCategoryEnum() {
        return this.betCategoryEnum;
    }

    public final int getBetCategoryType() {
        return this.betCategoryType;
    }

    public final int getBetIndex() {
        return this.betIndex;
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

    public final double getStepAmount() {
        return this.stepAmount;
    }

    public int hashCode() {
        int iA = gpp.a(this.betCategoryType, gpp.a(this.betIndex, nrg0.a(nrg0.a(nl.a(this.autoBetChips, nl.a(this.defaultChips, gmf0.a(nrg0.a(nrg0.a(Double.hashCode(this.defaultAmount) * 31, 31, this.maxPayoutAmount), 31, this.stepAmount), 31, this.currency), 31), 31), 31, this.minAmount), 31, this.maxAmount), 31), 31);
        String str = this.chatRoomId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isManualSeedAllowed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.betCategoryEnum;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean isManualSeedAllowed() {
        return this.isManualSeedAllowed;
    }

    public final void setCurrency(String str) {
        str.getClass();
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
        int i = this.betIndex;
        int i2 = this.betCategoryType;
        String str2 = this.chatRoomId;
        Boolean bool = this.isManualSeedAllowed;
        String str3 = this.betCategoryEnum;
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
        hib0.b(d5, ", maxAmount=", ", betIndex=", sbA);
        d5d.a(sbA, i, ", betCategoryType=", i2, ", chatRoomId=");
        x03.a(sbA, str2, ", isManualSeedAllowed=", bool, ", betCategoryEnum=");
        return uf80.a(sbA, str3, ")");
    }

    public DetailResponse(double d, double d2, double d3, String str, ArrayList<Double> arrayList, ArrayList<Double> arrayList2, double d4, double d5, int i, int i2, String str2, Boolean bool, String str3) {
        str.getClass();
        arrayList.getClass();
        arrayList2.getClass();
        this.defaultAmount = d;
        this.maxPayoutAmount = d2;
        this.stepAmount = d3;
        this.currency = str;
        this.defaultChips = arrayList;
        this.autoBetChips = arrayList2;
        this.minAmount = d4;
        this.maxAmount = d5;
        this.betIndex = i;
        this.betCategoryType = i2;
        this.chatRoomId = str2;
        this.isManualSeedAllowed = bool;
        this.betCategoryEnum = str3;
    }
}
