package com.sportygames.spindabottle.remote.models;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.xbp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/sportygames/spindabottle/remote/models/WalletInfo;", "", JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT, "", "currency", "", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/String;)Lcom/sportygames/spindabottle/remote/models/WalletInfo;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WalletInfo {
    public static final int $stable = 8;
    private final Double balance;
    private String currency;

    public /* synthetic */ WalletInfo(Double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Double.valueOf(0.0d) : d, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ WalletInfo copy$default(WalletInfo walletInfo, Double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = walletInfo.balance;
        }
        if ((i & 2) != 0) {
            str = walletInfo.currency;
        }
        return walletInfo.copy(d, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final WalletInfo copy(@xbp(name = JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT) Double balance, @xbp(name = "currency") String currency) {
        return new WalletInfo(balance, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletInfo)) {
            return false;
        }
        WalletInfo walletInfo = (WalletInfo) other;
        return Intrinsics.g(this.balance, walletInfo.balance) && Intrinsics.g(this.currency, walletInfo.currency);
    }

    public final Double getBalance() {
        return this.balance;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        Double d = this.balance;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.currency;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public String toString() {
        return "WalletInfo(balance=" + this.balance + ", currency=" + this.currency + ")";
    }

    public WalletInfo(@xbp(name = JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT) Double d, @xbp(name = "currency") String str) {
        this.balance = d;
        this.currency = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WalletInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
