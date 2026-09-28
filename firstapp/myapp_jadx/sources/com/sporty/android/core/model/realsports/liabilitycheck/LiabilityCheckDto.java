package com.sporty.android.core.model.realsports.liabilitycheck;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.ng1;
import defpackage.ux5;
import defpackage.x03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bHÆ\u0003Jh\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\b\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017Ê\u0001\u0002\b'¨\u0006&"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckDto;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", "outcomeId", "specifier", "sportId", "isLive", "", "childSelections", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getEventId", "()Ljava/lang/String;", "getMarketId", "getOutcomeId", "getSpecifier", "getSportId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChildSelections", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckDto;", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiabilityCheckDto {
    private final List<LiabilityCheckDto> childSelections;
    private final String eventId;
    private final Boolean isLive;
    private final String marketId;
    private final String outcomeId;
    private final String specifier;
    private final String sportId;

    public LiabilityCheckDto(String str, String str2, String str3, String str4, String str5, Boolean bool, List<LiabilityCheckDto> list) {
        this.eventId = str;
        this.marketId = str2;
        this.outcomeId = str3;
        this.specifier = str4;
        this.sportId = str5;
        this.isLive = bool;
        this.childSelections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiabilityCheckDto copy$default(LiabilityCheckDto liabilityCheckDto, String str, String str2, String str3, String str4, String str5, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liabilityCheckDto.eventId;
        }
        if ((i & 2) != 0) {
            str2 = liabilityCheckDto.marketId;
        }
        if ((i & 4) != 0) {
            str3 = liabilityCheckDto.outcomeId;
        }
        if ((i & 8) != 0) {
            str4 = liabilityCheckDto.specifier;
        }
        if ((i & 16) != 0) {
            str5 = liabilityCheckDto.sportId;
        }
        if ((i & 32) != 0) {
            bool = liabilityCheckDto.isLive;
        }
        if ((i & 64) != 0) {
            list = liabilityCheckDto.childSelections;
        }
        Boolean bool2 = bool;
        List list2 = list;
        String str6 = str5;
        String str7 = str3;
        return liabilityCheckDto.copy(str, str2, str7, str4, str6, bool2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsLive() {
        return this.isLive;
    }

    public final List<LiabilityCheckDto> component7() {
        return this.childSelections;
    }

    public final LiabilityCheckDto copy(String eventId, String marketId, String outcomeId, String specifier, String sportId, Boolean isLive, List<LiabilityCheckDto> childSelections) {
        return new LiabilityCheckDto(eventId, marketId, outcomeId, specifier, sportId, isLive, childSelections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiabilityCheckDto)) {
            return false;
        }
        LiabilityCheckDto liabilityCheckDto = (LiabilityCheckDto) other;
        return Intrinsics.g(this.eventId, liabilityCheckDto.eventId) && Intrinsics.g(this.marketId, liabilityCheckDto.marketId) && Intrinsics.g(this.outcomeId, liabilityCheckDto.outcomeId) && Intrinsics.g(this.specifier, liabilityCheckDto.specifier) && Intrinsics.g(this.sportId, liabilityCheckDto.sportId) && Intrinsics.g(this.isLive, liabilityCheckDto.isLive) && Intrinsics.g(this.childSelections, liabilityCheckDto.childSelections);
    }

    public final List<LiabilityCheckDto> getChildSelections() {
        return this.childSelections;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.outcomeId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.specifier;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sportId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isLive;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<LiabilityCheckDto> list = this.childSelections;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isLive() {
        return this.isLive;
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.marketId;
        String str3 = this.outcomeId;
        String str4 = this.specifier;
        String str5 = this.sportId;
        Boolean bool = this.isLive;
        List<LiabilityCheckDto> list = this.childSelections;
        StringBuilder sbA = ux5.a("LiabilityCheckDto(eventId=", str, ", marketId=", str2, ", outcomeId=");
        hxa.c(sbA, str3, ", specifier=", str4, ", sportId=");
        x03.a(sbA, str5, ", isLive=", bool, ", childSelections=");
        return ng1.a(sbA, list, ")");
    }

    public /* synthetic */ LiabilityCheckDto(String str, String str2, String str3, String str4, String str5, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : list);
    }
}
