package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qsa {
    public static final void a(final rsa rsaVar, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i) {
        final Function0<Unit> function2;
        rsaVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-2097232599);
        int i2 = (bVarI.M(rsaVar) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            function2 = function1;
            u60.a(function2, new yle(false, false, false), pp8.b(1945600690, new Function2() { // from class: msa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarH = h.h(j.g(d.a.b, 1.0f), 8.0f, 0.0f, 2);
                        long jA = c68.a(R.color.background_general_primary, aVar2);
                        final rsa rsaVar2 = rsaVar;
                        final Context context2 = context;
                        final Function0 function3 = function1;
                        final Function0 function4 = function0;
                        ihe0.a(dVarH, null, jA, 0L, 0.0f, 0.0f, null, pp8.b(-992822857, new Function2() { // from class: osa
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                int i3;
                                boolean z;
                                int i4;
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    d.a aVar4 = d.a.b;
                                    d dVarH2 = h.h(aVar4, 24.0f, 0.0f, 2);
                                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar3, 0);
                                    int iHashCode = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC = c.c(aVar3, dVarH2);
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
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar3, i78VarA, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar3, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar3, dVarC, cVar);
                                    rsa rsaVar3 = rsaVar2;
                                    r700 r700Var = rsaVar3.a;
                                    String str = rsaVar3.d;
                                    int iOrdinal = r700Var.ordinal();
                                    if (iOrdinal == 0) {
                                        i3 = R.string.page_payment__deposit_confirmation;
                                    } else {
                                        if (iOrdinal != 1) {
                                            uhc.a();
                                            return null;
                                        }
                                        i3 = R.string.page_withdraw__confirm_to_withdraw;
                                    }
                                    String strA = cb40.a(i3, new Object[0], aVar3);
                                    long jA2 = c68.a(R.color.absolute_type2, aVar3);
                                    long jM = mla.m(20.0f, aVar3);
                                    t9i t9iVar = t9i.E;
                                    v1k v1kVar = f8i.b;
                                    lkf0.d(strA, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), jA2, null, jM, null, t9iVar, v1kVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar3, 1572912, 0, 261928);
                                    int iOrdinal2 = rsaVar3.a.ordinal();
                                    if (iOrdinal2 != 0) {
                                        z = true;
                                        if (iOrdinal2 != 1) {
                                            uhc.a();
                                            return null;
                                        }
                                        i4 = R.string.page_transaction__withdraw_to;
                                    } else {
                                        z = true;
                                        i4 = R.string.page_transaction__deposit_from;
                                    }
                                    qsa.b(384, aVar3, h.j(aVar4, 0.0f, 25.0f, 0.0f, 0.0f, 13), cb40.a(i4, new Object[0], aVar3), rsaVar3.b.g(context2));
                                    if (str.length() > 0) {
                                        aVar3.N(2072336024);
                                        qsa.b(384, aVar3, h.j(aVar4, 0.0f, 6.0f, 0.0f, 0.0f, 13), cb40.a(R.string.page_payment__mobile_number, new Object[0], aVar3), str);
                                        aVar3.H();
                                    } else {
                                        aVar3.N(2072609909);
                                        aVar3.H();
                                    }
                                    qsa.b(384, aVar3, h.j(aVar4, 0.0f, 6.0f, 0.0f, 0.0f, 13), cb40.a(R.string.common_functions__amount_label, new Object[]{rsaVar3.e}, aVar3), bjb0.P(rsaVar3.c, Locale.US));
                                    d dVarJ = h.j(j.g(aVar4, 1.0f), 0.0f, 28.0f, 0.0f, 8.0f, 5);
                                    d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar3, 48);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO2 = aVar3.o();
                                    d dVarC2 = c.c(aVar3, dVarJ);
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
                                    hlh0.a(aVar3, d160VarA, bVar);
                                    hlh0.a(aVar3, ne00VarO2, dVar);
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC2, cVar);
                                    ty0.a(aVar3, new LayoutWeightElement(1.0f, z));
                                    String strA2 = cb40.a(R.string.common_functions__cancel, new Object[0], aVar3);
                                    long jA3 = c68.a(R.color.text_type1_secondary, aVar3);
                                    long jM2 = mla.m(14.0f, aVar3);
                                    final Function0 function5 = function3;
                                    lkf0.d(strA2, h.f(g3w.f(aVar4, z, function5), 10.0f), jA3, null, jM2, null, null, v1kVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar3, 0, 0, 261992);
                                    String strA3 = cb40.a(R.string.common_functions__confirm, new Object[0], aVar3);
                                    long jA4 = c68.a(R.color.brand_secondary, aVar3);
                                    long jM3 = mla.m(14.0f, aVar3);
                                    t9i t9iVar2 = t9i.C;
                                    final Function0 function6 = function4;
                                    boolean zM = aVar3.M(function6) | aVar3.M(function5);
                                    Object objY = aVar3.y();
                                    if (zM || objY == a.C0041a.a) {
                                        objY = new Function0() { // from class: psa
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function6.invoke();
                                                function5.invoke();
                                                return Unit.a;
                                            }
                                        };
                                        aVar3.r(objY);
                                    }
                                    lkf0.d(strA3, h.f(g3w.f(aVar4, true, (Function0) objY), 10.0f), jA4, null, jM3, null, t9iVar2, v1kVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar3, 1572864, 0, 261928);
                                    aVar3.s();
                                    aVar3.s();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 12582918, 122);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 432, 0);
        } else {
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function2, i) { // from class: nsa
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    qsa.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, a aVar, final d dVar, String str, String str2) {
        final String str3;
        final String str4;
        b bVar;
        b bVarI = aVar.i(1377882105);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarK = j.k(j.g(dVar, 1.0f), 28.0f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarK);
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
            long jA = c68.a(R.color.text_type1_primary, bVarI);
            long jM = mla.m(14.0f, bVarI);
            v1k v1kVar = f8i.b;
            if (0.4f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.d(str, new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true), jA, null, jM, null, null, v1kVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, i2 & 14, 0, 261992);
            long jA2 = c68.a(R.color.text_type1_primary, bVarI);
            long jM2 = mla.m(14.0f, bVarI);
            t9i t9iVar = t9i.E;
            if (0.6f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            str3 = str;
            str4 = str2;
            lkf0.d(str4, new LayoutWeightElement(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true), jA2, null, jM2, null, t9iVar, v1kVar, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, null, bVarI, ((i2 >> 3) & 14) | 1572864, 0, 260904);
            bVar = bVarI;
            bVar.X(true);
        } else {
            str3 = str;
            str4 = str2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str3, str4) { // from class: lsa
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ d c;

                {
                    this.a = str3;
                    this.b = str4;
                    this.c = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qsa.b(qj40.a(385), (a) obj, this.c, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
