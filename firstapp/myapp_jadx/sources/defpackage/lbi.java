package defpackage;

import androidx.fragment.app.FragmentManager;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementActivity;
import com.sportybet.android.instantwin.presentation.footballfamilysettlement.b;
import com.sportybet.android.instantwin.presentation.showoff.model.InstantVirtualShowOffType;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "FootballFamilySettlementActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class lbi extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ FootballFamilySettlementActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ FootballFamilySettlementActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "FootballFamilySettlementActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ FootballFamilySettlementActivity d;

        /* JADX INFO: renamed from: lbi$a$a, reason: collision with other inner class name */
        public static final class C0808a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ FootballFamilySettlementActivity b;

            public C0808a(v5b v5bVar, FootballFamilySettlementActivity footballFamilySettlementActivity) {
                this.b = footballFamilySettlementActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                b bVar = (b) t;
                int i = FootballFamilySettlementActivity.d;
                boolean z = bVar instanceof b.InterfaceC0270b;
                FootballFamilySettlementActivity footballFamilySettlementActivity = this.b;
                if (z) {
                    b.InterfaceC0270b interfaceC0270b = (b.InterfaceC0270b) bVar;
                    if (interfaceC0270b instanceof b.InterfaceC0270b.a) {
                        InstantWinBetHistoryInput instantWinBetHistoryInput = new InstantWinBetHistoryInput(((b.InterfaceC0270b.a) interfaceC0270b).a);
                        jlo jloVar = footballFamilySettlementActivity.c;
                        if (jloVar == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        footballFamilySettlementActivity.startActivity(jloVar.t(footballFamilySettlementActivity, instantWinBetHistoryInput));
                    } else if (interfaceC0270b instanceof b.InterfaceC0270b.C0271b) {
                        b.InterfaceC0270b.C0271b c0271b = (b.InterfaceC0270b.C0271b) interfaceC0270b;
                        InstantWinInput instantWinInput = new InstantWinInput(c0271b.a, null, null, c0271b.b);
                        jlo jloVar2 = footballFamilySettlementActivity.c;
                        if (jloVar2 == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        footballFamilySettlementActivity.startActivity(jloVar2.l(footballFamilySettlementActivity, instantWinInput));
                    } else {
                        if (!(interfaceC0270b instanceof b.InterfaceC0270b.c)) {
                            uhc.a();
                            return null;
                        }
                        b.InterfaceC0270b.c cVar = (b.InterfaceC0270b.c) interfaceC0270b;
                        InstantWinTicketDetailInput instantWinTicketDetailInput = new InstantWinTicketDetailInput(cVar.a, cVar.b);
                        jlo jloVar3 = footballFamilySettlementActivity.c;
                        if (jloVar3 == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        footballFamilySettlementActivity.startActivity(jloVar3.d(footballFamilySettlementActivity, instantWinTicketDetailInput));
                    }
                } else {
                    if (!(bVar instanceof b.a)) {
                        uhc.a();
                        return null;
                    }
                    b.a aVar = (b.a) bVar;
                    InstantVirtualShowOffType.RoundWithCompleteInfo roundWithCompleteInfo = new InstantVirtualShowOffType.RoundWithCompleteInfo(aVar.b);
                    String str = aVar.a;
                    q5o q5oVar = new q5o();
                    q5oVar.setArguments(vj5.a(new Pair("ARG_TYPE", roundWithCompleteInfo), new Pair("ARG_SPORT_ID", str)));
                    FragmentManager supportFragmentManager = footballFamilySettlementActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    q5oVar.show(supportFragmentManager, "TAG_INSTANT_VIRTUAL_SHOW_OFF_DIALOG_FRAGMENT");
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, FootballFamilySettlementActivity footballFamilySettlementActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = footballFamilySettlementActivity;
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
                C0808a c0808a = new C0808a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0808a, this) == y5bVar) {
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
    public lbi(FootballFamilySettlementActivity footballFamilySettlementActivity, lyh lyhVar, v1b v1bVar, FootballFamilySettlementActivity footballFamilySettlementActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = footballFamilySettlementActivity;
        this.c = lyhVar;
        this.d = footballFamilySettlementActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new lbi(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lbi) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
