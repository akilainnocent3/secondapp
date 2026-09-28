package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.user.avatar.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$updateAvatar$1", f = "ChangeAvatarViewModel.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class k47 extends tje0 implements Function2<myh<? super BaseResponse<Void>>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k47(e eVar, String str, v1b<? super k47> v1bVar) {
        super(2, v1bVar);
        this.b = eVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k47(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<Void>> myhVar, v1b<? super Unit> v1bVar) {
        return ((k47) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            e eVar = this.b;
            mgb0 mgb0Var = eVar.w;
            String strA0 = StringsKt.a0(this.c, eVar.v.e(new String[0]));
            this.a = 1;
            if (mgb0Var.setLastAvatarUrl(strA0, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
