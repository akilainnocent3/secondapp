package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public enum zzbdh implements zzidv {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    private final int zzh;

    zzbdh(int i10) {
        this.zzh = i10;
    }

    public static zzbdh zzb(int i10) {
        if (i10 == 0) {
            return UNSUPPORTED;
        }
        if (i10 == 2) {
            return ARM7;
        }
        if (i10 == 999) {
            return UNKNOWN;
        }
        if (i10 == 4) {
            return X86;
        }
        if (i10 == 5) {
            return ARM64;
        }
        if (i10 == 6) {
            return X86_64;
        }
        if (i10 != 7) {
            return null;
        }
        return RISCV64;
    }

    public static zzidx zzc() {
        return zzbdg.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzidv
    public final int zza() {
        return this.zzh;
    }
}
