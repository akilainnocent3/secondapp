package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pje implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pje(lsf0 lsf0Var, Function1 function1, fk4 fk4Var, int i) {
        this.b = lsf0Var;
        this.c = function1;
        this.d = fk4Var;
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
                jke.k((lsf0) obj5, (Function1) obj4, (fk4) obj3, (a) obj, qj40.a(1));
                break;
            default:
                f fVar = (f) obj5;
                hmi0 hmi0Var = (hmi0) obj4;
                twd0 twd0Var = (twd0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mli0 mli0Var = (mli0) twd0Var.getValue();
                    boolean zA = aVar.A(hmi0Var);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        uki0 uki0Var = new uki0(1, hmi0Var, hmi0.class, "handleAction", "handleAction(Lcom/sportybet/android/virtual/domain/viewmodel/model/VirtualLobbyUiAction;)V", 0);
                        aVar.r(uki0Var);
                        objY = uki0Var;
                    }
                    tki0.a(mli0Var, fVar, (Function1) ((chp) objY), aVar, 64);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pje(f fVar, hmi0 hmi0Var, ytw ytwVar) {
        this.b = fVar;
        this.c = hmi0Var;
        this.d = ytwVar;
    }
}
