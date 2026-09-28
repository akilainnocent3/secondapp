package defpackage;

import android.view.MotionEvent;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class m080 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, a aVar, final d dVar, final String str, final Function0 function0, final Function1 function1) {
        b bVar;
        b bVarI = aVar.i(-225917613);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new i080();
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) o350.e(objArr, (Function0) objY, bVarI, 48);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            final psw pswVar = (psw) objY2;
            String str2 = (String) ytwVar.getValue();
            imf0 imf0Var = new imf0(0L, d2l.f(15), null, null, null, 0L, null, null, 0, 0L, null, null, 16777213);
            d dVarI = j.i(dVar, 32.0f);
            boolean z = (i2 & 7168) == 2048;
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                objY3 = new Function1() { // from class: j080
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MotionEvent motionEvent = (MotionEvent) obj;
                        motionEvent.getClass();
                        if (motionEvent.getAction() == 0) {
                            function0.invoke();
                        }
                        return Boolean.FALSE;
                    }
                };
                bVarI.r(objY3);
            }
            d dVarH = g3w.h(androidx.compose.foundation.a.b(c.a(dVarI, gnn.a, new x020((Function1) objY3)), c68.a(R.color.bg_secondary_d_base, bVarI), zk40.a), "search_text_field");
            boolean zM = bVarI.M(ytwVar) | ((i2 & 896) == 256);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                objY4 = new Function1() { // from class: k080
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str3 = (String) obj;
                        str3.getClass();
                        ytwVar.setValue(str3);
                        function1.invoke(str3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            bVar = bVarI;
            ab2.b(str2, (Function1) objY4, dVarH, false, false, imf0Var, null, null, true, 0, 0, null, null, pswVar, null, pp8.b(-860211338, new gaj() { // from class: xz70
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function2 = (Function2) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.A(function2) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        ytw ytwVar2 = ytwVar;
                        String str3 = (String) ytwVar2.getValue();
                        umz umzVar = new umz(8.0f, 0.0f, 8.0f, 0.0f);
                        long j = j58.l;
                        lff0 lff0VarC = uff0.c(0L, 0L, 0L, c68.a(R.color.bg_secondary_d_base, aVar2), c68.a(R.color.bg_secondary_d_base, aVar2), 0L, j, j, j, 0L, aVar2, 2147469263);
                        uff0.a.b(str3, function2, true, true, uni0.a.a, pswVar, null, pp8.b(-1344619858, new w98(str), aVar2), pp8.b(-1417413315, new da8(1, ytwVar2, function1), aVar2), j060.c(4.0f), lff0VarC, umzVar, null, aVar2, ((iIntValue << 3) & 112) | 100887936, 100663302, 146112);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 100859904, 199680, 24280);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str, function0, function1) { // from class: yz70
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;

                {
                    this.a = dVar;
                    this.b = str;
                    this.c = function1;
                    this.d = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m080.a(qj40.a(1), (a) obj, this.a, this.b, this.d, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, long j, final crz crzVar, final Function0 function0, final Function1 function1, final Function0 function2, a aVar, final int i) {
        final long j2;
        long jA;
        function1.getClass();
        b bVarI = aVar.i(885238964);
        int i2 = i | (bVarI.M(str) ? 32 : 16) | 128 | (bVarI.A(crzVar) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
            } else {
                bVarI.G();
                jA = j;
            }
            bVarI.Y();
            d dVarI = j.i(androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), jA, zk40.a), 44.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new ulq(1);
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarI, false, (Function1) objY), "title_bar");
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1935382232, new Function2() { // from class: e080
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar4 = d.a.b;
                        final crz crzVar2 = crzVar;
                        if (crzVar2 != null) {
                            aVar3.N(1331166224);
                            c6n.a(function0, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), "navigation_icon_button"), false, null, null, pp8.b(-1991068015, new Function2() { // from class: h080
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar5 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        h6n.b(crzVar2, null, null, c68.a(R.color.brand_tertiary, aVar5), aVar5, 48, 4);
                                    } else {
                                        aVar5.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar3), aVar3, 1572912, 60);
                            aVar3 = aVar3;
                            aVar3.H();
                        } else {
                            aVar3.N(1331643469);
                            ty0.a(aVar3, j.w(aVar4, 16.0f));
                            aVar3.H();
                        }
                        m080.a(0, aVar3, h.j(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11), str, function2, function1);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
            bVarI.X(true);
            j2 = jA;
        } else {
            bVarI.G();
            j2 = j;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, j2, crzVar, function0, function1, function2, i) { // from class: g080
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ crz c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    m080.b(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
