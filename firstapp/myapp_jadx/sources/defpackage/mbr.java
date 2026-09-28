package defpackage;

import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntrance;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$handleAction$1", f = "LNSearchViewModel.kt", l = {265}, m = "invokeSuspend", v = 2)
public final class mbr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xbr b;
    public final /* synthetic */ i9r c;

    @c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$handleAction$1$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public final /* synthetic */ xbr a;
        public final /* synthetic */ i9r b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xbr xbrVar, i9r i9rVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.a = xbrVar;
            this.b = i9rVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.D.a(new j9r.b(new nvp.c(new q8r(((i9r.b) this.b).a, LNPlaceBetEntrance.SEARCH, null, null, null, null, 124))));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbr(xbr xbrVar, i9r i9rVar, v1b<? super mbr> v1bVar) {
        super(2, v1bVar);
        this.b = xbrVar;
        this.c = i9rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mbr(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mbr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xbr xbrVar = this.b;
            drq drqVar = xbrVar.b;
            a aVar = new a(xbrVar, this.c, null);
            this.a = 1;
            if (drqVar.a(aVar, this) == y5bVar) {
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
