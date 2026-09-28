package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzsh;
import com.google.android.recaptcha.internal.zzsn;
import com.google.protobuf.Reader;
import defpackage.fm20;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.jk40;
import defpackage.rzk;
import defpackage.vpl0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzsn<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzsh<MessageType, BuilderType>> extends zzpw<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzuw zzc = zzuw.zzc();

    public static zzst zzA() {
        return zzth.zzf();
    }

    public static zzsu zzB() {
        return zzud.zze();
    }

    public static zzsu zzC(zzsu zzsuVar) {
        int size = zzsuVar.size();
        return zzsuVar.zzd(size + size);
    }

    public static Object zzE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            jk40.a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            jk40.a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static Object zzF(zzts zztsVar, String str, Object[] objArr) {
        return new zzue(zztsVar, str, objArr);
    }

    public static void zzI(Class cls, zzsn zzsnVar) {
        zzsnVar.zzH();
        zzb.put(cls, zzsnVar);
    }

    private final int zzf(zzug zzugVar) {
        return zzuc.zza().zzb(getClass()).zza(this);
    }

    private static zzsn zzg(zzsn zzsnVar) throws zzsx {
        if (zzsnVar == null || zzj(zzsnVar, true)) {
            return zzsnVar;
        }
        throw new zzuu(zzsnVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzsn zzi(zzsn zzsnVar, byte[] bArr, int i, int i2, zzry zzryVar) throws zzsx {
        if (i2 == 0) {
            return zzsnVar;
        }
        zzsn zzsnVarZzv = zzsnVar.zzv();
        try {
            zzug zzugVarZzb = zzuc.zza().zzb(zzsnVarZzv.getClass());
            zzugVarZzb.zzi(zzsnVarZzv, bArr, 0, i2, new zzqb(zzryVar));
            zzugVarZzb.zzf(zzsnVarZzv);
            return zzsnVarZzv;
        } catch (zzsx e) {
            if (e.zzb()) {
                throw new zzsx(e);
            }
            throw e;
        } catch (zzuu e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzsx) {
                throw ((zzsx) e3.getCause());
            }
            throw new zzsx(e3);
        } catch (IndexOutOfBoundsException unused) {
            vpl0.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzj(zzsn zzsnVar, boolean z) {
        byte bByteValue = ((Byte) zzsnVar.zzh(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzuc.zza().zzb(zzsnVar.getClass()).zzl(zzsnVar);
        if (z) {
            zzsnVar.zzh(2, true != zZzl ? null : zzsnVar, null);
        }
        return zZzl;
    }

    public static zzsm zzs(zzts zztsVar, Object obj, zzts zztsVar2, zzsq zzsqVar, int i, zzvg zzvgVar, Class cls) {
        return new zzsm(zztsVar, "", null, new zzsl(null, i, zzvgVar, false, false), cls);
    }

    public static zzsn zzu(Class cls) {
        Map map = zzb;
        zzsn zzsnVar = (zzsn) map.get(cls);
        if (zzsnVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzsnVar = (zzsn) map.get(cls);
            } catch (ClassNotFoundException e) {
                rzk.b("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzsnVar != null) {
            return zzsnVar;
        }
        zzsn zzsnVar2 = (zzsn) ((zzsn) zzvc.zze(cls)).zzh(6, null, null);
        if (zzsnVar2 != null) {
            map.put(cls, zzsnVar2);
            return zzsnVar2;
        }
        fm20.a();
        return null;
    }

    public static zzsn zzw(zzsn zzsnVar, InputStream inputStream) throws zzsx {
        zzqq zzqoVar;
        if (inputStream == null) {
            byte[] bArr = zzsv.zzb;
            int length = bArr.length;
            zzqoVar = zzqq.zzH(bArr, 0, 0, false);
        } else {
            zzqoVar = new zzqo(inputStream, 4096, null);
        }
        int i = zzry.zzb;
        int i2 = zzuc.zza;
        zzry zzryVar = zzry.zza;
        zzsn zzsnVarZzv = zzsnVar.zzv();
        try {
            zzug zzugVarZzb = zzuc.zza().zzb(zzsnVarZzv.getClass());
            zzugVarZzb.zzh(zzsnVarZzv, zzqr.zzq(zzqoVar), zzryVar);
            zzugVarZzb.zzf(zzsnVarZzv);
            zzg(zzsnVarZzv);
            return zzsnVarZzv;
        } catch (zzsx e) {
            if (e.zzb()) {
                throw new zzsx(e);
            }
            throw e;
        } catch (zzuu e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzsx) {
                throw ((zzsx) e3.getCause());
            }
            throw new zzsx(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzsx) {
                throw ((zzsx) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzsn zzx(zzsn zzsnVar, byte[] bArr) throws zzsx {
        int i = zzry.zzb;
        int i2 = zzuc.zza;
        zzsn zzsnVarZzi = zzi(zzsnVar, bArr, 0, bArr.length, zzry.zza);
        zzg(zzsnVarZzi);
        return zzsnVarZzi;
    }

    public static zzss zzy() {
        return zzso.zzf();
    }

    public static zzss zzz(zzss zzssVar) {
        int size = zzssVar.size();
        return zzssVar.zzd(size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzuc.zza().zzb(getClass()).zzk(this, (zzsn) obj);
    }

    public final int hashCode() {
        if (zzL()) {
            return zzn();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzn = zzn();
        this.zza = iZzn;
        return iZzn;
    }

    public final String toString() {
        return zztu.zza(this, super.toString());
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final zzua zzD() {
        return (zzua) zzh(7, null, null);
    }

    public final void zzG() {
        zzuc.zza().zzb(getClass()).zzf(this);
        zzH();
    }

    public final void zzH() {
        this.zzd &= Reader.READ_DONE;
    }

    public final void zzJ(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Reader.READ_DONE;
    }

    public final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzpw
    public final int zza(zzug zzugVar) {
        if (zzL()) {
            int iZza = zzugVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            ib5.a(hce0.a(iZza, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Reader.READ_DONE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzugVar.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        ib5.a(hce0.a(iZza2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final /* synthetic */ zztr zzaf() {
        return (zzsh) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final /* synthetic */ zztr zzag() {
        zzsh zzshVar = (zzsh) zzh(5, null, null);
        zzshVar.zzh(this);
        return zzshVar;
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final void zze(zzqv zzqvVar) {
        zzuc.zza().zzb(getClass()).zzj(this, zzqw.zza(zzqvVar));
    }

    public abstract Object zzh(int i, Object obj, Object obj2);

    @Override // com.google.android.recaptcha.internal.zztt
    public final /* synthetic */ zzts zzm() {
        return (zzsn) zzh(6, null, null);
    }

    public final int zzn() {
        return zzuc.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzts
    public final int zzo() {
        if (zzL()) {
            int iZzf = zzf(null);
            if (iZzf >= 0) {
                return iZzf;
            }
            ib5.a(hce0.a(iZzf, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Reader.READ_DONE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzf2 = zzf(null);
        if (iZzf2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf2;
            return iZzf2;
        }
        ib5.a(hce0.a(iZzf2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zztt
    public final boolean zzp() {
        return zzj(this, true);
    }

    public final zzsh zzq() {
        return (zzsh) zzh(5, null, null);
    }

    public final zzsh zzr() {
        zzsh zzshVar = (zzsh) zzh(5, null, null);
        zzshVar.zzh(this);
        return zzshVar;
    }

    public final zzsn zzv() {
        return (zzsn) zzh(4, null, null);
    }
}
