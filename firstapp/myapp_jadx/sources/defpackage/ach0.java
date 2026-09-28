package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ach0 implements php<wbh0> {
    public static final ach0 a = new ach0();
    public static final skn b;

    static {
        u590.a.getClass();
        b = lk9.a("kotlin.UShort", w590.a);
    }

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return new wbh0(b5dVar.l(b).p());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.h(b).u(((wbh0) obj).a);
    }
}
