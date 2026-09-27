package com.unity3d.services.core.di;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.services.core.log.DeviceLog;
import dr.w2;
import ds.l;
import kotlin.jvm.internal.o0;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class UnityAdsModule$publicApiJob$1$1 extends o0 implements l<Throwable, w2> {
    final /* synthetic */ DiagnosticEventRepository $diagnosticEventRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$publicApiJob$1$1(DiagnosticEventRepository diagnosticEventRepository) {
        super(1);
        this.$diagnosticEventRepository = diagnosticEventRepository;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Throwable th2) {
        invoke2(th2);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th2) {
        try {
            this.$diagnosticEventRepository.flush();
        } catch (Throwable th3) {
            DeviceLog.error("Failed to flush diagnostic events", th3);
        }
    }
}
