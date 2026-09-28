package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oz10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oz10(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj3;
                Context context = (Context) obj2;
                String str = (String) obj;
                xbg xbgVar = zy10Var.y0;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                String string = zy10Var.getString(R.string.label_dialog_tryagain);
                string.getClass();
                xbg.c(xbgVar, str, string, new yvx(zy10Var, 1), new pz10(), context.getColor(R.color.sh_error_btn_color), 224);
                xbgVar.a();
                return Unit.a;
            default:
                Activity activity = (Activity) obj3;
                Integer num = (Integer) obj2;
                ((use) obj).getClass();
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.setSoftInputMode(16);
                }
                return new dc60.b(num, activity);
        }
    }
}
