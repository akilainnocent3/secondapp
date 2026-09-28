package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class or0 {
    /* JADX WARN: Code duplicated, block: B:55:0x0312  */
    public static final void a(Context context, boolean z, boolean z2, uy80 uy80Var, op8 op8Var, a aVar, final int i) {
        final op8 op8Var2;
        final Context context2;
        final boolean z3;
        final boolean z4;
        final uy80 uy80Var2;
        Context context3;
        uy80 uy80Var3;
        boolean z5;
        boolean z6;
        d68 d68Var;
        eah0 eah0Var;
        d68 d68Var2;
        long jB;
        boolean z7;
        b bVarI = aVar.i(-1258258347);
        int i2 = i | 1458;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                context3 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                uy80Var3 = (uy80) bVarI.O(xy80.a);
                z5 = true;
                z6 = true;
            } else {
                bVarI.G();
                context3 = context;
                z5 = z;
                z6 = z2;
                uy80Var3 = uy80Var;
            }
            bVarI.Y();
            boolean zM = bVarI.M(context3.getTheme());
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(sk30.a);
                typedArrayObtainStyledAttributes.getClass();
                if (!typedArrayObtainStyledAttributes.hasValue(9)) {
                    hb5.a("createAppCompatTheme requires the host context's theme to extend Theme.AppCompat");
                    return;
                }
                if (z5) {
                    if (typedArrayObtainStyledAttributes.getBoolean(8, true)) {
                        d68Var2 = g68.e();
                    } else {
                        qyd0 qyd0Var = g68.a;
                        long j = k58.z;
                        d68Var2 = new d68(j, k58.j, k58.A, k58.k, k58.e, k58.E, k58.n, k58.F, k58.o, k58.R, k58.t, k58.S, k58.u, k58.a, k58.g, k58.I, k58.r, k58.Q, k58.s, j, k58.f, k58.d, k58.b, k58.h, k58.c, k58.i, k58.x, k58.y, k58.D, k58.J, k58.P, k58.K, k58.L, k58.M, k58.N, k58.O, k58.B, k58.C, k58.l, k58.m, k58.G, k58.H, k58.p, k58.q, k58.T, k58.U, k58.v, k58.w);
                    }
                    long jB2 = h9h0.b(typedArrayObtainStyledAttributes, 5);
                    long jB3 = uel.b(jB2);
                    long jB4 = h9h0.b(typedArrayObtainStyledAttributes, 6);
                    long jB5 = uel.b(jB4);
                    long jB6 = h9h0.b(typedArrayObtainStyledAttributes, 3);
                    long jB7 = uel.b(jB6);
                    long jB8 = h9h0.b(typedArrayObtainStyledAttributes, 1);
                    long j2 = j58.m;
                    if (!nbh0.a(jB8, j2)) {
                        jB8 = j58.c(1.0f, jB8);
                    }
                    long j3 = d68Var2.p;
                    try {
                        jB = (nbh0.a(jB8, j2) || uel.a(j3, jB8) < 4.5d) ? uel.b(j3) : jB8;
                    } catch (IllegalArgumentException unused) {
                    }
                    long jB9 = h9h0.b(typedArrayObtainStyledAttributes, 0);
                    try {
                        if (nbh0.a(jB8, j58.m) || uel.a(jB9, jB8) < 4.5d) {
                            jB8 = uel.b(jB9);
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    long j4 = jB8;
                    long jB10 = h9h0.b(typedArrayObtainStyledAttributes, 4);
                    d68Var = new d68(jB2, jB3, d68Var2.c, d68Var2.d, d68Var2.e, jB4, jB5, d68Var2.h, d68Var2.i, jB6, jB7, d68Var2.l, d68Var2.m, jB9, j4, j3, jB, d68Var2.r, d68Var2.s, d68Var2.t, d68Var2.u, d68Var2.v, jB10, uel.b(jB10), d68Var2.y, d68Var2.z, d68Var2.A, d68Var2.B, d68Var2.C, d68Var2.D, d68Var2.E, d68Var2.F, d68Var2.G, d68Var2.H, d68Var2.I, d68Var2.J, d68Var2.K, d68Var2.L, d68Var2.M, d68Var2.N, d68Var2.O, d68Var2.P, d68Var2.Q, d68Var2.R, d68Var2.S, d68Var2.T, d68Var2.U, d68Var2.V);
                } else {
                    d68Var = null;
                }
                if (z6) {
                    l8i l8iVarC = h9h0.c(typedArrayObtainStyledAttributes, 7);
                    if (l8iVarC == null) {
                        l8iVarC = h9h0.c(typedArrayObtainStyledAttributes, 2);
                    }
                    if (l8iVarC != null) {
                        imf0 imf0Var = hah0.d;
                        imf0 imf0Var2 = hah0.e;
                        imf0 imf0Var3 = hah0.f;
                        imf0 imf0Var4 = hah0.g;
                        imf0 imf0Var5 = hah0.h;
                        imf0 imf0Var6 = hah0.i;
                        imf0 imf0Var7 = hah0.m;
                        imf0 imf0Var8 = hah0.n;
                        imf0 imf0Var9 = hah0.o;
                        imf0 imf0Var10 = hah0.a;
                        imf0 imf0Var11 = hah0.b;
                        imf0 imf0Var12 = hah0.c;
                        imf0 imf0Var13 = hah0.j;
                        imf0 imf0Var14 = hah0.k;
                        imf0 imf0Var15 = hah0.l;
                        f8i f8iVar = l8iVarC.a;
                        f8iVar.getClass();
                        eah0Var = new eah0(imf0.b(imf0Var, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var2, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var3, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var4, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var5, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var6, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var7, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var8, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var9, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var10, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var11, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var12, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var13, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var14, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0.b(imf0Var15, 0L, 0L, null, null, f8iVar, 0L, null, null, null, 0, 0L, null, null, 16777183), imf0Var, imf0Var2, imf0Var3, imf0Var4, imf0Var5, imf0Var6, imf0Var7, imf0Var8, imf0Var9, imf0Var10, imf0Var11, imf0Var12, imf0Var13, imf0Var14, imf0Var15);
                    } else {
                        eah0Var = null;
                    }
                } else {
                    eah0Var = null;
                }
                lof0 lof0Var = new lof0(d68Var, eah0Var);
                typedArrayObtainStyledAttributes.recycle();
                bVarI.r(lof0Var);
                objY = lof0Var;
            } else {
                context3 = context3;
                z5 = z5;
                uy80Var3 = uy80Var3;
            }
            lof0 lof0Var2 = (lof0) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new s02();
                bVarI.r(objY2);
            }
            final s02 s02Var = (s02) objY2;
            d68 d68Var3 = lof0Var2.a;
            if (d68Var3 == null) {
                bVarI.N(1994523200);
                d68Var3 = (d68) bVarI.O(g68.a);
                z7 = false;
            } else {
                z7 = false;
                bVarI.N(1994521929);
            }
            bVarI.X(z7);
            eah0 eah0Var2 = lof0Var2.b;
            if (eah0Var2 == null) {
                bVarI.N(1994525567);
                eah0Var2 = (eah0) bVarI.O(gah0.a);
            } else {
                bVarI.N(1994524327);
            }
            bVarI.X(z7);
            op8Var2 = op8Var;
            uy80 uy80Var4 = uy80Var3;
            scv.b(d68Var3, uy80Var4, eah0Var2, pp8.b(458185001, new Function2() { // from class: mr0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        hna.b(new j730[]{tp0.a(((d68) aVar2.O(g68.a)).o, iza.a), aqe.a.a(s02Var)}, op8Var2, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 0);
            context2 = context3;
            z4 = z6;
            uy80Var2 = uy80Var4;
            z3 = z5;
        } else {
            op8Var2 = op8Var;
            bVarI.G();
            context2 = context;
            z3 = z;
            z4 = z2;
            uy80Var2 = uy80Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(context2, z3, z4, uy80Var2, op8Var2, i) { // from class: nr0
                public final /* synthetic */ Context a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ uy80 d;
                public final /* synthetic */ op8 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(24577);
                    or0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
