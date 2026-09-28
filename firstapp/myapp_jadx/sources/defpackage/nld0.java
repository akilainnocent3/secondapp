package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class nld0 extends mf4 {
    public final old0 a;

    public nld0(old0 old0Var) {
        this.a = old0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nld0) && this.a == ((nld0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StackerBlock(stackerBlockState=" + this.a + ')';
    }
}
