package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.Y1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzatu {
    @Nullable
    public static zzasg zza(zzast zzastVar) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzastVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals(jl.c.f100615u) || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb2 = str3 != null ? zzb(str3) : j10;
        String str4 = (String) map.get(kj.d.f102507r0);
        long jZzb3 = str4 != null ? zzb(str4) : j10;
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            long j15 = (j12 * 1000) + jCurrentTimeMillis;
            if (z10) {
                j14 = j15;
            } else {
                Long.signum(j11);
                j14 = (j11 * 1000) + j15;
            }
            j13 = j15;
        } else {
            j13 = (jZzb <= j10 || jZzb2 < jZzb) ? j10 : (jZzb2 - jZzb) + jCurrentTimeMillis;
            j14 = j13;
        }
        zzasg zzasgVar = new zzasg();
        zzasgVar.zza = zzastVar.zzb;
        zzasgVar.zzb = str5;
        zzasgVar.zzf = j13;
        zzasgVar.zze = j14;
        zzasgVar.zzc = jZzb;
        zzasgVar.zzd = jZzb3;
        zzasgVar.zzg = map;
        zzasgVar.zzh = zzastVar.zzd;
        return zzasgVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || Y1.f60333f.equals(str)) {
                zzatj.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzatj.zzd(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String zzc(long j10) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
