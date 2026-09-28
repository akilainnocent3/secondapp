package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class odt {
    public static final chf a = new chf(a.a);

    public static final class a extends qlr implements Function0<nny> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final nny invoke() {
            return null;
        }
    }

    public static nny a(androidx.compose.runtime.a aVar) {
        nny nnyVar = (nny) aVar.O(a);
        Object obj = null;
        if (nnyVar == null) {
            aVar.N(544166745);
            View view = (View) aVar.O(AndroidCompositionLocals_androidKt.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    nnyVar = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                nny nnyVar2 = tag instanceof nny ? (nny) tag : null;
                if (nnyVar2 != null) {
                    nnyVar = nnyVar2;
                    break;
                }
                Object objA = abo.a(view);
                view = objA instanceof View ? (View) objA : null;
            }
            aVar.H();
        } else {
            aVar.N(544164296);
            aVar.H();
        }
        if (nnyVar != null) {
            aVar.N(544164377);
            aVar.H();
            return nnyVar;
        }
        aVar.N(544168748);
        for (Context baseContext = (Context) aVar.O(AndroidCompositionLocals_androidKt.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof nny) {
                obj = baseContext;
                break;
            }
        }
        nny nnyVar3 = (nny) obj;
        aVar.H();
        return nnyVar3;
    }
}
