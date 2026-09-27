package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface OpenMeasurementRepository {
    @m
    Object activateOM(@l Context context, @l f<? super OMResult> fVar);

    @m
    Object finishSession(@l ByteString byteString, @l f<? super OMResult> fVar);

    @l
    OMData getOmData();

    boolean hasSessionFinished(@l ByteString byteString);

    @m
    Object impressionOccurred(@l ByteString byteString, boolean z10, @l f<? super OMResult> fVar);

    boolean isOMActive();

    void setOMActive(boolean z10);

    @m
    Object startSession(@l ByteString byteString, @m WebView webView, @l OmidOptions omidOptions, @l f<? super OMResult> fVar);
}
