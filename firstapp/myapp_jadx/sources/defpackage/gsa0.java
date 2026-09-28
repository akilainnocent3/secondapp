package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gsa0 extends zvo {
    public int a;
    public final /* synthetic */ esa0<Object> b;

    public gsa0(esa0<Object> esa0Var) {
        this.b = esa0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.e();
    }

    @Override // defpackage.zvo
    public final int nextInt() {
        int i = this.a;
        this.a = i + 1;
        return this.b.c(i);
    }
}
