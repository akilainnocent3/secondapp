package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rbf0 implements pdd0 {
    public final String a = "otp__try_tg_popup_soft__view";

    public rbf0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbf0) && Intrinsics.g(this.a, ((rbf0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("OtpTryTgPopupSoftViewEvent(name=", this.a, ")");
    }
}
