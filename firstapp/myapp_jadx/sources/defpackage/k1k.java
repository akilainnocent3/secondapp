package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class k1k implements unv {
    public static final k1k a = new k1k();

    @Override // defpackage.unv
    public final boolean isSupported(Class<?> cls) {
        return n1k.class.isAssignableFrom(cls);
    }

    @Override // defpackage.unv
    public final snv messageInfoFor(Class<?> cls) {
        if (!n1k.class.isAssignableFrom(cls)) {
            hb5.a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (snv) n1k.j(cls.asSubclass(n1k.class)).i(n1k.f.c);
        } catch (Exception e) {
            jk40.a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
