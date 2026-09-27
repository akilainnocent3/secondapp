package yads;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.yandex.div.R;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ei0 implements ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f148711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f148712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io2 f148713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mi0 f148714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wi0 f148715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f148716f;

    public ei0(w02 w02Var, kz kzVar, at1 at1Var, mi0 mi0Var, wi0 wi0Var) {
        this.f148711a = w02Var;
        this.f148712b = kzVar;
        this.f148713c = at1Var;
        this.f148714d = mi0Var;
        this.f148715e = wi0Var;
    }

    public final void a(Context context) {
        gi0 gi0Var;
        Object next;
        String str;
        try {
            mi0 mi0Var = this.f148714d;
            w02 w02Var = this.f148711a;
            mi0Var.getClass();
            List listD = w02Var.d();
            if (listD != null) {
                Iterator it = listD.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        str = ((gi0) next).f149619a;
                        fg0[] fg0VarArr = fg0.f149100b;
                    }
                } while (!kotlin.jvm.internal.m0.g(str, "close_dialog"));
                gi0Var = (gi0) next;
            } else {
                gi0Var = null;
            }
            if (gi0Var == null) {
                this.f148712b.e();
                return;
            }
            dr.i0 i0VarB = dr.k0.b(new fi0(context, null));
            wi0 wi0Var = this.f148715e;
            DivConfiguration divConfiguration = (DivConfiguration) i0VarB.getValue();
            wi0Var.getClass();
            AttributeSet attributeSet = null;
            int i10 = 0;
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R.style.Div), divConfiguration, 0, null, 4, null), attributeSet, i10, 6, null);
            div2View.setTag("");
            Dialog dialog = new Dialog(context, com.yandex.mobile.ads.R.style.MonetizationAdsInternal_FullscreenDialog);
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yads.b04
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ei0.a(this.f147003b, dialogInterface);
                }
            });
            div2View.setActionHandler(new nw(new mw(dialog, this.f148712b)));
            div2View.setData(gi0Var.f149623e, gi0Var.f149624f);
            dialog.setContentView(div2View);
            this.f148716f = dialog;
            dialog.show();
        } catch (Throwable th2) {
            this.f148713c.reportError("Failed to show DivKit close dialog", th2);
        }
    }

    public static final void a(ei0 ei0Var, DialogInterface dialogInterface) {
        ei0Var.f148716f = null;
    }
}
