package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class o1g implements uen {
    public final boolean a;

    public o1g(boolean z) {
        this.a = z;
    }

    @Override // defpackage.uen
    public final exx a() {
        return null;
    }

    @Override // defpackage.uen
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return j26.a(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
