package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.presentation.showoff.model.InstantVirtualShowOffType;
import com.sportybet.android.instantwin.presentation.ticketdetail.InstantWinTicketDetailActivity;
import com.sportybet.android.instantwin.presentation.ticketdetail.c;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.InstantWinTicketDetailActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "InstantWinTicketDetailActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class fmo extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ InstantWinTicketDetailActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ InstantWinTicketDetailActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.InstantWinTicketDetailActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "InstantWinTicketDetailActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ InstantWinTicketDetailActivity d;

        /* JADX INFO: renamed from: fmo$a$a, reason: collision with other inner class name */
        public static final class C0574a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ InstantWinTicketDetailActivity b;

            public C0574a(v5b v5bVar, InstantWinTicketDetailActivity instantWinTicketDetailActivity) {
                this.b = instantWinTicketDetailActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                c cVar = (c) t;
                int i = InstantWinTicketDetailActivity.e;
                boolean z = cVar instanceof c.b;
                InstantWinTicketDetailActivity instantWinTicketDetailActivity = this.b;
                if (z) {
                    c.b bVar = (c.b) cVar;
                    if (bVar instanceof c.b.a) {
                        instantWinTicketDetailActivity.finish();
                    } else if (bVar instanceof c.b.C0348b) {
                        c.b.C0348b c0348b = (c.b.C0348b) bVar;
                        if (c0348b.a) {
                            azm azmVar = instantWinTicketDetailActivity.d;
                            if (azmVar == null) {
                                Intrinsics.n("router");
                                throw null;
                            }
                            azmVar.d(wae.ME);
                        }
                        wae waeVar = c0348b.b;
                        if (waeVar != null) {
                            azm azmVar2 = instantWinTicketDetailActivity.d;
                            if (azmVar2 == null) {
                                Intrinsics.n("router");
                                throw null;
                            }
                            azmVar2.f(waeVar, c0348b.c);
                        }
                        instantWinTicketDetailActivity.finish();
                    } else {
                        if (!(bVar instanceof c.b.C0349c)) {
                            uhc.a();
                            return null;
                        }
                        azm azmVar3 = instantWinTicketDetailActivity.d;
                        if (azmVar3 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        wae waeVar2 = wae.TRANS_SEARCH;
                        List listA = c5j0.a(AnalyticsParam.EVENT_PARAM_ID, ((c.b.C0349c) bVar).a);
                        fag fagVar = fag.PAYSLIP_IV_SHORTCUT;
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("EXTRA_ENTRANCE", fagVar);
                        azmVar3.j(waeVar2, listA, bundle);
                    }
                } else {
                    if (!(cVar instanceof c.a)) {
                        uhc.a();
                        return null;
                    }
                    c.a aVar = (c.a) cVar;
                    String str = aVar.a;
                    InstantVirtualShowOffType.TicketWithoutCompleteInfo ticketWithoutCompleteInfo = new InstantVirtualShowOffType.TicketWithoutCompleteInfo(aVar.b);
                    q5o q5oVar = new q5o();
                    q5oVar.setArguments(vj5.a(new Pair("ARG_TYPE", ticketWithoutCompleteInfo), new Pair("ARG_SPORT_ID", str)));
                    FragmentManager supportFragmentManager = instantWinTicketDetailActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    q5oVar.show(supportFragmentManager, "InstantVirtualShowOffDialogFragment");
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, InstantWinTicketDetailActivity instantWinTicketDetailActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = instantWinTicketDetailActivity;
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
                C0574a c0574a = new C0574a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0574a, this) == y5bVar) {
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
    public fmo(InstantWinTicketDetailActivity instantWinTicketDetailActivity, lyh lyhVar, v1b v1bVar, InstantWinTicketDetailActivity instantWinTicketDetailActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = instantWinTicketDetailActivity;
        this.c = lyhVar;
        this.d = instantWinTicketDetailActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new fmo(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fmo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
