package defpackage;

import android.view.View;
import com.sportygames.sportysoccer.widget.StakeLayout;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c5j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                u6jVar.d1(u6jVar.getActivity());
                break;
            default:
                int i2 = StakeLayout.S;
                ((StakeLayout) obj).G();
                break;
        }
    }
}
