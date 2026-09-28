package defpackage;

import android.webkit.WebView;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jgz implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jgz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                h8f0 h8f0Var = (h8f0) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    WebView webView = h8f0Var != null ? h8f0Var.a : null;
                    boolean zM = aVar.M(h8f0Var);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new wfz(h8f0Var, 0);
                        aVar.r(objY);
                    }
                    c0j0.a(webView, (Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                Function0 function0 = (Function0) obj4;
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c6n.a(function0, g3w.h(d.a.b, "home_button"), false, null, null, b2a.c, aVar2, 1572912, 60);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
