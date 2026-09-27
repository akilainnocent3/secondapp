package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 yads.fw[], still in use, count: 1, list:
  (r3v2 yads.fw[]) from 0x001d: INVOKE (r3v2 yads.fw[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:30)
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
public final class fw {
    f149260b,
    f149261c;

    static {
        sr.c.c(fwVarArr);
    }

    public fw() {
        super(str, i);
    }

    public static fw valueOf(String str) {
        return (fw) Enum.valueOf(fw.class, str);
    }

    public static fw[] values() {
        return (fw[]) f149262d.clone();
    }
}
