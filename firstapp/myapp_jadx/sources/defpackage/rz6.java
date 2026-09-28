package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class rz6 {
    public static final void a(final UiText uiText, final UiText uiText2, final UiText uiText3, final UiText uiText4, final uxs uxsVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, a aVar, final int i) {
        b bVarA = yoh0.a(function0, function1, function2, aVar, -1704857424);
        int i2 = i | (bVarA.M(uiText) ? 4 : 2) | (bVarA.M(uiText2) ? 32 : 16) | (bVarA.M(uiText3) ? 256 : 128) | (bVarA.M(uiText4) ? 2048 : 1024) | (bVarA.d(uxsVar.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarA.A(function0) ? 131072 : 65536) | (bVarA.A(function1) ? 1048576 : 524288) | (bVarA.A(function2) ? 8388608 : 4194304);
        if (bVarA.q(i2 & 1, (4793491 & i2) != 4793490)) {
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarA.O(qyd0Var)).o;
            long j2 = ((lib0) bVarA.O(qyd0Var)).b1;
            long j3 = ((lib0) bVarA.O(qyd0Var)).o;
            qyd0 qyd0Var2 = ejb0.a;
            jib0.f(null, uiText, null, uiText2, null, function2, j2, j3, j, null, null, m65.a.a(0.0f, ((cjb0) bVarA.O(qyd0Var2)).e, ((cjb0) bVarA.O(qyd0Var2)).h, ((cjb0) bVarA.O(qyd0Var2)).f, bVarA, 9), new z45.d(new w45.b(pp8.b(-1117978925, new gaj() { // from class: oz6
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    d dVar = (d) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    dVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(dVar) ? 4 : 2;
                    }
                    int i3 = iIntValue;
                    if (aVar2.q(i3 & 1, (i3 & 19) != 18)) {
                        String strG = uiText3.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b));
                        alb0 alb0Var = sya.a;
                        qyd0 qyd0Var3 = cst.e;
                        long j4 = ((ast) aVar2.O(qyd0Var3)).E;
                        qyd0 qyd0Var4 = oib0.a;
                        aza.a(dVar, strG, uxsVar, null, sya.c, sya.a(j4, ((lib0) aVar2.O(qyd0Var4)).o, 0L, 0L, aVar2, 24576, 12), sya.c(((ast) aVar2.O(qyd0Var3)).E, ((lib0) aVar2.O(qyd0Var4)).o, aVar2, 384, 0), "confirm", function0, null, aVar2, (i3 & 14) | 12582912, 520);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA)), new w45.b(pp8.b(1720575316, new gaj() { // from class: pz6
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    d dVar = (d) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    dVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(dVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        alb0 alb0Var = qdf0.a;
                        ak5 ak5VarA = qdf0.a(384, 2, ((ast) aVar2.O(cst.e)).E, aVar2);
                        alb0 alb0Var2 = qdf0.c;
                        final UiText uiText5 = uiText4;
                        ddd0.a(dVar, false, null, ak5VarA, null, false, "cancel", alb0Var2, function1, pp8.b(-594130570, new gaj() { // from class: nz6
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                a aVar3 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((e160) obj4).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    lkf0.d(uiText5.g((Context) aVar3.O(AndroidCompositionLocals_androidKt.b)), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar3, 0, 0, 262142);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, (iIntValue & 14) | 806879232, 54);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA))), null, null, null, bVarA, ((i2 << 3) & 112) | ((i2 << 6) & 7168) | (3670016 & (i2 >> 3)), 24576, 101429);
            bVarA = bVarA;
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uiText2, uiText3, uiText4, uxsVar, function0, function1, function2, i) { // from class: qz6
                public final /* synthetic */ UiText b;
                public final /* synthetic */ UiText c;
                public final /* synthetic */ UiText d;
                public final /* synthetic */ uxs e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rz6.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
