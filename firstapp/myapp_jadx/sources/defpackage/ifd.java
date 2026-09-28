package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ifd {
    /* JADX WARN: Code duplicated, block: B:102:0x014c  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0141  */
    public static final void a(final az40 az40Var, final Function1<? super Boolean, Unit> function1, String str, final Function0<Unit> function0, Function0<Unit> function2, final Function0<Unit> function3, a aVar, final int i, final int i2) {
        int i3;
        String str2;
        Function0<Unit> function4;
        int i4;
        Function0<Unit> function5;
        int i5;
        Function0<Unit> function6;
        boolean z;
        final String str3;
        final Function0<Unit> function7;
        e eVarZ;
        String str4;
        a.C0041a.C0042a c0042a;
        final Function0<Unit> function8;
        boolean z2;
        Object objY;
        int i6;
        boolean z3;
        boolean z4;
        Object objY2;
        Object objY3;
        int i7;
        int i8;
        az40Var.getClass();
        function1.getClass();
        function0.getClass();
        function3.getClass();
        b bVarI = aVar.i(1297212398);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(az40Var) : bVarI.A(az40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(function1) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= bVarI.M(str2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                function4 = function0;
                if (bVarI.A(function4)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            } else {
                function4 = function0;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function5 = function2;
                    if (bVarI.A(function5)) {
                        i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    function6 = function3;
                    if (bVarI.A(function6)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                } else {
                    function6 = function3;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i9 != 0) {
                        str4 = "register__ftd_btn";
                    } else {
                        str4 = str2;
                    }
                    c0042a = a.C0041a.a;
                    if (i4 != 0) {
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new ffd();
                            bVarI.r(objY3);
                        }
                        function8 = (Function0) objY3;
                    } else {
                        function8 = function5;
                    }
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY = bVarI.y();
                    if (z2 || objY == c0042a) {
                        objY = new mm(function1, 1);
                        bVarI.r(objY);
                    }
                    Function2 function9 = (Function2) objY;
                    i6 = i3 & 14;
                    if (i6 != 4 || ((i3 & 8) != 0 && bVarI.A(az40Var))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z3 | ((i3 & 57344) == 16384);
                    objY2 = bVarI.y();
                    if (z4 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: gfd
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                az40Var.B1(ts40.w.a, k00.d);
                                function8.invoke();
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    String str5 = str4;
                    xy40.g(az40Var, function9, str5, (Function0) objY2, function4, function6, bVarI, (i3 & 458752) | 8 | i6 | (i3 & 896) | ((i3 << 3) & 57344));
                    str3 = str5;
                    function7 = function8;
                } else {
                    bVarI.G();
                    str3 = str2;
                    function7 = function5;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: hfd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ifd.a(az40Var, function1, str3, function0, function7, function3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            function5 = function2;
            if ((196608 & i) == 0) {
                function6 = function3;
                if (bVarI.A(function6)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            } else {
                function6 = function3;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i9 != 0) {
                    str4 = "register__ftd_btn";
                } else {
                    str4 = str2;
                }
                c0042a = a.C0041a.a;
                if (i4 != 0) {
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new ffd();
                        bVarI.r(objY3);
                    }
                    function8 = (Function0) objY3;
                } else {
                    function8 = function5;
                }
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY = bVarI.y();
                if (z2) {
                    objY = new mm(function1, 1);
                    bVarI.r(objY);
                } else {
                    objY = new mm(function1, 1);
                    bVarI.r(objY);
                }
                Function2 function10 = (Function2) objY;
                i6 = i3 & 14;
                if (i6 != 4) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                z4 = z3 | ((i3 & 57344) == 16384);
                objY2 = bVarI.y();
                if (z4) {
                    objY2 = new Function0() { // from class: gfd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            az40Var.B1(ts40.w.a, k00.d);
                            function8.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    objY2 = new Function0() { // from class: gfd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            az40Var.B1(ts40.w.a, k00.d);
                            function8.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                String str6 = str4;
                xy40.g(az40Var, function10, str6, (Function0) objY2, function4, function6, bVarI, (i3 & 458752) | 8 | i6 | (i3 & 896) | ((i3 << 3) & 57344));
                str3 = str6;
                function7 = function8;
            } else {
                bVarI.G();
                str3 = str2;
                function7 = function5;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: hfd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ifd.a(az40Var, function1, str3, function0, function7, function3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        str2 = str;
        if ((i & 3072) == 0) {
            function4 = function0;
            if (bVarI.A(function4)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        } else {
            function4 = function0;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function5 = function2;
                if (bVarI.A(function5)) {
                    i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                function6 = function3;
                if (bVarI.A(function6)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            } else {
                function6 = function3;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i9 != 0) {
                    str4 = "register__ftd_btn";
                } else {
                    str4 = str2;
                }
                c0042a = a.C0041a.a;
                if (i4 != 0) {
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new ffd();
                        bVarI.r(objY3);
                    }
                    function8 = (Function0) objY3;
                } else {
                    function8 = function5;
                }
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY = bVarI.y();
                if (z2) {
                    objY = new mm(function1, 1);
                    bVarI.r(objY);
                } else {
                    objY = new mm(function1, 1);
                    bVarI.r(objY);
                }
                Function2 function11 = (Function2) objY;
                i6 = i3 & 14;
                if (i6 != 4) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                z4 = z3 | ((i3 & 57344) == 16384);
                objY2 = bVarI.y();
                if (z4) {
                    objY2 = new Function0() { // from class: gfd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            az40Var.B1(ts40.w.a, k00.d);
                            function8.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    objY2 = new Function0() { // from class: gfd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            az40Var.B1(ts40.w.a, k00.d);
                            function8.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                String str7 = str4;
                xy40.g(az40Var, function11, str7, (Function0) objY2, function4, function6, bVarI, (i3 & 458752) | 8 | i6 | (i3 & 896) | ((i3 << 3) & 57344));
                str3 = str7;
                function7 = function8;
            } else {
                bVarI.G();
                str3 = str2;
                function7 = function5;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: hfd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ifd.a(az40Var, function1, str3, function0, function7, function3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        function5 = function2;
        if ((196608 & i) == 0) {
            function6 = function3;
            if (bVarI.A(function6)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        } else {
            function6 = function3;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i9 != 0) {
                str4 = "register__ftd_btn";
            } else {
                str4 = str2;
            }
            c0042a = a.C0041a.a;
            if (i4 != 0) {
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new ffd();
                    bVarI.r(objY3);
                }
                function8 = (Function0) objY3;
            } else {
                function8 = function5;
            }
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objY = bVarI.y();
            if (z2) {
                objY = new mm(function1, 1);
                bVarI.r(objY);
            } else {
                objY = new mm(function1, 1);
                bVarI.r(objY);
            }
            Function2 function12 = (Function2) objY;
            i6 = i3 & 14;
            if (i6 != 4) {
                z3 = true;
            } else {
                z3 = true;
            }
            z4 = z3 | ((i3 & 57344) == 16384);
            objY2 = bVarI.y();
            if (z4) {
                objY2 = new Function0() { // from class: gfd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        az40Var.B1(ts40.w.a, k00.d);
                        function8.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                objY2 = new Function0() { // from class: gfd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        az40Var.B1(ts40.w.a, k00.d);
                        function8.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            String str8 = str4;
            xy40.g(az40Var, function12, str8, (Function0) objY2, function4, function6, bVarI, (i3 & 458752) | 8 | i6 | (i3 & 896) | ((i3 << 3) & 57344));
            str3 = str8;
            function7 = function8;
        } else {
            bVarI.G();
            str3 = str2;
            function7 = function5;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hfd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ifd.a(az40Var, function1, str3, function0, function7, function3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
