package com.sporty.android.core.model.config.firebase;

import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/config/firebase/RemoteEnabledConfig;", "", "version", "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getVersion", "()Ljava/lang/String;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemoteEnabledConfig {
    private final boolean enabled;
    private final String version;

    public RemoteEnabledConfig(String str, boolean z) {
        str.getClass();
        this.version = str;
        this.enabled = z;
    }

    public static /* synthetic */ RemoteEnabledConfig copy$default(RemoteEnabledConfig remoteEnabledConfig, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteEnabledConfig.version;
        }
        if ((i & 2) != 0) {
            z = remoteEnabledConfig.enabled;
        }
        return remoteEnabledConfig.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final RemoteEnabledConfig copy(String version, boolean enabled) {
        version.getClass();
        return new RemoteEnabledConfig(version, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteEnabledConfig)) {
            return false;
        }
        RemoteEnabledConfig remoteEnabledConfig = (RemoteEnabledConfig) other;
        return Intrinsics.g(this.version, remoteEnabledConfig.version) && this.enabled == remoteEnabledConfig.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.version.hashCode() * 31);
    }

    public String toString() {
        return tzx.a("RemoteEnabledConfig(version=", this.version, ", enabled=", ")", this.enabled);
    }
}
