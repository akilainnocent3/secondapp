package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class gcg0 {
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(final Object obj, final String str, final d dVar, final d0b d0bVar, ht htVar, float f, crz crzVar, crz crzVar2, a aVar, final int i, final int i2) {
        int i3;
        crz crzVar3;
        int i4;
        crz crzVar4;
        int i5;
        boolean z;
        b bVar;
        final ht htVar2;
        final float f2;
        final crz crzVar5;
        final crz crzVar6;
        e eVarZ;
        crz crzVar7;
        crz crzVar8;
        Object obj2;
        b bVarI = aVar.i(1170749402);
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
        if ((i & 3072) == 0) {
            i3 |= bVarI.M(d0bVar) ? 2048 : 1024;
        }
        int i6 = 1794048 | i3;
        int i7 = i2 & 128;
        if (i7 == 0) {
            if ((12582912 & i) == 0) {
                crzVar3 = crzVar;
                i6 |= bVarI.A(crzVar3) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((100663296 & i) == 0) {
                    crzVar4 = crzVar2;
                    if (bVarI.A(crzVar4)) {
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i6 |= i5;
                }
                if ((38347923 & i6) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i6 & 1, z)) {
                    if (i7 != 0) {
                        crzVar7 = null;
                    } else {
                        crzVar7 = crzVar3;
                    }
                    if (i4 != 0) {
                        crzVar8 = null;
                    } else {
                        crzVar8 = crzVar4;
                    }
                    if (obj == null) {
                        obj2 = "";
                    } else {
                        obj2 = obj;
                    }
                    int i8 = i6 >> 12;
                    bVar = bVarI;
                    mw90.b(obj2, str, dVar, crzVar7, crzVar8, null, null, null, d0bVar, 1.0f, null, bVar, (i6 & 1008) | (i8 & 7168) | (i8 & 57344) | (1879048192 & (i6 << 12)), ((i6 >> 9) & 14) | ((i6 >> 15) & 112) | ((i6 >> 6) & 896), 25056);
                    htVar2 = ht.a.e;
                    crzVar6 = crzVar7;
                    crzVar5 = crzVar8;
                    f2 = 1.0f;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    htVar2 = htVar;
                    f2 = f;
                    crzVar5 = crzVar4;
                    crzVar6 = crzVar3;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: fcg0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            gcg0.a(obj, str, dVar, d0bVar, htVar2, f2, crzVar6, crzVar5, (a) obj3, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 100663296;
            crzVar4 = crzVar2;
            if ((38347923 & i6) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i6 & 1, z)) {
                if (i7 != 0) {
                    crzVar7 = null;
                } else {
                    crzVar7 = crzVar3;
                }
                if (i4 != 0) {
                    crzVar8 = null;
                } else {
                    crzVar8 = crzVar4;
                }
                if (obj == null) {
                    obj2 = "";
                } else {
                    obj2 = obj;
                }
                int i9 = i6 >> 12;
                bVar = bVarI;
                mw90.b(obj2, str, dVar, crzVar7, crzVar8, null, null, null, d0bVar, 1.0f, null, bVar, (i6 & 1008) | (i9 & 7168) | (i9 & 57344) | (1879048192 & (i6 << 12)), ((i6 >> 9) & 14) | ((i6 >> 15) & 112) | ((i6 >> 6) & 896), 25056);
                htVar2 = ht.a.e;
                crzVar6 = crzVar7;
                crzVar5 = crzVar8;
                f2 = 1.0f;
            } else {
                bVar = bVarI;
                bVar.G();
                htVar2 = htVar;
                f2 = f;
                crzVar5 = crzVar4;
                crzVar6 = crzVar3;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: fcg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        gcg0.a(obj, str, dVar, d0bVar, htVar2, f2, crzVar6, crzVar5, (a) obj3, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 = 14376960 | i3;
        crzVar3 = crzVar;
        i4 = i2 & 256;
        if (i4 != 0) {
            if ((100663296 & i) == 0) {
                crzVar4 = crzVar2;
                if (bVarI.A(crzVar4)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i6 |= i5;
            }
            if ((38347923 & i6) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i6 & 1, z)) {
                if (i7 != 0) {
                    crzVar7 = null;
                } else {
                    crzVar7 = crzVar3;
                }
                if (i4 != 0) {
                    crzVar8 = null;
                } else {
                    crzVar8 = crzVar4;
                }
                if (obj == null) {
                    obj2 = "";
                } else {
                    obj2 = obj;
                }
                int i10 = i6 >> 12;
                bVar = bVarI;
                mw90.b(obj2, str, dVar, crzVar7, crzVar8, null, null, null, d0bVar, 1.0f, null, bVar, (i6 & 1008) | (i10 & 7168) | (i10 & 57344) | (1879048192 & (i6 << 12)), ((i6 >> 9) & 14) | ((i6 >> 15) & 112) | ((i6 >> 6) & 896), 25056);
                htVar2 = ht.a.e;
                crzVar6 = crzVar7;
                crzVar5 = crzVar8;
                f2 = 1.0f;
            } else {
                bVar = bVarI;
                bVar.G();
                htVar2 = htVar;
                f2 = f;
                crzVar5 = crzVar4;
                crzVar6 = crzVar3;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: fcg0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        gcg0.a(obj, str, dVar, d0bVar, htVar2, f2, crzVar6, crzVar5, (a) obj3, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 100663296;
        crzVar4 = crzVar2;
        if ((38347923 & i6) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i6 & 1, z)) {
            if (i7 != 0) {
                crzVar7 = null;
            } else {
                crzVar7 = crzVar3;
            }
            if (i4 != 0) {
                crzVar8 = null;
            } else {
                crzVar8 = crzVar4;
            }
            if (obj == null) {
                obj2 = "";
            } else {
                obj2 = obj;
            }
            int i11 = i6 >> 12;
            bVar = bVarI;
            mw90.b(obj2, str, dVar, crzVar7, crzVar8, null, null, null, d0bVar, 1.0f, null, bVar, (i6 & 1008) | (i11 & 7168) | (i11 & 57344) | (1879048192 & (i6 << 12)), ((i6 >> 9) & 14) | ((i6 >> 15) & 112) | ((i6 >> 6) & 896), 25056);
            htVar2 = ht.a.e;
            crzVar6 = crzVar7;
            crzVar5 = crzVar8;
            f2 = 1.0f;
        } else {
            bVar = bVarI;
            bVar.G();
            htVar2 = htVar;
            f2 = f;
            crzVar5 = crzVar4;
            crzVar6 = crzVar3;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fcg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    gcg0.a(obj, str, dVar, d0bVar, htVar2, f2, crzVar6, crzVar5, (a) obj3, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
