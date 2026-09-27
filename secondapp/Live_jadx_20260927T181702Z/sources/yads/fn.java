package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 yads.fn[], still in use, count: 1, list:
  (r8v3 yads.fn[]) from 0x0045: INVOKE (r8v3 yads.fn[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:70)
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
public final class fn {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("constant"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(androidx.constraintlayout.widget.g.V1),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("screen_based"),
    f149175d("screen_orientation_based"),
    f149176e("mediation");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final en f149174c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149178b;

    static {
        sr.c.c(fnVarArr);
        f149174c = new en();
    }

    public fn(String str) {
        super(str, i);
        this.f149178b = str;
    }

    public static fn valueOf(String str) {
        return (fn) Enum.valueOf(fn.class, str);
    }

    public static fn[] values() {
        return (fn[]) f149177f.clone();
    }
}
