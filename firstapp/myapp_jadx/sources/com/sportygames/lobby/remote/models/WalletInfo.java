package com.sportygames.lobby.remote.models;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import defpackage.op5;
import defpackage.oxc;
import defpackage.qw;
import defpackage.uf80;
import defpackage.xbp;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/sportygames/lobby/remote/models/WalletInfo;", "", JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT, "", "currency", "", "avatarUrl", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "()Ljava/lang/String;", "getAvatarUrl", "walletString", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/lobby/remote/models/WalletInfo;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WalletInfo {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final Double balance;
    private final String currency;

    public /* synthetic */ WalletInfo(Double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Double.valueOf(0.0d) : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ WalletInfo copy$default(WalletInfo walletInfo, Double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = walletInfo.balance;
        }
        if ((i & 2) != 0) {
            str = walletInfo.currency;
        }
        if ((i & 4) != 0) {
            str2 = walletInfo.avatarUrl;
        }
        return walletInfo.copy(d, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final WalletInfo copy(@xbp(name = JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT) Double balance, @xbp(name = "currency") String currency, @xbp(name = "avatarUrl") String avatarUrl) {
        return new WalletInfo(balance, currency, avatarUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletInfo)) {
            return false;
        }
        WalletInfo walletInfo = (WalletInfo) other;
        return Intrinsics.g(this.balance, walletInfo.balance) && Intrinsics.g(this.currency, walletInfo.currency) && Intrinsics.g(this.avatarUrl, walletInfo.avatarUrl);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
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
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Double d = this.balance;
        String str = this.currency;
        String str2 = this.avatarUrl;
        StringBuilder sb = new StringBuilder("WalletInfo(balance=");
        sb.append(d);
        sb.append(", currency=");
        sb.append(str);
        sb.append(", avatarUrl=");
        return uf80.a(sb, str2, ")");
    }

    public final String walletString() {
        String strI;
        Double d = this.balance;
        d.getClass();
        String strI2 = null;
        if (d.doubleValue() >= 1.0d) {
            String str = this.currency;
            if (str != null) {
                op5.a.getClass();
                strI = op5.i(str);
            } else {
                strI = null;
            }
            return oxc.a(strI, " ", qw.c(this.balance, 12, false, null));
        }
        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(this.balance.doubleValue());
        str2.getClass();
        String str3 = this.currency;
        if (str3 != null) {
            op5.a.getClass();
            strI2 = op5.i(str3);
        }
        return oxc.a(strI2, " ", str2);
    }

    public WalletInfo(@xbp(name = JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT) Double d, @xbp(name = "currency") String str, @xbp(name = "avatarUrl") String str2) {
        this.balance = d;
        this.currency = str;
        this.avatarUrl = str2;
    }

    public WalletInfo() {
        this(null, null, null, 7, null);
    }
}
