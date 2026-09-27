package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 yads.e8[], still in use, count: 1, list:
  (r1v5 yads.e8[]) from 0x00f2: INVOKE (r1v5 yads.e8[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:243)
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
public final class e8 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7(to.c.appLovin),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("applovin_max"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("bigoads"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37(to.c.chartBoost),
    /* JADX INFO: Fake field, exist only in values array */
    EF47("digitalturbine"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57(to.c.adManagerAds),
    /* JADX INFO: Fake field, exist only in values array */
    EF67("admob"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81("inmobi"),
    /* JADX INFO: Fake field, exist only in values array */
    EF96("ironsource"),
    /* JADX INFO: Fake field, exist only in values array */
    EF111("mintegral"),
    /* JADX INFO: Fake field, exist only in values array */
    EF126("mytarget"),
    /* JADX INFO: Fake field, exist only in values array */
    EF141("pangle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF156("tapjoy"),
    /* JADX INFO: Fake field, exist only in values array */
    EF171("unityads"),
    /* JADX INFO: Fake field, exist only in values array */
    EF186("vungle"),
    /* JADX INFO: Fake field, exist only in values array */
    EF201("yandex");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d8 f148561c = new d8();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ sr.a f148563e = sr.c.c(new e8[]{new e8(to.c.appLovin), new e8("applovin_max"), new e8("bigoads"), new e8(to.c.chartBoost), new e8("digitalturbine"), new e8(to.c.adManagerAds), new e8("admob"), new e8("inmobi"), new e8("ironsource"), new e8("mintegral"), new e8("mytarget"), new e8("pangle"), new e8("tapjoy"), new e8("unityads"), new e8("vungle"), new e8("yandex")});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148564b;

    static {
    }

    public e8(String str) {
        super(str, i);
        this.f148564b = str;
    }

    public static e8 valueOf(String str) {
        return (e8) Enum.valueOf(e8.class, str);
    }

    public static e8[] values() {
        return (e8[]) f148562d.clone();
    }
}
