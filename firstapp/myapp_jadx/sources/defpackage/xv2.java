package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xv2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xv2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cw2 cw2Var = (cw2) obj;
                cw2Var.b.invoke(new y43.a.c(cw2Var.getBindingAdapterPosition()));
                break;
            default:
                QuickBetView quickBetView = (QuickBetView) obj;
                boolean z = QuickBetView.j1;
                WeakReference<Activity> weakReference = quickBetView.f;
                Activity activity = weakReference != null ? weakReference.get() : null;
                if (!quickBetView.N()) {
                    f8a0 f8a0Var = new f8a0(new op8(1983874543, new wox(new mw2(1)), true));
                    u1k.a aVar = u1k.b;
                    activity.getClass();
                    FragmentManager supportFragmentManager = ((fq0) activity).getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    aVar.getClass();
                    u1k.a.a(supportFragmentManager, f8a0Var);
                    break;
                }
                break;
        }
    }
}
