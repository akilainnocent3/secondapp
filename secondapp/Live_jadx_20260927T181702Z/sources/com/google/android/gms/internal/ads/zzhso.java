package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhso extends zzidr implements zzifd {
    private static final zzhso zzc;
    private static volatile zzifk zzd;
    private int zza;
    private zzied zzb = zzidr.zzbM();

    static {
        zzhso zzhsoVar = new zzhso();
        zzc = zzhsoVar;
        zzidr.zzbu(zzhso.class, zzhsoVar);
    }

    private zzhso() {
    }

    public static zzhso zze(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzhso) zzidr.zzbV(zzc, bArr, zzidbVar);
    }

    public static zzhso zzg(InputStream inputStream, zzidb zzidbVar) throws IOException {
        return (zzhso) zzidr.zzbX(zzc, inputStream, zzidbVar);
    }

    public static zzhsl zzh() {
        return (zzhsl) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhsn zzd(int i10) {
        return (zzhsn) this.zzb.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    public final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzidmVar;
        int iOrdinal = zzidqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzidr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhsn.class});
        }
        if (iOrdinal == 3) {
            return new zzhso();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsl(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifk zzifkVar = zzd;
        if (zzifkVar != null) {
            return zzifkVar;
        }
        synchronized (zzhso.class) {
            try {
                zzidmVar = zzd;
                if (zzidmVar == null) {
                    zzidmVar = new zzidm(zzc);
                    zzd = zzidmVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidmVar;
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zza = i10;
    }

    public final /* synthetic */ void zzj(zzhsn zzhsnVar) {
        zzhsnVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzhsnVar);
    }
}
