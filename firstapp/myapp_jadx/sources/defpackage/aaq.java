package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aaq implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ aaq(int i, Function0 function0) {
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jaq.h((Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final WorldCupPassAnnouncementActivity worldCupPassAnnouncementActivity = (WorldCupPassAnnouncementActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = WorldCupPassAnnouncementActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ytw ytwVarC = wyh.c(((c) worldCupPassAnnouncementActivity.c.getValue()).i, aVar, 0, 7);
                    o0z.a(null, null, null, null, null, pp8.b(-441264059, new Function2() { // from class: l1k0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            crz crzVarA;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i3 = WorldCupPassAnnouncementActivity.d;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                twd0 twd0Var = ytwVarC;
                                UiText uiText = ((s1k0) twd0Var.getValue()).a;
                                UiText uiText2 = ((s1k0) twd0Var.getValue()).b;
                                UiText uiText3 = ((s1k0) twd0Var.getValue()).c;
                                String str = ((s1k0) twd0Var.getValue()).d;
                                if (((s1k0) twd0Var.getValue()).e) {
                                    aVar2.N(1197622412);
                                    crzVarA = pib0.a(R.drawable.ic__export, 0, aVar2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(1197707817);
                                    aVar2.H();
                                    crzVarA = null;
                                }
                                crz crzVar = crzVarA;
                                WorldCupPassAnnouncementActivity worldCupPassAnnouncementActivity2 = worldCupPassAnnouncementActivity;
                                boolean zA = aVar2.A(worldCupPassAnnouncementActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new jlb(worldCupPassAnnouncementActivity2, 3);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(worldCupPassAnnouncementActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new baq(worldCupPassAnnouncementActivity2, 1);
                                    aVar2.r(objY2);
                                }
                                r1k0.a(uiText, uiText2, uiText3, function0, str, crzVar, (Function0) objY2, aVar2, 0, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ aaq(WorldCupPassAnnouncementActivity worldCupPassAnnouncementActivity) {
        this.b = worldCupPassAnnouncementActivity;
    }
}
