package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class vy3 {
    public static final void a(final Function0 function0, final Function0 function1, d dVar, boolean z, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        int i4;
        final d dVar2;
        final boolean z2;
        b bVarA = v2g.a(function0, function1, aVar, 931862776);
        if ((i & 6) == 0) {
            i3 = i | (bVarA.A(function0) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarA.A(function1) ? 32 : 16;
        }
        int i5 = i3 | 384;
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i3 | 3456;
        } else {
            i4 = i5 | (bVarA.b(z) ? 2048 : 1024);
        }
        if (bVarA.q(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z3 = i6 != 0 ? false : z;
            b(cb40.a(R.string.page_loyalty__popup_betslip_unlock_success_title, new Object[0], bVarA), cb40.a(R.string.page_loyalty__popup_betslip_unlock_success_content, new Object[0], bVarA), cb40.a(R.string.page_loyalty__popup_betslip_unlock_success_cta, new Object[0], bVarA), function0, function1, z3 ? uxs.LOADING : uxs.ENABLE, kotlin.collections.a.c(new u8j(AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "loyalty__earned_betslip_theme_bottom_sheet_betslip_theme_apply_btn")), op8Var, bVarA, 100663296 | ((i4 << 9) & 523264));
            dVar2 = d.a.b;
            z2 = z3;
        } else {
            bVarA.G();
            dVar2 = dVar;
            z2 = z;
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ry3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vy3.a(function0, function1, dVar2, z2, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final String str3, final Function0 function0, final Function0 function1, final uxs uxsVar, final List list, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarA = v2g.a(function0, function1, aVar, 1140104145);
        if ((i & 6) == 0) {
            i2 = (bVarA.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.M(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.M(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarA.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarA.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i3 = 196608 & i;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 |= bVarA.M(aVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= bVarA.d(uxsVar.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? bVarA.M(list) : bVarA.A(list) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarA.A(op8Var) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (bVarA.q(i4 & 1, (i4 & 38347923) != 38347922)) {
            StringUiText stringUiText = vch0.a;
            StringUiText stringUiText2 = new StringUiText(str);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarA.O(qyd0Var)).o;
            iyf0 iyf0Var = iyf0.b;
            long j2 = ((lib0) bVarA.O(qyd0Var)).b1;
            long j3 = ((lib0) bVarA.O(qyd0Var)).o;
            StringUiText stringUiText3 = new StringUiText(str3);
            list.getClass();
            z45.c cVar = new z45.c(new w45.c("bottom_sheet_primary_button", stringUiText3, uxsVar, list, function0));
            qyd0 qyd0Var2 = ejb0.a;
            jib0.d(aVar2, stringUiText2, null, j2, j3, j, iyf0Var, null, cVar, m65.a.a(0.0f, ((cjb0) bVarA.O(qyd0Var2)).f, ((cjb0) bVarA.O(qyd0Var2)).f, ((cjb0) bVarA.O(qyd0Var2)).h, bVarA, 9), null, null, function1, null, null, null, pp8.b(1304676975, new gaj() { // from class: ty3
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        qyd0 qyd0Var3 = ejb0.a;
                        float f = ((cjb0) aVar3.O(qyd0Var3)).f;
                        d.a aVar4 = d.a.b;
                        d dVarH = h.h(aVar4, 0.0f, f, 1);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarH);
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
                        hlh0.a(aVar3, aivVarC, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        op8Var.invoke(aVar3, 0);
                        aVar3.s();
                        gnm.a(wtc.b(aVar4, ((cjb0) aVar3.O(qyd0Var3)).f, aVar3, aVar4, 1.0f), kotlin.text.c.p(kotlin.text.c.p(str2, "\\n", "<br>", false), "\n", "<br>", false), R.color.text_inverse_primary, R.style.B1_R, 1, false, aVar3, 221190, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVarA, ((i4 >> 15) & 14) | 1572864, ((i4 >> 6) & 896) | 1572864, 60548);
            bVar = bVarA;
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: uy3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vy3.b(str, str2, str3, function0, function1, uxsVar, list, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final Function0 function0, final Function0 function1, d dVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        final d dVar2;
        b bVarA = v2g.a(function0, function1, aVar, -1024171495);
        if ((i & 6) == 0) {
            i2 = (bVarA.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function1) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (bVarA.q(i3 & 1, (i3 & 9363) != 9362)) {
            b(cb40.a(R.string.page_loyalty__popup_betslip_unlock_title, new Object[0], bVarA), cb40.a(R.string.page_loyalty__popup_betslip_unlock_content, new Object[0], bVarA), cb40.a(R.string.common_functions__confirm, new Object[0], bVarA), function0, function1, z ? uxs.LOADING : uxs.ENABLE, kotlin.collections.a.c(new u8j(AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "loyalty__unlock_betslip_theme_bottom_sheet_confirm_btn")), op8Var, bVarA, 100663296 | ((i3 << 6) & 523264));
            dVar2 = d.a.b;
        } else {
            bVarA.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sy3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vy3.c(z, function0, function1, dVar2, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
