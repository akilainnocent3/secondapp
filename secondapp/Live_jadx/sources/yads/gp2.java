package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 yads.gp2[], still in use, count: 1, list:
  (r2v3 yads.gp2[]) from 0x0021: INVOKE (r2v3 yads.gp2[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:34)
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
public final class gp2 {
    f149736c("light"),
    f149737d("dark");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149739b;

    static {
        sr.c.c(gp2VarArr);
    }

    public gp2(String str) {
        super(str, i);
        this.f149739b = str;
    }

    public static gp2 valueOf(String str) {
        return (gp2) Enum.valueOf(gp2.class, str);
    }

    public static gp2[] values() {
        return (gp2[]) f149738e.clone();
    }
}
