package defpackage;

import com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.stateholder.PreMatchSectionViewModel$collectPreMatchEventsState$2", f = "PreMatchSectionViewModel.kt", l = {987}, m = "invokeSuspend", v = 2)
public final class ck20 extends tje0 implements Function2<lk50<? extends List<? extends PreMatchSectionData>>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jk20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck20(jk20 jk20Var, v1b<? super ck20> v1bVar) {
        super(2, v1bVar);
        this.b = jk20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ck20(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends PreMatchSectionData>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ck20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<Boolean> ku90Var = this.b.N;
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (ku90Var.a.emit(bool, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
