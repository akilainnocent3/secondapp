package defpackage;

import android.view.View;
import com.sportybet.plugin.event.EventActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bjg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bjg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bi6 bi6Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                be7 be7Var = ((EventActivity) obj).C0;
                if (be7Var != null) {
                    be7Var.D.m(ad7.b);
                    return;
                } else {
                    Intrinsics.n("chatroomViewModel");
                    throw null;
                }
            default:
                gwu gwuVar = (gwu) obj;
                Object tag = view.getTag();
                pl6 pl6Var = (pl6) (tag instanceof pl6 ? tag : null);
                if (pl6Var == null || (bi6Var = gwuVar.b) == null) {
                    return;
                }
                bi6Var.a.i(pl6Var, true);
                return;
        }
    }
}
