package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class yvy {
    public final boolean a;
    public final boolean b;

    public yvy(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvy)) {
            return false;
        }
        yvy yvyVar = (yvy) obj;
        return this.a == yvyVar.a && this.b == yvyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OneXTwoUpRemoteConfig(oneUpDisplayEnabled=" + this.a + ", twoUpDisplayEnabled=" + this.b + ")";
    }
}
