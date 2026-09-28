package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u8j {
    public final String a;
    public final String b;

    public u8j(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8j)) {
            return false;
        }
        u8j u8jVar = (u8j) obj;
        return this.a.equals(u8jVar.a) && Intrinsics.g(this.b, u8jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("FsAttribute(name=", this.a, ", value=", this.b, ")");
    }
}
