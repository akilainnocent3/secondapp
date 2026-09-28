package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wak0 {
    public final String a;

    public /* synthetic */ wak0(int i) {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wak0) && Intrinsics.g(this.a, ((wak0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("ZASuccessfulRegistrationUiState(depositBannerRegisterDesc=", this.a, ")");
    }

    public wak0() {
        this(0);
    }

    public wak0(String str) {
        this.a = str;
    }
}
