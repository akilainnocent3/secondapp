package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.sportybet.plugin.realsports.prematch.data.LiveEventData;
import com.sportybet.plugin.realsports.prematch.data.SpinnerMeta;

/* JADX INFO: loaded from: classes7.dex */
public final class x2p implements fpy {
    public final /* synthetic */ fid0 a;
    public final /* synthetic */ y2p b;

    public x2p(fid0 fid0Var, y2p y2pVar) {
        this.a = fid0Var;
        this.b = y2pVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        LiveEventData liveEventData = this.b.d;
        Object tag = this.a.G.getTag();
        if (!(tag instanceof SpinnerMeta)) {
            tag = null;
        }
        SpinnerMeta spinnerMeta = (SpinnerMeta) tag;
        if (spinnerMeta == null || spinnerMeta.getLastSelectedPos() < 0 || spinnerMeta.getLastSelectedPos() == i) {
            return;
        }
        liveEventData.getEvent().setSelectSpecifier(liveEventData.getSelectedMarket().a, spinnerMeta.getSpecifierList().get(i));
        liveEventData.getListener().f(spinnerMeta.getEventPos());
    }
}
