package defpackage;

import android.content.Intent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h440 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h440(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                o540 o540Var = (o540) obj2;
                String str = (String) obj;
                str.getClass();
                Intent intent = new Intent(o540Var.requireContext(), (Class<?>) RSportsBetTicketDetailsActivity.class);
                intent.putExtra(AnalyticsParam.SOCIAL_ORDER_ID, str);
                o540Var.startActivity(intent);
                return Unit.a;
            default:
                nm80 nm80Var = (nm80) obj2;
                String str2 = (String) obj;
                str2.getClass();
                m2l m2lVar = nm80Var.d;
                m2lVar.getClass();
                return e1i.e(m2lVar.a.getBooleanByFlow(str2, true), o8i0.d(nm80Var), new mwd0(0L, Long.MAX_VALUE), Boolean.TRUE);
        }
    }
}
