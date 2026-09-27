package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.e;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import fr.r0;
import fr.y1;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AppMetricaAdapter implements VarioqubConfigAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public static final Companion f77036f = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f77038b = e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f77039c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f77040d = y1.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f77041e = "AppMetricaAdapter";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x xVar) {
            this();
        }
    }

    public AppMetricaAdapter(@l Context context) {
        this.f77037a = context;
    }

    public final void a(@l String str) {
        this.f77038b.a(this.f77037a, str);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    @l
    public String getAdapterName() {
        return this.f77041e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void reportConfigChanged(@l ConfigData configData) {
        d dVar = this.f77038b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        dVar.b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestDeviceId(@l AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f77038b.c(this.f77037a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestUserId(@l AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f77038b.a(this.f77037a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setExperiments(@l String str) {
        this.f77039c = str;
        Objects.toString(this.f77040d);
        d dVar = this.f77038b;
        k kVar = new k();
        kVar.f77052a = this.f77039c;
        kVar.f77053b = r0.b6(this.f77040d);
        dVar.a(MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setTriggeredTestIds(@l Set<Long> set) {
        Objects.toString(set);
        Set setF6 = r0.f6(set);
        this.f77040d = setF6;
        Objects.toString(setF6);
        d dVar = this.f77038b;
        k kVar = new k();
        kVar.f77052a = this.f77039c;
        kVar.f77053b = r0.b6(this.f77040d);
        dVar.a(MessageNano.toByteArray(kVar));
    }
}
