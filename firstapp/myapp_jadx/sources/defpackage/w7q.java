package defpackage;

import com.appsflyer.internal.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w7q<T> {
    public final long a;
    public final T b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public w7q(Object obj, long j, boolean z) {
        this.a = j;
        this.b = obj;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7q)) {
            return false;
        }
        w7q w7qVar = (w7q) obj;
        return this.a == w7qVar.a && Intrinsics.g(this.b, w7qVar.b) && this.c == w7qVar.c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        T t = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (t == null ? 0 : t.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNFeatureMatchCardInput(generation=");
        sb.append(this.a);
        sb.append(", card=");
        sb.append(this.b);
        return w.a(sb, ", isLoading=", this.c, ")");
    }
}
