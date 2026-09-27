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
public final class n extends com.google.android.gms.internal.play_billing.zzab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f25714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f25715c;

    public /* synthetic */ n(WeakReference weakReference, ResultReceiver resultReceiver, zzbl zzblVar) {
        this.f25714b = weakReference;
        this.f25715c = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f25715c.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Response bundle doesn't contain a response code");
            this.f25715c.send(6, bundle);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unable to launch intent for alternative billing only dialog" + iZzb);
            this.f25715c.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.f25715c.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f25714b.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.f25715c);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e10);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e10.getClass().getName(), zzbf.zzb(e10.getMessage())));
            this.f25715c.send(6, bundle2);
        }
    }
}
