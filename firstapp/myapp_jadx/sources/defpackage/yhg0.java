package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.common.framework.network.HTTPResponse;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.viewmodel.TournamentViewModel$joinTournament$1", f = "TournamentViewModel.kt", l = {139}, m = "invokeSuspend", v = 1)
public final class yhg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ aig0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhg0(aig0 aig0Var, long j, v1b<? super yhg0> v1bVar) {
        super(2, v1bVar);
        this.b = aig0Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yhg0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yhg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        aig0 aig0Var = this.b;
        ssw<gzs<HTTPResponse<String>>> sswVar = aig0Var.d;
        y5b y5bVar = y5b.a;
        int i = this.a;
        String lowerCase = null;
        long j = this.c;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new gzs<>(wzd0.a, null, null, null, 30));
            uzm uzmVar = aig0Var.c;
            this.a = 1;
            obj = uzmVar.a(j, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        hk50 hk50Var = (hk50) obj;
        if (hk50Var instanceof hk50.c) {
            hk50.c cVar = (hk50.c) hk50Var;
            HTTPResponse hTTPResponse = (HTTPResponse) cVar.a;
            if (hTTPResponse != null && (str = (String) hTTPResponse.getData()) != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            if (Intrinsics.g(lowerCase, AnalyticsParam.EVENT_PARAM_SUCCESS)) {
                wwd0 wwd0Var = aig0Var.f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, yi80.f((Set) value, new Long(j))));
            }
            sswVar.j(new gzs<>(wzd0.b, cVar.a, null, null, 28));
        } else if (hk50Var instanceof hk50.a) {
            sswVar.j(new gzs<>(wzd0.c, null, (hk50.a) hk50Var, null, 26));
        } else {
            hk50.b bVar = hk50.b.a;
            if (!Intrinsics.g(hk50Var, bVar)) {
                uhc.a();
                return null;
            }
            sswVar.j(new gzs<>(wzd0.c, null, null, bVar, 22));
        }
        return Unit.a;
    }
}
