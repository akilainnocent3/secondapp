package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 yads.ta2[], still in use, count: 1, list:
  (r6v2 yads.ta2[]) from 0x0029: INVOKE (r6v2 yads.ta2[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:42)
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
public final class ta2 {
    f155796c("LANDSCAPE"),
    f155797d("PORTRAIT"),
    f155798e("UNDEFINED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155800b;

    static {
        sr.c.c(ta2VarArr);
    }

    public ta2(String str) {
        super(str, i);
        this.f155800b = i;
    }

    public static ta2 valueOf(String str) {
        return (ta2) Enum.valueOf(ta2.class, str);
    }

    public static ta2[] values() {
        return (ta2[]) f155799f.clone();
    }
}
