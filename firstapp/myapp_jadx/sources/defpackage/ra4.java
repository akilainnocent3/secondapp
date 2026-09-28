package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.debugscreen.impl.DebugScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ra4 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ra4(hjx hjxVar, DebugScreenActivity debugScreenActivity, ytw ytwVar) {
        this.b = hjxVar;
        this.c = debugScreenActivity;
        this.d = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xa4.a((String) obj5, (Function1) obj4, (Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final hjx hjxVar = (hjx) obj5;
                final DebugScreenActivity debugScreenActivity = (DebugScreenActivity) obj4;
                final ytw ytwVar = (ytw) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = DebugScreenActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    crz crzVarA = erz.a(R.drawable.ic_action_bar_back, 0, aVar);
                    boolean zA = aVar.A(hjxVar) | aVar.A(debugScreenActivity);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: h0d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = DebugScreenActivity.b;
                                wix.c(hjxVar, debugScreenActivity);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    odd0.d(null, "Debug Screen", 0L, crzVarA, null, (Function0) objY, pp8.b(106885468, new gaj() { // from class: i0d
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            a aVar2 = (a) obj7;
                            int iIntValue2 = ((Integer) obj8).intValue();
                            int i3 = DebugScreenActivity.b;
                            ((e160) obj6).getClass();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                k1g0 k1g0Var = (k1g0) ytwVar.getValue();
                                if (k1g0Var == null) {
                                    aVar2.N(1654259740);
                                } else {
                                    aVar2.N(-362278779);
                                    k1g0Var.a();
                                }
                                aVar2.H();
                                DebugScreenActivity debugScreenActivity2 = debugScreenActivity;
                                boolean zA2 = aVar2.A(debugScreenActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == a.C0041a.a) {
                                    objY2 = new j0d(debugScreenActivity2, 0);
                                    aVar2.r(objY2);
                                }
                                c6n.a((Function0) objY2, null, false, null, null, hx8.a, aVar2, 1572864, 62);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 1572912, 21);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ra4(String str, Function1 function1, Function0 function0, int i) {
        this.b = str;
        this.c = function1;
        this.d = function0;
    }
}
