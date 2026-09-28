package defpackage;

import com.sporty.android.core.model.loyalty.RewardShowOffConfig;
import com.sporty.android.core.model.loyalty.RewardShowOffData;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$special$$inlined$flatMapLatest$1", f = "FootballViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class gni extends tje0 implements gaj<myh<? super Pair<? extends kp7, ? extends RewardShowOffData>>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dni d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gni(v1b v1bVar, dni dniVar) {
        super(3, v1bVar);
        this.d = dniVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Pair<? extends kp7, ? extends RewardShowOffData>> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        gni gniVar = new gni(v1bVar, this.d);
        gniVar.b = myhVar;
        gniVar.c = bool;
        return gniVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        dni dniVar = this.d;
        h530 h530Var = dniVar.a;
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            ((Boolean) this.c).getClass();
            String str = dniVar.B.c;
            o0i o0iVarA = r0i.a(new bni(h530Var.s(str)), new cni(dniVar, str, null));
            lyh<RewardShowOffConfig> lyhVarP = h530Var.p();
            zmi zmiVar = new zmi(null, dniVar);
            this.b = null;
            this.c = null;
            this.a = 1;
            h99.a(myhVar);
            Object objD = w5b.d(new t78(lyhVarP, o0iVarA, myhVar, zmiVar, null), this);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
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
