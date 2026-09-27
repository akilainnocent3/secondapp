package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 yads.hg3[], still in use, count: 1, list:
  (r4v4 yads.hg3[]) from 0x008a: INVOKE (r4v4 yads.hg3[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:139)
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
public final class hg3 {
    f150116b,
    f150117c,
    f150118d,
    f150119e,
    f150120f,
    f150121g,
    f150122h,
    f150123i,
    f150124j,
    f150125k;

    static {
        sr.c.c(hg3VarArr);
    }

    public hg3() {
        super(str, i);
    }

    public static hg3 valueOf(String str) {
        return (hg3) Enum.valueOf(hg3.class, str);
    }

    public static hg3[] values() {
        return (hg3[]) f150126l.clone();
    }
}
