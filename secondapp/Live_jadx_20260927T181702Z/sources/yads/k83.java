package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 yads.k83[], still in use, count: 1, list:
  (r4v4 yads.k83[]) from 0x0088: INVOKE (r4v4 yads.k83[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:137)
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
public final class k83 {
    f151427b,
    f151428c,
    f151429d,
    f151430e,
    f151431f,
    f151432g,
    f151433h,
    f151434i,
    f151435j,
    /* JADX INFO: Fake field, exist only in values array */
    EF107;

    static {
        sr.c.c(k83VarArr);
    }

    public k83() {
        super(str, i);
    }

    public static k83 valueOf(String str) {
        return (k83) Enum.valueOf(k83.class, str);
    }

    public static k83[] values() {
        return (k83[]) f151436k.clone();
    }
}
