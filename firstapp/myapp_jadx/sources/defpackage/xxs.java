package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xxs<T> {
    public final int a;
    public final T b;

    public xxs(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxs)) {
            return false;
        }
        xxs xxsVar = (xxs) obj;
        return this.a == xxsVar.a && Intrinsics.g(this.b, xxsVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        T t = this.b;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingData(progress=");
        sb.append(this.a);
        sb.append(", data=");
        return ekw.a(sb, this.b, ')');
    }
}
