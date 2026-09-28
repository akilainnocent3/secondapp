package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class di2 {
    public static final void a(final ei2 ei2Var, final Function0<Unit> function0, a aVar, final int i) {
        Function0<Unit> function1;
        ei2Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-172182528);
        int i2 = (bVarI.A(ei2Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            function1 = function0;
            bVarI.G();
        } else {
            if (!(ei2Var instanceof ei2.b)) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2(function0, i) { // from class: ai2
                        public final /* synthetic */ Function0 b;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(9);
                            di2.a(this.a, this.b, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            ei2.b bVar = (ei2.b) ei2Var;
            qcn<hi2> qcnVarB = bVar.b;
            int i3 = bVar.a;
            boolean zD = bVarI.d(i3) | bVarI.M(qcnVarB);
            Object objY = bVarI.y();
            if (zD || objY == a.C0041a.a) {
                if (i3 != 1) {
                    qcnVarB = a4h.b(CollectionsKt.O(qcnVarB, i3 - 1));
                }
                bVarI.r(qcnVarB);
                objY = qcnVarB;
            }
            qcn<hi2> qcnVar = (qcn) objY;
            if (qcnVar.isEmpty()) {
                e eVarZ2 = bVarI.Z();
                if (eVarZ2 != null) {
                    eVarZ2.d = new Function2(function0, i) { // from class: bi2
                        public final /* synthetic */ Function0 b;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(9);
                            di2.a(this.a, this.b, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            bVarI.N(2036330553);
            ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
            for (hi2 hi2Var : qcnVar) {
                ResourceUiText resourceUiText = hi2Var.a;
                qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                arrayList.add(new ezg0(resourceUiText.g((Context) bVarI.O(qyd0Var)), hi2Var.b.g((Context) bVarI.O(qyd0Var))));
            }
            bVarI.X(false);
            function1 = function0;
            bzg0.b(tug.a(cb40.a(R.string.wap_me__how_to_play, new Object[0], bVarI), " ", cb40.a(R.string.bet_builder__bet_builder, new Object[0], bVarI)), arrayList, function1, null, "bet_builder_tutorial", null, 0.0f, bVarI, ((i2 << 3) & 896) | 196608, 216);
        }
        e eVarZ3 = bVarI.Z();
        if (eVarZ3 != null) {
            eVarZ3.d = new ci2(ei2Var, function1, i);
        }
    }
}
