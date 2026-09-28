package com.sportybet.feature.luckynumber.lobby.data.dto;

import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nÊ\u0001\u0002\b\u0016Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLobbyDTO;", "", "banners", "", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNBannerDTO;", "categoryIds", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBanners", "()Ljava/util/List;", "getCategoryIds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNLobbyDTO {
    public static final int $stable = 0;
    private final List<LNBannerDTO> banners;
    private final List<String> categoryIds;

    public LNLobbyDTO(List<LNBannerDTO> list, List<String> list2) {
        list.getClass();
        list2.getClass();
        this.banners = list;
        this.categoryIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNLobbyDTO copy$default(LNLobbyDTO lNLobbyDTO, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lNLobbyDTO.banners;
        }
        if ((i & 2) != 0) {
            list2 = lNLobbyDTO.categoryIds;
        }
        return lNLobbyDTO.copy(list, list2);
    }

    public final List<LNBannerDTO> component1() {
        return this.banners;
    }

    public final List<String> component2() {
        return this.categoryIds;
    }

    public final LNLobbyDTO copy(List<LNBannerDTO> banners, List<String> categoryIds) {
        banners.getClass();
        categoryIds.getClass();
        return new LNLobbyDTO(banners, categoryIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNLobbyDTO)) {
            return false;
        }
        LNLobbyDTO lNLobbyDTO = (LNLobbyDTO) other;
        return Intrinsics.g(this.banners, lNLobbyDTO.banners) && Intrinsics.g(this.categoryIds, lNLobbyDTO.categoryIds);
    }

    public final List<LNBannerDTO> getBanners() {
        return this.banners;
    }

    public final List<String> getCategoryIds() {
        return this.categoryIds;
    }

    public int hashCode() {
        return this.categoryIds.hashCode() + (this.banners.hashCode() * 31);
    }

    public String toString() {
        return w9d.a("LNLobbyDTO(banners=", ", categoryIds=", ")", this.banners, this.categoryIds);
    }
}
