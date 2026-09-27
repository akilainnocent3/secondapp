package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzigu {
    public static final zzigu zza;
    public static final zzigu zzb;
    public static final zzigu zzc;
    public static final zzigu zzd;
    public static final zzigu zze;
    public static final zzigu zzf;
    public static final zzigu zzg;
    public static final zzigu zzh;
    public static final zzigu zzi;
    public static final zzigu zzj;
    public static final zzigu zzk;
    public static final zzigu zzl;
    public static final zzigu zzm;
    public static final zzigu zzn;
    public static final zzigu zzo;
    public static final zzigu zzp;
    public static final zzigu zzq;
    public static final zzigu zzr;
    private static final /* synthetic */ zzigu[] zzu;
    private final zzigv zzs;
    private final int zzt;

    static {
        zzigu zziguVar = new zzigu("DOUBLE", 0, zzigv.DOUBLE, 1);
        zza = zziguVar;
        zzigu zziguVar2 = new zzigu("FLOAT", 1, zzigv.FLOAT, 5);
        zzb = zziguVar2;
        zzigv zzigvVar = zzigv.LONG;
        zzigu zziguVar3 = new zzigu("INT64", 2, zzigvVar, 0);
        zzc = zziguVar3;
        zzigu zziguVar4 = new zzigu("UINT64", 3, zzigvVar, 0);
        zzd = zziguVar4;
        zzigv zzigvVar2 = zzigv.INT;
        zzigu zziguVar5 = new zzigu("INT32", 4, zzigvVar2, 0);
        zze = zziguVar5;
        zzigu zziguVar6 = new zzigu("FIXED64", 5, zzigvVar, 1);
        zzf = zziguVar6;
        zzigu zziguVar7 = new zzigu("FIXED32", 6, zzigvVar2, 5);
        zzg = zziguVar7;
        zzigu zziguVar8 = new zzigu("BOOL", 7, zzigv.BOOLEAN, 0);
        zzh = zziguVar8;
        zzigu zziguVar9 = new zzigu("STRING", 8, zzigv.STRING, 2);
        zzi = zziguVar9;
        zzigv zzigvVar3 = zzigv.MESSAGE;
        zzigu zziguVar10 = new zzigu("GROUP", 9, zzigvVar3, 3);
        zzj = zziguVar10;
        zzigu zziguVar11 = new zzigu("MESSAGE", 10, zzigvVar3, 2);
        zzk = zziguVar11;
        zzigu zziguVar12 = new zzigu("BYTES", 11, zzigv.BYTE_STRING, 2);
        zzl = zziguVar12;
        zzigu zziguVar13 = new zzigu("UINT32", 12, zzigvVar2, 0);
        zzm = zziguVar13;
        zzigu zziguVar14 = new zzigu("ENUM", 13, zzigv.ENUM, 0);
        zzn = zziguVar14;
        zzigu zziguVar15 = new zzigu("SFIXED32", 14, zzigvVar2, 5);
        zzo = zziguVar15;
        zzigu zziguVar16 = new zzigu("SFIXED64", 15, zzigvVar, 1);
        zzp = zziguVar16;
        zzigu zziguVar17 = new zzigu("SINT32", 16, zzigvVar2, 0);
        zzq = zziguVar17;
        zzigu zziguVar18 = new zzigu("SINT64", 17, zzigvVar, 0);
        zzr = zziguVar18;
        zzu = new zzigu[]{zziguVar, zziguVar2, zziguVar3, zziguVar4, zziguVar5, zziguVar6, zziguVar7, zziguVar8, zziguVar9, zziguVar10, zziguVar11, zziguVar12, zziguVar13, zziguVar14, zziguVar15, zziguVar16, zziguVar17, zziguVar18};
    }

    private zzigu(String str, int i10, zzigv zzigvVar, int i11) {
        super(str, i10);
        this.zzs = zzigvVar;
        this.zzt = i11;
    }

    public static zzigu[] values() {
        return (zzigu[]) zzu.clone();
    }

    public final zzigv zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
