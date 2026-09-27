package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 yads.h21[], still in use, count: 1, list:
  (r4v3 yads.h21[]) from 0x0029: INVOKE (r4v3 yads.h21[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:42)
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
public final class h21 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("StaticResource"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("IFrameResource"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("HTMLResource");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g21 f149874c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149876b;

    static {
        sr.c.c(h21VarArr);
        f149874c = new g21();
    }

    public h21(String str) {
        super(str, i);
        this.f149876b = str;
    }

    public static h21 valueOf(String str) {
        return (h21) Enum.valueOf(h21.class, str);
    }

    public static h21[] values() {
        return (h21[]) f149875d.clone();
    }
}
