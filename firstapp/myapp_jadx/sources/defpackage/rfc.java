package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class rfc {
    public static final void a(d dVar, final String str, yle yleVar, final Function0 function0, final Function0 function1, final Function0 function2, Function0 function3, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        b bVar;
        final yle yleVar2;
        final Function0 function4;
        final d dVar3;
        str.getClass();
        b bVarI = aVar.i(1512616012);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        }
        int i5 = i3 | (bVarI.M(str) ? 32 : 16) | 3456 | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288) | 12582912;
        if (bVarI.q(i5 & 1, (4793491 & i5) != 4793490)) {
            d dVar4 = i4 != 0 ? d.a.b : dVar2;
            yle yleVar3 = new yle(false, false, 7);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new nfc();
                bVarI.r(objY);
            }
            Function0 function5 = (Function0) objY;
            bVar = bVarI;
            nzj.a(dVar4, str, null, null, pp8.b(-254187927, new gaj() { // from class: ofc
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strA = cb40.a(R.string.common_functions__contact_service, new Object[0], aVar2);
                        final wk0.a aVarC = wk0.c(c.p(cb40.a(R.string.common_otp_verify__rate_limit_exceeded_please_try_again_later_or_cs, new Object[0], aVar2), strA, tug.a("^", strA, "^"), false), new String[]{"^"}, imf0.b(mla.l(R.style.B1_R, aVar2), c68.a(R.color.brand_secondary, aVar2), 0L, null, null, null, 0L, null, null, null, 0, mla.m(21.0f, aVar2), null, null, 16646142).a, imf0.b(mla.l(R.style.B1_R, aVar2), c68.a(R.color.text_type1_primary, aVar2), 0L, null, null, null, 0L, null, null, null, 0, mla.m(21.0f, aVar2), null, null, 16646142).a);
                        d dVarJ = h.j(d.a.b, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                        imf0 imf0VarB = imf0.b(mla.l(R.style.B1_R, aVar2), 0L, 0L, null, null, null, 0L, null, null, null, 0, mla.m(21.0f, aVar2), null, null, 16646143);
                        nk0 nk0Var = aVarC.a;
                        boolean zA = aVar2.A(aVarC);
                        final Function0 function6 = function0;
                        boolean zM = zA | aVar2.M(function6);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == a.C0041a.a) {
                            objY2 = new Function1() { // from class: qfc
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    nk0.d dVar5 = (nk0.d) CollectionsKt.firstOrNull(aVarC.a.b(iIntValue2, iIntValue2, "tag_target"));
                                    if (dVar5 != null) {
                                        ((String) dVar5.a).getClass();
                                        function6.invoke();
                                        Unit unit = Unit.a;
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        vr7.a(nk0Var, dVarJ, imf0VarB, false, 0, 0, null, (Function1) objY2, aVar2, 48, 120);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, yleVar3, null, function1, function2, function5, bVar, (i5 & 14) | 24576 | (i5 & 112) | 905969664, (i5 >> 15) & 1022, 236);
            dVar3 = dVar4;
            yleVar2 = yleVar3;
            function4 = function5;
        } else {
            bVar = bVarI;
            bVar.G();
            yleVar2 = yleVar;
            function4 = function3;
            dVar3 = dVar2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, yleVar2, function0, function1, function2, function4, i, i2) { // from class: pfc
                public final /* synthetic */ String b;
                public final /* synthetic */ yle c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ int v;

                {
                    this.v = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rfc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA, this.v);
                    return Unit.a;
                }
            };
        }
    }
}
