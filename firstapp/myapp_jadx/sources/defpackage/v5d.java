package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.dedicatedteampage.shared.ui.DedicatedTeamPageActivity;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v5d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v5d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final DedicatedTeamPageActivity dedicatedTeamPageActivity = (DedicatedTeamPageActivity) obj3;
                final phx phxVar = (phx) obj2;
                ghx ghxVar = (ghx) obj;
                int i2 = DedicatedTeamPageActivity.c;
                ghxVar.getClass();
                c6d.a.a.getClass();
                ffx.a aVar = new gfx().a;
                cae0 cae0Var = djx.o;
                aVar.a = cae0Var;
                Unit unit = Unit.a;
                nex nexVar = new nex("team_id", aVar.a());
                gfx gfxVar = new gfx();
                ffx.a aVar2 = gfxVar.a;
                aVar2.a = cae0Var;
                aVar2.b = true;
                gfxVar.a(null);
                nex nexVar2 = new nex("team_name", aVar2.a());
                gfx gfxVar2 = new gfx();
                ffx.a aVar3 = gfxVar2.a;
                aVar3.a = cae0Var;
                aVar3.b = true;
                gfxVar2.a(null);
                hhx.b(ghxVar, YAzniTbXHYQ.rqwU, b.k(nexVar, nexVar2, new nex("entrance", aVar3.a())), new op8(678607997, new iaj() { // from class: w5d
                    @Override // defpackage.iaj
                    public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                        a aVar4 = (a) obj6;
                        ((Integer) obj7).getClass();
                        int i3 = DedicatedTeamPageActivity.c;
                        ((pf0) obj4).getClass();
                        ((ifx) obj5).getClass();
                        DedicatedTeamPageActivity dedicatedTeamPageActivity2 = dedicatedTeamPageActivity;
                        boolean zA = aVar4.A(dedicatedTeamPageActivity2);
                        Object objY = aVar4.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new x5d(dedicatedTeamPageActivity2, 0);
                            aVar4.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        final phx phxVar2 = phxVar;
                        boolean zA2 = aVar4.A(phxVar2);
                        Object objY2 = aVar4.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new Function2() { // from class: y5d
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj8, Object obj9) {
                                    String str = (String) obj8;
                                    String str2 = (String) obj9;
                                    int i4 = DedicatedTeamPageActivity.c;
                                    str.getClass();
                                    str2.getClass();
                                    c6d.a.a.getClass();
                                    yfx.i(phxVar2, c6d.a.a(str, str2, AnalyticsParam.EVENT_SOURCE_EVENT_DETAILS), null, 6);
                                    return Unit.a;
                                }
                            };
                            aVar4.r(objY2);
                        }
                        m7d.b(function0, (Function2) objY2, aVar4, 0);
                        return Unit.a;
                    }
                }, true), 252);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((Function2) obj3).invoke((String) obj2, str);
                break;
        }
        return Unit.a;
    }
}
