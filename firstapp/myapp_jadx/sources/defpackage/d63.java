package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d63 implements Function1 {
    public final /* synthetic */ q73 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ng10 d;

    public /* synthetic */ d63(q73 q73Var, long j, boolean z, ng10 ng10Var) {
        this.a = q73Var;
        this.b = j;
        this.c = z;
        this.d = ng10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        q73 q73Var = this.a;
        q73Var.E.j();
        q73Var.A.f(true);
        if (!q73Var.L1) {
            q73Var.T1(new v03.s(r.d.DEFAULT_DRAG_ANIMATION_DURATION, baseResponse.bizCode, this.b, System.currentTimeMillis(), this.c));
        }
        q73Var.q0.j(new tg10(baseResponse, this.d));
        return Unit.a;
    }
}
