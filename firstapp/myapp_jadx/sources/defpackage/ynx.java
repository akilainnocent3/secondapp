package defpackage;

import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ynx {
    public static final String b = jgt.g("NetworkRequestCompat");
    public final Object a;

    public ynx(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynx) && Intrinsics.g(this.a, ((ynx) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return ekw.a(new StringBuilder("NetworkRequestCompat(wrapped="), this.a, ')');
    }
}
