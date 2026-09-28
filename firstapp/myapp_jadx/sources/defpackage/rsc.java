package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class rsc {
    public static final umz a = h.b(24.0f, 10.0f, 24.0f, 0.0f, 8);
    public static final float b = 16.0f;

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
                    objY = new Function1() { // from class: qsc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            lb80.c((pb80) obj, str3 + ", " + str2);
                            return Unit.a;
                        }
                    };
                    aVar2.r(objY);
                }
                lkf0.d(str, xa80.b(d.a.b, false, (Function1) objY), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262140);
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
                    objY = new ssc();
                    aVar2.r(objY);
                }
                lkf0.d(this.a, xa80.a(d.a.b, (Function1) objY), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262140);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final Long l, final Function1<? super Long, Unit> function1, final du5 du5Var, final IntRange intRange, final guc gucVar, final h780 h780Var, final gtc gtcVar, final b5i b5iVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-432341251);
        int i2 = i | (bVarI.M(l) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(du5Var) ? 256 : 128) | (bVarI.A(intRange) ? 2048 : 1024) | (bVarI.M(gucVar) ? 16384 : 8192) | (bVarI.M(h780Var) ? 131072 : 65536) | (bVarI.M(gtcVar) ? 1048576 : 524288) | (bVarI.M(b5iVar) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zM = bVarI.M(du5Var.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = du5Var.c(du5Var.a);
                bVarI.r(objY);
            }
            jsc jscVar = (jsc) objY;
            String strA = xae0.a(R.string.m3c_date_input_invalid_for_pattern, bVarI);
            String strA2 = xae0.a(R.string.m3c_date_input_invalid_year_range, bVarI);
            String strA3 = xae0.a(R.string.m3c_date_input_invalid_not_allowed, bVarI);
            boolean zM2 = bVarI.M(jscVar) | ((i2 & 57344) == 16384);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                wsc wscVar = new wsc(intRange, h780Var, jscVar, gucVar, strA, strA2, strA3, "");
                bVarI.r(wscVar);
                objY2 = wscVar;
            }
            wsc wscVar2 = (wsc) objY2;
            String upperCase = jscVar.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strA4 = xae0.a(R.string.m3c_date_input_label, bVarI);
            d dVarE = h.e(j.g(d.a.b, 1.0f), a);
            wscVar2.i = l;
            int i3 = i2 << 3;
            b(dVarE, l, function1, du5Var, pp8.b(-752164549, new a(strA4, upperCase), bVarI), pp8.b(-1179434278, new b(upperCase), bVarI), 0, wscVar2, jscVar, du5Var.a, gtcVar, b5iVar, bVarI, (i3 & 112) | 1794054 | (i3 & 896) | (i3 & 7168), (i2 >> 18) & WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l, function1, du5Var, intRange, gucVar, h780Var, gtcVar, b5iVar, i) { // from class: psc
                public final /* synthetic */ Long a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ du5 c;
                public final /* synthetic */ IntRange d;
                public final /* synthetic */ guc e;
                public final /* synthetic */ h780 f;
                public final /* synthetic */ gtc i;
                public final /* synthetic */ b5i v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rsc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final d dVar, Long l, final Function1 function1, final du5 du5Var, final op8 op8Var, final op8 op8Var2, final int i, final wsc wscVar, final jsc jscVar, final Locale locale, gtc gtcVar, final b5i b5iVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        Long l2;
        androidx.compose.runtime.b bVar;
        gtc gtcVar2;
        ytw ytwVar;
        Object obj;
        final jsc jscVar2;
        ytw ytwVar2;
        boolean z;
        final du5 du5Var2 = du5Var;
        final Locale locale2 = locale;
        androidx.compose.runtime.b bVarI = aVar.i(1456309913);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.M(l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.A(du5Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.A(op8Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.A(op8Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= bVarI.d(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= bVarI.M(wscVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= bVarI.M(jscVar) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= bVarI.A(locale2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (bVarI.M(gtcVar) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bVarI.M(b5iVar) ? 32 : 16;
        }
        int i6 = i5;
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new ksc();
                bVarI.r(objY);
            }
            int i7 = i4;
            final ytw ytwVarB = o350.b(objArr, ijf0.d, (Function0) objY, bVarI);
            Object[] objArr2 = {(ijf0) ytwVarB.getValue()};
            int i8 = i7 & 29360128;
            int i9 = i7 & 234881024;
            boolean zM = bVarI.M(ytwVarB) | (i8 == 8388608) | bVarI.A(du5Var2) | (i9 == 67108864) | bVarI.A(locale2);
            int i10 = i7 & 3670016;
            boolean z2 = zM | (i10 == 1048576);
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: lsc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String strA;
                        ytw ytwVar3 = ytwVarB;
                        if (((ijf0) ytwVar3.getValue()).a.b.length() > 0) {
                            String str = ((ijf0) ytwVar3.getValue()).a.b;
                            String str2 = jscVar.c;
                            du5 du5Var3 = du5Var2;
                            Locale locale3 = locale2;
                            strA = wscVar.a(du5Var3.j(str, str2, locale3), i, locale3);
                        } else {
                            strA = "";
                        }
                        return m.b(strA);
                    }
                };
                ytwVar = ytwVarB;
                bVarI.r(objY2);
            } else {
                ytwVar = ytwVarB;
            }
            final ytw ytwVar3 = (ytw) o350.e(objArr2, (Function0) objY2, bVarI, 0);
            boolean zU = StringsKt.U((CharSequence) ytwVar3.getValue());
            float f = b;
            if (!zU) {
                if (!((16.0f >= 0.0f) & (16.0f >= 0.0f) & (4.0f >= 0.0f) & (0.0f >= 0.0f))) {
                    ukn.a("Padding must be non-negative");
                }
                f -= 0.0f + 4.0f;
            }
            float f2 = f;
            ijf0 ijf0Var = (ijf0) ytwVar.getValue();
            boolean zM2 = (i9 == 67108864) | bVarI.M(ytwVar) | bVarI.M(ytwVar3) | ((i7 & 896) == 256) | bVarI.A(du5Var2) | bVarI.A(locale2) | (i8 == 8388608) | (i10 == 1048576);
            Object objY3 = bVarI.y();
            if (zM2 || objY3 == c0042a) {
                jscVar2 = jscVar;
                final ytw ytwVar4 = ytwVar;
                obj = new Function1() { // from class: msc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ijf0 ijf0Var2 = (ijf0) obj2;
                        nk0 nk0Var = ijf0Var2.a;
                        String str = nk0Var.b;
                        String str2 = nk0Var.b;
                        int length = str.length();
                        String str3 = jscVar2.c;
                        if (length <= str3.length()) {
                            for (int i11 = 0; i11 < str2.length(); i11++) {
                                if (Character.isDigit(str2.charAt(i11))) {
                                }
                            }
                            ytwVar4.setValue(ijf0Var2);
                            String string = StringsKt.t0(str2).toString();
                            int length2 = string.length();
                            ytw ytwVar5 = ytwVar3;
                            Function1 function2 = function1;
                            Long lValueOf = null;
                            if (length2 != 0 && string.length() >= str3.length()) {
                                du5 du5Var3 = du5Var;
                                Locale locale3 = locale2;
                                xt5 xt5VarJ = du5Var3.j(string, str3, locale3);
                                ytwVar5.setValue(wscVar.a(xt5VarJ, i, locale3));
                                if (((CharSequence) ytwVar5.getValue()).length() == 0 && xt5VarJ != null) {
                                    lValueOf = Long.valueOf(xt5VarJ.d);
                                }
                                function2.invoke(lValueOf);
                            } else {
                                ytwVar5.setValue("");
                                function2.invoke(null);
                            }
                        }
                        return Unit.a;
                    }
                };
                ytwVar2 = ytwVar3;
                du5Var2 = du5Var;
                locale2 = locale2;
                ytwVar = ytwVar4;
                bVarI.r(obj);
            } else {
                ytwVar2 = ytwVar3;
                obj = objY3;
                jscVar2 = jscVar;
            }
            Function1 function2 = (Function1) obj;
            d dVarJ = h.j(dVar, 0.0f, 0.0f, 0.0f, f2, 7);
            boolean zM3 = bVarI.M(ytwVar2);
            Object objY4 = bVarI.y();
            if (zM3 || objY4 == c0042a) {
                z = false;
                objY4 = new nsc(ytwVar2, 0 == true ? 1 : 0);
                bVarI.r(objY4);
            } else {
                z = false;
            }
            d dVarB = xa80.b(dVarJ, z, (Function1) objY4);
            d dVarA = d.a.b;
            if (b5iVar != null) {
                dVarA = androidx.compose.ui.focus.b.a(dVarA, b5iVar);
            }
            gtcVar2 = gtcVar;
            gaz.a(ijf0Var, function2, dVarB.n(dVarA), false, null, op8Var, op8Var2, pp8.b(-357881838, new tsc(ytwVar2), bVarI), !StringsKt.U((CharSequence) ytwVar2.getValue()), new tyc(jscVar2), new gop(3, 7, 113), null, true, 0, 0, null, gtcVar2.y, bVarI, (i7 << 6) & 33030144);
            bVar = bVarI;
            Unit unit = Unit.a;
            Object[] objArr3 = (i6 & 112) == 32;
            Object objY5 = bVar.y();
            if (objArr3 != false || objY5 == c0042a) {
                objY5 = new usc(b5iVar, null);
                bVar.r(objY5);
            }
            xvf.e(bVar, unit, (Function2) objY5);
            boolean zA = ((i7 & 112) == 32) | bVar.A(du5Var2) | (i9 == 67108864) | bVar.A(locale2) | bVar.M(ytwVar);
            Object objY6 = bVar.y();
            if (zA || objY6 == c0042a) {
                l2 = l;
                vsc vscVar = new vsc(l2, du5Var2, jscVar2, locale, ytwVar, null);
                bVar.r(vscVar);
                objY6 = vscVar;
            } else {
                l2 = l;
            }
            xvf.e(bVar, l2, (Function2) objY6);
        } else {
            l2 = l;
            bVar = bVarI;
            gtcVar2 = gtcVar;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Long l3 = l2;
            final gtc gtcVar3 = gtcVar2;
            eVarZ.d = new Function2() { // from class: osc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    rsc.b(dVar, l3, function1, du5Var, op8Var, op8Var2, i, wscVar, jscVar, locale, gtcVar3, b5iVar, (a) obj2, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }
}
