package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$dismissGiftRedDot$1", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {137}, m = "invokeSuspend", v = 2)
public final class xji0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gki0 b;
    public final /* synthetic */ Set<Integer> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xji0(gki0 gki0Var, Set<Integer> set, v1b<? super xji0> v1bVar) {
        super(2, v1bVar);
        this.b = gki0Var;
        this.c = set;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xji0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xji0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yho yhoVar = this.b.e;
            wm20 wm20VarA = yhoVar.k.a(yhoVar, yho.o[10]);
            String strA0 = CollectionsKt.a0(this.c, ",", null, null, null, 62);
            this.a = 1;
            if (wm20VarA.g(this, strA0) == y5bVar) {
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
