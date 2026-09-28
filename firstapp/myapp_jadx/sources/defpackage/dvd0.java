package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dvd0 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public dvd0(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvd0)) {
            return false;
        }
        dvd0 dvd0Var = (dvd0) obj;
        return this.a == dvd0Var.a && Intrinsics.g(this.b, dvd0Var.b) && this.c == dvd0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(t160.a("StakeValidation(isValid=", ", errorMessage=", this.b, ", isErrorBlockingInput=", this.a), this.c, ")");
    }

    public dvd0() {
        this("", false, false);
    }
}
