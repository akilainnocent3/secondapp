package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbjd extends z.i {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    @Nullable
    private Context zzc;

    @Nullable
    private zzdyz zzd;

    @Nullable
    private z.m zze;

    @Nullable
    private z.d zzf;

    private final void zzf(@Nullable Context context) {
        String strH;
        if (this.zzf != null || context == null || (strH = z.d.h(context, null)) == null || strH.equals(context.getPackageName())) {
            return;
        }
        z.d.b(context, strH, this);
    }

    @Override // z.i
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull z.d dVar) {
        this.zzf = dVar;
        dVar.n(0L);
        this.zze = dVar.k(new zzbja(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdyz zzdyzVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdyzVar;
        zzf(context);
    }

    @Nullable
    public final z.m zzb() {
        if (this.zze == null) {
            zzcff.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    @k.h1
    public final void zzc(final int i10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfz)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcff.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i10);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i10) {
        zzdyz zzdyzVar = this.zzd;
        if (zzdyzVar != null) {
            zzdyy zzdyyVarZza = zzdyzVar.zza();
            zzdyyVarZza.zzc("action", "cct_nav");
            zzdyyVarZza.zzc("cct_navs", String.valueOf(i10));
            zzdyyVarZza.zzd();
        }
    }
}
