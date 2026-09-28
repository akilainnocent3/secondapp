package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rje implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ rje(vv vvVar, fk4 fk4Var, int i) {
        this.b = vvVar;
        this.c = fk4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jke.a((vv) obj3, (fk4) hajVar, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                final ComposeView composeView = (ComposeView) obj3;
                final kdm kdmVar = (kdm) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w8i0 w8i0VarA = zdt.a(aVar);
                    if (w8i0VarA == null) {
                        ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    final c2e0 c2e0Var = (c2e0) p8i0.a(jq40.a(c2e0.class), w8i0VarA, null, cll.a(w8i0VarA, aVar), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar);
                    Unit unit = Unit.a;
                    boolean zA = aVar.A(composeView) | aVar.A(c2e0Var);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function1() { // from class: t1e0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ((use) obj4).getClass();
                                final c2e0 c2e0Var2 = c2e0Var;
                                Runnable runnable = new Runnable() { // from class: v1e0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        c2e0 c2e0Var3 = c2e0Var2;
                                        c2e0Var3.getClass();
                                        ej5.c(o8i0.d(c2e0Var3), null, null, new e2e0(null, c2e0Var3), 3);
                                    }
                                };
                                ComposeView composeView2 = composeView;
                                composeView2.setTag(runnable);
                                return new a2e0(composeView2);
                            }
                        };
                        aVar.r(objY);
                    }
                    xvf.c(unit, (Function1) objY, aVar);
                    scv.b(null, null, null, pp8.b(-1058402626, new Function2() { // from class: u1e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                b2e0.b(kdmVar, c2e0Var, aVar2, 64);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ rje(ComposeView composeView, kdm kdmVar) {
        this.b = composeView;
        this.c = kdmVar;
    }
}
