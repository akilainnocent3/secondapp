package defpackage;

import android.content.Context;
import com.sportygames.speedybingo.data.dto.SBUserInfoDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$userInfoFlow$2", f = "SBFetchDataUseCaseImpl.kt", l = {171}, m = "invokeSuspend", v = 1)
public final class rd60 extends tje0 implements Function2<SBUserInfoDTO, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ od60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd60(od60 od60Var, v1b<? super rd60> v1bVar) {
        super(2, v1bVar);
        this.c = od60Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rd60 rd60Var = new rd60(this.c, v1bVar);
        rd60Var.b = obj;
        return rd60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SBUserInfoDTO sBUserInfoDTO, v1b<? super Unit> v1bVar) {
        return ((rd60) create(sBUserInfoDTO, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        SBUserInfoDTO sBUserInfoDTO = (SBUserInfoDTO) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                od60 od60Var = this.c;
                zi50.a aVar = zi50.b;
                String avatar = sBUserInfoDTO.getAvatar();
                if (avatar != null) {
                    String str = od60Var.h + avatar;
                    Context context = od60Var.a;
                    nan.a aVar2 = new nan.a(context);
                    aVar2.c = str;
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
