package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jk f96294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Nk f96295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f96296d;

    public Ok(Context context, R4 r10) {
        r10.a();
        this.f96293a = "session_extras";
        this.f96294b = new Jk();
        this.f96295c = new Nk();
        this.f96296d = C5272oa.k().B().a(context, r10);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f96296d.get(this.f96293a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f96294b.toModel(this.f96295c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Jk jk2 = this.f96294b;
        this.f96295c.getClass();
        return jk2.toModel(new Lk());
    }
}
