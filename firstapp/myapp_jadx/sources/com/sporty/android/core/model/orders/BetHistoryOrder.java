package com.sporty.android.core.model.orders;

import com.google.gson.annotations.SerializedName;
import defpackage.cv7;
import defpackage.ew7;
import defpackage.hxa;
import defpackage.rg2;
import defpackage.w03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010,J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010G\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00104J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00104J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010M\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010N\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010P\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00104J\u009a\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010RJ\u0014\u0010S\u001a\u00020\u00132\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010U\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010V\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R)\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b)\u0010%R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R)\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\n¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R)\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000f¢\u0006\n\n\u0002\u0010&\u001a\u0004\b0\u0010%R)\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0010¢\u0006\n\n\u0002\u0010&\u001a\u0004\b1\u0010%R)\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0011¢\u0006\n\n\u0002\u0010&\u001a\u0004\b2\u0010%R)\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0012¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R)\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0014¢\u0006\n\n\u0002\u00105\u001a\u0004\b6\u00104R-\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R)\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0016¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0016\u00104R-\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u0010/R)\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0018¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0018\u00104R)\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0019¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0019\u00104R'\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001a¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R)\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001c¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u001c\u00104R)\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d¢\u0006\n\n\u0002\u00105\u001a\u0004\b;\u00104¨\u0006W"}, d2 = {"Lcom/sporty/android/core/model/orders/BetHistoryOrder;", "", "orderId", "", "orderType", "", "shareCode", "totalStake", "winningStatus", "totalWinnings", "createTime", "", "selections", "", "Lcom/sporty/android/core/model/orders/BetSelection;", "combinationSize", "minToWin", "selectionSize", "oddsBoosted", "", "lfbOddsBoosted", "featureTags", "isEditable", "betIds", "isOneCutWin", "isPublished", "userNote", "Lcom/sporty/android/core/model/orders/UserNoteDto;", "isPaymentInProgress", "hasPendingEvent", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sporty/android/core/model/orders/UserNoteDto;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getOrderId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOrderType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShareCode", "getTotalStake", "getWinningStatus", "getTotalWinnings", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSelections", "()Ljava/util/List;", "getCombinationSize", "getMinToWin", "getSelectionSize", "getOddsBoosted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLfbOddsBoosted", "getFeatureTags", "getBetIds", "getUserNote", "()Lcom/sporty/android/core/model/orders/UserNoteDto;", "getHasPendingEvent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sporty/android/core/model/orders/UserNoteDto;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/orders/BetHistoryOrder;", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetHistoryOrder {

    @SerializedName("betIds")
    private final List<String> betIds;

    @SerializedName("combinationSize")
    private final Integer combinationSize;

    @SerializedName("createTime")
    private final Long createTime;

    @SerializedName("featureTags")
    private final List<Integer> featureTags;

    @SerializedName("hasPendingEvent")
    private final Boolean hasPendingEvent;

    @SerializedName("isEditable")
    private final Boolean isEditable;

    @SerializedName("isOneCutWin")
    private final Boolean isOneCutWin;

    @SerializedName("isPaymentInProgress")
    private final Boolean isPaymentInProgress;

    @SerializedName("isPublished")
    private final Boolean isPublished;

    @SerializedName("lfbOddsBoosted")
    private final Boolean lfbOddsBoosted;

    @SerializedName("minToWin")
    private final Integer minToWin;

    @SerializedName("oddsBoosted")
    private final Boolean oddsBoosted;

    @SerializedName("orderId")
    private final String orderId;

    @SerializedName("orderType")
    private final Integer orderType;

    @SerializedName("selectionSize")
    private final Integer selectionSize;

    @SerializedName("selections")
    private final List<BetSelection> selections;

    @SerializedName("shareCode")
    private final String shareCode;

    @SerializedName("totalStake")
    private final String totalStake;

    @SerializedName("totalWinnings")
    private final String totalWinnings;

    @SerializedName("userNote")
    private final UserNoteDto userNote;

    @SerializedName("winningStatus")
    private final Integer winningStatus;

    public /* synthetic */ BetHistoryOrder(String str, Integer num, String str2, String str3, Integer num2, String str4, Long l, List list, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, List list2, Boolean bool3, List list3, Boolean bool4, Boolean bool5, UserNoteDto userNoteDto, Boolean bool6, Boolean bool7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : list2, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool3, (i & 32768) != 0 ? null : list3, (i & 65536) != 0 ? null : bool4, (i & 131072) != 0 ? null : bool5, (i & 262144) != 0 ? null : userNoteDto, (i & 524288) != 0 ? null : bool6, (i & 1048576) != 0 ? null : bool7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetHistoryOrder copy$default(BetHistoryOrder betHistoryOrder, String str, Integer num, String str2, String str3, Integer num2, String str4, Long l, List list, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, List list2, Boolean bool3, List list3, Boolean bool4, Boolean bool5, UserNoteDto userNoteDto, Boolean bool6, Boolean bool7, int i, Object obj) {
        Boolean bool8;
        Boolean bool9;
        String str5 = (i & 1) != 0 ? betHistoryOrder.orderId : str;
        Integer num6 = (i & 2) != 0 ? betHistoryOrder.orderType : num;
        String str6 = (i & 4) != 0 ? betHistoryOrder.shareCode : str2;
        String str7 = (i & 8) != 0 ? betHistoryOrder.totalStake : str3;
        Integer num7 = (i & 16) != 0 ? betHistoryOrder.winningStatus : num2;
        String str8 = (i & 32) != 0 ? betHistoryOrder.totalWinnings : str4;
        Long l2 = (i & 64) != 0 ? betHistoryOrder.createTime : l;
        List list4 = (i & 128) != 0 ? betHistoryOrder.selections : list;
        Integer num8 = (i & 256) != 0 ? betHistoryOrder.combinationSize : num3;
        Integer num9 = (i & 512) != 0 ? betHistoryOrder.minToWin : num4;
        Integer num10 = (i & 1024) != 0 ? betHistoryOrder.selectionSize : num5;
        Boolean bool10 = (i & 2048) != 0 ? betHistoryOrder.oddsBoosted : bool;
        Boolean bool11 = (i & 4096) != 0 ? betHistoryOrder.lfbOddsBoosted : bool2;
        List list5 = (i & 8192) != 0 ? betHistoryOrder.featureTags : list2;
        String str9 = str5;
        Boolean bool12 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betHistoryOrder.isEditable : bool3;
        List list6 = (i & 32768) != 0 ? betHistoryOrder.betIds : list3;
        Boolean bool13 = (i & 65536) != 0 ? betHistoryOrder.isOneCutWin : bool4;
        Boolean bool14 = (i & 131072) != 0 ? betHistoryOrder.isPublished : bool5;
        UserNoteDto userNoteDto2 = (i & 262144) != 0 ? betHistoryOrder.userNote : userNoteDto;
        Boolean bool15 = (i & 524288) != 0 ? betHistoryOrder.isPaymentInProgress : bool6;
        if ((i & 1048576) != 0) {
            bool9 = bool15;
            bool8 = betHistoryOrder.hasPendingEvent;
        } else {
            bool8 = bool7;
            bool9 = bool15;
        }
        return betHistoryOrder.copy(str9, num6, str6, str7, num7, str8, l2, list4, num8, num9, num10, bool10, bool11, list5, bool12, list6, bool13, bool14, userNoteDto2, bool9, bool8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getMinToWin() {
        return this.minToWin;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getSelectionSize() {
        return this.selectionSize;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getOddsBoosted() {
        return this.oddsBoosted;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getLfbOddsBoosted() {
        return this.lfbOddsBoosted;
    }

    public final List<Integer> component14() {
        return this.featureTags;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsEditable() {
        return this.isEditable;
    }

    public final List<String> component16() {
        return this.betIds;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsOneCutWin() {
        return this.isOneCutWin;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getIsPublished() {
        return this.isPublished;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final UserNoteDto getUserNote() {
        return this.userNote;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getIsPaymentInProgress() {
        return this.isPaymentInProgress;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getHasPendingEvent() {
        return this.hasPendingEvent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getWinningStatus() {
        return this.winningStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalWinnings() {
        return this.totalWinnings;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    public final List<BetSelection> component8() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getCombinationSize() {
        return this.combinationSize;
    }

    public final BetHistoryOrder copy(String orderId, Integer orderType, String shareCode, String totalStake, Integer winningStatus, String totalWinnings, Long createTime, List<BetSelection> selections, Integer combinationSize, Integer minToWin, Integer selectionSize, Boolean oddsBoosted, Boolean lfbOddsBoosted, List<Integer> featureTags, Boolean isEditable, List<String> betIds, Boolean isOneCutWin, Boolean isPublished, UserNoteDto userNote, Boolean isPaymentInProgress, Boolean hasPendingEvent) {
        orderId.getClass();
        return new BetHistoryOrder(orderId, orderType, shareCode, totalStake, winningStatus, totalWinnings, createTime, selections, combinationSize, minToWin, selectionSize, oddsBoosted, lfbOddsBoosted, featureTags, isEditable, betIds, isOneCutWin, isPublished, userNote, isPaymentInProgress, hasPendingEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetHistoryOrder)) {
            return false;
        }
        BetHistoryOrder betHistoryOrder = (BetHistoryOrder) other;
        return Intrinsics.g(this.orderId, betHistoryOrder.orderId) && Intrinsics.g(this.orderType, betHistoryOrder.orderType) && Intrinsics.g(this.shareCode, betHistoryOrder.shareCode) && Intrinsics.g(this.totalStake, betHistoryOrder.totalStake) && Intrinsics.g(this.winningStatus, betHistoryOrder.winningStatus) && Intrinsics.g(this.totalWinnings, betHistoryOrder.totalWinnings) && Intrinsics.g(this.createTime, betHistoryOrder.createTime) && Intrinsics.g(this.selections, betHistoryOrder.selections) && Intrinsics.g(this.combinationSize, betHistoryOrder.combinationSize) && Intrinsics.g(this.minToWin, betHistoryOrder.minToWin) && Intrinsics.g(this.selectionSize, betHistoryOrder.selectionSize) && Intrinsics.g(this.oddsBoosted, betHistoryOrder.oddsBoosted) && Intrinsics.g(this.lfbOddsBoosted, betHistoryOrder.lfbOddsBoosted) && Intrinsics.g(this.featureTags, betHistoryOrder.featureTags) && Intrinsics.g(this.isEditable, betHistoryOrder.isEditable) && Intrinsics.g(this.betIds, betHistoryOrder.betIds) && Intrinsics.g(this.isOneCutWin, betHistoryOrder.isOneCutWin) && Intrinsics.g(this.isPublished, betHistoryOrder.isPublished) && Intrinsics.g(this.userNote, betHistoryOrder.userNote) && Intrinsics.g(this.isPaymentInProgress, betHistoryOrder.isPaymentInProgress) && Intrinsics.g(this.hasPendingEvent, betHistoryOrder.hasPendingEvent);
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

    public final List<BetSelection> getSelections() {
        return this.selections;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final String getTotalStake() {
        return this.totalStake;
    }

    public final String getTotalWinnings() {
        return this.totalWinnings;
    }

    public final UserNoteDto getUserNote() {
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
        String str2 = this.totalStake;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.winningStatus;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.totalWinnings;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        List<BetSelection> list = this.selections;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.combinationSize;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minToWin;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.selectionSize;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.oddsBoosted;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.lfbOddsBoosted;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list2 = this.featureTags;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool3 = this.isEditable;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list3 = this.betIds;
        int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool4 = this.isOneCutWin;
        int iHashCode17 = (iHashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isPublished;
        int iHashCode18 = (iHashCode17 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        UserNoteDto userNoteDto = this.userNote;
        int iHashCode19 = (iHashCode18 + (userNoteDto == null ? 0 : userNoteDto.hashCode())) * 31;
        Boolean bool6 = this.isPaymentInProgress;
        int iHashCode20 = (iHashCode19 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasPendingEvent;
        return iHashCode20 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final Boolean isEditable() {
        return this.isEditable;
    }

    public final Boolean isOneCutWin() {
        return this.isOneCutWin;
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
        String str3 = this.totalStake;
        Integer num2 = this.winningStatus;
        String str4 = this.totalWinnings;
        Long l = this.createTime;
        List<BetSelection> list = this.selections;
        Integer num3 = this.combinationSize;
        Integer num4 = this.minToWin;
        Integer num5 = this.selectionSize;
        Boolean bool = this.oddsBoosted;
        Boolean bool2 = this.lfbOddsBoosted;
        List<Integer> list2 = this.featureTags;
        Boolean bool3 = this.isEditable;
        List<String> list3 = this.betIds;
        Boolean bool4 = this.isOneCutWin;
        Boolean bool5 = this.isPublished;
        UserNoteDto userNoteDto = this.userNote;
        Boolean bool6 = this.isPaymentInProgress;
        Boolean bool7 = this.hasPendingEvent;
        StringBuilder sbA = ew7.a(num, "BetHistoryOrder(orderId=", str, ", orderType=", ", shareCode=");
        hxa.c(sbA, str2, ", totalStake=", str3, ", winningStatus=");
        w03.a(num2, ", totalWinnings=", str4, ", createTime=", sbA);
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
        sbA.append(", isPublished=");
        sbA.append(bool5);
        sbA.append(", userNote=");
        sbA.append(userNoteDto);
        sbA.append(", isPaymentInProgress=");
        sbA.append(bool6);
        sbA.append(", hasPendingEvent=");
        return rg2.a(sbA, bool7, ")");
    }

    public BetHistoryOrder(String str, Integer num, String str2, String str3, Integer num2, String str4, Long l, List<BetSelection> list, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, List<Integer> list2, Boolean bool3, List<String> list3, Boolean bool4, Boolean bool5, UserNoteDto userNoteDto, Boolean bool6, Boolean bool7) {
        str.getClass();
        this.orderId = str;
        this.orderType = num;
        this.shareCode = str2;
        this.totalStake = str3;
        this.winningStatus = num2;
        this.totalWinnings = str4;
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
        this.isPublished = bool5;
        this.userNote = userNoteDto;
        this.isPaymentInProgress = bool6;
        this.hasPendingEvent = bool7;
    }
}
