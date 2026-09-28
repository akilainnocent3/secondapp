package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class jc80 extends b3 {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc80(String str) {
        super(11);
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc80) && Intrinsics.g(this.c, ((jc80) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.b3
    public final String toString() {
        return j26.a(new StringBuilder("SendMessageError(destinationPath="), this.c, ')');
    }
}
