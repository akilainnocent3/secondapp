package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class rbh0 implements php<nbh0> {
    public static final rbh0 a = new rbh0();
    public static final skn b;

    static {
        qjt.a.getClass();
        b = lk9.a("kotlin.ULong", okt.a);
    }

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return new nbh0(b5dVar.l(b).o());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.h(b).p(((nbh0) obj).a);
    }
}
