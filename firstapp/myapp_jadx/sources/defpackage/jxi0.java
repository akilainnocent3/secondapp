package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.AddFavouriteRequest;
import com.sportygames.lobby.remote.models.AddFavouriteResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.repositories.WalletRepository$addFavourite$2", f = "WalletRepository.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class jxi0 extends tje0 implements Function1<v1b<? super HTTPResponse<AddFavouriteResponse>>, Object> {
    public int a;
    public final /* synthetic */ AddFavouriteRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxi0(AddFavouriteRequest addFavouriteRequest, v1b<? super jxi0> v1bVar) {
        super(1, v1bVar);
        this.b = addFavouriteRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new jxi0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<AddFavouriteResponse>> v1bVar) {
        return ((jxi0) create(v1bVar)).invokeSuspend(Unit.a);
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
        cxi0 cxi0VarH = on0.h();
        this.a = 1;
        Object objF = cxi0VarH.f(this.b, this);
        return objF == y5bVar ? y5bVar : objF;
    }
}
