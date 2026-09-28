package com.sporty.android.core.model.pay.bo;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR/\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/pay/bo/PhonePrefixData;", "", "payChannel", "", "prefix", "", "", "<init>", "(ILjava/util/List;)V", "getPayChannel", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "payChId", "getPrefix", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PhonePrefixData {

    @SerializedName("payChId")
    private final int payChannel;

    @SerializedName("prefix")
    private final List<String> prefix;

    public PhonePrefixData(int i, List<String> list) {
        this.payChannel = i;
        this.prefix = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhonePrefixData copy$default(PhonePrefixData phonePrefixData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = phonePrefixData.payChannel;
        }
        if ((i2 & 2) != 0) {
            list = phonePrefixData.prefix;
        }
        return phonePrefixData.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPayChannel() {
        return this.payChannel;
    }

    public final List<String> component2() {
        return this.prefix;
    }

    public final PhonePrefixData copy(int payChannel, List<String> prefix) {
        return new PhonePrefixData(payChannel, prefix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhonePrefixData)) {
            return false;
        }
        PhonePrefixData phonePrefixData = (PhonePrefixData) other;
        return this.payChannel == phonePrefixData.payChannel && Intrinsics.g(this.prefix, phonePrefixData.prefix);
    }

    public final int getPayChannel() {
        return this.payChannel;
    }

    public final List<String> getPrefix() {
        return this.prefix;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.payChannel) * 31;
        List<String> list = this.prefix;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "PhonePrefixData(payChannel=" + this.payChannel + ", prefix=" + this.prefix + ")";
    }
}
