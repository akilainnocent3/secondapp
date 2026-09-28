package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class mpi {
    public final opi a;
    public final String b;

    public mpi(opi opiVar, String str) {
        this.a = opiVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpi)) {
            return false;
        }
        mpi mpiVar = (mpi) obj;
        return this.a == mpiVar.a && this.b.equals(mpiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FooterSocialLink(platform=" + this.a + ", url=" + this.b + ")";
    }
}
