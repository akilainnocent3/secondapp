package com.sportybet.feature.worldcup.tournament.data.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.bt6;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.m2g;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\u0002\b!Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, d2 = {"Lcom/sportybet/feature/worldcup/tournament/data/model/StageDto;", "", "stageId", "", "name", "order", "", AnalyticsParam.EVENT_STATUS, "matches", "", "Lcom/sportybet/feature/worldcup/tournament/data/model/KnockoutMatchDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "getStageId", "()Ljava/lang/String;", "getName", "getOrder", "()I", "getStatus", "getMatches", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "world-cup", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StageDto {
    public static final int $stable = 8;
    private final List<KnockoutMatchDto> matches;
    private final String name;
    private final int order;
    private final String stageId;
    private final String status;

    public StageDto(String str, String str2, int i, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StageDto copy$default(StageDto stageDto, String str, String str2, int i, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stageDto.stageId;
        }
        if ((i2 & 2) != 0) {
            str2 = stageDto.name;
        }
        if ((i2 & 4) != 0) {
            i = stageDto.order;
        }
        if ((i2 & 8) != 0) {
            str3 = stageDto.status;
        }
        if ((i2 & 16) != 0) {
            list = stageDto.matches;
        }
        List list2 = list;
        int i3 = i;
        return stageDto.copy(str, str2, i3, str3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStageId() {
        return this.stageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final List<KnockoutMatchDto> component5() {
        return this.matches;
    }

    public final StageDto copy(String stageId, String name, int order, String status, List<KnockoutMatchDto> matches) {
        stageId.getClass();
        name.getClass();
        matches.getClass();
        return new StageDto(stageId, name, order, status, matches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageDto)) {
            return false;
        }
        StageDto stageDto = (StageDto) other;
        return Intrinsics.g(this.stageId, stageDto.stageId) && Intrinsics.g(this.name, stageDto.name) && this.order == stageDto.order && Intrinsics.g(this.status, stageDto.status) && Intrinsics.g(this.matches, stageDto.matches);
    }

    public final List<KnockoutMatchDto> getMatches() {
        return this.matches;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getStageId() {
        return this.stageId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = gpp.a(this.order, gmf0.a(this.stageId.hashCode() * 31, 31, this.name), 31);
        String str = this.status;
        return this.matches.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.stageId;
        String str2 = this.name;
        int i = this.order;
        String str3 = this.status;
        List<KnockoutMatchDto> list = this.matches;
        StringBuilder sbA = ux5.a("StageDto(stageId=", str, ", name=", str2, ", order=");
        f78.b(i, ", status=", str3, ", matches=", sbA);
        return ng1.a(sbA, list, ")");
    }

    public StageDto(String str, String str2, int i, String str3, List<KnockoutMatchDto> list) {
        bt6.a(str, str2, list);
        this.stageId = str;
        this.name = str2;
        this.order = i;
        this.status = str3;
        this.matches = list;
    }
}
