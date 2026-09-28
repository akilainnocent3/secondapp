package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes4.dex */
public final class vbl0 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final zzdd d;
    public final boolean e;
    public final Long f;
    public final String g;

    public vbl0(Context context, zzdd zzddVar, Long l) {
        this.e = true;
        hm20.h(context);
        Context applicationContext = context.getApplicationContext();
        hm20.h(applicationContext);
        this.a = applicationContext;
        this.f = l;
        if (zzddVar != null) {
            this.d = zzddVar;
            this.e = zzddVar.c;
            this.c = zzddVar.b;
            this.g = zzddVar.e;
            Bundle bundle = zzddVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
