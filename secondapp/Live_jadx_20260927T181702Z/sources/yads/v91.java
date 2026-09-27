package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 yads.v91[], still in use, count: 1, list:
  (r6v3 yads.v91[]) from 0x0039: INVOKE (r6v3 yads.v91[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:58)
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
public final class v91 {
    f156850d("design_v1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("instream_design_v2"),
    f156851e("instream_ctv_design_portrait"),
    f156852f("instream_ctv_design_landscape");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u91 f156849c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156854b;

    static {
        sr.c.c(v91VarArr);
        f156849c = new u91();
    }

    public v91(String str) {
        super(str, i);
        this.f156854b = str;
    }

    public static v91 valueOf(String str) {
        return (v91) Enum.valueOf(v91.class, str);
    }

    public static v91[] values() {
        return (v91[]) f156853g.clone();
    }
}
