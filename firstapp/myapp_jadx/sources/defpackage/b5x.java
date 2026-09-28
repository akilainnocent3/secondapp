package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b5x {
    public static final void a(d dVar, final Context context, final fjf0 fjf0Var, final boolean z, a aVar, final int i) {
        b bVar;
        final d dVar2;
        ycg.b bVar2;
        UiText resourceUiText;
        context.getClass();
        fjf0Var.getClass();
        b bVarI = aVar.i(978360426);
        int i2 = i | 6 | (bVarI.A(context) ? 32 : 16) | (bVarI.M(fjf0Var) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVarE = c9j.e(h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13));
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new Function1() { // from class: y4x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        j5i j5iVar = (j5i) obj;
                        j5iVar.getClass();
                        boolean zA = j5iVar.a();
                        fjf0 fjf0Var2 = fjf0Var;
                        ytw ytwVar = fjf0Var2.e;
                        ytw ytwVar2 = fjf0Var2.d;
                        ((x5a0) ytwVar).setValue(Boolean.valueOf(zA));
                        if (zA) {
                            ((x5a0) ytwVar2).setValue(Boolean.TRUE);
                        }
                        if (!j5iVar.a() && ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue()) {
                            ((x5a0) fjf0Var2.f).setValue(Boolean.TRUE);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarH = g3w.h(androidx.compose.ui.focus.a.a(dVarE, (Function1) objY), "withdraw_nin_dialog_nin_field");
            ijf0 ijf0VarA = fjf0Var.a();
            if (fjf0Var.b()) {
                if (fjf0Var.b()) {
                    resourceUiText = fjf0Var.b.invoke(fjf0Var.a().a.b);
                } else {
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong);
                }
                resourceUiText.getClass();
                bVar2 = new ycg.b(resourceUiText.e(context).toString());
            } else {
                bVar2 = new ycg.b("", "error_text");
            }
            String strA = cb40.a(R.string.identity_verification__enter_nin, new Object[0], bVarI);
            boolean zB = fjf0Var.b();
            gop gopVar = new gop(3, 0, 123);
            v6x v6xVar = new v6x();
            boolean z3 = i3 == 256;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: z4x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var = (ijf0) obj;
                        ijf0Var.getClass();
                        if (ijf0Var.a.b.length() <= 11) {
                            fjf0 fjf0Var2 = fjf0Var;
                            fjf0Var2.getClass();
                            ((x5a0) fjf0Var2.c).setValue(ijf0Var);
                            if (((Boolean) ((x5a0) fjf0Var2.d).getValue()).booleanValue()) {
                                ((x5a0) fjf0Var2.f).setValue(Boolean.TRUE);
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            bVar = bVarI;
            jr7.a(dVarH, ijf0VarA, qf9.a, zB, bVar2, z, strA, null, null, gopVar, v6xVar, 0, null, null, (Function1) objY2, bVar, 805306752 | ((i2 << 6) & 458752), 0, 14720);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(context, fjf0Var, z, i) { // from class: a5x
                public final /* synthetic */ Context b;
                public final /* synthetic */ fjf0 c;
                public final /* synthetic */ boolean d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    b5x.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
