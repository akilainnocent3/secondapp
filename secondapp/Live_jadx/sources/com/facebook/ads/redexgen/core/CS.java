package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CS extends BroadcastReceiver {
    public final /* synthetic */ CX A00;

    public CS(CX cx2) {
        this.A00 = cx2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.A00.A03();
    }
}
