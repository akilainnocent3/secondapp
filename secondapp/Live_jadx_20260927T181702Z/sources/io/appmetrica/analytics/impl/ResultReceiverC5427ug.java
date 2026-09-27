package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ResultReceiverC5427ug extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5074gg f98414a;

    public ResultReceiverC5427ug(Handler handler, InterfaceC5074gg interfaceC5074gg) {
        super(handler);
        this.f98414a = interfaceC5074gg;
    }

    public static void a(ResultReceiver resultReceiver, C5278og c5278og) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c5278og == null ? null : c5278og.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            C5278og c5278og = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c5278og = new C5278og(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f98414a.a(c5278og);
        }
    }
}
