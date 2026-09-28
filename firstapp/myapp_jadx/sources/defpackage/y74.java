package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.biometric.BioAuthVerificationResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.biomeric.BioAuthRepositoryImpl$verifyBioAuth$2", f = "BioAuthRepositoryImpl.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class y74 extends tje0 implements Function2<v5b, v1b<? super BaseResponse<BioAuthVerificationResponse>>, Object> {
    public int a;
    public final /* synthetic */ x74 b;
    public final /* synthetic */ j6c c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y74(x74 x74Var, j6c j6cVar, String str, String str2, String str3, String str4, v1b<? super y74> v1bVar) {
        super(2, v1bVar);
        this.b = x74Var;
        this.c = j6cVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.i = str4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y74(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BaseResponse<BioAuthVerificationResponse>> v1bVar) {
        return ((y74) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        h64 h64Var = this.b.a;
        String str = this.c.a;
        this.a = 1;
        Object objD = h64Var.d(this.d, this.e, this.f, this.i, str, this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
