package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.data.OutrightDisplayData;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o840 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView.d0 b;

    public /* synthetic */ o840(RecyclerView.d0 d0Var, int i) {
        this.a = i;
        this.b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jpy jpyVar;
        int i = this.a;
        RecyclerView.d0 d0Var = this.b;
        switch (i) {
            case 0:
                ((m840.b) d0Var).c();
                break;
            default:
                rhg0 rhg0Var = (rhg0) d0Var;
                Object tag = view.getTag();
                OutrightDisplayData outrightDisplayData = tag instanceof OutrightDisplayData ? (OutrightDisplayData) tag : null;
                if (outrightDisplayData != null && (jpyVar = rhg0Var.b) != null) {
                    jpyVar.a(outrightDisplayData.getEventId(), outrightDisplayData.getName());
                    break;
                }
                break;
        }
    }
}
