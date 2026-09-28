package com.sportybet.feature.luckynumber.placebet.data.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNBetOrderResponseDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "shortId", AnalyticsParam.EVENT_STATUS, "", "createTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "getId", "()Ljava/lang/String;", "getShortId", "getStatus", "()I", "getCreateTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNBetOrderResponseDTO {
    public static final int $stable = 0;
    private final long createTime;
    private final String id;
    private final String shortId;
    private final int status;

    public LNBetOrderResponseDTO(String str, String str2, int i, long j) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.shortId = str2;
        this.status = i;
        this.createTime = j;
    }

    public static /* synthetic */ LNBetOrderResponseDTO copy$default(LNBetOrderResponseDTO lNBetOrderResponseDTO, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lNBetOrderResponseDTO.id;
        }
        if ((i2 & 2) != 0) {
            str2 = lNBetOrderResponseDTO.shortId;
        }
        if ((i2 & 4) != 0) {
            i = lNBetOrderResponseDTO.status;
        }
        if ((i2 & 8) != 0) {
            j = lNBetOrderResponseDTO.createTime;
        }
        int i3 = i;
        return lNBetOrderResponseDTO.copy(str, str2, i3, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortId() {
        return this.shortId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final LNBetOrderResponseDTO copy(String id, String shortId, int status, long createTime) {
        id.getClass();
        shortId.getClass();
        return new LNBetOrderResponseDTO(id, shortId, status, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNBetOrderResponseDTO)) {
            return false;
        }
        LNBetOrderResponseDTO lNBetOrderResponseDTO = (LNBetOrderResponseDTO) other;
        return Intrinsics.g(this.id, lNBetOrderResponseDTO.id) && Intrinsics.g(this.shortId, lNBetOrderResponseDTO.shortId) && this.status == lNBetOrderResponseDTO.status && this.createTime == lNBetOrderResponseDTO.createTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getShortId() {
        return this.shortId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime) + gpp.a(this.status, gmf0.a(this.id.hashCode() * 31, 31, this.shortId), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.shortId;
        int i = this.status;
        long j = this.createTime;
        StringBuilder sbA = ux5.a("LNBetOrderResponseDTO(id=", str, ", shortId=", str2, ", status=");
        sbA.append(i);
        sbA.append(", createTime=");
        sbA.append(j);
        sbA.append(")");
        return sbA.toString();
    }
}
