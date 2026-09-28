package defpackage;

import com.sporty.android.book.domain.entity.BetTypeConfig;
import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class hvh implements lyh<BetTypeFlexiBetConfig> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ jvh b;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.FlexiBetDomainService$fetchFlexiBetConfig$$inlined$mapNotNull$1", f = "FlexiBetDomainService.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return hvh.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ jvh b;

        @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.FlexiBetDomainService$fetchFlexiBetConfig$$inlined$mapNotNull$1$2", f = "FlexiBetDomainService.kt", l = {56}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, jvh jvhVar) {
            this.a = myhVar;
            this.b = jvhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            BetTypeFlexiBetConfig flexi;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            BetTypeFlexiBetConfig betTypeFlexiBetConfig = null;
            if (i2 == 0) {
                uj50.b(obj2);
                BetTypeConfig betTypeConfig = (BetTypeConfig) bm50.i((lk50) obj);
                if (betTypeConfig != null && (flexi = betTypeConfig.getFlexi()) != null) {
                    lq1 lq1Var = this.b.c;
                    lq1Var.getClass();
                    BetTypeFlexiBetConfig betTypeFlexiBetConfigCopy$default = BetTypeFlexiBetConfig.copy$default(flexi, null, null, false, null, null, qq1.h(lq1Var, BOConfigParam.FlexiBetWeightedRTPSupportedMinVersion), null, 0, 223, null);
                    if (betTypeFlexiBetConfigCopy$default != null && fd3.b(betTypeFlexiBetConfigCopy$default)) {
                        betTypeFlexiBetConfig = betTypeFlexiBetConfigCopy$default;
                    }
                }
                if (betTypeFlexiBetConfig != null) {
                    aVar.b = 1;
                    if (this.a.emit(betTypeFlexiBetConfig, aVar) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public hvh(lyh lyhVar, jvh jvhVar) {
        this.a = lyhVar;
        this.b = jvhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super BetTypeFlexiBetConfig> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
