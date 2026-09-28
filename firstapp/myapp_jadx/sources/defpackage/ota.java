package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.widget.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ota implements ooy, wz0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ota(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.ooy
    public void a() {
        d.b bVar = (d.b) this.a;
        py1 py1Var = (py1) this.b;
        d dVar = d.this;
        zsb zsbVar = d.v0;
        dVar.X.setText(R.string.common_functions__confirm);
        dVar.X.setEnabled(true);
        py1Var.showPermissionDeniedMessage();
    }

    @Override // defpackage.wz0
    public qis apply(Object obj) {
        hpe0 hpe0Var = (hpe0) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        List list = (List) obj;
        pgt.a("SyncCaptureSessionBase", "[" + hpe0Var + "] getSurface done with results: " + list);
        if (list.isEmpty()) {
            return new fcn.a(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return list.contains(null) ? new fcn.a(new ijd.a((ijd) arrayList.get(list.indexOf(null)), "Surface closed")) : obj.c(list);
    }
}
