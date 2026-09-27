package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zziaa extends ThreadLocal {
    final /* synthetic */ zziab zza;

    public zziaa(zziab zziabVar) {
        Objects.requireNonNull(zziabVar);
        this.zza = zziabVar;
    }

    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhzm zzhzmVar = zzhzm.zzb;
            zziab zziabVar = this.zza;
            Mac mac = (Mac) zzhzmVar.zzb(zziabVar.zzb());
            mac.init(zziabVar.zzc());
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
