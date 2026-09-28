package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fee0 extends bjb0 {
    public final String b;

    public fee0(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fee0) && Intrinsics.g(this.b, ((fee0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("SubscriptionError(path="), this.b, ')');
    }
}
