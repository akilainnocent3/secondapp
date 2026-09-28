package com.sportybet.feature.luckynumber.placebet.data.data;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.nrz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNFavorInfoDTO;", "", "giftId", "", "giftKind", "", "giftAmount", "", "<init>", "(Ljava/lang/String;IJ)V", "getGiftId", "()Ljava/lang/String;", "getGiftKind", "()I", "getGiftAmount", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNFavorInfoDTO {
    public static final int $stable = 0;
    private final long giftAmount;
    private final String giftId;
    private final int giftKind;

    public LNFavorInfoDTO(String str, int i, long j) {
        str.getClass();
        this.giftId = str;
        this.giftKind = i;
        this.giftAmount = j;
    }

    public static /* synthetic */ LNFavorInfoDTO copy$default(LNFavorInfoDTO lNFavorInfoDTO, String str, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lNFavorInfoDTO.giftId;
        }
        if ((i2 & 2) != 0) {
            i = lNFavorInfoDTO.giftKind;
        }
        if ((i2 & 4) != 0) {
            j = lNFavorInfoDTO.giftAmount;
        }
        return lNFavorInfoDTO.copy(str, i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getGiftAmount() {
        return this.giftAmount;
    }

    public final LNFavorInfoDTO copy(String giftId, int giftKind, long giftAmount) {
        giftId.getClass();
        return new LNFavorInfoDTO(giftId, giftKind, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNFavorInfoDTO)) {
            return false;
        }
        LNFavorInfoDTO lNFavorInfoDTO = (LNFavorInfoDTO) other;
        return Intrinsics.g(this.giftId, lNFavorInfoDTO.giftId) && this.giftKind == lNFavorInfoDTO.giftKind && this.giftAmount == lNFavorInfoDTO.giftAmount;
    }

    public final long getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final int getGiftKind() {
        return this.giftKind;
    }

    public int hashCode() {
        return Long.hashCode(this.giftAmount) + gpp.a(this.giftKind, this.giftId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.giftId;
        return nrz.a(this.giftAmount, ")", ml5.a(this.giftKind, "LNFavorInfoDTO(giftId=", str, ", giftKind=", ", giftAmount="));
    }
}
