package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class mbh0 implements php<hbh0> {
    public static final mbh0 a = new mbh0();
    public static final skn b;

    static {
        wvo.a.getClass();
        b = lk9.a("kotlin.UInt", hxo.a);
    }

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return new hbh0(b5dVar.l(b).k());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.h(b).C(((hbh0) obj).a);
    }
}
