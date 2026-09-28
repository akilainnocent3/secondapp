package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zc5 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zc5(d dVar, g7x g7xVar, Function1 function1, int i) {
        this.b = dVar;
        this.c = g7xVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj5;
                final f fVar = (f) obj4;
                twd0 twd0Var = (twd0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    md5 md5Var = (md5) twd0Var.getValue();
                    boolean zA = aVar.A(fVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: cd5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                fVar.y1(com.sportybet.android.instantwin.presentation.buildandgo.d.j.a.a);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function1 = (Function0) objY;
                    boolean zA2 = aVar.A(fVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: dd5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                fVar.y1(com.sportybet.android.instantwin.presentation.buildandgo.d.C0263d.a);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    Function0 function2 = (Function0) objY2;
                    boolean zA3 = aVar.A(fVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new ed5(fVar, 0);
                        aVar.r(objY3);
                    }
                    Function0 function3 = (Function0) objY3;
                    boolean zA4 = aVar.A(fVar);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        kd5.a aVar2 = new kd5.a(0, fVar, f.class, "refreshBngGame", "refreshBngGame()V", 0);
                        aVar.r(aVar2);
                        objY4 = aVar2;
                    }
                    kd5.b(md5Var, function0, function1, function2, function3, (Function0) ((chp) objY4), pp8.b(710128837, new fd5(fVar, i2), aVar), aVar, 1572864);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n8x.l((d) obj5, (g7x) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zc5(Function0 function0, f fVar, ytw ytwVar) {
        this.b = function0;
        this.c = fVar;
        this.d = ytwVar;
    }
}
