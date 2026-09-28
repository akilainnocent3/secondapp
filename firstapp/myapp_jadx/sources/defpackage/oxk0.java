package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class oxk0 implements fyk0 {
    public final /* synthetic */ yis a;
    public final /* synthetic */ TaskCompletionSource b;

    public oxk0(yis yisVar, TaskCompletionSource taskCompletionSource) {
        this.a = yisVar;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.fyk0
    public final void a(yis yisVar) {
        throw new IllegalStateException();
    }

    @Override // defpackage.fyk0
    public final yis zza() {
        return this.a;
    }

    @Override // defpackage.fyk0
    public final void zzc() {
        this.b.trySetResult(null);
    }
}
