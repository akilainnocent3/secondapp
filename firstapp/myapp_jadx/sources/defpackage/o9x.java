package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.compose.ui.component.RevivableComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o9x implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o9x(v8x.b bVar, Function1 function1, int i) {
        this.b = bVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s9x.a((v8x.b) obj4, (Function1) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final RevivableComposeView revivableComposeView = (RevivableComposeView) obj4;
                final ComposeView composeView = (ComposeView) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = RevivableComposeView.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    revivableComposeView.a(0, aVar);
                    Unit unit = Unit.a;
                    boolean zA = aVar.A(revivableComposeView) | aVar.A(composeView);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function1() { // from class: vq50
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                int i3 = RevivableComposeView.b;
                                ((use) obj5).getClass();
                                return new wq50(revivableComposeView, composeView);
                            }
                        };
                        aVar.r(objY);
                    }
                    xvf.c(unit, (Function1) objY, aVar);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ o9x(RevivableComposeView revivableComposeView, ComposeView composeView) {
        this.b = revivableComposeView;
        this.c = composeView;
    }
}
