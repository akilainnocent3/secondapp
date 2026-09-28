package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class agc0 {
    public final boolean a;

    public agc0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agc0) && this.a == ((agc0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("SportyLegendsOverallConfig(active=", ")", this.a);
    }
}
