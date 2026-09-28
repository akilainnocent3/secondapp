package com.google.android.recaptcha.internal;

import defpackage.jb5;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
final class zzpj extends zzoz implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    public zzpj(String str, String str2) {
        MessageDigest messageDigestZzc = zzc("SHA-256");
        this.zza = messageDigestZzc;
        this.zzb = messageDigestZzc.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzd(messageDigestZzc);
    }

    private static MessageDigest zzc(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            jb5.a(e);
            return null;
        }
    }

    private static boolean zzd(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzpd
    public final zzpe zzb() {
        zzpi zzpiVar = null;
        if (this.zzc) {
            try {
                return new zzph((MessageDigest) this.zza.clone(), this.zzb, zzpiVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzph(zzc(this.zza.getAlgorithm()), this.zzb, zzpiVar);
    }
}
