package defpackage;

import android.content.Context;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.livescore.LiveScoreFragment$setupViewModel$$inlined$collectWithLifecycle$1", f = "LiveScoreFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class jss extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ kss d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.livescore.LiveScoreFragment$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "LiveScoreFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ kss d;

        /* JADX INFO: renamed from: jss$a$a, reason: collision with other inner class name */
        public static final class C0737a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ kss b;

            public C0737a(v5b v5bVar, kss kssVar) {
                this.b = kssVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                ndc0 ndc0Var = (ndc0) t;
                boolean z = ndc0Var instanceof ndc0.a;
                kss kssVar = this.b;
                if (z) {
                    ndc0.a aVar = (ndc0.a) ndc0Var;
                    SportyLegendsInput sportyLegendsInput = new SportyLegendsInput(aVar.b, "sr:sport:3", aVar.a);
                    jlo jloVar = kssVar.K;
                    if (jloVar == null) {
                        Intrinsics.n("instantWinRouter");
                        throw null;
                    }
                    Context contextRequireContext = kssVar.requireContext();
                    contextRequireContext.getClass();
                    kssVar.startActivity(jloVar.b(contextRequireContext, sportyLegendsInput));
                    w9c0 w9c0Var = kssVar.M;
                    if (w9c0Var == null) {
                        Intrinsics.n("sportyLegendsAnalyticsTracker");
                        throw null;
                    }
                    w9c0Var.c(v9c0.l.a);
                } else if (ndc0Var instanceof ndc0.b) {
                    jlo jloVar2 = kssVar.K;
                    if (jloVar2 == null) {
                        Intrinsics.n("instantWinRouter");
                        throw null;
                    }
                    Context contextRequireContext2 = kssVar.requireContext();
                    contextRequireContext2.getClass();
                    kssVar.startActivity(jloVar2.d(contextRequireContext2, ((ndc0.b) ndc0Var).a));
                } else {
                    if (!(ndc0Var instanceof ndc0.c)) {
                        uhc.a();
                        return null;
                    }
                    n0f n0fVar = kssVar.P;
                    if (n0fVar == null) {
                        Intrinsics.n("doubleOrNothingAudioPlayer");
                        throw null;
                    }
                    n0fVar.b(((ndc0.c) ndc0Var).a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, kss kssVar) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = kssVar;
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
                C0737a c0737a = new C0737a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0737a, this) == y5bVar) {
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
    public jss(ibs ibsVar, lyh lyhVar, v1b v1bVar, kss kssVar) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = kssVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new jss(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jss) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
