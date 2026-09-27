package com.inmobi.unifiedId;

import com.inmobi.media.E9;
import k.g1;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InMobiUnifiedIdInterface {

    @l
    public static final E9 Companion = E9.f54558a;

    @l
    public static final String NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache";

    @l
    public static final String NO_LOCAL_DATA_PRESENT = "No local data present";

    @l
    public static final String PUSH_NEEDS_TO_BE_CALLED_FIRST = "Push api needs to called prior to fetch";

    @l
    public static final String UNIFIED_SERVICE_IS_NOT_ENABLED = "UnifiedId Service not enabled, please connect with your respective partner manager";

    @l
    public static final String USER_HAS_AGE_RESTRICTION = "User has age restriction";

    @l
    public static final String USER_HAS_OPTED_OUT = "User has opted out for tracking";

    @g1
    void onFetchCompleted(@m JSONObject jSONObject, @m Error error);
}
