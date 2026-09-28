package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class kxc {

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                String str = this.a;
                boolean zM = aVar2.M(str);
                final String str2 = this.b;
                boolean zM2 = zM | aVar2.M(str2);
                Object objY = aVar2.y();
                if (zM2 || objY == androidx.compose.runtime.a.C0041a.a) {
                    final String str3 = this.a;
                    objY = new Function1() { // from class: jxc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            lb80.c((pb80) obj, str3 + ", " + str2);
                            return Unit.a;
                        }
                    };
                    aVar2.r(objY);
                }
                lkf0.d(str, xa80.b(androidx.compose.ui.d.a.b, false, (Function1) objY), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262140);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class b implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objY = aVar2.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new lxc(0);
                    aVar2.r(objY);
                }
                lkf0.d(this.a, xa80.a(androidx.compose.ui.d.a.b, (Function1) objY), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262140);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                String str = this.a;
                boolean zM = aVar2.M(str);
                final String str2 = this.b;
                boolean zM2 = zM | aVar2.M(str2);
                Object objY = aVar2.y();
                if (zM2 || objY == androidx.compose.runtime.a.C0041a.a) {
                    final String str3 = this.a;
                    objY = new Function1() { // from class: mxc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            lb80.c((pb80) obj, str3 + ", " + str2);
                            return Unit.a;
                        }
                    };
                    aVar2.r(objY);
                }
                lkf0.d(str, xa80.b(androidx.compose.ui.d.a.b, false, (Function1) objY), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262140);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class d implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objY = aVar2.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new nxc();
                    aVar2.r(objY);
                }
                lkf0.d(this.a, xa80.a(androidx.compose.ui.d.a.b, (Function1) objY), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262140);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final Long l, final Long l2, final Function2<? super Long, ? super Long, Unit> function2, final du5 du5Var, final IntRange intRange, final guc gucVar, final h780 h780Var, final gtc gtcVar, final b5i b5iVar, androidx.compose.runtime.a aVar, final int i) {
        jsc jscVar;
        androidx.compose.runtime.b bVarI = aVar.i(1372713366);
        int i2 = i | (bVarI.M(l) ? 4 : 2) | (bVarI.M(l2) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(du5Var) ? 2048 : 1024) | (bVarI.A(intRange) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(gucVar) ? 131072 : 65536) | (bVarI.M(h780Var) ? 1048576 : 524288) | (bVarI.M(gtcVar) ? 8388608 : 4194304) | (bVarI.M(b5iVar) ? 67108864 : 33554432);
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean zM = bVarI.M(du5Var.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = du5Var.c(du5Var.a);
                bVarI.r(objY);
            }
            jsc jscVar2 = (jsc) objY;
            String strA = xae0.a(R.string.m3c_date_input_invalid_for_pattern, bVarI);
            String strA2 = xae0.a(R.string.m3c_date_input_invalid_year_range, bVarI);
            String strA3 = xae0.a(R.string.m3c_date_input_invalid_not_allowed, bVarI);
            String strA4 = xae0.a(R.string.m3c_date_range_input_invalid_range_input, bVarI);
            boolean zM2 = bVarI.M(jscVar2) | ((i2 & 458752) == 131072);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new wsc(intRange, h780Var, jscVar2, gucVar, strA, strA2, strA3, strA4);
                jscVar = jscVar2;
                bVarI.r(objY2);
            } else {
                jscVar = jscVar2;
            }
            wsc wscVar = (wsc) objY2;
            wscVar.i = l;
            wscVar.j = l2;
            androidx.compose.ui.d dVarE = h.e(androidx.compose.ui.d.a.b, rsc.a);
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String upperCase = jscVar.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strA5 = xae0.a(R.string.m3c_date_range_picker_start_headline, bVarI);
            if (0.5f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
            Locale locale = du5Var.a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            int i4 = i2 & 112;
            boolean z2 = z | (i4 == 32);
            Object objY3 = bVarI.y();
            if (z2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: gxc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Long l3 = l2;
                        function2.invoke((Long) obj, l3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            int i5 = i2 & 7168;
            int i6 = i2 >> 21;
            int i7 = i6 & 14;
            rsc.b(layoutWeightElement, l, (Function1) objY3, du5Var, pp8.b(1740538748, new a(strA5, upperCase), bVarI), pp8.b(1229526589, new b(upperCase), bVarI), 1, wscVar, jscVar, locale, gtcVar, b5iVar, bVarI, ((i2 << 3) & 112) | 1794048 | i5, i6 & WebSocketProtocol.PAYLOAD_SHORT);
            String strA6 = xae0.a(R.string.m3c_date_range_picker_end_headline, bVarI);
            if (0.5f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
            Locale locale2 = du5Var.a;
            boolean z3 = (i3 == 256) | ((i2 & 14) == 4);
            Object objY4 = bVarI.y();
            if (z3 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: hxc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        function2.invoke(l, (Long) obj);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            rsc.b(layoutWeightElement2, l2, (Function1) objY4, du5Var, pp8.b(-882370893, new c(strA6, upperCase), bVarI), pp8.b(1956183348, new d(upperCase), bVarI), 2, wscVar, jscVar, locale2, gtcVar, null, bVarI, i4 | 1794048 | i5, i7 | 48);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l, l2, function2, du5Var, intRange, gucVar, h780Var, gtcVar, b5iVar, i) { // from class: ixc
                public final /* synthetic */ Long a;
                public final /* synthetic */ Long b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ du5 d;
                public final /* synthetic */ IntRange e;
                public final /* synthetic */ guc f;
                public final /* synthetic */ h780 i;
                public final /* synthetic */ gtc v;
                public final /* synthetic */ b5i w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kxc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
