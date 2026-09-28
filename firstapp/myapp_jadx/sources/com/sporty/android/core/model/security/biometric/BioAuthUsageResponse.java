package com.sporty.android.core.model.security.biometric;

import defpackage.cwz;
import defpackage.mq0;
import defpackage.mtg0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/BioAuthUsageResponse;", "", "useForLogin", "", "useForSportyPin", "useForOtp", "<init>", "(ZZZ)V", "getUseForLogin", "()Z", "getUseForSportyPin", "getUseForOtp", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BioAuthUsageResponse {
    private final boolean useForLogin;
    private final boolean useForOtp;
    private final boolean useForSportyPin;

    public BioAuthUsageResponse(boolean z, boolean z2, boolean z3) {
        this.useForLogin = z;
        this.useForSportyPin = z2;
        this.useForOtp = z3;
    }

    public static /* synthetic */ BioAuthUsageResponse copy$default(BioAuthUsageResponse bioAuthUsageResponse, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bioAuthUsageResponse.useForLogin;
        }
        if ((i & 2) != 0) {
            z2 = bioAuthUsageResponse.useForSportyPin;
        }
        if ((i & 4) != 0) {
            z3 = bioAuthUsageResponse.useForOtp;
        }
        return bioAuthUsageResponse.copy(z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUseForLogin() {
        return this.useForLogin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUseForSportyPin() {
        return this.useForSportyPin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getUseForOtp() {
        return this.useForOtp;
    }

    public final BioAuthUsageResponse copy(boolean useForLogin, boolean useForSportyPin, boolean useForOtp) {
        return new BioAuthUsageResponse(useForLogin, useForSportyPin, useForOtp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioAuthUsageResponse)) {
            return false;
        }
        BioAuthUsageResponse bioAuthUsageResponse = (BioAuthUsageResponse) other;
        return this.useForLogin == bioAuthUsageResponse.useForLogin && this.useForSportyPin == bioAuthUsageResponse.useForSportyPin && this.useForOtp == bioAuthUsageResponse.useForOtp;
    }

    public final boolean getUseForLogin() {
        return this.useForLogin;
    }

    public final boolean getUseForOtp() {
        return this.useForOtp;
    }

    public final boolean getUseForSportyPin() {
        return this.useForSportyPin;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useForOtp) + mtg0.a(Boolean.hashCode(this.useForLogin) * 31, 31, this.useForSportyPin);
    }

    public String toString() {
        boolean z = this.useForLogin;
        boolean z2 = this.useForSportyPin;
        return mq0.a(cwz.a("BioAuthUsageResponse(useForLogin=", ", useForSportyPin=", ", useForOtp=", z, z2), this.useForOtp, ")");
    }
}
