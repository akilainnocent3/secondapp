package com.sporty.android.core.model.gift;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/gift/GiftGroup;", "", "gifts", "", "Lcom/sporty/android/core/model/gift/GiftDetails;", "type", "", "<init>", "(Ljava/util/List;I)V", "getGifts", "()Ljava/util/List;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGroup {
    private final List<GiftDetails> gifts;
    private final int type;

    public GiftGroup(List<GiftDetails> list, int i) {
        list.getClass();
        this.gifts = list;
        this.type = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftGroup copy$default(GiftGroup giftGroup, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = giftGroup.gifts;
        }
        if ((i2 & 2) != 0) {
            i = giftGroup.type;
        }
        return giftGroup.copy(list, i);
    }

    public final List<GiftDetails> component1() {
        return this.gifts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final GiftGroup copy(List<GiftDetails> gifts, int type) {
        gifts.getClass();
        return new GiftGroup(gifts, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftGroup)) {
            return false;
        }
        GiftGroup giftGroup = (GiftGroup) other;
        return Intrinsics.g(this.gifts, giftGroup.gifts) && this.type == giftGroup.type;
    }

    public final List<GiftDetails> getGifts() {
        return this.gifts;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.type) + (this.gifts.hashCode() * 31);
    }

    public String toString() {
        return "GiftGroup(gifts=" + this.gifts + ", type=" + this.type + ")";
    }
}
