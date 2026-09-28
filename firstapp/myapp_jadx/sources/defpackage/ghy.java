package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ghy {
    public static final void a(final d dVar, final viy viyVar, final Function0 function0, final Function0 function1, final Function0 function2, final Function2 function3, final Function0 function4, a aVar, final int i) {
        int i2;
        viyVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(-833879501);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(viyVar) : bVarI.A(viyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function4) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            sgy sgyVar = viyVar.a;
            if (sgyVar instanceof ehy) {
                bVarI.N(1591271472);
                dhy.a(function0, bVarI, (i2 >> 6) & 14);
                bVarI.X(false);
            } else {
                if (!(sgyVar instanceof ziy)) {
                    throw igf0.a(bVarI, 1591268950, false);
                }
                bVarI.N(1591274210);
                UiText uiText = ((ziy) sgyVar).a;
                uiText.getClass();
                yiy.a((i2 >> 3) & 1008, bVarI, uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), function0, function1);
                bVarI.X(false);
            }
            bVarI.X(true);
            if (viyVar.c) {
                bVarI.N(-12617825);
                biy.a(viyVar.b, function2, function3, function4, bVarI, (i2 >> 9) & 8176);
                bVarI.X(false);
            } else {
                bVarI.N(-12387185);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fhy
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ghy.a(dVar, viyVar, function0, function1, function2, function3, function4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
