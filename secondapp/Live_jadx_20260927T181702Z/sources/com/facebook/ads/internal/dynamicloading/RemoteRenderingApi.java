package com.facebook.ads.internal.dynamicloading;

import android.app.Activity;
import android.app.Service;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.facebook.proguard.annotations.DoNotStripAny;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@DoNotStripAny
@g1
public interface RemoteRenderingApi {
    AudienceNetworkExportedActivityApi createAudienceNetworkExportedActivityApi(Activity activity);

    AudienceNetworkRemoteServiceApi createAudienceNetworkRemoteService(Service service);
}
