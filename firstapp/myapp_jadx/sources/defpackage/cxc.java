package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class cxc {
    public static final mpe0 a = hwr.b(new wwc());

    public static final void a(final Long l, h780 h780Var, final IntRange intRange, final Function1<? super Long, Unit> function1, final Function0<Unit> function0, a aVar, final int i, final int i2) {
        final h780 h780Var2;
        final h780 h780Var3;
        h780 h780Var4;
        intRange.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(1466393270);
        int i3 = (bVarI.M(l) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                h780Var2 = h780Var;
                int i4 = bVarI.M(h780Var2) ? 32 : 16;
                i3 |= i4;
            } else {
                h780Var2 = h780Var;
            }
            i3 |= i4;
        } else {
            h780Var2 = h780Var;
        }
        int i5 = i3 | (bVarI.A(intRange) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i5 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i5 & 1, (i5 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                h780Var2 = ktc.c;
                i5 &= -113;
            }
            int i6 = i5;
            bVarI.Y();
            Long lValueOf = l != null ? Long.valueOf(l.longValue() + ((long) ((Number) a.getValue()).intValue())) : null;
            int i7 = (i6 & 896) | ((i6 << 9) & 57344);
            umz umzVar = xvc.a;
            final Locale localeA = bu5.a(bVarI);
            Object[] objArr = new Object[0];
            uv60 uv60VarA = jis.a(new Function1() { // from class: exc
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List list = (List) obj;
                    Long l2 = (Long) list.get(0);
                    Long l3 = (Long) list.get(1);
                    Object obj2 = list.get(2);
                    obj2.getClass();
                    int iIntValue = ((Integer) obj2).intValue();
                    Object obj3 = list.get(3);
                    obj3.getClass();
                    IntRange intRange2 = new IntRange(iIntValue, ((Integer) obj3).intValue(), 1);
                    Object obj4 = list.get(4);
                    obj4.getClass();
                    return new fxc(l2, l3, intRange2, ((Integer) obj4).intValue(), h780Var2, localeA);
                }
            }, new z49(1));
            boolean zM = bVarI.M(lValueOf) | bVarI.M(lValueOf) | bVarI.A(intRange) | bVarI.d(0) | ((((i7 & 57344) ^ 24576) > 16384 && bVarI.M(h780Var2)) || (i7 & 24576) == 16384) | bVarI.A(localeA);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                final Long l2 = lValueOf;
                final h780 h780Var5 = h780Var2;
                Function0 function2 = new Function0() { // from class: puc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new fxc(l2, l2, intRange, 0, h780Var5, localeA);
                    }
                };
                h780Var4 = h780Var5;
                bVarI.r(function2);
                objY = function2;
            } else {
                h780Var4 = h780Var2;
            }
            final fxc fxcVar = (fxc) o350.c(objArr, uv60VarA, (Function0) objY, bVarI, 0);
            ((x5a0) fxcVar.d).setValue(h780Var4);
            op8 op8VarB = pp8.b(-1481674652, new Function2() { // from class: xwc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final Function1 function3 = function1;
                        boolean zM2 = aVar2.M(function3);
                        final fxc fxcVar2 = fxcVar;
                        boolean zM3 = zM2 | aVar2.M(fxcVar2);
                        final Function0 function4 = function0;
                        boolean zM4 = zM3 | aVar2.M(function4);
                        Object objY2 = aVar2.y();
                        if (zM4 || objY2 == a.C0041a.a) {
                            objY2 = new Function0() { // from class: bxc
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Long lE = fxcVar2.e();
                                    function3.invoke(lE != null ? Long.valueOf(lE.longValue() - ((long) ((Number) cxc.a.getValue()).intValue())) : null);
                                    function4.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        ddd0.a(null, true, null, null, null, false, null, null, (Function0) objY2, fx8.a, aVar2, 805306416, 253);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            op8 op8VarB2 = pp8.b(847305890, new Function2() { // from class: ywc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ddd0.a(null, true, null, null, null, false, null, null, function0, fx8.b, aVar2, 805306416, 253);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            ktc ktcVar = ktc.a;
            gtc gtcVarC = ktc.c(6, bVarI);
            fuc.a(function0, op8VarB, null, op8VarB2, null, gtcVarC.a(c68.a(R.color.background_type1_secondary, bVarI), (33554430 & 2) != 0 ? gtcVarC.b : 0L, (33554430 & 4) != 0 ? gtcVarC.c : 0L, (33554430 & 8) != 0 ? gtcVarC.d : 0L, (33554430 & 16) != 0 ? gtcVarC.e : 0L, (33554430 & 32) != 0 ? gtcVarC.f : 0L, (33554430 & 64) != 0 ? gtcVarC.g : 0L, (33554430 & 128) != 0 ? gtcVarC.h : 0L, gtcVarC.i, gtcVarC.j, gtcVarC.k, (33554430 & 2048) != 0 ? gtcVarC.l : 0L, gtcVarC.m, (33554430 & 8192) != 0 ? gtcVarC.n : 0L, (33554430 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? gtcVarC.o : 0L, gtcVarC.p, gtcVarC.q, (33554430 & 131072) != 0 ? gtcVarC.r : 0L, gtcVarC.s, (33554430 & 524288) != 0 ? gtcVarC.t : 0L, gtcVarC.u, gtcVarC.v, gtcVarC.w, gtcVarC.x, gtcVarC.y), null, pp8.b(765746605, new gaj() { // from class: zwc
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ktc ktcVar2 = ktc.a;
                        gtc gtcVarC2 = ktc.c(6, aVar2);
                        xvc.b(fxcVar, null, null, gtcVarC2.a(c68.a(R.color.background_type1_secondary, aVar2), (33554430 & 2) != 0 ? gtcVarC2.b : c68.a(R.color.text_type1_primary, aVar2), (33554430 & 4) != 0 ? gtcVarC2.c : c68.a(R.color.text_type1_primary, aVar2), (33554430 & 8) != 0 ? gtcVarC2.d : c68.a(R.color.text_type1_primary, aVar2), (33554430 & 16) != 0 ? gtcVarC2.e : c68.a(R.color.text_type1_primary, aVar2), (33554430 & 32) != 0 ? gtcVarC2.f : c68.a(R.color.text_type1_primary, aVar2), (33554430 & 64) != 0 ? gtcVarC2.g : c68.a(R.color.text_type1_primary, aVar2), (33554430 & 128) != 0 ? gtcVarC2.h : c68.a(R.color.text_type1_secondary, aVar2), gtcVarC2.i, gtcVarC2.j, gtcVarC2.k, (33554430 & 2048) != 0 ? gtcVarC2.l : c68.a(R.color.brand_quaternary, aVar2), gtcVarC2.m, (33554430 & 8192) != 0 ? gtcVarC2.n : c68.a(R.color.text_type1_primary, aVar2), (33554430 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? gtcVarC2.o : c68.a(R.color.text_type1_secondary, aVar2), gtcVarC2.p, gtcVarC2.q, (33554430 & 131072) != 0 ? gtcVarC2.r : c68.a(R.color.brand_quaternary, aVar2), gtcVarC2.s, (33554430 & 524288) != 0 ? gtcVarC2.t : c68.a(R.color.text_type1_primary, aVar2), gtcVarC2.u, gtcVarC2.v, gtcVarC2.w, gtcVarC2.x, gtcVarC2.y), null, null, false, null, aVar2, 1572864);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i6 >> 12) & 14) | 100666416);
            h780Var3 = h780Var4;
        } else {
            bVarI.G();
            h780Var3 = h780Var2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: axc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cxc.a(l, h780Var3, intRange, function1, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
