package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class bt50 {
    /* JADX WARN: Code duplicated, block: B:102:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0176  */
    /* JADX WARN: Code duplicated, block: B:106:0x018d A[LOOP:0: B:104:0x0187->B:106:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x012c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x013a  */
    public static final void a(final String str, d dVar, Function1<? super String, Unit> function1, final imf0 imf0Var, ct50 ct50Var, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        final Function1<? super String, Unit> function2;
        int i4;
        boolean z;
        boolean z2;
        final ct50 ct50Var2;
        final Function1<? super String, Unit> function3;
        e eVarZ;
        int i5;
        boolean zBooleanValue;
        Object objY;
        final ytw ytwVarA;
        Map<String, Integer> map;
        Context context;
        boolean zD;
        Object objY2;
        ArrayList arrayList;
        Object objY3;
        int i6;
        boolean zA;
        int i7;
        ct50 ct50Var3 = ct50Var;
        str.getClass();
        b bVarI = aVar.i(-711626213);
        int i8 = (i & 6) == 0 ? (bVarI.M(str) ? 4 : 2) | i : i;
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                dVar2 = dVar;
                i8 |= bVarI.M(dVar2) ? 32 : 16;
            }
            i3 = i2 & 4;
            if (i3 != 0) {
                if ((i & 384) == 0) {
                    function2 = function1;
                    if (bVarI.A(function2)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i8 |= i4;
                }
                if ((i & 3072) == 0) {
                    if (bVarI.M(imf0Var)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i8 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) != 0) {
                        i6 = 8192;
                    } else {
                        if ((32768 & i) == 0) {
                            zA = bVarI.M(ct50Var3);
                        } else {
                            zA = bVarI.A(ct50Var3);
                        }
                        if (zA) {
                            i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i6 = 8192;
                        }
                    }
                    i8 |= i6;
                }
                z = true;
                if ((i8 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i8 & 1, z2)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i9 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i3 != 0) {
                            function2 = null;
                        }
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                            ct50Var3 = new ct50(0L, null, null, null, 63);
                        }
                    } else {
                        bVarI.G();
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                        }
                    }
                    bVarI.Y();
                    i5 = i8 & 14;
                    zBooleanValue = ((Boolean) bVarI.O(hnn.a)).booleanValue();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zBooleanValue) {
                        bVarI.N(-2061555890);
                        if (((i5 ^ 6) > 4 || !bVarI.M(str)) && (i8 & 6) != 4) {
                        }
                        objY3 = bVarI.y();
                        if (z || objY3 == c0042a) {
                            objY3 = b(str);
                            bVarI.r(objY3);
                        }
                        ytwVarA = m.c((List) objY3, bVarI);
                        bVarI.X(false);
                    } else {
                        bVarI.N(-2061476654);
                        m2g m2gVar = m2g.a;
                        if (((i5 ^ 6) > 4 || !bVarI.M(str)) && (i8 & 6) != 4) {
                        }
                        objY = bVarI.y();
                        if (z || objY == c0042a) {
                            objY = new at50(str, null);
                            bVarI.r(objY);
                        }
                        ytwVarA = bl50.a(m2gVar, str, (Function2) objY, bVarI, ((i5 << 3) & 112) | 6);
                        bVarI.X(false);
                    }
                    map = ct50Var3.e;
                    context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    zD = bVarI.d(((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).uiMode) | bVarI.M(map);
                    objY2 = bVarI.y();
                    if (zD || objY2 == c0042a) {
                        arrayList = new ArrayList(map.size());
                        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                            String key = entry.getKey();
                            int iIntValue = entry.getValue().intValue();
                            String lowerCase = key.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            arrayList.add(new Pair(lowerCase, new j58(r58.b(context.getColor(iIntValue)))));
                        }
                        objY2 = kpu.k(arrayList);
                        bVarI.r(objY2);
                    }
                    hna.b(new j730[]{ft50.a.a(ct50Var3), ft50.b.a((Map) objY2)}, pp8.b(1810618075, new Function2() { // from class: ys50
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                e1p.c((List) ytwVarA.getValue(), dVar2, imf0Var, function2, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 48);
                } else {
                    bVarI.G();
                }
                ct50Var2 = ct50Var3;
                function3 = function2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    final d dVar3 = dVar2;
                    eVarZ.d = new Function2() { // from class: zs50
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            bt50.a(str, dVar3, function3, imf0Var, ct50Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i8 |= 384;
            function2 = function1;
            if ((i & 3072) == 0) {
                if (bVarI.M(imf0Var)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i8 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i6 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zA = bVarI.M(ct50Var3);
                    } else {
                        zA = bVarI.A(ct50Var3);
                    }
                    if (zA) {
                        i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i6 = 8192;
                    }
                }
                i8 |= i6;
            }
            z = true;
            if ((i8 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i8 & 1, z2)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i3 != 0) {
                        function2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i8 &= -57345;
                        ct50Var3 = new ct50(0L, null, null, null, 63);
                    }
                } else {
                    if (i9 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i3 != 0) {
                        function2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i8 &= -57345;
                        ct50Var3 = new ct50(0L, null, null, null, 63);
                    }
                }
                bVarI.Y();
                i5 = i8 & 14;
                zBooleanValue = ((Boolean) bVarI.O(hnn.a)).booleanValue();
                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                if (zBooleanValue) {
                    bVarI.N(-2061555890);
                    z = (i5 ^ 6) > 4 ? false : false;
                    objY3 = bVarI.y();
                    if (z) {
                        objY3 = b(str);
                        bVarI.r(objY3);
                    } else {
                        objY3 = b(str);
                        bVarI.r(objY3);
                    }
                    ytwVarA = m.c((List) objY3, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-2061476654);
                    m2g m2gVar2 = m2g.a;
                    z = (i5 ^ 6) > 4 ? false : false;
                    objY = bVarI.y();
                    if (z) {
                        objY = new at50(str, null);
                        bVarI.r(objY);
                    } else {
                        objY = new at50(str, null);
                        bVarI.r(objY);
                    }
                    ytwVarA = bl50.a(m2gVar2, str, (Function2) objY, bVarI, ((i5 << 3) & 112) | 6);
                    bVarI.X(false);
                }
                map = ct50Var3.e;
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                zD = bVarI.d(((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).uiMode) | bVarI.M(map);
                objY2 = bVarI.y();
                if (zD) {
                    arrayList = new ArrayList(map.size());
                    while (r5.hasNext()) {
                        String key2 = entry.getKey();
                        int iIntValue2 = entry.getValue().intValue();
                        String lowerCase2 = key2.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        arrayList.add(new Pair(lowerCase2, new j58(r58.b(context.getColor(iIntValue2)))));
                    }
                    objY2 = kpu.k(arrayList);
                    bVarI.r(objY2);
                } else {
                    arrayList = new ArrayList(map.size());
                    while (r5.hasNext()) {
                        String key3 = entry.getKey();
                        int iIntValue3 = entry.getValue().intValue();
                        String lowerCase3 = key3.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        arrayList.add(new Pair(lowerCase3, new j58(r58.b(context.getColor(iIntValue3)))));
                    }
                    objY2 = kpu.k(arrayList);
                    bVarI.r(objY2);
                }
                hna.b(new j730[]{ft50.a.a(ct50Var3), ft50.b.a((Map) objY2)}, pp8.b(1810618075, new Function2() { // from class: ys50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue4 = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                            e1p.c((List) ytwVarA.getValue(), dVar2, imf0Var, function2, aVar2, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 48);
            } else {
                bVarI.G();
            }
            ct50Var2 = ct50Var3;
            function3 = function2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                final d dVar4 = dVar2;
                eVarZ.d = new Function2() { // from class: zs50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bt50.a(str, dVar4, function3, imf0Var, ct50Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i8 |= 48;
        dVar2 = dVar;
        i3 = i2 & 4;
        if (i3 != 0) {
            if ((i & 384) == 0) {
                function2 = function1;
                if (bVarI.A(function2)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i8 |= i4;
            }
            if ((i & 3072) == 0) {
                if (bVarI.M(imf0Var)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i8 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i6 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zA = bVarI.M(ct50Var3);
                    } else {
                        zA = bVarI.A(ct50Var3);
                    }
                    if (zA) {
                        i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i6 = 8192;
                    }
                }
                i8 |= i6;
            }
            z = true;
            if ((i8 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i8 & 1, z2)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i3 != 0) {
                        function2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i8 &= -57345;
                        ct50Var3 = new ct50(0L, null, null, null, 63);
                    }
                } else {
                    if (i9 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i3 != 0) {
                        function2 = null;
                    }
                    if ((i2 & 16) != 0) {
                        i8 &= -57345;
                        ct50Var3 = new ct50(0L, null, null, null, 63);
                    }
                }
                bVarI.Y();
                i5 = i8 & 14;
                zBooleanValue = ((Boolean) bVarI.O(hnn.a)).booleanValue();
                a.C0041a.C0042a c0042a3 = a.C0041a.a;
                if (zBooleanValue) {
                    bVarI.N(-2061555890);
                    if ((i5 ^ 6) > 4) {
                    }
                    objY3 = bVarI.y();
                    if (z) {
                        objY3 = b(str);
                        bVarI.r(objY3);
                    } else {
                        objY3 = b(str);
                        bVarI.r(objY3);
                    }
                    ytwVarA = m.c((List) objY3, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-2061476654);
                    m2g m2gVar3 = m2g.a;
                    if ((i5 ^ 6) > 4) {
                    }
                    objY = bVarI.y();
                    if (z) {
                        objY = new at50(str, null);
                        bVarI.r(objY);
                    } else {
                        objY = new at50(str, null);
                        bVarI.r(objY);
                    }
                    ytwVarA = bl50.a(m2gVar3, str, (Function2) objY, bVarI, ((i5 << 3) & 112) | 6);
                    bVarI.X(false);
                }
                map = ct50Var3.e;
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                zD = bVarI.d(((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).uiMode) | bVarI.M(map);
                objY2 = bVarI.y();
                if (zD) {
                    arrayList = new ArrayList(map.size());
                    while (r5.hasNext()) {
                        String key4 = entry.getKey();
                        int iIntValue4 = entry.getValue().intValue();
                        String lowerCase4 = key4.toLowerCase(Locale.ROOT);
                        lowerCase4.getClass();
                        arrayList.add(new Pair(lowerCase4, new j58(r58.b(context.getColor(iIntValue4)))));
                    }
                    objY2 = kpu.k(arrayList);
                    bVarI.r(objY2);
                } else {
                    arrayList = new ArrayList(map.size());
                    while (r5.hasNext()) {
                        String key5 = entry.getKey();
                        int iIntValue5 = entry.getValue().intValue();
                        String lowerCase5 = key5.toLowerCase(Locale.ROOT);
                        lowerCase5.getClass();
                        arrayList.add(new Pair(lowerCase5, new j58(r58.b(context.getColor(iIntValue5)))));
                    }
                    objY2 = kpu.k(arrayList);
                    bVarI.r(objY2);
                }
                hna.b(new j730[]{ft50.a.a(ct50Var3), ft50.b.a((Map) objY2)}, pp8.b(1810618075, new Function2() { // from class: ys50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue6 = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                            e1p.c((List) ytwVarA.getValue(), dVar2, imf0Var, function2, aVar2, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 48);
            } else {
                bVarI.G();
            }
            ct50Var2 = ct50Var3;
            function3 = function2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                final d dVar5 = dVar2;
                eVarZ.d = new Function2() { // from class: zs50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bt50.a(str, dVar5, function3, imf0Var, ct50Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i8 |= 384;
        function2 = function1;
        if ((i & 3072) == 0) {
            if (bVarI.M(imf0Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i8 |= i7;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i6 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zA = bVarI.M(ct50Var3);
                } else {
                    zA = bVarI.A(ct50Var3);
                }
                if (zA) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
            }
            i8 |= i6;
        }
        z = true;
        if ((i8 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i8 & 1, z2)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    dVar2 = d.a.b;
                }
                if (i3 != 0) {
                    function2 = null;
                }
                if ((i2 & 16) != 0) {
                    i8 &= -57345;
                    ct50Var3 = new ct50(0L, null, null, null, 63);
                }
            } else {
                if (i9 != 0) {
                    dVar2 = d.a.b;
                }
                if (i3 != 0) {
                    function2 = null;
                }
                if ((i2 & 16) != 0) {
                    i8 &= -57345;
                    ct50Var3 = new ct50(0L, null, null, null, 63);
                }
            }
            bVarI.Y();
            i5 = i8 & 14;
            zBooleanValue = ((Boolean) bVarI.O(hnn.a)).booleanValue();
            a.C0041a.C0042a c0042a4 = a.C0041a.a;
            if (zBooleanValue) {
                bVarI.N(-2061555890);
                if ((i5 ^ 6) > 4) {
                }
                objY3 = bVarI.y();
                if (z) {
                    objY3 = b(str);
                    bVarI.r(objY3);
                } else {
                    objY3 = b(str);
                    bVarI.r(objY3);
                }
                ytwVarA = m.c((List) objY3, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-2061476654);
                m2g m2gVar4 = m2g.a;
                if ((i5 ^ 6) > 4) {
                }
                objY = bVarI.y();
                if (z) {
                    objY = new at50(str, null);
                    bVarI.r(objY);
                } else {
                    objY = new at50(str, null);
                    bVarI.r(objY);
                }
                ytwVarA = bl50.a(m2gVar4, str, (Function2) objY, bVarI, ((i5 << 3) & 112) | 6);
                bVarI.X(false);
            }
            map = ct50Var3.e;
            context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            zD = bVarI.d(((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).uiMode) | bVarI.M(map);
            objY2 = bVarI.y();
            if (zD) {
                arrayList = new ArrayList(map.size());
                while (r5.hasNext()) {
                    String key6 = entry.getKey();
                    int iIntValue6 = entry.getValue().intValue();
                    String lowerCase6 = key6.toLowerCase(Locale.ROOT);
                    lowerCase6.getClass();
                    arrayList.add(new Pair(lowerCase6, new j58(r58.b(context.getColor(iIntValue6)))));
                }
                objY2 = kpu.k(arrayList);
                bVarI.r(objY2);
            } else {
                arrayList = new ArrayList(map.size());
                while (r5.hasNext()) {
                    String key7 = entry.getKey();
                    int iIntValue7 = entry.getValue().intValue();
                    String lowerCase7 = key7.toLowerCase(Locale.ROOT);
                    lowerCase7.getClass();
                    arrayList.add(new Pair(lowerCase7, new j58(r58.b(context.getColor(iIntValue7)))));
                }
                objY2 = kpu.k(arrayList);
                bVarI.r(objY2);
            }
            hna.b(new j730[]{ft50.a.a(ct50Var3), ft50.b.a((Map) objY2)}, pp8.b(1810618075, new Function2() { // from class: ys50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue8 = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                        e1p.c((List) ytwVarA.getValue(), dVar2, imf0Var, function2, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        ct50Var2 = ct50Var3;
        function3 = function2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar6 = dVar2;
            eVarZ.d = new Function2() { // from class: zs50
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bt50.a(str, dVar6, function3, imf0Var, ct50Var2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final ArrayList b(String str) {
        lzf0 cVar;
        Map map;
        Regex regex = hnm.a;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        q1k.a aVar = new q1k.a(Regex.c(hnm.a, str));
        int i = 0;
        while (aVar.hasNext()) {
            MatchResult matchResult = (MatchResult) aVar.next();
            if (matchResult.b().a > i) {
                String strG = y9g.a.g(str.substring(i, matchResult.b().a), new x9g(0));
                if (strG.length() > 0) {
                    arrayList.add(new lzf0.d(strG));
                }
            }
            String str2 = matchResult.a().get(1);
            String lowerCase = matchResult.a().get(2).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String str3 = matchResult.a().get(3);
            if (Intrinsics.g(matchResult.a().get(4), "/") || hnm.c.contains(lowerCase)) {
                cVar = new lzf0.c(lowerCase);
            } else if (Intrinsics.g(str2, "/")) {
                cVar = new lzf0.a(lowerCase);
            } else {
                if (StringsKt.U(str3)) {
                    map = o2g.a;
                    map.getClass();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    q1k.a aVar2 = new q1k.a(Regex.c(hnm.b, str3));
                    while (aVar2.hasNext()) {
                        MatchResult matchResult2 = (MatchResult) aVar2.next();
                        String lowerCase2 = matchResult2.a().get(1).toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        Regex regex2 = y9g.a;
                        String str4 = matchResult2.a().get(2);
                        str4.getClass();
                        linkedHashMap.put(lowerCase2, y9g.a.g(str4, new x9g(0)));
                    }
                    map = linkedHashMap;
                }
                cVar = new lzf0.b(lowerCase, map);
            }
            arrayList.add(cVar);
            i = matchResult.b().b + 1;
        }
        if (i < str.length()) {
            String strG2 = y9g.a.g(str.substring(i), new x9g(0));
            if (strG2.length() > 0) {
                arrayList.add(new lzf0.d(strG2));
            }
        }
        Map<String, eln> map2 = anm.a;
        return new anm.a(arrayList).b(null);
    }
}
