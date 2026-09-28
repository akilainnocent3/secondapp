package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$changePassword$2$1", f = "PatronRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class syz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ nyz a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syz(nyz nyzVar, String str, String str2, v1b<? super syz> v1bVar) {
        super(2, v1bVar);
        this.a = nyzVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new syz(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((syz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws SprThrowable {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BaseResponse<String> baseResponse = this.a.a.V0(this.b, this.c).execute().b;
        if (baseResponse != null) {
            n52.c(baseResponse);
            return Unit.a;
        }
        ib5.a("Empty change-password response");
        return null;
    }
}
