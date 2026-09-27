package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfzs extends zzfzg {
    private zzgto<Integer> zza;
    private zzgto<Integer> zzb;

    @Nullable
    private zzfzi zzc;

    @Nullable
    private HttpURLConnection zzd;

    public zzfzs(zzgto<Integer> zzgtoVar, zzgto<Integer> zzgtoVar2, @Nullable zzfzi zzfziVar) {
        this.zza = zzgtoVar;
        this.zzb = zzgtoVar2;
        this.zzc = zzfziVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(@Nullable HttpURLConnection httpURLConnection) {
        zzfzh.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URLConnection zzy(URL url) throws IOException {
        int i10 = zzfzb.zzb;
        return url.openConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(@NonNull final URL url, final int i10) throws IOException {
        this.zza = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzk
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzc = new zzfzi() { // from class: com.google.android.gms.internal.ads.zzfzl
            @Override // com.google.android.gms.internal.ads.zzfzi
            public final /* synthetic */ URLConnection zza() {
                return zzfzs.zzy(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(@NonNull final Network network, @NonNull final URL url, final int i10, final int i11) throws IOException {
        this.zza = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzm
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzb = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzn
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.zzc = new zzfzi() { // from class: com.google.android.gms.internal.ads.zzfzo
            @Override // com.google.android.gms.internal.ads.zzfzi
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzfzi zzfziVar, final int i10, final int i11) throws IOException {
        this.zza = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzp
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzb = new zzgto() { // from class: com.google.android.gms.internal.ads.zzfzq
            @Override // com.google.android.gms.internal.ads.zzgto
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.zzc = zzfziVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzfzh.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfzi zzfziVar = this.zzc;
        zzfziVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfziVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public zzfzs() {
        this(zzfzr.zza, zzfzj.zza, null);
    }
}
