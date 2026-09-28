package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hxe {
    public static final void a(zwe zweVar, Function1<? super ywe, Unit> function1, a aVar, final int i) {
        final zwe zweVar2;
        final Function1<? super ywe, Unit> function2;
        function1.getClass();
        b bVarI = aVar.i(-2129597288);
        int i2 = (bVarI.A(zweVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            zweVar2 = zweVar;
            function2 = function1;
            bVarI.G();
        } else if (zweVar instanceof zwe.d) {
            bVarI.N(-2138554906);
            zweVar2 = zweVar;
            function2 = function1;
            b(zweVar2, ywe.e.a, null, function2, bVarI, (i2 & 14) | 56 | ((i2 << 6) & 7168), 4);
            bVarI.X(false);
        } else {
            function2 = function1;
            if (zweVar instanceof zwe.b) {
                bVarI.N(-2138547569);
                zweVar2 = zweVar;
                b(zweVar2, ywe.e.a, ywe.c.a, function2, bVarI, (i2 & 14) | 440 | ((i2 << 6) & 7168), 0);
                bVarI.X(false);
            } else if (zweVar instanceof zwe.c) {
                bVarI.N(-2138537863);
                zweVar2 = zweVar;
                b(zweVar2, ywe.i.a, ywe.c.a, function2, bVarI, (i2 & 14) | 440 | ((i2 << 6) & 7168), 0);
                bVarI.X(false);
            } else if (zweVar instanceof zwe.e) {
                bVarI.N(-2138527783);
                zweVar2 = zweVar;
                b(zweVar2, ywe.j.a, null, function2, bVarI, (i2 & 14) | 56 | ((i2 << 6) & 7168), 4);
                bVarI.X(false);
            } else if (Intrinsics.g(zweVar, zwe.a.e)) {
                bVarI.N(-2138520087);
                zweVar2 = zweVar;
                b(zweVar2, ywe.h.a, null, function2, bVarI, (i2 & 14) | 56 | ((i2 << 6) & 7168), 4);
                bVarI.X(false);
            } else {
                zweVar2 = zweVar;
                bVarI.N(-2138514020);
                bVarI.X(false);
            }
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, i) { // from class: axe
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    hxe.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:69:0x013a  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x0164  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Code duplicated, block: B:83:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0199  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void b(final zwe zweVar, final ywe yweVar, ywe yweVar2, final Function1<? super ywe, Unit> function1, a aVar, final int i, final int i2) {
        ywe yweVar3;
        boolean z;
        b bVar;
        final ywe yweVar4;
        e eVarZ;
        final ywe yweVar5;
        qyd0 qyd0Var;
        String strG;
        String strG2;
        String strG3;
        UiText uiText;
        String strG4;
        ywe yweVar6;
        int i3;
        boolean z2;
        Object objY;
        boolean z3;
        Object objY2;
        int i4;
        b bVarI = aVar.i(329828304);
        int i5 = (bVarI.A(zweVar) ? 4 : 2) | i;
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                yweVar3 = yweVar2;
                i5 |= bVarI.M(yweVar3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (bVarI.A(function1)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 |= i4;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                if (i6 != 0) {
                    yweVar5 = null;
                } else {
                    yweVar5 = yweVar3;
                }
                ResourceUiText resourceUiText = zweVar.a;
                qyd0Var = AndroidCompositionLocals_androidKt.b;
                strG = resourceUiText.g((Context) bVarI.O(qyd0Var));
                UiText uiTextA = zweVar.a();
                uiTextA.getClass();
                strG2 = uiTextA.g((Context) bVarI.O(qyd0Var));
                strG3 = zweVar.c.g((Context) bVarI.O(qyd0Var));
                uiText = zweVar.d;
                if (uiText == null) {
                    bVarI.N(-969768759);
                    bVarI.X(false);
                    strG4 = null;
                } else {
                    bVarI.N(-862566856);
                    strG4 = uiText.g((Context) bVarI.O(qyd0Var));
                    bVarI.X(false);
                }
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (strG4 != null || yweVar5 == null) {
                    yweVar6 = yweVar5;
                    bVarI.N(-969244331);
                    i3 = i5 & 7168;
                    if (i3 == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY = bVarI.y();
                    if (z2 || objY == c0042a) {
                        objY = new exe(function1, 0);
                        bVarI.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    if (i3 == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objY2 = bVarI.y();
                    if (z3 || objY2 == c0042a) {
                        objY2 = new fxe(0, yweVar, function1);
                        bVarI.r(objY2);
                    }
                    nzj.b(null, strG, strG2, null, null, null, strG3, null, null, null, null, function0, (Function0) objY2, null, bVarI, 0, 0, 10169);
                    bVar = bVarI;
                    bVar.X(false);
                } else {
                    bVarI.N(-969682175);
                    int i7 = i5 & 7168;
                    boolean z4 = i7 == 2048;
                    Object objY3 = bVarI.y();
                    if (z4 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: bxe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(ywe.h.a);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean z5 = i7 == 2048;
                    Object objY4 = bVarI.y();
                    if (z5 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: cxe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(yweVar);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    Function0 function3 = (Function0) objY4;
                    boolean z6 = ((i5 & 896) == 256) | (i7 == 2048);
                    Object objY5 = bVarI.y();
                    if (z6 || objY5 == c0042a) {
                        objY5 = new Function0() { // from class: dxe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(yweVar5);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    yweVar6 = yweVar5;
                    nzj.d(strG, strG2, null, null, strG3, strG4, null, null, null, null, function2, function3, (Function0) objY5, null, bVarI, 0, 0, 18332);
                    bVar = bVarI;
                    bVar.X(false);
                }
                yweVar4 = yweVar6;
            } else {
                bVar = bVarI;
                bVar.G();
                yweVar4 = yweVar3;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gxe
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hxe.b(zweVar, yweVar, yweVar4, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 384;
        yweVar3 = yweVar2;
        if ((i & 3072) == 0) {
            if (bVarI.A(function1)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 |= i4;
        }
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i5 & 1, z)) {
            if (i6 != 0) {
                yweVar5 = null;
            } else {
                yweVar5 = yweVar3;
            }
            ResourceUiText resourceUiText2 = zweVar.a;
            qyd0Var = AndroidCompositionLocals_androidKt.b;
            strG = resourceUiText2.g((Context) bVarI.O(qyd0Var));
            UiText uiTextA2 = zweVar.a();
            uiTextA2.getClass();
            strG2 = uiTextA2.g((Context) bVarI.O(qyd0Var));
            strG3 = zweVar.c.g((Context) bVarI.O(qyd0Var));
            uiText = zweVar.d;
            if (uiText == null) {
                bVarI.N(-969768759);
                bVarI.X(false);
                strG4 = null;
            } else {
                bVarI.N(-862566856);
                strG4 = uiText.g((Context) bVarI.O(qyd0Var));
                bVarI.X(false);
            }
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (strG4 != null) {
                yweVar6 = yweVar5;
                bVarI.N(-969244331);
                i3 = i5 & 7168;
                if (i3 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY = bVarI.y();
                if (z2) {
                    objY = new exe(function1, 0);
                    bVarI.r(objY);
                } else {
                    objY = new exe(function1, 0);
                    bVarI.r(objY);
                }
                Function0 function4 = (Function0) objY;
                if (i3 == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objY2 = bVarI.y();
                if (z3) {
                    objY2 = new fxe(0, yweVar, function1);
                    bVarI.r(objY2);
                } else {
                    objY2 = new fxe(0, yweVar, function1);
                    bVarI.r(objY2);
                }
                nzj.b(null, strG, strG2, null, null, null, strG3, null, null, null, null, function4, (Function0) objY2, null, bVarI, 0, 0, 10169);
                bVar = bVarI;
                bVar.X(false);
            } else {
                yweVar6 = yweVar5;
                bVarI.N(-969244331);
                i3 = i5 & 7168;
                if (i3 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY = bVarI.y();
                if (z2) {
                    objY = new exe(function1, 0);
                    bVarI.r(objY);
                } else {
                    objY = new exe(function1, 0);
                    bVarI.r(objY);
                }
                Function0 function5 = (Function0) objY;
                if (i3 == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objY2 = bVarI.y();
                if (z3) {
                    objY2 = new fxe(0, yweVar, function1);
                    bVarI.r(objY2);
                } else {
                    objY2 = new fxe(0, yweVar, function1);
                    bVarI.r(objY2);
                }
                nzj.b(null, strG, strG2, null, null, null, strG3, null, null, null, null, function5, (Function0) objY2, null, bVarI, 0, 0, 10169);
                bVar = bVarI;
                bVar.X(false);
            }
            yweVar4 = yweVar6;
        } else {
            bVar = bVarI;
            bVar.G();
            yweVar4 = yweVar3;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gxe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hxe.b(zweVar, yweVar, yweVar4, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
