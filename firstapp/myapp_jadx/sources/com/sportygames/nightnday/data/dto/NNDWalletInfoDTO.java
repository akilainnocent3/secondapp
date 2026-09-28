package com.sportygames.nightnday.data.dto;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sportygames/nightnday/data/dto/NNDWalletInfoDTO;", "", JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT, "", "currency", "", "<init>", "(DLjava/lang/String;)V", "getBalance", "()D", "getCurrency", "()Ljava/lang/String;", "game-nightnday_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NNDWalletInfoDTO {
    public static final int $stable = 0;
    private final double balance;
    private final String currency;

    public NNDWalletInfoDTO(double d, String str) {
        str.getClass();
        this.balance = d;
        this.currency = str;
    }

    public final double getBalance() {
        return this.balance;
    }

    public final String getCurrency() {
        return this.currency;
    }
}
