package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final X9 f60235a;

    public V6(@oy.l X9 globalDataWriter) {
        kotlin.jvm.internal.m0.p(globalDataWriter, "globalDataWriter");
        this.f60235a = globalDataWriter;
    }

    public final void a(@oy.l JSONObject metaDataJson) {
        kotlin.jvm.internal.m0.p(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.ironsource.mediationsdk.metadata.a.f62748i)) {
            try {
                Object objRemove = metaDataJson.remove(com.ironsource.mediationsdk.metadata.a.f62748i);
                kotlin.jvm.internal.m0.n(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) objRemove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type kotlin.String");
                this.f60235a.e((String) obj);
            } catch (ClassCastException e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error("got the following error " + e10.getMessage());
            }
        }
    }
}
