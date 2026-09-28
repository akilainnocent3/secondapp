package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0r implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0r(o4q o4qVar, int i) {
        this.b = o4qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                p0r.d((o4q) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final ComposeView composeView = (ComposeView) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = hl80.N;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(composeView);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: wk80
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ohp<Object>[] ohpVarArr2 = hl80.N;
                                yfx.i(kjx.a(composeView), "add_widgets_route", bjx.a(new r8a(1, new kkx())), 4);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    ck80.d((Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l0r(ComposeView composeView) {
        this.b = composeView;
    }
}
