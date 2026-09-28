package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ysp {

    public interface a {
        void b(zsp zspVar);
    }

    public static nk0 a(String str, String str2, long j, Runnable runnable, androidx.compose.runtime.a aVar, int i) {
        final Runnable runnable2 = (i & 8) != 0 ? null : runnable;
        int iT = StringsKt.T(str, str2, 0, false, 6);
        int length = str2.length() + iT;
        ora0 ora0VarA = ora0.a(mla.l(R.style.B2_B, aVar).a, j, null, null, runnable2 != null ? yef0.c : null, 61438);
        aVar.N(-1180172038);
        nk0.b bVar = new nk0.b((Object) null);
        if (iT < 0) {
            bVar.g(str);
        } else {
            bVar.g(wae0.K(iT, str));
            if (runnable2 != null) {
                aVar.N(-1101968917);
                boolean zA = aVar.A(runnable2);
                Object objY = aVar.y();
                if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new ufs() { // from class: xsp
                        @Override // defpackage.ufs
                        public final void a(rfs rfsVar) {
                            rfsVar.getClass();
                            runnable2.run();
                        }
                    };
                    aVar.r(objY);
                }
                int iJ = bVar.j(new rfs.a("reject_reason", new jlf0(ora0VarA, 14), (ufs) objY));
                try {
                    int iL = bVar.l(ora0VarA);
                    try {
                        bVar.g(str2);
                        Unit unit = Unit.a;
                        bVar.i(iL);
                        bVar.i(iJ);
                        aVar.H();
                    } catch (Throwable th) {
                        bVar.i(iL);
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar.i(iJ);
                    throw th2;
                }
            } else {
                aVar.N(-1101536560);
                aVar.H();
                int iL2 = bVar.l(ora0VarA);
                try {
                    bVar.g(str2);
                    Unit unit2 = Unit.a;
                    bVar.i(iL2);
                } catch (Throwable th3) {
                    bVar.i(iL2);
                    throw th3;
                }
            }
            bVar.g(str.substring(length));
        }
        nk0 nk0VarM = bVar.m();
        aVar.H();
        return nk0VarM;
    }

    public static final void b(final a aVar, final a aVar2, final zsp zspVar, final ComposeView composeView) {
        composeView.getClass();
        zspVar.getClass();
        if (zspVar.a == zsp.a.a) {
            composeView.setVisibility(8);
            return;
        }
        composeView.setVisibility(0);
        composeView.setViewCompositionStrategy(u6i0.c.a);
        composeView.setContent(new op8(1139287979, new Function2() { // from class: usp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 1;
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final zsp zspVar2 = zspVar;
                    int iOrdinal = zspVar2.a.ordinal();
                    ComposeView composeView2 = composeView;
                    final ysp.a aVar4 = aVar;
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    switch (iOrdinal) {
                        case 0:
                            aVar3.N(-360791121);
                            aVar3.H();
                            break;
                        case 1:
                            aVar3.N(1697425505);
                            Context context = composeView2.getContext();
                            context.getClass();
                            String strB = sn5.b(context, R.string.wap_home__deposit_is_still_pending, new Object[0]);
                            Context context2 = composeView2.getContext();
                            context2.getClass();
                            String strB2 = sn5.b(context2, R.string.wap_home__please_verify_your_account_to_receive_your_deposit, strB);
                            x9m.b bVar = x9m.b.d;
                            nk0 nk0VarA = ysp.a(strB2, strB, c68.a(R.color.text_danger, aVar3), null, aVar3, 8);
                            Context context3 = composeView2.getContext();
                            context3.getClass();
                            String strB3 = sn5.b(context3, R.string.common_functions__verify, new Object[0]);
                            boolean zA = aVar3.A(aVar4) | aVar3.A(zspVar2);
                            Object objY = aVar3.y();
                            if (zA || objY == c0042a) {
                                objY = new Function0() { // from class: vsp
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        aVar4.b(zspVar2);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY);
                            }
                            w8m.a(bVar, nk0VarA, strB3, (Function0) objY, aVar3, 6, 4);
                            aVar3.H();
                            break;
                        case 2:
                        case 7:
                            aVar3.N(1697095386);
                            x9m.a aVar5 = x9m.a.d;
                            Context context4 = composeView2.getContext();
                            context4.getClass();
                            w8m.b(aVar5, sn5.b(context4, R.string.wap_home__kyc_banner_verifying1, new Object[0]), null, null, aVar3, 6, 28);
                            aVar3.H();
                            break;
                        case 3:
                            aVar3.N(1696730330);
                            x9m.a aVar6 = x9m.a.d;
                            Context context5 = composeView2.getContext();
                            context5.getClass();
                            w8m.b(aVar6, sn5.b(context5, R.string.wap_home__kyc_banner_verifying2, new Object[0]), null, null, aVar3, 6, 28);
                            aVar3.H();
                            break;
                        case 4:
                        case 6:
                            aVar3.N(1698523556);
                            String strB4 = zspVar2.b;
                            if (strB4 == null) {
                                strB4 = "";
                            }
                            if (StringsKt.U(strB4)) {
                                Context context6 = composeView2.getContext();
                                context6.getClass();
                                strB4 = sn5.b(context6, R.string.wap_home__deposit_is_still_pending, new Object[0]);
                            }
                            Context context7 = composeView2.getContext();
                            context7.getClass();
                            String strB5 = sn5.b(context7, zspVar2.a == zsp.a.e ? R.string.wap_home__kyc_banner_failed1 : R.string.wap_home__kyc_banner_failed2, strB4);
                            x9m.b bVar2 = x9m.b.d;
                            long jA = c68.a(R.color.text_danger, aVar3);
                            final ysp.a aVar7 = aVar2;
                            boolean zA2 = aVar3.A(aVar7) | aVar3.A(zspVar2);
                            Object objY2 = aVar3.y();
                            if (zA2 || objY2 == c0042a) {
                                objY2 = new Runnable() { // from class: wsp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        aVar7.b(zspVar2);
                                    }
                                };
                                aVar3.r(objY2);
                            }
                            nk0 nk0VarA2 = ysp.a(strB5, strB4, jA, (Runnable) objY2, aVar3, 0);
                            Context context8 = composeView2.getContext();
                            context8.getClass();
                            String strB6 = sn5.b(context8, R.string.common_functions__verify, new Object[0]);
                            boolean zA3 = aVar3.A(aVar4) | aVar3.A(zspVar2);
                            Object objY3 = aVar3.y();
                            if (zA3 || objY3 == c0042a) {
                                objY3 = new a9b(i, aVar4, zspVar2);
                                aVar3.r(objY3);
                            }
                            w8m.a(bVar2, nk0VarA2, strB6, (Function0) objY3, aVar3, 6, 4);
                            aVar3.H();
                            break;
                        case 5:
                            aVar3.N(1699903614);
                            x9m.b bVar3 = x9m.b.d;
                            Context context9 = composeView2.getContext();
                            context9.getClass();
                            String strB7 = sn5.b(context9, R.string.wap_home__please_verify_account_info, new Object[0]);
                            Context context10 = composeView2.getContext();
                            context10.getClass();
                            String strB8 = sn5.b(context10, R.string.common_functions__verify, new Object[0]);
                            boolean zA4 = aVar3.A(aVar4) | aVar3.A(zspVar2);
                            Object objY4 = aVar3.y();
                            if (zA4 || objY4 == c0042a) {
                                objY4 = new b9b(i, aVar4, zspVar2);
                                aVar3.r(objY4);
                            }
                            w8m.b(bVar3, strB7, strB8, (Function0) objY4, aVar3, 6, 4);
                            aVar3.H();
                            break;
                        default:
                            throw rg.a(-360908283, aVar3);
                    }
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
