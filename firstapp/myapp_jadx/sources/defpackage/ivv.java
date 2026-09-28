package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.tabs.missions.MissionStateHandler$cancelMission$1", f = "MissionStateHandler.kt", l = {345}, m = "invokeSuspend", v = 2)
public final class ivv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nvv b;
    public final /* synthetic */ int c;
    public final /* synthetic */ et7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivv(nvv nvvVar, int i, et7 et7Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = nvvVar;
        this.c = i;
        this.d = et7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ivv(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ivv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        lrv aVar;
        UiText resourceUiText;
        String e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = null;
        nvv nvvVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = nvvVar.g;
            do {
                value = wwd0Var.getValue();
                aVar = (lrv) value;
                lrv.a aVar2 = aVar instanceof lrv.a ? (lrv.a) aVar : null;
                if (aVar2 != null) {
                    aVar = new lrv.a(aVar2.a, uxs.LOADING);
                }
            } while (!wwd0Var.g(value, aVar));
            qb6 qb6Var = nvvVar.c;
            long j = this.c;
            this.a = 1;
            obj = qb6Var.a.c(j, this);
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
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.c) {
            nvvVar.g.setValue(lrv.b.a);
            ku90<qsv> ku90Var = nvvVar.m;
            StringUiText stringUiText = vch0.a;
            ku90Var.a(new qsv.b(new ResourceUiText(R.string.page_loyalty__mission_cancel_success), true));
            nvvVar.b(this.d);
        } else {
            nvvVar.g.setValue(lrv.b.a);
            SprThrowable sprThrowableH = bm50.h(lk50Var);
            if (sprThrowableH != null && (e = sprThrowableH.getE()) != null && !StringsKt.U(e)) {
                str = e;
            }
            ku90<qsv> ku90Var2 = nvvVar.m;
            if (str != null) {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new StringUiText(str);
            } else {
                StringUiText stringUiText3 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.page_loyalty__mission_cancel_failed);
            }
            ku90Var2.a.a(new qsv.b(resourceUiText, false));
        }
        return Unit.a;
    }
}
