package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
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
public final class zziei {
    public static final zziei zza;
    public static final zziei zzb;
    public static final zziei zzc;
    public static final zziei zzd;
    public static final zziei zze;
    public static final zziei zzf;
    public static final zziei zzg;
    public static final zziei zzh;
    public static final zziei zzi;
    public static final zziei zzj;
    private static final /* synthetic */ zziei[] zzl;
    private final Class zzk;

    static {
        zziei zzieiVar = new zziei("VOID", 0, Void.class, Void.class, null);
        zza = zzieiVar;
        Class cls = Integer.TYPE;
        zziei zzieiVar2 = new zziei("INT", 1, cls, Integer.class, 0);
        zzb = zzieiVar2;
        zziei zzieiVar3 = new zziei("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzieiVar3;
        zziei zzieiVar4 = new zziei("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzieiVar4;
        zziei zzieiVar5 = new zziei("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzieiVar5;
        zziei zzieiVar6 = new zziei("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzieiVar6;
        zziei zzieiVar7 = new zziei("STRING", 6, String.class, String.class, "");
        zzg = zzieiVar7;
        zziei zzieiVar8 = new zziei("BYTE_STRING", 7, zzicn.class, zzicn.class, zzicn.zza);
        zzh = zzieiVar8;
        zziei zzieiVar9 = new zziei("ENUM", 8, cls, Integer.class, null);
        zzi = zzieiVar9;
        zziei zzieiVar10 = new zziei("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzieiVar10;
        zzl = new zziei[]{zzieiVar, zzieiVar2, zzieiVar3, zzieiVar4, zzieiVar5, zzieiVar6, zzieiVar7, zzieiVar8, zzieiVar9, zzieiVar10};
    }

    private zziei(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.zzk = cls2;
    }

    public static zziei[] values() {
        return (zziei[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
