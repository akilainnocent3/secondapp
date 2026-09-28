package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class av30 {
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void a(final int i, final int i2, a aVar, d dVar, final Function0 function0, final boolean z, boolean z2) {
        int i3;
        Function0 function1;
        d dVar2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        final d dVar3;
        final boolean z5;
        e eVarZ;
        d dVar4;
        boolean z6;
        b bVarI = aVar.i(1943723708);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i3 |= bVarI.A(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (bVarI.b(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 24576;
                if ((i6 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i6 & 1, z4)) {
                    if (i7 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    bv30.a(z, function1, dVar4, z6, new wu30(c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), c68.a(R.color.icon_secondary, bVarI), c68.a(R.color.text_disabled_name, bVarI), c68.a(R.color.text_disabled_name, bVarI)), bVarI, (i6 & 8190) | ((i6 << 3) & 458752), 0);
                    dVar3 = dVar4;
                    z5 = z6;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    z5 = z3;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: xu30
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            av30.a(qj40.a(i | 1), i2, (a) obj, dVar3, function0, z, z5);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            z3 = z2;
            i6 = i3 | 24576;
            if ((i6 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i6 & 1, z4)) {
                if (i7 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                bv30.a(z, function1, dVar4, z6, new wu30(c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), c68.a(R.color.icon_secondary, bVarI), c68.a(R.color.text_disabled_name, bVarI), c68.a(R.color.text_disabled_name, bVarI)), bVarI, (i6 & 8190) | ((i6 << 3) & 458752), 0);
                dVar3 = dVar4;
                z5 = z6;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                z5 = z3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: xu30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        av30.a(qj40.a(i | 1), i2, (a) obj, dVar3, function0, z, z5);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (bVarI.b(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3 | 24576;
            if ((i6 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i6 & 1, z4)) {
                if (i7 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                bv30.a(z, function1, dVar4, z6, new wu30(c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), c68.a(R.color.icon_secondary, bVarI), c68.a(R.color.text_disabled_name, bVarI), c68.a(R.color.text_disabled_name, bVarI)), bVarI, (i6 & 8190) | ((i6 << 3) & 458752), 0);
                dVar3 = dVar4;
                z5 = z6;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                z5 = z3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: xu30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        av30.a(qj40.a(i | 1), i2, (a) obj, dVar3, function0, z, z5);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z2;
        i6 = i3 | 24576;
        if ((i6 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i6 & 1, z4)) {
            if (i7 != 0) {
                dVar4 = d.a.b;
            } else {
                dVar4 = dVar2;
            }
            if (i4 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            bv30.a(z, function1, dVar4, z6, new wu30(c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), c68.a(R.color.icon_secondary, bVarI), c68.a(R.color.text_disabled_name, bVarI), c68.a(R.color.text_disabled_name, bVarI)), bVarI, (i6 & 8190) | ((i6 << 3) & 458752), 0);
            dVar3 = dVar4;
            z5 = z6;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            z5 = z3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xu30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    av30.a(qj40.a(i | 1), i2, (a) obj, dVar3, function0, z, z5);
                    return Unit.a;
                }
            };
        }
    }
}
