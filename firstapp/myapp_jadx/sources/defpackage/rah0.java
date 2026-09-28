package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class rah0 implements php<nah0> {
    public static final rah0 a = new rah0();
    public static final skn b;

    static {
        gl5.a.getClass();
        b = lk9.a("kotlin.UByte", il5.a);
    }

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return new nah0(b5dVar.l(b).F());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.h(b).g(((nah0) obj).a);
    }
}
