package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import com.sportygames.crash.remote.models.BetHistoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tfb implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tfb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj4;
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                fgbVar.V0 = str;
                fgbVar.X0 = str2;
                fgbVar.W0 = (BetHistoryItem) obj3;
                fgbVar.U1();
                break;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                String str5 = (String) obj3;
                str3.getClass();
                str4.getClass();
                str5.getClass();
                ((Function1) obj4).invoke(new b.d0(str3, str4, str5));
                break;
        }
        return Unit.a;
    }
}
