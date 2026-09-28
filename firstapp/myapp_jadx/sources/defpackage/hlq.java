package defpackage;

import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import com.sportybet.feature.luckynumber.featurematch.presentation.d;
import com.sportybet.feature.luckynumber.featurematch.presentation.f;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class hlq implements lyh<d.c> {
    public final /* synthetic */ xzh a;
    public final /* synthetic */ LNLastMinuteCard b;
    public final /* synthetic */ f c;

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LNLastMinuteCardUIStateUseCase$invoke$$inlined$map$1", f = "LNLastMinuteCardUIStateUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return hlq.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ LNLastMinuteCard b;
        public final /* synthetic */ f c;

        @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.LNLastMinuteCardUIStateUseCase$invoke$$inlined$map$1$2", f = "LNLastMinuteCardUIStateUseCase.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, LNLastMinuteCard lNLastMinuteCard, f fVar) {
            this.a = myhVar;
            this.b = lNLastMinuteCard;
            this.c = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
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
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                LNLastMinuteCard lNLastMinuteCard = this.b;
                String str = lNLastMinuteCard.d;
                String str2 = lNLastMinuteCard.b;
                long j = lNLastMinuteCard.f;
                int i3 = lNLastMinuteCard.D;
                int i4 = lNLastMinuteCard.C;
                f fVar = this.c;
                fVar.getClass();
                d.c cVar = new d.c(str2, j, (i3 < 1 || i4 < 0 || i4 > i3) ? n1a0.c : a4h.f(CollectionsKt.q0(CollectionsKt.t0(kotlin.collections.a.e(new IntRange(1, i3, 1), fVar.a.a), i4))), str, false);
                aVar.b = 1;
                if (this.a.emit(cVar, aVar) == y5bVar) {
                    return y5bVar;
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

    public hlq(xzh xzhVar, LNLastMinuteCard lNLastMinuteCard, f fVar) {
        this.a = xzhVar;
        this.b = lNLastMinuteCard;
        this.c = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super d.c> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c);
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
