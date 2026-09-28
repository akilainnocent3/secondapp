package defpackage;

import androidx.fragment.app.FragmentManager;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryActivity;
import com.sportybet.android.instantwin.presentation.bethistory2.b;
import com.sportybet.android.instantwin.presentation.showoff.model.InstantVirtualShowOffType;
import com.sportybet.android.instantwin.router.footballfamilysettlement.FootballFamilySettlementInput;
import com.sportybet.android.instantwin.router.kickoff.KickoffInput;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "InstantWinBetHistoryActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class c9o extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ InstantWinBetHistoryActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ InstantWinBetHistoryActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "InstantWinBetHistoryActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ InstantWinBetHistoryActivity d;

        /* JADX INFO: renamed from: c9o$a$a, reason: collision with other inner class name */
        public static final class C0158a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ InstantWinBetHistoryActivity b;

            public C0158a(v5b v5bVar, InstantWinBetHistoryActivity instantWinBetHistoryActivity) {
                this.b = instantWinBetHistoryActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                b bVar = (b) t;
                int i = InstantWinBetHistoryActivity.f;
                boolean z = bVar instanceof b.InterfaceC0258b;
                InstantWinBetHistoryActivity instantWinBetHistoryActivity = this.b;
                if (z) {
                    b.InterfaceC0258b interfaceC0258b = (b.InterfaceC0258b) bVar;
                    if (interfaceC0258b instanceof b.InterfaceC0258b.a) {
                        instantWinBetHistoryActivity.finish();
                    } else if (interfaceC0258b instanceof b.InterfaceC0258b.f) {
                        jlo jloVar = instantWinBetHistoryActivity.c;
                        if (jloVar == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        b.InterfaceC0258b.f fVar = (b.InterfaceC0258b.f) interfaceC0258b;
                        instantWinBetHistoryActivity.startActivity(jloVar.d(instantWinBetHistoryActivity, new InstantWinTicketDetailInput(fVar.a, fVar.b)));
                    } else if (interfaceC0258b instanceof b.InterfaceC0258b.c) {
                        b.InterfaceC0258b.c cVar = (b.InterfaceC0258b.c) interfaceC0258b;
                        en7 en7Var = new en7(cVar.a, cVar.b);
                        ee<en7> eeVar = instantWinBetHistoryActivity.e;
                        if (eeVar != null) {
                            eeVar.b(en7Var);
                        }
                    } else if (interfaceC0258b instanceof b.InterfaceC0258b.e) {
                        b.InterfaceC0258b.e eVar = (b.InterfaceC0258b.e) interfaceC0258b;
                        wae waeVar = eVar.a;
                        if (waeVar != null) {
                            azm azmVar = instantWinBetHistoryActivity.d;
                            if (azmVar == null) {
                                Intrinsics.n("router");
                                throw null;
                            }
                            azmVar.f(waeVar, eVar.b);
                        }
                    } else if (interfaceC0258b instanceof b.InterfaceC0258b.C0259b) {
                        KickoffInput kickoffInput = new KickoffInput(((b.InterfaceC0258b.C0259b) interfaceC0258b).b);
                        jlo jloVar2 = instantWinBetHistoryActivity.c;
                        if (jloVar2 == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        instantWinBetHistoryActivity.startActivity(jloVar2.p(instantWinBetHistoryActivity, kickoffInput));
                        instantWinBetHistoryActivity.finish();
                    } else {
                        if (!(interfaceC0258b instanceof b.InterfaceC0258b.d)) {
                            uhc.a();
                            return null;
                        }
                        b.InterfaceC0258b.d dVar = (b.InterfaceC0258b.d) interfaceC0258b;
                        FootballFamilySettlementInput footballFamilySettlementInput = new FootballFamilySettlementInput(dVar.a, dVar.b, dVar.c);
                        jlo jloVar3 = instantWinBetHistoryActivity.c;
                        if (jloVar3 == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        instantWinBetHistoryActivity.startActivity(jloVar3.j(instantWinBetHistoryActivity, footballFamilySettlementInput));
                        instantWinBetHistoryActivity.finish();
                    }
                } else {
                    if (!(bVar instanceof b.a)) {
                        uhc.a();
                        return null;
                    }
                    b.a aVar = (b.a) bVar;
                    String str = aVar.a;
                    InstantVirtualShowOffType.TicketWithoutCompleteInfo ticketWithoutCompleteInfo = new InstantVirtualShowOffType.TicketWithoutCompleteInfo(aVar.b);
                    q5o q5oVar = new q5o();
                    q5oVar.setArguments(vj5.a(new Pair("ARG_TYPE", ticketWithoutCompleteInfo), new Pair("ARG_SPORT_ID", str)));
                    FragmentManager supportFragmentManager = instantWinBetHistoryActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    q5oVar.show(supportFragmentManager, "InstantVirtualShowOffDialogFragment");
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, InstantWinBetHistoryActivity instantWinBetHistoryActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = instantWinBetHistoryActivity;
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
                C0158a c0158a = new C0158a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0158a, this) == y5bVar) {
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
    public c9o(InstantWinBetHistoryActivity instantWinBetHistoryActivity, lyh lyhVar, v1b v1bVar, InstantWinBetHistoryActivity instantWinBetHistoryActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = instantWinBetHistoryActivity;
        this.c = lyhVar;
        this.d = instantWinBetHistoryActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new c9o(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c9o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
