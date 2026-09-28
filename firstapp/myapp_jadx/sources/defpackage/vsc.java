package defpackage;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", l = {}, m = "invokeSuspend")
public final class vsc extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Long a;
    public final /* synthetic */ du5 b;
    public final /* synthetic */ jsc c;
    public final /* synthetic */ Locale d;
    public final /* synthetic */ ytw<ijf0> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsc(Long l, du5 du5Var, jsc jscVar, Locale locale, ytw<ijf0> ytwVar, v1b<? super vsc> v1bVar) {
        super(2, v1bVar);
        this.a = l;
        this.b = du5Var;
        this.c = jscVar;
        this.d = locale;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vsc(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vsc) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Long l = this.a;
        if (l != null) {
            String strA = this.b.a(l.longValue(), this.c.c, this.d);
            ijf0 ijf0Var = new ijf0(strA, strA.length() == 0 ? ulf0.b : vlf0.a(strA.length(), strA.length()), 4);
            umz umzVar = rsc.a;
            this.e.setValue(ijf0Var);
        }
        return Unit.a;
    }
}
