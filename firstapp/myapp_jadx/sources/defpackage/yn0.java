package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.vip.data.LastHeroStandingListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.repository.ApiRepository$getLastHeroStandingList$2", f = "ApiRepository.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class yn0 extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends LastHeroStandingListResponse>>>, Object> {
    public int a;
    public final /* synthetic */ jo0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(jo0 jo0Var, String str, v1b<? super yn0> v1bVar) {
        super(1, v1bVar);
        this.b = jo0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new yn0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends LastHeroStandingListResponse>>> v1bVar) {
        return ((yn0) create(v1bVar)).invokeSuspend(Unit.a);
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
        zbi0 zbi0Var = this.b.b;
        this.a = 1;
        Object objA = zbi0Var.a(this.c, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
