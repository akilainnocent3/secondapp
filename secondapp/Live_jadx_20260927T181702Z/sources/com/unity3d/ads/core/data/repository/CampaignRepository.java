package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.CampaignStateOuterClass;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface CampaignRepository {
    @m
    CampaignStateOuterClass.Campaign getCampaign(@l ByteString byteString);

    @l
    CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(@l ByteString byteString);

    void setCampaign(@l ByteString byteString, @l CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(@l ByteString byteString);

    void setShowTimestamp(@l ByteString byteString);
}
