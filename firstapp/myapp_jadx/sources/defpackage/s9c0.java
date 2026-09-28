package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.legends.SportyLegendsActivity;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportybet.android.instantwin.presentation.legends.c;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.instantwin.router.kickoff.KickoffInput;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsActivity$initViewModelObservers$$inlined$collectWithLifecycle$1", f = "SportyLegendsActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class s9c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SportyLegendsActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ SportyLegendsActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsActivity$initViewModelObservers$$inlined$collectWithLifecycle$1$1", f = "SportyLegendsActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ SportyLegendsActivity d;

        /* JADX INFO: renamed from: s9c0$a$a, reason: collision with other inner class name */
        public static final class C1082a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ SportyLegendsActivity b;

            public C1082a(v5b v5bVar, SportyLegendsActivity sportyLegendsActivity) {
                this.b = sportyLegendsActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                c cVar = (c) t;
                int i = SportyLegendsActivity.A;
                boolean z = cVar instanceof c.b;
                SportyLegendsActivity sportyLegendsActivity = this.b;
                if (z) {
                    c.b bVar = (c.b) cVar;
                    if (bVar.equals(c.b.a.a)) {
                        sportyLegendsActivity.finish();
                    } else if (bVar instanceof c.b.C0288b) {
                        InstantWinBetHistoryInput instantWinBetHistoryInput = new InstantWinBetHistoryInput(((c.b.C0288b) bVar).a);
                        jlo jloVar = sportyLegendsActivity.d;
                        if (jloVar == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        sportyLegendsActivity.startActivity(jloVar.t(sportyLegendsActivity, instantWinBetHistoryInput));
                    } else if (bVar.equals(c.b.C0289c.a)) {
                        azm azmVar = sportyLegendsActivity.w;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.d(wae.DEPOSIT);
                    } else if (bVar instanceof c.b.d) {
                        ee<fqk> eeVar = sportyLegendsActivity.z;
                        if (eeVar != null) {
                            eeVar.b(((c.b.d) bVar).a);
                        }
                    } else if (bVar.equals(c.b.e.a)) {
                        azm azmVar2 = sportyLegendsActivity.w;
                        if (azmVar2 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar2.d(wae.HOME);
                    } else if (bVar.equals(c.b.f.a)) {
                        ej5.c(ebs.a(sportyLegendsActivity.getLifecycle()), null, null, new com.sportybet.android.instantwin.presentation.legends.a(sportyLegendsActivity, null), 3);
                    } else if (bVar instanceof c.b.g) {
                        c.b.g gVar = (c.b.g) bVar;
                        SportyLegendsSettlementInput sportyLegendsSettlementInput = gVar.a;
                        int iOrdinal = gVar.c.ordinal();
                        if (iOrdinal == 0) {
                            jlo jloVar2 = sportyLegendsActivity.d;
                            if (jloVar2 == null) {
                                Intrinsics.n("instantWinRouter");
                                throw null;
                            }
                            sportyLegendsActivity.startActivity(jloVar2.p(sportyLegendsActivity, new KickoffInput(sportyLegendsSettlementInput.a.b, gVar.b, sportyLegendsSettlementInput)));
                        } else {
                            if (iOrdinal != 1) {
                                uhc.a();
                                return null;
                            }
                            jlo jloVar3 = sportyLegendsActivity.d;
                            if (jloVar3 == null) {
                                Intrinsics.n("instantWinRouter");
                                throw null;
                            }
                            sportyLegendsActivity.startActivity(jloVar3.e(sportyLegendsActivity, sportyLegendsSettlementInput));
                        }
                        sportyLegendsActivity.overridePendingTransition(0, 0);
                    } else {
                        if (!bVar.equals(c.b.h.a)) {
                            uhc.a();
                            return null;
                        }
                        sportyLegendsActivity.finish();
                        azm azmVar3 = sportyLegendsActivity.w;
                        if (azmVar3 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar3.d(wae.VIRTUALS_LOBBY);
                    }
                } else {
                    if (!(cVar instanceof c.a)) {
                        uhc.a();
                        return null;
                    }
                    if (sportyLegendsActivity.y == null) {
                        Intrinsics.n("bettingDeviceSecurityChecker");
                        throw null;
                    }
                    sportyLegendsActivity.A1().A1(b.k.a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, SportyLegendsActivity sportyLegendsActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = sportyLegendsActivity;
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
                C1082a c1082a = new C1082a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1082a, this) == y5bVar) {
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
    public s9c0(SportyLegendsActivity sportyLegendsActivity, lyh lyhVar, v1b v1bVar, SportyLegendsActivity sportyLegendsActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = sportyLegendsActivity;
        this.c = lyhVar;
        this.d = sportyLegendsActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new s9c0(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s9c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
