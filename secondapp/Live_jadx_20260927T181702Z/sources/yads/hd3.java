package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v1 yads.hd3[], still in use, count: 1, list:
  (r6v1 yads.hd3[]) from 0x0027: INVOKE (r6v1 yads.hd3[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:40)
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
public final class hd3 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("VERIFICATION_REJECTED"),
    f150072c("VERIFICATION_NOT_SUPPORTED"),
    f150073d("ERROR_RESOURCE_LOAD");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150075b;

    static {
        sr.c.c(hd3VarArr);
    }

    public hd3(String str) {
        super(str, i);
        this.f150075b = i;
    }

    public static hd3 valueOf(String str) {
        return (hd3) Enum.valueOf(hd3.class, str);
    }

    public static hd3[] values() {
        return (hd3[]) f150074e.clone();
    }
}
