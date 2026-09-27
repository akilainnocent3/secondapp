package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import dr.w2;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface FetchSignalsAndSendUseCase {
    @m
    Object invoke(int i10, @l ByteString byteString, @m TokenConfiguration tokenConfiguration, @l f<? super w2> fVar);
}
