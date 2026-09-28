package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class btk0 implements z550, fyk0 {
    public yis a;
    public boolean b = true;
    public final /* synthetic */ htk0 c;

    public btk0(htk0 htk0Var, yis yisVar) {
        this.c = htk0Var;
        this.a = yisVar;
    }

    @Override // defpackage.fyk0
    public final synchronized void a(yis yisVar) {
        yis yisVar2 = this.a;
        if (yisVar2 != yisVar) {
            yisVar2.b = null;
            yisVar2.c = null;
            this.a = yisVar;
        }
    }

    @Override // defpackage.z550
    public final void accept(Object obj, Object obj2) {
        yis.a aVar;
        boolean z;
        wyk0 wyk0Var = (wyk0) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            aVar = this.a.c;
            z = this.b;
            yis yisVar = this.a;
            yisVar.b = null;
            yisVar.c = null;
        }
        if (aVar == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            wyk0Var.F(aVar, z, taskCompletionSource);
        }
    }

    @Override // defpackage.fyk0
    public final synchronized yis zza() {
        return this.a;
    }

    @Override // defpackage.fyk0
    public final void zzc() {
        yis.a<?> aVar;
        synchronized (this) {
            this.b = false;
            aVar = this.a.c;
        }
        if (aVar != null) {
            this.c.b(aVar, 2441);
        }
    }
}
