package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgcc {
    public static nj.t1 zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzgca zzgcaVar = new zzgca(task, null);
        task.addOnCompleteListener(zzhbz.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzgcb
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzgca zzgcaVar2 = zzgcaVar;
                if (task2.isCanceled()) {
                    zzgcaVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzgcaVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzgcaVar2.zzb(exception);
            }
        });
        return zzgcaVar;
    }
}
