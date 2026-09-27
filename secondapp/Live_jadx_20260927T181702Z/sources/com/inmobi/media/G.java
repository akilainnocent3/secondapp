package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3904p1 f54675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f54676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MetaInfo f54678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f54680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f54681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ContextData f54682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f54683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f54684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f54685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final JSONObject f54686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F f54687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E f54688n;

    public G(D adSetContext, String markupType, MetaInfo metaInfo, String creativeId, String tracking, List trackers, List trackingInfo, ContextData contextData, String str, long j10, long j11, JSONObject transactionInfo, F viewability, E mrc50, C3904p1 adManagerContext) {
        kotlin.jvm.internal.m0.p(adSetContext, "adSetContext");
        kotlin.jvm.internal.m0.p(markupType, "markupType");
        kotlin.jvm.internal.m0.p(creativeId, "creativeId");
        kotlin.jvm.internal.m0.p(tracking, "tracking");
        kotlin.jvm.internal.m0.p(trackers, "trackers");
        kotlin.jvm.internal.m0.p(trackingInfo, "trackingInfo");
        kotlin.jvm.internal.m0.p(transactionInfo, "transactionInfo");
        kotlin.jvm.internal.m0.p(viewability, "viewability");
        kotlin.jvm.internal.m0.p(mrc50, "mrc50");
        kotlin.jvm.internal.m0.p(adManagerContext, "adManagerContext");
        this.f54675a = adManagerContext;
        this.f54676b = adSetContext;
        this.f54677c = markupType;
        this.f54678d = metaInfo;
        this.f54679e = creativeId;
        this.f54680f = trackers;
        this.f54681g = trackingInfo;
        this.f54682h = contextData;
        this.f54683i = str;
        this.f54684j = j10;
        this.f54685k = j11;
        this.f54686l = transactionInfo;
        this.f54687m = viewability;
        this.f54688n = mrc50;
    }
}
