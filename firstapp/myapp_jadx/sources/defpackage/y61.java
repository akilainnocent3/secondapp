package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.widget.AutoBetContentKt$AutoBetContentRoute$1$1", f = "AutoBetContent.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y61 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fb1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y61(ytw ytwVar, Context context, fb1 fb1Var, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = context;
        this.c = fb1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y61(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y61) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.getValue() instanceof twb.f) {
            boolean zAreNotificationsEnabled = new t2y(this.b).b.areNotificationsEnabled();
            fb1 fb1Var = this.c;
            fb1Var.getClass();
            ej5.c(o8i0.d(fb1Var), fb1Var.a, null, new hb1(fb1Var, zAreNotificationsEnabled, null), 2);
        }
        return Unit.a;
    }
}
