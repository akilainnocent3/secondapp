package com.sportybet.work.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.lhb0;
import defpackage.mhb0;
import defpackage.ohb0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.wjk;
import defpackage.x1b;
import defpackage.y5b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sportybet/work/workers/SportyBetAPICacheWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Llhb0;", "Lwjk;", "repository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Llhb0;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyBetAPICacheWorker extends CoroutineWorker {
    public final lhb0<wjk> g;

    @c0d(c = "com.sportybet.work.workers.SportyBetAPICacheWorker", f = "SportyBetAPICacheWorker.kt", l = {20}, m = "doWork", v = 2)
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
            return SportyBetAPICacheWorker.this.c(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportyBetAPICacheWorker(Context context, WorkerParameters workerParameters, lhb0<wjk> lhb0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        lhb0Var.getClass();
        this.g = lhb0Var;
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
        Object obj2 = y5b.a;
        int i2 = aVar.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                lhb0<wjk> lhb0Var = this.g;
                aVar.c = 1;
                ohb0 ohb0Var = (ohb0) lhb0Var;
                Object objD = ej5.d(ohb0Var.c, new mhb0(ohb0Var, null), aVar);
                if (objD != obj2) {
                    objD = Unit.a;
                }
                if (objD == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return new d.a.c();
        } catch (IOException unused) {
            return new d.a.C0078a();
        }
    }
}
