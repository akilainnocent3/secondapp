package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.anTesting.data.repository.ANTestingRepositoryImpl$sendConvertData$2", f = "ANTestingRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class a0 extends tje0 implements Function1<v1b<? super HTTPResponse<Unit>>, Object> {
    public int a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ Double v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, Integer num, String str, Integer num2, String str2, String str3, Double d, v1b<? super a0> v1bVar) {
        super(1, v1bVar);
        this.b = c0Var;
        this.c = num;
        this.d = str;
        this.e = num2;
        this.f = str2;
        this.i = str3;
        this.v = d;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new a0(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<Unit>> v1bVar) {
        return ((a0) create(v1bVar)).invokeSuspend(Unit.a);
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
        p pVar = this.b.a;
        this.a = 1;
        Object objA = pVar.a(this.c, this.d, this.e, this.f, this.i, this.v, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
