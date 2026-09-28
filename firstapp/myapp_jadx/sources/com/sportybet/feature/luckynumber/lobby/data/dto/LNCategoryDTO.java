package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.mtg0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCategoryDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "enabled", "", "feature", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNFeatureDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/sportybet/feature/luckynumber/lobby/data/dto/LNFeatureDTO;)V", "getId", "()Ljava/lang/String;", "getName", "getEnabled", "()Z", "getFeature", "()Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNFeatureDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNCategoryDTO {
    public static final int $stable = LNFeatureDTO.$stable;
    private final boolean enabled;
    private final LNFeatureDTO feature;
    private final String id;
    private final String name;

    public LNCategoryDTO(String str, String str2, boolean z, LNFeatureDTO lNFeatureDTO) {
        str.getClass();
        str2.getClass();
        lNFeatureDTO.getClass();
        this.id = str;
        this.name = str2;
        this.enabled = z;
        this.feature = lNFeatureDTO;
    }

    public static /* synthetic */ LNCategoryDTO copy$default(LNCategoryDTO lNCategoryDTO, String str, String str2, boolean z, LNFeatureDTO lNFeatureDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNCategoryDTO.id;
        }
        if ((i & 2) != 0) {
            str2 = lNCategoryDTO.name;
        }
        if ((i & 4) != 0) {
            z = lNCategoryDTO.enabled;
        }
        if ((i & 8) != 0) {
            lNFeatureDTO = lNCategoryDTO.feature;
        }
        return lNCategoryDTO.copy(str, str2, z, lNFeatureDTO);
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
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LNFeatureDTO getFeature() {
        return this.feature;
    }

    public final LNCategoryDTO copy(String id, String name, boolean enabled, LNFeatureDTO feature) {
        id.getClass();
        name.getClass();
        feature.getClass();
        return new LNCategoryDTO(id, name, enabled, feature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNCategoryDTO)) {
            return false;
        }
        LNCategoryDTO lNCategoryDTO = (LNCategoryDTO) other;
        return Intrinsics.g(this.id, lNCategoryDTO.id) && Intrinsics.g(this.name, lNCategoryDTO.name) && this.enabled == lNCategoryDTO.enabled && Intrinsics.g(this.feature, lNCategoryDTO.feature);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final LNFeatureDTO getFeature() {
        return this.feature;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.feature.hashCode() + mtg0.a(gmf0.a(this.id.hashCode() * 31, 31, this.name), 31, this.enabled);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        boolean z = this.enabled;
        LNFeatureDTO lNFeatureDTO = this.feature;
        StringBuilder sbA = ux5.a("LNCategoryDTO(id=", str, ", name=", str2, ", enabled=");
        sbA.append(z);
        sbA.append(", feature=");
        sbA.append(lNFeatureDTO);
        sbA.append(")");
        return sbA.toString();
    }
}
