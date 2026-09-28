package defpackage;

import com.sporty.android.book.domain.entity.BetTypeConfig;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class jvh {
    public final nkb0 a;
    public final w43 b;
    public final lq1 c;
    public final o0i d;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.FlexiBetDomainService$flexiBetConfigFlow$1", f = "FlexiBetDomainService.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends BetTypeConfig>, v1b<? super lyh<? extends BetTypeFlexiBetConfig>>, Object> {
        public jvh a;
        public int b;
        public /* synthetic */ Object c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = jvh.this.new a(v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends BetTypeConfig> lk50Var, v1b<? super lyh<? extends BetTypeFlexiBetConfig>> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jvh jvhVar;
            Object objA;
            lk50 lk50Var = (lk50) this.c;
            y5b y5bVar = y5b.a;
            int i = this.b;
            BetTypeFlexiBetConfig betTypeFlexiBetConfigCopy$default = null;
            if (i == 0) {
                uj50.b(obj);
                BetTypeConfig betTypeConfig = (BetTypeConfig) bm50.i(lk50Var);
                if (betTypeConfig != null && betTypeConfig.getFlexi() != null) {
                    jvhVar = jvh.this;
                    w43 w43Var = jvhVar.b;
                    this.c = null;
                    this.a = jvhVar;
                    this.b = 1;
                    objA = w43Var.a(this);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                }
                return new gzh(betTypeFlexiBetConfigCopy$default);
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jvh jvhVar2 = this.a;
            uj50.b(obj);
            jvhVar = jvhVar2;
            objA = obj;
            BetTypeFlexiBetConfig betTypeFlexiBetConfig = (BetTypeFlexiBetConfig) objA;
            if (betTypeFlexiBetConfig != null) {
                lq1 lq1Var = jvhVar.c;
                lq1Var.getClass();
                betTypeFlexiBetConfigCopy$default = BetTypeFlexiBetConfig.copy$default(betTypeFlexiBetConfig, null, null, false, null, null, qq1.h(lq1Var, BOConfigParam.FlexiBetWeightedRTPSupportedMinVersion), null, 0, 223, null);
            }
            return new gzh(betTypeFlexiBetConfigCopy$default);
        }
    }

    static {
        ohp<Object>[] ohpVarArr = w43.d;
    }

    public jvh(nkb0 nkb0Var, w43 w43Var, lq1 lq1Var) {
        nkb0Var.getClass();
        w43Var.getClass();
        lq1Var.getClass();
        this.a = nkb0Var;
        this.b = w43Var;
        this.c = lq1Var;
        this.d = r0i.a(nkb0Var.h(pu0.b.a), new a(null));
    }
}
