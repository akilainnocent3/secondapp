package com.sportygames.crash.models.header;

import com.appsflyer.AppsFlyerProperties;
import defpackage.gmf0;
import defpackage.lng;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/sportygames/crash/models/header/CrashHeaderState;", "", "currencyValue", "", AppsFlyerProperties.CURRENCY_CODE, "isChatEnable", "", "toShowRedDot", "headerVisibility", "rainVisibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getCurrencyValue", "()Ljava/lang/String;", "getCurrencyCode", "()Z", "getToShowRedDot", "getHeaderVisibility", "getRainVisibility", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CrashHeaderState {
    public static final int $stable = 0;
    private final String currencyCode;
    private final String currencyValue;
    private final boolean headerVisibility;
    private final boolean isChatEnable;
    private final boolean rainVisibility;
    private final boolean toShowRedDot;

    public /* synthetic */ CrashHeaderState(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public static /* synthetic */ CrashHeaderState copy$default(CrashHeaderState crashHeaderState, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crashHeaderState.currencyValue;
        }
        if ((i & 2) != 0) {
            str2 = crashHeaderState.currencyCode;
        }
        if ((i & 4) != 0) {
            z = crashHeaderState.isChatEnable;
        }
        if ((i & 8) != 0) {
            z2 = crashHeaderState.toShowRedDot;
        }
        if ((i & 16) != 0) {
            z3 = crashHeaderState.headerVisibility;
        }
        if ((i & 32) != 0) {
            z4 = crashHeaderState.rainVisibility;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return crashHeaderState.copy(str, str2, z, z2, z5, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyValue() {
        return this.currencyValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsChatEnable() {
        return this.isChatEnable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getToShowRedDot() {
        return this.toShowRedDot;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHeaderVisibility() {
        return this.headerVisibility;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRainVisibility() {
        return this.rainVisibility;
    }

    public final CrashHeaderState copy(String currencyValue, String currencyCode, boolean isChatEnable, boolean toShowRedDot, boolean headerVisibility, boolean rainVisibility) {
        currencyValue.getClass();
        currencyCode.getClass();
        return new CrashHeaderState(currencyValue, currencyCode, isChatEnable, toShowRedDot, headerVisibility, rainVisibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashHeaderState)) {
            return false;
        }
        CrashHeaderState crashHeaderState = (CrashHeaderState) other;
        return Intrinsics.g(this.currencyValue, crashHeaderState.currencyValue) && Intrinsics.g(this.currencyCode, crashHeaderState.currencyCode) && this.isChatEnable == crashHeaderState.isChatEnable && this.toShowRedDot == crashHeaderState.toShowRedDot && this.headerVisibility == crashHeaderState.headerVisibility && this.rainVisibility == crashHeaderState.rainVisibility;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getCurrencyValue() {
        return this.currencyValue;
    }

    public final boolean getHeaderVisibility() {
        return this.headerVisibility;
    }

    public final boolean getRainVisibility() {
        return this.rainVisibility;
    }

    public final boolean getToShowRedDot() {
        return this.toShowRedDot;
    }

    public int hashCode() {
        return Boolean.hashCode(this.rainVisibility) + mtg0.a(mtg0.a(mtg0.a(gmf0.a(this.currencyValue.hashCode() * 31, 31, this.currencyCode), 31, this.isChatEnable), 31, this.toShowRedDot), 31, this.headerVisibility);
    }

    public final boolean isChatEnable() {
        return this.isChatEnable;
    }

    public String toString() {
        String str = this.currencyValue;
        String str2 = this.currencyCode;
        boolean z = this.isChatEnable;
        boolean z2 = this.toShowRedDot;
        boolean z3 = this.headerVisibility;
        boolean z4 = this.rainVisibility;
        StringBuilder sbA = ux5.a("CrashHeaderState(currencyValue=", str, ", currencyCode=", str2, ", isChatEnable=");
        nng.a(", toShowRedDot=", ", headerVisibility=", sbA, z, z2);
        return lng.a(", rainVisibility=", ")", sbA, z3, z4);
    }

    public CrashHeaderState(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        this.currencyValue = str;
        this.currencyCode = str2;
        this.isChatEnable = z;
        this.toShowRedDot = z2;
        this.headerVisibility = z3;
        this.rainVisibility = z4;
    }

    public CrashHeaderState() {
        this(null, null, false, false, false, false, 63, null);
    }
}
