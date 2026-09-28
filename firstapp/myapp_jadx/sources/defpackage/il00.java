package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class il00 {
    public final String a;
    public final bv7 b;
    public final bv7 c;
    public final bv7 d;

    public il00(String str, bv7 bv7Var, bv7 bv7Var2, bv7 bv7Var3) {
        str.getClass();
        bv7Var.getClass();
        bv7Var2.getClass();
        bv7Var3.getClass();
        this.a = str;
        this.b = bv7Var;
        this.c = bv7Var2;
        this.d = bv7Var3;
    }

    public static il00 a(il00 il00Var, bv7 bv7Var, bv7 bv7Var2, bv7 bv7Var3, int i) {
        String str = il00Var.a;
        if ((i & 2) != 0) {
            bv7Var = il00Var.b;
        }
        if ((i & 4) != 0) {
            bv7Var2 = il00Var.c;
        }
        if ((i & 8) != 0) {
            bv7Var3 = il00Var.d;
        }
        str.getClass();
        bv7Var.getClass();
        bv7Var2.getClass();
        bv7Var3.getClass();
        return new il00(str, bv7Var, bv7Var2, bv7Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il00)) {
            return false;
        }
        il00 il00Var = (il00) obj;
        return Intrinsics.g(this.a, il00Var.a) && Intrinsics.g(this.b, il00Var.b) && Intrinsics.g(this.c, il00Var.c) && Intrinsics.g(this.d, il00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CodeActorsState(shareCode=" + this.a + ", shareButton=" + this.b + ", editButton=" + this.c + ", addButton=" + this.d + ")";
    }

    public /* synthetic */ il00(String str, bv7 bv7Var, bv7 bv7Var2, bv7 bv7Var3, int i) {
        this(str, (i & 2) != 0 ? bv7.b.a : bv7Var, (i & 4) != 0 ? bv7.b.a : bv7Var2, (i & 8) != 0 ? bv7.b.a : bv7Var3);
    }
}
