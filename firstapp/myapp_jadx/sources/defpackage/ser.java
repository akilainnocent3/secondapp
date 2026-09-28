package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ser {
    public final String a;
    public final b5q b;

    public ser(String str, b5q b5qVar) {
        str.getClass();
        this.a = str;
        this.b = b5qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ser)) {
            return false;
        }
        ser serVar = (ser) obj;
        return Intrinsics.g(this.a, serVar.a) && Intrinsics.g(this.b, serVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b5q b5qVar = this.b;
        return iHashCode + (b5qVar == null ? 0 : b5qVar.hashCode());
    }

    public final String toString() {
        return "LNStreamInfo(url=" + this.a + ", detail=" + this.b + ")";
    }
}
