package com.sportybet.android.multimaker.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.oie;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0006\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\u0002\b\u001fÊ\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/sportybet/android/multimaker/data/dto/MultiMakerOutcomeDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "odds", "probability", "isActive", "", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getOdds", "getProbability", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDesc", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sportybet/android/multimaker/data/dto/MultiMakerOutcomeDto;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerOutcomeDto {
    public static final int $stable = 0;
    private final String desc;
    private final String id;
    private final Integer isActive;
    private final String odds;
    private final String probability;

    public /* synthetic */ MultiMakerOutcomeDto(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ MultiMakerOutcomeDto copy$default(MultiMakerOutcomeDto multiMakerOutcomeDto, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiMakerOutcomeDto.id;
        }
        if ((i & 2) != 0) {
            str2 = multiMakerOutcomeDto.odds;
        }
        if ((i & 4) != 0) {
            str3 = multiMakerOutcomeDto.probability;
        }
        if ((i & 8) != 0) {
            num = multiMakerOutcomeDto.isActive;
        }
        if ((i & 16) != 0) {
            str4 = multiMakerOutcomeDto.desc;
        }
        String str5 = str4;
        String str6 = str3;
        return multiMakerOutcomeDto.copy(str, str2, str6, num, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final MultiMakerOutcomeDto copy(String id, String odds, String probability, Integer isActive, String desc) {
        return new MultiMakerOutcomeDto(id, odds, probability, isActive, desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiMakerOutcomeDto)) {
            return false;
        }
        MultiMakerOutcomeDto multiMakerOutcomeDto = (MultiMakerOutcomeDto) other;
        return Intrinsics.g(this.id, multiMakerOutcomeDto.id) && Intrinsics.g(this.odds, multiMakerOutcomeDto.odds) && Intrinsics.g(this.probability, multiMakerOutcomeDto.probability) && Intrinsics.g(this.isActive, multiMakerOutcomeDto.isActive) && Intrinsics.g(this.desc, multiMakerOutcomeDto.desc);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getProbability() {
        return this.probability;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.odds;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.probability;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.isActive;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.desc;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Integer isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.odds;
        String str3 = this.probability;
        Integer num = this.isActive;
        String str4 = this.desc;
        StringBuilder sbA = ux5.a("MultiMakerOutcomeDto(id=", str, ", odds=", str2, ", probability=");
        oie.a(num, str3, ", isActive=", ", desc=", sbA);
        return uf80.a(sbA, str4, ")");
    }

    public MultiMakerOutcomeDto(String str, String str2, String str3, Integer num, String str4) {
        this.id = str;
        this.odds = str2;
        this.probability = str3;
        this.isActive = num;
        this.desc = str4;
    }

    public MultiMakerOutcomeDto() {
        this(null, null, null, null, null, 31, null);
    }
}
