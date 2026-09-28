package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class il1 extends h4f0.a {
    public final int a;
    public final k8n b;

    public il1(int i, k8n k8nVar) {
        this.a = i;
        this.b = k8nVar;
    }

    @Override // h4f0.a
    public final k8n a() {
        return this.b;
    }

    @Override // h4f0.a
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h4f0.a)) {
            return false;
        }
        h4f0.a aVar = (h4f0.a) obj;
        return this.a == aVar.b() && this.b.equals(aVar.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
