package com.sporty.android.core.model.security.biometric;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/BiometricInfo;", "", "isBiometricTokenPresent", "", "biometricAuthStatus", "Lcom/sporty/android/core/model/security/biometric/BiometricAuthStatus;", "keyStatus", "Lcom/sporty/android/core/model/security/biometric/KeyStatus;", "<init>", "(ZLcom/sporty/android/core/model/security/biometric/BiometricAuthStatus;Lcom/sporty/android/core/model/security/biometric/KeyStatus;)V", "()Z", "getBiometricAuthStatus", "()Lcom/sporty/android/core/model/security/biometric/BiometricAuthStatus;", "getKeyStatus", "()Lcom/sporty/android/core/model/security/biometric/KeyStatus;", "canAskAuthentication", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BiometricInfo {
    private final BiometricAuthStatus biometricAuthStatus;
    private final boolean isBiometricTokenPresent;
    private final KeyStatus keyStatus;

    public BiometricInfo(boolean z, BiometricAuthStatus biometricAuthStatus, KeyStatus keyStatus) {
        biometricAuthStatus.getClass();
        keyStatus.getClass();
        this.isBiometricTokenPresent = z;
        this.biometricAuthStatus = biometricAuthStatus;
        this.keyStatus = keyStatus;
    }

    public static /* synthetic */ BiometricInfo copy$default(BiometricInfo biometricInfo, boolean z, BiometricAuthStatus biometricAuthStatus, KeyStatus keyStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            z = biometricInfo.isBiometricTokenPresent;
        }
        if ((i & 2) != 0) {
            biometricAuthStatus = biometricInfo.biometricAuthStatus;
        }
        if ((i & 4) != 0) {
            keyStatus = biometricInfo.keyStatus;
        }
        return biometricInfo.copy(z, biometricAuthStatus, keyStatus);
    }

    public final boolean canAskAuthentication() {
        return this.biometricAuthStatus == BiometricAuthStatus.Ready && this.keyStatus == KeyStatus.Ready;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsBiometricTokenPresent() {
        return this.isBiometricTokenPresent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BiometricAuthStatus getBiometricAuthStatus() {
        return this.biometricAuthStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final KeyStatus getKeyStatus() {
        return this.keyStatus;
    }

    public final BiometricInfo copy(boolean isBiometricTokenPresent, BiometricAuthStatus biometricAuthStatus, KeyStatus keyStatus) {
        biometricAuthStatus.getClass();
        keyStatus.getClass();
        return new BiometricInfo(isBiometricTokenPresent, biometricAuthStatus, keyStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiometricInfo)) {
            return false;
        }
        BiometricInfo biometricInfo = (BiometricInfo) other;
        return this.isBiometricTokenPresent == biometricInfo.isBiometricTokenPresent && this.biometricAuthStatus == biometricInfo.biometricAuthStatus && this.keyStatus == biometricInfo.keyStatus;
    }

    public final BiometricAuthStatus getBiometricAuthStatus() {
        return this.biometricAuthStatus;
    }

    public final KeyStatus getKeyStatus() {
        return this.keyStatus;
    }

    public int hashCode() {
        return this.keyStatus.hashCode() + ((this.biometricAuthStatus.hashCode() + (Boolean.hashCode(this.isBiometricTokenPresent) * 31)) * 31);
    }

    public final boolean isBiometricTokenPresent() {
        return this.isBiometricTokenPresent;
    }

    public String toString() {
        return "BiometricInfo(isBiometricTokenPresent=" + this.isBiometricTokenPresent + ", biometricAuthStatus=" + this.biometricAuthStatus + ", keyStatus=" + this.keyStatus + ")";
    }

    public /* synthetic */ BiometricInfo(boolean z, BiometricAuthStatus biometricAuthStatus, KeyStatus keyStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, biometricAuthStatus, keyStatus);
    }
}
