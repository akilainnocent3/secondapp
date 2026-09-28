package defpackage;

import android.view.View;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rdz implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rdz(hlf0 hlf0Var, nk0.d dVar, wfs wfsVar) {
        this.b = dVar;
        this.c = wfsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jlf0 jlf0VarB;
        jlf0 jlf0VarB2;
        jlf0 jlf0VarB3;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj3;
                Function0 function0 = (Function0) obj2;
                int i2 = OverUnderComponent.e0;
                ((View) obj).getClass();
                op5.a.getClass();
                String str = op5.c;
                if (str == null) {
                    str = "";
                }
                wz.a("FBGRemoved", krh0.e(str), new String[0]);
                overUnderComponent.o();
                function0.invoke();
                break;
            default:
                final nk0.d dVar = (nk0.d) obj3;
                osw oswVar = ((wfs) obj2).b;
                ndf0 ndf0Var = (ndf0) obj;
                rfs rfsVar = (rfs) dVar.a;
                jlf0 jlf0VarB4 = rfsVar.b();
                final ora0 ora0VarD = null;
                ora0 ora0Var = jlf0VarB4 != null ? jlf0VarB4.a : null;
                ora0 ora0VarD2 = ((((u5a0) oswVar).D() & 1) == 0 || (jlf0VarB3 = rfsVar.b()) == null) ? null : jlf0VarB3.b;
                if (ora0Var != null) {
                    ora0VarD2 = ora0Var.d(ora0VarD2);
                }
                ora0 ora0VarD3 = ((((u5a0) oswVar).D() & 2) == 0 || (jlf0VarB2 = rfsVar.b()) == null) ? null : jlf0VarB2.c;
                if (ora0VarD2 != null) {
                    ora0VarD3 = ora0VarD2.d(ora0VarD3);
                }
                if ((((u5a0) oswVar).D() & 4) != 0 && (jlf0VarB = rfsVar.b()) != null) {
                    ora0VarD = jlf0VarB.d;
                }
                if (ora0VarD3 != null) {
                    ora0VarD = ora0VarD3.d(ora0VarD);
                }
                ndf0Var.getClass();
                final yp40 yp40Var = new yp40();
                ndf0Var.b = ndf0Var.a.c(new Function1() { // from class: mdf0
                    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        nk0.d dVar2;
                        nk0.d dVar3 = (nk0.d) obj4;
                        yp40 yp40Var2 = yp40Var;
                        boolean z = yp40Var2.a;
                        nk0.d dVar4 = dVar;
                        if (z) {
                            T t = dVar3.a;
                            int i3 = dVar3.c;
                            int i4 = dVar3.b;
                            if ((t instanceof ora0) && i4 == dVar4.b && i3 == dVar4.c) {
                                ora0 ora0Var2 = ora0VarD;
                                if (ora0Var2 == null) {
                                    ora0Var2 = new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                                }
                                dVar2 = new nk0.d(i4, i3, ora0Var2);
                            } else {
                                dVar2 = dVar3;
                            }
                        } else {
                            dVar2 = dVar3;
                        }
                        yp40Var2.a = dVar4.equals(dVar3);
                        return dVar2;
                    }
                });
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rdz(OverUnderComponent overUnderComponent, Function0 function0) {
        this.b = overUnderComponent;
        this.c = function0;
    }
}
