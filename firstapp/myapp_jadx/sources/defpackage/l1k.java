package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l1k implements vnv {
    public static final l1k a = new l1k();

    @Override // defpackage.vnv
    public final boolean isSupported(Class<?> cls) {
        return m1k.class.isAssignableFrom(cls);
    }

    @Override // defpackage.vnv
    public final tnv messageInfoFor(Class<?> cls) {
        if (!m1k.class.isAssignableFrom(cls)) {
            hb5.a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (tnv) m1k.f(cls.asSubclass(m1k.class)).e(m1k.f.c);
        } catch (Exception e) {
            jk40.a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
