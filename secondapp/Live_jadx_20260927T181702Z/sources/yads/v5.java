package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v14 yads.v5[], still in use, count: 1, list:
  (r0v14 yads.v5[]) from 0x01bf: INVOKE (r0v14 yads.v5[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:448)
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
public final class v5 {
    f156744c("adapter_loading_duration"),
    f156745d("advertising_info_loading_duration"),
    f156746e("ad_loading_duration"),
    f156747f("ad_rendering_duration"),
    f156748g("bidding_data_loading_duration"),
    f156749h("identifiers_loading_duration"),
    f156750i("sdk_initialization_duration"),
    f156751j("sdk_configuration_queue_duration"),
    f156752k("sdk_configuration_loading_duration"),
    f156753l("sdk_configuration_request_queue_duration"),
    f156754m("sdk_configuration_request_duration"),
    f156755n("resources_loading_duration"),
    f156756o("image_loading_duration"),
    f156757p("video_caching_duration"),
    f156758q("web_view_caching_duration"),
    f156759r("network_request_queue_duration"),
    f156760s("network_request_durations"),
    f156761t("vast_loading_durations"),
    f156762u("video_ad_rendering_duration"),
    f156763v("video_ad_prepare_duration"),
    f156764w("vmap_loading_duration"),
    f156765x("bidder_token_loading_duration"),
    f156766y("bidder_token_generation_duration"),
    f156767z("dns_prefetch_duration"),
    A("client_bidding_data_loading_duration");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156768b;

    static {
        sr.c.c(v5VarArr);
    }

    public v5(String str) {
        super(str, i);
        this.f156768b = str;
    }

    public static v5 valueOf(String str) {
        return (v5) Enum.valueOf(v5.class, str);
    }

    public static v5[] values() {
        return (v5[]) B.clone();
    }
}
