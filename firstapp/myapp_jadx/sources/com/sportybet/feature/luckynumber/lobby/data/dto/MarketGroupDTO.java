package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/MarketGroupDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "marketIds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getName", "getMarketIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketGroupDTO {
    public static final int $stable = 8;
    private final String id;
    private final List<String> marketIds;
    private final String name;

    public MarketGroupDTO(String str, String str2, List<String> list) {
        bt6.a(str, str2, list);
        this.id = str;
        this.name = str2;
        this.marketIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketGroupDTO copy$default(MarketGroupDTO marketGroupDTO, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketGroupDTO.id;
        }
        if ((i & 2) != 0) {
            str2 = marketGroupDTO.name;
        }
        if ((i & 4) != 0) {
            list = marketGroupDTO.marketIds;
        }
        return marketGroupDTO.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<String> component3() {
        return this.marketIds;
    }

    public final MarketGroupDTO copy(String id, String name, List<String> marketIds) {
        id.getClass();
        name.getClass();
        marketIds.getClass();
        return new MarketGroupDTO(id, name, marketIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketGroupDTO)) {
            return false;
        }
        MarketGroupDTO marketGroupDTO = (MarketGroupDTO) other;
        return Intrinsics.g(this.id, marketGroupDTO.id) && Intrinsics.g(this.name, marketGroupDTO.name) && Intrinsics.g(this.marketIds, marketGroupDTO.marketIds);
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getMarketIds() {
        return this.marketIds;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.marketIds.hashCode() + gmf0.a(this.id.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return ng1.a(ux5.a("MarketGroupDTO(id=", str, ", name=", str2, ", marketIds="), this.marketIds, ")");
    }
}
