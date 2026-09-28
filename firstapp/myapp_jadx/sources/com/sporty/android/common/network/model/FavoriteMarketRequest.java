package com.sporty.android.common.network.model;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/common/network/model/FavoriteMarketRequest;", "", "sportId", "", "productId", "", "marketId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSportId", "()Ljava/lang/String;", "getProductId", "()I", "getMarketId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common-network", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FavoriteMarketRequest {
    private final String marketId;
    private final int productId;
    private final String sportId;

    public FavoriteMarketRequest(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.sportId = str;
        this.productId = i;
        this.marketId = str2;
    }

    public static /* synthetic */ FavoriteMarketRequest copy$default(FavoriteMarketRequest favoriteMarketRequest, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = favoriteMarketRequest.sportId;
        }
        if ((i2 & 2) != 0) {
            i = favoriteMarketRequest.productId;
        }
        if ((i2 & 4) != 0) {
            str2 = favoriteMarketRequest.marketId;
        }
        return favoriteMarketRequest.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    public final FavoriteMarketRequest copy(String sportId, int productId, String marketId) {
        sportId.getClass();
        marketId.getClass();
        return new FavoriteMarketRequest(sportId, productId, marketId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteMarketRequest)) {
            return false;
        }
        FavoriteMarketRequest favoriteMarketRequest = (FavoriteMarketRequest) other;
        return Intrinsics.g(this.sportId, favoriteMarketRequest.sportId) && this.productId == favoriteMarketRequest.productId && Intrinsics.g(this.marketId, favoriteMarketRequest.marketId);
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        return this.marketId.hashCode() + gpp.a(this.productId, this.sportId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.sportId;
        int i = this.productId;
        return uf80.a(ml5.a(i, "FavoriteMarketRequest(sportId=", str, ", productId=", ", marketId="), this.marketId, ")");
    }
}
