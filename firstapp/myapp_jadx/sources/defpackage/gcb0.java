package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class gcb0 {
    public final String a;
    public final String b;

    public gcb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcb0)) {
            return false;
        }
        gcb0 gcb0Var = (gcb0) obj;
        return this.a.equals(gcb0Var.a) && this.b.equals(gcb0Var.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 1763709983;
    }

    public final String toString() {
        return tx5.a("SpineAssetConfig(cmsKey=", this.a, ", defaultUrl=", this.b, ", cacheName=hero_fuggu)");
    }
}
