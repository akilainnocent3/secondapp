package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class dfe {
    public static final void a(efe efeVar, Function0<Unit> function0, Function0<Unit> function1, a aVar, final int i) {
        final efe efeVar2;
        final Function0<Unit> function2 = function0;
        final Function0<Unit> function3 = function1;
        efeVar.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(-189428906);
        int i2 = i | (bVarI.M(efeVar) ? 4 : 2) | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function3) ? 256 : 128);
        if (!bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            efeVar2 = efeVar;
            bVarI.G();
        } else if (efeVar instanceof efe.c) {
            bVarI.N(310721017);
            String strA = cb40.a(R.string.device_management__log_out_device_dialog_title, new Object[0], bVarI);
            String strA2 = cb40.a(R.string.device_management__log_out_device_dialog_message, new Object[0], bVarI);
            alb0 alb0Var = qdf0.a;
            ryj ryjVarA = syj.a(0L, 0L, 0L, qdf0.a(384, 2, ((lib0) bVarI.O(oib0.a)).j, bVarI), null, bVarI, 23);
            bVarI = bVarI;
            int i3 = (i2 >> 3) & 112;
            int i4 = i2 << 3;
            nzj.d(strA, strA2, null, ryjVarA, cb40.a(R.string.common_functions__logout_action, new Object[0], bVarI), null, null, null, null, null, function3, function2, function1, null, bVarI, 0, i3 | (i4 & 896) | (i4 & 7168), 18388);
            bVarI.X(false);
            efeVar2 = efeVar;
            function2 = function0;
            function3 = function1;
        } else {
            if (efeVar instanceof efe.a) {
                bVarI.N(311525157);
                String strA3 = cb40.a(R.string.device_management__block_device_dialog_title, new Object[0], bVarI);
                String strA4 = cb40.a(R.string.device_management__block_device_dialog_message, new Object[0], bVarI);
                alb0 alb0Var2 = qdf0.a;
                int i5 = (i2 >> 3) & 112;
                int i6 = i2 << 3;
                function2 = function0;
                function3 = function1;
                nzj.d(strA3, strA4, null, syj.a(0L, 0L, 0L, qdf0.a(384, 2, ((lib0) bVarI.O(oib0.a)).j, bVarI), null, bVarI, 23), cb40.a(R.string.common_functions__block, new Object[0], bVarI), null, null, null, null, null, function3, function2, function1, null, bVarI, 0, i5 | (i6 & 896) | (i6 & 7168), 18388);
                bVarI.X(false);
            } else if (efeVar instanceof efe.e) {
                bVarI.N(312312743);
                int i7 = (i2 >> 3) & 112;
                int i8 = i2 << 3;
                function2 = function0;
                function3 = function1;
                nzj.d(cb40.a(R.string.device_management__unblock_device_dialog_title, new Object[0], bVarI), cb40.a(R.string.device_management__unblock_device_dialog_message, new Object[0], bVarI), null, null, cb40.a(R.string.common_functions__unblock, new Object[0], bVarI), null, null, null, null, null, function3, function2, function1, null, bVarI, 0, i7 | (i8 & 896) | (i8 & 7168), 18396);
                bVarI.X(false);
            } else if (efeVar instanceof efe.d) {
                bVarI.N(312896690);
                String strA5 = cb40.a(R.string.device_management__log_out_other_devices_dialog_title, new Object[0], bVarI);
                String strA6 = cb40.a(R.string.device_management__log_out_other_devices_dialog_message, new Object[0], bVarI);
                alb0 alb0Var3 = qdf0.a;
                int i9 = (i2 >> 3) & 112;
                int i10 = i2 << 3;
                function2 = function0;
                function3 = function1;
                nzj.d(strA5, strA6, null, syj.a(0L, 0L, 0L, qdf0.a(384, 2, ((lib0) bVarI.O(oib0.a)).j, bVarI), null, bVarI, 23), cb40.a(R.string.device_management__log_out_other_devices_dialog_btn_text, new Object[0], bVarI), null, null, null, null, null, function3, function2, function1, null, bVarI, 0, i9 | (i10 & 896) | (i10 & 7168), 18388);
                bVarI.X(false);
            } else {
                function2 = function0;
                function3 = function1;
                efeVar2 = efeVar;
                if (!efeVar2.equals(efe.b.a)) {
                    throw igf0.a(bVarI, -1652544754, false);
                }
                bVarI.N(313708704);
                bVarI.X(false);
            }
            efeVar2 = efeVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function3, i) { // from class: cfe
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dfe.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
