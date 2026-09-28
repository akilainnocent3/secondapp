package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.appsflyer.internal.x;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNDrawSummaryDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "drawTime", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "i", "getDrawTime", "()J", "d", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNDrawSummaryDTO {
    public static final int $stable = 0;

    @SerializedName("d")
    private final long drawTime;

    @SerializedName("i")
    private final String id;

    public LNDrawSummaryDTO(String str, long j) {
        str.getClass();
        this.id = str;
        this.drawTime = j;
    }

    public static /* synthetic */ LNDrawSummaryDTO copy$default(LNDrawSummaryDTO lNDrawSummaryDTO, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNDrawSummaryDTO.id;
        }
        if ((i & 2) != 0) {
            j = lNDrawSummaryDTO.drawTime;
        }
        return lNDrawSummaryDTO.copy(str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDrawTime() {
        return this.drawTime;
    }

    public final LNDrawSummaryDTO copy(String id, long drawTime) {
        id.getClass();
        return new LNDrawSummaryDTO(id, drawTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNDrawSummaryDTO)) {
            return false;
        }
        LNDrawSummaryDTO lNDrawSummaryDTO = (LNDrawSummaryDTO) other;
        return Intrinsics.g(this.id, lNDrawSummaryDTO.id) && this.drawTime == lNDrawSummaryDTO.drawTime;
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
        StringBuilder sbA = x.a(this.drawTime, "LNDrawSummaryDTO(id=", this.id, ", drawTime=");
        sbA.append(")");
        return sbA.toString();
    }
}
