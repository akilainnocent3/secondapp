package defpackage;

import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.gift.GiftManagerImpl$fetchGifts$1", f = "GiftManagerImpl.kt", l = {83}, m = "invokeSuspend", v = 2)
public final class kpk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lpk b;
    public final /* synthetic */ Integer c;

    public static final class a<T> implements myh {
        public final /* synthetic */ lpk a;

        public a(lpk lpkVar) {
            this.a = lpkVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.f.setValue((lk50) obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.manager.gift.GiftManagerImpl$fetchGifts$1$invokeSuspend$$inlined$flatMapLatest$1", f = "GiftManagerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super lk50<? extends List<? extends GiftGroup>>>, Long, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ lpk d;
        public final /* synthetic */ Integer e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, lpk lpkVar, Integer num) {
            super(3, v1bVar);
            this.d = lpkVar;
            this.e = num;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends List<? extends GiftGroup>>> myhVar, Long l, v1b<? super Unit> v1bVar) {
            b bVar = new b(v1bVar, this.d, this.e);
            bVar.b = myhVar;
            bVar.c = l;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                ((Number) this.c).longValue();
                yzh yzhVarA = bm50.a(this.d.a.a(this.e.intValue(), new Integer(OrderBetType.ALL.getValue())));
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, yzhVarA, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpk(v1b v1bVar, lpk lpkVar, Integer num) {
        super(2, v1bVar);
        this.b = lpkVar;
        this.c = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kpk(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kpk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lpk lpkVar = this.b;
            b77 b77VarF = r0i.f(lpkVar.c, new b(null, lpkVar, this.c));
            a aVar = new a(lpkVar);
            this.a = 1;
            if (b77VarF.collect(aVar, this) == y5bVar) {
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
