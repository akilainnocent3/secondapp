package defpackage;

import com.sporty.android.book.data.entity.RelatedBetRequest;
import com.sporty.android.book.data.entity.UserPref;
import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sporty.android.book.domain.entity.BetTypeConfig;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.realsports.BetTypeConfigAnyWinDto;
import com.sporty.android.core.model.realsports.BetTypeConfigFlexiBetDto;
import com.sporty.android.core.model.realsports.BetTypeConfigResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class pkb0 implements nkb0 {
    public final jkb0 a;
    public final wwd0 b;

    @c0d(c = "com.sporty.android.book.data.repository.SportyBookRepositoryImpl$getBetTypeConfigFlow$1", f = "SportyBookRepositoryImpl.kt", l = {158}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super BetTypeConfig>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return pkb0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super BetTypeConfig> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object bVar2;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                jkb0 jkb0Var = pkb0.this.a;
                this.a = 1;
                obj = jkb0Var.d(this);
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
            BetTypeConfigResponse betTypeConfigResponse = (BetTypeConfigResponse) n52.b((BaseResponse) obj);
            betTypeConfigResponse.getClass();
            try {
                zi50.a aVar = zi50.b;
                BetTypeConfigFlexiBetDto flexi = betTypeConfigResponse.getFlexi();
                bVar = flexi != null ? ed3.b(flexi) : null;
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_CONFIG);
                aVar3.o(thA);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            BetTypeFlexiBetConfig betTypeFlexiBetConfig = (BetTypeFlexiBetConfig) bVar;
            try {
                BetTypeConfigAnyWinDto anywin = betTypeConfigResponse.getAnywin();
                bVar2 = anywin != null ? ed3.a(anywin) : null;
            } catch (Throwable th2) {
                zi50.a aVar4 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            Throwable thA2 = zi50.a(bVar2);
            if (thA2 != null) {
                itf0.a aVar5 = itf0.a;
                aVar5.q(MyLog.TAG_CONFIG);
                aVar5.o(thA2);
            }
            return new BetTypeConfig(betTypeFlexiBetConfig, (BetTypeAnyWinConfig) (bVar2 instanceof zi50.b ? null : bVar2));
        }
    }

    public pkb0(jkb0 jkb0Var) {
        jkb0Var.getClass();
        this.a = jkb0Var;
        this.b = xwd0.a(lk50.b.a);
    }

    @Override // defpackage.nkb0
    public final or60 a(String str) {
        return new or60(new xkb0(this, str, null));
    }

    @Override // defpackage.nkb0
    public final or60 b(String str) {
        str.getClass();
        return new or60(new rkb0(this, str, null));
    }

    @Override // defpackage.nkb0
    public final or60 c(RelatedBetRequest relatedBetRequest) {
        return new or60(new tkb0(this, relatedBetRequest, null));
    }

    @Override // defpackage.nkb0
    public final or60 d() {
        return new or60(new skb0(this, null));
    }

    @Override // defpackage.nkb0
    public final or60 e(UserPref userPref) {
        return new or60(new zkb0(this, userPref, null));
    }

    @Override // defpackage.nkb0
    public final or60 f(String str) {
        return new or60(new wkb0(this, str, null));
    }

    @Override // defpackage.nkb0
    public final or60 g() {
        return new or60(new ukb0(this, null));
    }

    @Override // defpackage.nkb0
    public final lyh<lk50<BetTypeConfig>> h(pu0 pu0Var) {
        pu0Var.getClass();
        return su0.a(this.b, pu0Var, new a(null));
    }

    @Override // defpackage.nkb0
    public final or60 i(String str) {
        return new or60(new ykb0(this, str, null));
    }

    @Override // defpackage.nkb0
    public final or60 j() {
        return new or60(new qkb0(this, null));
    }

    @Override // defpackage.nkb0
    public final or60 k(Long l, Long l2, Long l3) {
        return new or60(new vkb0(this, l, l2, l3, null));
    }

    @Override // defpackage.nkb0
    public final or60 l(String str, ArrayList arrayList, BigDecimal bigDecimal) {
        return new or60(new okb0(this, str, arrayList, bigDecimal, null));
    }

    @Override // defpackage.nkb0
    public final BetTypeConfig m() {
        return (BetTypeConfig) bm50.i((lk50) this.b.getValue());
    }
}
