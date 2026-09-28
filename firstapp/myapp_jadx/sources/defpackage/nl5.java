package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nl5 extends ql5.a {
    public int a = 0;
    public final int b;
    public final /* synthetic */ ql5 c;

    public nl5(ql5 ql5Var) {
        this.c = ql5Var;
        this.b = ql5Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }
}
