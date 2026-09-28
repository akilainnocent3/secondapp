package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventActivity;
import com.sportybet.android.instantwin.presentation.racingevent.c;
import com.sportybet.android.instantwin.presentation.racingevent.d;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "InstantRacingEventActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class ttn extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ InstantRacingEventActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ InstantRacingEventActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "InstantRacingEventActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ InstantRacingEventActivity d;

        /* JADX INFO: renamed from: ttn$a$a, reason: collision with other inner class name */
        public static final class C1150a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ InstantRacingEventActivity b;

            public C1150a(v5b v5bVar, InstantRacingEventActivity instantRacingEventActivity) {
                this.b = instantRacingEventActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                d dVar = (d) t;
                int i = InstantRacingEventActivity.w;
                boolean z = dVar instanceof d.b;
                InstantRacingEventActivity instantRacingEventActivity = this.b;
                if (z) {
                    d.b bVar = (d.b) dVar;
                    if (bVar instanceof d.b.a) {
                        instantRacingEventActivity.finish();
                    } else if (bVar instanceof d.b.f) {
                        ej5.c(ebs.a(instantRacingEventActivity.getLifecycle()), null, null, new com.sportybet.android.instantwin.presentation.racingevent.a(instantRacingEventActivity, null), 3);
                    } else if (bVar instanceof d.b.C0313b) {
                        InstantWinBetHistoryInput instantWinBetHistoryInput = new InstantWinBetHistoryInput(((d.b.C0313b) bVar).a);
                        jlo jloVar = instantRacingEventActivity.f;
                        if (jloVar == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        instantRacingEventActivity.startActivity(jloVar.t(instantRacingEventActivity, instantWinBetHistoryInput));
                    } else if (bVar instanceof d.b.C0314d) {
                        ee<fqk> eeVar = instantRacingEventActivity.v;
                        if (eeVar != null) {
                            eeVar.b(((d.b.C0314d) bVar).a);
                        }
                    } else if (bVar instanceof d.b.g) {
                        d.b.g gVar = (d.b.g) bVar;
                        h0o h0oVar = new h0o(gVar.a, gVar.b);
                        jlo jloVar2 = instantRacingEventActivity.f;
                        if (jloVar2 == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        instantRacingEventActivity.startActivity(jloVar2.c(instantRacingEventActivity, h0oVar));
                    } else if (bVar instanceof d.b.h) {
                        instantRacingEventActivity.finish();
                        azm azmVar = instantRacingEventActivity.i;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.d(wae.VIRTUALS_LOBBY);
                    } else if (bVar instanceof d.b.c) {
                        azm azmVar2 = instantRacingEventActivity.i;
                        if (azmVar2 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar2.d(wae.DEPOSIT);
                    } else {
                        if (!(bVar instanceof d.b.e)) {
                            uhc.a();
                            return null;
                        }
                        azm azmVar3 = instantRacingEventActivity.i;
                        if (azmVar3 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar3.d(wae.HOME);
                    }
                } else if (dVar instanceof d.c) {
                    Iterator<T> it = ((d.c) dVar).a.iterator();
                    while (it.hasNext()) {
                        lnt.i(instantRacingEventActivity, (String) it.next());
                    }
                } else {
                    if (!(dVar instanceof d.a)) {
                        uhc.a();
                        return null;
                    }
                    if (instantRacingEventActivity.e == null) {
                        Intrinsics.n("bettingDeviceSecurityChecker");
                        throw null;
                    }
                    instantRacingEventActivity.z1().z1(c.k.a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, InstantRacingEventActivity instantRacingEventActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = instantRacingEventActivity;
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
                C1150a c1150a = new C1150a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1150a, this) == y5bVar) {
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
    public ttn(InstantRacingEventActivity instantRacingEventActivity, lyh lyhVar, v1b v1bVar, InstantRacingEventActivity instantRacingEventActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = instantRacingEventActivity;
        this.c = lyhVar;
        this.d = instantRacingEventActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new ttn(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ttn) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
