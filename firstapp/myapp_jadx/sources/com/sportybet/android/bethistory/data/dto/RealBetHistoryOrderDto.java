package com.sportybet.android.bethistory.data.dto;

import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.UserNote;
import defpackage.cv7;
import defpackage.ew7;
import defpackage.hxa;
import defpackage.rg2;
import defpackage.w03;
import defpackage.zi50;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b \u0010!J\u0006\u0010A\u001a\u00020\u0015J\u0006\u0010B\u001a\u00020\u0015J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00101J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010P\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00109J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fHÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00109J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010V\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u00109J²\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010[J\u0014\u0010\\\u001a\u00020\u00152\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010^\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010_\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0010\n\u0002\u0010(\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u001b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0010\n\u0002\u0010(\u0012\u0004\b-\u0010%\u001a\u0004\b.\u0010'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b5\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b6\u0010'R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b7\u0010'R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010:\u001a\u0004\b;\u00109R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u0018\u00109R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001a\u00109R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001d\u00109R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010:\u001a\u0004\b@\u00109R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010:\u001a\u0004\b\u001f\u00109Ê\u0001\u0002\baÊ\u0001\f\bb\u0012\b\bc\u0012\u0004\b\u0003\u0010\u0000¨\u0006`"}, d2 = {"Lcom/sportybet/android/bethistory/data/dto/RealBetHistoryOrderDto;", "", "orderId", "", "orderType", "", "shareCode", "currency", "totalStake", "totalOdds", "winningStatus", "totalWinnings", "createTime", "", "selections", "", "Lcom/sportybet/plugin/realsports/data/RSelection;", "combinationSize", "minToWin", "selectionSize", "oddsBoosted", "", "lfbOddsBoosted", "featureTags", "isEditable", "betIds", "isOneCutWin", "userNote", "Lcom/sportybet/plugin/realsports/data/UserNote;", "isPaymentInProgress", "hasPendingEvent", "isPublished", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Lcom/sportybet/plugin/realsports/data/UserNote;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getOrderId", "()Ljava/lang/String;", "getOrderType$annotations", "()V", "getOrderType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShareCode", "getCurrency", "getTotalStake", "getTotalOdds", "getWinningStatus$annotations", "getWinningStatus", "getTotalWinnings", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSelections", "()Ljava/util/List;", "getCombinationSize", "getMinToWin", "getSelectionSize", "getOddsBoosted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLfbOddsBoosted", "getFeatureTags", "getBetIds", "getUserNote", "()Lcom/sportybet/plugin/realsports/data/UserNote;", "getHasPendingEvent", "isOneCutBet", "isPartialPayout", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Lcom/sportybet/plugin/realsports/data/UserNote;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sportybet/android/bethistory/data/dto/RealBetHistoryOrderDto;", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RealBetHistoryOrderDto {
    public static final int $stable = UserNote.$stable;
    private final List<String> betIds;
    private final Integer combinationSize;
    private final Long createTime;
    private final String currency;
    private final List<Integer> featureTags;
    private final Boolean hasPendingEvent;
    private final Boolean isEditable;
    private final Boolean isOneCutWin;
    private final Boolean isPaymentInProgress;
    private final Boolean isPublished;
    private final Boolean lfbOddsBoosted;
    private final Integer minToWin;
    private final Boolean oddsBoosted;
    private final String orderId;
    private final Integer orderType;
    private final Integer selectionSize;
    private final List<RSelection> selections;
    private final String shareCode;
    private final String totalOdds;
    private final String totalStake;
    private final String totalWinnings;
    private final UserNote userNote;
    private final Integer winningStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public RealBetHistoryOrderDto(String str, Integer num, String str2, String str3, String str4, String str5, Integer num2, String str6, Long l, List<? extends RSelection> list, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, List<Integer> list2, Boolean bool3, List<String> list3, Boolean bool4, UserNote userNote, Boolean bool5, Boolean bool6, Boolean bool7) {
        str.getClass();
        this.orderId = str;
        this.orderType = num;
        this.shareCode = str2;
        this.currency = str3;
        this.totalStake = str4;
        this.totalOdds = str5;
        this.winningStatus = num2;
        this.totalWinnings = str6;
        this.createTime = l;
        this.selections = list;
        this.combinationSize = num3;
        this.minToWin = num4;
        this.selectionSize = num5;
        this.oddsBoosted = bool;
        this.lfbOddsBoosted = bool2;
        this.featureTags = list2;
        this.isEditable = bool3;
        this.betIds = list3;
        this.isOneCutWin = bool4;
        this.userNote = userNote;
        this.isPaymentInProgress = bool5;
        this.hasPendingEvent = bool6;
        this.isPublished = bool7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RealBetHistoryOrderDto copy$default(RealBetHistoryOrderDto realBetHistoryOrderDto, String str, Integer num, String str2, String str3, String str4, String str5, Integer num2, String str6, Long l, List list, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, List list2, Boolean bool3, List list3, Boolean bool4, UserNote userNote, Boolean bool5, Boolean bool6, Boolean bool7, int i, Object obj) {
        Boolean bool8;
        Boolean bool9;
        String str7 = (i & 1) != 0 ? realBetHistoryOrderDto.orderId : str;
        Integer num6 = (i & 2) != 0 ? realBetHistoryOrderDto.orderType : num;
        String str8 = (i & 4) != 0 ? realBetHistoryOrderDto.shareCode : str2;
        String str9 = (i & 8) != 0 ? realBetHistoryOrderDto.currency : str3;
        String str10 = (i & 16) != 0 ? realBetHistoryOrderDto.totalStake : str4;
        String str11 = (i & 32) != 0 ? realBetHistoryOrderDto.totalOdds : str5;
        Integer num7 = (i & 64) != 0 ? realBetHistoryOrderDto.winningStatus : num2;
        String str12 = (i & 128) != 0 ? realBetHistoryOrderDto.totalWinnings : str6;
        Long l2 = (i & 256) != 0 ? realBetHistoryOrderDto.createTime : l;
        List list4 = (i & 512) != 0 ? realBetHistoryOrderDto.selections : list;
        Integer num8 = (i & 1024) != 0 ? realBetHistoryOrderDto.combinationSize : num3;
        Integer num9 = (i & 2048) != 0 ? realBetHistoryOrderDto.minToWin : num4;
        Integer num10 = (i & 4096) != 0 ? realBetHistoryOrderDto.selectionSize : num5;
        Boolean bool10 = (i & 8192) != 0 ? realBetHistoryOrderDto.oddsBoosted : bool;
        String str13 = str7;
        Boolean bool11 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? realBetHistoryOrderDto.lfbOddsBoosted : bool2;
        List list5 = (i & 32768) != 0 ? realBetHistoryOrderDto.featureTags : list2;
        Boolean bool12 = (i & 65536) != 0 ? realBetHistoryOrderDto.isEditable : bool3;
        List list6 = (i & 131072) != 0 ? realBetHistoryOrderDto.betIds : list3;
        Boolean bool13 = (i & 262144) != 0 ? realBetHistoryOrderDto.isOneCutWin : bool4;
        UserNote userNote2 = (i & 524288) != 0 ? realBetHistoryOrderDto.userNote : userNote;
        Boolean bool14 = (i & 1048576) != 0 ? realBetHistoryOrderDto.isPaymentInProgress : bool5;
        Boolean bool15 = (i & 2097152) != 0 ? realBetHistoryOrderDto.hasPendingEvent : bool6;
        if ((i & 4194304) != 0) {
            bool9 = bool15;
            bool8 = realBetHistoryOrderDto.isPublished;
        } else {
            bool8 = bool7;
            bool9 = bool15;
        }
        return realBetHistoryOrderDto.copy(str13, num6, str8, str9, str10, str11, num7, str12, l2, list4, num8, num9, num10, bool10, bool11, list5, bool12, list6, bool13, userNote2, bool14, bool9, bool8);
    }

    public static /* synthetic */ void getOrderType$annotations() {
    }

    public static /* synthetic */ void getWinningStatus$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final List<RSelection> component10() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getCombinationSize() {
        return this.combinationSize;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getMinToWin() {
        return this.minToWin;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getSelectionSize() {
        return this.selectionSize;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getOddsBoosted() {
        return this.oddsBoosted;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getLfbOddsBoosted() {
        return this.lfbOddsBoosted;
    }

    public final List<Integer> component16() {
        return this.featureTags;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsEditable() {
        return this.isEditable;
    }

    public final List<String> component18() {
        return this.betIds;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getIsOneCutWin() {
        return this.isOneCutWin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final UserNote getUserNote() {
        return this.userNote;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getIsPaymentInProgress() {
        return this.isPaymentInProgress;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getHasPendingEvent() {
        return this.hasPendingEvent;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Boolean getIsPublished() {
        return this.isPublished;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalOdds() {
        return this.totalOdds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getWinningStatus() {
        return this.winningStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTotalWinnings() {
        return this.totalWinnings;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    public final RealBetHistoryOrderDto copy(String orderId, Integer orderType, String shareCode, String currency, String totalStake, String totalOdds, Integer winningStatus, String totalWinnings, Long createTime, List<? extends RSelection> selections, Integer combinationSize, Integer minToWin, Integer selectionSize, Boolean oddsBoosted, Boolean lfbOddsBoosted, List<Integer> featureTags, Boolean isEditable, List<String> betIds, Boolean isOneCutWin, UserNote userNote, Boolean isPaymentInProgress, Boolean hasPendingEvent, Boolean isPublished) {
        orderId.getClass();
        return new RealBetHistoryOrderDto(orderId, orderType, shareCode, currency, totalStake, totalOdds, winningStatus, totalWinnings, createTime, selections, combinationSize, minToWin, selectionSize, oddsBoosted, lfbOddsBoosted, featureTags, isEditable, betIds, isOneCutWin, userNote, isPaymentInProgress, hasPendingEvent, isPublished);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealBetHistoryOrderDto)) {
            return false;
        }
        RealBetHistoryOrderDto realBetHistoryOrderDto = (RealBetHistoryOrderDto) other;
        return Intrinsics.g(this.orderId, realBetHistoryOrderDto.orderId) && Intrinsics.g(this.orderType, realBetHistoryOrderDto.orderType) && Intrinsics.g(this.shareCode, realBetHistoryOrderDto.shareCode) && Intrinsics.g(this.currency, realBetHistoryOrderDto.currency) && Intrinsics.g(this.totalStake, realBetHistoryOrderDto.totalStake) && Intrinsics.g(this.totalOdds, realBetHistoryOrderDto.totalOdds) && Intrinsics.g(this.winningStatus, realBetHistoryOrderDto.winningStatus) && Intrinsics.g(this.totalWinnings, realBetHistoryOrderDto.totalWinnings) && Intrinsics.g(this.createTime, realBetHistoryOrderDto.createTime) && Intrinsics.g(this.selections, realBetHistoryOrderDto.selections) && Intrinsics.g(this.combinationSize, realBetHistoryOrderDto.combinationSize) && Intrinsics.g(this.minToWin, realBetHistoryOrderDto.minToWin) && Intrinsics.g(this.selectionSize, realBetHistoryOrderDto.selectionSize) && Intrinsics.g(this.oddsBoosted, realBetHistoryOrderDto.oddsBoosted) && Intrinsics.g(this.lfbOddsBoosted, realBetHistoryOrderDto.lfbOddsBoosted) && Intrinsics.g(this.featureTags, realBetHistoryOrderDto.featureTags) && Intrinsics.g(this.isEditable, realBetHistoryOrderDto.isEditable) && Intrinsics.g(this.betIds, realBetHistoryOrderDto.betIds) && Intrinsics.g(this.isOneCutWin, realBetHistoryOrderDto.isOneCutWin) && Intrinsics.g(this.userNote, realBetHistoryOrderDto.userNote) && Intrinsics.g(this.isPaymentInProgress, realBetHistoryOrderDto.isPaymentInProgress) && Intrinsics.g(this.hasPendingEvent, realBetHistoryOrderDto.hasPendingEvent) && Intrinsics.g(this.isPublished, realBetHistoryOrderDto.isPublished);
    }

    public final List<String> getBetIds() {
        return this.betIds;
    }

    public final Integer getCombinationSize() {
        return this.combinationSize;
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

    public final Boolean getHasPendingEvent() {
        return this.hasPendingEvent;
    }

    public final Boolean getLfbOddsBoosted() {
        return this.lfbOddsBoosted;
    }

    public final Integer getMinToWin() {
        return this.minToWin;
    }

    public final Boolean getOddsBoosted() {
        return this.oddsBoosted;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Integer getOrderType() {
        return this.orderType;
    }

    public final Integer getSelectionSize() {
        return this.selectionSize;
    }

    public final List<RSelection> getSelections() {
        return this.selections;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final String getTotalOdds() {
        return this.totalOdds;
    }

    public final String getTotalStake() {
        return this.totalStake;
    }

    public final String getTotalWinnings() {
        return this.totalWinnings;
    }

    public final UserNote getUserNote() {
        return this.userNote;
    }

    public final Integer getWinningStatus() {
        return this.winningStatus;
    }

    public int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        Integer num = this.orderType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.shareCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.totalStake;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalOdds;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.winningStatus;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.totalWinnings;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        List<RSelection> list = this.selections;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.combinationSize;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minToWin;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.selectionSize;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.oddsBoosted;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.lfbOddsBoosted;
        int iHashCode15 = (iHashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list2 = this.featureTags;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool3 = this.isEditable;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list3 = this.betIds;
        int iHashCode18 = (iHashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool4 = this.isOneCutWin;
        int iHashCode19 = (iHashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        UserNote userNote = this.userNote;
        int iHashCode20 = (iHashCode19 + (userNote == null ? 0 : userNote.hashCode())) * 31;
        Boolean bool5 = this.isPaymentInProgress;
        int iHashCode21 = (iHashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasPendingEvent;
        int iHashCode22 = (iHashCode21 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isPublished;
        return iHashCode22 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final Boolean isEditable() {
        return this.isEditable;
    }

    public final boolean isOneCutBet() {
        List<Integer> list = this.featureTags;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Number) it.next()).intValue() == 5) {
                return true;
            }
        }
        return false;
    }

    public final Boolean isOneCutWin() {
        return this.isOneCutWin;
    }

    public final boolean isPartialPayout() {
        Object bVar;
        Integer num;
        Boolean boolValueOf;
        try {
            zi50.a aVar = zi50.b;
            Integer num2 = this.orderType;
            boolean z = false;
            if (num2 != null && num2.intValue() == 4 && (num = this.winningStatus) != null && num.intValue() == 20) {
                String str = this.totalWinnings;
                String str2 = this.totalStake;
                if (str == null || str2 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(Double.parseDouble(str) < Double.parseDouble(str2));
                }
                if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                    z = true;
                }
            }
            bVar = Boolean.valueOf(z);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = Boolean.FALSE;
        }
        return ((Boolean) bVar).booleanValue();
    }

    public final Boolean isPaymentInProgress() {
        return this.isPaymentInProgress;
    }

    public final Boolean isPublished() {
        return this.isPublished;
    }

    public String toString() {
        String str = this.orderId;
        Integer num = this.orderType;
        String str2 = this.shareCode;
        String str3 = this.currency;
        String str4 = this.totalStake;
        String str5 = this.totalOdds;
        Integer num2 = this.winningStatus;
        String str6 = this.totalWinnings;
        Long l = this.createTime;
        List<RSelection> list = this.selections;
        Integer num3 = this.combinationSize;
        Integer num4 = this.minToWin;
        Integer num5 = this.selectionSize;
        Boolean bool = this.oddsBoosted;
        Boolean bool2 = this.lfbOddsBoosted;
        List<Integer> list2 = this.featureTags;
        Boolean bool3 = this.isEditable;
        List<String> list3 = this.betIds;
        Boolean bool4 = this.isOneCutWin;
        UserNote userNote = this.userNote;
        Boolean bool5 = this.isPaymentInProgress;
        Boolean bool6 = this.hasPendingEvent;
        Boolean bool7 = this.isPublished;
        StringBuilder sbA = ew7.a(num, "RealBetHistoryOrderDto(orderId=", str, ", orderType=", ", shareCode=");
        hxa.c(sbA, str2, ", currency=", str3, ", totalStake=");
        hxa.c(sbA, str4, ", totalOdds=", str5, ", winningStatus=");
        w03.a(num2, ", totalWinnings=", str6, ", createTime=", sbA);
        sbA.append(l);
        sbA.append(", selections=");
        sbA.append(list);
        sbA.append(", combinationSize=");
        cv7.a(sbA, num3, ", minToWin=", num4, ", selectionSize=");
        sbA.append(num5);
        sbA.append(", oddsBoosted=");
        sbA.append(bool);
        sbA.append(", lfbOddsBoosted=");
        sbA.append(bool2);
        sbA.append(", featureTags=");
        sbA.append(list2);
        sbA.append(", isEditable=");
        sbA.append(bool3);
        sbA.append(", betIds=");
        sbA.append(list3);
        sbA.append(", isOneCutWin=");
        sbA.append(bool4);
        sbA.append(", userNote=");
        sbA.append(userNote);
        sbA.append(", isPaymentInProgress=");
        sbA.append(bool5);
        sbA.append(", hasPendingEvent=");
        sbA.append(bool6);
        sbA.append(", isPublished=");
        return rg2.a(sbA, bool7, ")");
    }
}
