package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends com.google.android.gms.internal.play_billing.zzao {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f25727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f25728c;

    public /* synthetic */ s(WeakReference weakReference, ResultReceiver resultReceiver, zzbl zzblVar) {
        this.f25727b = weakReference;
        this.f25728c = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f25728c;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f25727b.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.f25728c.send(0, null);
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra(ProxyBillingActivity.f25580h, this.f25728c);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e10) {
            this.f25728c.send(0, null);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
        }
    }
}
