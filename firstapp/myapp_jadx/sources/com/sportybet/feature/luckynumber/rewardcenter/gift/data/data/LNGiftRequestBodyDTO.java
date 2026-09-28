package com.sportybet.feature.luckynumber.rewardcenter.gift.data.data;

import defpackage.n36;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/feature/luckynumber/rewardcenter/gift/data/data/LNGiftRequestBodyDTO;", "", "classify", "", "bizType", "<init>", "(II)V", "getClassify", "()I", "getBizType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNGiftRequestBodyDTO {
    public static final int $stable = 0;
    private final int bizType;
    private final int classify;

    public LNGiftRequestBodyDTO(int i, int i2) {
        this.classify = i;
        this.bizType = i2;
    }

    public static /* synthetic */ LNGiftRequestBodyDTO copy$default(LNGiftRequestBodyDTO lNGiftRequestBodyDTO, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = lNGiftRequestBodyDTO.classify;
        }
        if ((i3 & 2) != 0) {
            i2 = lNGiftRequestBodyDTO.bizType;
        }
        return lNGiftRequestBodyDTO.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getClassify() {
        return this.classify;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBizType() {
        return this.bizType;
    }

    public final LNGiftRequestBodyDTO copy(int classify, int bizType) {
        return new LNGiftRequestBodyDTO(classify, bizType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNGiftRequestBodyDTO)) {
            return false;
        }
        LNGiftRequestBodyDTO lNGiftRequestBodyDTO = (LNGiftRequestBodyDTO) other;
        return this.classify == lNGiftRequestBodyDTO.classify && this.bizType == lNGiftRequestBodyDTO.bizType;
    }

    public final int getBizType() {
        return this.bizType;
    }

    public final int getClassify() {
        return this.classify;
    }

    public int hashCode() {
        return Integer.hashCode(this.bizType) + (Integer.hashCode(this.classify) * 31);
    }

    public String toString() {
        return n36.a("LNGiftRequestBodyDTO(classify=", this.classify, this.bizType, ", bizType=", ")");
    }
}
