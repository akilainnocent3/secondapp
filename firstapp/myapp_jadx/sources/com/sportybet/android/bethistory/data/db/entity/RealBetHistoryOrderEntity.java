package com.sportybet.android.bethistory.data.db.entity;

import com.sportybet.plugin.realsports.data.RSelection;
import defpackage.ai50;
import defpackage.cv7;
import defpackage.hxa;
import defpackage.mng;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.ux5;
import defpackage.w03;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bW\b\u0087\b\u0018\u00002\u00020\u0001:\u0001jB\u0099\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0014\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0014\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b2\u0010(J\u0012\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b3\u0010(J\u0012\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b4\u0010(J\u0012\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b7\u00106J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b8\u00101J\u0012\u00109\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b9\u00106J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b:\u00101J\u0012\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b;\u00106J\u0010\u0010<\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b?\u0010=J\u0010\u0010@\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b@\u0010=J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010%J\u0010\u0010B\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\bB\u0010=J\u0012\u0010C\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bC\u00106JÌ\u0002\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bF\u0010%J\u0010\u0010G\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bG\u0010HJ\u001a\u0010J\u001a\u00020\u00142\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010L\u001a\u0004\bN\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010O\u0012\u0004\bQ\u0010R\u001a\u0004\bP\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bS\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bT\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bU\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010O\u0012\u0004\bW\u0010R\u001a\u0004\bV\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bX\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010Y\u001a\u0004\bZ\u0010/R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\b]\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\b^\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\b_\u0010(R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010`\u001a\u0004\ba\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010`\u001a\u0004\bb\u00106R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\bc\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010`\u001a\u0004\b\u0018\u00106R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\bd\u00101R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010`\u001a\u0004\b\u001a\u00106R\u001a\u0010\u001b\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010e\u001a\u0004\b\u001b\u0010=R\u001a\u0010\u001c\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010e\u001a\u0004\bf\u0010=R\u001a\u0010\u001d\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010e\u001a\u0004\bg\u0010=R\u001a\u0010\u001e\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010e\u001a\u0004\b\u001e\u0010=R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\bh\u0010%R\u001a\u0010 \u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010e\u001a\u0004\b \u0010=R\u001c\u0010!\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010`\u001a\u0004\bi\u00106¨\u0006k"}, d2 = {"Lcom/sportybet/android/bethistory/data/db/entity/RealBetHistoryOrderEntity;", "", "", "orderId", "userId", "", "orderType", "shareCode", "currency", "totalStake", "winningStatus", "totalWinnings", "", "createTime", "", "Lcom/sportybet/plugin/realsports/data/RSelection;", "selections", "combinationSize", "minToWin", "selectionSize", "", "oddsBoosted", "lfbOddsBoosted", "featureTags", "isEditable", "betIds", "isOneCutWin", "isBulkDeletePerforming", "remixBetEnabled", "showRemixBetRedDot", "isSelectedForBulkDelete", "userNote", "isPaymentInProgress", "hasPendingEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;ZZZZLjava/lang/String;ZLjava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Long;", "component10", "()Ljava/util/List;", "component11", "component12", "component13", "component14", "()Ljava/lang/Boolean;", "component15", "component16", "component17", "component18", "component19", "component20", "()Z", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;ZZZZLjava/lang/String;ZLjava/lang/Boolean;)Lcom/sportybet/android/bethistory/data/db/entity/RealBetHistoryOrderEntity;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderId", "getUserId", "Ljava/lang/Integer;", "getOrderType", "getOrderType$annotations", "()V", "getShareCode", "getCurrency", "getTotalStake", "getWinningStatus", "getWinningStatus$annotations", "getTotalWinnings", "Ljava/lang/Long;", "getCreateTime", "Ljava/util/List;", "getSelections", "getCombinationSize", "getMinToWin", "getSelectionSize", "Ljava/lang/Boolean;", "getOddsBoosted", "getLfbOddsBoosted", "getFeatureTags", "getBetIds", "Z", "getRemixBetEnabled", "getShowRemixBetRedDot", "getUserNote", "getHasPendingEvent", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RealBetHistoryOrderEntity {
    public static final int $stable = 0;
    private final List<String> betIds;
    private final Integer combinationSize;
    private final Long createTime;
    private final String currency;
    private final List<Integer> featureTags;
    private final Boolean hasPendingEvent;
    private final boolean isBulkDeletePerforming;
    private final Boolean isEditable;
    private final Boolean isOneCutWin;
    private final boolean isPaymentInProgress;
    private final boolean isSelectedForBulkDelete;
    private final Boolean lfbOddsBoosted;
    private final Integer minToWin;
    private final Boolean oddsBoosted;
    private final String orderId;
    private final Integer orderType;
    private final boolean remixBetEnabled;
    private final Integer selectionSize;
    private final List<RSelection> selections;
    private final String shareCode;
    private final boolean showRemixBetRedDot;
    private final String totalStake;
    private final String totalWinnings;
    private final String userId;
    private final String userNote;
    private final Integer winningStatus;

    public static final class a {
        public final Long a;
        public final Long b;
        public final Set<Integer> c;
        public final Set<Integer> d;

        public a(Long l, Long l2, Set<Integer> set, Set<Integer> set2) {
            this.a = l;
            this.b = l2;
            this.c = set;
            this.d = set2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            Long l = this.a;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.b;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Set<Integer> set = this.c;
            int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
            Set<Integer> set2 = this.d;
            return iHashCode3 + (set2 != null ? set2.hashCode() : 0);
        }

        public final String toString() {
            return "Query(startTime=" + this.a + ", endTime=" + this.b + ", includeWinningStatus=" + this.c + ", excludeWinningStatus=" + this.d + ")";
        }
    }

    public /* synthetic */ RealBetHistoryOrderEntity(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, String str6, Long l, List list, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, List list2, Boolean bool3, List list3, Boolean bool4, boolean z, boolean z2, boolean z3, boolean z4, String str7, boolean z5, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, str4, str5, num2, str6, l, list, num3, num4, num5, bool, bool2, list2, bool3, list3, bool4, (i & 524288) != 0 ? false : z, (i & 1048576) != 0 ? false : z2, (i & 2097152) != 0 ? false : z3, (i & 4194304) != 0 ? false : z4, str7, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z5, bool5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RealBetHistoryOrderEntity copy$default(RealBetHistoryOrderEntity realBetHistoryOrderEntity, String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, String str6, Long l, List list, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, List list2, Boolean bool3, List list3, Boolean bool4, boolean z, boolean z2, boolean z3, boolean z4, String str7, boolean z5, Boolean bool5, int i, Object obj) {
        Boolean bool6;
        boolean z6;
        String str8 = (i & 1) != 0 ? realBetHistoryOrderEntity.orderId : str;
        String str9 = (i & 2) != 0 ? realBetHistoryOrderEntity.userId : str2;
        Integer num6 = (i & 4) != 0 ? realBetHistoryOrderEntity.orderType : num;
        String str10 = (i & 8) != 0 ? realBetHistoryOrderEntity.shareCode : str3;
        String str11 = (i & 16) != 0 ? realBetHistoryOrderEntity.currency : str4;
        String str12 = (i & 32) != 0 ? realBetHistoryOrderEntity.totalStake : str5;
        Integer num7 = (i & 64) != 0 ? realBetHistoryOrderEntity.winningStatus : num2;
        String str13 = (i & 128) != 0 ? realBetHistoryOrderEntity.totalWinnings : str6;
        Long l2 = (i & 256) != 0 ? realBetHistoryOrderEntity.createTime : l;
        List list4 = (i & 512) != 0 ? realBetHistoryOrderEntity.selections : list;
        Integer num8 = (i & 1024) != 0 ? realBetHistoryOrderEntity.combinationSize : num3;
        Integer num9 = (i & 2048) != 0 ? realBetHistoryOrderEntity.minToWin : num4;
        Integer num10 = (i & 4096) != 0 ? realBetHistoryOrderEntity.selectionSize : num5;
        Boolean bool7 = (i & 8192) != 0 ? realBetHistoryOrderEntity.oddsBoosted : bool;
        String str14 = str8;
        Boolean bool8 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? realBetHistoryOrderEntity.lfbOddsBoosted : bool2;
        List list5 = (i & 32768) != 0 ? realBetHistoryOrderEntity.featureTags : list2;
        Boolean bool9 = (i & 65536) != 0 ? realBetHistoryOrderEntity.isEditable : bool3;
        List list6 = (i & 131072) != 0 ? realBetHistoryOrderEntity.betIds : list3;
        Boolean bool10 = (i & 262144) != 0 ? realBetHistoryOrderEntity.isOneCutWin : bool4;
        boolean z7 = (i & 524288) != 0 ? realBetHistoryOrderEntity.isBulkDeletePerforming : z;
        boolean z8 = (i & 1048576) != 0 ? realBetHistoryOrderEntity.remixBetEnabled : z2;
        boolean z9 = (i & 2097152) != 0 ? realBetHistoryOrderEntity.showRemixBetRedDot : z3;
        boolean z10 = (i & 4194304) != 0 ? realBetHistoryOrderEntity.isSelectedForBulkDelete : z4;
        String str15 = (i & 8388608) != 0 ? realBetHistoryOrderEntity.userNote : str7;
        boolean z11 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? realBetHistoryOrderEntity.isPaymentInProgress : z5;
        if ((i & 33554432) != 0) {
            z6 = z11;
            bool6 = realBetHistoryOrderEntity.hasPendingEvent;
        } else {
            bool6 = bool5;
            z6 = z11;
        }
        return realBetHistoryOrderEntity.copy(str14, str9, num6, str10, str11, str12, num7, str13, l2, list4, num8, num9, num10, bool7, bool8, list5, bool9, list6, bool10, z7, z8, z9, z10, str15, z6, bool6);
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
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsBulkDeletePerforming() {
        return this.isBulkDeletePerforming;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getRemixBetEnabled() {
        return this.remixBetEnabled;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getShowRemixBetRedDot() {
        return this.showRemixBetRedDot;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsSelectedForBulkDelete() {
        return this.isSelectedForBulkDelete;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getUserNote() {
        return this.userNote;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsPaymentInProgress() {
        return this.isPaymentInProgress;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getHasPendingEvent() {
        return this.hasPendingEvent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalStake() {
        return this.totalStake;
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

    public final RealBetHistoryOrderEntity copy(String orderId, String userId, Integer orderType, String shareCode, String currency, String totalStake, Integer winningStatus, String totalWinnings, Long createTime, List<? extends RSelection> selections, Integer combinationSize, Integer minToWin, Integer selectionSize, Boolean oddsBoosted, Boolean lfbOddsBoosted, List<Integer> featureTags, Boolean isEditable, List<String> betIds, Boolean isOneCutWin, boolean isBulkDeletePerforming, boolean remixBetEnabled, boolean showRemixBetRedDot, boolean isSelectedForBulkDelete, String userNote, boolean isPaymentInProgress, Boolean hasPendingEvent) {
        orderId.getClass();
        selections.getClass();
        return new RealBetHistoryOrderEntity(orderId, userId, orderType, shareCode, currency, totalStake, winningStatus, totalWinnings, createTime, selections, combinationSize, minToWin, selectionSize, oddsBoosted, lfbOddsBoosted, featureTags, isEditable, betIds, isOneCutWin, isBulkDeletePerforming, remixBetEnabled, showRemixBetRedDot, isSelectedForBulkDelete, userNote, isPaymentInProgress, hasPendingEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealBetHistoryOrderEntity)) {
            return false;
        }
        RealBetHistoryOrderEntity realBetHistoryOrderEntity = (RealBetHistoryOrderEntity) other;
        return Intrinsics.g(this.orderId, realBetHistoryOrderEntity.orderId) && Intrinsics.g(this.userId, realBetHistoryOrderEntity.userId) && Intrinsics.g(this.orderType, realBetHistoryOrderEntity.orderType) && Intrinsics.g(this.shareCode, realBetHistoryOrderEntity.shareCode) && Intrinsics.g(this.currency, realBetHistoryOrderEntity.currency) && Intrinsics.g(this.totalStake, realBetHistoryOrderEntity.totalStake) && Intrinsics.g(this.winningStatus, realBetHistoryOrderEntity.winningStatus) && Intrinsics.g(this.totalWinnings, realBetHistoryOrderEntity.totalWinnings) && Intrinsics.g(this.createTime, realBetHistoryOrderEntity.createTime) && Intrinsics.g(this.selections, realBetHistoryOrderEntity.selections) && Intrinsics.g(this.combinationSize, realBetHistoryOrderEntity.combinationSize) && Intrinsics.g(this.minToWin, realBetHistoryOrderEntity.minToWin) && Intrinsics.g(this.selectionSize, realBetHistoryOrderEntity.selectionSize) && Intrinsics.g(this.oddsBoosted, realBetHistoryOrderEntity.oddsBoosted) && Intrinsics.g(this.lfbOddsBoosted, realBetHistoryOrderEntity.lfbOddsBoosted) && Intrinsics.g(this.featureTags, realBetHistoryOrderEntity.featureTags) && Intrinsics.g(this.isEditable, realBetHistoryOrderEntity.isEditable) && Intrinsics.g(this.betIds, realBetHistoryOrderEntity.betIds) && Intrinsics.g(this.isOneCutWin, realBetHistoryOrderEntity.isOneCutWin) && this.isBulkDeletePerforming == realBetHistoryOrderEntity.isBulkDeletePerforming && this.remixBetEnabled == realBetHistoryOrderEntity.remixBetEnabled && this.showRemixBetRedDot == realBetHistoryOrderEntity.showRemixBetRedDot && this.isSelectedForBulkDelete == realBetHistoryOrderEntity.isSelectedForBulkDelete && Intrinsics.g(this.userNote, realBetHistoryOrderEntity.userNote) && this.isPaymentInProgress == realBetHistoryOrderEntity.isPaymentInProgress && Intrinsics.g(this.hasPendingEvent, realBetHistoryOrderEntity.hasPendingEvent);
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

    public final boolean getRemixBetEnabled() {
        return this.remixBetEnabled;
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

    public final boolean getShowRemixBetRedDot() {
        return this.showRemixBetRedDot;
    }

    public final String getTotalStake() {
        return this.totalStake;
    }

    public final String getTotalWinnings() {
        return this.totalWinnings;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserNote() {
        return this.userNote;
    }

    public final Integer getWinningStatus() {
        return this.winningStatus;
    }

    public int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.orderType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.shareCode;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalStake;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.winningStatus;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.totalWinnings;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.createTime;
        int iA = ai50.a((iHashCode8 + (l == null ? 0 : l.hashCode())) * 31, 31, this.selections);
        Integer num3 = this.combinationSize;
        int iHashCode9 = (iA + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minToWin;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.selectionSize;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.oddsBoosted;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.lfbOddsBoosted;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Integer> list = this.featureTags;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool3 = this.isEditable;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list2 = this.betIds;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool4 = this.isOneCutWin;
        int iA2 = mtg0.a(mtg0.a(mtg0.a(mtg0.a((iHashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31, this.isBulkDeletePerforming), 31, this.remixBetEnabled), 31, this.showRemixBetRedDot), 31, this.isSelectedForBulkDelete);
        String str6 = this.userNote;
        int iA3 = mtg0.a((iA2 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.isPaymentInProgress);
        Boolean bool5 = this.hasPendingEvent;
        return iA3 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final boolean isBulkDeletePerforming() {
        return this.isBulkDeletePerforming;
    }

    public final Boolean isEditable() {
        return this.isEditable;
    }

    public final Boolean isOneCutWin() {
        return this.isOneCutWin;
    }

    public final boolean isPaymentInProgress() {
        return this.isPaymentInProgress;
    }

    public final boolean isSelectedForBulkDelete() {
        return this.isSelectedForBulkDelete;
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.userId;
        Integer num = this.orderType;
        String str3 = this.shareCode;
        String str4 = this.currency;
        String str5 = this.totalStake;
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
        boolean z = this.isBulkDeletePerforming;
        boolean z2 = this.remixBetEnabled;
        boolean z3 = this.showRemixBetRedDot;
        boolean z4 = this.isSelectedForBulkDelete;
        String str7 = this.userNote;
        boolean z5 = this.isPaymentInProgress;
        Boolean bool5 = this.hasPendingEvent;
        StringBuilder sbA = ux5.a("RealBetHistoryOrderEntity(orderId=", str, ", userId=", str2, ", orderType=");
        w03.a(num, ", shareCode=", str3, ", currency=", sbA);
        hxa.c(sbA, str4, ", totalStake=", str5, ", winningStatus=");
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
        sbA.append(", isBulkDeletePerforming=");
        sbA.append(z);
        sbA.append(", remixBetEnabled=");
        nng.a(", showRemixBetRedDot=", ", isSelectedForBulkDelete=", sbA, z2, z3);
        mng.a(", userNote=", str7, ", isPaymentInProgress=", sbA, z4);
        sbA.append(z5);
        sbA.append(", hasPendingEvent=");
        sbA.append(bool5);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealBetHistoryOrderEntity(String str, String str2, Integer num, String str3, String str4, String str5, Integer num2, String str6, Long l, List<? extends RSelection> list, Integer num3, Integer num4, Integer num5, Boolean bool, Boolean bool2, List<Integer> list2, Boolean bool3, List<String> list3, Boolean bool4, boolean z, boolean z2, boolean z3, boolean z4, String str7, boolean z5, Boolean bool5) {
        str.getClass();
        list.getClass();
        this.orderId = str;
        this.userId = str2;
        this.orderType = num;
        this.shareCode = str3;
        this.currency = str4;
        this.totalStake = str5;
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
        this.isBulkDeletePerforming = z;
        this.remixBetEnabled = z2;
        this.showRemixBetRedDot = z3;
        this.isSelectedForBulkDelete = z4;
        this.userNote = str7;
        this.isPaymentInProgress = z5;
        this.hasPendingEvent = bool5;
    }
}
