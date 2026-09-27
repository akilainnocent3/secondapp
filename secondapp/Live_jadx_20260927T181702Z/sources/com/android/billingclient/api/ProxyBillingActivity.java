package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@UsedByReflection("PlatformActivityProxy")
@zzl
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f25579g = "result_receiver";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f25580h = "in_app_message_result_receiver";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f25581i = "ProxyBillingActivity";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f25582j = 100;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f25583k = 101;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f25584l = 110;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f25585m = "send_cancelled_broadcast_if_finished";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f25586n = "activity_code";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ResultReceiver f25587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ResultReceiver f25588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25591f;

    public final Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    @zzl
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        Intent intentB;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100 || i10 == 110) {
            int responseCode = com.google.android.gms.internal.play_billing.zze.zzf(intent, f25581i).getResponseCode();
            if (i11 != -1) {
                com.google.android.gms.internal.play_billing.zze.zzl(f25581i, "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
            } else if (responseCode != 0) {
                i11 = -1;
                com.google.android.gms.internal.play_billing.zze.zzl(f25581i, "Activity finished with resultCode " + i11 + " and billing's responseCode: " + responseCode);
            } else {
                responseCode = 0;
            }
            ResultReceiver resultReceiver = this.f25587b;
            if (resultReceiver != null) {
                resultReceiver.send(responseCode, intent != null ? intent.getExtras() : null);
            } else {
                if (intent == null) {
                    intentB = b();
                } else if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentB = a(string);
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentB = b();
                        intentB.putExtras(intent.getExtras());
                        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                } else {
                    intentB = b();
                    com.google.android.gms.internal.play_billing.zze.zzl(f25581i, "Got null bundle!");
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
                    builderNewBuilder.setResponseCode(6);
                    builderNewBuilder.setDebugMessage("An internal error occurred.");
                    intentB.putExtra("FAILURE_LOGGING_PAYLOAD", zzcg.zzb(22, 2, builderNewBuilder.build()).zzh());
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                if (i10 == 110) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
        } else if (i10 == 101) {
            int iZza = com.google.android.gms.internal.play_billing.zze.zza(intent, f25581i);
            ResultReceiver resultReceiver2 = this.f25588c;
            if (resultReceiver2 != null) {
                resultReceiver2.send(iZza, intent != null ? intent.getExtras() : null);
            }
        } else {
            com.google.android.gms.internal.play_billing.zze.zzl(f25581i, "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.f25589d = false;
        finish();
    }

    @Override // android.app.Activity
    @zzl
    public void onCreate(@Nullable Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.zze.zzk(f25581i, "Launching Play Store billing flow from savedInstanceState");
            this.f25589d = bundle.getBoolean(f25585m, false);
            if (bundle.containsKey(f25579g)) {
                this.f25587b = (ResultReceiver) bundle.getParcelable(f25579g);
            } else if (bundle.containsKey(f25580h)) {
                this.f25588c = (ResultReceiver) bundle.getParcelable(f25580h);
            }
            this.f25590e = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f25591f = bundle.getInt(f25586n, 100);
            return;
        }
        com.google.android.gms.internal.play_billing.zze.zzk(f25581i, "Launching Play Store billing flow");
        this.f25591f = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f25590e = true;
                this.f25591f = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f25587b = (ResultReceiver) getIntent().getParcelableExtra(f25579g);
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f25588c = (ResultReceiver) getIntent().getParcelableExtra(f25580h);
            this.f25591f = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f25589d = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f25591f, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            com.google.android.gms.internal.play_billing.zze.zzm(f25581i, "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f25587b;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f25588c;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentB = b();
                    if (this.f25590e) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.f25589d = false;
            finish();
        }
    }

    @Override // android.app.Activity
    @zzl
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f25589d) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i10 = this.f25591f;
            if (i10 == 110 || i10 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    @zzl
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f25587b;
        if (resultReceiver != null) {
            bundle.putParcelable(f25579g, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f25588c;
        if (resultReceiver2 != null) {
            bundle.putParcelable(f25580h, resultReceiver2);
        }
        bundle.putBoolean(f25585m, this.f25589d);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f25590e);
        bundle.putInt(f25586n, this.f25591f);
    }
}
