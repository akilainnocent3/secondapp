package defpackage;

import android.view.View;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.widget.StakeLayout;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b5j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hpa0 hpa0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                u6jVar.d1(u6jVar.getActivity());
                break;
            default:
                StakeLayout stakeLayout = (StakeLayout) obj;
                int i2 = StakeLayout.S;
                stakeLayout.E(stakeLayout.J.get(Integer.valueOf(view.getId())));
                stakeLayout.H();
                GameActivity.c cVar = stakeLayout.I;
                if (cVar != null && !cVar.a && (hpa0Var = GameActivity.this.B) != null) {
                    hpa0Var.a(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, false, false);
                    break;
                }
                break;
        }
    }
}
