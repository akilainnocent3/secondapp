package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class kc80 extends bjb0 {
    public final String b;

    public kc80(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kc80) && Intrinsics.g(this.b, ((kc80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("SendMessageError(destinationPath="), this.b, ')');
    }
}
