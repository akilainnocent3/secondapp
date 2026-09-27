package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h implements IIdentifierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdapterIdentifiersCallback f77051a;

    public h(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f77051a = adapterIdentifiersCallback;
    }

    public final void a(Map map) {
        AdapterIdentifiersCallback adapterIdentifiersCallback = this.f77051a;
        String str = (String) map.get("yandex_mobile_metrica_uuid");
        if (str == null) {
            str = "";
        }
        adapterIdentifiersCallback.onSuccess(str);
    }

    public final void b(IIdentifierCallback.Reason reason) {
        this.f77051a.onError(reason.toString());
    }
}
