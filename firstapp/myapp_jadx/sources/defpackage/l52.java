package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l52 implements la50 {
    public final c9p a;

    public /* synthetic */ l52(c9p c9pVar) {
        this.a = c9pVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l52) {
            return this.a.equals(((l52) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ')';
    }
}
