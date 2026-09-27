package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v20 yads.if3[], still in use, count: 1, list:
  (r0v20 yads.if3[]) from 0x0202: INVOKE (r0v20 yads.if3[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:515)
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
public final class if3 {
    f150598b,
    f150599c,
    f150600d,
    f150601e,
    f150602f,
    f150603g,
    f150604h,
    f150605i,
    f150606j,
    f150607k,
    f150608l,
    f150609m,
    f150610n,
    f150611o,
    f150612p,
    f150613q,
    f150614r,
    f150615s,
    f150616t,
    f150617u,
    f150618v,
    f150619w,
    f150620x,
    f150621y,
    f150622z,
    A,
    B,
    C,
    D,
    E,
    F,
    G;

    static {
        sr.c.c(if3VarArr);
    }

    public if3() {
        super(str, i);
    }

    public static if3 valueOf(String str) {
        return (if3) Enum.valueOf(if3.class, str);
    }

    public static if3[] values() {
        return (if3[]) H.clone();
    }
}
