package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v43 yads.u11[], still in use, count: 1, list:
  (r1v43 yads.u11[]) from 0x03e0: INVOKE (r1v43 yads.u11[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:993)
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
public final class u11 {
    f156192c("Ad-Width"),
    f156193d("Ad-Height"),
    f156194e("Ad-Type"),
    f156195f("Ad-Info"),
    f156196g("Ad-CloseButtonDelay"),
    f156197h("Ad-ImpressionData"),
    f156198i("Ad-PreloadNativeVideo"),
    f156199j("Ad-PreloadImages"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("Ad-RenderTrackingUrls"),
    f156200k("Ad-Design"),
    f156201l("Ad-Language"),
    f156202m("Ad-Experiments"),
    f156203n("Ad-AbExperiments"),
    f156204o("Ad-Mediation"),
    f156205p("Ad-ContentType"),
    f156206q("Ad-ServerLogId"),
    f156207r("Ad-PrefetchCount"),
    f156208s("Ad-RefreshPeriod"),
    f156209t("Ad-ReloadTimeout"),
    f156210u("Ad-RewardAmount"),
    f156211v("Ad-RewardDelay"),
    f156212w("Ad-RewardType"),
    f156213x("Ad-RewardUrl"),
    f156214y("Ad-EmptyInterval"),
    f156215z("Ad-Renderer"),
    A("Ad-RotationEnabled"),
    B("Ad-RawVastEnabled"),
    C("Ad-ServerSideReward"),
    D("Ad-SessionData"),
    E("Ad-FeedSessionData"),
    F("Ad-RenderAdIds"),
    G("Ad-ImpressionAdIds"),
    H("Ad-NonSkippableAdEnabled"),
    I("Ad-AdTypeFormat"),
    J("Ad-ProductType"),
    K("Ad-Source"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("User-Agent"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("encrypted-request"),
    L("Ad-AnalyticsParameters"),
    M("Ad-IncreasedAdSize"),
    N("Ad-ShouldInvalidateStartup"),
    O("Ad-DesignFormat"),
    P("Ad-NativeVideoPreloadingStrategy"),
    Q("Ad-NativeImageLoadingStrategy"),
    R("Ad-ServerSideClientIP"),
    S("Ad-OpenLinksInApp"),
    T("Ad-Base64Encoding"),
    U("Ad-MediaBase64Encoding"),
    V("Ad-DivBase64Encoding"),
    W("Ad-WaitWebViewLoadFinishOnPreloading"),
    X("Ad-NativeVideoBackgroundPreloading"),
    Y("Ad-HideNavigationBar"),
    Z("Ad-WebViewCacheMode"),
    f156190a0("Ad-ForceValidateAssets");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156216b;

    static {
        sr.c.c(u11VarArr);
    }

    public u11(String str) {
        super(str, i);
        this.f156216b = str;
    }

    public static u11 valueOf(String str) {
        return (u11) Enum.valueOf(u11.class, str);
    }

    public static u11[] values() {
        return (u11[]) f156191b0.clone();
    }

    public final String a() {
        return this.f156216b;
    }
}
