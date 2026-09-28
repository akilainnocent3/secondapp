package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class il5 implements php<Byte> {
    public static final il5 a = new il5();
    public static final gw20 b = new gw20("kotlin.Byte", bw20.b.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return Byte.valueOf(b5dVar.F());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.g(((Number) obj).byteValue());
    }
}
