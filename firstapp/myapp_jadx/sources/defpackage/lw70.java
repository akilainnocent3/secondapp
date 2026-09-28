package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class lw70 implements fpy {
    public final /* synthetic */ fid0 a;
    public final /* synthetic */ mw70 b;

    public lw70(fid0 fid0Var, mw70 mw70Var) {
        this.a = fid0Var;
        this.b = mw70Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int iIntValue;
        fid0 fid0Var = this.a;
        ListenableSpinner listenableSpinner = fid0Var.G;
        ListenableSpinner listenableSpinner2 = fid0Var.G;
        Object tag = listenableSpinner.getTag(R.id.spinner_prev_selected_pos);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num == null || (iIntValue = num.intValue()) < 0 || iIntValue == i) {
            return;
        }
        Object tag2 = listenableSpinner2.getTag(R.id.live_event_pos);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Object tag3 = listenableSpinner2.getTag(R.id.live_event_specifiers);
            List list = tag3 instanceof List ? (List) tag3 : null;
            if (list == null) {
                return;
            }
            dw70 dw70Var = this.b.c;
            String str = (String) list.get(i);
            dw70Var.getClass();
            str.getClass();
            cw70 cw70Var = dw70Var.a;
            RegularMarketRule marketRule = cw70Var.k().getMarketRule();
            if (marketRule == null) {
                return;
            }
            ((Event) cw70Var.a.f.get(iIntValue2)).setSelectSpecifier(marketRule.a, str);
            cw70Var.notifyItemChanged(iIntValue2);
        }
    }
}
