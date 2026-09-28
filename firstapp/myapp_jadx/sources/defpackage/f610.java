package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.pingpong.remote.models.ProvablySettingRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.repositories.PingPongRepository$userSetting$2", f = "PingPongRepository.kt", l = {157}, m = "invokeSuspend", v = 1)
public final class f610 extends tje0 implements Function1<v1b<? super HTTPResponse<String>>, Object> {
    public int a;
    public final /* synthetic */ ProvablySettingRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f610(ProvablySettingRequest provablySettingRequest, v1b<? super f610> v1bVar) {
        super(1, v1bVar);
        this.b = provablySettingRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new f610(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<String>> v1bVar) {
        return ((f610) create(v1bVar)).invokeSuspend(Unit.a);
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
        q510 q510VarK = on0.k();
        this.a = 1;
        Object objE = q510VarK.e(this.b, this);
        return objE == y5bVar ? y5bVar : objE;
    }
}
