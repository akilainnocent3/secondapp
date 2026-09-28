package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.plugin.sportystories.domain.entity.Story;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class udj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ udj(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = hajVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) hajVar;
                int iIntValue = ((Integer) obj).intValue();
                nk0.d dVar = (nk0.d) CollectionsKt.firstOrNull(((wk0.a) obj2).a.b(iIntValue, iIntValue, "tag_target"));
                if (dVar != null) {
                    ((String) dVar.a).getClass();
                    function0.invoke();
                    Unit unit = Unit.a;
                }
                break;
            default:
                final List list = (List) obj2;
                final Function1 function1 = (Function1) hajVar;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szr.f(szrVar, list.size(), null, new op8(66471517, new iaj() { // from class: y1e0
                    @Override // defpackage.iaj
                    public final Object d(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int iIntValue2 = ((Integer) obj4).intValue();
                        a aVar = (a) obj5;
                        int iIntValue3 = ((Integer) obj6).intValue();
                        ((gwr) obj3).getClass();
                        if ((iIntValue3 & 48) == 0) {
                            iIntValue3 |= aVar.d(iIntValue2) ? 32 : 16;
                        }
                        if (aVar.q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                            final Story story = (Story) list.get(iIntValue2);
                            final Function1 function2 = function1;
                            boolean zM = aVar.M(function2) | aVar.A(story);
                            Object objY = aVar.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: z1e0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(story);
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY);
                            }
                            b2e0.c(story, iIntValue2, (Function0) objY, aVar, Story.$stable | (iIntValue3 & 112));
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true), 6);
                break;
        }
        return Unit.a;
    }
}
