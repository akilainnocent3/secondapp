package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzasx implements Comparable {
    private final zzati zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;

    @Nullable
    @k.a0("mLock")
    private final zzatb zzf;
    private Integer zzg;
    private zzata zzh;

    @k.a0("mLock")
    private boolean zzi;

    @Nullable
    private zzasg zzj;

    @k.a0("mLock")
    private zzasw zzk;
    private final zzasl zzl;

    public zzasx(int i10, String str, @Nullable zzatb zzatbVar) {
        Uri uri;
        String host;
        this.zza = zzati.zza ? new zzati() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzatbVar;
        this.zzl = new zzasl();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzasx) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(length + 5 + strConcat.length() + 8 + length2);
        sb2.append("[ ] ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzati.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzd(String str) {
        zzata zzataVar = this.zzh;
        if (zzataVar != null) {
            zzataVar.zzc(this);
        }
        if (zzati.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzasv(this, str, id2));
                return;
            }
            zzati zzatiVar = this.zza;
            zzatiVar.zza(str, id2);
            zzatiVar.zzb(toString());
        }
    }

    public final void zze(int i10) {
        zzata zzataVar = this.zzh;
        if (zzataVar != null) {
            zzataVar.zzd(this, i10);
        }
    }

    public final zzasx zzf(zzata zzataVar) {
        this.zzh = zzataVar;
        return this;
    }

    public final zzasx zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i10 = this.zzb;
        String str = this.zzc;
        if (i10 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb2.append(string);
        sb2.append(TokenBuilder.TOKEN_DELIMITER);
        sb2.append(str);
        return sb2.toString();
    }

    public final zzasx zzj(zzasg zzasgVar) {
        this.zzj = zzasgVar;
        return this;
    }

    @Nullable
    public final zzasg zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzasf {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws zzasf {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public abstract zzatd zzr(zzast zzastVar);

    public abstract void zzs(Object obj);

    public final void zzt(zzatg zzatgVar) {
        zzatb zzatbVar;
        synchronized (this.zze) {
            zzatbVar = this.zzf;
        }
        zzatbVar.zza(zzatgVar);
    }

    public final void zzu(zzasw zzaswVar) {
        synchronized (this.zze) {
            this.zzk = zzaswVar;
        }
    }

    public final void zzv(zzatd zzatdVar) {
        zzasw zzaswVar;
        synchronized (this.zze) {
            zzaswVar = this.zzk;
        }
        if (zzaswVar != null) {
            zzaswVar.zza(this, zzatdVar);
        }
    }

    public final void zzw() {
        zzasw zzaswVar;
        synchronized (this.zze) {
            zzaswVar = this.zzk;
        }
        if (zzaswVar != null) {
            zzaswVar.zzb(this);
        }
    }

    public final /* synthetic */ zzati zzx() {
        return this.zza;
    }

    public final zzasl zzy() {
        return this.zzl;
    }
}
