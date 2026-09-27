package yads;

import com.ironsource.C4497s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v43 yads.co2[], still in use, count: 1, list:
  (r1v43 yads.co2[]) from 0x03bc: INVOKE (r1v43 yads.co2[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:957)
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
public final class co2 {
    f147817c("ad_loading_result"),
    f147818d("ad_rendering_result"),
    f147819e("adapter_auto_refresh"),
    f147820f("adapter_invalid"),
    f147821g("adapter_request"),
    f147822h("adapter_response"),
    f147823i("adapter_bidder_token_request"),
    f147824j("adtune"),
    f147825k("ad_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("ad_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("vast_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("vast_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("vast_wrapper_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("vast_wrapper_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("video_ad_start"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("video_ad_complete"),
    f147826l("video_ad_player_error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("vmap_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("vmap_response"),
    f147827m("rendering_start"),
    f147828n("dsp_rendering_start"),
    f147829o("impression_tracking_start"),
    f147830p("impression_tracking_success"),
    f147831q("impression_tracking_failure"),
    f147832r("forced_impression_tracking_failure"),
    f147833s("adapter_action"),
    f147834t("click"),
    f147835u("close"),
    f147836v("feedback"),
    f147837w("deeplink"),
    f147838x("bound_assets"),
    f147839y("rendered_assets"),
    f147840z("rebind"),
    A("binding_failure"),
    B("expected_view_missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("returned_to_app"),
    C(C4497s.f63499j),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("video_ad_rendering_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("multibanner_event"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("ad_view_size_info"),
    D("dsp_impression_tracking_start"),
    E("dsp_impression_tracking_success"),
    F("dsp_impression_tracking_failure"),
    G("dsp_forced_impression_tracking_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("log"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("open_bidding_token_generation_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("sdk_configuration_success"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("sdk_configuration_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("tracking_event"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("ad_verification_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("sdk_configuration_request"),
    H("activity_result_opened"),
    I("client_bidding_loading_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF775("activity_action");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147841b;

    static {
        sr.c.c(co2VarArr);
    }

    public co2(String str) {
        super(str, i);
        this.f147841b = str;
    }

    public static co2 valueOf(String str) {
        return (co2) Enum.valueOf(co2.class, str);
    }

    public static co2[] values() {
        return (co2[]) J.clone();
    }

    public final String a() {
        return this.f147841b;
    }
}
