package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ezg0 {
    public final String a;
    public final String b;

    public ezg0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezg0)) {
            return false;
        }
        ezg0 ezg0Var = (ezg0) obj;
        return Intrinsics.g(this.a, ezg0Var.a) && Intrinsics.g(this.b, ezg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("TutorialPage(image=", this.a, ", text=", this.b, ")");
    }
}
