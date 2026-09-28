package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.twilio.voice.EventKeys;
import defpackage.as;
import defpackage.bmh0;
import defpackage.bmy;
import defpackage.dvg0;
import defpackage.kw20;
import defpackage.ml1;
import defpackage.nw20;
import defpackage.rlh0;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(EventKeys.PRIORITY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        dvg0.b(context);
        if (queryParameter == null) {
            bmy.a("Null backendName");
            return;
        }
        kw20 kw20VarB = nw20.b(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        bmh0 bmh0Var = dvg0.a().d;
        bmh0Var.e.execute(new rlh0(bmh0Var, new ml1(queryParameter, bArrDecode, kw20VarB), i, new as()));
    }
}
