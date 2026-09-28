package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sportybet.android.gp.tz.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class ktc {
    public static final ktc a = new ktc();
    public static final IntRange b = new IntRange(1900, UserCertConstants.REQUEST_CODE_BVN, 1);
    public static final a c = new a();

    public static final class a implements h780 {
    }

    public static gtc c(int i, androidx.compose.runtime.a aVar) {
        return d((d68) aVar.O(g68.a), aVar, (i << 3) & 112);
    }

    public static gtc d(d68 d68Var, androidx.compose.runtime.a aVar, int i) {
        gtc gtcVar = d68Var.e0;
        if (gtcVar != null) {
            aVar.N(642290457);
            aVar.H();
            return gtcVar;
        }
        aVar.N(642416503);
        long jC = g68.c(d68Var, dxc.a);
        long jC2 = g68.c(d68Var, dxc.s);
        long jC3 = g68.c(d68Var, dxc.q);
        long jC4 = g68.c(d68Var, dxc.A);
        long jC5 = g68.c(d68Var, dxc.y);
        long j = d68Var.s;
        e68 e68Var = dxc.I;
        long jC6 = g68.c(d68Var, e68Var);
        long jC7 = j58.c(0.38f, g68.c(d68Var, e68Var));
        e68 e68Var2 = dxc.n;
        long jC8 = g68.c(d68Var, e68Var2);
        e68 e68Var3 = dxc.G;
        long jC9 = g68.c(d68Var, e68Var3);
        long jC10 = j58.c(0.38f, g68.c(d68Var, e68Var3));
        e68 e68Var4 = dxc.F;
        long jC11 = g68.c(d68Var, e68Var4);
        long jC12 = j58.c(0.38f, g68.c(d68Var, e68Var4));
        e68 e68Var5 = dxc.o;
        long jC13 = g68.c(d68Var, e68Var5);
        long jC14 = j58.c(0.38f, g68.c(d68Var, e68Var5));
        e68 e68Var6 = dxc.j;
        long jC15 = g68.c(d68Var, e68Var6);
        long jC16 = j58.c(0.38f, g68.c(d68Var, e68Var6));
        e68 e68Var7 = dxc.i;
        gtc gtcVar2 = new gtc(jC, jC2, jC3, jC4, jC5, j, jC6, jC7, jC8, jC9, jC10, jC11, jC12, jC13, jC14, jC15, jC16, g68.c(d68Var, e68Var7), j58.c(0.38f, g68.c(d68Var, e68Var7)), g68.c(d68Var, e68Var2), g68.c(d68Var, dxc.l), g68.c(d68Var, dxc.u), g68.c(d68Var, dxc.v), g68.c(d68Var, xte.a), t9z.e(d68Var, aVar));
        d68Var.e0 = gtcVar2;
        aVar.H();
        return gtcVar2;
    }

    public final void a(final Long l, final int i, final guc gucVar, final d dVar, final long j, androidx.compose.runtime.a aVar, final int i2) {
        b bVar;
        b bVarI = aVar.i(1913724796);
        int i3 = i2 | (bVarI.M(l) ? 4 : 2) | (bVarI.d(i) ? 32 : 16) | (bVarI.M(gucVar) ? 256 : 128) | (bVarI.e(j) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        int i4 = 0;
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            Locale localeA = bu5.a(bVarI);
            String strB = gucVar.b(l, localeA, false);
            String strB2 = gucVar.b(l, localeA, true);
            String strA = "";
            if (strB2 == null) {
                bVarI.N(380185931);
                if (i == 0) {
                    bVarI.N(843549871);
                    strB2 = xae0.a(R.string.m3c_date_picker_no_selection_description, bVarI);
                    bVarI.X(false);
                } else if (i == 1) {
                    bVarI.N(843552842);
                    strB2 = xae0.a(R.string.m3c_date_input_no_input_description, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(380407362);
                    bVarI.X(false);
                    strB2 = "";
                }
                bVarI.X(false);
            } else {
                bVarI.N(843542258);
                bVarI.X(false);
            }
            if (strB == null) {
                bVarI.N(380507587);
                if (i == 0) {
                    bVarI.N(843560257);
                    strB = xae0.a(R.string.m3c_date_picker_headline, bVarI);
                    bVarI.X(false);
                } else if (i == 1) {
                    bVarI.N(843562784);
                    strB = xae0.a(R.string.m3c_date_input_headline, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(380705954);
                    bVarI.X(false);
                    strB = "";
                }
                bVarI.X(false);
            } else {
                bVarI.N(843557408);
                bVarI.X(false);
            }
            if (i == 0) {
                bVarI.N(843570444);
                strA = xae0.a(R.string.m3c_date_picker_headline_description, bVarI);
                bVarI.X(false);
            } else if (i == 1) {
                bVarI.N(843573323);
                strA = xae0.a(R.string.m3c_date_input_headline_description, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(381043234);
                bVarI.X(false);
            }
            String str = String.format(strA, Arrays.copyOf(new Object[]{strB2}, 1));
            boolean zM = bVarI.M(str);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new htc(str, i4);
                bVarI.r(objY);
            }
            bVar = bVarI;
            lkf0.d(strB, xa80.b(dVar, false, (Function1) objY), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, bVar, (i3 >> 6) & 896, 24576, 245752);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l, i, gucVar, dVar, j, i2) { // from class: itc
                public final /* synthetic */ Long b;
                public final /* synthetic */ int c;
                public final /* synthetic */ guc d;
                public final /* synthetic */ d e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(199681);
                    this.a.a(this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final void b(final int i, final int i2, final long j, androidx.compose.runtime.a aVar, final d dVar) {
        b bVar;
        b bVarI = aVar.i(-390880814);
        int i3 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.e(j) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            if (i == 0) {
                bVarI.N(-1974299164);
                lkf0.d(xae0.a(R.string.m3c_date_picker_title, bVarI), dVar, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, i3 & 1008, 0, 262136);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVar = bVarI;
                if (i == 1) {
                    bVar.N(-1974291869);
                    lkf0.d(xae0.a(R.string.m3c_date_input_title, bVar), dVar, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, i3 & 1008, 0, 262136);
                    bVar = bVar;
                    bVar.X(false);
                } else {
                    bVar.N(-1073325776);
                    bVar.X(false);
                }
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, j, i2) { // from class: jtc
                public final /* synthetic */ int b;
                public final /* synthetic */ d c;
                public final /* synthetic */ long d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3121);
                    this.a.b(this.b, iA, this.d, (a) obj, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
