package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$bindEmail$2", f = "PatronRepositoryImpl.kt", l = {726}, m = "invokeSuspend", v = 2)
public final class oyz extends tje0 implements Function2<v5b, v1b<? super BaseResponse<String>>, Object> {
    public int a;
    public final /* synthetic */ nyz b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyz(nyz nyzVar, String str, String str2, String str3, v1b<? super oyz> v1bVar) {
        super(2, v1bVar);
        this.b = nyzVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oyz(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BaseResponse<String>> v1bVar) {
        return ((oyz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        xxz xxzVar = this.b.a;
        this.a = 1;
        Object objS0 = xxzVar.s0(this.c, this.d, this.e, this);
        return objS0 == y5bVar ? y5bVar : objS0;
    }
}
