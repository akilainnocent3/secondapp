package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class z5f implements php<Double> {
    public static final z5f a = new z5f();
    public static final gw20 b = new gw20("kotlin.Double", bw20.d.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return Double.valueOf(b5dVar.s());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.e(((Number) obj).doubleValue());
    }
}
