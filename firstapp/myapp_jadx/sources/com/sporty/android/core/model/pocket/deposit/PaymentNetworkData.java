package com.sporty.android.core.model.pocket.deposit;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/PaymentNetworkData;", "", "payChannelId", "", "networks", "", "Lcom/sporty/android/core/model/pocket/deposit/PaymentNetworkItem;", "<init>", "(ILjava/util/List;)V", "getPayChannelId", "()I", "getNetworks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PaymentNetworkData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<PaymentNetworkItem> networks;
    private final int payChannelId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/PaymentNetworkData$Companion;", "", "<init>", "()V", "getNetworkNameByChannelShowName", "", "channelShowName", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getNetworkNameByChannelShowName(String channelShowName) {
            if (channelShowName == null) {
                return null;
            }
            switch (channelShowName) {
                case "Halotel":
                    return "Halotel";
                case "Vodafone Cash":
                    return "VODAFONE";
                case "AirtelTigo":
                    return "TIGO_AIRTEL";
                case "Zamtel Mobile Money":
                    return "ZAMTEL";
                case "Telecel":
                    return "TELECEL";
                case "MTN Mobile Money":
                    return "MTN";
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }

    public PaymentNetworkData(int i, List<PaymentNetworkItem> list) {
        list.getClass();
        this.payChannelId = i;
        this.networks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentNetworkData copy$default(PaymentNetworkData paymentNetworkData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paymentNetworkData.payChannelId;
        }
        if ((i2 & 2) != 0) {
            list = paymentNetworkData.networks;
        }
        return paymentNetworkData.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPayChannelId() {
        return this.payChannelId;
    }

    public final List<PaymentNetworkItem> component2() {
        return this.networks;
    }

    public final PaymentNetworkData copy(int payChannelId, List<PaymentNetworkItem> networks) {
        networks.getClass();
        return new PaymentNetworkData(payChannelId, networks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentNetworkData)) {
            return false;
        }
        PaymentNetworkData paymentNetworkData = (PaymentNetworkData) other;
        return this.payChannelId == paymentNetworkData.payChannelId && Intrinsics.g(this.networks, paymentNetworkData.networks);
    }

    public final List<PaymentNetworkItem> getNetworks() {
        return this.networks;
    }

    public final int getPayChannelId() {
        return this.payChannelId;
    }

    public int hashCode() {
        return this.networks.hashCode() + (Integer.hashCode(this.payChannelId) * 31);
    }

    public String toString() {
        return "PaymentNetworkData(payChannelId=" + this.payChannelId + ", networks=" + this.networks + ")";
    }
}
