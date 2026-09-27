package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 yads.zu[], still in use, count: 1, list:
  (r4v3 yads.zu[]) from 0x002d: INVOKE (r4v3 yads.zu[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:46)
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
public final class zu {
    f159023c("internal_browser"),
    f159024d("browser"),
    /* JADX INFO: Fake field, exist only in values array */
    EF31("unknown");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159026b;

    static {
        sr.c.c(zuVarArr);
    }

    public zu(String str) {
        super(str, i);
        this.f159026b = str;
    }

    public static zu valueOf(String str) {
        return (zu) Enum.valueOf(zu.class, str);
    }

    public static zu[] values() {
        return (zu[]) f159025e.clone();
    }
}
