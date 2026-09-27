package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 yads.r32[], still in use, count: 1, list:
  (r2v3 yads.r32[]) from 0x0021: INVOKE (r2v3 yads.r32[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:34)
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
public final class r32 {
    f154733c("loading_on_show"),
    f154734d("loading_on_back");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154736b;

    static {
        sr.c.c(r32VarArr);
    }

    public r32(String str) {
        super(str, i);
        this.f154736b = str;
    }

    public static r32 valueOf(String str) {
        return (r32) Enum.valueOf(r32.class, str);
    }

    public static r32[] values() {
        return (r32[]) f154735e.clone();
    }

    public final String a() {
        return this.f154736b;
    }
}
