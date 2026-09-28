package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class ct00 {
    public static final void a(String str, a aVar, int i) {
        b bVar;
        b bVarI = aVar.i(-723010389);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(str, h.j(d.a.b, 16.0f, 0.0f, 8.0f, 2.0f, 2), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVar, (i2 & 14) | 48, 0, 131064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new v9w(str, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f6 A[PHI: r1 r4 r16 r17
      0x00f6: PHI (r1v29 int) = (r1v22 int), (r1v33 int) binds: [B:86:0x0120, B:74:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r4v7 com.sporty.android.common_ui.uitext.UiText) = (r4v4 com.sporty.android.common_ui.uitext.UiText), (r4v1 com.sporty.android.common_ui.uitext.UiText) binds: [B:86:0x0120, B:74:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r16v8 boolean) = (r16v6 boolean), (r16v10 boolean) binds: [B:86:0x0120, B:74:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x00f6: PHI (r17v3 java.lang.String) = (r17v1 java.lang.String), (r17v5 java.lang.String) binds: [B:86:0x0120, B:74:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0104  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:90:0x0129  */
    /* JADX WARN: Code duplicated, block: B:91:0x012c  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0139  */
    /* JADX WARN: Code duplicated, block: B:96:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x015a  */
    public static final void b(final d dVar, final ijf0 ijf0Var, UiText uiText, final Function1<? super ijf0, Unit> function1, final String str, boolean z, String str2, Integer num, a aVar, final int i, final int i2) {
        int i3;
        UiText uiText2;
        int i4;
        Function1<? super ijf0, Unit> function2;
        boolean z2;
        String strE;
        int i5;
        int i6;
        Integer num2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        b bVar;
        final boolean z4;
        final String str3;
        final Integer num3;
        final UiText uiText3;
        e eVarZ;
        ycg.b bVar2;
        int i10;
        boolean z5;
        String str4;
        Integer num4;
        boolean z6;
        ycg.b bVar3;
        ijf0Var.getClass();
        function1.getClass();
        str.getClass();
        b bVarI = aVar.i(-1400234636);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i3 | (bVarI.M(ijf0Var) ? 32 : 16);
        int i12 = i2 & 4;
        if (i12 != 0) {
            i4 = i11 | 384;
            uiText2 = uiText;
        } else {
            uiText2 = uiText;
            i4 = i11 | (bVarI.M(uiText2) ? 256 : 128);
        }
        if ((i & 3072) == 0) {
            function2 = function1;
            i4 |= bVarI.A(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        int i13 = i4 | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        int i14 = i2 & 32;
        if (i14 == 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                i13 |= bVarI.b(z2) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                strE = str2;
                int i15 = bVarI.M(strE) ? 1048576 : 524288;
                i5 = i13 | i15;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i8 = i5 | 12582912;
                    num2 = num;
                } else {
                    num2 = num;
                    if (bVarI.M(num2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i8 = i5 | i7;
                }
                i9 = i8;
                if ((i8 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    bVarI.A0();
                    bVar2 = null;
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i12 != 0) {
                            uiText2 = null;
                        }
                        if (i14 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            strE = pwo.e(R.string.common_functions__mobile_phone_number, bVarI);
                            i10 = i9 & (-3670017);
                        } else {
                            i10 = i9;
                        }
                        z5 = z2;
                        str4 = strE;
                        if (i6 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                    } else {
                        bVarI.G();
                        if ((i2 & 64) != 0) {
                            i10 = i9 & (-3670017);
                            z5 = z2;
                            str4 = strE;
                            num4 = num2;
                        } else {
                            str4 = strE;
                            num4 = num2;
                            i10 = i9;
                            z5 = z2;
                        }
                    }
                    bVarI.Y();
                    if (uiText2 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (uiText2 == null) {
                        bVarI.N(505227742);
                        bVarI.X(false);
                    } else {
                        bVarI.N(505227743);
                        ycg.b bVar4 = new ycg.b(uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)));
                        bVarI.X(false);
                        bVar2 = bVar4;
                    }
                    if (bVar2 != null) {
                        bVar3 = bVar2;
                    } else {
                        bVar3 = new ycg.b("", "error_text");
                    }
                    bVar = bVarI;
                    jr7.a(dVar, ijf0Var, pp8.b(-110966587, new Function2() { // from class: at00
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                ct00.a(str, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), z6, bVar3, z5, str4, null, null, new gop(4, 6, 115), null, 0, num4, null, function2, bVar, 805306752 | (i10 & 14) | (i10 & 112) | (458752 & i10) | (3670016 & i10), ((i10 >> 15) & 896) | ((i10 << 3) & 57344), 11648);
                    z4 = z5;
                    str3 = str4;
                    num3 = num4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z4 = z2;
                    str3 = strE;
                    num3 = num2;
                }
                uiText3 = uiText2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: bt00
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ct00.b(dVar, ijf0Var, uiText3, function1, str, z4, str3, num3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            strE = str2;
            i5 = i13 | i15;
            i6 = i2 & 128;
            if (i6 != 0) {
                i8 = i5 | 12582912;
                num2 = num;
            } else {
                num2 = num;
                if (bVarI.M(num2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i8 = i5 | i7;
            }
            i9 = i8;
            if ((i8 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                bVar2 = null;
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        uiText2 = null;
                    }
                    if (i14 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        strE = pwo.e(R.string.common_functions__mobile_phone_number, bVarI);
                        i10 = i9 & (-3670017);
                    } else {
                        i10 = i9;
                    }
                    z5 = z2;
                    str4 = strE;
                    if (i6 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                } else {
                    if (i12 != 0) {
                        uiText2 = null;
                    }
                    if (i14 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        strE = pwo.e(R.string.common_functions__mobile_phone_number, bVarI);
                        i10 = i9 & (-3670017);
                    } else {
                        i10 = i9;
                    }
                    z5 = z2;
                    str4 = strE;
                    if (i6 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                }
                bVarI.Y();
                if (uiText2 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (uiText2 == null) {
                    bVarI.N(505227742);
                    bVarI.X(false);
                } else {
                    bVarI.N(505227743);
                    ycg.b bVar5 = new ycg.b(uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)));
                    bVarI.X(false);
                    bVar2 = bVar5;
                }
                if (bVar2 != null) {
                    bVar3 = bVar2;
                } else {
                    bVar3 = new ycg.b("", "error_text");
                }
                bVar = bVarI;
                jr7.a(dVar, ijf0Var, pp8.b(-110966587, new Function2() { // from class: at00
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ct00.a(str, aVar2, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), z6, bVar3, z5, str4, null, null, new gop(4, 6, 115), null, 0, num4, null, function2, bVar, 805306752 | (i10 & 14) | (i10 & 112) | (458752 & i10) | (3670016 & i10), ((i10 >> 15) & 896) | ((i10 << 3) & 57344), 11648);
                z4 = z5;
                str3 = str4;
                num3 = num4;
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
                str3 = strE;
                num3 = num2;
            }
            uiText3 = uiText2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: bt00
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ct00.b(dVar, ijf0Var, uiText3, function1, str, z4, str3, num3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i13 |= 196608;
        z2 = z;
        if ((i2 & 64) == 0) {
            strE = str2;
            if (bVarI.M(strE)) {
            }
            i5 = i13 | i15;
            i6 = i2 & 128;
            if (i6 != 0) {
                i8 = i5 | 12582912;
                num2 = num;
            } else {
                num2 = num;
                if (bVarI.M(num2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i8 = i5 | i7;
            }
            i9 = i8;
            if ((i8 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                bVar2 = null;
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        uiText2 = null;
                    }
                    if (i14 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        strE = pwo.e(R.string.common_functions__mobile_phone_number, bVarI);
                        i10 = i9 & (-3670017);
                    } else {
                        i10 = i9;
                    }
                    z5 = z2;
                    str4 = strE;
                    if (i6 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                } else {
                    if (i12 != 0) {
                        uiText2 = null;
                    }
                    if (i14 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        strE = pwo.e(R.string.common_functions__mobile_phone_number, bVarI);
                        i10 = i9 & (-3670017);
                    } else {
                        i10 = i9;
                    }
                    z5 = z2;
                    str4 = strE;
                    if (i6 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                }
                bVarI.Y();
                if (uiText2 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (uiText2 == null) {
                    bVarI.N(505227742);
                    bVarI.X(false);
                } else {
                    bVarI.N(505227743);
                    ycg.b bVar6 = new ycg.b(uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)));
                    bVarI.X(false);
                    bVar2 = bVar6;
                }
                if (bVar2 != null) {
                    bVar3 = bVar2;
                } else {
                    bVar3 = new ycg.b("", "error_text");
                }
                bVar = bVarI;
                jr7.a(dVar, ijf0Var, pp8.b(-110966587, new Function2() { // from class: at00
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ct00.a(str, aVar2, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), z6, bVar3, z5, str4, null, null, new gop(4, 6, 115), null, 0, num4, null, function2, bVar, 805306752 | (i10 & 14) | (i10 & 112) | (458752 & i10) | (3670016 & i10), ((i10 >> 15) & 896) | ((i10 << 3) & 57344), 11648);
                z4 = z5;
                str3 = str4;
                num3 = num4;
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
                str3 = strE;
                num3 = num2;
            }
            uiText3 = uiText2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: bt00
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ct00.b(dVar, ijf0Var, uiText3, function1, str, z4, str3, num3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        strE = str2;
        i5 = i13 | i15;
        i6 = i2 & 128;
        if (i6 != 0) {
            i8 = i5 | 12582912;
            num2 = num;
        } else {
            num2 = num;
            if (bVarI.M(num2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i8 = i5 | i7;
        }
        i9 = i8;
        if ((i8 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i9 & 1, z3)) {
            bVarI.A0();
            bVar2 = null;
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    uiText2 = null;
                }
                if (i14 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    strE = pwo.e(R.string.common_functions__mobile_phone_number, bVarI);
                    i10 = i9 & (-3670017);
                } else {
                    i10 = i9;
                }
                z5 = z2;
                str4 = strE;
                if (i6 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
            } else {
                if (i12 != 0) {
                    uiText2 = null;
                }
                if (i14 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    strE = pwo.e(R.string.common_functions__mobile_phone_number, bVarI);
                    i10 = i9 & (-3670017);
                } else {
                    i10 = i9;
                }
                z5 = z2;
                str4 = strE;
                if (i6 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
            }
            bVarI.Y();
            if (uiText2 != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (uiText2 == null) {
                bVarI.N(505227742);
                bVarI.X(false);
            } else {
                bVarI.N(505227743);
                ycg.b bVar7 = new ycg.b(uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)));
                bVarI.X(false);
                bVar2 = bVar7;
            }
            if (bVar2 != null) {
                bVar3 = bVar2;
            } else {
                bVar3 = new ycg.b("", "error_text");
            }
            bVar = bVarI;
            jr7.a(dVar, ijf0Var, pp8.b(-110966587, new Function2() { // from class: at00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ct00.a(str, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), z6, bVar3, z5, str4, null, null, new gop(4, 6, 115), null, 0, num4, null, function2, bVar, 805306752 | (i10 & 14) | (i10 & 112) | (458752 & i10) | (3670016 & i10), ((i10 >> 15) & 896) | ((i10 << 3) & 57344), 11648);
            z4 = z5;
            str3 = str4;
            num3 = num4;
        } else {
            bVar = bVarI;
            bVar.G();
            z4 = z2;
            str3 = strE;
            num3 = num2;
        }
        uiText3 = uiText2;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bt00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ct00.b(dVar, ijf0Var, uiText3, function1, str, z4, str3, num3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
