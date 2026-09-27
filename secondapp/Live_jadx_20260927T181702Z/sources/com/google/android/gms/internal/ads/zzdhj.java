package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdhj extends zzdid implements zzbnw {
    public zzdhj(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdic() { // from class: com.google.android.gms.internal.ads.zzdhi
            @Override // com.google.android.gms.internal.ads.zzdic
            public final /* synthetic */ void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
