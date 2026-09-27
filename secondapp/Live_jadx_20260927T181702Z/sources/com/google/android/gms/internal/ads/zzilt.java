package com.google.android.gms.internal.ads;

import com.ironsource.C4235d4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzilt implements Iterator, Closeable, zzauj {
    private static final zzaui zza = new zzils("eof ");
    protected zzauf zzb;
    protected zzilu zzc;
    zzaui zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzima.zzb(zzilt.class);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaui zzauiVar = this.zzd;
        if (zzauiVar == zza) {
            return false;
        }
        if (zzauiVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(C4235d4.j.f61460d);
        int i10 = 0;
        while (true) {
            List list = this.zzg;
            if (i10 >= list.size()) {
                sb2.append(C4235d4.j.f61462e);
                return sb2.toString();
            }
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzaui) list.get(i10)).toString());
            i10++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzilz(this.zzg, this);
    }

    public final void zzd(zzilu zziluVar, long j10, zzauf zzaufVar) throws IOException {
        this.zzc = zziluVar;
        this.zze = zziluVar.zzc();
        zziluVar.zzd(zziluVar.zzc() + j10);
        this.zzf = zziluVar.zzc();
        this.zzb = zzaufVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzaui next() {
        zzaui zzauiVarZzb;
        zzaui zzauiVar = this.zzd;
        if (zzauiVar != null && zzauiVar != zza) {
            this.zzd = null;
            return zzauiVar;
        }
        zzilu zziluVar = this.zzc;
        if (zziluVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zziluVar) {
                this.zzc.zzd(this.zze);
                zzauiVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzauiVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() throws IOException {
    }
}
