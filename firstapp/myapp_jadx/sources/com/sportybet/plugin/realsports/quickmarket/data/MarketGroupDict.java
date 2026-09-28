package com.sportybet.plugin.realsports.quickmarket.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.oie;
import defpackage.ry4;
import defpackage.ux5;
import defpackage.w03;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010%J\t\u00106\u001a\u00020\u0011HÆ\u0003J¨\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u00108J\u0014\u00109\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010;\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010<\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0010\u0010%R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010'\"\u0004\b(\u0010)Ê\u0001\f\b>\u0012\b\b?\u0012\u0004\b\u0003\u0010\u0000¨\u0006="}, d2 = {"Lcom/sportybet/plugin/realsports/quickmarket/data/MarketGroupDict;", "", AnalyticsParam.EVENT_PARAM_ID, "", "sportId", "marketId", "product", "", "optionalStatus", "groupInfoId", "createTime", "", "name", "title", "marketGuide", "orderNum", "isDisplay", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Z)V", "getId", "()Ljava/lang/String;", "getSportId", "getMarketId", "getProduct", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOptionalStatus", "getGroupInfoId", "getCreateTime", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getName", "getTitle", "getMarketGuide", "getOrderNum", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Z)Lcom/sportybet/plugin/realsports/quickmarket/data/MarketGroupDict;", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketGroupDict {
    public static final int $stable = 8;
    private final Double createTime;
    private final String groupInfoId;
    private final String id;
    private final Boolean isDisplay;
    private boolean isSelected;
    private final String marketGuide;
    private final String marketId;
    private final String name;
    private final Integer optionalStatus;
    private final Integer orderNum;
    private final Integer product;
    private final String sportId;
    private final String title;

    public /* synthetic */ MarketGroupDict(String str, String str2, String str3, Integer num, Integer num2, String str4, Double d, String str5, String str6, String str7, Integer num3, Boolean bool, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : num3, (i & 2048) == 0 ? bool : null, (i & 4096) != 0 ? false : z);
    }

    public static /* synthetic */ MarketGroupDict copy$default(MarketGroupDict marketGroupDict, String str, String str2, String str3, Integer num, Integer num2, String str4, Double d, String str5, String str6, String str7, Integer num3, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketGroupDict.id;
        }
        return marketGroupDict.copy(str, (i & 2) != 0 ? marketGroupDict.sportId : str2, (i & 4) != 0 ? marketGroupDict.marketId : str3, (i & 8) != 0 ? marketGroupDict.product : num, (i & 16) != 0 ? marketGroupDict.optionalStatus : num2, (i & 32) != 0 ? marketGroupDict.groupInfoId : str4, (i & 64) != 0 ? marketGroupDict.createTime : d, (i & 128) != 0 ? marketGroupDict.name : str5, (i & 256) != 0 ? marketGroupDict.title : str6, (i & 512) != 0 ? marketGroupDict.marketGuide : str7, (i & 1024) != 0 ? marketGroupDict.orderNum : num3, (i & 2048) != 0 ? marketGroupDict.isDisplay : bool, (i & 4096) != 0 ? marketGroupDict.isSelected : z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMarketGuide() {
        return this.marketGuide;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getOrderNum() {
        return this.orderNum;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsDisplay() {
        return this.isDisplay;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getOptionalStatus() {
        return this.optionalStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGroupInfoId() {
        return this.groupInfoId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final MarketGroupDict copy(String id, String sportId, String marketId, Integer product, Integer optionalStatus, String groupInfoId, Double createTime, String name, String title, String marketGuide, Integer orderNum, Boolean isDisplay, boolean isSelected) {
        return new MarketGroupDict(id, sportId, marketId, product, optionalStatus, groupInfoId, createTime, name, title, marketGuide, orderNum, isDisplay, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketGroupDict)) {
            return false;
        }
        MarketGroupDict marketGroupDict = (MarketGroupDict) other;
        return Intrinsics.g(this.id, marketGroupDict.id) && Intrinsics.g(this.sportId, marketGroupDict.sportId) && Intrinsics.g(this.marketId, marketGroupDict.marketId) && Intrinsics.g(this.product, marketGroupDict.product) && Intrinsics.g(this.optionalStatus, marketGroupDict.optionalStatus) && Intrinsics.g(this.groupInfoId, marketGroupDict.groupInfoId) && Intrinsics.g(this.createTime, marketGroupDict.createTime) && Intrinsics.g(this.name, marketGroupDict.name) && Intrinsics.g(this.title, marketGroupDict.title) && Intrinsics.g(this.marketGuide, marketGroupDict.marketGuide) && Intrinsics.g(this.orderNum, marketGroupDict.orderNum) && Intrinsics.g(this.isDisplay, marketGroupDict.isDisplay) && this.isSelected == marketGroupDict.isSelected;
    }

    public final Double getCreateTime() {
        return this.createTime;
    }

    public final String getGroupInfoId() {
        return this.groupInfoId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMarketGuide() {
        return this.marketGuide;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOptionalStatus() {
        return this.optionalStatus;
    }

    public final Integer getOrderNum() {
        return this.orderNum;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sportId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.marketId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.product;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.optionalStatus;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.groupInfoId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.createTime;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.marketGuide;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.orderNum;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isDisplay;
        return Boolean.hashCode(this.isSelected) + ((iHashCode11 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final Boolean isDisplay() {
        return this.isDisplay;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.sportId;
        String str3 = this.marketId;
        Integer num = this.product;
        Integer num2 = this.optionalStatus;
        String str4 = this.groupInfoId;
        Double d = this.createTime;
        String str5 = this.name;
        String str6 = this.title;
        String str7 = this.marketGuide;
        Integer num3 = this.orderNum;
        Boolean bool = this.isDisplay;
        boolean z = this.isSelected;
        StringBuilder sbA = ux5.a("MarketGroupDict(id=", str, ", sportId=", str2, ", marketId=");
        oie.a(num, str3, ", product=", ", optionalStatus=", sbA);
        w03.a(num2, ", groupInfoId=", str4, ", createTime=", sbA);
        ry4.a(d, ", name=", str5, ", title=", sbA);
        hxa.c(sbA, str6, ", marketGuide=", str7, ", orderNum=");
        sbA.append(num3);
        sbA.append(", isDisplay=");
        sbA.append(bool);
        sbA.append(", isSelected=");
        return mq0.a(sbA, z, ")");
    }

    public MarketGroupDict(String str, String str2, String str3, Integer num, Integer num2, String str4, Double d, String str5, String str6, String str7, Integer num3, Boolean bool, boolean z) {
        this.id = str;
        this.sportId = str2;
        this.marketId = str3;
        this.product = num;
        this.optionalStatus = num2;
        this.groupInfoId = str4;
        this.createTime = d;
        this.name = str5;
        this.title = str6;
        this.marketGuide = str7;
        this.orderNum = num3;
        this.isDisplay = bool;
        this.isSelected = z;
    }

    public MarketGroupDict() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null);
    }
}
