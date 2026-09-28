package defpackage;

import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sporty.android.book.domain.entity.BetTypeConfig;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class gl0 {
    public final jrm a;
    public final krm b;
    public final nkb0 c;
    public final wwd0 d;
    public final wwd0 e;
    public final o0i f;
    public final k1i g;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.AnyWinDomainService$anyWinActiveStateFlow$1", f = "AnyWinDomainService.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<lk50<? extends BetTypeConfig>, Long, Long, v1b<? super el0>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(lk50<? extends BetTypeConfig> lk50Var, Long l, Long l2, v1b<? super el0> v1bVar) {
            l.longValue();
            l2.longValue();
            return gl0.this.new a(v1bVar).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BetTypeAnyWinConfig anyWin;
            int i;
            BigDecimal bigDecimal;
            String str;
            Object bVar;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            gl0 gl0Var = gl0.this;
            jrm jrmVar = gl0Var.a;
            BetTypeConfig betTypeConfigM = gl0Var.c.m();
            if (betTypeConfigM == null || (anyWin = betTypeConfigM.getAnyWin()) == null) {
                return el0.c;
            }
            if (anyWin.getStatus() == 2) {
                return el0.c;
            }
            if (anyWin.getStatus() == 1 && jrmVar.p()) {
                return el0.c;
            }
            if (jrmVar.V() || gl0Var.b.P()) {
                return el0.c;
            }
            ArrayList arrayListU = jrmVar.U();
            int minSelectionNum = anyWin.getMinSelectionNum();
            int maxSelectionNum = anyWin.getMaxSelectionNum();
            int i2 = 0;
            if (arrayListU == null || !arrayListU.isEmpty()) {
                int size = arrayListU.size();
                i = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayListU.get(i3);
                    i3++;
                    if (!qz3.i((Selection) obj2) && (i = i + 1) < 0) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (minSelectionNum > i || i > maxSelectionNum) {
                return el0.c;
            }
            if (jrmVar.J1()) {
                return el0.c;
            }
            if (arrayListU == null || !arrayListU.isEmpty()) {
                int size2 = arrayListU.size();
                while (i2 < size2) {
                    Object obj3 = arrayListU.get(i2);
                    i2++;
                    Outcome outcome = ((Selection) obj3).c;
                    if (outcome == null || (str = outcome.odds) == null) {
                        bigDecimal = BigDecimal.ZERO;
                    } else {
                        try {
                            zi50.a aVar = zi50.b;
                            bVar = new BigDecimal(str);
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        Throwable thA = zi50.a(bVar);
                        if (thA != null) {
                            itf0.a aVar3 = itf0.a;
                            aVar3.q(MyLog.TAG_BET_SLIP);
                            aVar3.o(thA);
                        }
                        BigDecimal bigDecimal2 = BigDecimal.ZERO;
                        if (bVar instanceof zi50.b) {
                            bVar = bigDecimal2;
                        }
                        bigDecimal = (BigDecimal) bVar;
                        if (bigDecimal == null) {
                            bigDecimal = BigDecimal.ZERO;
                        }
                    }
                    if (bigDecimal.compareTo(anyWin.getMinSelectionOdds()) < 0) {
                        return el0.b;
                    }
                }
            }
            return el0.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.AnyWinDomainService$anyWinConfigFlow$1", f = "AnyWinDomainService.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends BetTypeConfig>, v1b<? super lyh<? extends BetTypeAnyWinConfig>>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends BetTypeConfig> lk50Var, v1b<? super lyh<? extends BetTypeAnyWinConfig>> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            BetTypeConfig betTypeConfig = (BetTypeConfig) bm50.i(lk50Var);
            return new gzh(betTypeConfig != null ? betTypeConfig.getAnyWin() : null);
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.service.AnyWinDomainService$updateAnyWinState$1", f = "AnyWinDomainService.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<lk50<? extends BetTypeConfig>, v1b<? super Unit>, Object> {
        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return gl0.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends BetTypeConfig> lk50Var, v1b<? super Unit> v1bVar) {
            return ((c) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = gl0.this.d;
            do {
                value = wwd0Var.getValue();
                ((Number) value).longValue();
            } while (!wwd0Var.g(value, new Long(System.currentTimeMillis())));
            return Unit.a;
        }
    }

    public gl0(jrm jrmVar, krm krmVar, nkb0 nkb0Var) {
        jrmVar.getClass();
        krmVar.getClass();
        nkb0Var.getClass();
        this.a = jrmVar;
        this.b = krmVar;
        this.c = nkb0Var;
        wwd0 wwd0VarA = xwd0.a(Long.valueOf(System.currentTimeMillis()));
        this.d = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(Long.valueOf(System.currentTimeMillis()));
        this.e = wwd0VarA2;
        pu0.b bVar = pu0.b.a;
        this.f = r0i.a(nkb0Var.h(bVar), new b(2, null));
        this.g = r1i.a(nkb0Var.h(bVar), wwd0VarA, wwd0VarA2, new a(null));
        jrmVar.m1(new iu2.a() { // from class: fl0
            @Override // iu2.a
            public final void C() {
                Object value;
                wwd0 wwd0Var = this.a.e;
                do {
                    value = wwd0Var.getValue();
                    ((Number) value).longValue();
                } while (!wwd0Var.g(value, Long.valueOf(System.currentTimeMillis())));
            }
        });
    }

    public final void a(s9s s9sVar, boolean z) {
        s9sVar.getClass();
        kzh.d(new g1i(this.c.h(z ? pu0.c.a : pu0.b.a), new c(null)), ebs.a(s9sVar));
    }
}
