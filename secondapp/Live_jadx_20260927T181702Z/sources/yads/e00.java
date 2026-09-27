package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v3 yads.e00[], still in use, count: 1, list:
  (r3v3 yads.e00[]) from 0x0078: INVOKE (r3v3 yads.e00[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:121)
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
public final class e00 {
    f148432d("banner"),
    f148433e("interstitial"),
    f148434f("rewarded"),
    f148435g("native"),
    f148436h("instream"),
    f148437i("appopenad"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("retail"),
    f148438j("feed");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d00 f148431c = new d00();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ sr.a f148440l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148441b;

    static {
        f148440l = sr.c.c(new e00[]{r0, r1, r2, r4, r6, r8, r10, r12});
    }

    public e00(String str) {
        super(str, i);
        this.f148441b = str;
    }

    public static e00 valueOf(String str) {
        return (e00) Enum.valueOf(e00.class, str);
    }

    public static e00[] values() {
        return (e00[]) f148439k.clone();
    }
}
