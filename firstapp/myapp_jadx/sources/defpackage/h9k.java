package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetMyFavoriteStakeUseCase$defaultQuickStakesConfigFlow$1", f = "GetMyFavoriteStakeUseCase.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class h9k extends tje0 implements Function2<ez20<? super List<BigDecimal>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m9k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9k(m9k m9kVar, v1b<? super h9k> v1bVar) {
        super(2, v1bVar);
        this.c = m9kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h9k h9kVar = new h9k(this.c, v1bVar);
        h9kVar.b = obj;
        return h9kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super List<BigDecimal>> ez20Var, v1b<? super Unit> v1bVar) {
        return ((h9k) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final m9k m9kVar = this.c;
        nzm nzmVar = m9kVar.a;
        final ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            nzm.a aVar = new nzm.a() { // from class: f9k
                @Override // nzm.a
                public final void T() {
                    ez20Var.c(m9kVar.a.i());
                }
            };
            nzmVar.m(aVar);
            ez20Var.c(nzmVar.i());
            g9k g9kVar = new g9k(0, m9kVar, aVar);
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, g9kVar, this) == y5bVar) {
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
