package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g9g {

    public static final /* synthetic */ class a extends saj implements Function1<uwz, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(uwz uwzVar) {
            Object value;
            h9g h9gVar;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            uwz uwzVar2 = uwzVar;
            uwzVar2.getClass();
            p9g p9gVar = (p9g) this.receiver;
            wwd0 wwd0Var = p9gVar.w;
            if (uwzVar2 instanceof uwz.c) {
                ijf0 ijf0Var = ((uwz.c) uwzVar2).a;
                v340 v340Var = p9gVar.y;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, h9g.a((h9g) value2, ijf0Var, null, null, null, false, null, 62)));
                if (ijf0Var.a.b.length() == 0) {
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, h9g.a((h9g) value5, null, null, vch0.a, uxs.DISABLE, false, null, 51)));
                } else if (ijf0Var.equals(((h9g) v340Var.a.getValue()).b) && ((h9g) v340Var.a.getValue()).g) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, h9g.a((h9g) value4, null, null, null, uxs.DISABLE, false, null, 55)));
                } else {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, h9g.a((h9g) value3, null, new ijf0((String) null, 0L, 7), vch0.a, uxs.ENABLE, false, null, 49)));
                }
            } else if (uwzVar2 instanceof uwz.a) {
                ej5.c(o8i0.d(p9gVar), null, null, new o9g(p9gVar, null), 3);
            } else if (uwzVar2 instanceof uwz.b) {
                ej5.c(o8i0.d(p9gVar), null, null, new m9g(p9gVar, null), 3);
            } else {
                if (!(uwzVar2 instanceof uwz.d)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                    h9gVar = (h9g) value;
                } while (!wwd0Var.g(value, h9g.a(h9gVar, null, null, null, null, !h9gVar.e, null, 47)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p9g p9gVar, Function0<Unit> function0, Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        final p9g p9gVar2;
        b bVar;
        char c;
        int i2;
        int i3;
        final Function0<Unit> function2 = function0;
        final Function0<Unit> function3 = function1;
        p9gVar.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(-170072764);
        int i4 = i | (bVarI.A(p9gVar) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function3) ? 256 : 128);
        int i5 = 1;
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            ytw ytwVarC = wyh.c(p9gVar.y, bVarI, 0, 7);
            if (((h9g) ytwVarC.getValue()).f instanceof d9g.a) {
                bVarI.N(1423952956);
                d9g d9gVar = ((h9g) ytwVarC.getValue()).f;
                d9gVar.getClass();
                String strA = cb40.a(R.string.common_functions__error, new Object[0], bVarI);
                UiText uiText = ((d9g.a) d9gVar).a;
                uiText.getClass();
                int i6 = (i4 << 3) & 896;
                c = 4;
                i2 = 0;
                nzj.b(null, strA, uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, null, null, null, null, null, null, null, null, function2, null, bVarI, 0, i6, 12281);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                c = 4;
                i2 = 0;
                bVarI.N(1424200894);
                bVarI.X(false);
            }
            ijf0 ijf0Var = ((h9g) ytwVarC.getValue()).a;
            uxs uxsVar = ((h9g) ytwVarC.getValue()).d;
            boolean z = ((h9g) ytwVarC.getValue()).g;
            UiText uiText2 = ((h9g) ytwVarC.getValue()).c;
            boolean z2 = ((h9g) ytwVarC.getValue()).e;
            if ((i4 & 14) != c && !bVarI.A(p9gVar)) {
                i5 = i2;
            }
            Object objY = bVarI.y();
            if (i5 != 0 || objY == androidx.compose.runtime.a.C0041a.a) {
                i3 = i2;
                objY = new a(1, p9gVar, p9g.class, "handlePasswordVerificationAction", "handlePasswordVerificationAction(Lcom/sporty/android/compose/ui/password/PasswordVerificationAction;)V", 0);
                bVarI.r(objY);
            } else {
                i3 = i2;
            }
            p9gVar2 = p9gVar;
            ywz.a(ijf0Var, uxsVar, z, uiText2, z2, (Function1) ((chp) objY), cb40.a(R.string.common_functions__verify_identity_enter_password_default_description, new Object[i3], bVarI), function0, function1, bVarI, (i4 << 18) & 264241152, 0);
            function2 = function0;
            function3 = function1;
            bVar = bVarI;
        } else {
            i = i;
            p9gVar2 = p9gVar;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function3, i) { // from class: f9g
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    g9g.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
