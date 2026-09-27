package yads;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 yads.hr1[], still in use, count: 1, list:
  (r2v9 yads.hr1[]) from 0x015e: INVOKE (r0v8 sr.a) = (r2v9 yads.hr1[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:351)
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
public final class hr1 {
    f150231e(to.c.appLovin),
    f150232f("applovin_max"),
    f150233g("appnext"),
    f150234h("bigoads"),
    f150235i(to.c.chartBoost),
    f150236j("admob"),
    f150237k(to.c.adManagerAds),
    f150238l("digitalturbine"),
    f150239m("inmobi"),
    f150240n("ironsource"),
    f150241o("mintegral"),
    f150242p("mytarget"),
    f150243q("pangle"),
    f150244r("petalads"),
    f150245s(to.c.startApp),
    f150246t("tapjoy"),
    f150247u("unityads"),
    f150248v("vungle"),
    f150249w("zmaticoo"),
    f150250x("undefined");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gr1 f150229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f150230d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150252b;

    static {
        sr.a aVarC = sr.c.c(hr1VarArr);
        f150229c = new gr1();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ms.u.u(fr.m1.j(fr.i0.d0(aVarC, 10)), 16));
        for (Object obj : aVarC) {
            linkedHashMap.put(((hr1) obj).f150252b, obj);
        }
        f150230d = linkedHashMap;
    }

    public hr1(String str) {
        super(str, i);
        this.f150252b = str;
    }

    public static hr1 valueOf(String str) {
        return (hr1) Enum.valueOf(hr1.class, str);
    }

    public static hr1[] values() {
        return (hr1[]) f150251y.clone();
    }
}
