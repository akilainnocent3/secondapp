package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements IIdentifierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdapterIdentifiersCallback f77050a;

    public g(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f77050a = adapterIdentifiersCallback;
    }

    public final void a(Map map) {
        AdapterIdentifiersCallback adapterIdentifiersCallback = this.f77050a;
        String str = (String) map.get("yandex_mobile_metrica_device_id");
        if (str == null) {
            str = "";
        }
        adapterIdentifiersCallback.onSuccess(str);
    }

    public final void b(IIdentifierCallback.Reason reason) {
        this.f77050a.onError(reason.toString());
    }
}
