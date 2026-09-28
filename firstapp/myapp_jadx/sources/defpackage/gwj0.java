package defpackage;

import androidx.work.impl.WorkDatabase_Impl;

/* JADX INFO: loaded from: classes.dex */
public final class gwj0 implements cwj0 {
    public final WorkDatabase_Impl a;
    public final ewj0 b;
    public final fwj0 c;

    public gwj0(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        new dwj0(workDatabase_Impl);
        this.b = new ewj0(workDatabase_Impl);
        this.c = new fwj0(workDatabase_Impl);
    }

    @Override // defpackage.cwj0
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        ewj0 ewj0Var = this.b;
        bge0 bge0VarA = ewj0Var.a();
        bge0VarA.C0(1, str);
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                ewj0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            ewj0Var.c(bge0VarA);
            throw th2;
        }
    }

    @Override // defpackage.cwj0
    public final void b() {
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        fwj0 fwj0Var = this.c;
        bge0 bge0VarA = fwj0Var.a();
        try {
            workDatabase_Impl.c();
            try {
                bge0VarA.D();
                workDatabase_Impl.v();
                workDatabase_Impl.r();
                fwj0Var.c(bge0VarA);
            } catch (Throwable th) {
                workDatabase_Impl.r();
                throw th;
            }
        } catch (Throwable th2) {
            fwj0Var.c(bge0VarA);
            throw th2;
        }
    }
}
