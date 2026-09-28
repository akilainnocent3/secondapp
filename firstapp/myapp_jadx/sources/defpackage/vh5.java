package defpackage;

import android.os.Bundle;
import android.util.Pair;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.presentation.ticketdetail.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoTicketDetailFragment$setupViewModel$$inlined$collectWithLifecycle$1", f = "BuildAndGoTicketDetailFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class vh5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ wh5 d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoTicketDetailFragment$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "BuildAndGoTicketDetailFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ wh5 d;

        /* JADX INFO: renamed from: vh5$a$a, reason: collision with other inner class name */
        public static final class C1212a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ wh5 b;

            public C1212a(v5b v5bVar, wh5 wh5Var) {
                this.b = wh5Var;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                c cVar = (c) t;
                if (cVar instanceof c.b.C0349c) {
                    azm azmVar = this.b.i;
                    if (azmVar == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    wae waeVar = wae.TRANS_SEARCH;
                    Pair<String, String>[] pairArr = {new Pair(AnalyticsParam.EVENT_PARAM_ID, ((c.b.C0349c) cVar).a)};
                    fag fagVar = fag.PAYSLIP_IV_SHORTCUT;
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("EXTRA_ENTRANCE", fagVar);
                    azmVar.k(waeVar, pairArr, bundle);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, wh5 wh5Var) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = wh5Var;
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
                C1212a c1212a = new C1212a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1212a, this) == y5bVar) {
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
    public vh5(ibs ibsVar, lyh lyhVar, v1b v1bVar, wh5 wh5Var) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = wh5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new vh5(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vh5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
