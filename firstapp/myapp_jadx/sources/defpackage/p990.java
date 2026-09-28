package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.domain.ShowFeatureGuideUseCase$setShouldShowGuide$2", f = "ShowFeatureGuideUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class p990 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r990 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p990(r990 r990Var, v1b v1bVar) {
        super(2, v1bVar);
        b990.a[] aVarArr = b990.a.a;
        this.b = r990Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b990.a[] aVarArr = b990.a.a;
        return new p990(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p990) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = this.b.a;
            b990.a[] aVarArr = b990.a.a;
            Boolean bool = Boolean.FALSE;
            this.a = 1;
            if (m2lVar.a.putBoolean("key-should-show-review-our-app-guide", bool, this) == y5bVar) {
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
