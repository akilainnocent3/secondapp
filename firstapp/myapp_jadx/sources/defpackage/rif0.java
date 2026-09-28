package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rif0 implements Function1 {
    public final /* synthetic */ iif0 a;
    public final /* synthetic */ v5b b;
    public final /* synthetic */ Context c;

    public /* synthetic */ rif0(iif0 iif0Var, v5b v5bVar, Context context) {
        this.a = iif0Var;
        this.b = v5bVar;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ks7 ks7Var;
        xdf0 xdf0Var = (xdf0) obj;
        etw<ydf0> etwVar = xdf0Var.a;
        etw<ydf0> etwVar2 = xdf0Var.a;
        sef0 sef0Var = sef0.b;
        etwVar.g(sef0Var);
        jef0 jef0Var = jef0.d;
        final iif0 iif0Var = this.a;
        boolean z = false;
        int i = 1;
        boolean z2 = (ulf0.c(iif0Var.j().b) || !((Boolean) ((x5a0) iif0Var.n).getValue()).booleanValue() || (iif0Var.f instanceof zwz)) ? false : true;
        final Function0 function0 = null;
        final tif0 tif0Var = new tif0(iif0Var, null);
        final v5b v5bVar = this.b;
        final Function0 function1 = new Function0() { // from class: oif0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ej5.c(v5bVar, null, a6b.d, new wif0(tif0Var, null), 1);
                return Unit.a;
            }
        };
        Context context = this.c;
        Resources resources = context.getResources();
        Function1 function2 = new Function1() { // from class: pif0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tef0 tef0Var = (tef0) obj2;
                function1.invoke();
                Function0 function3 = function0;
                if (function3 != null ? ((Boolean) function3.invoke()).booleanValue() : true) {
                    tef0Var.close();
                }
                return Unit.a;
            }
        };
        if (z2) {
            etwVar2.g(new ief0(kef0.a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, function2));
        }
        jef0 jef0Var2 = jef0.d;
        boolean z3 = (ulf0.c(iif0Var.j().b) || (iif0Var.f instanceof zwz)) ? false : true;
        final uif0 uif0Var = new uif0(iif0Var, null);
        final Function0 function3 = new Function0() { // from class: oif0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ej5.c(v5bVar, null, a6b.d, new wif0(uif0Var, null), 1);
                return Unit.a;
            }
        };
        Resources resources2 = context.getResources();
        Function1 function4 = new Function1() { // from class: pif0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tef0 tef0Var = (tef0) obj2;
                function3.invoke();
                Function0 function5 = function0;
                if (function5 != null ? ((Boolean) function5.invoke()).booleanValue() : true) {
                    tef0Var.close();
                }
                return Unit.a;
            }
        };
        if (z3) {
            etwVar2.g(new ief0(kef0.b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, function4));
        }
        jef0 jef0Var3 = jef0.d;
        boolean z4 = ((Boolean) ((x5a0) iif0Var.n).getValue()).booleanValue() && (ks7Var = (ks7) ((x5a0) iif0Var.y).getValue()) != null && ks7Var.a.getDescription().hasMimeType("text/*");
        final vif0 vif0Var = new vif0(iif0Var, null);
        final Function0 function5 = new Function0() { // from class: oif0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ej5.c(v5bVar, null, a6b.d, new wif0(vif0Var, null), 1);
                return Unit.a;
            }
        };
        Resources resources3 = context.getResources();
        Function1 function6 = new Function1() { // from class: pif0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tef0 tef0Var = (tef0) obj2;
                function5.invoke();
                Function0 function7 = function0;
                if (function7 != null ? ((Boolean) function7.invoke()).booleanValue() : true) {
                    tef0Var.close();
                }
                return Unit.a;
            }
        };
        if (z4) {
            etwVar2.g(new ief0(kef0.c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, function6));
        }
        jef0 jef0Var4 = jef0.d;
        boolean z5 = ulf0.d(iif0Var.j().b) != iif0Var.j().a.b.length();
        final ljb ljbVar = new ljb(iif0Var, i);
        final Function0 function7 = new Function0() { // from class: sif0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                iif0 iif0Var2 = iif0Var;
                ijf0 ijf0VarB = iif0.b(iif0Var2.j().a, vlf0.a(0, iif0Var2.j().a.b.length()));
                iif0Var2.c.invoke(ijf0VarB);
                long j = ijf0VarB.b;
                iif0Var2.x = new ulf0(j);
                iif0Var2.v = ijf0.a(iif0Var2.v, null, j, 5);
                iif0Var2.e(true);
                return Unit.a;
            }
        };
        Resources resources4 = context.getResources();
        Function1 function8 = new Function1() { // from class: pif0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                tef0 tef0Var = (tef0) obj2;
                function7.invoke();
                Function0 function9 = ljbVar;
                if (function9 != null ? ((Boolean) function9.invoke()).booleanValue() : true) {
                    tef0Var.close();
                }
                return Unit.a;
            }
        };
        if (z5) {
            etwVar2.g(new ief0(kef0.d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, function8));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            jef0 jef0Var5 = jef0.d;
            if (((Boolean) ((x5a0) iif0Var.n).getValue()).booleanValue() && ulf0.c(iif0Var.j().b)) {
                z = true;
            }
            final njb njbVar = new njb(iif0Var, i);
            Resources resources5 = context.getResources();
            Function1 function9 = new Function1() { // from class: pif0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    tef0 tef0Var = (tef0) obj2;
                    njbVar.invoke();
                    Function0 function10 = function0;
                    if (function10 != null ? ((Boolean) function10.invoke()).booleanValue() : true) {
                        tef0Var.close();
                    }
                    return Unit.a;
                }
            };
            if (z) {
                etwVar2.g(new ief0(jef0Var5.a, resources5.getString(jef0Var5.b), jef0Var5.c, function9));
            }
        }
        etwVar2.g(sef0Var);
        return Unit.a;
    }
}
