package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhkb extends ThreadLocal {
    @zq.h
    public static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhzm.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzhiu.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    @zq.h
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
