package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.jvm.internal.m0;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonGetOmData implements GetOmData {

    @l
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(@l OpenMeasurementRepository openMeasurementRepository) {
        m0.p(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.GetOmData
    @m
    public Object invoke(@l f<? super OMData> fVar) {
        return this.openMeasurementRepository.getOmData();
    }
}
