package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class w590 implements php<Short> {
    public static final w590 a = new w590();
    public static final gw20 b = new gw20("kotlin.Short", bw20.h.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return Short.valueOf(b5dVar.p());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.u(((Number) obj).shortValue());
    }
}
