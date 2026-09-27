package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzwh extends zzwi {
    public zzwh(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.cast.zzwi
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.cast.zzwi
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.cast.zzwj.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Method inline failed with exception
    java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2
    	at java.base/java.util.ArrayList.shiftTailOverGap(ArrayList.java:831)
    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1782)
    	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1751)
    	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:139)
    	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:172)
    	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:137)
    	at jadx.core.dex.regions.conditions.IfCondition.replaceArg(IfCondition.java:270)
    	at jadx.core.dex.instructions.mods.TernaryInsn.replaceArg(TernaryInsn.java:67)
    	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:141)
    	at jadx.core.dex.visitors.InlineMethods.replaceRegs(InlineMethods.java:127)
    	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:86)
    	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:78)
    	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:50)
     */
    @Override // com.google.android.gms.internal.cast.zzwi
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzwj.zzb) {
            zzwj.zzD(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzwj.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwi
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzwj.zzb) {
            zzwj.zzD(obj, j10, b10);
        } else {
            zzwj.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzwi
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.cast.zzwi
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.cast.zzwi
    public final boolean zzg(Object obj, long j10) {
        return zzwj.zzb ? zzwj.zzt(obj, j10) : zzwj.zzu(obj, j10);
    }
}
