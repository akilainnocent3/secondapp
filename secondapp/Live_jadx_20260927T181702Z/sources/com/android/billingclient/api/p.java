package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzbf;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends com.google.android.gms.internal.play_billing.zzaf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f25719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f25720c;

    public /* synthetic */ p(WeakReference weakReference, ResultReceiver resultReceiver, zzbl zzblVar) {
        this.f25719b = weakReference;
        this.f25720c = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzag
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f25720c.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Response bundle doesn't contain a response code");
            this.f25720c.send(6, bundle);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unable to launch intent for external offer dialog" + iZzb);
            this.f25720c.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "The PendingIntent for the external offer dialog is null");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            this.f25720c.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.f25719b.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", this.f25720c);
            intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Runtime error while launching intent for the external offer dialog.", e10);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", 98);
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), zzbf.zzb(e10.getMessage())));
            this.f25720c.send(6, bundle3);
        }
    }
}
