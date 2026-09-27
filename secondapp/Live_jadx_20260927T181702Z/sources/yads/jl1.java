package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 yads.jl1[], still in use, count: 1, list:
  (r2v3 yads.jl1[]) from 0x001d: INVOKE (r2v3 yads.jl1[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:30)
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
public final class jl1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("streaming"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("progressive");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151146b;

    static {
        sr.c.c(jl1VarArr);
    }

    public jl1(String str) {
        super(str, i);
        this.f151146b = str;
    }

    public static jl1 valueOf(String str) {
        return (jl1) Enum.valueOf(jl1.class, str);
    }

    public static jl1[] values() {
        return (jl1[]) f151145c.clone();
    }
}
