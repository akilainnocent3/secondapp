package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballActivity;
import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import com.sportybet.android.instantwin.presentation.scheduledfootball.c;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.instantwin.router.openbet.ScheduledFootballOpenBetsInput;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "ScheduledFootballActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class xz60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ScheduledFootballActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ ScheduledFootballActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "ScheduledFootballActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ ScheduledFootballActivity d;

        /* JADX INFO: renamed from: xz60$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class C1317a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ ScheduledFootballActivity b;

            public C1317a(v5b v5bVar, ScheduledFootballActivity scheduledFootballActivity) {
                this.b = scheduledFootballActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                c cVar = (c) t;
                int i = ScheduledFootballActivity.v;
                boolean z = cVar instanceof c.b;
                ScheduledFootballActivity scheduledFootballActivity = this.b;
                if (z) {
                    c.b bVar = (c.b) cVar;
                    if (bVar instanceof c.b.a) {
                        scheduledFootballActivity.finish();
                    } else if (bVar instanceof c.b.e) {
                        ej5.c(ebs.a(scheduledFootballActivity.getLifecycle()), null, null, new com.sportybet.android.instantwin.presentation.scheduledfootball.a(scheduledFootballActivity, null), 3);
                    } else {
                        boolean z2 = bVar instanceof c.b.C0335b;
                        String str = QWvyvNzGsBpRT.DvlEwZkjYhhbo;
                        if (z2) {
                            InstantWinBetHistoryInput instantWinBetHistoryInput = new InstantWinBetHistoryInput(((c.b.C0335b) bVar).a);
                            jlo jloVar = scheduledFootballActivity.e;
                            if (jloVar == null) {
                                Intrinsics.n(str);
                                throw null;
                            }
                            scheduledFootballActivity.startActivity(jloVar.t(scheduledFootballActivity, instantWinBetHistoryInput));
                        } else if (bVar instanceof c.b.f) {
                            c.b.f fVar = (c.b.f) bVar;
                            ScheduledFootballOpenBetsInput scheduledFootballOpenBetsInput = new ScheduledFootballOpenBetsInput(fVar.a, fVar.b);
                            jlo jloVar2 = scheduledFootballActivity.e;
                            if (jloVar2 == null) {
                                Intrinsics.n(str);
                                throw null;
                            }
                            scheduledFootballActivity.startActivity(jloVar2.s(scheduledFootballActivity, scheduledFootballOpenBetsInput));
                        } else if (bVar instanceof c.b.d) {
                            ee<fqk> eeVar = scheduledFootballActivity.i;
                            if (eeVar != null) {
                                eeVar.b(((c.b.d) bVar).a);
                            }
                        } else if (bVar instanceof c.b.C0336c) {
                            azm azmVar = scheduledFootballActivity.f;
                            if (azmVar == null) {
                                Intrinsics.n("router");
                                throw null;
                            }
                            azmVar.d(wae.DEPOSIT);
                        } else {
                            if (!(bVar instanceof c.b.g)) {
                                uhc.a();
                                return null;
                            }
                            c.b.g gVar = (c.b.g) bVar;
                            InstantWinTicketDetailInput instantWinTicketDetailInput = new InstantWinTicketDetailInput(gVar.a, gVar.b);
                            jlo jloVar3 = scheduledFootballActivity.e;
                            if (jloVar3 == null) {
                                Intrinsics.n(str);
                                throw null;
                            }
                            scheduledFootballActivity.startActivity(jloVar3.d(scheduledFootballActivity, instantWinTicketDetailInput));
                        }
                    }
                } else {
                    if (!(cVar instanceof c.a)) {
                        uhc.a();
                        return null;
                    }
                    if (scheduledFootballActivity.d == null) {
                        Intrinsics.n("bettingDeviceSecurityChecker");
                        throw null;
                    }
                    scheduledFootballActivity.z1().z1(b.s.a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, ScheduledFootballActivity scheduledFootballActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = scheduledFootballActivity;
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
                C1317a c1317a = new C1317a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1317a, this) == y5bVar) {
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
    public xz60(ScheduledFootballActivity scheduledFootballActivity, lyh lyhVar, v1b v1bVar, ScheduledFootballActivity scheduledFootballActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = scheduledFootballActivity;
        this.c = lyhVar;
        this.d = scheduledFootballActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new xz60(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xz60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
