package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyActivity;
import com.sportybet.android.instantwin.presentation.penalty.b;
import com.sportybet.android.instantwin.presentation.penalty.c;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "SportyPenaltyActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class xuc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SportyPenaltyActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ SportyPenaltyActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "SportyPenaltyActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ SportyPenaltyActivity d;

        /* JADX INFO: renamed from: xuc0$a$a, reason: collision with other inner class name */
        public static final class C1308a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ SportyPenaltyActivity b;

            public C1308a(v5b v5bVar, SportyPenaltyActivity sportyPenaltyActivity) {
                this.b = sportyPenaltyActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                c cVar = (c) t;
                int i = SportyPenaltyActivity.w;
                boolean z = cVar instanceof c.b;
                SportyPenaltyActivity sportyPenaltyActivity = this.b;
                if (z) {
                    c.b bVar = (c.b) cVar;
                    if (bVar instanceof c.b.a) {
                        sportyPenaltyActivity.finish();
                    } else if (bVar instanceof c.b.f) {
                        ej5.c(ebs.a(sportyPenaltyActivity.getLifecycle()), null, null, new com.sportybet.android.instantwin.presentation.penalty.a(sportyPenaltyActivity, null), 3);
                    } else if (bVar instanceof c.b.C0302b) {
                        InstantWinBetHistoryInput instantWinBetHistoryInput = new InstantWinBetHistoryInput(((c.b.C0302b) bVar).a);
                        jlo jloVar = sportyPenaltyActivity.f;
                        if (jloVar == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        sportyPenaltyActivity.startActivity(jloVar.t(sportyPenaltyActivity, instantWinBetHistoryInput));
                    } else if (bVar instanceof c.b.d) {
                        ee<fqk> eeVar = sportyPenaltyActivity.v;
                        if (eeVar != null) {
                            eeVar.b(((c.b.d) bVar).a);
                        }
                    } else if (bVar instanceof c.b.g) {
                        c.b.g gVar = (c.b.g) bVar;
                        b2d0 b2d0Var = new b2d0(gVar.a, gVar.b);
                        jlo jloVar2 = sportyPenaltyActivity.f;
                        if (jloVar2 == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        sportyPenaltyActivity.startActivity(jloVar2.r(sportyPenaltyActivity, b2d0Var));
                    } else if (bVar instanceof c.b.h) {
                        sportyPenaltyActivity.finish();
                        azm azmVar = sportyPenaltyActivity.i;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.d(wae.VIRTUALS_LOBBY);
                    } else if (bVar instanceof c.b.C0303c) {
                        azm azmVar2 = sportyPenaltyActivity.i;
                        if (azmVar2 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar2.d(wae.DEPOSIT);
                    } else {
                        if (!(bVar instanceof c.b.e)) {
                            uhc.a();
                            return null;
                        }
                        azm azmVar3 = sportyPenaltyActivity.i;
                        if (azmVar3 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar3.d(wae.HOME);
                    }
                } else if (cVar instanceof c.C0304c) {
                    Iterator<T> it = ((c.C0304c) cVar).a.iterator();
                    while (it.hasNext()) {
                        lnt.i(sportyPenaltyActivity, (String) it.next());
                    }
                } else {
                    if (!(cVar instanceof c.a)) {
                        uhc.a();
                        return null;
                    }
                    if (sportyPenaltyActivity.e == null) {
                        Intrinsics.n("bettingDeviceSecurityChecker");
                        throw null;
                    }
                    sportyPenaltyActivity.z1().z1(b.m.a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, SportyPenaltyActivity sportyPenaltyActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = sportyPenaltyActivity;
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
                C1308a c1308a = new C1308a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1308a, this) == y5bVar) {
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
    public xuc0(SportyPenaltyActivity sportyPenaltyActivity, lyh lyhVar, v1b v1bVar, SportyPenaltyActivity sportyPenaltyActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = sportyPenaltyActivity;
        this.c = lyhVar;
        this.d = sportyPenaltyActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new xuc0(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xuc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
