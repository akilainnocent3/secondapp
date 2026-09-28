package defpackage;

import android.view.View;
import com.sportybet.plugin.event.EventActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vy7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vy7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                az7 az7Var = (az7) obj;
                az7Var.c(az7Var.v);
                az7Var.g();
                az7Var.f();
                break;
            default:
                EventActivity eventActivity = (EventActivity) obj;
                int i2 = EventActivity.U0;
                if (eventActivity.J1()) {
                    eventActivity.H1();
                }
                sh8.c().e(o7d.a(wae.HOME));
                break;
        }
    }
}
