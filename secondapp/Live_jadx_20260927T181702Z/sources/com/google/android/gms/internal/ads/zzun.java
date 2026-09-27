package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzun extends Handler {
    final /* synthetic */ zzup zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzun(zzup zzupVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zzupVar);
        this.zza = zzupVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
