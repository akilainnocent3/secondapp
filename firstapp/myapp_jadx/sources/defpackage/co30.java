package defpackage;

import android.content.Context;
import com.sportygames.refscall.data.dto.RCUserInfoDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$userInfoFlow$2", f = "RCFetchInitDataUseCaseImpl.kt", l = {123}, m = "invokeSuspend", v = 1)
public final class co30 extends tje0 implements Function2<RCUserInfoDTO, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zn30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co30(zn30 zn30Var, v1b<? super co30> v1bVar) {
        super(2, v1bVar);
        this.c = zn30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        co30 co30Var = new co30(this.c, v1bVar);
        co30Var.b = obj;
        return co30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RCUserInfoDTO rCUserInfoDTO, v1b<? super Unit> v1bVar) {
        return ((co30) create(rCUserInfoDTO, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        RCUserInfoDTO rCUserInfoDTO = (RCUserInfoDTO) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                Context context = this.c.f;
                zi50.a aVar = zi50.b;
                String avatarUrl = rCUserInfoDTO.getAvatarUrl();
                if (avatarUrl != null) {
                    nan.a aVar2 = new nan.a(context);
                    aVar2.c = avatarUrl;
                    abn.a(aVar2, false);
                    wr5 wr5Var = wr5.c;
                    aVar2.l = wr5Var;
                    aVar2.m = wr5Var;
                    nan nanVarA = aVar2.a();
                    m9n m9nVarA = qw90.a(context);
                    this.b = null;
                    this.a = 1;
                    if (m9nVarA.b(nanVarA, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            zi50.a aVar3 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar4 = zi50.b;
        }
        return Unit.a;
    }
}
