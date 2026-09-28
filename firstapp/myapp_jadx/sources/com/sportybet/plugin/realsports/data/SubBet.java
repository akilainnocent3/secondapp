package com.sportybet.plugin.realsports.data;

import com.appsflyer.internal.v;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.cv7;
import defpackage.oie;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010J\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010K\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010L\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010M\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010U\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010V\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010W\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010X\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010Y\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010Z\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)JÀ\u0002\u0010\\\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010]J\u0014\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010a\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010b\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(%¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R)\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\n¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R)\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R)\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\r¢\u0006\n\n\u0002\u0010/\u001a\u0004\b1\u0010.R)\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u000e¢\u0006\n\n\u0002\u0010/\u001a\u0004\b2\u0010.R)\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u000f¢\u0006\n\n\u0002\u0010/\u001a\u0004\b3\u0010.R)\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0010¢\u0006\n\n\u0002\u0010/\u001a\u0004\b4\u0010.R'\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R'\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R)\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(8¢\u0006\n\n\u0002\u0010/\u001a\u0004\b7\u0010.R)\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0014¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0014\u0010)R)\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0015¢\u0006\n\n\u0002\u0010*\u001a\u0004\b9\u0010)R'\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R)\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0017¢\u0006\n\n\u0002\u0010/\u001a\u0004\b;\u0010.R)\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0018¢\u0006\n\n\u0002\u0010/\u001a\u0004\b<\u0010.R)\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0019¢\u0006\n\n\u0002\u0010/\u001a\u0004\b=\u0010.R)\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001a¢\u0006\n\n\u0002\u0010/\u001a\u0004\b>\u0010.R)\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001b¢\u0006\n\n\u0002\u0010/\u001a\u0004\b?\u0010.R)\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001c¢\u0006\n\n\u0002\u0010/\u001a\u0004\b@\u0010.R)\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001d¢\u0006\n\n\u0002\u0010/\u001a\u0004\bA\u0010.R)\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001e¢\u0006\n\n\u0002\u0010*\u001a\u0004\bB\u0010)Ê\u0001\f\bd\u0012\b\be\u0012\u0004\b\u0003\u0010\u0000¨\u0006c"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SubBet;", "", "subBetId", "", "userId", "betId", "minCorrectNumbersToWin", "", "selectedIds", "", "originStake", "", "stake", "potWinnings", "winnings", "cashOutAmount", "bonus", "bonusPlanId", "bonusRatio", "subBetOdds", "isSettled", AnalyticsParam.EVENT_STATUS, "description", "exciseTax", "exciseTaxRatio", "stakeBonus", "stakeBonusRatio", "giftAmount", "createTime", "updateTime", "sortNum", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)V", "getSubBetId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", AnalyticsParam.EVENT_PARAM_ID, "getUserId", "getBetId", "getMinCorrectNumbersToWin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedIds", "()Ljava/util/List;", "getOriginStake", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStake", "getPotWinnings", "getWinnings", "getCashOutAmount", "getBonus", "getBonusPlanId", "getBonusRatio", "getSubBetOdds", "odds", "getStatus", "getDescription", "getExciseTax", "getExciseTaxRatio", "getStakeBonus", "getStakeBonusRatio", "getGiftAmount", "getCreateTime", "getUpdateTime", "getSortNum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/sportybet/plugin/realsports/data/SubBet;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubBet {
    public static final int $stable = 8;

    @SerializedName("betId")
    private final String betId;

    @SerializedName("bonus")
    private final Long bonus;

    @SerializedName("bonusPlanId")
    private final String bonusPlanId;

    @SerializedName("bonusRatio")
    private final String bonusRatio;

    @SerializedName("cashOutAmount")
    private final Long cashOutAmount;

    @SerializedName("createTime")
    private final Long createTime;

    @SerializedName("description")
    private final String description;

    @SerializedName("exciseTax")
    private final Long exciseTax;

    @SerializedName("exciseTaxRatio")
    private final Long exciseTaxRatio;

    @SerializedName("giftAmount")
    private final Long giftAmount;

    @SerializedName("isSettled")
    private final Integer isSettled;

    @SerializedName("minCorrectNumbersToWin")
    private final Integer minCorrectNumbersToWin;

    @SerializedName("originStake")
    private final Long originStake;

    @SerializedName("potWinnings")
    private final Long potWinnings;

    @SerializedName("selectedIds")
    private final List<String> selectedIds;

    @SerializedName("sortNum")
    private final Integer sortNum;

    @SerializedName("stake")
    private final Long stake;

    @SerializedName("stakeBonus")
    private final Long stakeBonus;

    @SerializedName("stakeBonusRatio")
    private final Long stakeBonusRatio;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final Integer status;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String subBetId;

    @SerializedName("odds")
    private final Long subBetOdds;

    @SerializedName("updateTime")
    private final Long updateTime;

    @SerializedName("userId")
    private final String userId;

    @SerializedName("winnings")
    private final Long winnings;

    public SubBet(String str, String str2, String str3, Integer num, List<String> list, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str4, String str5, Long l7, Integer num2, Integer num3, String str6, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Integer num4) {
        this.subBetId = str;
        this.userId = str2;
        this.betId = str3;
        this.minCorrectNumbersToWin = num;
        this.selectedIds = list;
        this.originStake = l;
        this.stake = l2;
        this.potWinnings = l3;
        this.winnings = l4;
        this.cashOutAmount = l5;
        this.bonus = l6;
        this.bonusPlanId = str4;
        this.bonusRatio = str5;
        this.subBetOdds = l7;
        this.isSettled = num2;
        this.status = num3;
        this.description = str6;
        this.exciseTax = l8;
        this.exciseTaxRatio = l9;
        this.stakeBonus = l10;
        this.stakeBonusRatio = l11;
        this.giftAmount = l12;
        this.createTime = l13;
        this.updateTime = l14;
        this.sortNum = num4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubBet copy$default(SubBet subBet, String str, String str2, String str3, Integer num, List list, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str4, String str5, Long l7, Integer num2, Integer num3, String str6, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Integer num4, int i, Object obj) {
        Integer num5;
        Long l15;
        String str7 = (i & 1) != 0 ? subBet.subBetId : str;
        String str8 = (i & 2) != 0 ? subBet.userId : str2;
        String str9 = (i & 4) != 0 ? subBet.betId : str3;
        Integer num6 = (i & 8) != 0 ? subBet.minCorrectNumbersToWin : num;
        List list2 = (i & 16) != 0 ? subBet.selectedIds : list;
        Long l16 = (i & 32) != 0 ? subBet.originStake : l;
        Long l17 = (i & 64) != 0 ? subBet.stake : l2;
        Long l18 = (i & 128) != 0 ? subBet.potWinnings : l3;
        Long l19 = (i & 256) != 0 ? subBet.winnings : l4;
        Long l20 = (i & 512) != 0 ? subBet.cashOutAmount : l5;
        Long l21 = (i & 1024) != 0 ? subBet.bonus : l6;
        String str10 = (i & 2048) != 0 ? subBet.bonusPlanId : str4;
        String str11 = (i & 4096) != 0 ? subBet.bonusRatio : str5;
        Long l22 = (i & 8192) != 0 ? subBet.subBetOdds : l7;
        String str12 = str7;
        Integer num7 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? subBet.isSettled : num2;
        Integer num8 = (i & 32768) != 0 ? subBet.status : num3;
        String str13 = (i & 65536) != 0 ? subBet.description : str6;
        Long l23 = (i & 131072) != 0 ? subBet.exciseTax : l8;
        Long l24 = (i & 262144) != 0 ? subBet.exciseTaxRatio : l9;
        Long l25 = (i & 524288) != 0 ? subBet.stakeBonus : l10;
        Long l26 = (i & 1048576) != 0 ? subBet.stakeBonusRatio : l11;
        Long l27 = (i & 2097152) != 0 ? subBet.giftAmount : l12;
        Long l28 = (i & 4194304) != 0 ? subBet.createTime : l13;
        Long l29 = (i & 8388608) != 0 ? subBet.updateTime : l14;
        if ((i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            l15 = l29;
            num5 = subBet.sortNum;
        } else {
            num5 = num4;
            l15 = l29;
        }
        return subBet.copy(str12, str8, str9, num6, list2, l16, l17, l18, l19, l20, l21, str10, str11, l22, num7, num8, str13, l23, l24, l25, l26, l27, l28, l15, num5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubBetId() {
        return this.subBetId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getCashOutAmount() {
        return this.cashOutAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getBonus() {
        return this.bonus;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBonusPlanId() {
        return this.bonusPlanId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getBonusRatio() {
        return this.bonusRatio;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getSubBetOdds() {
        return this.subBetOdds;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getIsSettled() {
        return this.isSettled;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getExciseTax() {
        return this.exciseTax;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getExciseTaxRatio() {
        return this.exciseTaxRatio;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Long getStakeBonus() {
        return this.stakeBonus;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getStakeBonusRatio() {
        return this.stakeBonusRatio;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getSortNum() {
        return this.sortNum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMinCorrectNumbersToWin() {
        return this.minCorrectNumbersToWin;
    }

    public final List<String> component5() {
        return this.selectedIds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getOriginStake() {
        return this.originStake;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getStake() {
        return this.stake;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getPotWinnings() {
        return this.potWinnings;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getWinnings() {
        return this.winnings;
    }

    public final SubBet copy(String subBetId, String userId, String betId, Integer minCorrectNumbersToWin, List<String> selectedIds, Long originStake, Long stake, Long potWinnings, Long winnings, Long cashOutAmount, Long bonus, String bonusPlanId, String bonusRatio, Long subBetOdds, Integer isSettled, Integer status, String description, Long exciseTax, Long exciseTaxRatio, Long stakeBonus, Long stakeBonusRatio, Long giftAmount, Long createTime, Long updateTime, Integer sortNum) {
        return new SubBet(subBetId, userId, betId, minCorrectNumbersToWin, selectedIds, originStake, stake, potWinnings, winnings, cashOutAmount, bonus, bonusPlanId, bonusRatio, subBetOdds, isSettled, status, description, exciseTax, exciseTaxRatio, stakeBonus, stakeBonusRatio, giftAmount, createTime, updateTime, sortNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubBet)) {
            return false;
        }
        SubBet subBet = (SubBet) other;
        return Intrinsics.g(this.subBetId, subBet.subBetId) && Intrinsics.g(this.userId, subBet.userId) && Intrinsics.g(this.betId, subBet.betId) && Intrinsics.g(this.minCorrectNumbersToWin, subBet.minCorrectNumbersToWin) && Intrinsics.g(this.selectedIds, subBet.selectedIds) && Intrinsics.g(this.originStake, subBet.originStake) && Intrinsics.g(this.stake, subBet.stake) && Intrinsics.g(this.potWinnings, subBet.potWinnings) && Intrinsics.g(this.winnings, subBet.winnings) && Intrinsics.g(this.cashOutAmount, subBet.cashOutAmount) && Intrinsics.g(this.bonus, subBet.bonus) && Intrinsics.g(this.bonusPlanId, subBet.bonusPlanId) && Intrinsics.g(this.bonusRatio, subBet.bonusRatio) && Intrinsics.g(this.subBetOdds, subBet.subBetOdds) && Intrinsics.g(this.isSettled, subBet.isSettled) && Intrinsics.g(this.status, subBet.status) && Intrinsics.g(this.description, subBet.description) && Intrinsics.g(this.exciseTax, subBet.exciseTax) && Intrinsics.g(this.exciseTaxRatio, subBet.exciseTaxRatio) && Intrinsics.g(this.stakeBonus, subBet.stakeBonus) && Intrinsics.g(this.stakeBonusRatio, subBet.stakeBonusRatio) && Intrinsics.g(this.giftAmount, subBet.giftAmount) && Intrinsics.g(this.createTime, subBet.createTime) && Intrinsics.g(this.updateTime, subBet.updateTime) && Intrinsics.g(this.sortNum, subBet.sortNum);
    }

    public final String getBetId() {
        return this.betId;
    }

    public final Long getBonus() {
        return this.bonus;
    }

    public final String getBonusPlanId() {
        return this.bonusPlanId;
    }

    public final String getBonusRatio() {
        return this.bonusRatio;
    }

    public final Long getCashOutAmount() {
        return this.cashOutAmount;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getExciseTax() {
        return this.exciseTax;
    }

    public final Long getExciseTaxRatio() {
        return this.exciseTaxRatio;
    }

    public final Long getGiftAmount() {
        return this.giftAmount;
    }

    public final Integer getMinCorrectNumbersToWin() {
        return this.minCorrectNumbersToWin;
    }

    public final Long getOriginStake() {
        return this.originStake;
    }

    public final Long getPotWinnings() {
        return this.potWinnings;
    }

    public final List<String> getSelectedIds() {
        return this.selectedIds;
    }

    public final Integer getSortNum() {
        return this.sortNum;
    }

    public final Long getStake() {
        return this.stake;
    }

    public final Long getStakeBonus() {
        return this.stakeBonus;
    }

    public final Long getStakeBonusRatio() {
        return this.stakeBonusRatio;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getSubBetId() {
        return this.subBetId;
    }

    public final Long getSubBetOdds() {
        return this.subBetOdds;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final Long getWinnings() {
        return this.winnings;
    }

    public int hashCode() {
        String str = this.subBetId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.betId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.minCorrectNumbersToWin;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.selectedIds;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.originStake;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.stake;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.potWinnings;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.winnings;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.cashOutAmount;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.bonus;
        int iHashCode11 = (iHashCode10 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str4 = this.bonusPlanId;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bonusRatio;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l7 = this.subBetOdds;
        int iHashCode14 = (iHashCode13 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num2 = this.isSettled;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.status;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l8 = this.exciseTax;
        int iHashCode18 = (iHashCode17 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.exciseTaxRatio;
        int iHashCode19 = (iHashCode18 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.stakeBonus;
        int iHashCode20 = (iHashCode19 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.stakeBonusRatio;
        int iHashCode21 = (iHashCode20 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.giftAmount;
        int iHashCode22 = (iHashCode21 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.createTime;
        int iHashCode23 = (iHashCode22 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.updateTime;
        int iHashCode24 = (iHashCode23 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num4 = this.sortNum;
        return iHashCode24 + (num4 != null ? num4.hashCode() : 0);
    }

    public final Integer isSettled() {
        return this.isSettled;
    }

    public String toString() {
        String str = this.subBetId;
        String str2 = this.userId;
        String str3 = this.betId;
        Integer num = this.minCorrectNumbersToWin;
        List<String> list = this.selectedIds;
        Long l = this.originStake;
        Long l2 = this.stake;
        Long l3 = this.potWinnings;
        Long l4 = this.winnings;
        Long l5 = this.cashOutAmount;
        Long l6 = this.bonus;
        String str4 = this.bonusPlanId;
        String str5 = this.bonusRatio;
        Long l7 = this.subBetOdds;
        Integer num2 = this.isSettled;
        Integer num3 = this.status;
        String str6 = this.description;
        Long l8 = this.exciseTax;
        Long l9 = this.exciseTaxRatio;
        Long l10 = this.stakeBonus;
        Long l11 = this.stakeBonusRatio;
        Long l12 = this.giftAmount;
        Long l13 = this.createTime;
        Long l14 = this.updateTime;
        Integer num4 = this.sortNum;
        StringBuilder sbA = ux5.a("SubBet(subBetId=", str, ", userId=", str2, ", betId=");
        oie.a(num, str3, ", minCorrectNumbersToWin=", ", selectedIds=", sbA);
        sbA.append(list);
        sbA.append(", originStake=");
        sbA.append(l);
        sbA.append(", stake=");
        sbA.append(l2);
        sbA.append(", potWinnings=");
        sbA.append(l3);
        sbA.append(", winnings=");
        sbA.append(l4);
        sbA.append(", cashOutAmount=");
        sbA.append(l5);
        sbA.append(", bonus=");
        sbA.append(l6);
        sbA.append(", bonusPlanId=");
        sbA.append(str4);
        sbA.append(", bonusRatio=");
        sbA.append(str5);
        sbA.append(", subBetOdds=");
        sbA.append(l7);
        sbA.append(", isSettled=");
        cv7.a(sbA, num2, ", status=", num3, ", description=");
        sbA.append(str6);
        sbA.append(", exciseTax=");
        sbA.append(l8);
        sbA.append(", exciseTaxRatio=");
        sbA.append(l9);
        sbA.append(", stakeBonus=");
        sbA.append(l10);
        sbA.append(", stakeBonusRatio=");
        sbA.append(l11);
        sbA.append(", giftAmount=");
        sbA.append(l12);
        sbA.append(", createTime=");
        sbA.append(l13);
        sbA.append(", updateTime=");
        sbA.append(l14);
        sbA.append(", sortNum=");
        return v.a(sbA, num4, ")");
    }
}
