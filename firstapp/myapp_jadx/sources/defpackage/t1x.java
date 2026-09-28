package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.MyFavoriteStake;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.plugin.myfavorite.model.MyStakeDataSource$fetch$1", f = "MyStakeDataSource.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class t1x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u1x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1x(u1x u1xVar, v1b<? super t1x> v1bVar) {
        super(2, v1bVar);
        this.c = u1xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t1x t1xVar = new t1x(this.c, v1bVar);
        t1xVar.b = obj;
        return t1xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t1x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        u1x u1xVar = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                xxz xxzVar = u1xVar.b;
                this.b = null;
                this.a = 1;
                obj = xxzVar.p(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = (MyFavoriteStake) ((BaseResponse) obj).data;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            MyFavoriteStake myFavoriteStake = (MyFavoriteStake) bVar;
            u1xVar.a.m(myFavoriteStake != null ? new nqc(myFavoriteStake) : new jqc());
        }
        if (zi50.a(bVar) != null) {
            u1xVar.a.m(new kqc());
        }
        return Unit.a;
    }
}
