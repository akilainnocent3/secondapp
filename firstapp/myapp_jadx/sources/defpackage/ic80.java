package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ic80 extends bjb0 {
    public final String b;

    public ic80(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic80) && Intrinsics.g(this.b, ((ic80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("SendMessageError(destinationPath="), this.b, ')');
    }
}
