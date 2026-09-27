package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzigo {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzign zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    static {
        boolean z10;
        boolean z11;
        zzign zzignVar;
        Unsafe unsafeZzs = zzs();
        zzc = unsafeZzs;
        int i10 = zzica.zza;
        zzd = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zZzt = zzt(cls);
        zze = zZzt;
        Class<?> cls2 = Integer.TYPE;
        boolean zZzt2 = zzt(cls2);
        zzign zziglVar = null;
        if (unsafeZzs != null) {
            if (zZzt) {
                zziglVar = new zzigm(unsafeZzs);
            } else if (zZzt2) {
                zziglVar = new zzigl(unsafeZzs);
            }
        }
        zzf = zziglVar;
        if (zziglVar == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls3 = zziglVar.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (zzD() == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                zzA(th2);
            }
        }
        zzg = z10;
        zzign zzignVar2 = zzf;
        if (zzignVar2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = zzignVar2.zza.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th3) {
                zzA(th3);
                z11 = false;
            }
        }
        zzh = z11;
        zza = zzB(byte[].class);
        zzB(boolean[].class);
        zzC(boolean[].class);
        zzB(int[].class);
        zzC(int[].class);
        zzB(long[].class);
        zzC(long[].class);
        zzB(float[].class);
        zzC(float[].class);
        zzB(double[].class);
        zzC(double[].class);
        zzB(Object[].class);
        zzC(Object[].class);
        Field fieldZzD = zzD();
        long jObjectFieldOffset = -1;
        if (fieldZzD != null && (zzignVar = zzf) != null) {
            jObjectFieldOffset = zzignVar.zza.objectFieldOffset(fieldZzD);
        }
        zzi = jObjectFieldOffset;
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzigo() {
    }

    public static /* synthetic */ void zzA(Throwable th2) {
        Logger.getLogger(zzigo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    private static int zzB(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzD() {
        int i10 = zzica.zza;
        Field fieldZzE = zzE(Buffer.class, "effectiveDirectAddress");
        if (fieldZzE != null) {
            return fieldZzE;
        }
        Field fieldZzE2 = zzE(Buffer.class, "address");
        if (fieldZzE2 == null || fieldZzE2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzE2;
    }

    private static Field zzE(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzF(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(255 << i10))));
    }

    public static boolean zza() {
        return zzh;
    }

    public static boolean zzb() {
        return zzg;
    }

    public static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int zzd(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    public static void zze(Object obj, long j10, int i10) {
        zzf.zza.putInt(obj, j10, i10);
    }

    public static long zzf(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    public static void zzg(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    public static boolean zzh(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    public static void zzi(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    public static float zzj(Object obj, long j10) {
        return zzf.zzd(obj, j10);
    }

    public static void zzk(Object obj, long j10, float f10) {
        zzf.zze(obj, j10, f10);
    }

    public static double zzl(Object obj, long j10) {
        return zzf.zzf(obj, j10);
    }

    public static void zzm(Object obj, long j10, double d10) {
        zzf.zzg(obj, j10, d10);
    }

    public static Object zzn(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    public static void zzo(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    public static void zzp(byte[] bArr, long j10, byte b10) {
        zzf.zza(bArr, zza + j10, b10);
    }

    public static byte zzq(long j10) {
        return zzf.zzh(j10);
    }

    public static long zzr(ByteBuffer byteBuffer) {
        zzign zzignVar = zzf;
        return zzignVar.zza.getLong(byteBuffer, zzi);
    }

    public static Unsafe zzs() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzigk());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zzigo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzt(Class cls) {
        int i10 = zzica.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean zzw(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean zzx(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
