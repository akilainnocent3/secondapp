package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ol5 extends pl5.a {
    public int a = 0;
    public final int b;
    public final /* synthetic */ pl5 c;

    public ol5(pl5 pl5Var) {
        this.c = pl5Var;
        this.b = pl5Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }
}
