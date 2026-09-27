package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v4 yads.th1[], still in use, count: 1, list:
  (r2v4 yads.th1[]) from 0x00f4: INVOKE (r2v4 yads.th1[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:245)
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
public final class th1 {
    f155900c("com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION"),
    f155901d("com.yandex.mobile.ads.AGE_RESTRICTED_USER"),
    f155902e("com.yandex.mobile.ads.ENABLE_LOGGING"),
    f155903f("com.yandex.mobile.ads.AD_HOST"),
    f155904g("com.yandex.mobile.ads.FALLBACK_HOSTS"),
    f155905h("com.yandex.mobile.ads.APPMETRICA_EASY_INTEGRATION_ENABLED"),
    f155906i("com.yandex.mobile.ads.APPMETRICA_ANALYTICS_ENABLED"),
    f155907j("com.yandex.mobile.ads.SINGLE_ASSEMBLY_ENABLED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155909b;

    static {
        sr.c.c(th1VarArr);
    }

    public th1(String str) {
        super(str, i);
        this.f155909b = str;
    }

    public static th1 valueOf(String str) {
        return (th1) Enum.valueOf(th1.class, str);
    }

    public static th1[] values() {
        return (th1[]) f155908k.clone();
    }
}
