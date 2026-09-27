package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfe implements zzdx {

    @Nullable
    private Message zza;

    private zzfe() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdx
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzff.zzo(this);
    }

    public final zzfe zzb(Message message, zzff zzffVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzff.zzo(this);
        return zSendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzfe(byte[] bArr) {
    }
}
