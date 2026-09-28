package com.sportybet.feature.luckynumber.featurematch.presentation;

import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import defpackage.a8q;
import defpackage.b8q;
import defpackage.c0d;
import defpackage.drq;
import defpackage.ib5;
import defpackage.ku90;
import defpackage.q7q;
import defpackage.qcn;
import defpackage.rkd0;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.z7q;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchViewModel$onClickBet$1", f = "LuckyNumberFeatureMatchViewModel.kt", l = {140}, m = "invokeSuspend", v = 2)
public final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ qcn<Integer> c;

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchViewModel$onClickBet$1$1", f = "LuckyNumberFeatureMatchViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ k b;
        public final /* synthetic */ qcn<Integer> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, qcn<Integer> qcnVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = kVar;
            this.c = qcnVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            LNLastMinuteCard lNLastMinuteCard;
            BigDecimal bigDecimal;
            BigDecimal bigDecimal2;
            k kVar = this.b;
            v340 v340Var = kVar.y;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                q7q.b bVar = ((b8q) v340Var.a.getValue()).d;
                if (bVar == null) {
                    q7q q7qVar = (q7q) kVar.f.getValue();
                    if (q7qVar instanceof q7q.b) {
                        bVar = (q7q.b) q7qVar;
                    } else if (q7qVar instanceof q7q.d) {
                        bVar = ((q7q.d) q7qVar).a;
                    } else {
                        if (!Intrinsics.g(q7qVar, q7q.a.a) && !Intrinsics.g(q7qVar, q7q.c.a)) {
                            uhc.a();
                            return null;
                        }
                        bVar = null;
                    }
                }
                ku90<b> ku90Var = kVar.B;
                a8q a8qVar = ((b8q) v340Var.a.getValue()).a;
                a8q.a aVar = a8qVar instanceof a8q.a ? (a8q.a) a8qVar : null;
                z7q z7qVar = aVar != null ? aVar.a : null;
                if (z7qVar == null || (lNLastMinuteCard = z7qVar.c) == null) {
                    lNLastMinuteCard = new LNLastMinuteCard(0);
                }
                LNLastMinuteCard lNLastMinuteCard2 = lNLastMinuteCard;
                if (bVar != null) {
                    bigDecimal = bVar.c;
                } else {
                    rkd0.Companion.getClass();
                    bigDecimal = rkd0.b;
                }
                BigDecimal bigDecimal3 = bigDecimal;
                if (bVar != null) {
                    bigDecimal2 = bVar.b;
                } else {
                    rkd0.Companion.getClass();
                    bigDecimal2 = rkd0.b;
                }
                b.c cVar = new b.c(lNLastMinuteCard2, this.c, bigDecimal3, bigDecimal2, bVar != null ? bVar.d : null);
                this.a = 1;
                if (ku90Var.a.emit(cVar, this) == y5bVar) {
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
    public i(k kVar, qcn<Integer> qcnVar, v1b<? super i> v1bVar) {
        super(2, v1bVar);
        this.b = kVar;
        this.c = qcnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            k kVar = this.b;
            drq drqVar = kVar.b;
            a aVar = new a(kVar, this.c, null);
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
