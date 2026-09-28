package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.legendsrace.SportyLegendsSettlementActivity;
import com.sportybet.android.instantwin.presentation.legendsrace.b;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.SportyLegendsSettlementActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "SportyLegendsSettlementActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class gkc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SportyLegendsSettlementActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ SportyLegendsSettlementActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.SportyLegendsSettlementActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "SportyLegendsSettlementActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ SportyLegendsSettlementActivity d;

        /* JADX INFO: renamed from: gkc0$a$a, reason: collision with other inner class name */
        public static final class C0601a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ SportyLegendsSettlementActivity b;

            public C0601a(v5b v5bVar, SportyLegendsSettlementActivity sportyLegendsSettlementActivity) {
                this.b = sportyLegendsSettlementActivity;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                b bVar = (b) t;
                int i = SportyLegendsSettlementActivity.f;
                if (bVar instanceof b.C0291b) {
                    new InstantWinBetHistoryInput(null);
                    throw null;
                }
                boolean z = bVar instanceof b.a;
                SportyLegendsSettlementActivity sportyLegendsSettlementActivity = this.b;
                if (z) {
                    b.a aVar = (b.a) bVar;
                    SportyLegendsInput sportyLegendsInput = new SportyLegendsInput(aVar.c, aVar.a, aVar.b);
                    jlo jloVar = sportyLegendsSettlementActivity.d;
                    if (jloVar == null) {
                        Intrinsics.n("instantWinRouter");
                        throw null;
                    }
                    sportyLegendsSettlementActivity.startActivity(jloVar.b(sportyLegendsSettlementActivity, sportyLegendsInput));
                    w9c0 w9c0Var = sportyLegendsSettlementActivity.c;
                    if (w9c0Var == null) {
                        Intrinsics.n("sportyLegendsAnalyticsTracker");
                        throw null;
                    }
                    w9c0Var.c(v9c0.l.a);
                } else if (bVar instanceof b.c) {
                    jlo jloVar2 = sportyLegendsSettlementActivity.d;
                    if (jloVar2 == null) {
                        Intrinsics.n("instantWinRouter");
                        throw null;
                    }
                    sportyLegendsSettlementActivity.startActivity(jloVar2.d(sportyLegendsSettlementActivity, ((b.c) bVar).a));
                } else {
                    if (!(bVar instanceof b.d)) {
                        uhc.a();
                        return null;
                    }
                    n0f n0fVar = sportyLegendsSettlementActivity.e;
                    if (n0fVar == null) {
                        Intrinsics.n("doubleOrNothingAudioPlayer");
                        throw null;
                    }
                    n0fVar.b(((b.d) bVar).a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, SportyLegendsSettlementActivity sportyLegendsSettlementActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = sportyLegendsSettlementActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0601a c0601a = new C0601a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0601a, this) == y5bVar) {
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
    public gkc0(SportyLegendsSettlementActivity sportyLegendsSettlementActivity, lyh lyhVar, v1b v1bVar, SportyLegendsSettlementActivity sportyLegendsSettlementActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = sportyLegendsSettlementActivity;
        this.c = lyhVar;
        this.d = sportyLegendsSettlementActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new gkc0(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gkc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
