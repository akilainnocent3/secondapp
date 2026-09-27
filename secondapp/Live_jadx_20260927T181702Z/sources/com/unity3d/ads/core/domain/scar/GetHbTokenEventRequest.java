package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface GetHbTokenEventRequest {
    @m
    Object invoke(@l ByteString byteString, @l BiddingSignals biddingSignals, @l f<? super GetTokenEventRequestOuterClass.GetTokenEventRequest> fVar);
}
