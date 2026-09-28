package com.sportybet.work.workers;

import android.content.Intent;
import com.sportybet.feature.settings.shortcutwidget.SportyShortcutAppWidgetProvider;
import defpackage.c0d;
import defpackage.tje0;
import defpackage.uf00;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.x590;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.work.workers.ShortcutWidgetWorker$doWork$2$1", f = "ShortcutWidgetWorker.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ uf00<x590> a;
    public final /* synthetic */ ShortcutWidgetWorker b;
    public final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(uf00<? extends x590> uf00Var, ShortcutWidgetWorker shortcutWidgetWorker, Intent intent, v1b<? super a> v1bVar) {
        super(2, v1bVar);
        this.a = uf00Var;
        this.b = shortcutWidgetWorker;
        this.c = intent;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        uf00<? extends x590> uf00Var = SportyShortcutAppWidgetProvider.e;
        uf00<x590> uf00Var2 = this.a;
        uf00Var2.getClass();
        SportyShortcutAppWidgetProvider.e = uf00Var2;
        this.b.g.sendBroadcast(this.c);
        return Unit.a;
    }
}
