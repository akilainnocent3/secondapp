package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.antest.AnTestApiTesterViewModel$testCampaign$1", f = "AnTestApiTesterViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class xx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yx b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(yx yxVar, String str, String str2, v1b<? super xx> v1bVar) {
        super(2, v1bVar);
        this.b = yxVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xx(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        yx yxVar = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = yxVar.f;
                Boolean bool = Boolean.TRUE;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                dy dyVar = yxVar.a;
                String str = this.c;
                String str2 = this.d;
                this.a = 1;
                obj = dyVar.a(str, str2, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            g46 g46Var = (g46) obj;
            wwd0 wwd0Var2 = yxVar.v;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, CollectionsKt.i0((List) value, a.c(g46Var))));
            wwd0 wwd0Var3 = yxVar.f;
            Boolean bool2 = Boolean.FALSE;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool2);
            return Unit.a;
        } catch (Throwable th) {
            wwd0 wwd0Var4 = yxVar.f;
            Boolean bool3 = Boolean.FALSE;
            wwd0Var4.getClass();
            wwd0Var4.k(null, bool3);
            throw th;
        }
    }
}
