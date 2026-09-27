package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import dr.w2;
import or.f;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface OmInteraction {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    public static final String OMID_CREATIVE_TYPE = "creativeType";

    @l
    public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";

    @l
    public static final String OMID_IMPRESSION_OWNER = "impressionOwner";

    @l
    public static final String OMID_IMPRESSION_TYPE = "impressionType";

    @l
    public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";

    @l
    public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";

    @l
    public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        public static final String OMID_CREATIVE_TYPE = "creativeType";

        @l
        public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";

        @l
        public static final String OMID_IMPRESSION_OWNER = "impressionOwner";

        @l
        public static final String OMID_IMPRESSION_TYPE = "impressionType";

        @l
        public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";

        @l
        public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";

        @l
        public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

        private Companion() {
        }
    }

    @l
    OmidOptions getOMidOptions(@l JSONObject jSONObject);

    @m
    WebView getWebview(@l AdObject adObject);

    @m
    Object invoke(@l AdObject adObject, @l JSONObject jSONObject, @l f<? super w2> fVar);
}
