package defpackage;

import android.view.View;
import com.sportybet.plugin.event.EventActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yhg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yhg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = EventActivity.U0;
                ((EventActivity) obj).onBackPressed();
                break;
            default:
                hv70.d dVar = ((hv70) obj).e;
                if (dVar != null) {
                    dVar.a();
                }
                break;
        }
    }
}
