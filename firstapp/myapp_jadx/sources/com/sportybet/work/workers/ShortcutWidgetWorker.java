package com.sportybet.work.workers;

import android.content.Context;
import android.content.Intent;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.settings.shortcutwidget.SportyShortcutAppWidgetProvider;
import defpackage.b790;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.fse;
import defpackage.gku;
import defpackage.ib5;
import defpackage.myh;
import defpackage.pfd;
import defpackage.uf00;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.yzh;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sportybet/work/workers/ShortcutWidgetWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lb790;", "repository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lb790;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ShortcutWidgetWorker extends CoroutineWorker {
    public final Context g;
    public final WorkerParameters h;
    public final b790 i;

    @c0d(c = "com.sportybet.work.workers.ShortcutWidgetWorker", f = "ShortcutWidgetWorker.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "doWork", v = 2)
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
            return ShortcutWidgetWorker.this.c(this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ Intent b;

        public b(Intent intent) {
            this.b = intent;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            pfd pfdVar = fse.a;
            Object objD = ej5.d(gku.a, new com.sportybet.work.workers.a((uf00) obj, ShortcutWidgetWorker.this, this.b, null), v1bVar);
            return objD == y5b.a ? objD : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutWidgetWorker(Context context, WorkerParameters workerParameters, b790 b790Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        b790Var.getClass();
        this.g = context;
        this.h = workerParameters;
        this.i = b790Var;
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
        try {
            if (i2 == 0) {
                uj50.b(obj);
                c cVar = this.h.b;
                cVar.getClass();
                Object obj2 = cVar.a.get("appWidgetId");
                int iIntValue = ((Number) (obj2 instanceof Integer ? obj2 : 0)).intValue();
                Intent intent = new Intent(this.g, (Class<?>) SportyShortcutAppWidgetProvider.class);
                intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                intent.putExtra("appWidgetId", iIntValue);
                if (iIntValue == 0) {
                    return new d.a.C0078a();
                }
                yzh yzhVarA = this.i.a();
                b bVar = new b(intent);
                aVar.c = 1;
                if (yzhVarA.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return new d.a.c();
        } catch (Throwable unused) {
            return new d.a.C0078a();
        }
    }
}
