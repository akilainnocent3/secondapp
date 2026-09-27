package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class g8 extends x1 {
    public g8(Context context, jg jgVar) {
        super(context, jgVar);
    }

    @Override // com.startapp.sdk.internal.x1
    public final void a() {
        try {
            long millis = TimeUnit.SECONDS.toMillis(MetaData.E().T().k());
            eg egVar = new eg(this.f75808a, this.f75809b);
            this.f75810c.postDelayed(new f8(this, egVar), millis);
            egVar.a();
        } catch (Throwable th2) {
            d9.a(th2);
            this.f75809b.a(null);
        }
    }
}
