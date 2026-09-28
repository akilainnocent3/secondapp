package com.sporty.android.core.model.pocket.globalpay;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/pocket/globalpay/WalletAddressListData;", "", "currency", "", "wallets", "", "Lcom/sporty/android/core/model/pocket/globalpay/WalletAddressData;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "getWallets", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WalletAddressListData {
    private final String currency;
    private final List<WalletAddressData> wallets;

    public WalletAddressListData(String str, List<WalletAddressData> list) {
        list.getClass();
        this.currency = str;
        this.wallets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletAddressListData copy$default(WalletAddressListData walletAddressListData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletAddressListData.currency;
        }
        if ((i & 2) != 0) {
            list = walletAddressListData.wallets;
        }
        return walletAddressListData.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final List<WalletAddressData> component2() {
        return this.wallets;
    }

    public final WalletAddressListData copy(String currency, List<WalletAddressData> wallets) {
        wallets.getClass();
        return new WalletAddressListData(currency, wallets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletAddressListData)) {
            return false;
        }
        WalletAddressListData walletAddressListData = (WalletAddressListData) other;
        return Intrinsics.g(this.currency, walletAddressListData.currency) && Intrinsics.g(this.wallets, walletAddressListData.wallets);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<WalletAddressData> getWallets() {
        return this.wallets;
    }

    public int hashCode() {
        String str = this.currency;
        return this.wallets.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return nf.b("WalletAddressListData(currency=", this.currency, ", wallets=", ")", this.wallets);
    }
}
