package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class hxh implements php<Float> {
    public static final hxh a = new hxh();
    public static final gw20 b = new gw20("kotlin.Float", bw20.e.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return Float.valueOf(b5dVar.q());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.w(((Number) obj).floatValue());
    }
}
