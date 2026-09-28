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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ceh0 {
    public static final void a(String str, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(760106365);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(str, j.g(d.a.b, 1.0f), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVar, (i2 & 14) | 48, 0, 131064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new jg90(str, i, 1);
        }
    }

    public static final void b(final Function0<Unit> function0, a aVar, int i) {
        b bVar;
        function0.getClass();
        b bVarI = aVar.i(1463400556);
        int i2 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            final zp70 zp70VarA = op70.a(bVarI);
            bVar = bVarI;
            v1w.a(function0, null, j590VarG, 0.0f, false, j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12), c68.a(R.color.bg_primary_d_base, bVarI), 0L, 0L, az9.a, null, null, pp8.b(1042351950, new gaj() { // from class: beh0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarH = h.h(j.g(aVar3, 1.0f), 8.0f, 0.0f, 2);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarH);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarG = h.g(op70.c(androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.bg_primary_d_base, aVar2), j060.c(12.0f)), zp70VarA, 14), 16.0f, 20.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarG);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        d dVarG2 = j.g(aVar3, 1.0f);
                        d160 d160VarA = b160.a(kw0.b, ht.a.k, aVar2, 54);
                        int iHashCode3 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO3 = aVar2.o();
                        d dVarC3 = c.c(aVar2, dVarG2);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, bVar2);
                        hlh0.a(aVar2, ne00VarO3, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar2, dVarC3, cVar);
                        c6n.a(function0, null, false, null, null, az9.b, aVar2, 1572864, 62);
                        aVar2.s();
                        ty0.a(aVar2, j.i(aVar3, 24.0f));
                        lkf0.d(cb40.a(R.string.unique_codes__about_what_is_unique_booking_code_title, new Object[0], aVar2), j.g(aVar3, 1.0f), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar2), aVar2, 48, 0, 131064);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        ceh0.a(cb40.a(R.string.unique_codes__about_what_is_unique_booking_code_description_1, new Object[0], aVar2), aVar2, 0);
                        ty0.a(aVar2, j.i(aVar3, 16.0f));
                        ceh0.a(cb40.a(R.string.unique_codes__about_what_is_unique_booking_code_description_2, new Object[0], aVar2), aVar2, 0);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        ute.b(null, 0.0f, c68.a(R.color.border_primary, aVar2), aVar2, 0, 3);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        lkf0.d(cb40.a(R.string.unique_codes__about_how_unique_codes_work_title, new Object[0], aVar2), j.g(aVar3, 1.0f), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar2), aVar2, 48, 0, 131064);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        aVar2.N(-640973896);
                        int i3 = 0;
                        for (Object obj4 : neh0.a) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            ceh0.a(i4 + ". " + cb40.a(((Number) obj4).intValue(), new Object[0], aVar2), aVar2, 0);
                            i3 = i4;
                        }
                        aVar2.H();
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        ute.b(null, 0.0f, c68.a(R.color.border_primary, aVar2), aVar2, 0, 3);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        lkf0.d(cb40.a(R.string.unique_codes__about_why_use_it_title, new Object[0], aVar2), j.g(aVar3, 1.0f), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar2), aVar2, 48, 0, 131064);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        aVar2.N(-640948524);
                        Iterator<T> it = neh0.b.iterator();
                        while (it.hasNext()) {
                            ceh0.a("• ".concat(cb40.a(((Number) it.next()).intValue(), new Object[0], aVar2)), aVar2, 0);
                        }
                        aVar2.H();
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        ute.b(null, 0.0f, c68.a(R.color.line_type1_secondary, aVar2), aVar2, 0, 3);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        lkf0.d(cb40.a(R.string.unique_codes__about_tips_to_maximize_title, new Object[0], aVar2), j.g(aVar3, 1.0f), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar2), aVar2, 48, 0, 131064);
                        ty0.a(aVar2, j.i(aVar3, 20.0f));
                        aVar2.N(-640923724);
                        Iterator<T> it2 = neh0.c.iterator();
                        while (it2.hasNext()) {
                            ceh0.a("• ".concat(cb40.a(((Number) it2.next()).intValue(), new Object[0], aVar2)), aVar2, 0);
                        }
                        aVar2.H();
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, i2 & 14, 3078, 7066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new jz40(i, 2, function0);
        }
    }
}
