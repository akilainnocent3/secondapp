package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qg1 extends l36.a {
    public final int a;
    public final Throwable b;

    public qg1(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // l36.a
    public final Throwable a() {
        return this.b;
    }

    @Override // l36.a
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l36.a)) {
            return false;
        }
        l36.a aVar = (l36.a) obj;
        if (this.a != aVar.b()) {
            return false;
        }
        Throwable th = this.b;
        if (th == null) {
            return aVar.a() == null;
        }
        return th.equals(aVar.a());
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
