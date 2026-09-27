package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Gh extends I3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    protected E8 f95859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C5451vf f95860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f95861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f95862f;

    public Gh(@NonNull Cf cf2, @NonNull CounterConfiguration counterConfiguration, @NonNull E8 e10) {
        this(cf2, counterConfiguration, e10, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f95926b.toBundle(bundle);
        Cf cf2 = this.f95925a;
        synchronized (cf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", cf2);
        }
        return bundle;
    }

    @Nullable
    public final synchronized String d() {
        E8 e10;
        e10 = this.f95859c;
        return e10.f95764a.isEmpty() ? null : new JSONObject(e10.f95764a).toString();
    }

    @Nullable
    public final synchronized String e() {
        return this.f95862f;
    }

    public boolean f() {
        return this.f95861e;
    }

    public Gh(@NonNull Cf cf2, @NonNull CounterConfiguration counterConfiguration, @NonNull E8 e10, @Nullable String str) {
        super(cf2, counterConfiguration);
        this.f95861e = true;
        this.f95862f = str;
        this.f95859c = e10;
    }
}
