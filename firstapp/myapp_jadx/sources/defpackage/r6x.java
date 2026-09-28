package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.patron.NINInfo;
import com.sporty.android.core.model.patron.NINInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationViewModel$fetchNINInfo$1", f = "NINVerificationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r6x extends tje0 implements Function2<lk50<? extends NINInfoResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ s6x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6x(s6x s6xVar, v1b<? super r6x> v1bVar) {
        super(2, v1bVar);
        this.b = s6xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r6x r6xVar = new r6x(this.b, v1bVar);
        r6xVar.a = obj;
        return r6xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends NINInfoResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((r6x) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        p6x p6xVar;
        int ninStatus;
        ijf0 ijf0Var;
        String ninNumber;
        String ninDescription;
        Object value3;
        wwd0 wwd0Var = this.b.v;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            NINInfoResponse nINInfoResponse = (NINInfoResponse) ((lk50.c) lk50Var).a;
            if (nINInfoResponse.getNinStatus() == 100) {
                itf0.a aVar = itf0.a;
                aVar.q("NINVerificationViewModel");
                aVar.a("fetchNINInfo1: " + lk50Var, new Object[0]);
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, p6x.a((p6x) value3, null, null, nINInfoResponse.getNinStatus(), false, false, false, 0, null, 507)));
            } else {
                do {
                    value2 = wwd0Var.getValue();
                    p6xVar = (p6x) value2;
                    ninStatus = nINInfoResponse.getNinStatus();
                    NINInfo ninInfo = nINInfoResponse.getNinInfo();
                    if (ninInfo == null || (ninNumber = ninInfo.getNinNumber()) == null) {
                        ninNumber = "";
                    }
                    ijf0Var = new ijf0(ninNumber, 0L, 6);
                    ninDescription = nINInfoResponse.getNinDescription();
                } while (!wwd0Var.g(value2, p6x.a(p6xVar, ijf0Var, null, ninStatus, false, false, false, 0, ninDescription == null ? "" : ninDescription, r.d.DEFAULT_SWIPE_ANIMATION_DURATION)));
            }
        } else if (lk50Var instanceof lk50.a) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, p6x.a((p6x) value, null, null, 0, false, true, false, 0, null, 495)));
        }
        return Unit.a;
    }
}
