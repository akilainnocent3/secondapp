package defpackage;

import com.sportybet.core.segmentation.HomeSegment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.domain.usecase.DetermineGiftNavigationUseCase$navigateBySegmentation$segment$1", f = "DetermineGiftNavigationUseCase.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class hbe extends tje0 implements Function2<v5b, v1b<? super HomeSegment>, Object> {
    public int a;
    public final /* synthetic */ fbe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbe(fbe fbeVar, v1b<? super hbe> v1bVar) {
        super(2, v1bVar);
        this.b = fbeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hbe(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super HomeSegment> v1bVar) {
        return ((hbe) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        f1i f1iVar = new f1i(this.b.a.a());
        this.a = 1;
        Object objA = s0i.a(f1iVar, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
