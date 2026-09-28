package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ccf0 {
    public static final void a(d dVar, final boolean z, uxs uxsVar, final Function0 function0, final Function0 function1, a aVar, final int i) {
        final uxs uxsVar2;
        final d dVar2;
        uxsVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(2000894996);
        int i2 = i | 6 | (bVarI.b(z) ? 32 : 16) | (bVarI.d(uxsVar.ordinal()) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            String strA = cb40.a(R.string.wap_profile__telegram, new Object[0], bVarI);
            nz20[] nz20VarArr = nz20.a;
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new zbf0();
                bVarI.r(objY);
            }
            uxsVar2 = uxsVar;
            op8 op8VarB = pp8.b(2120470862, new gaj() { // from class: acf0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z2 = z;
                        uxs uxsVar3 = uxsVar2;
                        if (z2) {
                            aVar2.N(568506342);
                            p9z.a(null, cb40.a(R.string.wap_profile__unbind, new Object[0], aVar2), uxsVar3, null, null, g9z.c, "telegram_unbind_button", function1, null, aVar2, 1572864, 281);
                            aVar2.H();
                        } else {
                            aVar2.N(568835469);
                            aza.a(null, cb40.a(R.string.wap_profile__bind, new Object[0], aVar2), uxsVar3, null, sya.e, null, null, "telegram_bind_button", function0, null, aVar2, 12582912, 617);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            d.a aVar2 = d.a.b;
            i130.a(aVar2, strA, false, 0L, "telegram_section", (Function0) objY, op8VarB, bVarI, 14377350, 8);
            dVar2 = aVar2;
        } else {
            uxsVar2 = uxsVar;
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, uxsVar2, function0, function1, i) { // from class: bcf0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ uxs c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ccf0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final oaf0 oaf0Var, final Function1<? super paf0, Unit> function1, a aVar, final int i) {
        b bVar;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> ze7Var;
        function1.getClass();
        b bVarI = aVar.i(-957508183);
        int i2 = (bVarI.M(oaf0Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            if (oaf0Var == null) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    ze7Var = new ze7(oaf0Var, function1, i);
                }
            } else if (oaf0Var instanceof oaf0.b) {
                bVarI.N(-1042355688);
                cys.a(null, bVarI, 0);
                bVarI.X(false);
                bVar = bVarI;
            } else {
                boolean z = oaf0Var instanceof oaf0.c;
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (z) {
                    bVarI.N(2046810870);
                    oaf0.c cVar = (oaf0.c) oaf0Var;
                    ResourceUiText resourceUiText = cVar.a;
                    qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                    String strG = resourceUiText.g((Context) bVarI.O(qyd0Var));
                    String strG2 = cVar.b.g((Context) bVarI.O(qyd0Var));
                    String strG3 = cVar.c.g((Context) bVarI.O(qyd0Var));
                    String strG4 = cVar.d.g((Context) bVarI.O(qyd0Var));
                    int i3 = i2 & 112;
                    int i4 = i2 & 14;
                    boolean z2 = (i3 == 32) | (i4 == 4);
                    Object objY = bVarI.y();
                    if (z2 || objY == c0042a) {
                        objY = new pc70(1, oaf0Var, function1);
                        bVarI.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean z3 = (i3 == 32) | (i4 == 4);
                    Object objY2 = bVarI.y();
                    if (z3 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: vbf0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(((oaf0.c) oaf0Var).e);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    Function0 function2 = (Function0) objY2;
                    boolean z4 = (i4 == 4) | (i3 == 32);
                    Object objY3 = bVarI.y();
                    if (z4 || objY3 == c0042a) {
                        objY3 = new cf7(1, function1, oaf0Var);
                        bVarI.r(objY3);
                    }
                    nzj.d(strG, strG2, null, null, strG3, strG4, null, null, null, null, function0, function2, (Function0) objY3, null, bVarI, 0, 0, 18332);
                    bVar = bVarI;
                    bVar.X(false);
                } else {
                    if (!(oaf0Var instanceof oaf0.a)) {
                        throw igf0.a(bVarI, -1042356886, false);
                    }
                    bVarI.N(2047393205);
                    oaf0.a aVar2 = (oaf0.a) oaf0Var;
                    UiText uiText = aVar2.a;
                    qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
                    String strG5 = uiText.g((Context) bVarI.O(qyd0Var2));
                    UiText uiText2 = aVar2.b;
                    uiText2.getClass();
                    String strG6 = uiText2.g((Context) bVarI.O(qyd0Var2));
                    int i5 = i2 & 112;
                    int i6 = i2 & 14;
                    boolean z5 = (i5 == 32) | (i6 == 4);
                    Object objY4 = bVarI.y();
                    if (z5 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: wbf0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(((oaf0.a) oaf0Var).c);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    Function0 function3 = (Function0) objY4;
                    boolean z6 = (i5 == 32) | (i6 == 4);
                    Object objY5 = bVarI.y();
                    if (z6 || objY5 == c0042a) {
                        objY5 = new Function0() { // from class: xbf0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(((oaf0.a) oaf0Var).c);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    nzj.b(null, strG5, strG6, null, null, null, null, null, null, null, null, function3, (Function0) objY5, null, bVarI, 0, 0, 10233);
                    bVar = bVarI;
                    bVar.X(false);
                }
            }
            eVarZ.d = ze7Var;
        }
        bVar = bVarI;
        bVar.G();
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            ze7Var = new Function2(function1, i) { // from class: ybf0
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ccf0.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = ze7Var;
        }
    }
}
