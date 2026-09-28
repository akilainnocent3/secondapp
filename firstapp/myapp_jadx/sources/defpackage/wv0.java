package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class wv0 {
    public static final void a(d dVar, final UiText uiText, final UiText uiText2, final UiText uiText3, final UiText uiText4, final UiText uiText5, final UiText uiText6, final Function0 function0, final Function0 function1, final Function0 function2, final boolean z, a aVar, final int i) {
        final d dVar2;
        z45 cVar;
        b bVarA = yoh0.a(function0, function1, function2, aVar, 618590112);
        int i2 = i | 6 | (bVarA.M(uiText) ? 32 : 16) | (bVarA.M(uiText2) ? 256 : 128) | (bVarA.M(uiText3) ? 2048 : 1024) | (bVarA.M(uiText4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarA.M(uiText5) ? 131072 : 65536) | (bVarA.M(uiText6) ? 1048576 : 524288) | (bVarA.A(function0) ? 8388608 : 4194304) | (bVarA.A(function1) ? 67108864 : 33554432) | (bVarA.A(function2) ? 536870912 : 268435456);
        if (bVarA.q(i2 & 1, ((306783379 & i2) == 306783378 && ((bVarA.b(z) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            boolean zEquals = uiText6.equals(vch0.a);
            final boolean z2 = !zEquals;
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            long j = ((lib0) bVarA.O(oib0.a)).i0;
            qyd0 qyd0Var = ajb0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarG, j, j060.e(((zib0) bVarA.O(qyd0Var)).d, ((zib0) bVarA.O(qyd0Var)).d, 0.0f, 0.0f, 12));
            qyd0 qyd0Var2 = ejb0.a;
            d dVarJ = g3w.j(h.j(dVarB, 0.0f, ((cjb0) bVarA.O(qyd0Var2)).h, 0.0f, 0.0f, 13), 13);
            iyf0 iyf0Var = iyf0.a;
            long jA = c68.a(R.color.text_primary, bVarA);
            zs7 zs7Var = new zs7(((cjb0) bVarA.O(qyd0Var2)).f, kotlin.collections.a.c(new u8j(AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "deposit__cancel_btn")), null);
            if (zEquals) {
                bVarA.N(-1285321368);
                cVar = new z45.c(c(function0, uiText5, z, bVarA));
                bVarA.X(false);
            } else {
                bVarA.N(-1285612737);
                cVar = new z45.d(c(function0, uiText5, z, bVarA), new w45.b(pp8.b(108955275, new gaj() { // from class: rv0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar3 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((d) obj).getClass();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            wv0.b(uiText6, function1, aVar3, 0);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarA)));
                bVarA.X(false);
            }
            z45 z45Var = cVar;
            m65 m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarA, 31);
            jib0.e(dVarJ, uiText, jA, iyf0Var, zs7Var, z45Var, new m65(m65VarA.a, ((cjb0) bVarA.O(qyd0Var2)).h, ((cjb0) bVarA.O(qyd0Var2)).g, 0.0f, m65VarA.e), null, function2, null, pp8.b(-45514145, new gaj() { // from class: pv0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    nk0 nk0Var;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strA = vch0.a(uiText2, aVar3);
                        imf0 imf0VarB = imf0.b(mla.l(R.style.B1_R_21, aVar3), c68.a(R.color.text_primary, aVar3), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777182);
                        d.a aVar4 = d.a.b;
                        bt50.a(strA, aVar4, null, imf0VarB, null, aVar3, 48, 20);
                        if (z2) {
                            aVar3.N(1298164024);
                            qyd0 qyd0Var3 = ejb0.a;
                            d dVarB2 = wtc.b(aVar4, ((cjb0) aVar3.O(qyd0Var3)).e, aVar3, aVar4, 1.0f);
                            d160 d160VarA = b160.a(new kw0.i(((cjb0) aVar3.O(qyd0Var3)).e, true, new hw0()), ht.a.j, aVar3, 0);
                            int iHashCode = Long.hashCode(aVar3.m());
                            ne00 ne00VarO = aVar3.o();
                            d dVarC = c.c(aVar3, dVarB2);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            String strA2 = null;
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
                            hlh0.a(aVar3, d160VarA, yka.a.f);
                            hlh0.a(aVar3, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                            }
                            hlh0.a(aVar3, dVarC, yka.a.d);
                            h6n.b(erz.a(R.drawable.ic_tip, 0, aVar3), null, j.r(aVar4, 20.0f), c68.a(R.color.icon_secondary, aVar3), aVar3, 432, 0);
                            String strA3 = vch0.a(uiText3, aVar3);
                            UiText uiText7 = uiText4;
                            if (uiText7 == null) {
                                aVar3.N(-1456551047);
                            } else {
                                aVar3.N(1754129800);
                                strA2 = vch0.a(uiText7, aVar3);
                            }
                            aVar3.H();
                            if (strA2 == null || !StringsKt.M(strA3, strA2, false)) {
                                aVar3.N(-1455984893);
                                aVar3.H();
                                nk0Var = new nk0(strA3);
                            } else {
                                aVar3.N(-1456426271);
                                nk0Var = wk0.e(kotlin.text.c.p(strA3, strA2, "^" + strA2 + "^", false), new String[]{"^"}, new ora0(c68.a(R.color.brand_secondary, aVar3), 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534), new ora0(j58.m, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                                aVar3.H();
                            }
                            lkf0.e(nk0Var, aVar4, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, imf0.b(mla.l(R.style.B1_R_21, aVar3), c68.a(R.color.text_secondary, aVar3), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar3, 48, 0, 262140);
                            aVar3.s();
                            aVar3.H();
                        } else {
                            aVar3.N(1299712195);
                            aVar3.H();
                        }
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVarA, (i2 & 112) | 3072 | (234881024 & (i2 >> 3)), 6, 640);
            bVarA = bVarA;
            dVar2 = aVar2;
        } else {
            bVarA.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uiText, uiText2, uiText3, uiText4, uiText5, uiText6, function0, function1, function2, z, i) { // from class: qv0
                public final /* synthetic */ UiText b;
                public final /* synthetic */ UiText c;
                public final /* synthetic */ UiText d;
                public final /* synthetic */ UiText e;
                public final /* synthetic */ UiText f;
                public final /* synthetic */ UiText i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ boolean z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wv0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final UiText uiText, Function0<Unit> function0, a aVar, int i) {
        b bVarI = aVar.i(-936273501);
        int i2 = (bVarI.M(uiText) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(d.a.b, 1.0f);
            String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            alb0 alb0Var = sya.b;
            alb0 alb0Var2 = g9z.a;
            p9z.a(dVarG, strG, null, g9z.b(c68.a(R.color.icon_primary, bVarI), 0L, bVarI, 5), g9z.a(c68.a(R.color.icon_primary, bVarI), 0L, bVarI, 5), alb0Var, null, function0, pp8.b(-1149462188, new gaj() { // from class: uv0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar2, 0);
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
                        h6n.b(erz.a(R.drawable.ic_phone_call, 0, aVar2), null, j.r(aVar3, 20.0f), c68.a(R.color.icon_primary, aVar2), aVar2, 432, 0);
                        lkf0.d(vch0.a(uiText, aVar2), h.j(aVar3, ((cjb0) aVar2.O(ejb0.a)).c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(y9a.a.a, aVar2), aVar2, 0, 0, 131068);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 << 18) & 29360128) | 100663302, 68);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new vv0(uiText, function0, i, 0);
        }
    }

    public static final w45.b c(final Function0 function0, final UiText uiText, final boolean z, a aVar) {
        return new w45.b(pp8.b(326304930, new gaj() { // from class: sv0
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d) obj).getClass();
                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d dVarG = j.g(d.a.b, 1.0f);
                    alb0 alb0Var = sya.b;
                    aza.a(dVarG, null, z ? uxs.LOADING : uxs.ENABLE, null, alb0Var, null, null, null, function0, pp8.b(-776110661, new tv0(uiText, 0), aVar2), aVar2, 805306374, 234);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, aVar), kotlin.collections.a.c(new u8j(AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "deposit__confirm_btn")));
    }
}
