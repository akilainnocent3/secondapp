package com.startapp.sdk.internal;

import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class qh extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh f75438a;

    public qh(rh rhVar) {
        this.f75438a = rhVar;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        this.f75438a.a(ServiceState.class, serviceState);
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.f75438a.f75469e.a(signalStrength);
        this.f75438a.a(SignalStrength.class, signalStrength);
    }
}
