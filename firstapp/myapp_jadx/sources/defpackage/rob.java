package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crashInitiated.model.response.WalletInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.repository.CrashInitiatedRepository$walletInfo$2", f = "CrashInitiatedRepository.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class rob extends tje0 implements Function1<v1b<? super HTTPResponse<WalletInfoResponse>>, Object> {
    public int a;
    public final /* synthetic */ sob b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rob(sob sobVar, v1b<? super rob> v1bVar) {
        super(1, v1bVar);
        this.b = sobVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new rob(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<WalletInfoResponse>> v1bVar) {
        return ((rob) create(v1bVar)).invokeSuspend(Unit.a);
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
        znb znbVarA = this.b.a.a();
        this.a = 1;
        Object objWalletInfo = znbVarA.walletInfo(this);
        return objWalletInfo == y5bVar ? y5bVar : objWalletInfo;
    }
}
