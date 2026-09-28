package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gr10 {
    public final String a;
    public final boolean b;
    public final uxs c;

    public gr10(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = z ? uxs.LOADING : uxs.ENABLE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr10)) {
            return false;
        }
        gr10 gr10Var = (gr10) obj;
        return Intrinsics.g(this.a, gr10Var.a) && this.b == gr10Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return tzx.a("PlaytimeControlRemoveUiState(cooldownTime=", this.a, ", isLoading=", ")", this.b);
    }

    public /* synthetic */ gr10(int i) {
        this(null, false);
    }

    public gr10() {
        this(0);
    }
}
