package com.sportybet.android.cms;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.x1b;
import defpackage.xp5;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sportybet/android/cms/UpdateCMSWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lxp5;", "cmsUpdateUseCase", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxp5;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UpdateCMSWorker extends CoroutineWorker {
    public final xp5 g;

    @c0d(c = "com.sportybet.android.cms.UpdateCMSWorker", f = "UpdateCMSWorker.kt", l = {18}, m = "doWork", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return UpdateCMSWorker.this.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCMSWorker(Context context, WorkerParameters workerParameters, xp5 xp5Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xp5Var.getClass();
        this.g = xp5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(v1b<? super d.a> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            aVar.c = 1;
            if (this.g.b(aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            Object obj2 = ((zi50) obj).a;
        }
        return new d.a.c();
    }
}
