package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzup implements zzvc {

    @k.a0("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdr zzg;
    private boolean zzh;

    public zzup(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdr zzdrVar = new zzdr(zzdo.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdrVar;
        this.zzf = new AtomicReference();
    }

    private static zzuo zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzuo();
                }
                return (zzuo) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    private static int[] zzj(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    @Nullable
    private static byte[] zzk(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzun(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzb(int i10, int i11, int i12, long j10, int i13) {
        zzg();
        zzuo zzuoVarZzi = zzi();
        zzuoVarZzi.zza(i10, 0, i12, j10, i13);
        Handler handler = this.zze;
        String str = zzfk.zza;
        handler.obtainMessage(1, zzuoVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzc(int i10, int i11, zzim zzimVar, long j10, int i12) {
        zzg();
        zzuo zzuoVarZzi = zzi();
        zzuoVarZzi.zza(i10, 0, 0, j10, i12);
        MediaCodec.CryptoInfo cryptoInfo = zzuoVarZzi.zzd;
        cryptoInfo.numSubSamples = zzimVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzimVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzimVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzimVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzimVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzimVar.zzc;
        if (Build.VERSION.SDK_INT >= 24) {
            o5.j.a();
            cryptoInfo.setPattern(c5.g.a(zzimVar.zzg, zzimVar.zzh));
        }
        Handler handler = this.zze;
        String str = zzfk.zza;
        handler.obtainMessage(2, zzuoVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfk.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdr zzdrVar = this.zzg;
                zzdrVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdrVar.zzc();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final /* synthetic */ void zzh(Message message) {
        zzuo zzuoVar;
        ArrayDeque arrayDeque;
        int i10 = message.what;
        zzuo zzuoVar2 = null;
        if (i10 != 1) {
            if (i10 == 2) {
                zzuoVar = (zzuo) message.obj;
                int i11 = zzuoVar.zza;
                MediaCodec.CryptoInfo cryptoInfo = zzuoVar.zzd;
                long j10 = zzuoVar.zze;
                int i12 = zzuoVar.zzf;
                try {
                    synchronized (zzb) {
                        this.zzc.queueSecureInputBuffer(i11, 0, cryptoInfo, j10, i12);
                    }
                } catch (RuntimeException e10) {
                    androidx.lifecycle.y.a(this.zzf, null, e10);
                }
            } else if (i10 == 3) {
                this.zzg.zza();
            } else if (i10 != 4) {
                androidx.lifecycle.y.a(this.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    this.zzc.setParameters((Bundle) message.obj);
                } catch (RuntimeException e11) {
                    androidx.lifecycle.y.a(this.zzf, null, e11);
                }
            }
            if (zzuoVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzuoVar2);
                }
            }
        }
        zzuoVar = (zzuo) message.obj;
        try {
            this.zzc.queueInputBuffer(zzuoVar.zza, 0, zzuoVar.zzc, zzuoVar.zze, zzuoVar.zzf);
        } catch (RuntimeException e12) {
            androidx.lifecycle.y.a(this.zzf, null, e12);
        }
        zzuoVar2 = zzuoVar;
        if (zzuoVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzuoVar2);
            }
        }
    }
}
