package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class zqr implements id90 {
    public final u6h a;

    public zqr(u6h u6hVar) {
        this.a = u6hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqr) && this.a.equals(((zqr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LaunchFacialRecognitionSideEffect(data=" + this.a + ")";
    }
}
