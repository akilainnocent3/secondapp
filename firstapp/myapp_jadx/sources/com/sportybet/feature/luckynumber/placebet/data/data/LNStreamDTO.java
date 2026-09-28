package com.sportybet.feature.luckynumber.placebet.data.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStreamDTO;", "", "hlsUrl", "", "nextDrawing", "Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStreamDrawTimeDTO;", "currentDrawing", "<init>", "(Ljava/lang/String;Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStreamDrawTimeDTO;Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStreamDrawTimeDTO;)V", "getHlsUrl", "()Ljava/lang/String;", "getNextDrawing", "()Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStreamDrawTimeDTO;", "getCurrentDrawing", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNStreamDTO {
    public static final int $stable = LNStreamDrawTimeDTO.$stable;
    private final LNStreamDrawTimeDTO currentDrawing;
    private final String hlsUrl;
    private final LNStreamDrawTimeDTO nextDrawing;

    public LNStreamDTO(String str, LNStreamDrawTimeDTO lNStreamDrawTimeDTO, LNStreamDrawTimeDTO lNStreamDrawTimeDTO2) {
        str.getClass();
        lNStreamDrawTimeDTO.getClass();
        this.hlsUrl = str;
        this.nextDrawing = lNStreamDrawTimeDTO;
        this.currentDrawing = lNStreamDrawTimeDTO2;
    }

    public static /* synthetic */ LNStreamDTO copy$default(LNStreamDTO lNStreamDTO, String str, LNStreamDrawTimeDTO lNStreamDrawTimeDTO, LNStreamDrawTimeDTO lNStreamDrawTimeDTO2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNStreamDTO.hlsUrl;
        }
        if ((i & 2) != 0) {
            lNStreamDrawTimeDTO = lNStreamDTO.nextDrawing;
        }
        if ((i & 4) != 0) {
            lNStreamDrawTimeDTO2 = lNStreamDTO.currentDrawing;
        }
        return lNStreamDTO.copy(str, lNStreamDrawTimeDTO, lNStreamDrawTimeDTO2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHlsUrl() {
        return this.hlsUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LNStreamDrawTimeDTO getNextDrawing() {
        return this.nextDrawing;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LNStreamDrawTimeDTO getCurrentDrawing() {
        return this.currentDrawing;
    }

    public final LNStreamDTO copy(String hlsUrl, LNStreamDrawTimeDTO nextDrawing, LNStreamDrawTimeDTO currentDrawing) {
        hlsUrl.getClass();
        nextDrawing.getClass();
        return new LNStreamDTO(hlsUrl, nextDrawing, currentDrawing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNStreamDTO)) {
            return false;
        }
        LNStreamDTO lNStreamDTO = (LNStreamDTO) other;
        return Intrinsics.g(this.hlsUrl, lNStreamDTO.hlsUrl) && Intrinsics.g(this.nextDrawing, lNStreamDTO.nextDrawing) && Intrinsics.g(this.currentDrawing, lNStreamDTO.currentDrawing);
    }

    public final LNStreamDrawTimeDTO getCurrentDrawing() {
        return this.currentDrawing;
    }

    public final String getHlsUrl() {
        return this.hlsUrl;
    }

    public final LNStreamDrawTimeDTO getNextDrawing() {
        return this.nextDrawing;
    }

    public int hashCode() {
        int iHashCode = (this.nextDrawing.hashCode() + (this.hlsUrl.hashCode() * 31)) * 31;
        LNStreamDrawTimeDTO lNStreamDrawTimeDTO = this.currentDrawing;
        return iHashCode + (lNStreamDrawTimeDTO == null ? 0 : lNStreamDrawTimeDTO.hashCode());
    }

    public String toString() {
        return "LNStreamDTO(hlsUrl=" + this.hlsUrl + ", nextDrawing=" + this.nextDrawing + ", currentDrawing=" + this.currentDrawing + ")";
    }
}
