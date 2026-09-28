package com.sportybet.feature.luckynumber.lobby.data.dto;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNFeatureDTO;", "", "showSearch", "", "showPopular", "<init>", "(ZZ)V", "getShowSearch", "()Z", "getShowPopular", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNFeatureDTO {
    public static final int $stable = 0;
    private final boolean showPopular;
    private final boolean showSearch;

    public LNFeatureDTO(boolean z, boolean z2) {
        this.showSearch = z;
        this.showPopular = z2;
    }

    public static /* synthetic */ LNFeatureDTO copy$default(LNFeatureDTO lNFeatureDTO, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = lNFeatureDTO.showSearch;
        }
        if ((i & 2) != 0) {
            z2 = lNFeatureDTO.showPopular;
        }
        return lNFeatureDTO.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowSearch() {
        return this.showSearch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowPopular() {
        return this.showPopular;
    }

    public final LNFeatureDTO copy(boolean showSearch, boolean showPopular) {
        return new LNFeatureDTO(showSearch, showPopular);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNFeatureDTO)) {
            return false;
        }
        LNFeatureDTO lNFeatureDTO = (LNFeatureDTO) other;
        return this.showSearch == lNFeatureDTO.showSearch && this.showPopular == lNFeatureDTO.showPopular;
    }

    public final boolean getShowPopular() {
        return this.showPopular;
    }

    public final boolean getShowSearch() {
        return this.showSearch;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showPopular) + (Boolean.hashCode(this.showSearch) * 31);
    }

    public String toString() {
        return "LNFeatureDTO(showSearch=" + this.showSearch + ", showPopular=" + this.showPopular + ")";
    }
}
