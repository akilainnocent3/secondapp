package defpackage;

import android.accounts.Account;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sportybet.android.cashoutphase3.a;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.plugin.event.d;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.event.PreMatchEventAdapter;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nn6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ j8i0 c;

    public /* synthetic */ nn6(Object obj, j8i0 j8i0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = j8i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        j8i0 j8i0Var = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                h hVar = (h) j8i0Var;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    if (str != null) {
                        hVar.L1(str, false);
                    }
                    hVar.A1(new a.b(str));
                }
                break;
            default:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                final e eVar = (e) j8i0Var;
                d dVar = (d) obj;
                int i2 = PreMatchEventActivity.a2;
                if (dVar instanceof d.c) {
                    preMatchEventActivity.getAccountHelper().demandAccount(preMatchEventActivity, new tit() { // from class: gc20
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            e eVar2;
                            Pair<? extends Market, Boolean> pair;
                            int i3 = PreMatchEventActivity.a2;
                            if (account == null || (pair = (eVar2 = eVar).f0) == null) {
                                return;
                            }
                            Market market = (Market) pair.a;
                            boolean zBooleanValue = pair.b.booleanValue();
                            eVar2.f0 = null;
                            eVar2.K1(market, zBooleanValue);
                        }
                    });
                } else if (dVar instanceof d.a) {
                    d.a aVar = (d.a) dVar;
                    zyf0.c(1, preMatchEventActivity.getCMSString(aVar.b, new Object[0]));
                    PreMatchEventAdapter preMatchEventAdapter = preMatchEventActivity.A0;
                    if (preMatchEventAdapter != null) {
                        preMatchEventAdapter.onFavoriteMarketStatusUpdated(aVar.a);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
