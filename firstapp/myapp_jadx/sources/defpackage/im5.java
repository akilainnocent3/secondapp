package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class im5 extends dm5 implements Iterable<gm5> {

    public static class a implements Iterator<gm5> {
        public im5 a;
        public int b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b < this.a.e.size();
        }

        @Override // java.util.Iterator
        public final gm5 next() {
            gm5 gm5Var = (gm5) this.a.e.get(this.b);
            this.b++;
            return gm5Var;
        }
    }

    @Override // defpackage.dm5, defpackage.fm5
    public final Object clone() {
        return (im5) super.a();
    }

    @Override // java.lang.Iterable
    public final Iterator<gm5> iterator() {
        a aVar = new a();
        aVar.b = 0;
        aVar.a = this;
        return aVar;
    }

    @Override // defpackage.dm5
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final im5 a() {
        return (im5) super.a();
    }
}
