package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class y760 implements lyh<uf00<? extends Integer>> {
    public final /* synthetic */ lyh[] a;

    public static final class a implements Function0<uf00<? extends Integer>[]> {
        public final /* synthetic */ lyh[] a;

        public a(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final uf00<? extends Integer>[] invoke() {
            return new uf00[this.a.length];
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.mapper.SBBallPoolMapper$getSendRowBallFlow$lambda$1$$inlined$combine$1$3", f = "SBBallPoolMapper.kt", l = {288}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements gaj<myh<? super uf00<? extends Integer>>, uf00<? extends Integer>[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super uf00<? extends Integer>> myhVar, uf00<? extends Integer>[] uf00VarArr, v1b<? super Unit> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.b = myhVar;
            bVar.c = uf00VarArr;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                uf00 uf00VarF = a4h.f(l48.s(ay0.S((uf00[]) this.c)));
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(uf00VarF, this) == y5bVar) {
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

    public y760(lyh[] lyhVarArr) {
        this.a = lyhVarArr;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super uf00<? extends Integer>> myhVar, v1b v1bVar) {
        lyh[] lyhVarArr = this.a;
        Object objA = r78.a(v1bVar, myhVar, new b(3, null), new a(lyhVarArr), lyhVarArr);
        return objA == y5b.a ? objA : Unit.a;
    }
}
