package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class p7h {
    public final boolean a;
    public final boolean b;

    public p7h(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static p7h a(p7h p7hVar, boolean z) {
        boolean z2 = p7hVar.b;
        p7hVar.getClass();
        return new p7h(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7h)) {
            return false;
        }
        p7h p7hVar = (p7h) obj;
        return this.a == p7hVar.a && this.b == p7hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FacialRecognitionUiState(isLoading=" + this.a + ", isRestoreInProgress=" + this.b + ")";
    }

    public /* synthetic */ p7h(int i) {
        this(true, false);
    }

    public p7h() {
        this(3);
    }
}
