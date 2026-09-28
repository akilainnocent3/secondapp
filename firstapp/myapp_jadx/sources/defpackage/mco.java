package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.a;
import com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mco implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mco(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.d.a);
                break;
            default:
                xss xssVar = ((LiveTournamentActivity) obj).F;
                if (xssVar != null) {
                    xssVar.c();
                }
                break;
        }
        return Unit.a;
    }
}
