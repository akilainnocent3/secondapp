package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.sportybet.plugin.realsports.prematch.data.SpinnerMeta;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;

/* JADX INFO: loaded from: classes7.dex */
public final class tms implements fpy {
    public final /* synthetic */ ListenableSpinner a;
    public final /* synthetic */ xms b;

    public tms(ListenableSpinner listenableSpinner, xms xmsVar) {
        this.a = listenableSpinner;
        this.b = xmsVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Object tag = this.a.getTag();
        if (!(tag instanceof SpinnerMeta)) {
            tag = null;
        }
        SpinnerMeta spinnerMeta = (SpinnerMeta) tag;
        if (spinnerMeta == null || spinnerMeta.getLastSelectedPos() < 0 || spinnerMeta.getLastSelectedPos() == i) {
            return;
        }
        String str = spinnerMeta.getSpecifierList().get(i);
        tf20.c cVar = this.b.b;
        String id = spinnerMeta.getId();
        int eventPos = spinnerMeta.getEventPos();
        cVar.getClass();
        id.getClass();
        str.getClass();
        tf20.E.put(id, str);
        tf20.this.notifyItemChanged(eventPos);
    }
}
