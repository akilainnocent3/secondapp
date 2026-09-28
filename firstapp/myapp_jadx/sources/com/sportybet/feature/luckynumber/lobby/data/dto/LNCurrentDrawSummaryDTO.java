package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0016Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCurrentDrawSummaryDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "drawTime", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getDrawTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNCurrentDrawSummaryDTO {
    public static final int $stable = 0;
    private final long drawTime;
    private final String id;

    public LNCurrentDrawSummaryDTO(String str, long j) {
        str.getClass();
        this.id = str;
        this.drawTime = j;
    }

    public static /* synthetic */ LNCurrentDrawSummaryDTO copy$default(LNCurrentDrawSummaryDTO lNCurrentDrawSummaryDTO, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNCurrentDrawSummaryDTO.id;
        }
        if ((i & 2) != 0) {
            j = lNCurrentDrawSummaryDTO.drawTime;
        }
        return lNCurrentDrawSummaryDTO.copy(str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDrawTime() {
        return this.drawTime;
    }

    public final LNCurrentDrawSummaryDTO copy(String id, long drawTime) {
        id.getClass();
        return new LNCurrentDrawSummaryDTO(id, drawTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNCurrentDrawSummaryDTO)) {
            return false;
        }
        LNCurrentDrawSummaryDTO lNCurrentDrawSummaryDTO = (LNCurrentDrawSummaryDTO) other;
        return Intrinsics.g(this.id, lNCurrentDrawSummaryDTO.id) && this.drawTime == lNCurrentDrawSummaryDTO.drawTime;
    }

    public final long getDrawTime() {
        return this.drawTime;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Long.hashCode(this.drawTime) + (this.id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbA = x.a(this.drawTime, "LNCurrentDrawSummaryDTO(id=", this.id, ", drawTime=");
        sbA.append(")");
        return sbA.toString();
    }
}
