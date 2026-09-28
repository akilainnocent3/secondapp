package defpackage;

import com.sportygames.campaign.presentation.TournamentBannerConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q8c implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q8c(TournamentBannerConfig tournamentBannerConfig, Function1 function1) {
        this.c = tournamentBannerConfig;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                function1.invoke(((gdc) obj).b);
                break;
            default:
                Long id = ((TournamentBannerConfig) obj).getId();
                if (id != null) {
                    function1.invoke(id);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ q8c(Function1 function1, gdc gdcVar) {
        this.b = function1;
        this.c = gdcVar;
    }
}
