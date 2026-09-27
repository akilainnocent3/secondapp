package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 yads.di2[], still in use, count: 1, list:
  (r3v2 yads.di2[]) from 0x001d: INVOKE (r3v2 yads.di2[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:30)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class di2 {
    f148220c,
    f148221d;


    @oy.l
    public static final ci2 Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dr.i0 f148219b;

    static {
        sr.c.c(di2VarArr);
        Companion = new ci2();
        f148219b = dr.k0.a(dr.m0.PUBLICATION, bi2.f147208b);
    }

    public di2() {
        super(str, i);
    }

    public static di2 valueOf(String str) {
        return (di2) Enum.valueOf(di2.class, str);
    }

    public static di2[] values() {
        return (di2[]) f148222e.clone();
    }
}
