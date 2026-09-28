package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jqk0 extends ark0 {
    public boolean b;
    public final /* synthetic */ Object c;

    public jqk0(Object obj) {
        super(0);
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            lrh0.a();
            return null;
        }
        this.b = true;
        return this.c;
    }
}
