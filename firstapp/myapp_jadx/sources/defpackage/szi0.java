package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class szi0 {
    public final String a;
    public final String b;

    public szi0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szi0)) {
            return false;
        }
        szi0 szi0Var = (szi0) obj;
        return Intrinsics.g(this.a, szi0Var.a) && Intrinsics.g(this.b, szi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("WebViewJsBottomSheetUiState(title=", this.a, ", content=", this.b, ")");
    }

    public /* synthetic */ szi0(int i) {
        this("", "");
    }

    public szi0() {
        this(0);
    }
}
