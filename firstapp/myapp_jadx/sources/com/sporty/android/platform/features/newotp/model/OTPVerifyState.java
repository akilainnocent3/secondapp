package com.sporty.android.platform.features.newotp.model;

import com.sporty.android.common_ui.uitext.UiText;
import defpackage.vch0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/platform/features/newotp/model/OTPVerifyState;", "", "errorCode", "", "errorText", "Lcom/sporty/android/common_ui/uitext/UiText;", "<init>", "(ILcom/sporty/android/common_ui/uitext/UiText;)V", "getErrorCode", "()I", "getErrorText", "()Lcom/sporty/android/common_ui/uitext/UiText;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OTPVerifyState {
    public static final int $stable = 0;
    private final int errorCode;
    private final UiText errorText;

    public OTPVerifyState(int i, UiText uiText, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? vch0.a : uiText);
    }

    public static /* synthetic */ OTPVerifyState copy$default(OTPVerifyState oTPVerifyState, int i, UiText uiText, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oTPVerifyState.errorCode;
        }
        if ((i2 & 2) != 0) {
            uiText = oTPVerifyState.errorText;
        }
        return oTPVerifyState.copy(i, uiText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UiText getErrorText() {
        return this.errorText;
    }

    public final OTPVerifyState copy(int errorCode, UiText errorText) {
        errorText.getClass();
        return new OTPVerifyState(errorCode, errorText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTPVerifyState)) {
            return false;
        }
        OTPVerifyState oTPVerifyState = (OTPVerifyState) other;
        return this.errorCode == oTPVerifyState.errorCode && Intrinsics.g(this.errorText, oTPVerifyState.errorText);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final UiText getErrorText() {
        return this.errorText;
    }

    public int hashCode() {
        return this.errorText.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    public String toString() {
        return "OTPVerifyState(errorCode=" + this.errorCode + ", errorText=" + this.errorText + ")";
    }

    public OTPVerifyState(int i, UiText uiText) {
        uiText.getClass();
        this.errorCode = i;
        this.errorText = uiText;
    }

    public OTPVerifyState() {
        this(0, null, 3, null);
    }
}
