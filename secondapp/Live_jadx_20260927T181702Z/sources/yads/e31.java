package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 yads.e31[], still in use, count: 1, list:
  (r3v2 yads.e31[]) from 0x001b: INVOKE (r3v2 yads.e31[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:28)
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
public final class e31 {
    f148478b,
    /* JADX INFO: Fake field, exist only in values array */
    EF15;

    static {
        sr.c.c(e31VarArr);
    }

    public e31() {
        super(str, i);
    }

    public static e31 valueOf(String str) {
        return (e31) Enum.valueOf(e31.class, str);
    }

    public static e31[] values() {
        return (e31[]) f148479c.clone();
    }
}
