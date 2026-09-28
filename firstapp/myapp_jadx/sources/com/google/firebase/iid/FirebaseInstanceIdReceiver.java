package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Tasks;
import defpackage.mt7;
import defpackage.pov;
import defpackage.rbh;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseInstanceIdReceiver extends mt7 {
    @Override // defpackage.mt7
    public final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new rbh(context).b(cloudMessage.a))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.mt7
    public final void b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (pov.d(intentPutExtras)) {
            pov.c("_nd", intentPutExtras.getExtras());
        }
    }
}
