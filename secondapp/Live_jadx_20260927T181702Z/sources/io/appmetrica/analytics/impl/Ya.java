package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ya implements Parcelable {
    public static final Parcelable.Creator<Ya> CREATOR = new Xa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultReceiver f96831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f96833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96834d;

    public Ya(C6 c10, List list, Map map, boolean z10) {
        this.f96832b = list;
        this.f96831a = c10;
        this.f96833c = map == null ? new HashMap() : new HashMap(map);
        this.f96834d = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f96831a);
        if (this.f96832b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f96832b));
        }
        HashMap map = this.f96833c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Gm.a((Map) map));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.f96834d);
        parcel.writeBundle(bundle);
    }

    public Ya(Parcel parcel) {
        Bundle bundle = parcel.readBundle(C6.class.getClassLoader());
        if (bundle != null) {
            this.f96831a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f96832b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f96833c = Gm.a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.f96834d = bundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.f96833c = new HashMap();
    }
}
