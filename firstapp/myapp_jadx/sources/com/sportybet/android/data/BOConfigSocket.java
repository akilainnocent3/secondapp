package com.sportybet.android.data;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/android/data/BOConfigSocket;", "", "configKey", "", "configValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getConfigKey", "()Ljava/lang/String;", "getConfigValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BOConfigSocket {
    public static final int $stable = 0;
    private final String configKey;
    private final String configValue;

    public BOConfigSocket(String str, String str2) {
        this.configKey = str;
        this.configValue = str2;
    }

    public static /* synthetic */ BOConfigSocket copy$default(BOConfigSocket bOConfigSocket, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bOConfigSocket.configKey;
        }
        if ((i & 2) != 0) {
            str2 = bOConfigSocket.configValue;
        }
        return bOConfigSocket.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConfigKey() {
        return this.configKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfigValue() {
        return this.configValue;
    }

    public final BOConfigSocket copy(String configKey, String configValue) {
        return new BOConfigSocket(configKey, configValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BOConfigSocket)) {
            return false;
        }
        BOConfigSocket bOConfigSocket = (BOConfigSocket) other;
        return Intrinsics.g(this.configKey, bOConfigSocket.configKey) && Intrinsics.g(this.configValue, bOConfigSocket.configValue);
    }

    public final String getConfigKey() {
        return this.configKey;
    }

    public final String getConfigValue() {
        return this.configValue;
    }

    public int hashCode() {
        String str = this.configKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.configValue;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("BOConfigSocket(configKey=", this.configKey, ", configValue=", this.configValue, ")");
    }
}
