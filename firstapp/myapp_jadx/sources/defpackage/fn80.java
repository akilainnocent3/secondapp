package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class fn80 {
    /* JADX WARN: Code duplicated, block: B:101:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x011e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x0125  */
    /* JADX WARN: Code duplicated, block: B:108:0x0127  */
    /* JADX WARN: Code duplicated, block: B:111:0x0135  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:121:0x016b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0170  */
    /* JADX WARN: Code duplicated, block: B:125:0x0174  */
    /* JADX WARN: Code duplicated, block: B:126:0x0180  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010a  */
    /* JADX WARN: Code duplicated, block: B:98:0x010e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    public static final void a(final Object obj, final String str, final d dVar, d0b d0bVar, ht htVar, float f, crz crzVar, crz crzVar2, m9n m9nVar, a aVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        ht htVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        crz crzVar3;
        int i11;
        int i12;
        int i13;
        boolean z;
        b bVar;
        final d0b d0bVar2;
        final float f2;
        final m9n m9nVar2;
        final ht htVar3;
        final crz crzVar4;
        final crz crzVar5;
        e eVarZ;
        d0b d0bVar3;
        ht htVar4;
        crz crzVar6;
        crz crzVar7;
        m9n m9nVar3;
        Context context;
        a.C0041a.C0042a c0042a;
        m9n m9nVar4;
        boolean zM;
        Object objY;
        nan nanVarA;
        Object objY2;
        b bVarI = aVar.i(-622095586);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.M(dVar) ? 256 : 128;
        }
        int i14 = i2 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                i3 |= bVarI.M(d0bVar) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bVarI.M(null)) {
                    i4 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    htVar2 = htVar;
                    if (bVarI.M(htVar2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                i7 = 1572864 | i3;
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((12582912 & i) == 0) {
                        if (bVarI.A(crzVar)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i7 |= i9;
                    }
                    i10 = i2 & 256;
                    if (i10 != 0) {
                        if ((100663296 & i) == 0) {
                            crzVar3 = crzVar2;
                            if (bVarI.A(crzVar3)) {
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i7 |= i11;
                        }
                        i12 = i2 & 512;
                        if (i12 != 0) {
                            i7 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            if (bVarI.A(m9nVar)) {
                                i13 = 536870912;
                            } else {
                                i13 = 268435456;
                            }
                            i7 |= i13;
                        }
                        if ((i7 & 306783379) == 306783378) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (bVarI.q(i7 & 1, z)) {
                            if (i14 != 0) {
                                d0bVar3 = d0b.a.b;
                            } else {
                                d0bVar3 = d0bVar;
                            }
                            if (i5 != 0) {
                                htVar4 = ht.a.e;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i8 != 0) {
                                crzVar6 = null;
                            } else {
                                crzVar6 = crzVar;
                            }
                            if (i10 != 0) {
                                crzVar7 = null;
                            } else {
                                crzVar7 = crzVar3;
                            }
                            if (i12 != 0) {
                                m9nVar3 = null;
                            } else {
                                m9nVar3 = m9nVar;
                            }
                            context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                            c0042a = a.C0041a.a;
                            if (m9nVar3 == null) {
                                bVarI.N(-65155495);
                                objY2 = bVarI.y();
                                if (objY2 == c0042a) {
                                    objY2 = in80.a.a(context);
                                    bVarI.r(objY2);
                                }
                                bVarI.X(false);
                                m9nVar4 = (m9n) objY2;
                            } else {
                                bVarI.N(-833386248);
                                bVarI.X(false);
                                m9nVar4 = m9nVar3;
                            }
                            zM = bVarI.M(obj);
                            objY = bVarI.y();
                            if (zM || objY == c0042a) {
                                if (obj instanceof nan) {
                                    nanVarA = (nan) obj;
                                } else if (obj instanceof String) {
                                    nan.a aVar2 = new nan.a(context);
                                    aVar2.c = obj;
                                    nanVarA = aVar2.a();
                                } else {
                                    nan.a aVar3 = new nan.a(context);
                                    aVar3.c = obj;
                                    nanVarA = aVar3.a();
                                }
                                objY = nanVarA;
                                bVarI.r(objY);
                            }
                            int i15 = i7 >> 9;
                            bVar = bVarI;
                            yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i15) | (i15 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                            m9nVar2 = m9nVar3;
                            crzVar5 = crzVar6;
                            crzVar4 = crzVar7;
                            htVar3 = htVar4;
                            d0bVar2 = d0bVar3;
                            f2 = 1.0f;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            d0bVar2 = d0bVar;
                            f2 = f;
                            m9nVar2 = m9nVar;
                            htVar3 = htVar2;
                            crzVar4 = crzVar3;
                            crzVar5 = crzVar;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: en80
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i7 |= 100663296;
                    crzVar3 = crzVar2;
                    i12 = i2 & 512;
                    if (i12 != 0) {
                        i7 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (bVarI.A(m9nVar)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i7 |= i13;
                    }
                    if ((i7 & 306783379) == 306783378) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (bVarI.q(i7 & 1, z)) {
                        if (i14 != 0) {
                            d0bVar3 = d0b.a.b;
                        } else {
                            d0bVar3 = d0bVar;
                        }
                        if (i5 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            crzVar6 = null;
                        } else {
                            crzVar6 = crzVar;
                        }
                        if (i10 != 0) {
                            crzVar7 = null;
                        } else {
                            crzVar7 = crzVar3;
                        }
                        if (i12 != 0) {
                            m9nVar3 = null;
                        } else {
                            m9nVar3 = m9nVar;
                        }
                        context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                        c0042a = a.C0041a.a;
                        if (m9nVar3 == null) {
                            bVarI.N(-65155495);
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = in80.a.a(context);
                                bVarI.r(objY2);
                            }
                            bVarI.X(false);
                            m9nVar4 = (m9n) objY2;
                        } else {
                            bVarI.N(-833386248);
                            bVarI.X(false);
                            m9nVar4 = m9nVar3;
                        }
                        zM = bVarI.M(obj);
                        objY = bVarI.y();
                        if (zM) {
                            if (obj instanceof nan) {
                                nanVarA = (nan) obj;
                            } else if (obj instanceof String) {
                                nan.a aVar4 = new nan.a(context);
                                aVar4.c = obj;
                                nanVarA = aVar4.a();
                            } else {
                                nan.a aVar5 = new nan.a(context);
                                aVar5.c = obj;
                                nanVarA = aVar5.a();
                            }
                            objY = nanVarA;
                            bVarI.r(objY);
                        } else {
                            if (obj instanceof nan) {
                                nanVarA = (nan) obj;
                            } else if (obj instanceof String) {
                                nan.a aVar6 = new nan.a(context);
                                aVar6.c = obj;
                                nanVarA = aVar6.a();
                            } else {
                                nan.a aVar7 = new nan.a(context);
                                aVar7.c = obj;
                                nanVarA = aVar7.a();
                            }
                            objY = nanVarA;
                            bVarI.r(objY);
                        }
                        int i16 = i7 >> 9;
                        bVar = bVarI;
                        yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i16) | (i16 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                        m9nVar2 = m9nVar3;
                        crzVar5 = crzVar6;
                        crzVar4 = crzVar7;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        f2 = 1.0f;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        d0bVar2 = d0bVar;
                        f2 = f;
                        m9nVar2 = m9nVar;
                        htVar3 = htVar2;
                        crzVar4 = crzVar3;
                        crzVar5 = crzVar;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: en80
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i7 = 14155776 | i3;
                i10 = i2 & 256;
                if (i10 != 0) {
                    if ((100663296 & i) == 0) {
                        crzVar3 = crzVar2;
                        if (bVarI.A(crzVar3)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i7 |= i11;
                    }
                    i12 = i2 & 512;
                    if (i12 != 0) {
                        i7 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (bVarI.A(m9nVar)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i7 |= i13;
                    }
                    if ((i7 & 306783379) == 306783378) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (bVarI.q(i7 & 1, z)) {
                        if (i14 != 0) {
                            d0bVar3 = d0b.a.b;
                        } else {
                            d0bVar3 = d0bVar;
                        }
                        if (i5 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            crzVar6 = null;
                        } else {
                            crzVar6 = crzVar;
                        }
                        if (i10 != 0) {
                            crzVar7 = null;
                        } else {
                            crzVar7 = crzVar3;
                        }
                        if (i12 != 0) {
                            m9nVar3 = null;
                        } else {
                            m9nVar3 = m9nVar;
                        }
                        context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                        c0042a = a.C0041a.a;
                        if (m9nVar3 == null) {
                            bVarI.N(-65155495);
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = in80.a.a(context);
                                bVarI.r(objY2);
                            }
                            bVarI.X(false);
                            m9nVar4 = (m9n) objY2;
                        } else {
                            bVarI.N(-833386248);
                            bVarI.X(false);
                            m9nVar4 = m9nVar3;
                        }
                        zM = bVarI.M(obj);
                        objY = bVarI.y();
                        if (zM) {
                            if (obj instanceof nan) {
                                nanVarA = (nan) obj;
                            } else if (obj instanceof String) {
                                nan.a aVar8 = new nan.a(context);
                                aVar8.c = obj;
                                nanVarA = aVar8.a();
                            } else {
                                nan.a aVar9 = new nan.a(context);
                                aVar9.c = obj;
                                nanVarA = aVar9.a();
                            }
                            objY = nanVarA;
                            bVarI.r(objY);
                        } else {
                            if (obj instanceof nan) {
                                nanVarA = (nan) obj;
                            } else if (obj instanceof String) {
                                nan.a aVar10 = new nan.a(context);
                                aVar10.c = obj;
                                nanVarA = aVar10.a();
                            } else {
                                nan.a aVar11 = new nan.a(context);
                                aVar11.c = obj;
                                nanVarA = aVar11.a();
                            }
                            objY = nanVarA;
                            bVarI.r(objY);
                        }
                        int i17 = i7 >> 9;
                        bVar = bVarI;
                        yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i17) | (i17 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                        m9nVar2 = m9nVar3;
                        crzVar5 = crzVar6;
                        crzVar4 = crzVar7;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        f2 = 1.0f;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        d0bVar2 = d0bVar;
                        f2 = f;
                        m9nVar2 = m9nVar;
                        htVar3 = htVar2;
                        crzVar4 = crzVar3;
                        crzVar5 = crzVar;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: en80
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                crzVar3 = crzVar2;
                i12 = i2 & 512;
                if (i12 != 0) {
                    i7 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (bVarI.A(m9nVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i7 |= i13;
                }
                if ((i7 & 306783379) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVarI.q(i7 & 1, z)) {
                    if (i14 != 0) {
                        d0bVar3 = d0b.a.b;
                    } else {
                        d0bVar3 = d0bVar;
                    }
                    if (i5 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        crzVar6 = null;
                    } else {
                        crzVar6 = crzVar;
                    }
                    if (i10 != 0) {
                        crzVar7 = null;
                    } else {
                        crzVar7 = crzVar3;
                    }
                    if (i12 != 0) {
                        m9nVar3 = null;
                    } else {
                        m9nVar3 = m9nVar;
                    }
                    context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    c0042a = a.C0041a.a;
                    if (m9nVar3 == null) {
                        bVarI.N(-65155495);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = in80.a.a(context);
                            bVarI.r(objY2);
                        }
                        bVarI.X(false);
                        m9nVar4 = (m9n) objY2;
                    } else {
                        bVarI.N(-833386248);
                        bVarI.X(false);
                        m9nVar4 = m9nVar3;
                    }
                    zM = bVarI.M(obj);
                    objY = bVarI.y();
                    if (zM) {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar12 = new nan.a(context);
                            aVar12.c = obj;
                            nanVarA = aVar12.a();
                        } else {
                            nan.a aVar13 = new nan.a(context);
                            aVar13.c = obj;
                            nanVarA = aVar13.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    } else {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar14 = new nan.a(context);
                            aVar14.c = obj;
                            nanVarA = aVar14.a();
                        } else {
                            nan.a aVar15 = new nan.a(context);
                            aVar15.c = obj;
                            nanVarA = aVar15.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    }
                    int i18 = i7 >> 9;
                    bVar = bVarI;
                    yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i18) | (i18 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                    m9nVar2 = m9nVar3;
                    crzVar5 = crzVar6;
                    crzVar4 = crzVar7;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    f2 = 1.0f;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    d0bVar2 = d0bVar;
                    f2 = f;
                    m9nVar2 = m9nVar;
                    htVar3 = htVar2;
                    crzVar4 = crzVar3;
                    crzVar5 = crzVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: en80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            htVar2 = htVar;
            i7 = 1572864 | i3;
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    if (bVarI.A(crzVar)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i7 |= i9;
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                    if ((100663296 & i) == 0) {
                        crzVar3 = crzVar2;
                        if (bVarI.A(crzVar3)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i7 |= i11;
                    }
                    i12 = i2 & 512;
                    if (i12 != 0) {
                        i7 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (bVarI.A(m9nVar)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i7 |= i13;
                    }
                    if ((i7 & 306783379) == 306783378) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (bVarI.q(i7 & 1, z)) {
                        if (i14 != 0) {
                            d0bVar3 = d0b.a.b;
                        } else {
                            d0bVar3 = d0bVar;
                        }
                        if (i5 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            crzVar6 = null;
                        } else {
                            crzVar6 = crzVar;
                        }
                        if (i10 != 0) {
                            crzVar7 = null;
                        } else {
                            crzVar7 = crzVar3;
                        }
                        if (i12 != 0) {
                            m9nVar3 = null;
                        } else {
                            m9nVar3 = m9nVar;
                        }
                        context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                        c0042a = a.C0041a.a;
                        if (m9nVar3 == null) {
                            bVarI.N(-65155495);
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = in80.a.a(context);
                                bVarI.r(objY2);
                            }
                            bVarI.X(false);
                            m9nVar4 = (m9n) objY2;
                        } else {
                            bVarI.N(-833386248);
                            bVarI.X(false);
                            m9nVar4 = m9nVar3;
                        }
                        zM = bVarI.M(obj);
                        objY = bVarI.y();
                        if (zM) {
                            if (obj instanceof nan) {
                                nanVarA = (nan) obj;
                            } else if (obj instanceof String) {
                                nan.a aVar16 = new nan.a(context);
                                aVar16.c = obj;
                                nanVarA = aVar16.a();
                            } else {
                                nan.a aVar17 = new nan.a(context);
                                aVar17.c = obj;
                                nanVarA = aVar17.a();
                            }
                            objY = nanVarA;
                            bVarI.r(objY);
                        } else {
                            if (obj instanceof nan) {
                                nanVarA = (nan) obj;
                            } else if (obj instanceof String) {
                                nan.a aVar18 = new nan.a(context);
                                aVar18.c = obj;
                                nanVarA = aVar18.a();
                            } else {
                                nan.a aVar19 = new nan.a(context);
                                aVar19.c = obj;
                                nanVarA = aVar19.a();
                            }
                            objY = nanVarA;
                            bVarI.r(objY);
                        }
                        int i19 = i7 >> 9;
                        bVar = bVarI;
                        yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i19) | (i19 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                        m9nVar2 = m9nVar3;
                        crzVar5 = crzVar6;
                        crzVar4 = crzVar7;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        f2 = 1.0f;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        d0bVar2 = d0bVar;
                        f2 = f;
                        m9nVar2 = m9nVar;
                        htVar3 = htVar2;
                        crzVar4 = crzVar3;
                        crzVar5 = crzVar;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: en80
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                crzVar3 = crzVar2;
                i12 = i2 & 512;
                if (i12 != 0) {
                    i7 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (bVarI.A(m9nVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i7 |= i13;
                }
                if ((i7 & 306783379) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVarI.q(i7 & 1, z)) {
                    if (i14 != 0) {
                        d0bVar3 = d0b.a.b;
                    } else {
                        d0bVar3 = d0bVar;
                    }
                    if (i5 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        crzVar6 = null;
                    } else {
                        crzVar6 = crzVar;
                    }
                    if (i10 != 0) {
                        crzVar7 = null;
                    } else {
                        crzVar7 = crzVar3;
                    }
                    if (i12 != 0) {
                        m9nVar3 = null;
                    } else {
                        m9nVar3 = m9nVar;
                    }
                    context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    c0042a = a.C0041a.a;
                    if (m9nVar3 == null) {
                        bVarI.N(-65155495);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = in80.a.a(context);
                            bVarI.r(objY2);
                        }
                        bVarI.X(false);
                        m9nVar4 = (m9n) objY2;
                    } else {
                        bVarI.N(-833386248);
                        bVarI.X(false);
                        m9nVar4 = m9nVar3;
                    }
                    zM = bVarI.M(obj);
                    objY = bVarI.y();
                    if (zM) {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar110 = new nan.a(context);
                            aVar110.c = obj;
                            nanVarA = aVar110.a();
                        } else {
                            nan.a aVar111 = new nan.a(context);
                            aVar111.c = obj;
                            nanVarA = aVar111.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    } else {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar112 = new nan.a(context);
                            aVar112.c = obj;
                            nanVarA = aVar112.a();
                        } else {
                            nan.a aVar113 = new nan.a(context);
                            aVar113.c = obj;
                            nanVarA = aVar113.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    }
                    int i110 = i7 >> 9;
                    bVar = bVarI;
                    yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i110) | (i110 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                    m9nVar2 = m9nVar3;
                    crzVar5 = crzVar6;
                    crzVar4 = crzVar7;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    f2 = 1.0f;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    d0bVar2 = d0bVar;
                    f2 = f;
                    m9nVar2 = m9nVar;
                    htVar3 = htVar2;
                    crzVar4 = crzVar3;
                    crzVar5 = crzVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: en80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i7 = 14155776 | i3;
            i10 = i2 & 256;
            if (i10 != 0) {
                if ((100663296 & i) == 0) {
                    crzVar3 = crzVar2;
                    if (bVarI.A(crzVar3)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i7 |= i11;
                }
                i12 = i2 & 512;
                if (i12 != 0) {
                    i7 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (bVarI.A(m9nVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i7 |= i13;
                }
                if ((i7 & 306783379) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVarI.q(i7 & 1, z)) {
                    if (i14 != 0) {
                        d0bVar3 = d0b.a.b;
                    } else {
                        d0bVar3 = d0bVar;
                    }
                    if (i5 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        crzVar6 = null;
                    } else {
                        crzVar6 = crzVar;
                    }
                    if (i10 != 0) {
                        crzVar7 = null;
                    } else {
                        crzVar7 = crzVar3;
                    }
                    if (i12 != 0) {
                        m9nVar3 = null;
                    } else {
                        m9nVar3 = m9nVar;
                    }
                    context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    c0042a = a.C0041a.a;
                    if (m9nVar3 == null) {
                        bVarI.N(-65155495);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = in80.a.a(context);
                            bVarI.r(objY2);
                        }
                        bVarI.X(false);
                        m9nVar4 = (m9n) objY2;
                    } else {
                        bVarI.N(-833386248);
                        bVarI.X(false);
                        m9nVar4 = m9nVar3;
                    }
                    zM = bVarI.M(obj);
                    objY = bVarI.y();
                    if (zM) {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar114 = new nan.a(context);
                            aVar114.c = obj;
                            nanVarA = aVar114.a();
                        } else {
                            nan.a aVar115 = new nan.a(context);
                            aVar115.c = obj;
                            nanVarA = aVar115.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    } else {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar116 = new nan.a(context);
                            aVar116.c = obj;
                            nanVarA = aVar116.a();
                        } else {
                            nan.a aVar117 = new nan.a(context);
                            aVar117.c = obj;
                            nanVarA = aVar117.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    }
                    int i111 = i7 >> 9;
                    bVar = bVarI;
                    yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i111) | (i111 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                    m9nVar2 = m9nVar3;
                    crzVar5 = crzVar6;
                    crzVar4 = crzVar7;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    f2 = 1.0f;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    d0bVar2 = d0bVar;
                    f2 = f;
                    m9nVar2 = m9nVar;
                    htVar3 = htVar2;
                    crzVar4 = crzVar3;
                    crzVar5 = crzVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: en80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            crzVar3 = crzVar2;
            i12 = i2 & 512;
            if (i12 != 0) {
                i7 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (bVarI.A(m9nVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i7 |= i13;
            }
            if ((i7 & 306783379) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (bVarI.q(i7 & 1, z)) {
                if (i14 != 0) {
                    d0bVar3 = d0b.a.b;
                } else {
                    d0bVar3 = d0bVar;
                }
                if (i5 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    crzVar6 = null;
                } else {
                    crzVar6 = crzVar;
                }
                if (i10 != 0) {
                    crzVar7 = null;
                } else {
                    crzVar7 = crzVar3;
                }
                if (i12 != 0) {
                    m9nVar3 = null;
                } else {
                    m9nVar3 = m9nVar;
                }
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                c0042a = a.C0041a.a;
                if (m9nVar3 == null) {
                    bVarI.N(-65155495);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = in80.a.a(context);
                        bVarI.r(objY2);
                    }
                    bVarI.X(false);
                    m9nVar4 = (m9n) objY2;
                } else {
                    bVarI.N(-833386248);
                    bVarI.X(false);
                    m9nVar4 = m9nVar3;
                }
                zM = bVarI.M(obj);
                objY = bVarI.y();
                if (zM) {
                    if (obj instanceof nan) {
                        nanVarA = (nan) obj;
                    } else if (obj instanceof String) {
                        nan.a aVar118 = new nan.a(context);
                        aVar118.c = obj;
                        nanVarA = aVar118.a();
                    } else {
                        nan.a aVar119 = new nan.a(context);
                        aVar119.c = obj;
                        nanVarA = aVar119.a();
                    }
                    objY = nanVarA;
                    bVarI.r(objY);
                } else {
                    if (obj instanceof nan) {
                        nanVarA = (nan) obj;
                    } else if (obj instanceof String) {
                        nan.a aVar1110 = new nan.a(context);
                        aVar1110.c = obj;
                        nanVarA = aVar1110.a();
                    } else {
                        nan.a aVar1111 = new nan.a(context);
                        aVar1111.c = obj;
                        nanVarA = aVar1111.a();
                    }
                    objY = nanVarA;
                    bVarI.r(objY);
                }
                int i112 = i7 >> 9;
                bVar = bVarI;
                yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i112) | (i112 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                m9nVar2 = m9nVar3;
                crzVar5 = crzVar6;
                crzVar4 = crzVar7;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                f2 = 1.0f;
            } else {
                bVar = bVarI;
                bVar.G();
                d0bVar2 = d0bVar;
                f2 = f;
                m9nVar2 = m9nVar;
                htVar3 = htVar2;
                crzVar4 = crzVar3;
                crzVar5 = crzVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: en80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (bVarI.M(null)) {
                i4 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                htVar2 = htVar;
                if (bVarI.M(htVar2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = 1572864 | i3;
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((12582912 & i) == 0) {
                    if (bVarI.A(crzVar)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i7 |= i9;
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                    if ((100663296 & i) == 0) {
                        crzVar3 = crzVar2;
                        if (bVarI.A(crzVar3)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i7 |= i11;
                    }
                    i12 = i2 & 512;
                    if (i12 != 0) {
                        i7 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (bVarI.A(m9nVar)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i7 |= i13;
                    }
                    if ((i7 & 306783379) == 306783378) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (bVarI.q(i7 & 1, z)) {
                        if (i14 != 0) {
                            d0bVar3 = d0b.a.b;
                        } else {
                            d0bVar3 = d0bVar;
                        }
                        if (i5 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            crzVar6 = null;
                        } else {
                            crzVar6 = crzVar;
                        }
                        if (i10 != 0) {
                            crzVar7 = null;
                        } else {
                            crzVar7 = crzVar3;
                        }
                        if (i12 != 0) {
                            m9nVar3 = null;
                        } else {
                            m9nVar3 = m9nVar;
                        }
                        context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                        c0042a = a.C0041a.a;
                        if (m9nVar3 == null) {
                            bVarI.N(-65155495);
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = in80.a.a(context);
                                bVarI.r(objY2);
                            }
                            bVarI.X(false);
                            m9nVar4 = (m9n) objY2;
                        } else {
                            bVarI.N(-833386248);
                            bVarI.X(false);
                            m9nVar4 = m9nVar3;
                        }
                        zM = bVarI.M(obj);
                        objY = bVarI.y();
                        if (zM) {
                            if (obj instanceof nan) {
                                nanVarA = (nan) obj;
                            } else if (obj instanceof String) {
                                nan.a aVar1112 = new nan.a(context);
                                aVar1112.c = obj;
                                nanVarA = aVar1112.a();
                            } else {
                                nan.a aVar1113 = new nan.a(context);
                                aVar1113.c = obj;
                                nanVarA = aVar1113.a();
                            }
                            objY = nanVarA;
                            bVarI.r(objY);
                        } else {
                            if (obj instanceof nan) {
                                nanVarA = (nan) obj;
                            } else if (obj instanceof String) {
                                nan.a aVar1114 = new nan.a(context);
                                aVar1114.c = obj;
                                nanVarA = aVar1114.a();
                            } else {
                                nan.a aVar1115 = new nan.a(context);
                                aVar1115.c = obj;
                                nanVarA = aVar1115.a();
                            }
                            objY = nanVarA;
                            bVarI.r(objY);
                        }
                        int i113 = i7 >> 9;
                        bVar = bVarI;
                        yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i113) | (i113 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                        m9nVar2 = m9nVar3;
                        crzVar5 = crzVar6;
                        crzVar4 = crzVar7;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        f2 = 1.0f;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        d0bVar2 = d0bVar;
                        f2 = f;
                        m9nVar2 = m9nVar;
                        htVar3 = htVar2;
                        crzVar4 = crzVar3;
                        crzVar5 = crzVar;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: en80
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i7 |= 100663296;
                crzVar3 = crzVar2;
                i12 = i2 & 512;
                if (i12 != 0) {
                    i7 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (bVarI.A(m9nVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i7 |= i13;
                }
                if ((i7 & 306783379) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVarI.q(i7 & 1, z)) {
                    if (i14 != 0) {
                        d0bVar3 = d0b.a.b;
                    } else {
                        d0bVar3 = d0bVar;
                    }
                    if (i5 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        crzVar6 = null;
                    } else {
                        crzVar6 = crzVar;
                    }
                    if (i10 != 0) {
                        crzVar7 = null;
                    } else {
                        crzVar7 = crzVar3;
                    }
                    if (i12 != 0) {
                        m9nVar3 = null;
                    } else {
                        m9nVar3 = m9nVar;
                    }
                    context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    c0042a = a.C0041a.a;
                    if (m9nVar3 == null) {
                        bVarI.N(-65155495);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = in80.a.a(context);
                            bVarI.r(objY2);
                        }
                        bVarI.X(false);
                        m9nVar4 = (m9n) objY2;
                    } else {
                        bVarI.N(-833386248);
                        bVarI.X(false);
                        m9nVar4 = m9nVar3;
                    }
                    zM = bVarI.M(obj);
                    objY = bVarI.y();
                    if (zM) {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar1116 = new nan.a(context);
                            aVar1116.c = obj;
                            nanVarA = aVar1116.a();
                        } else {
                            nan.a aVar1117 = new nan.a(context);
                            aVar1117.c = obj;
                            nanVarA = aVar1117.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    } else {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar1118 = new nan.a(context);
                            aVar1118.c = obj;
                            nanVarA = aVar1118.a();
                        } else {
                            nan.a aVar1119 = new nan.a(context);
                            aVar1119.c = obj;
                            nanVarA = aVar1119.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    }
                    int i114 = i7 >> 9;
                    bVar = bVarI;
                    yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i114) | (i114 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                    m9nVar2 = m9nVar3;
                    crzVar5 = crzVar6;
                    crzVar4 = crzVar7;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    f2 = 1.0f;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    d0bVar2 = d0bVar;
                    f2 = f;
                    m9nVar2 = m9nVar;
                    htVar3 = htVar2;
                    crzVar4 = crzVar3;
                    crzVar5 = crzVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: en80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i7 = 14155776 | i3;
            i10 = i2 & 256;
            if (i10 != 0) {
                if ((100663296 & i) == 0) {
                    crzVar3 = crzVar2;
                    if (bVarI.A(crzVar3)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i7 |= i11;
                }
                i12 = i2 & 512;
                if (i12 != 0) {
                    i7 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (bVarI.A(m9nVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i7 |= i13;
                }
                if ((i7 & 306783379) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVarI.q(i7 & 1, z)) {
                    if (i14 != 0) {
                        d0bVar3 = d0b.a.b;
                    } else {
                        d0bVar3 = d0bVar;
                    }
                    if (i5 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        crzVar6 = null;
                    } else {
                        crzVar6 = crzVar;
                    }
                    if (i10 != 0) {
                        crzVar7 = null;
                    } else {
                        crzVar7 = crzVar3;
                    }
                    if (i12 != 0) {
                        m9nVar3 = null;
                    } else {
                        m9nVar3 = m9nVar;
                    }
                    context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    c0042a = a.C0041a.a;
                    if (m9nVar3 == null) {
                        bVarI.N(-65155495);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = in80.a.a(context);
                            bVarI.r(objY2);
                        }
                        bVarI.X(false);
                        m9nVar4 = (m9n) objY2;
                    } else {
                        bVarI.N(-833386248);
                        bVarI.X(false);
                        m9nVar4 = m9nVar3;
                    }
                    zM = bVarI.M(obj);
                    objY = bVarI.y();
                    if (zM) {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar11110 = new nan.a(context);
                            aVar11110.c = obj;
                            nanVarA = aVar11110.a();
                        } else {
                            nan.a aVar11111 = new nan.a(context);
                            aVar11111.c = obj;
                            nanVarA = aVar11111.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    } else {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar11112 = new nan.a(context);
                            aVar11112.c = obj;
                            nanVarA = aVar11112.a();
                        } else {
                            nan.a aVar11113 = new nan.a(context);
                            aVar11113.c = obj;
                            nanVarA = aVar11113.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    }
                    int i115 = i7 >> 9;
                    bVar = bVarI;
                    yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i115) | (i115 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                    m9nVar2 = m9nVar3;
                    crzVar5 = crzVar6;
                    crzVar4 = crzVar7;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    f2 = 1.0f;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    d0bVar2 = d0bVar;
                    f2 = f;
                    m9nVar2 = m9nVar;
                    htVar3 = htVar2;
                    crzVar4 = crzVar3;
                    crzVar5 = crzVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: en80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            crzVar3 = crzVar2;
            i12 = i2 & 512;
            if (i12 != 0) {
                i7 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (bVarI.A(m9nVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i7 |= i13;
            }
            if ((i7 & 306783379) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (bVarI.q(i7 & 1, z)) {
                if (i14 != 0) {
                    d0bVar3 = d0b.a.b;
                } else {
                    d0bVar3 = d0bVar;
                }
                if (i5 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    crzVar6 = null;
                } else {
                    crzVar6 = crzVar;
                }
                if (i10 != 0) {
                    crzVar7 = null;
                } else {
                    crzVar7 = crzVar3;
                }
                if (i12 != 0) {
                    m9nVar3 = null;
                } else {
                    m9nVar3 = m9nVar;
                }
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                c0042a = a.C0041a.a;
                if (m9nVar3 == null) {
                    bVarI.N(-65155495);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = in80.a.a(context);
                        bVarI.r(objY2);
                    }
                    bVarI.X(false);
                    m9nVar4 = (m9n) objY2;
                } else {
                    bVarI.N(-833386248);
                    bVarI.X(false);
                    m9nVar4 = m9nVar3;
                }
                zM = bVarI.M(obj);
                objY = bVarI.y();
                if (zM) {
                    if (obj instanceof nan) {
                        nanVarA = (nan) obj;
                    } else if (obj instanceof String) {
                        nan.a aVar11114 = new nan.a(context);
                        aVar11114.c = obj;
                        nanVarA = aVar11114.a();
                    } else {
                        nan.a aVar11115 = new nan.a(context);
                        aVar11115.c = obj;
                        nanVarA = aVar11115.a();
                    }
                    objY = nanVarA;
                    bVarI.r(objY);
                } else {
                    if (obj instanceof nan) {
                        nanVarA = (nan) obj;
                    } else if (obj instanceof String) {
                        nan.a aVar11116 = new nan.a(context);
                        aVar11116.c = obj;
                        nanVarA = aVar11116.a();
                    } else {
                        nan.a aVar11117 = new nan.a(context);
                        aVar11117.c = obj;
                        nanVarA = aVar11117.a();
                    }
                    objY = nanVarA;
                    bVarI.r(objY);
                }
                int i116 = i7 >> 9;
                bVar = bVarI;
                yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i116) | (i116 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                m9nVar2 = m9nVar3;
                crzVar5 = crzVar6;
                crzVar4 = crzVar7;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                f2 = 1.0f;
            } else {
                bVar = bVarI;
                bVar.G();
                d0bVar2 = d0bVar;
                f2 = f;
                m9nVar2 = m9nVar;
                htVar3 = htVar2;
                crzVar4 = crzVar3;
                crzVar5 = crzVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: en80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 196608;
        htVar2 = htVar;
        i7 = 1572864 | i3;
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((12582912 & i) == 0) {
                if (bVarI.A(crzVar)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i7 |= i9;
            }
            i10 = i2 & 256;
            if (i10 != 0) {
                if ((100663296 & i) == 0) {
                    crzVar3 = crzVar2;
                    if (bVarI.A(crzVar3)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i7 |= i11;
                }
                i12 = i2 & 512;
                if (i12 != 0) {
                    i7 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (bVarI.A(m9nVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i7 |= i13;
                }
                if ((i7 & 306783379) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVarI.q(i7 & 1, z)) {
                    if (i14 != 0) {
                        d0bVar3 = d0b.a.b;
                    } else {
                        d0bVar3 = d0bVar;
                    }
                    if (i5 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        crzVar6 = null;
                    } else {
                        crzVar6 = crzVar;
                    }
                    if (i10 != 0) {
                        crzVar7 = null;
                    } else {
                        crzVar7 = crzVar3;
                    }
                    if (i12 != 0) {
                        m9nVar3 = null;
                    } else {
                        m9nVar3 = m9nVar;
                    }
                    context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    c0042a = a.C0041a.a;
                    if (m9nVar3 == null) {
                        bVarI.N(-65155495);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = in80.a.a(context);
                            bVarI.r(objY2);
                        }
                        bVarI.X(false);
                        m9nVar4 = (m9n) objY2;
                    } else {
                        bVarI.N(-833386248);
                        bVarI.X(false);
                        m9nVar4 = m9nVar3;
                    }
                    zM = bVarI.M(obj);
                    objY = bVarI.y();
                    if (zM) {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar11118 = new nan.a(context);
                            aVar11118.c = obj;
                            nanVarA = aVar11118.a();
                        } else {
                            nan.a aVar11119 = new nan.a(context);
                            aVar11119.c = obj;
                            nanVarA = aVar11119.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    } else {
                        if (obj instanceof nan) {
                            nanVarA = (nan) obj;
                        } else if (obj instanceof String) {
                            nan.a aVar111110 = new nan.a(context);
                            aVar111110.c = obj;
                            nanVarA = aVar111110.a();
                        } else {
                            nan.a aVar111111 = new nan.a(context);
                            aVar111111.c = obj;
                            nanVarA = aVar111111.a();
                        }
                        objY = nanVarA;
                        bVarI.r(objY);
                    }
                    int i117 = i7 >> 9;
                    bVar = bVarI;
                    yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i117) | (i117 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                    m9nVar2 = m9nVar3;
                    crzVar5 = crzVar6;
                    crzVar4 = crzVar7;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    f2 = 1.0f;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    d0bVar2 = d0bVar;
                    f2 = f;
                    m9nVar2 = m9nVar;
                    htVar3 = htVar2;
                    crzVar4 = crzVar3;
                    crzVar5 = crzVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: en80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i7 |= 100663296;
            crzVar3 = crzVar2;
            i12 = i2 & 512;
            if (i12 != 0) {
                i7 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (bVarI.A(m9nVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i7 |= i13;
            }
            if ((i7 & 306783379) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (bVarI.q(i7 & 1, z)) {
                if (i14 != 0) {
                    d0bVar3 = d0b.a.b;
                } else {
                    d0bVar3 = d0bVar;
                }
                if (i5 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    crzVar6 = null;
                } else {
                    crzVar6 = crzVar;
                }
                if (i10 != 0) {
                    crzVar7 = null;
                } else {
                    crzVar7 = crzVar3;
                }
                if (i12 != 0) {
                    m9nVar3 = null;
                } else {
                    m9nVar3 = m9nVar;
                }
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                c0042a = a.C0041a.a;
                if (m9nVar3 == null) {
                    bVarI.N(-65155495);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = in80.a.a(context);
                        bVarI.r(objY2);
                    }
                    bVarI.X(false);
                    m9nVar4 = (m9n) objY2;
                } else {
                    bVarI.N(-833386248);
                    bVarI.X(false);
                    m9nVar4 = m9nVar3;
                }
                zM = bVarI.M(obj);
                objY = bVarI.y();
                if (zM) {
                    if (obj instanceof nan) {
                        nanVarA = (nan) obj;
                    } else if (obj instanceof String) {
                        nan.a aVar111112 = new nan.a(context);
                        aVar111112.c = obj;
                        nanVarA = aVar111112.a();
                    } else {
                        nan.a aVar111113 = new nan.a(context);
                        aVar111113.c = obj;
                        nanVarA = aVar111113.a();
                    }
                    objY = nanVarA;
                    bVarI.r(objY);
                } else {
                    if (obj instanceof nan) {
                        nanVarA = (nan) obj;
                    } else if (obj instanceof String) {
                        nan.a aVar111114 = new nan.a(context);
                        aVar111114.c = obj;
                        nanVarA = aVar111114.a();
                    } else {
                        nan.a aVar111115 = new nan.a(context);
                        aVar111115.c = obj;
                        nanVarA = aVar111115.a();
                    }
                    objY = nanVarA;
                    bVarI.r(objY);
                }
                int i118 = i7 >> 9;
                bVar = bVarI;
                yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i118) | (i118 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                m9nVar2 = m9nVar3;
                crzVar5 = crzVar6;
                crzVar4 = crzVar7;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                f2 = 1.0f;
            } else {
                bVar = bVarI;
                bVar.G();
                d0bVar2 = d0bVar;
                f2 = f;
                m9nVar2 = m9nVar;
                htVar3 = htVar2;
                crzVar4 = crzVar3;
                crzVar5 = crzVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: en80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i7 = 14155776 | i3;
        i10 = i2 & 256;
        if (i10 != 0) {
            if ((100663296 & i) == 0) {
                crzVar3 = crzVar2;
                if (bVarI.A(crzVar3)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i7 |= i11;
            }
            i12 = i2 & 512;
            if (i12 != 0) {
                i7 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (bVarI.A(m9nVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i7 |= i13;
            }
            if ((i7 & 306783379) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (bVarI.q(i7 & 1, z)) {
                if (i14 != 0) {
                    d0bVar3 = d0b.a.b;
                } else {
                    d0bVar3 = d0bVar;
                }
                if (i5 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    crzVar6 = null;
                } else {
                    crzVar6 = crzVar;
                }
                if (i10 != 0) {
                    crzVar7 = null;
                } else {
                    crzVar7 = crzVar3;
                }
                if (i12 != 0) {
                    m9nVar3 = null;
                } else {
                    m9nVar3 = m9nVar;
                }
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                c0042a = a.C0041a.a;
                if (m9nVar3 == null) {
                    bVarI.N(-65155495);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = in80.a.a(context);
                        bVarI.r(objY2);
                    }
                    bVarI.X(false);
                    m9nVar4 = (m9n) objY2;
                } else {
                    bVarI.N(-833386248);
                    bVarI.X(false);
                    m9nVar4 = m9nVar3;
                }
                zM = bVarI.M(obj);
                objY = bVarI.y();
                if (zM) {
                    if (obj instanceof nan) {
                        nanVarA = (nan) obj;
                    } else if (obj instanceof String) {
                        nan.a aVar111116 = new nan.a(context);
                        aVar111116.c = obj;
                        nanVarA = aVar111116.a();
                    } else {
                        nan.a aVar111117 = new nan.a(context);
                        aVar111117.c = obj;
                        nanVarA = aVar111117.a();
                    }
                    objY = nanVarA;
                    bVarI.r(objY);
                } else {
                    if (obj instanceof nan) {
                        nanVarA = (nan) obj;
                    } else if (obj instanceof String) {
                        nan.a aVar111118 = new nan.a(context);
                        aVar111118.c = obj;
                        nanVarA = aVar111118.a();
                    } else {
                        nan.a aVar111119 = new nan.a(context);
                        aVar111119.c = obj;
                        nanVarA = aVar111119.a();
                    }
                    objY = nanVarA;
                    bVarI.r(objY);
                }
                int i119 = i7 >> 9;
                bVar = bVarI;
                yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i119) | (i119 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
                m9nVar2 = m9nVar3;
                crzVar5 = crzVar6;
                crzVar4 = crzVar7;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                f2 = 1.0f;
            } else {
                bVar = bVarI;
                bVar.G();
                d0bVar2 = d0bVar;
                f2 = f;
                m9nVar2 = m9nVar;
                htVar3 = htVar2;
                crzVar4 = crzVar3;
                crzVar5 = crzVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: en80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i7 |= 100663296;
        crzVar3 = crzVar2;
        i12 = i2 & 512;
        if (i12 != 0) {
            i7 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (bVarI.A(m9nVar)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i7 |= i13;
        }
        if ((i7 & 306783379) == 306783378) {
            z = false;
        } else {
            z = true;
        }
        if (bVarI.q(i7 & 1, z)) {
            if (i14 != 0) {
                d0bVar3 = d0b.a.b;
            } else {
                d0bVar3 = d0bVar;
            }
            if (i5 != 0) {
                htVar4 = ht.a.e;
            } else {
                htVar4 = htVar2;
            }
            if (i8 != 0) {
                crzVar6 = null;
            } else {
                crzVar6 = crzVar;
            }
            if (i10 != 0) {
                crzVar7 = null;
            } else {
                crzVar7 = crzVar3;
            }
            if (i12 != 0) {
                m9nVar3 = null;
            } else {
                m9nVar3 = m9nVar;
            }
            context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            c0042a = a.C0041a.a;
            if (m9nVar3 == null) {
                bVarI.N(-65155495);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = in80.a.a(context);
                    bVarI.r(objY2);
                }
                bVarI.X(false);
                m9nVar4 = (m9n) objY2;
            } else {
                bVarI.N(-833386248);
                bVarI.X(false);
                m9nVar4 = m9nVar3;
            }
            zM = bVarI.M(obj);
            objY = bVarI.y();
            if (zM) {
                if (obj instanceof nan) {
                    nanVarA = (nan) obj;
                } else if (obj instanceof String) {
                    nan.a aVar1111110 = new nan.a(context);
                    aVar1111110.c = obj;
                    nanVarA = aVar1111110.a();
                } else {
                    nan.a aVar1111111 = new nan.a(context);
                    aVar1111111.c = obj;
                    nanVarA = aVar1111111.a();
                }
                objY = nanVarA;
                bVarI.r(objY);
            } else {
                if (obj instanceof nan) {
                    nanVarA = (nan) obj;
                } else if (obj instanceof String) {
                    nan.a aVar1111112 = new nan.a(context);
                    aVar1111112.c = obj;
                    nanVarA = aVar1111112.a();
                } else {
                    nan.a aVar1111113 = new nan.a(context);
                    aVar1111113.c = obj;
                    nanVarA = aVar1111113.a();
                }
                objY = nanVarA;
                bVarI.r(objY);
            }
            int i1110 = i7 >> 9;
            bVar = bVarI;
            yz0.b((nan) objY, str, m9nVar4, dVar, crzVar6, crzVar7, null, null, null, htVar4, d0bVar3, 1.0f, null, bVar, (i7 & 112) | ((i7 << 3) & 7168) | (57344 & i1110) | (i1110 & 458752), ((i7 >> 15) & 14) | ((i7 >> 6) & 112) | ((i7 >> 12) & 896) | ((i7 >> 3) & 7168), 50112);
            m9nVar2 = m9nVar3;
            crzVar5 = crzVar6;
            crzVar4 = crzVar7;
            htVar3 = htVar4;
            d0bVar2 = d0bVar3;
            f2 = 1.0f;
        } else {
            bVar = bVarI;
            bVar.G();
            d0bVar2 = d0bVar;
            f2 = f;
            m9nVar2 = m9nVar;
            htVar3 = htVar2;
            crzVar4 = crzVar3;
            crzVar5 = crzVar;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: en80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    fn80.a(obj, str, dVar, d0bVar2, htVar3, f2, crzVar5, crzVar4, m9nVar2, (a) obj2, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
