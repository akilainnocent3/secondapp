package com.sportybet.plugin.realsports.data;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.cv7;
import defpackage.m2g;
import defpackage.nve;
import defpackage.oie;
import defpackage.qpu;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011HÆ\u0003Jà\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010IJ\u0014\u0010J\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010L\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010M\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R)\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R)\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R)\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\n¢\u0006\n\n\u0002\u0010(\u001a\u0004\b\n\u0010'R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR)\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u000e¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R5\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0010¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R5\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0013¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R'\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001cR)\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0016¢\u0006\n\n\u0002\u0010$\u001a\u0004\b5\u0010#R'\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001cR-\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/Ê\u0001\f\bO\u0012\b\bP\u0012\u0004\b\u0003\u0010\u0000¨\u0006N"}, d2 = {"Lcom/sportybet/plugin/realsports/data/CashOutBet;", "", "cashOutBetId", "", "userId", "orderId", AnalyticsParam.EVENT_STATUS, "", "type", "paymentType", "isUseGift", "", "originStake", "stake", "createTime", "", "selections", "", "Lcom/sportybet/plugin/realsports/data/CashOutSelection;", "subBets", "Lcom/sportybet/plugin/realsports/data/SubBet;", "currency", "giftKind", "giftAmount", "featureTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getCashOutBetId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", AnalyticsParam.EVENT_PARAM_ID, "getUserId", "getOrderId", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "getPaymentType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOriginStake", "getStake", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSelections", "()Ljava/util/List;", "setSelections", "(Ljava/util/List;)V", "getSubBets", "setSubBets", "getCurrency", "getGiftKind", "getGiftAmount", "getFeatureTags", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/sportybet/plugin/realsports/data/CashOutBet;", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutBet {
    public static final int $stable = 8;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String cashOutBetId;

    @SerializedName("createTime")
    private final Long createTime;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("featureTags")
    private final List<Integer> featureTags;

    @SerializedName("giftAmount")
    private final String giftAmount;

    @SerializedName("giftKind")
    private final Integer giftKind;

    @SerializedName("isUseGift")
    private final Boolean isUseGift;

    @SerializedName("orderId")
    private final String orderId;

    @SerializedName("originStake")
    private final String originStake;

    @SerializedName("paymentType")
    private final Integer paymentType;

    @SerializedName("selections")
    private List<CashOutSelection> selections;

    @SerializedName("stake")
    private final String stake;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final Integer status;

    @SerializedName("subBets")
    private List<SubBet> subBets;

    @SerializedName("type")
    private final Integer type;

    @SerializedName("userId")
    private final String userId;

    public CashOutBet(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Boolean bool, String str4, String str5, Long l, List list, List list2, String str6, Integer num4, String str7, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, num2, num3, bool, str4, str5, l, (i & 1024) != 0 ? m2g.a : list, (i & 2048) != 0 ? m2g.a : list2, str6, num4, str7, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCashOutBetId() {
        return this.cashOutBetId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    public final List<CashOutSelection> component11() {
        return this.selections;
    }

    public final List<SubBet> component12() {
        return this.subBets;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getGiftKind() {
        return this.giftKind;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getGiftAmount() {
        return this.giftAmount;
    }

    public final List<Integer> component16() {
        return this.featureTags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsUseGift() {
        return this.isUseGift;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOriginStake() {
        return this.originStake;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStake() {
        return this.stake;
    }

    public final CashOutBet copy(String cashOutBetId, String userId, String orderId, Integer status, Integer type, Integer paymentType, Boolean isUseGift, String originStake, String stake, Long createTime, List<CashOutSelection> selections, List<SubBet> subBets, String currency, Integer giftKind, String giftAmount, List<Integer> featureTags) {
        return new CashOutBet(cashOutBetId, userId, orderId, status, type, paymentType, isUseGift, originStake, stake, createTime, selections, subBets, currency, giftKind, giftAmount, featureTags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutBet)) {
            return false;
        }
        CashOutBet cashOutBet = (CashOutBet) other;
        return Intrinsics.g(this.cashOutBetId, cashOutBet.cashOutBetId) && Intrinsics.g(this.userId, cashOutBet.userId) && Intrinsics.g(this.orderId, cashOutBet.orderId) && Intrinsics.g(this.status, cashOutBet.status) && Intrinsics.g(this.type, cashOutBet.type) && Intrinsics.g(this.paymentType, cashOutBet.paymentType) && Intrinsics.g(this.isUseGift, cashOutBet.isUseGift) && Intrinsics.g(this.originStake, cashOutBet.originStake) && Intrinsics.g(this.stake, cashOutBet.stake) && Intrinsics.g(this.createTime, cashOutBet.createTime) && Intrinsics.g(this.selections, cashOutBet.selections) && Intrinsics.g(this.subBets, cashOutBet.subBets) && Intrinsics.g(this.currency, cashOutBet.currency) && Intrinsics.g(this.giftKind, cashOutBet.giftKind) && Intrinsics.g(this.giftAmount, cashOutBet.giftAmount) && Intrinsics.g(this.featureTags, cashOutBet.featureTags);
    }

    public final String getCashOutBetId() {
        return this.cashOutBetId;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<Integer> getFeatureTags() {
        return this.featureTags;
    }

    public final String getGiftAmount() {
        return this.giftAmount;
    }

    public final Integer getGiftKind() {
        return this.giftKind;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOriginStake() {
        return this.originStake;
    }

    public final Integer getPaymentType() {
        return this.paymentType;
    }

    public final List<CashOutSelection> getSelections() {
        return this.selections;
    }

    public final String getStake() {
        return this.stake;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final List<SubBet> getSubBets() {
        return this.subBets;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.cashOutBetId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.type;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.paymentType;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isUseGift;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.originStake;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stake;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        List<CashOutSelection> list = this.selections;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<SubBet> list2 = this.subBets;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.giftKind;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.giftAmount;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<Integer> list3 = this.featureTags;
        return iHashCode15 + (list3 != null ? list3.hashCode() : 0);
    }

    public final Boolean isUseGift() {
        return this.isUseGift;
    }

    public final void setSelections(List<CashOutSelection> list) {
        this.selections = list;
    }

    public final void setSubBets(List<SubBet> list) {
        this.subBets = list;
    }

    public String toString() {
        String str = this.cashOutBetId;
        String str2 = this.userId;
        String str3 = this.orderId;
        Integer num = this.status;
        Integer num2 = this.type;
        Integer num3 = this.paymentType;
        Boolean bool = this.isUseGift;
        String str4 = this.originStake;
        String str5 = this.stake;
        Long l = this.createTime;
        List<CashOutSelection> list = this.selections;
        List<SubBet> list2 = this.subBets;
        String str6 = this.currency;
        Integer num4 = this.giftKind;
        String str7 = this.giftAmount;
        List<Integer> list3 = this.featureTags;
        StringBuilder sbA = ux5.a("CashOutBet(cashOutBetId=", str, ", userId=", str2, ", orderId=");
        oie.a(num, str3, ", status=", ", type=", sbA);
        cv7.a(sbA, num2, ", paymentType=", num3, ", isUseGift=");
        sbA.append(bool);
        sbA.append(", originStake=");
        sbA.append(str4);
        sbA.append(", stake=");
        sbA.append(str5);
        sbA.append(", createTime=");
        sbA.append(l);
        sbA.append(", selections=");
        qpu.a(", subBets=", ", currency=", sbA, list, list2);
        oie.a(num4, str6, ", giftKind=", ", giftAmount=", sbA);
        return nve.a(str7, ", featureTags=", ")", sbA, list3);
    }

    public CashOutBet(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Boolean bool, String str4, String str5, Long l, List<CashOutSelection> list, List<SubBet> list2, String str6, Integer num4, String str7, List<Integer> list3) {
        this.cashOutBetId = str;
        this.userId = str2;
        this.orderId = str3;
        this.status = num;
        this.type = num2;
        this.paymentType = num3;
        this.isUseGift = bool;
        this.originStake = str4;
        this.stake = str5;
        this.createTime = l;
        this.selections = list;
        this.subBets = list2;
        this.currency = str6;
        this.giftKind = num4;
        this.giftAmount = str7;
        this.featureTags = list3;
    }
}
