package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class u7b {
    public static final void a(final d dVar, final ijf0 ijf0Var, final boolean z, final ycg ycgVar, final boolean z2, final String str, final String str2, final gop gopVar, Integer num, final String str3, final Function1 function1, a aVar, final int i, final int i2) {
        Integer num2;
        int i3;
        b bVar;
        final Integer num3;
        b bVarI = aVar.i(-2110510274);
        int i4 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(ijf0Var) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.M(ycgVar) ? 2048 : 1024) | (bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str) ? 131072 : 65536) | (bVarI.M(str2) ? 1048576 : 524288);
        int i5 = i2 & 256;
        if (i5 != 0) {
            i3 = i4 | 100663296;
            num2 = num;
        } else {
            num2 = num;
            i3 = i4 | (bVarI.M(num2) ? 67108864 : 33554432);
        }
        int i6 = bVarI.A(function1) ? 4 : 2;
        int i7 = i3;
        if (bVarI.q(i7 & 1, ((306783379 & i3) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            bVarI.A0();
            op8 op8VarB = null;
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            } else if (i5 != 0) {
                num2 = null;
            }
            Integer num4 = num2;
            bVarI.Y();
            if (StringsKt.U(str2)) {
                bVarI.N(-184086465);
                bVarI.X(false);
            } else {
                bVarI.N(-184464447);
                op8VarB = pp8.b(-1513176218, new Function2() { // from class: s7b
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            lkf0.d(str2, h.h(d.a.b, 16.0f, 0.0f, 2), c68.a(R.color.text_type1_secondary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 48, 0, 131064);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI);
                bVarI.X(false);
            }
            int i8 = i7 << 3;
            bVar = bVarI;
            jr7.a(dVar, ijf0Var, op8VarB, z, ycgVar, z2, str, null, null, gopVar, null, 0, num4, str3, function1, bVar, (i7 & WebSocketProtocol.PAYLOAD_SHORT) | (i8 & 7168) | (i8 & 57344) | (458752 & i8) | (i8 & 3670016) | 805306368, ((i7 >> 18) & 8064) | ((i6 << 12) & 57344), 3456);
            num3 = num4;
        } else {
            bVar = bVarI;
            bVar.G();
            num3 = num2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ijf0Var, z, ycgVar, z2, str, str2, gopVar, num3, str3, function1, i, i2) { // from class: t7b
                public final /* synthetic */ int A;
                public final /* synthetic */ ijf0 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ ycg d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String i;
                public final /* synthetic */ gop v;
                public final /* synthetic */ Integer w;
                public final /* synthetic */ String y;
                public final /* synthetic */ Function1 z;

                {
                    this.A = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(817889281);
                    u7b.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA, this.A);
                    return Unit.a;
                }
            };
        }
    }
}
