package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class d87 implements php<Character> {
    public static final d87 a = new d87();
    public static final gw20 b = new gw20("kotlin.Char", bw20.c.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return Character.valueOf(b5dVar.u());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        f4gVar.y(((Character) obj).charValue());
    }
}
