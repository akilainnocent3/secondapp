package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i.h f25592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i.h f25593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ResultReceiver f25594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ResultReceiver f25595i;

    @h1
    public final void O0(ActivityResult activityResult) {
        Intent intentC = activityResult.c();
        int responseCode = com.google.android.gms.internal.play_billing.zze.zzf(intentC, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f25594h;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intentC == null ? null : intentC.getExtras());
        }
        if (activityResult.d() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.d() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    @h1
    public final void P0(ActivityResult activityResult) {
        Intent intentC = activityResult.c();
        int responseCode = com.google.android.gms.internal.play_billing.zze.zzf(intentC, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.f25595i;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intentC == null ? null : intentC.getExtras());
        }
        if (activityResult.d() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(activityResult.d()), Integer.valueOf(responseCode)));
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f25592f = registerForActivityResult(new j.b.n(), new i.a() { // from class: com.android.billingclient.api.zzct
            @Override // i.a
            public final void onActivityResult(Object obj) {
                this.zza.O0((ActivityResult) obj);
            }
        });
        this.f25593g = registerForActivityResult(new j.b.n(), new i.a() { // from class: com.android.billingclient.api.zzcu
            @Override // i.a
            public final void onActivityResult(Object obj) {
                this.zza.P0((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f25594h = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f25595i = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f25594h = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f25592f.b(new IntentSenderRequest.a(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f25595i = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f25593g.b(new IntentSenderRequest.a(pendingIntent2).a());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f25594h;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f25595i;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
