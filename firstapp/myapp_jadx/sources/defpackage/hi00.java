package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hi00 {
    public static final void a(final String str, final String str2, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        str.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1536496121);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            String strA = cb40.a(R.string.unique_codes__delete_booking_code_dialog_title, new Object[0], bVarI);
            op8 op8VarB = pp8.b(-476125250, new q6r(str, str2), bVarI);
            boolean z = (i2 & 896) == 256;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: fi00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            ra8.a(strA, op8VarB, null, null, null, null, false, null, null, (Function0) objY, function1, bVarI, 48, 6, 508);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, function0, function1, i) { // from class: gi00
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3073);
                    hi00.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
