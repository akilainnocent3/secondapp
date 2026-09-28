package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ax {
    public static final void a(final String str, final String str2, final ijf0 ijf0Var, final char c, final z900 z900Var, final d dVar, final Function1 function1, final Function0 function0, a aVar, final int i) {
        int i2;
        String str3;
        Function0 function2;
        ijf0Var.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(-788217132);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= bVarI.M(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(ijf0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.Q(c) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? bVarI.M(z900Var) : bVarI.A(z900Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function2 = function0;
            i2 |= bVarI.A(function2) ? 8388608 : 4194304;
        } else {
            function2 = function0;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            rln rlnVar = rln.END;
            boolean z = ((i2 & 896) == 256) | ((i2 & 3670016) == 1048576) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function1() { // from class: xw
                    /* JADX WARN: Code duplicated, block: B:4:0x002f  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String strA;
                        ijf0 ijf0Var2 = (ijf0) obj;
                        ijf0Var2.getClass();
                        ijf0 ijf0Var3 = ijf0Var;
                        ijf0Var3.getClass();
                        nk0 nk0Var = ijf0Var3.a;
                        String strValueOf = String.valueOf(c);
                        Regex regex = new Regex(tug.a("^(0|[1-9][0-9]{0,12})(", Pattern.quote(strValueOf), "[0-9]{0,2})?$"));
                        nk0 nk0Var2 = ijf0Var2.a;
                        int length = nk0Var2.b.length();
                        String str4 = nk0Var2.b;
                        if (length == 0) {
                            strA = str4;
                        } else if (Intrinsics.g(str4, strValueOf)) {
                            strA = inm.a("0", strValueOf);
                        } else if (regex.f(str4)) {
                            strA = str4;
                        } else {
                            strA = nk0Var.b;
                        }
                        if (!Intrinsics.g(strA, str4)) {
                            if (Intrinsics.g(strA, nk0Var.b)) {
                                ijf0Var2 = ijf0Var3;
                            } else {
                                int length2 = strA.length();
                                ijf0Var2 = new ijf0(strA, vlf0.a(length2, length2), 4);
                            }
                        }
                        function1.invoke(ijf0Var2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            int i3 = i2 >> 3;
            int i4 = i2 >> 6;
            int i5 = (i3 & 3670016) | (i4 & 7168) | (i4 & 896) | (i3 & 14) | 12607488 | (i3 & 112);
            fa00.a(str3, ijf0Var, z900Var, dVar, rlnVar, (Function1) objY, function2, pp8.b(274972431, new Function2() { // from class: yw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        lkf0.d(str, null, c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar2), aVar2, 0, 0, 131066);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, i5, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ax.a(str, str2, ijf0Var, c, z900Var, dVar, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
