package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c190 {
    public final String a;
    public final String b;

    public /* synthetic */ c190(String str, int i) {
        this((i & 1) != 0 ? "" : str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c190)) {
            return false;
        }
        c190 c190Var = (c190) obj;
        return Intrinsics.g(this.a, c190Var.a) && Intrinsics.g(this.b, c190Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("ShareImages(imageUri=", this.a, ", imageWithUserUri=", this.b, ")");
    }

    public c190() {
        this((String) null, 3);
    }

    public c190(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }
}
