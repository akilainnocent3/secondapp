package com.sportybet.plugin.realsports.onetwoup.domain.model;

import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/plugin/realsports/onetwoup/domain/model/OneTwoUpDisplayConfig;", "", "country", "", "value", "", "<init>", "(Ljava/lang/String;Z)V", "getCountry", "()Ljava/lang/String;", "getValue", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneTwoUpDisplayConfig {
    public static final int $stable = 0;
    private final String country;
    private final boolean value;

    public OneTwoUpDisplayConfig(String str, boolean z) {
        str.getClass();
        this.country = str;
        this.value = z;
    }

    public static /* synthetic */ OneTwoUpDisplayConfig copy$default(OneTwoUpDisplayConfig oneTwoUpDisplayConfig, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTwoUpDisplayConfig.country;
        }
        if ((i & 2) != 0) {
            z = oneTwoUpDisplayConfig.value;
        }
        return oneTwoUpDisplayConfig.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final OneTwoUpDisplayConfig copy(String country, boolean value) {
        country.getClass();
        return new OneTwoUpDisplayConfig(country, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTwoUpDisplayConfig)) {
            return false;
        }
        OneTwoUpDisplayConfig oneTwoUpDisplayConfig = (OneTwoUpDisplayConfig) other;
        return Intrinsics.g(this.country, oneTwoUpDisplayConfig.country) && this.value == oneTwoUpDisplayConfig.value;
    }

    public final String getCountry() {
        return this.country;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.value) + (this.country.hashCode() * 31);
    }

    public String toString() {
        return tzx.a("OneTwoUpDisplayConfig(country=", this.country, ", value=", tYcQsJyaojE.UdFZVn, this.value);
    }
}
