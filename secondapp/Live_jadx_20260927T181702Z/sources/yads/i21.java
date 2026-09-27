package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 yads.i21[], still in use, count: 1, list:
  (r4v3 yads.i21[]) from 0x002b: INVOKE (r4v3 yads.i21[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:44)
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
public final class i21 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("top"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("bottom"),
    f150389c("topOffset");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150391b;

    static {
        sr.c.c(i21VarArr);
    }

    public i21(String str) {
        super(str, i);
        this.f150391b = str;
    }

    public static i21 valueOf(String str) {
        return (i21) Enum.valueOf(i21.class, str);
    }

    public static i21[] values() {
        return (i21[]) f150390d.clone();
    }
}
