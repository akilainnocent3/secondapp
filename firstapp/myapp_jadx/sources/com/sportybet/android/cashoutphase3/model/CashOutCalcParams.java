package com.sportybet.android.cashoutphase3.model;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sporty.android.core.model.cashout.CashoutJsData;
import com.sporty.android.core.model.cashout.CashoutProviderMarketRulesMap;
import com.sporty.android.core.model.cashout.CashoutSuspendDeactivateAllowConfigs;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.CashOutBetJs;
import com.sportybet.plugin.realsports.data.SubBet;
import defpackage.ai50;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hfb0;
import defpackage.hxa;
import defpackage.kya0;
import defpackage.mtg0;
import defpackage.n36;
import defpackage.oie;
import defpackage.uts;
import defpackage.wxa;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u000256Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\n\u0010'\u001a\u00020\u0003H\u0096\u0080\u0004J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u001d\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010HÆ\u0003Ju\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010HÆ\u0001J\u0014\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00103\u001a\u000204HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR'\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R%\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&Ê\u0001\u0002\b8Ê\u0001\f\b9\u0012\b\b:\u0012\u0004\b\u0003\u0010\u0000¨\u00067"}, d2 = {"Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams;", "", "userId", "", "bet", "Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$BetParams;", "apiConfig", "Lcom/sporty/android/core/model/cashout/CashoutJsData;", "cashoutSuspendDeactivateAllowConfigs", "Lcom/sporty/android/core/model/cashout/CashoutSuspendDeactivateAllowConfigs;", "cashoutSuspendDeactivatePhase", "cashoutEventAbandonedEnabled", "", "fallbackConfig", "Lcom/sporty/android/core/model/cashout/CashOutFallbackData;", "cashoutProviderMarketRules", "", "", "Lcom/sporty/android/core/model/cashout/CashoutProviderMarketRulesMap$Action;", "<init>", "(Ljava/lang/String;Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$BetParams;Lcom/sporty/android/core/model/cashout/CashoutJsData;Lcom/sporty/android/core/model/cashout/CashoutSuspendDeactivateAllowConfigs;Ljava/lang/String;ZLcom/sporty/android/core/model/cashout/CashOutFallbackData;Ljava/util/Map;)V", "getUserId", "()Ljava/lang/String;", "getBet", "()Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$BetParams;", "getApiConfig", "()Lcom/sporty/android/core/model/cashout/CashoutJsData;", "getCashoutSuspendDeactivateAllowConfigs", "()Lcom/sporty/android/core/model/cashout/CashoutSuspendDeactivateAllowConfigs;", "Lcom/google/gson/annotations/SerializedName;", "value", "cashoutOfferConfigs", "getCashoutSuspendDeactivatePhase", "getCashoutEventAbandonedEnabled", "()Z", "getFallbackConfig", "()Lcom/sporty/android/core/model/cashout/CashOutFallbackData;", "getCashoutProviderMarketRules", "()Ljava/util/Map;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "BetParams", "CashOutParams", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutCalcParams {
    public static final int $stable = 8;
    private final CashoutJsData apiConfig;
    private final BetParams bet;
    private final boolean cashoutEventAbandonedEnabled;
    private final Map<String, List<CashoutProviderMarketRulesMap.Action>> cashoutProviderMarketRules;

    @SerializedName("cashoutOfferConfigs")
    private final CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs;
    private final String cashoutSuspendDeactivatePhase;
    private final CashOutFallbackData fallbackConfig;
    private final String userId;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J¨\u0001\u00107\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u00108J\u0014\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010<\u001a\u00020\bHÖ\u0081\u0004J\n\u0010=\u001a\u00020\nHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)Ê\u0001\u0002\b?Ê\u0001\f\b@\u0012\b\bA\u0012\u0004\b\u0003\u0010\u0002¨\u0006>"}, d2 = {"Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$BetParams;", "", "selections", "", "Lcom/sportybet/plugin/realsports/data/CashOutBetJs;", "subBets", "Lcom/sportybet/plugin/realsports/data/SubBet;", "betType", "", "orderType", "", "stake", "originStake", "currency", "minToWin", AnalyticsParam.EVENT_PARAM_ID, "giftKind", "giftAmount", "featureTags", "cashOut", "Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$CashOutParams;", "<init>", "(Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$CashOutParams;)V", "getSelections", "()Ljava/util/List;", "getSubBets", "getBetType", "()I", "getOrderType", "()Ljava/lang/String;", "getStake", "getOriginStake", "getCurrency", "getMinToWin", "getId", "getGiftKind", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGiftAmount", "getFeatureTags", "getCashOut", "()Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$CashOutParams;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$CashOutParams;)Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$BetParams;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BetParams {
        public static final int $stable = 0;
        private final int betType;
        private final CashOutParams cashOut;
        private final String currency;
        private final List<Integer> featureTags;
        private final String giftAmount;
        private final Integer giftKind;
        private final String id;
        private final int minToWin;
        private final String orderType;
        private final String originStake;
        private final List<CashOutBetJs> selections;
        private final String stake;
        private final List<SubBet> subBets;

        public BetParams(List<CashOutBetJs> list, List<SubBet> list2, int i, String str, String str2, String str3, String str4, int i2, String str5, Integer num, String str6, List<Integer> list3, CashOutParams cashOutParams) {
            list.getClass();
            list2.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            cashOutParams.getClass();
            this.selections = list;
            this.subBets = list2;
            this.betType = i;
            this.orderType = str;
            this.stake = str2;
            this.originStake = str3;
            this.currency = str4;
            this.minToWin = i2;
            this.id = str5;
            this.giftKind = num;
            this.giftAmount = str6;
            this.featureTags = list3;
            this.cashOut = cashOutParams;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BetParams copy$default(BetParams betParams, List list, List list2, int i, String str, String str2, String str3, String str4, int i2, String str5, Integer num, String str6, List list3, CashOutParams cashOutParams, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                list = betParams.selections;
            }
            return betParams.copy(list, (i3 & 2) != 0 ? betParams.subBets : list2, (i3 & 4) != 0 ? betParams.betType : i, (i3 & 8) != 0 ? betParams.orderType : str, (i3 & 16) != 0 ? betParams.stake : str2, (i3 & 32) != 0 ? betParams.originStake : str3, (i3 & 64) != 0 ? betParams.currency : str4, (i3 & 128) != 0 ? betParams.minToWin : i2, (i3 & 256) != 0 ? betParams.id : str5, (i3 & 512) != 0 ? betParams.giftKind : num, (i3 & 1024) != 0 ? betParams.giftAmount : str6, (i3 & 2048) != 0 ? betParams.featureTags : list3, (i3 & 4096) != 0 ? betParams.cashOut : cashOutParams);
        }

        public final List<CashOutBetJs> component1() {
            return this.selections;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Integer getGiftKind() {
            return this.giftKind;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getGiftAmount() {
            return this.giftAmount;
        }

        public final List<Integer> component12() {
            return this.featureTags;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final CashOutParams getCashOut() {
            return this.cashOut;
        }

        public final List<SubBet> component2() {
            return this.subBets;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBetType() {
            return this.betType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getStake() {
            return this.stake;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getOriginStake() {
            return this.originStake;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getMinToWin() {
            return this.minToWin;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final BetParams copy(List<CashOutBetJs> selections, List<SubBet> subBets, int betType, String orderType, String stake, String originStake, String currency, int minToWin, String id, Integer giftKind, String giftAmount, List<Integer> featureTags, CashOutParams cashOut) {
            selections.getClass();
            subBets.getClass();
            orderType.getClass();
            stake.getClass();
            originStake.getClass();
            currency.getClass();
            id.getClass();
            cashOut.getClass();
            return new BetParams(selections, subBets, betType, orderType, stake, originStake, currency, minToWin, id, giftKind, giftAmount, featureTags, cashOut);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BetParams)) {
                return false;
            }
            BetParams betParams = (BetParams) other;
            return Intrinsics.g(this.selections, betParams.selections) && Intrinsics.g(this.subBets, betParams.subBets) && this.betType == betParams.betType && Intrinsics.g(this.orderType, betParams.orderType) && Intrinsics.g(this.stake, betParams.stake) && Intrinsics.g(this.originStake, betParams.originStake) && Intrinsics.g(this.currency, betParams.currency) && this.minToWin == betParams.minToWin && Intrinsics.g(this.id, betParams.id) && Intrinsics.g(this.giftKind, betParams.giftKind) && Intrinsics.g(this.giftAmount, betParams.giftAmount) && Intrinsics.g(this.featureTags, betParams.featureTags) && Intrinsics.g(this.cashOut, betParams.cashOut);
        }

        public final int getBetType() {
            return this.betType;
        }

        public final CashOutParams getCashOut() {
            return this.cashOut;
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

        public final String getId() {
            return this.id;
        }

        public final int getMinToWin() {
            return this.minToWin;
        }

        public final String getOrderType() {
            return this.orderType;
        }

        public final String getOriginStake() {
            return this.originStake;
        }

        public final List<CashOutBetJs> getSelections() {
            return this.selections;
        }

        public final String getStake() {
            return this.stake;
        }

        public final List<SubBet> getSubBets() {
            return this.subBets;
        }

        public int hashCode() {
            int iA = gmf0.a(gpp.a(this.minToWin, gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.betType, ai50.a(this.selections.hashCode() * 31, 31, this.subBets), 31), 31, this.orderType), 31, this.stake), 31, this.originStake), 31, this.currency), 31), 31, this.id);
            Integer num = this.giftKind;
            int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.giftAmount;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Integer> list = this.featureTags;
            return this.cashOut.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
        }

        public String toString() {
            List<CashOutBetJs> list = this.selections;
            List<SubBet> list2 = this.subBets;
            int i = this.betType;
            String str = this.orderType;
            String str2 = this.stake;
            String str3 = this.originStake;
            String str4 = this.currency;
            int i2 = this.minToWin;
            String str5 = this.id;
            Integer num = this.giftKind;
            String str6 = this.giftAmount;
            List<Integer> list3 = this.featureTags;
            CashOutParams cashOutParams = this.cashOut;
            StringBuilder sbA = hfb0.a("BetParams(selections=", ", subBets=", ", betType=", list, list2);
            f78.b(i, ", orderType=", str, ", stake=", sbA);
            hxa.c(sbA, str2, ", originStake=", str3, ", currency=");
            wxa.b(i2, str4, ", minToWin=", ", id=", sbA);
            oie.a(num, str5, ", giftKind=", ", giftAmount=", sbA);
            kya0.b(str6, ", featureTags=", ", cashOut=", sbA, list3);
            sbA.append(cashOutParams);
            sbA.append(")");
            return sbA.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/android/cashoutphase3/model/CashOutCalcParams$CashOutParams;", "", "maxCount", "", "remainCount", "<init>", "(II)V", "getMaxCount", "()I", "getRemainCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CashOutParams {
        public static final int $stable = 0;
        private final int maxCount;
        private final int remainCount;

        public CashOutParams(int i, int i2) {
            this.maxCount = i;
            this.remainCount = i2;
        }

        public static /* synthetic */ CashOutParams copy$default(CashOutParams cashOutParams, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = cashOutParams.maxCount;
            }
            if ((i3 & 2) != 0) {
                i2 = cashOutParams.remainCount;
            }
            return cashOutParams.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMaxCount() {
            return this.maxCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getRemainCount() {
            return this.remainCount;
        }

        public final CashOutParams copy(int maxCount, int remainCount) {
            return new CashOutParams(maxCount, remainCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashOutParams)) {
                return false;
            }
            CashOutParams cashOutParams = (CashOutParams) other;
            return this.maxCount == cashOutParams.maxCount && this.remainCount == cashOutParams.remainCount;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final int getRemainCount() {
            return this.remainCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.remainCount) + (Integer.hashCode(this.maxCount) * 31);
        }

        public String toString() {
            return n36.a("CashOutParams(maxCount=", this.maxCount, this.remainCount, ", remainCount=", ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashOutCalcParams(String str, BetParams betParams, CashoutJsData cashoutJsData, CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs, String str2, boolean z, CashOutFallbackData cashOutFallbackData, Map<String, ? extends List<CashoutProviderMarketRulesMap.Action>> map) {
        betParams.getClass();
        cashoutJsData.getClass();
        this.userId = str;
        this.bet = betParams;
        this.apiConfig = cashoutJsData;
        this.cashoutSuspendDeactivateAllowConfigs = cashoutSuspendDeactivateAllowConfigs;
        this.cashoutSuspendDeactivatePhase = str2;
        this.cashoutEventAbandonedEnabled = z;
        this.fallbackConfig = cashOutFallbackData;
        this.cashoutProviderMarketRules = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutCalcParams copy$default(CashOutCalcParams cashOutCalcParams, String str, BetParams betParams, CashoutJsData cashoutJsData, CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs, String str2, boolean z, CashOutFallbackData cashOutFallbackData, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashOutCalcParams.userId;
        }
        if ((i & 2) != 0) {
            betParams = cashOutCalcParams.bet;
        }
        if ((i & 4) != 0) {
            cashoutJsData = cashOutCalcParams.apiConfig;
        }
        if ((i & 8) != 0) {
            cashoutSuspendDeactivateAllowConfigs = cashOutCalcParams.cashoutSuspendDeactivateAllowConfigs;
        }
        if ((i & 16) != 0) {
            str2 = cashOutCalcParams.cashoutSuspendDeactivatePhase;
        }
        if ((i & 32) != 0) {
            z = cashOutCalcParams.cashoutEventAbandonedEnabled;
        }
        if ((i & 64) != 0) {
            cashOutFallbackData = cashOutCalcParams.fallbackConfig;
        }
        if ((i & 128) != 0) {
            map = cashOutCalcParams.cashoutProviderMarketRules;
        }
        CashOutFallbackData cashOutFallbackData2 = cashOutFallbackData;
        Map map2 = map;
        String str3 = str2;
        boolean z2 = z;
        return cashOutCalcParams.copy(str, betParams, cashoutJsData, cashoutSuspendDeactivateAllowConfigs, str3, z2, cashOutFallbackData2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BetParams getBet() {
        return this.bet;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CashoutJsData getApiConfig() {
        return this.apiConfig;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CashoutSuspendDeactivateAllowConfigs getCashoutSuspendDeactivateAllowConfigs() {
        return this.cashoutSuspendDeactivateAllowConfigs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCashoutSuspendDeactivatePhase() {
        return this.cashoutSuspendDeactivatePhase;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCashoutEventAbandonedEnabled() {
        return this.cashoutEventAbandonedEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CashOutFallbackData getFallbackConfig() {
        return this.fallbackConfig;
    }

    public final Map<String, List<CashoutProviderMarketRulesMap.Action>> component8() {
        return this.cashoutProviderMarketRules;
    }

    public final CashOutCalcParams copy(String userId, BetParams bet, CashoutJsData apiConfig, CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs, String cashoutSuspendDeactivatePhase, boolean cashoutEventAbandonedEnabled, CashOutFallbackData fallbackConfig, Map<String, ? extends List<CashoutProviderMarketRulesMap.Action>> cashoutProviderMarketRules) {
        bet.getClass();
        apiConfig.getClass();
        return new CashOutCalcParams(userId, bet, apiConfig, cashoutSuspendDeactivateAllowConfigs, cashoutSuspendDeactivatePhase, cashoutEventAbandonedEnabled, fallbackConfig, cashoutProviderMarketRules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutCalcParams)) {
            return false;
        }
        CashOutCalcParams cashOutCalcParams = (CashOutCalcParams) other;
        return Intrinsics.g(this.userId, cashOutCalcParams.userId) && Intrinsics.g(this.bet, cashOutCalcParams.bet) && Intrinsics.g(this.apiConfig, cashOutCalcParams.apiConfig) && Intrinsics.g(this.cashoutSuspendDeactivateAllowConfigs, cashOutCalcParams.cashoutSuspendDeactivateAllowConfigs) && Intrinsics.g(this.cashoutSuspendDeactivatePhase, cashOutCalcParams.cashoutSuspendDeactivatePhase) && this.cashoutEventAbandonedEnabled == cashOutCalcParams.cashoutEventAbandonedEnabled && Intrinsics.g(this.fallbackConfig, cashOutCalcParams.fallbackConfig) && Intrinsics.g(this.cashoutProviderMarketRules, cashOutCalcParams.cashoutProviderMarketRules);
    }

    public final CashoutJsData getApiConfig() {
        return this.apiConfig;
    }

    public final BetParams getBet() {
        return this.bet;
    }

    public final boolean getCashoutEventAbandonedEnabled() {
        return this.cashoutEventAbandonedEnabled;
    }

    public final Map<String, List<CashoutProviderMarketRulesMap.Action>> getCashoutProviderMarketRules() {
        return this.cashoutProviderMarketRules;
    }

    public final CashoutSuspendDeactivateAllowConfigs getCashoutSuspendDeactivateAllowConfigs() {
        return this.cashoutSuspendDeactivateAllowConfigs;
    }

    public final String getCashoutSuspendDeactivatePhase() {
        return this.cashoutSuspendDeactivatePhase;
    }

    public final CashOutFallbackData getFallbackConfig() {
        return this.fallbackConfig;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (this.apiConfig.hashCode() + ((this.bet.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs = this.cashoutSuspendDeactivateAllowConfigs;
        int iHashCode2 = (iHashCode + (cashoutSuspendDeactivateAllowConfigs == null ? 0 : cashoutSuspendDeactivateAllowConfigs.hashCode())) * 31;
        String str2 = this.cashoutSuspendDeactivatePhase;
        int iA = mtg0.a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.cashoutEventAbandonedEnabled);
        CashOutFallbackData cashOutFallbackData = this.fallbackConfig;
        int iHashCode3 = (iA + (cashOutFallbackData == null ? 0 : cashOutFallbackData.hashCode())) * 31;
        Map<String, List<CashoutProviderMarketRulesMap.Action>> map = this.cashoutProviderMarketRules;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.userId;
        BetParams betParams = this.bet;
        CashoutJsData cashoutJsData = this.apiConfig;
        CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs = this.cashoutSuspendDeactivateAllowConfigs;
        String str2 = this.cashoutSuspendDeactivatePhase;
        boolean z = this.cashoutEventAbandonedEnabled;
        CashOutFallbackData cashOutFallbackData = this.fallbackConfig;
        Map<String, List<CashoutProviderMarketRulesMap.Action>> map = this.cashoutProviderMarketRules;
        StringBuilder sb = new StringBuilder("CashOutCalcParams(userId=");
        sb.append(str);
        sb.append(", bet=");
        sb.append(betParams);
        sb.append(", apiConfig=");
        sb.append(cashoutJsData);
        sb.append(", cashoutOfferConfigs=");
        sb.append(cashoutSuspendDeactivateAllowConfigs);
        sb.append(", cashoutSuspendDeactivatePhase=");
        uts.b(str2, ", cashoutEventAbandonedEnabled=", ", fallbackConfig=", sb, z);
        sb.append(cashOutFallbackData);
        sb.append(", cashoutProviderMarketRules=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ CashOutCalcParams(String str, BetParams betParams, CashoutJsData cashoutJsData, CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs, String str2, boolean z, CashOutFallbackData cashOutFallbackData, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, betParams, cashoutJsData, cashoutSuspendDeactivateAllowConfigs, str2, z, (i & 64) != 0 ? null : cashOutFallbackData, (i & 128) != 0 ? null : map);
    }
}
