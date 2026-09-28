package com.sportygames.spin2win.model.local;

import com.sporty.android.book.domain.entity.Category;
import defpackage.hxa;
import defpackage.ng1;
import defpackage.s27;
import defpackage.x03;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\bH\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010M\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010Q\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010S\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0017HÆ\u0003Jâ\u0001\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0017HÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\b2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u000bHÖ\u0001J\t\u0010^\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b\t\u0010&\"\u0004\b*\u0010(R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001dR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b:\u0010,\"\u0004\b;\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010 \"\u0004\b=\u0010\"R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010 \"\u0004\b?\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010 \"\u0004\bA\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010 \"\u0004\bC\u0010\"R$\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006_"}, d2 = {"Lcom/sportygames/spin2win/model/local/LocalGameDetailsEntity;", "", "betAmount", "", Category.CATEGORY_ID, "", "color", "selected", "", "isTempSelected", "value", "", "minAmount", "maxAmount", "defaultAmount", "betTypeId", "payMultiplier", "statsInfo", "localizedTitle", "dozen", "sector", "betType", "allBetAmountList", "", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBetAmount", "()Ljava/lang/Double;", "setBetAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getColor", "setColor", "getSelected", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setTempSelected", "getValue", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMinAmount", "setMinAmount", "getMaxAmount", "setMaxAmount", "getDefaultAmount", "setDefaultAmount", "getBetTypeId", "setBetTypeId", "getPayMultiplier", "setPayMultiplier", "getStatsInfo", "setStatsInfo", "getLocalizedTitle", "setLocalizedTitle", "getDozen", "setDozen", "getSector", "setSector", "getBetType", "setBetType", "getAllBetAmountList", "()Ljava/util/List;", "setAllBetAmountList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sportygames/spin2win/model/local/LocalGameDetailsEntity;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalGameDetailsEntity {
    public static final int $stable = 8;
    private List<String> allBetAmountList;
    private Double betAmount;
    private String betType;
    private Integer betTypeId;
    private String category;
    private String color;
    private Double defaultAmount;
    private String dozen;
    private Boolean isTempSelected;
    private String localizedTitle;
    private Double maxAmount;
    private Double minAmount;
    private Double payMultiplier;
    private String sector;
    private Boolean selected;
    private Integer statsInfo;
    private Integer value;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LocalGameDetailsEntity(Double d, String str, String str2, Boolean bool, Boolean bool2, Integer num, Double d2, Double d3, Double d4, Integer num2, Double d5, Integer num3, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4 = 0;
        Double dValueOf = Double.valueOf(0.0d);
        this((i & 1) != 0 ? dValueOf : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? -1 : num, (i & 64) != 0 ? dValueOf : d2, (i & 128) != 0 ? dValueOf : d3, (i & 256) != 0 ? dValueOf : d4, (i & 512) != 0 ? num4 : num2, (i & 1024) == 0 ? d5 : dValueOf, (i & 2048) == 0 ? num3 : 0, (i & 4096) != 0 ? "" : str3, (i & 8192) != 0 ? "" : str4, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str5, (i & 32768) == 0 ? str6 : "", (i & 65536) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalGameDetailsEntity copy$default(LocalGameDetailsEntity localGameDetailsEntity, Double d, String str, String str2, Boolean bool, Boolean bool2, Integer num, Double d2, Double d3, Double d4, Integer num2, Double d5, Integer num3, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        List list2;
        String str7;
        Double d6 = (i & 1) != 0 ? localGameDetailsEntity.betAmount : d;
        String str8 = (i & 2) != 0 ? localGameDetailsEntity.category : str;
        String str9 = (i & 4) != 0 ? localGameDetailsEntity.color : str2;
        Boolean bool3 = (i & 8) != 0 ? localGameDetailsEntity.selected : bool;
        Boolean bool4 = (i & 16) != 0 ? localGameDetailsEntity.isTempSelected : bool2;
        Integer num4 = (i & 32) != 0 ? localGameDetailsEntity.value : num;
        Double d7 = (i & 64) != 0 ? localGameDetailsEntity.minAmount : d2;
        Double d8 = (i & 128) != 0 ? localGameDetailsEntity.maxAmount : d3;
        Double d9 = (i & 256) != 0 ? localGameDetailsEntity.defaultAmount : d4;
        Integer num5 = (i & 512) != 0 ? localGameDetailsEntity.betTypeId : num2;
        Double d10 = (i & 1024) != 0 ? localGameDetailsEntity.payMultiplier : d5;
        Integer num6 = (i & 2048) != 0 ? localGameDetailsEntity.statsInfo : num3;
        String str10 = (i & 4096) != 0 ? localGameDetailsEntity.localizedTitle : str3;
        String str11 = (i & 8192) != 0 ? localGameDetailsEntity.dozen : str4;
        Double d11 = d6;
        String str12 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? localGameDetailsEntity.sector : str5;
        String str13 = (i & 32768) != 0 ? localGameDetailsEntity.betType : str6;
        if ((i & 65536) != 0) {
            str7 = str13;
            list2 = localGameDetailsEntity.allBetAmountList;
        } else {
            list2 = list;
            str7 = str13;
        }
        return localGameDetailsEntity.copy(d11, str8, str9, bool3, bool4, num4, d7, d8, d9, num5, d10, num6, str10, str11, str12, str7, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getBetTypeId() {
        return this.betTypeId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getPayMultiplier() {
        return this.payMultiplier;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getStatsInfo() {
        return this.statsInfo;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLocalizedTitle() {
        return this.localizedTitle;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDozen() {
        return this.dozen;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBetType() {
        return this.betType;
    }

    public final List<String> component17() {
        return this.allBetAmountList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsTempSelected() {
        return this.isTempSelected;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final LocalGameDetailsEntity copy(Double betAmount, String category, String color, Boolean selected, Boolean isTempSelected, Integer value, Double minAmount, Double maxAmount, Double defaultAmount, Integer betTypeId, Double payMultiplier, Integer statsInfo, String localizedTitle, String dozen, String sector, String betType, List<String> allBetAmountList) {
        return new LocalGameDetailsEntity(betAmount, category, color, selected, isTempSelected, value, minAmount, maxAmount, defaultAmount, betTypeId, payMultiplier, statsInfo, localizedTitle, dozen, sector, betType, allBetAmountList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalGameDetailsEntity)) {
            return false;
        }
        LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) other;
        return Intrinsics.g(this.betAmount, localGameDetailsEntity.betAmount) && Intrinsics.g(this.category, localGameDetailsEntity.category) && Intrinsics.g(this.color, localGameDetailsEntity.color) && Intrinsics.g(this.selected, localGameDetailsEntity.selected) && Intrinsics.g(this.isTempSelected, localGameDetailsEntity.isTempSelected) && Intrinsics.g(this.value, localGameDetailsEntity.value) && Intrinsics.g(this.minAmount, localGameDetailsEntity.minAmount) && Intrinsics.g(this.maxAmount, localGameDetailsEntity.maxAmount) && Intrinsics.g(this.defaultAmount, localGameDetailsEntity.defaultAmount) && Intrinsics.g(this.betTypeId, localGameDetailsEntity.betTypeId) && Intrinsics.g(this.payMultiplier, localGameDetailsEntity.payMultiplier) && Intrinsics.g(this.statsInfo, localGameDetailsEntity.statsInfo) && Intrinsics.g(this.localizedTitle, localGameDetailsEntity.localizedTitle) && Intrinsics.g(this.dozen, localGameDetailsEntity.dozen) && Intrinsics.g(this.sector, localGameDetailsEntity.sector) && Intrinsics.g(this.betType, localGameDetailsEntity.betType) && Intrinsics.g(this.allBetAmountList, localGameDetailsEntity.allBetAmountList);
    }

    public final List<String> getAllBetAmountList() {
        return this.allBetAmountList;
    }

    public final Double getBetAmount() {
        return this.betAmount;
    }

    public final String getBetType() {
        return this.betType;
    }

    public final Integer getBetTypeId() {
        return this.betTypeId;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getColor() {
        return this.color;
    }

    public final Double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final String getDozen() {
        return this.dozen;
    }

    public final String getLocalizedTitle() {
        return this.localizedTitle;
    }

    public final Double getMaxAmount() {
        return this.maxAmount;
    }

    public final Double getMinAmount() {
        return this.minAmount;
    }

    public final Double getPayMultiplier() {
        return this.payMultiplier;
    }

    public final String getSector() {
        return this.sector;
    }

    public final Boolean getSelected() {
        return this.selected;
    }

    public final Integer getStatsInfo() {
        return this.statsInfo;
    }

    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        Double d = this.betAmount;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.category;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.selected;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isTempSelected;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.value;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.minAmount;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.maxAmount;
        int iHashCode8 = (iHashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.defaultAmount;
        int iHashCode9 = (iHashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num2 = this.betTypeId;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d5 = this.payMultiplier;
        int iHashCode11 = (iHashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num3 = this.statsInfo;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.localizedTitle;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dozen;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sector;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.betType;
        int iHashCode16 = (iHashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.allBetAmountList;
        return iHashCode16 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isTempSelected() {
        return this.isTempSelected;
    }

    public final void setAllBetAmountList(List<String> list) {
        this.allBetAmountList = list;
    }

    public final void setBetAmount(Double d) {
        this.betAmount = d;
    }

    public final void setBetType(String str) {
        this.betType = str;
    }

    public final void setBetTypeId(Integer num) {
        this.betTypeId = num;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final void setDefaultAmount(Double d) {
        this.defaultAmount = d;
    }

    public final void setDozen(String str) {
        this.dozen = str;
    }

    public final void setLocalizedTitle(String str) {
        this.localizedTitle = str;
    }

    public final void setMaxAmount(Double d) {
        this.maxAmount = d;
    }

    public final void setMinAmount(Double d) {
        this.minAmount = d;
    }

    public final void setPayMultiplier(Double d) {
        this.payMultiplier = d;
    }

    public final void setSector(String str) {
        this.sector = str;
    }

    public final void setSelected(Boolean bool) {
        this.selected = bool;
    }

    public final void setStatsInfo(Integer num) {
        this.statsInfo = num;
    }

    public final void setTempSelected(Boolean bool) {
        this.isTempSelected = bool;
    }

    public final void setValue(Integer num) {
        this.value = num;
    }

    public String toString() {
        Double d = this.betAmount;
        String str = this.category;
        String str2 = this.color;
        Boolean bool = this.selected;
        Boolean bool2 = this.isTempSelected;
        Integer num = this.value;
        Double d2 = this.minAmount;
        Double d3 = this.maxAmount;
        Double d4 = this.defaultAmount;
        Integer num2 = this.betTypeId;
        Double d5 = this.payMultiplier;
        Integer num3 = this.statsInfo;
        String str3 = this.localizedTitle;
        String str4 = this.dozen;
        String str5 = this.sector;
        String str6 = this.betType;
        List<String> list = this.allBetAmountList;
        StringBuilder sb = new StringBuilder("LocalGameDetailsEntity(betAmount=");
        sb.append(d);
        sb.append(", category=");
        sb.append(str);
        sb.append(", color=");
        x03.a(sb, str2, ", selected=", bool, ", isTempSelected=");
        sb.append(bool2);
        sb.append(", value=");
        sb.append(num);
        sb.append(", minAmount=");
        s27.a(d2, d3, ", maxAmount=", ", defaultAmount=", sb);
        sb.append(d4);
        sb.append(", betTypeId=");
        sb.append(num2);
        sb.append(", payMultiplier=");
        sb.append(d5);
        sb.append(", statsInfo=");
        sb.append(num3);
        sb.append(", localizedTitle=");
        hxa.c(sb, str3, ", dozen=", str4, ", sector=");
        hxa.c(sb, str5, ", betType=", str6, ", allBetAmountList=");
        return ng1.a(sb, list, ")");
    }

    public LocalGameDetailsEntity(Double d, String str, String str2, Boolean bool, Boolean bool2, Integer num, Double d2, Double d3, Double d4, Integer num2, Double d5, Integer num3, String str3, String str4, String str5, String str6, List<String> list) {
        this.betAmount = d;
        this.category = str;
        this.color = str2;
        this.selected = bool;
        this.isTempSelected = bool2;
        this.value = num;
        this.minAmount = d2;
        this.maxAmount = d3;
        this.defaultAmount = d4;
        this.betTypeId = num2;
        this.payMultiplier = d5;
        this.statsInfo = num3;
        this.localizedTitle = str3;
        this.dozen = str4;
        this.sector = str5;
        this.betType = str6;
        this.allBetAmountList = list;
    }

    public LocalGameDetailsEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }
}
