package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cwa extends ftr {
    public final Object c;
    public final iwa.b d;
    public final iwa.a e;
    public final iwa.b f;
    public final iwa.a g;

    public cwa(Object obj) {
        super(obj);
        this.c = obj;
        this.d = new iwa.b(obj, -2, this);
        this.e = new iwa.a(obj, 0, this);
        this.f = new iwa.b(obj, -1, this);
        this.g = new iwa.a(obj, 1, this);
    }

    @Override // defpackage.ftr
    public final Object a() {
        return this.c;
    }
}
