package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class x15 implements php<Boolean> {
    public static final x15 a = new x15();
    public static final gw20 b = new gw20("kotlin.Boolean", bw20.a.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return Boolean.valueOf(b5dVar.t());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.v(((Boolean) obj).booleanValue());
    }
}
