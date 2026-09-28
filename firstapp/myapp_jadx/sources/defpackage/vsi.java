package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vsi {
    public final String a;

    public vsi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsi) && Intrinsics.g(this.a, ((vsi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("ForceResetPasswordState(phoneNumber=", this.a, ")");
    }

    public vsi() {
        this(0);
    }

    public /* synthetic */ vsi(int i) {
        this("");
    }
}
