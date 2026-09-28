package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class g0y implements php {
    public static final g0y a = new g0y();
    public static final f0y b = f0y.a;

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        throw new ee80("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        ((Void) obj).getClass();
        throw new ee80("'kotlin.Nothing' cannot be serialized");
    }
}
