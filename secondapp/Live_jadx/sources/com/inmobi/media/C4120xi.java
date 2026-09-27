package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4120xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f58123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainLink f58124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f58125c;

    public C4120xi(LinkedHashMap assetIdToLinkMap, MainLink mainLink, List responseClickTrackers) {
        kotlin.jvm.internal.m0.p(assetIdToLinkMap, "assetIdToLinkMap");
        kotlin.jvm.internal.m0.p(responseClickTrackers, "responseClickTrackers");
        this.f58123a = assetIdToLinkMap;
        this.f58124b = mainLink;
        this.f58125c = responseClickTrackers;
    }
}
