package com.sportybet.feature.luckynumber.featurematch.presentation;

import defpackage.a8q;
import defpackage.b8q;
import defpackage.c0d;
import defpackage.drq;
import defpackage.ib5;
import defpackage.ogq;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.z7q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchViewModel$onClickHighestOddsBet$1", f = "LuckyNumberFeatureMatchViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
public final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ k b;

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchViewModel$onClickHighestOddsBet$1$1", f = "LuckyNumberFeatureMatchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public final /* synthetic */ k a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, k kVar) {
            super(1, v1bVar);
            this.a = kVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(v1bVar, this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ogq ogqVar;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            k kVar = this.a;
            a8q a8qVar = ((b8q) kVar.y.a.getValue()).a;
            a8q.a aVar = a8qVar instanceof a8q.a ? (a8q.a) a8qVar : null;
            z7q z7qVar = aVar != null ? aVar.a : null;
            if (z7qVar != null && (ogqVar = z7qVar.d) != null) {
                kVar.B.a(new b.C0404b(ogqVar.a, ogqVar.h));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v1b v1bVar, k kVar) {
        super(2, v1bVar);
        this.b = kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            k kVar = this.b;
            drq drqVar = kVar.b;
            a aVar = new a(null, kVar);
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
