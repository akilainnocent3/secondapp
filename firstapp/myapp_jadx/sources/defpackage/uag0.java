package defpackage;

import com.sportygames.campaign.presentation.TournamentBannerConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentKt$TournamentBannerPager$7$1", f = "Tournament.kt", l = {291}, m = "invokeSuspend", v = 1)
public final class uag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ List<TournamentBannerConfig> b;
    public final /* synthetic */ zpz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uag0(v1b v1bVar, zpz zpzVar, List list) {
        super(2, v1bVar);
        this.b = list;
        this.c = zpzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uag0(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            List<TournamentBannerConfig> list = this.b;
            if (!list.isEmpty()) {
                zpz zpzVar = this.c;
                if (zpzVar.k() >= list.size()) {
                    this.a = 1;
                    if (zpz.v(0, this, zpzVar) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
