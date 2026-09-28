package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w4d {
    public final u7n a;
    public final boolean b;

    public w4d(u7n u7nVar, boolean z) {
        this.a = u7nVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4d)) {
            return false;
        }
        w4d w4dVar = (w4d) obj;
        return Intrinsics.g(this.a, w4dVar.a) && this.b == w4dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(image=");
        sb.append(this.a);
        sb.append(", isSampled=");
        return ruw.a(sb, this.b, ')');
    }
}
