package com.google.android.gms.internal.cast;

import android.animation.Animator;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeg extends zzee {
    protected final Animator zza;
    private int zzc;
    private final zzek zzd = new zzef(this);
    private final int zzb = -1;

    private zzeg(Animator animator, int i10, @Nullable Runnable runnable) {
        this.zza = animator;
    }

    public static void zzd(Animator animator, int i10, @Nullable Runnable runnable) {
        animator.addListener(new zzeg(animator, -1, null));
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzeg zzegVar) {
        return zzegVar.zzb != -1 && zzegVar.zzc >= 0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (zza(animator)) {
            return;
        }
        zzen.zzb().zza(this.zzd);
    }
}
