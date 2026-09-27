package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzfwq {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfwq(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfwq zza(@NonNull final Context context, @NonNull Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = zzfwq.zza;
                    taskCompletionSource.setResult(zzfym.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = zzfwq.zza;
                    taskCompletionSource.setResult(zzfym.zzc());
                }
            });
        }
        return new zzfwq(context, executor, taskCompletionSource.getTask(), z10);
    }

    public static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfwp.zza);
        }
        Context context = this.zzb;
        final zzawl zzawlVarZza = zzawp.zza();
        zzawlVarZza.zza(context.getPackageName());
        zzawlVarZza.zzb(j10);
        zzawlVarZza.zzg(zzf);
        if (exc != null) {
            int i11 = zzgtt.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzawlVarZza.zzc(stringWriter.toString());
            zzawlVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzawlVarZza.zze(str2);
        }
        if (str != null) {
            zzawlVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfwn
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i12 = zzfwq.zza;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i13 = i10;
                zzfyl zzfylVarZza = ((zzfym) task.getResult()).zza(((zzawp) zzawlVarZza.zzbu()).zzaN());
                zzfylVarZza.zzc(i13);
                zzfylVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final Task zzd(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }

    public Task zze(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzf(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }
}
