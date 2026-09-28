package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.feature.remixbet.presentation.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final ComposeView composeView = (ComposeView) obj4;
                final wk wkVar = (wk) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(composeView);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: tk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                kjx.a(composeView).k();
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(wkVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new uk(wkVar, 0);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(wkVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: vk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return wk.m0(wkVar);
                            }
                        };
                        aVar.r(objY3);
                    }
                    il.a(null, function0, function1, (Function0) objY3, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                b bVar = (b) obj4;
                Function1 function2 = (Function1) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    aVar2.G();
                } else if (bVar instanceof b.C0416b) {
                    aVar2.N(-580880463);
                    t450.b(function2, aVar2, 0);
                    aVar2.H();
                } else if (bVar instanceof b.a) {
                    aVar2.N(-580745427);
                    t450.a(((b.a) bVar).a, function2, aVar2, 0);
                    aVar2.H();
                } else {
                    if (!(bVar instanceof b.c)) {
                        throw rg.a(535449527, aVar2);
                    }
                    aVar2.N(-580512400);
                    t450.d(((b.c) bVar).a, function2, aVar2, 0);
                    aVar2.H();
                }
                return Unit.a;
        }
    }
}
