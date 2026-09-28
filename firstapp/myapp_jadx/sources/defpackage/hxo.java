package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class hxo implements php<Integer> {
    public static final hxo a = new hxo();
    public static final gw20 b = new gw20("kotlin.Int", bw20.f.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return Integer.valueOf(b5dVar.k());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.C(((Number) obj).intValue());
    }
}
