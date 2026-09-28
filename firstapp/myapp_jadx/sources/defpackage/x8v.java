package defpackage;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.data.Event;
import com.sportygames.commons.models.RainToastData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x8v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Event event = (Event) obj;
                event.getClass();
                ((Function1) obj2).invoke(new ot70.c(event));
                break;
            default:
                gw30 gw30Var = (gw30) obj2;
                ((View) obj).getClass();
                ssw<RainToastData> sswVar = qv30.b;
                tv30[] tv30VarArr = tv30.a;
                sswVar.j(new RainToastData(0, AnalyticsEvent.BI_TRACKING_KIND_ERROR, "", "", 3000L, 0, null, 0, 128, null));
                gw30Var.v.invoke(Boolean.TRUE);
                e activity = gw30Var.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.a0();
                }
                break;
        }
        return Unit.a;
    }
}
