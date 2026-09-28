package com.sportybet.android.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.ew7;
import defpackage.hxa;
import defpackage.oie;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ¤\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00103J\u0014\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00107\u001a\u00020\u0005HÖ\u0081\u0004J\n\u00108\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b%\u0010\u001dÊ\u0001\u0002\b:Ê\u0001\f\b;\u0012\b\b<\u0012\u0004\b\u0003\u0010\u0000¨\u00069"}, d2 = {"Lcom/sportybet/android/data/MarketStatusSocket;", "", "desc", "", "favourite", "", EventKeys.EVENT_GROUP, "marketGuide", "product", "pushTime", "", AnalyticsParam.EVENT_STATUS, "suspendedReason", "topic", "cashOutStatus", "winningOutcomes", "", "lastOddsChangeTime", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;)V", "getDesc", "()Ljava/lang/String;", "getFavourite", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGroup", "getMarketGuide", "getProduct", "getPushTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "getSuspendedReason", "getTopic", "getCashOutStatus", "getWinningOutcomes", "()Ljava/util/List;", "getLastOddsChangeTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;)Lcom/sportybet/android/data/MarketStatusSocket;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketStatusSocket {
    public static final int $stable = 8;
    private final Integer cashOutStatus;
    private final String desc;
    private final Integer favourite;
    private final String group;
    private final Long lastOddsChangeTime;
    private final String marketGuide;
    private final String product;
    private final Long pushTime;
    private final String status;
    private final String suspendedReason;
    private final String topic;
    private final List<String> winningOutcomes;

    public MarketStatusSocket(String str, Integer num, String str2, String str3, String str4, Long l, String str5, String str6, String str7, Integer num2, List<String> list, Long l2) {
        this.desc = str;
        this.favourite = num;
        this.group = str2;
        this.marketGuide = str3;
        this.product = str4;
        this.pushTime = l;
        this.status = str5;
        this.suspendedReason = str6;
        this.topic = str7;
        this.cashOutStatus = num2;
        this.winningOutcomes = list;
        this.lastOddsChangeTime = l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketStatusSocket copy$default(MarketStatusSocket marketStatusSocket, String str, Integer num, String str2, String str3, String str4, Long l, String str5, String str6, String str7, Integer num2, List list, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketStatusSocket.desc;
        }
        if ((i & 2) != 0) {
            num = marketStatusSocket.favourite;
        }
        if ((i & 4) != 0) {
            str2 = marketStatusSocket.group;
        }
        if ((i & 8) != 0) {
            str3 = marketStatusSocket.marketGuide;
        }
        if ((i & 16) != 0) {
            str4 = marketStatusSocket.product;
        }
        if ((i & 32) != 0) {
            l = marketStatusSocket.pushTime;
        }
        if ((i & 64) != 0) {
            str5 = marketStatusSocket.status;
        }
        if ((i & 128) != 0) {
            str6 = marketStatusSocket.suspendedReason;
        }
        if ((i & 256) != 0) {
            str7 = marketStatusSocket.topic;
        }
        if ((i & 512) != 0) {
            num2 = marketStatusSocket.cashOutStatus;
        }
        if ((i & 1024) != 0) {
            list = marketStatusSocket.winningOutcomes;
        }
        if ((i & 2048) != 0) {
            l2 = marketStatusSocket.lastOddsChangeTime;
        }
        List list2 = list;
        Long l3 = l2;
        String str8 = str7;
        Integer num3 = num2;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        Long l4 = l;
        return marketStatusSocket.copy(str, num, str2, str3, str11, l4, str9, str10, str8, num3, list2, l3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final List<String> component11() {
        return this.winningOutcomes;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getFavourite() {
        return this.favourite;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMarketGuide() {
        return this.marketGuide;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getPushTime() {
        return this.pushTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSuspendedReason() {
        return this.suspendedReason;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    public final MarketStatusSocket copy(String desc, Integer favourite, String group, String marketGuide, String product, Long pushTime, String status, String suspendedReason, String topic, Integer cashOutStatus, List<String> winningOutcomes, Long lastOddsChangeTime) {
        return new MarketStatusSocket(desc, favourite, group, marketGuide, product, pushTime, status, suspendedReason, topic, cashOutStatus, winningOutcomes, lastOddsChangeTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketStatusSocket)) {
            return false;
        }
        MarketStatusSocket marketStatusSocket = (MarketStatusSocket) other;
        return Intrinsics.g(this.desc, marketStatusSocket.desc) && Intrinsics.g(this.favourite, marketStatusSocket.favourite) && Intrinsics.g(this.group, marketStatusSocket.group) && Intrinsics.g(this.marketGuide, marketStatusSocket.marketGuide) && Intrinsics.g(this.product, marketStatusSocket.product) && Intrinsics.g(this.pushTime, marketStatusSocket.pushTime) && Intrinsics.g(this.status, marketStatusSocket.status) && Intrinsics.g(this.suspendedReason, marketStatusSocket.suspendedReason) && Intrinsics.g(this.topic, marketStatusSocket.topic) && Intrinsics.g(this.cashOutStatus, marketStatusSocket.cashOutStatus) && Intrinsics.g(this.winningOutcomes, marketStatusSocket.winningOutcomes) && Intrinsics.g(this.lastOddsChangeTime, marketStatusSocket.lastOddsChangeTime);
    }

    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final Integer getFavourite() {
        return this.favourite;
    }

    public final String getGroup() {
        return this.group;
    }

    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final String getMarketGuide() {
        return this.marketGuide;
    }

    public final String getProduct() {
        return this.product;
    }

    public final Long getPushTime() {
        return this.pushTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSuspendedReason() {
        return this.suspendedReason;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final List<String> getWinningOutcomes() {
        return this.winningOutcomes;
    }

    public int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.favourite;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.group;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.marketGuide;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.product;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.pushTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.status;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.suspendedReason;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.topic;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.cashOutStatus;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.winningOutcomes;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.lastOddsChangeTime;
        return iHashCode11 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        String str = this.desc;
        Integer num = this.favourite;
        String str2 = this.group;
        String str3 = this.marketGuide;
        String str4 = this.product;
        Long l = this.pushTime;
        String str5 = this.status;
        String str6 = this.suspendedReason;
        String str7 = this.topic;
        Integer num2 = this.cashOutStatus;
        List<String> list = this.winningOutcomes;
        Long l2 = this.lastOddsChangeTime;
        StringBuilder sbA = ew7.a(num, "MarketStatusSocket(desc=", str, ", favourite=", ", group=");
        hxa.c(sbA, str2, ", marketGuide=", str3, ", product=");
        sbA.append(str4);
        sbA.append(", pushTime=");
        sbA.append(l);
        sbA.append(", status=");
        hxa.c(sbA, str5, ", suspendedReason=", str6, ", topic=");
        oie.a(num2, str7, ", cashOutStatus=", ", winningOutcomes=", sbA);
        sbA.append(list);
        sbA.append(", lastOddsChangeTime=");
        sbA.append(l2);
        sbA.append(")");
        return sbA.toString();
    }
}
