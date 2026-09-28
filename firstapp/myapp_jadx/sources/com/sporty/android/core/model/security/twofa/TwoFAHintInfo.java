package com.sporty.android.core.model.security.twofa;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/security/twofa/TwoFAHintInfo;", "", "shouldShowInMe", "", "shouldShowInSettings", "<init>", "(ZZ)V", "getShouldShowInMe", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "mePage", "getShouldShowInSettings", "settingPage", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TwoFAHintInfo {

    @SerializedName("mePage")
    private final boolean shouldShowInMe;

    @SerializedName("settingPage")
    private final boolean shouldShowInSettings;

    public TwoFAHintInfo(boolean z, boolean z2) {
        this.shouldShowInMe = z;
        this.shouldShowInSettings = z2;
    }

    public static /* synthetic */ TwoFAHintInfo copy$default(TwoFAHintInfo twoFAHintInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = twoFAHintInfo.shouldShowInMe;
        }
        if ((i & 2) != 0) {
            z2 = twoFAHintInfo.shouldShowInSettings;
        }
        return twoFAHintInfo.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShouldShowInMe() {
        return this.shouldShowInMe;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldShowInSettings() {
        return this.shouldShowInSettings;
    }

    public final TwoFAHintInfo copy(boolean shouldShowInMe, boolean shouldShowInSettings) {
        return new TwoFAHintInfo(shouldShowInMe, shouldShowInSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwoFAHintInfo)) {
            return false;
        }
        TwoFAHintInfo twoFAHintInfo = (TwoFAHintInfo) other;
        return this.shouldShowInMe == twoFAHintInfo.shouldShowInMe && this.shouldShowInSettings == twoFAHintInfo.shouldShowInSettings;
    }

    public final boolean getShouldShowInMe() {
        return this.shouldShowInMe;
    }

    public final boolean getShouldShowInSettings() {
        return this.shouldShowInSettings;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowInSettings) + (Boolean.hashCode(this.shouldShowInMe) * 31);
    }

    public String toString() {
        return "TwoFAHintInfo(shouldShowInMe=" + this.shouldShowInMe + ", shouldShowInSettings=" + this.shouldShowInSettings + ")";
    }
}
