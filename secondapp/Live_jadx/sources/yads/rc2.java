package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 yads.rc2[], still in use, count: 1, list:
  (r5v2 yads.rc2[]) from 0x0029: INVOKE (r5v2 yads.rc2[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:42)
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
public final class rc2 {
    f154875b,
    f154876c,
    f154877d;

    static {
        sr.c.c(rc2VarArr);
    }

    public rc2() {
        super(str, i);
    }

    public static rc2 valueOf(String str) {
        return (rc2) Enum.valueOf(rc2.class, str);
    }

    public static rc2[] values() {
        return (rc2[]) f154878e.clone();
    }
}
