package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class teh0 {
    public static final void a(String str, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(-1308393979);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(str, j.g(d.a.b, 1.0f), c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVar, (i2 & 14) | 48, 0, 131064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new d210(str, i);
        }
    }

    public static final void b(final int i, final int i2, a aVar, Function0 function0, Function0 function1) {
        Function0 function2;
        int i3;
        final Function0 function3;
        int i4;
        final Function0 function4;
        final Function0 function5;
        b bVarI = aVar.i(1606015285);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            function2 = function0;
        } else {
            function2 = function0;
            i3 = (bVarI.A(function2) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
            function3 = function1;
        } else {
            function3 = function1;
            i4 = i3 | (bVarI.A(function3) ? 32 : 16);
        }
        if (bVarI.q(i4 & 1, (i4 & 19) != 18)) {
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (i5 != 0) {
                Object objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new oeh0();
                    bVarI.r(objY);
                }
                function4 = (Function0) objY;
            } else {
                function4 = function2;
            }
            if (i6 != 0) {
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new peh0();
                    bVarI.r(objY2);
                }
                function5 = (Function0) objY2;
            } else {
                function5 = function3;
            }
            hy60.a(null, pp8.b(-1634785807, new vz40(function4, 2), bVarI), null, null, null, 0, 0L, 0L, null, pp8.b(-1358920378, new gaj() { // from class: qeh0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final Function0 function6 = function5;
                        a1c.a(6, pp8.b(-710051704, new Function2() { // from class: seh0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarG = h.g(op70.c(h.e(j.e(aVar4, 1.0f), tmzVar), op70.a(aVar3), 14), 20.0f, 20.0f);
                                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarG);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, i78VarA, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC, yka.a.d);
                                    lkf0.d(cb40.a(R.string.unique_codes__about_what_is_unique_booking_code_title, new Object[0], aVar3), j.g(aVar4, 1.0f), c68.a(R.color.text_type2_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar3), aVar3, 48, 0, 130040);
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    lkf0.d(cb40.a(R.string.unique_codes__about_what_is_unique_booking_code_description_1, new Object[0], aVar3), j.g(aVar4, 1.0f), r58.d(4278251433L), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, aVar3), aVar3, 432, 0, 130040);
                                    ty0.a(aVar3, j.i(aVar4, 16.0f));
                                    lkf0.d(cb40.a(R.string.unique_codes__about_what_is_unique_booking_code_description_2, new Object[0], aVar3), j.g(aVar4, 1.0f), r58.d(4278251433L), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, aVar3), aVar3, 432, 0, 130040);
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    ute.b(null, 0.0f, c68.a(R.color.border_secondary, aVar3), aVar3, 0, 3);
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    lkf0.d(cb40.a(R.string.unique_codes__about_how_unique_codes_work_title, new Object[0], aVar3), j.g(aVar4, 1.0f), c68.a(R.color.text_type2_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar3), aVar3, 48, 0, 131064);
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    aVar3.N(886224780);
                                    int i7 = 0;
                                    for (Object obj6 : neh0.a) {
                                        int i8 = i7 + 1;
                                        if (i7 < 0) {
                                            kotlin.collections.b.q();
                                            throw null;
                                        }
                                        teh0.a(i8 + ". " + cb40.a(((Number) obj6).intValue(), new Object[0], aVar3), aVar3, 0);
                                        i7 = i8;
                                    }
                                    aVar3.H();
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    ute.b(null, 0.0f, c68.a(R.color.border_secondary, aVar3), aVar3, 0, 3);
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    lkf0.d(cb40.a(R.string.unique_codes__about_why_use_it_title, new Object[0], aVar3), j.g(aVar4, 1.0f), c68.a(R.color.text_type2_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar3), aVar3, 48, 0, 131064);
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    aVar3.N(886250376);
                                    Iterator<T> it = neh0.b.iterator();
                                    while (it.hasNext()) {
                                        teh0.a("• ".concat(cb40.a(((Number) it.next()).intValue(), new Object[0], aVar3)), aVar3, 0);
                                    }
                                    aVar3.H();
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    ute.b(null, 0.0f, c68.a(R.color.border_secondary, aVar3), aVar3, 0, 3);
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    lkf0.d(cb40.a(R.string.unique_codes__about_tips_to_maximize_title, new Object[0], aVar3), j.g(aVar4, 1.0f), c68.a(R.color.text_type2_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar3), aVar3, 48, 0, 131064);
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    aVar3.N(886275240);
                                    Iterator<T> it2 = neh0.c.iterator();
                                    while (it2.hasNext()) {
                                        teh0.a("• ".concat(cb40.a(((Number) it2.next()).intValue(), new Object[0], aVar3)), aVar3, 0);
                                    }
                                    aVar3.H();
                                    ty0.a(aVar3, j.i(aVar4, 24.0f));
                                    d dVarJ = h.j(j.g(aVar4, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                                    umz umzVar = ek5.a;
                                    xya.b(dVarJ, false, ek5.a(r58.d(4278251433L), r58.d(4281678405L), 0L, 0L, aVar3, 12), alb0.a(sya.b, null, new umz(20.0f, 12.0f, 20.0f, 12.0f), 0L, 0.0f, 27), null, 0.0f, null, function6, hz9.a, aVar3, 100663302, 114);
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 805306416, 509);
            function3 = function5;
        } else {
            bVarI.G();
            function4 = function2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, function4, function3) { // from class: reh0
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ int c;

                {
                    this.a = function4;
                    this.b = function3;
                    this.c = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    teh0.b(qj40.a(1), this.c, (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
