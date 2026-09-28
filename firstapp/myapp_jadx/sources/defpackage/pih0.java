package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.sportybet.plugin.realsports.live.data.UpcomingSpinnerMeta;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class pih0 implements fpy {
    public final /* synthetic */ sjd0 a;
    public final /* synthetic */ qih0 b;

    public pih0(sjd0 sjd0Var, qih0 qih0Var) {
        this.a = sjd0Var;
        this.b = qih0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Object tag = this.a.F.getTag();
        if (!(tag instanceof UpcomingSpinnerMeta)) {
            tag = null;
        }
        UpcomingSpinnerMeta upcomingSpinnerMeta = (UpcomingSpinnerMeta) tag;
        if (upcomingSpinnerMeta != null && i >= 0 && i < upcomingSpinnerMeta.getSpecifierList().size()) {
            djh0.a aVar = this.b.c;
            int eventPos = upcomingSpinnerMeta.getEventPos();
            String marketId = upcomingSpinnerMeta.getMarketId();
            String str = upcomingSpinnerMeta.getSpecifierList().get(i);
            aVar.getClass();
            marketId.getClass();
            str.getClass();
            djh0 djh0Var = djh0.this;
            try {
                zi50.a aVar2 = zi50.b;
                Object obj = djh0Var.m.get(eventPos);
                obj.getClass();
                ((ing) obj).d(marketId, str);
                djh0Var.d(eventPos);
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                zi50.a aVar3 = zi50.b;
            }
        }
    }
}
