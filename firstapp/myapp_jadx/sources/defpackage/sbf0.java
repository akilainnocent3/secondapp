package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sbf0 implements pdd0 {
    public final String a = "otp__try_tg_popup_strong__view";

    public sbf0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbf0) && Intrinsics.g(this.a, ((sbf0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("OtpTryTgPopupStrongViewEvent(name=", this.a, ")");
    }
}
