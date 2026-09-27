package com.google.android.gms.flags;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
@Deprecated
public abstract class Flag<T> {
    private final int zza;
    private final String zzb;
    private final T zzc;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public static class BooleanFlag extends Flag<Boolean> {
        public BooleanFlag(int i10, @NonNull String str, @NonNull Boolean bool) {
            super(i10, str, bool, null);
        }

        @Override // com.google.android.gms.flags.Flag
        public final /* bridge */ /* synthetic */ Boolean zza(zze zzeVar) {
            try {
                return Boolean.valueOf(zzeVar.getBooleanFlagValue(zzd(), zzc().booleanValue(), zzb()));
            } catch (RemoteException unused) {
                return zzc();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    @KeepForSdk
    public static class IntegerFlag extends Flag<Integer> {
        public IntegerFlag(int i10, @NonNull String str, @NonNull Integer num) {
            super(i10, str, num, null);
        }

        @Override // com.google.android.gms.flags.Flag
        public final /* bridge */ /* synthetic */ Integer zza(zze zzeVar) {
            try {
                return Integer.valueOf(zzeVar.getIntFlagValue(zzd(), zzc().intValue(), zzb()));
            } catch (RemoteException unused) {
                return zzc();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    @KeepForSdk
    public static class LongFlag extends Flag<Long> {
        public LongFlag(int i10, @NonNull String str, @NonNull Long l10) {
            super(i10, str, l10, null);
        }

        @Override // com.google.android.gms.flags.Flag
        public final /* bridge */ /* synthetic */ Long zza(zze zzeVar) {
            try {
                return Long.valueOf(zzeVar.getLongFlagValue(zzd(), zzc().longValue(), zzb()));
            } catch (RemoteException unused) {
                return zzc();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    @KeepForSdk
    public static class StringFlag extends Flag<String> {
        public StringFlag(int i10, @NonNull String str, @NonNull String str2) {
            super(i10, str, str2, null);
        }

        @Override // com.google.android.gms.flags.Flag
        public final /* bridge */ /* synthetic */ String zza(zze zzeVar) {
            try {
                return zzeVar.getStringFlagValue(zzd(), zzc(), zzb());
            } catch (RemoteException unused) {
                return zzc();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Flag(int i10, String str, Object obj, zza zzaVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        Singletons.flagRegistry().zza(this);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static IntegerFlag define(int i10, @NonNull String str, int i11) {
        return new IntegerFlag(i10, str, Integer.valueOf(i11));
    }

    @NonNull
    @KeepForSdk
    public T get() {
        return (T) Singletons.zza().zza(this);
    }

    public abstract T zza(zze zzeVar);

    @Deprecated
    public final int zzb() {
        return this.zza;
    }

    @NonNull
    public final T zzc() {
        return this.zzc;
    }

    @NonNull
    public final String zzd() {
        return this.zzb;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static LongFlag define(int i10, @NonNull String str, long j10) {
        return new LongFlag(i10, str, Long.valueOf(j10));
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static BooleanFlag define(int i10, @NonNull String str, @NonNull Boolean bool) {
        return new BooleanFlag(i10, str, bool);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static StringFlag define(int i10, @NonNull String str, @NonNull String str2) {
        return new StringFlag(i10, str, str2);
    }
}
