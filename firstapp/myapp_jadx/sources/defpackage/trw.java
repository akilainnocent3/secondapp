package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final class trw {
    public static final ytw a;
    public static final ytw b;
    public static final ytw c;

    static {
        Boolean bool = Boolean.FALSE;
        a = m.b(bool);
        b = m.b(bool);
        c = m.b(bool);
    }

    public static final void a(final int i, a aVar, d dVar, final String str) {
        int i2;
        final d dVar2;
        b bVarI = aVar.i(1162727317);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dVar2 = dVar;
            q75.a(dVar2, null, false, pp8.b(-1050328321, new gaj() { // from class: xqw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    int i3 = 1;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        int i4 = kxa.i(r75Var.c());
                        float fA = pi60.a(R.dimen._45sdp, 0, aVar2);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = m.b(0);
                            aVar2.r(objY);
                        }
                        ytw ytwVar = (ytw) objY;
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(Float.valueOf(i4));
                            aVar2.r(objY2);
                        }
                        ytw ytwVar2 = (ytw) objY2;
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = m.b(Boolean.FALSE);
                            aVar2.r(objY3);
                        }
                        ytw ytwVar3 = (ytw) objY3;
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            objY4 = m.b(Boolean.FALSE);
                            aVar2.r(objY4);
                        }
                        ytw ytwVar4 = (ytw) objY4;
                        String str2 = str;
                        boolean zM = aVar2.M(str2);
                        Object objY5 = aVar2.y();
                        if (zM || objY5 == c0042a) {
                            objY5 = new frw(null, ytwVar4, str2);
                            aVar2.r(objY5);
                        }
                        xvf.e(aVar2, str2, (Function2) objY5);
                        Boolean bool = (Boolean) ytwVar4.getValue();
                        bool.booleanValue();
                        Integer numValueOf = Integer.valueOf(i4);
                        Integer numValueOf2 = Integer.valueOf(((Number) ytwVar.getValue()).intValue());
                        boolean zD = aVar2.d(i4);
                        Object objY6 = aVar2.y();
                        if (zD || objY6 == c0042a) {
                            grw grwVar = new grw(i4, ytwVar4, ytwVar, ytwVar3, ytwVar2, null);
                            aVar2.r(grwVar);
                            objY6 = grwVar;
                        }
                        xvf.f(bool, numValueOf, numValueOf2, (Function2) objY6, aVar2);
                        Object objY7 = aVar2.y();
                        if (objY7 == c0042a) {
                            objY7 = new zs4(ytwVar, i3);
                            aVar2.r(objY7);
                        }
                        d dVarC = androidx.compose.ui.graphics.a.c(w.a(d.a.b, (Function1) objY7), 0.0f, 0.0f, ((Boolean) ytwVar3.getValue()).booleanValue() ? 1.0f : 0.0f, ((Number) ytwVar2.getValue()).floatValue(), i7f.a(fA, aVar2), 0.0f, 0L, null, 524259);
                        Object objY8 = aVar2.y();
                        if (objY8 == c0042a) {
                            objY8 = new k6s(1);
                            aVar2.r(objY8);
                        }
                        androidx.compose.ui.viewinterop.b.a((Function1) objY8, dVarC, null, aVar2, 6, 4);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 3) & 14) | 3072, 6);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zqw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    trw.a(qj40.a(i | 1), (a) obj, dVar2, str);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void b(final java.io.File r54, final java.io.File r55, java.lang.String r56, final int r57, final int r58, final java.lang.Long r59, final float r60, androidx.compose.runtime.a r61, final int r62) {
        /*
            Method dump skipped, instruction units count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trw.b(java.io.File, java.io.File, java.lang.String, int, int, java.lang.Long, float, androidx.compose.runtime.a, int):void");
    }

    public static final void c(ytw<Boolean> ytwVar, boolean z) {
        ytwVar.setValue(Boolean.valueOf(z));
    }

    public static final void d(final int i, a aVar, final d dVar, final String str) {
        str.getClass();
        b bVarI = aVar.i(1697528131);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                m9n.a aVar2 = new m9n.a(context);
                ap8.a aVar3 = new ap8.a();
                in80 in80Var = in80.a;
                aVar3.b(omy.a((OkHttpClient) in80.c.getValue()), jq40.a(kmh0.class));
                if (Build.VERSION.SDK_INT >= 28) {
                    aVar3.a(new ig0.a());
                } else {
                    aVar3.a(new qhk.a());
                }
                aVar2.c = aVar3.d();
                objY = aVar2.a();
                bVarI.r(objY);
            }
            m9n m9nVar = (m9n) objY;
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                nan.a aVar4 = new nan.a(context);
                aVar4.c = str;
                van.a(aVar4);
                objY2 = aVar4.a();
                bVarI.r(objY2);
            }
            fn80.a((nan) objY2, null, dVar, null, null, 0.0f, null, null, m9nVar, bVarI, 432, 1528);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str) { // from class: drw
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;

                {
                    this.a = str;
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    trw.d(qj40.a(49), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final int i, a aVar, final d dVar, final String str) {
        int i2;
        b bVarI = aVar.i(-1081203223);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new brw(ytwVar, ytwVar2);
                bVarI.r(objY3);
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY3, dVar, null, bVarI, (i3 & 112) | 6, 4);
            MotionLayout motionLayout = (MotionLayout) ytwVar.getValue();
            MotionLayout motionLayout2 = (MotionLayout) ytwVar2.getValue();
            boolean z = (i3 & 14) == 4;
            Object objY4 = bVarI.y();
            if (z || objY4 == c0042a) {
                objY4 = new rrw(null, ytwVar, ytwVar2, str);
                bVarI.r(objY4);
            }
            xvf.f(str, motionLayout, motionLayout2, (Function2) objY4, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: crw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    trw.e(qj40.a(i | 1), (a) obj, dVar, str);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(View view) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                f(childAt);
            }
        }
    }

    public static final boolean g() {
        return ((Boolean) ((x5a0) c).getValue()).booleanValue();
    }
}
