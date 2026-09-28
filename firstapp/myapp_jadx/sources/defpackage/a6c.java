package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a6c {
    public final String a;
    public final Function0<Boolean> b;

    public a6c(String str, Function0<Boolean> function0) {
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6c)) {
            return false;
        }
        a6c a6cVar = (a6c) obj;
        return Intrinsics.g(this.a, a6cVar.a) && this.b == a6cVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
