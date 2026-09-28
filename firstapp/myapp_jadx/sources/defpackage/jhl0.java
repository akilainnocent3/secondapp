package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jhl0 implements hkl0 {
    public static final jhl0 a = new jhl0();

    @Override // defpackage.hkl0
    public final boolean zzb(Class cls) {
        return thl0.class.isAssignableFrom(cls);
    }

    @Override // defpackage.hkl0
    public final fkl0 zzc(Class cls) {
        if (!thl0.class.isAssignableFrom(cls)) {
            hb5.a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (fkl0) thl0.m(cls.asSubclass(thl0.class)).p(3);
        } catch (Exception e) {
            jk40.a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
