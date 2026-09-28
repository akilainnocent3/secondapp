package com.sportybet.android.multimaker.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\u0002\b\u0018Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/multimaker/data/dto/MultiMakerLeagueOptionDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "eventSize", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getName", "getEventSize", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerLeagueOptionDto {
    public static final int $stable = 0;
    private final int eventSize;
    private final String id;
    private final String name;

    public MultiMakerLeagueOptionDto(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
        this.eventSize = i;
    }

    public static /* synthetic */ MultiMakerLeagueOptionDto copy$default(MultiMakerLeagueOptionDto multiMakerLeagueOptionDto, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = multiMakerLeagueOptionDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = multiMakerLeagueOptionDto.name;
        }
        if ((i2 & 4) != 0) {
            i = multiMakerLeagueOptionDto.eventSize;
        }
        return multiMakerLeagueOptionDto.copy(str, str2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEventSize() {
        return this.eventSize;
    }

    public final MultiMakerLeagueOptionDto copy(String id, String name, int eventSize) {
        id.getClass();
        name.getClass();
        return new MultiMakerLeagueOptionDto(id, name, eventSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiMakerLeagueOptionDto)) {
            return false;
        }
        MultiMakerLeagueOptionDto multiMakerLeagueOptionDto = (MultiMakerLeagueOptionDto) other;
        return Intrinsics.g(this.id, multiMakerLeagueOptionDto.id) && Intrinsics.g(this.name, multiMakerLeagueOptionDto.name) && this.eventSize == multiMakerLeagueOptionDto.eventSize;
    }

    public final int getEventSize() {
        return this.eventSize;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Integer.hashCode(this.eventSize) + gmf0.a(this.id.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        return zk1.a(this.eventSize, ")", ux5.a("MultiMakerLeagueOptionDto(id=", this.id, ", name=", this.name, ", eventSize="));
    }
}
