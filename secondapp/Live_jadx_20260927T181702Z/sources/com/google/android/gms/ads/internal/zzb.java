package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbzy;
import com.google.android.gms.internal.ads.zzcdb;
import java.util.Collections;
import java.util.List;
import zq.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@j
public final class zzb {
    private final Context zza;
    private boolean zzb;

    @Nullable
    private final zzcdb zzc;
    private final zzbzy zzd = new zzbzy(false, Collections.EMPTY_LIST);

    public zzb(Context context, @Nullable zzcdb zzcdbVar, @Nullable zzbzy zzbzyVar) {
        this.zza = context;
        this.zzc = zzcdbVar;
    }

    private final boolean zzd() {
        zzcdb zzcdbVar = this.zzc;
        return (zzcdbVar != null && zzcdbVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final boolean zzb() {
        return !zzd() || this.zzb;
    }

    public final void zzc(@Nullable String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcdb zzcdbVar = this.zzc;
            if (zzcdbVar != null) {
                zzcdbVar.zze(str, null, 3);
                return;
            }
            zzbzy zzbzyVar = this.zzd;
            if (!zzbzyVar.zza || (list = zzbzyVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzO(context, "", strReplace);
                }
            }
        }
    }
}
