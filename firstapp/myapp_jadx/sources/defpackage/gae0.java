package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class gae0 implements php<String> {
    public static final gae0 a = new gae0();
    public static final gw20 b = new gw20("kotlin.String", bw20.i.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return b5dVar.A();
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        String str = (String) obj;
        str.getClass();
        f4gVar.E(str);
    }
}
