package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface AdRepository {
    void addAd(@l ByteString byteString, @l AdObject adObject);

    void enqueueOpportunityForPlacement(@l String str, @l ByteString byteString);

    @m
    AdObject getAd(@l ByteString byteString);

    @l
    Map<ByteString, AdObject> getAllAds();

    boolean hasOpportunityId(@l ByteString byteString);

    @m
    ByteString pollOpportunityIdForPlacement(@l String str);

    void removeAd(@l ByteString byteString);
}
