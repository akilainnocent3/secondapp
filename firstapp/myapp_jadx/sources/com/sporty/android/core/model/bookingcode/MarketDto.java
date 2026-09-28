package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.ai50;
import defpackage.ew7;
import defpackage.gfs;
import defpackage.hxa;
import defpackage.m2g;
import defpackage.oie;
import defpackage.w03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J¢\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00109J\u0014\u0010:\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010<\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010=\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R)\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R)\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\"\u0010\u001bR+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R'\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R)\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0010¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R)\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*Ê\u0001\u0002\b?¨\u0006>"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/MarketDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "product", "", "desc", "specifier", AnalyticsParam.EVENT_STATUS, EventKeys.EVENT_GROUP, "marketGuide", "favourite", "outcomes", "", "Lcom/sporty/android/core/model/bookingcode/OutcomeDto;", "sourceType", "lastOddsChangeTime", "", "banned", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getProduct", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDesc", "getSpecifier", "getStatus", "getGroup", "getMarketGuide", "getFavourite", "getOutcomes", "()Ljava/util/List;", "getSourceType", "getLastOddsChangeTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBanned", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/bookingcode/MarketDto;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketDto {

    @SerializedName("banned")
    private final Boolean banned;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("favourite")
    private final Integer favourite;

    @SerializedName(EventKeys.EVENT_GROUP)
    private final String group;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    @SerializedName("lastOddsChangeTime")
    private final Long lastOddsChangeTime;

    @SerializedName("marketGuide")
    private final String marketGuide;

    @SerializedName("outcomes")
    private final List<OutcomeDto> outcomes;

    @SerializedName("product")
    private final Integer product;

    @SerializedName("sourceType")
    private final String sourceType;

    @SerializedName("specifier")
    private final String specifier;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final Integer status;

    public MarketDto(String str, Integer num, String str2, String str3, Integer num2, String str4, String str5, Integer num3, List list, String str6, Long l, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? m2g.a : list, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketDto copy$default(MarketDto marketDto, String str, Integer num, String str2, String str3, Integer num2, String str4, String str5, Integer num3, List list, String str6, Long l, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketDto.id;
        }
        if ((i & 2) != 0) {
            num = marketDto.product;
        }
        if ((i & 4) != 0) {
            str2 = marketDto.desc;
        }
        if ((i & 8) != 0) {
            str3 = marketDto.specifier;
        }
        if ((i & 16) != 0) {
            num2 = marketDto.status;
        }
        if ((i & 32) != 0) {
            str4 = marketDto.group;
        }
        if ((i & 64) != 0) {
            str5 = marketDto.marketGuide;
        }
        if ((i & 128) != 0) {
            num3 = marketDto.favourite;
        }
        if ((i & 256) != 0) {
            list = marketDto.outcomes;
        }
        if ((i & 512) != 0) {
            str6 = marketDto.sourceType;
        }
        if ((i & 1024) != 0) {
            l = marketDto.lastOddsChangeTime;
        }
        if ((i & 2048) != 0) {
            bool = marketDto.banned;
        }
        Long l2 = l;
        Boolean bool2 = bool;
        List list2 = list;
        String str7 = str6;
        String str8 = str5;
        Integer num4 = num3;
        Integer num5 = num2;
        String str9 = str4;
        return marketDto.copy(str, num, str2, str3, num5, str9, str8, num4, list2, str7, l2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getBanned() {
        return this.banned;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketGuide() {
        return this.marketGuide;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getFavourite() {
        return this.favourite;
    }

    public final List<OutcomeDto> component9() {
        return this.outcomes;
    }

    public final MarketDto copy(String id, Integer product, String desc, String specifier, Integer status, String group, String marketGuide, Integer favourite, List<OutcomeDto> outcomes, String sourceType, Long lastOddsChangeTime, Boolean banned) {
        outcomes.getClass();
        return new MarketDto(id, product, desc, specifier, status, group, marketGuide, favourite, outcomes, sourceType, lastOddsChangeTime, banned);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketDto)) {
            return false;
        }
        MarketDto marketDto = (MarketDto) other;
        return Intrinsics.g(this.id, marketDto.id) && Intrinsics.g(this.product, marketDto.product) && Intrinsics.g(this.desc, marketDto.desc) && Intrinsics.g(this.specifier, marketDto.specifier) && Intrinsics.g(this.status, marketDto.status) && Intrinsics.g(this.group, marketDto.group) && Intrinsics.g(this.marketGuide, marketDto.marketGuide) && Intrinsics.g(this.favourite, marketDto.favourite) && Intrinsics.g(this.outcomes, marketDto.outcomes) && Intrinsics.g(this.sourceType, marketDto.sourceType) && Intrinsics.g(this.lastOddsChangeTime, marketDto.lastOddsChangeTime) && Intrinsics.g(this.banned, marketDto.banned);
    }

    public final Boolean getBanned() {
        return this.banned;
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

    public final String getId() {
        return this.id;
    }

    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final String getMarketGuide() {
        return this.marketGuide;
    }

    public final List<OutcomeDto> getOutcomes() {
        return this.outcomes;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.product;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.desc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.specifier;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.group;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.marketGuide;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.favourite;
        int iA = ai50.a((iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.outcomes);
        String str6 = this.sourceType;
        int iHashCode8 = (iA + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.lastOddsChangeTime;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.banned;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        Integer num = this.product;
        String str2 = this.desc;
        String str3 = this.specifier;
        Integer num2 = this.status;
        String str4 = this.group;
        String str5 = this.marketGuide;
        Integer num3 = this.favourite;
        List<OutcomeDto> list = this.outcomes;
        String str6 = this.sourceType;
        Long l = this.lastOddsChangeTime;
        Boolean bool = this.banned;
        StringBuilder sbA = ew7.a(num, "MarketDto(id=", str, ", product=", ", desc=");
        hxa.c(sbA, str2, ", specifier=", str3, ", status=");
        w03.a(num2, ", group=", str4, ", marketGuide=", sbA);
        oie.a(num3, str5, ", favourite=", ", outcomes=", sbA);
        gfs.a(", sourceType=", str6, ", lastOddsChangeTime=", sbA, list);
        sbA.append(l);
        sbA.append(", banned=");
        sbA.append(bool);
        sbA.append(")");
        return sbA.toString();
    }

    public MarketDto(String str, Integer num, String str2, String str3, Integer num2, String str4, String str5, Integer num3, List<OutcomeDto> list, String str6, Long l, Boolean bool) {
        list.getClass();
        this.id = str;
        this.product = num;
        this.desc = str2;
        this.specifier = str3;
        this.status = num2;
        this.group = str4;
        this.marketGuide = str5;
        this.favourite = num3;
        this.outcomes = list;
        this.sourceType = str6;
        this.lastOddsChangeTime = l;
        this.banned = bool;
    }

    public MarketDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
