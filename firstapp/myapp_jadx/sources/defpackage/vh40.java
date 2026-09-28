package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.RecentCodeViewKt$RecentCodeViewContent$4$7$1", f = "RecentCodeView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vh40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ytw<String> c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh40(ytw ytwVar, Context context, ytw ytwVar2, ytw ytwVar3, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = context;
        this.c = ytwVar2;
        this.d = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vh40(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vh40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        yh40.f(this.b, this.c, this.d, (jox) this.a.getValue());
        return Unit.a;
    }
}
