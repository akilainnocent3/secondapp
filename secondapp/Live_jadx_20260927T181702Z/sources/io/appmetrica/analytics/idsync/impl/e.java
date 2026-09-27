package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f95464a = new x();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o fromModel(@oy.l IdSyncConfig idSyncConfig) {
        o oVar = new o();
        oVar.f95495a = idSyncConfig.getEnabled();
        n nVar = new n();
        nVar.f95490a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        m[] mVarArr = new m[size];
        for (int i10 = 0; i10 < size; i10++) {
            mVarArr[i10] = this.f95464a.fromModel(idSyncConfig.getRequests().get(i10));
        }
        nVar.f95491b = mVarArr;
        oVar.f95496b = nVar;
        return oVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @oy.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(@oy.l o oVar) {
        n nVar = oVar.f95496b;
        if (nVar == null) {
            nVar = new n();
        }
        boolean z10 = oVar.f95495a;
        long j10 = nVar.f95490a;
        m[] mVarArr = nVar.f95491b;
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (m mVar : mVarArr) {
            arrayList.add(this.f95464a.toModel(mVar));
        }
        return new IdSyncConfig(z10, j10, arrayList);
    }
}
