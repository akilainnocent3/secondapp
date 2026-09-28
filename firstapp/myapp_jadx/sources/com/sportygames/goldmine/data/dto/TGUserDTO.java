package com.sportygames.goldmine.data.dto;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.gmf0;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGUserDTO;", "", JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT, "", "currency", "", "available", "", "gameData", "Lcom/sportygames/goldmine/data/dto/TGGameDataDTO;", "<init>", "(DLjava/lang/String;ZLcom/sportygames/goldmine/data/dto/TGGameDataDTO;)V", "getBalance", "()D", "getCurrency", "()Ljava/lang/String;", "getAvailable", "()Z", "getGameData", "()Lcom/sportygames/goldmine/data/dto/TGGameDataDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TGUserDTO {
    public static final int $stable = 8;
    private final boolean available;
    private final double balance;
    private final String currency;
    private final TGGameDataDTO gameData;

    public TGUserDTO(double d, String str, boolean z, TGGameDataDTO tGGameDataDTO) {
        str.getClass();
        tGGameDataDTO.getClass();
        this.balance = d;
        this.currency = str;
        this.available = z;
        this.gameData = tGGameDataDTO;
    }

    public static /* synthetic */ TGUserDTO copy$default(TGUserDTO tGUserDTO, double d, String str, boolean z, TGGameDataDTO tGGameDataDTO, int i, Object obj) {
        if ((i & 1) != 0) {
            d = tGUserDTO.balance;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = tGUserDTO.currency;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = tGUserDTO.available;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            tGGameDataDTO = tGUserDTO.gameData;
        }
        return tGUserDTO.copy(d2, str2, z2, tGGameDataDTO);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TGGameDataDTO getGameData() {
        return this.gameData;
    }

    public final TGUserDTO copy(double balance, String currency, boolean available, TGGameDataDTO gameData) {
        currency.getClass();
        gameData.getClass();
        return new TGUserDTO(balance, currency, available, gameData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TGUserDTO)) {
            return false;
        }
        TGUserDTO tGUserDTO = (TGUserDTO) other;
        return Double.compare(this.balance, tGUserDTO.balance) == 0 && Intrinsics.g(this.currency, tGUserDTO.currency) && this.available == tGUserDTO.available && Intrinsics.g(this.gameData, tGUserDTO.gameData);
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final double getBalance() {
        return this.balance;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final TGGameDataDTO getGameData() {
        return this.gameData;
    }

    public int hashCode() {
        return this.gameData.hashCode() + mtg0.a(gmf0.a(Double.hashCode(this.balance) * 31, 31, this.currency), 31, this.available);
    }

    public String toString() {
        return "TGUserDTO(balance=" + this.balance + ", currency=" + this.currency + ", available=" + this.available + ", gameData=" + this.gameData + ')';
    }
}
