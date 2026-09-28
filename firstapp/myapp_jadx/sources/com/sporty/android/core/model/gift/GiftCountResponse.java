package com.sporty.android.core.model.gift;

import com.appsflyer.internal.a0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/gift/GiftCountResponse;", "", "totalNum", "", "totalAmount", "", "<init>", "(IJ)V", "getTotalNum", "()I", "getTotalAmount", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftCountResponse {
    private final long totalAmount;
    private final int totalNum;

    public GiftCountResponse(int i, long j) {
        this.totalNum = i;
        this.totalAmount = j;
    }

    public static /* synthetic */ GiftCountResponse copy$default(GiftCountResponse giftCountResponse, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = giftCountResponse.totalNum;
        }
        if ((i2 & 2) != 0) {
            j = giftCountResponse.totalAmount;
        }
        return giftCountResponse.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public final GiftCountResponse copy(int totalNum, long totalAmount) {
        return new GiftCountResponse(totalNum, totalAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftCountResponse)) {
            return false;
        }
        GiftCountResponse giftCountResponse = (GiftCountResponse) other;
        return this.totalNum == giftCountResponse.totalNum && this.totalAmount == giftCountResponse.totalAmount;
    }

    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public int hashCode() {
        return Long.hashCode(this.totalAmount) + (Integer.hashCode(this.totalNum) * 31);
    }

    public String toString() {
        StringBuilder sbA = a0.a("GiftCountResponse(totalNum=", ", totalAmount=", this.totalNum, this.totalAmount);
        sbA.append(")");
        return sbA.toString();
    }
}
