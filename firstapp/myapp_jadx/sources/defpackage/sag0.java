package defpackage;

import com.sportygames.campaign.data.model.TournamentConfigVO;
import com.sportygames.campaign.presentation.TournamentBannerConfig;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentKt$Tournament$26$1", f = "Tournament.kt", l = {}, m = "invokeSuspend", v = 1)
public final class sag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function2<List<TournamentBannerConfig>, List<TournamentUserPlayInfo>, Unit> a;
    public final /* synthetic */ List<TournamentBannerConfig> b;
    public final /* synthetic */ List<TournamentUserPlayInfo> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sag0(Function2<? super List<TournamentBannerConfig>, ? super List<TournamentUserPlayInfo>, Unit> function2, List<TournamentBannerConfig> list, List<TournamentUserPlayInfo> list2, v1b<? super sag0> v1bVar) {
        super(2, v1bVar);
        this.a = function2;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sag0(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Function2<List<TournamentBannerConfig>, List<TournamentUserPlayInfo>, Unit> function2 = this.a;
        List<TournamentBannerConfig> list = this.b;
        List<TournamentUserPlayInfo> list2 = this.c;
        function2.invoke(list, list2);
        ssw<List<TournamentConfigVO>> sswVar = wag0.a;
        list.getClass();
        ((x5a0) wag0.n).setValue(new wag0.b(list, list2));
        return Unit.a;
    }
}
