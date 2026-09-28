package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lcb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lcb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj3;
                Context context = (Context) obj2;
                String str = (String) obj;
                str.getClass();
                xbg xbgVar = fgbVar.G0;
                if (xbgVar != null) {
                    String string = fgbVar.getString(R.string.label_dialog_tryagain);
                    string.getClass();
                    xbg.c(xbgVar, str, string, new ucb(fgbVar, 0), new vcb(), context.getColor(R.color.sh_error_btn_color), 224);
                    xbgVar.a();
                }
                break;
            default:
                ytw ytwVar = (ytw) obj3;
                ytw ytwVar2 = (ytw) obj2;
                ukf0 ukf0Var = (ukf0) obj;
                ukf0Var.getClass();
                if (ukf0Var.e()) {
                    imf0 imf0Var = (imf0) ytwVar.getValue();
                    long j = ((imf0) ytwVar.getValue()).a.b;
                    d2l.a(j);
                    ytwVar.setValue(imf0.b(imf0Var, 0L, gkw.a(0.9f, j, 1095216660480L & j), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213));
                } else {
                    ytwVar2.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.a;
    }
}
