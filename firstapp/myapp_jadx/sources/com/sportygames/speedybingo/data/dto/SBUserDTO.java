package com.sportygames.speedybingo.data.dto;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.gmf0;
import defpackage.ruw;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/sportygames/speedybingo/data/dto/SBUserDTO;", "", JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT, "", "currency", "", "available", "", "<init>", "(DLjava/lang/String;Z)V", "getBalance", "()D", "getCurrency", "()Ljava/lang/String;", "getAvailable", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "game-speedybingo_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SBUserDTO {
    public static final int $stable = 0;
    private final boolean available;
    private final double balance;
    private final String currency;

    public SBUserDTO(double d, String str, boolean z) {
        str.getClass();
        this.balance = d;
        this.currency = str;
        this.available = z;
    }

    public static /* synthetic */ SBUserDTO copy$default(SBUserDTO sBUserDTO, double d, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = sBUserDTO.balance;
        }
        if ((i & 2) != 0) {
            str = sBUserDTO.currency;
        }
        if ((i & 4) != 0) {
            z = sBUserDTO.available;
        }
        return sBUserDTO.copy(d, str, z);
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

    public final SBUserDTO copy(double balance, String currency, boolean available) {
        currency.getClass();
        return new SBUserDTO(balance, currency, available);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SBUserDTO)) {
            return false;
        }
        SBUserDTO sBUserDTO = (SBUserDTO) other;
        return Double.compare(this.balance, sBUserDTO.balance) == 0 && Intrinsics.g(this.currency, sBUserDTO.currency) && this.available == sBUserDTO.available;
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

    public int hashCode() {
        return Boolean.hashCode(this.available) + gmf0.a(Double.hashCode(this.balance) * 31, 31, this.currency);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SBUserDTO(balance=");
        sb.append(this.balance);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", available=");
        return ruw.a(sb, this.available, ')');
    }
}
