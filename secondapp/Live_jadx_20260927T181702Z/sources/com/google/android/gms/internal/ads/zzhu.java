package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhu extends zzhb implements zzic {
    private final boolean zza;
    private final int zzb;
    private final int zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final zzib zze;
    private final zzib zzf;

    @Nullable
    private zzhn zzg;

    @Nullable
    private HttpURLConnection zzh;

    @Nullable
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzhu(String str, int i10, int i11, boolean z10, boolean z11, zzib zzibVar, zzgsx zzgsxVar, boolean z12, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zza = z10;
        this.zze = zzibVar;
        this.zzf = new zzib();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    private final HttpURLConnection zzk(URL url, int i10, @Nullable byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        StringBuilder sb2;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 != 0) {
            sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append(TokenBuilder.TOKEN_DELIMITER);
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        } else if (j11 == -1) {
            string = null;
        } else {
            j10 = 0;
            sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append(TokenBuilder.TOKEN_DELIMITER);
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.zzd;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z10 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(false);
        int i11 = zzhn.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, @Nullable String str, zzhn zzhnVar) throws zzhy {
        if (str == null) {
            throw new zzhy("Null location redirect", zzhnVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzhy("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhnVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(gi.j.f86771d);
            throw new zzhy(sb2.toString(), zzhnVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new zzhy(e10, zzhnVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzef.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzhy {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            if (j10 != -1) {
                long j11 = j10 - this.zzm;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.zzi;
            String str = zzfk.zza;
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.zzm += (long) i12;
            zzh(i12);
            return i12;
        } catch (IOException e10) {
            zzhn zzhnVar = this.zzg;
            String str2 = zzfk.zza;
            throw zzhy.zza(e10, zzhnVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    @Override // com.google.android.gms.internal.ads.zzhj
    public final long zzb(zzhn zzhnVar) throws zzhy {
        zzhu zzhuVar;
        long j10;
        int i10;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j11;
        zzhu zzhuVar2 = this;
        zzhuVar2.zzg = zzhnVar;
        long j12 = 0;
        zzhuVar2.zzm = 0L;
        zzhuVar2.zzl = 0L;
        zzf(zzhnVar);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            URL url = new URL(zzhnVar.zza.toString());
            long j13 = zzhnVar.zze;
            long j14 = zzhnVar.zzf;
            boolean zZza = zzhnVar.zza(1);
            int i11 = 0;
            try {
                if (zzhuVar2.zza) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i11 + 1;
                        if (i11 > 20) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 20);
                            sb2.append("Too many redirects: ");
                            sb2.append(i13);
                            throw new zzhy(new NoRouteToHostException(sb2.toString()), zzhnVar, 2001, 1);
                        }
                        j10 = j12;
                        i10 = i12;
                        zzhuVar2 = this;
                        HttpURLConnection httpURLConnectionZzk2 = zzhuVar2.zzk(url, 1, null, j13, j14, zZza, false, zzhnVar.zzd);
                        URL url2 = url;
                        long j15 = j14;
                        zzhuVar = zzhuVar2;
                        try {
                            int responseCode = httpURLConnectionZzk2.getResponseCode();
                            String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnectionZzk = httpURLConnectionZzk2;
                                break;
                            }
                            httpURLConnectionZzk2.disconnect();
                            URL urlZzl = zzhuVar.zzl(url2, headerField, zzhnVar);
                            j14 = j15;
                            url = urlZzl;
                            i12 = i10;
                            i11 = i13;
                            j12 = j10;
                        } catch (IOException e10) {
                            e = e10;
                        }
                        zzhuVar.zzm();
                        throw zzhy.zza(e, zzhnVar, 1);
                    }
                }
                httpURLConnectionZzk = zzhuVar2.zzk(url, 1, null, j13, j14, zZza, true, zzhnVar.zzd);
                zzhuVar = this;
                j10 = 0;
                i10 = 0;
                zzhuVar.zzh = httpURLConnectionZzk;
                zzhuVar.zzk = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i14 = zzhuVar.zzk;
                if (i14 < 200 || i14 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (zzhuVar.zzk == 416) {
                        if (zzhnVar.zze == zzid.zza(httpURLConnectionZzk.getHeaderField(kj.d.f102466f0))) {
                            zzhuVar.zzj = true;
                            zzg(zzhnVar);
                            long j16 = zzhnVar.zzf;
                            return j16 != -1 ? j16 : j10;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzgyz.zza(errorStream) : zzfk.zzb;
                    } catch (IOException unused) {
                        bArrZza = zzfk.zzb;
                    }
                    zzhuVar.zzm();
                    throw new zzia(zzhuVar.zzk, responseMessage, zzhuVar.zzk == 416 ? new zzhk(2008) : null, headerFields, zzhnVar, bArrZza);
                }
                httpURLConnectionZzk.getContentType();
                if (zzhuVar.zzk == 200) {
                    j11 = zzhnVar.zze;
                    if (j11 == j10) {
                        j11 = j10;
                    }
                } else {
                    j11 = j10;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    zzhuVar.zzl = zzhnVar.zzf;
                } else {
                    long j17 = zzhnVar.zzf;
                    if (j17 != -1) {
                        zzhuVar.zzl = j17;
                    } else {
                        long jZzb = zzid.zzb(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField(kj.d.f102466f0));
                        zzhuVar.zzl = jZzb != -1 ? jZzb - j11 : -1L;
                    }
                }
                try {
                    zzhuVar.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        zzhuVar.zzi = new GZIPInputStream(zzhuVar.zzi);
                    }
                    zzhuVar.zzj = true;
                    zzg(zzhnVar);
                    if (j11 != j10) {
                        try {
                            byte[] bArr = new byte[4096];
                            while (j11 > j10) {
                                int iMin = (int) Math.min(j11, 4096L);
                                InputStream inputStream = zzhuVar.zzi;
                                String str = zzfk.zza;
                                int i15 = inputStream.read(bArr, i10, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhy(new InterruptedIOException(), zzhnVar, 2000, 1);
                                }
                                if (i15 == -1) {
                                    throw new zzhy(zzhnVar, 2008, 1);
                                }
                                j11 -= (long) i15;
                                zzhuVar.zzh(i15);
                            }
                        } catch (IOException e11) {
                            zzhuVar.zzm();
                            if (e11 instanceof zzhy) {
                                throw ((zzhy) e11);
                            }
                            throw new zzhy(e11, zzhnVar, 2000, 1);
                        }
                    }
                    return zzhuVar.zzl;
                } catch (IOException e12) {
                    zzhuVar.zzm();
                    throw new zzhy(e12, zzhnVar, 2000, 1);
                }
            } catch (IOException e13) {
                e = e13;
                zzhuVar = this;
            }
        } catch (IOException e14) {
            e = e14;
            zzhuVar = zzhuVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhn zzhnVar = this.zzg;
        if (zzhnVar != null) {
            return zzhnVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() throws zzhy {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    zzhn zzhnVar = this.zzg;
                    String str = zzfk.zza;
                    throw new zzhy(e10, zzhnVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th2) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhj
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgwc.zza() : new zzht(httpURLConnection.getHeaderFields());
    }
}
