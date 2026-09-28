package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wuh0 {
    public final String a;
    public final Object b;

    public wuh0(Object obj, String str) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wuh0)) {
            return false;
        }
        wuh0 wuh0Var = (wuh0) obj;
        return this.a.equals(wuh0Var.a) && Intrinsics.g(this.b, wuh0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.a);
        sb.append(", value=");
        return ekw.a(sb, this.b, ')');
    }
}
