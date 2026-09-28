package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ssi {
    public static final /* synthetic */ int a = 0;

    public static final void a(final int i, final op8 op8Var, a aVar) {
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        Object obj;
        b bVarI = aVar.i(-220172153);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            Configuration configuration = (Configuration) bVarI.O(chfVar);
            if ((configuration.uiMode & 48) == 32) {
                bVarI.N(-733300781);
                op8Var.invoke(bVarI, 6);
                bVarI.X(false);
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(i, op8Var) { // from class: psi
                        public final /* synthetic */ op8 a;

                        {
                            this.a = op8Var;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ssi.a(qj40.a(7), this.a, (a) obj2);
                            return Unit.a;
                        }
                    };
                }
            } else {
                bVarI.N(-733262341);
                bVarI.X(false);
                qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                Context context = (Context) bVarI.O(qyd0Var);
                boolean zM = bVarI.M(configuration);
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (zM || objY == c0042a) {
                    obj = objY;
                    Configuration configuration2 = new Configuration(configuration);
                    configuration2.uiMode = (configuration2.uiMode & (-49)) | 32;
                    bVarI.r(configuration2);
                    obj = configuration2;
                }
                Configuration configuration3 = (Configuration) obj;
                boolean zM2 = bVarI.M(context) | bVarI.M(configuration3);
                Object objY2 = bVarI.y();
                if (zM2 || objY2 == c0042a) {
                    objY2 = context.createConfigurationContext(configuration3);
                    bVarI.r(objY2);
                }
                Context context2 = (Context) objY2;
                j730 j730VarA = chfVar.a(configuration3);
                context2.getClass();
                hna.b(new j730[]{j730VarA, qyd0Var.a(context2)}, pp8.b(-1868450873, new Function2() { // from class: qsi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            op8Var.invoke(aVar2, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 48);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(i, op8Var) { // from class: rsi
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ssi.a(qj40.a(7), this.a, (a) obj2);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(final tp70 tp70Var, final float f, aj0 aj0Var, h4d h4dVar, final Function1 function1, x1b x1bVar) {
        w4a0 w4a0Var;
        aq40 aq40Var;
        if (x1bVar instanceof w4a0) {
            w4a0Var = (w4a0) x1bVar;
            int i = w4a0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4a0Var.e = i - Integer.MIN_VALUE;
            } else {
                w4a0Var = new w4a0(x1bVar);
            }
        } else {
            w4a0Var = new w4a0(x1bVar);
        }
        Object obj = w4a0Var.d;
        y5b y5bVar = y5b.a;
        int i2 = w4a0Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            final aq40 aq40Var2 = new aq40();
            boolean z = ((Number) aj0Var.b()).floatValue() == 0.0f;
            Function1 function2 = new Function1() { // from class: u4a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    vi0 vi0Var = (vi0) obj2;
                    float fAbs = Math.abs(((Number) ((x5a0) vi0Var.e).getValue()).floatValue());
                    float f2 = f;
                    float fAbs2 = Math.abs(f2);
                    ytw ytwVar = vi0Var.e;
                    aq40 aq40Var3 = aq40Var2;
                    tp70 tp70Var2 = tp70Var;
                    Function1 function3 = function1;
                    if (fAbs >= fAbs2) {
                        float fE = ssi.e(((Number) ((x5a0) ytwVar).getValue()).floatValue(), f2);
                        ssi.c(vi0Var, tp70Var2, function3, fE - aq40Var3.a);
                        vi0Var.a();
                        aq40Var3.a = fE;
                    } else {
                        x5a0 x5a0Var = (x5a0) ytwVar;
                        ssi.c(vi0Var, tp70Var2, function3, ((Number) x5a0Var.getValue()).floatValue() - aq40Var3.a);
                        aq40Var3.a = ((Number) x5a0Var.getValue()).floatValue();
                    }
                    return Unit.a;
                }
            };
            w4a0Var.b = aj0Var;
            w4a0Var.c = aq40Var2;
            w4a0Var.a = f;
            w4a0Var.e = 1;
            if (sje0.d(aj0Var, h4dVar, !z, function2, w4a0Var) == y5bVar) {
                return y5bVar;
            }
            aq40Var = aq40Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = w4a0Var.a;
            aq40Var = w4a0Var.c;
            aj0Var = w4a0Var.b;
            uj50.b(obj);
        }
        return new ti0(new Float(f - aq40Var.a), aj0Var);
    }

    public static final void c(vi0 vi0Var, tp70 tp70Var, Function1 function1, float f) {
        float fE;
        try {
            fE = tp70Var.e(f);
        } catch (CancellationException unused) {
            vi0Var.a();
            fE = 0.0f;
        }
        function1.invoke(Float.valueOf(fE));
        if (Math.abs(f - fE) > 0.5f) {
            vi0Var.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object d(final tp70 tp70Var, float f, final float f2, aj0 aj0Var, xi0 xi0Var, final Function1 function1, x1b x1bVar) {
        x4a0 x4a0Var;
        aq40 aq40Var;
        aj0 aj0Var2;
        float f3;
        if (x1bVar instanceof x4a0) {
            x4a0Var = (x4a0) x1bVar;
            int i = x4a0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x4a0Var.f = i - Integer.MIN_VALUE;
            } else {
                x4a0Var = new x4a0(x1bVar);
            }
        } else {
            x4a0Var = new x4a0(x1bVar);
        }
        x4a0 x4a0Var2 = x4a0Var;
        Object obj = x4a0Var2.e;
        y5b y5bVar = y5b.a;
        int i2 = x4a0Var2.f;
        if (i2 == 0) {
            uj50.b(obj);
            final aq40 aq40Var2 = new aq40();
            float fFloatValue = ((Number) aj0Var.b()).floatValue();
            Float f4 = new Float(f);
            boolean z = ((Number) aj0Var.b()).floatValue() == 0.0f;
            Function1 function2 = new Function1() { // from class: v4a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    float fE;
                    tp70 tp70Var2 = tp70Var;
                    vi0 vi0Var = (vi0) obj2;
                    float fE2 = ssi.e(((Number) ((x5a0) vi0Var.e).getValue()).floatValue(), f2);
                    aq40 aq40Var3 = aq40Var2;
                    float f5 = fE2 - aq40Var3.a;
                    try {
                        fE = tp70Var2.e(f5);
                    } catch (CancellationException unused) {
                        vi0Var.a();
                        fE = 0.0f;
                    }
                    function1.invoke(Float.valueOf(fE));
                    if (Math.abs(f5 - fE) > 0.5f || fE2 != ((Number) ((x5a0) vi0Var.e).getValue()).floatValue()) {
                        vi0Var.a();
                    }
                    aq40Var3.a += fE;
                    return Unit.a;
                }
            };
            x4a0Var2.c = aj0Var;
            x4a0Var2.d = aq40Var2;
            x4a0Var2.a = f;
            x4a0Var2.b = fFloatValue;
            x4a0Var2.f = 1;
            if (sje0.e(aj0Var, f4, xi0Var, !z, function2, x4a0Var2) == y5bVar) {
                return y5bVar;
            }
            aq40Var = aq40Var2;
            aj0Var2 = aj0Var;
            f3 = fFloatValue;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = x4a0Var2.b;
            f = x4a0Var2.a;
            aq40Var = x4a0Var2.d;
            aj0Var2 = x4a0Var2.c;
            uj50.b(obj);
        }
        return new ti0(new Float(f - aq40Var.a), cj0.b(aj0Var2, 0.0f, e(((Number) aj0Var2.b()).floatValue(), f3), 29));
    }

    public static final float e(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }
}
