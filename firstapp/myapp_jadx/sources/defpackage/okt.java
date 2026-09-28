package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class okt implements php<Long> {
    public static final okt a = new okt();
    public static final gw20 b = new gw20("kotlin.Long", bw20.g.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return Long.valueOf(b5dVar.o());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.p(((Number) obj).longValue());
    }
}
