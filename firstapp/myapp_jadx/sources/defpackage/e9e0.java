package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e9e0 implements nk0.a {
    public final String a;

    public /* synthetic */ e9e0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e9e0) {
            return Intrinsics.g(this.a, ((e9e0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zdf0.a(')', "StringAnnotation(value=", this.a);
    }
}
