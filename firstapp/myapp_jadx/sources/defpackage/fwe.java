package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class fwe {
    public static final void a(final gwe gweVar, final Function1<? super yve, Unit> function1, a aVar, int i) {
        b bVar;
        a.C0041a.C0042a c0042a;
        gweVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1342105559);
        int i2 = (bVarI.M(gweVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = gweVar.b;
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (z) {
                bVarI.N(-816005553);
                String str = gweVar.a;
                str.getClass();
                Date dateA = pwf0.a(str, "dd/MM/yyyy", true, owf0.a);
                Long lValueOf = dateA != null ? Long.valueOf(dateA.getTime()) : null;
                n11 n11Var = n11.a;
                IntRange intRange = new IntRange(1900, n11.c(), 1);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objY = bVarI.y();
                if (z2 || objY == c0042a2) {
                    objY = new zve(0, function1);
                    bVarI.r(objY);
                }
                Function1 function2 = (Function1) objY;
                boolean z3 = i3 == 32;
                Object objY2 = bVarI.y();
                if (z3 || objY2 == c0042a2) {
                    objY2 = new awe(function1, 0);
                    bVarI.r(objY2);
                }
                c0042a = c0042a2;
                bVar = bVarI;
                cxc.a(lValueOf, null, intRange, function2, (Function0) objY2, bVar, 0, 2);
                bVar.X(false);
            } else {
                bVar = bVarI;
                c0042a = c0042a2;
                bVar.N(-815657671);
                bVar.X(false);
            }
            String strA = cb40.a(R.string.wap_profile__birthday, new Object[0], bVar);
            boolean z4 = gweVar.d;
            nz20[] nz20VarArr = nz20.a;
            boolean z5 = (i2 & 112) == 32;
            Object objY3 = bVar.y();
            if (z5 || objY3 == c0042a) {
                objY3 = new bwe(0, function1);
                bVar.r(objY3);
            }
            bVarI = bVar;
            i130.a(null, strA, z4, 0L, null, (Function0) objY3, pp8.b(2120920803, new gaj() { // from class: cwe
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        gwe gweVar2 = gweVar;
                        int iOrdinal = gweVar2.c.ordinal();
                        if (iOrdinal == 0) {
                            aVar2.N(1088192283);
                            lkf0.d(gweVar2.a, null, c68.a(R.color.text_brand_sub_primary_d_base, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).k, aVar2, 0, 0, 131066);
                            aVar2.H();
                        } else if (iOrdinal == 1) {
                            aVar2.N(1089369167);
                            d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar2, 48);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d.a aVar3 = d.a.b;
                            d dVarC = c.c(aVar2, aVar3);
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
                            hlh0.a(aVar2, d160VarA, yka.a.f);
                            hlh0.a(aVar2, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, yka.a.d);
                            lkf0.d(gweVar2.a, null, c68.a(R.color.text_secondary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).k, aVar2, 0, 0, 131066);
                            ty0.a(aVar2, j.w(aVar3, 8.0f));
                            h6n.b(erz.a(R.drawable.ic__successful, 0, aVar2), "verified", null, c68.a(R.color.bg_brand_sub_primary_d_base, aVar2), aVar2, 48, 4);
                            aVar2.s();
                            aVar2.H();
                        } else if (iOrdinal == 2) {
                            aVar2.N(1088499896);
                            String strA2 = cb40.a(R.string.wap_profile__verified_now, new Object[0], aVar2);
                            alb0 alb0VarA = alb0.a(sya.e, null, null, 0L, 6.0f, 15);
                            Function1 function3 = function1;
                            boolean zM = aVar2.M(function3);
                            Object objY4 = aVar2.y();
                            if (zM || objY4 == a.C0041a.a) {
                                objY4 = new ewe(function3, 0);
                                aVar2.r(objY4);
                            }
                            xya.a(null, false, strA2, "dob_verify_now_button", alb0VarA, null, null, oz8.a, null, (Function0) objY4, aVar2, 12585984, 355);
                            aVar2.H();
                        } else {
                            if (iOrdinal != 3) {
                                throw rg.a(-1904571330, aVar2);
                            }
                            aVar2.N(1087872890);
                            lkf0.d(cb40.a(R.string.common_functions__edit, new Object[0], aVar2), null, c68.a(R.color.text_brand_sub_primary_d_base, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).k, aVar2, 0, 0, 131066);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVar), bVarI, 12607488, 41);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new dwe(gweVar, function1, i);
        }
    }
}
