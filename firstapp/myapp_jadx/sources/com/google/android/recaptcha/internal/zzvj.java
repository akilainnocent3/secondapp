package com.google.android.recaptcha.internal;

import defpackage.hb5;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvj {
    static {
        zzrt zzrtVarZzi = zzrv.zzi();
        zzrtVarZzi.zzf(-315576000000L);
        zzrtVarZzi.zze(-999999999);
        zzrt zzrtVarZzi2 = zzrv.zzi();
        zzrtVarZzi2.zzf(315576000000L);
        zzrtVarZzi2.zze(999999999);
        zzrt zzrtVarZzi3 = zzrv.zzi();
        zzrtVarZzi3.zzf(0L);
        zzrtVarZzi3.zze(0);
    }

    public static zzrv zza(long j) {
        int i = (int) (j % 1000000000);
        long jZza = j / 1000000000;
        if (i <= -1000000000 || i >= 1000000000) {
            jZza = zzps.zza(jZza, i / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            i %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        if (jZza > 0 && i < 0) {
            i += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            jZza--;
        }
        if (jZza < 0 && i > 0) {
            i -= 1000000000;
            jZza++;
        }
        zzrt zzrtVarZzi = zzrv.zzi();
        zzrtVarZzi.zzf(jZza);
        zzrtVarZzi.zze(i);
        zzrv zzrvVar = (zzrv) zzrtVarZzi.zzk();
        long jZzg = zzrvVar.zzg();
        int iZzf = zzrvVar.zzf();
        if (jZzg >= -315576000000L && jZzg <= 315576000000L && iZzf >= -999999999 && iZzf < 1000000000 && ((jZzg >= 0 && iZzf >= 0) || (jZzg <= 0 && iZzf <= 0))) {
            return zzrvVar;
        }
        hb5.a(zzmg.zza("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jZzg), Integer.valueOf(iZzf)));
        return null;
    }
}
