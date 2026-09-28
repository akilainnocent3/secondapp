package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.repositories.AnTestRepository$sendConvertData$result$1", f = "AnTestRepository.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class dz extends tje0 implements Function1<v1b<? super HTTPResponse<Unit>>, Object> {
    public int a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Double i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(Integer num, String str, Integer num2, String str2, String str3, Double d, v1b<? super dz> v1bVar) {
        super(1, v1bVar);
        this.b = num;
        this.c = str;
        this.d = num2;
        this.e = str2;
        this.f = str3;
        this.i = d;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new dz(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<Unit>> v1bVar) {
        return ((dz) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        p pVarC = on0.c();
        this.a = 1;
        Object objA = pVarC.a(this.b, this.c, this.d, this.e, this.f, this.i, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
