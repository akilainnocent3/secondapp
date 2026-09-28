package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzpl;
import com.twilio.voice.PublisherMetadata;

/* JADX INFO: loaded from: classes4.dex */
public final class jdl0 implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ nfl0 b;

    public jdl0(nfl0 nfl0Var, Bundle bundle) {
        this.a = bundle;
        this.b = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nfl0 nfl0Var = this.b;
        nfl0Var.g();
        nfl0Var.h();
        Bundle bundle = this.a;
        String string = bundle.getString("name");
        hm20.e(string);
        k8l0 k8l0Var = nfl0Var.a;
        if (!k8l0Var.f()) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzpl zzplVar = new zzpl(0L, null, string, "");
        try {
            yol0 yol0Var = k8l0Var.i;
            k8l0.k(yol0Var);
            bundle.getString(PublisherMetadata.APP_ID);
            k8l0Var.o().z(new zzah(bundle.getString(PublisherMetadata.APP_ID), "", zzplVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), yol0Var.J(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
