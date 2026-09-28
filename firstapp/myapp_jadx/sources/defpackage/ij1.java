package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij1 extends gas.a {
    public final int a;
    public final k26 b;

    public ij1(int i, k26 k26Var) {
        this.a = i;
        this.b = k26Var;
    }

    @Override // gas.a
    public final k26 a() {
        return this.b;
    }

    @Override // gas.a
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gas.a)) {
            return false;
        }
        gas.a aVar = (gas.a) obj;
        return this.a == aVar.b() && this.b.equals(aVar.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.a + ", cameraIdentifier=" + this.b + "}";
    }
}
