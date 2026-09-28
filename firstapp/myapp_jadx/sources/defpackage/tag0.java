package defpackage;

import com.sportygames.campaign.presentation.TournamentBannerConfig;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentKt$Tournament$27$1", f = "Tournament.kt", l = {}, m = "invokeSuspend", v = 1)
public final class tag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ i96 a;
    public final /* synthetic */ List<TournamentBannerConfig> b;
    public final /* synthetic */ List<TournamentUserPlayInfo> c;
    public final /* synthetic */ twd0<wag0.a> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tag0(i96 i96Var, List<TournamentBannerConfig> list, List<TournamentUserPlayInfo> list2, twd0<wag0.a> twd0Var, v1b<? super tag0> v1bVar) {
        super(2, v1bVar);
        this.a = i96Var;
        this.b = list;
        this.c = list2;
        this.d = twd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tag0(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        Object next;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hfs hfsVar = kag0.a;
        if (!Intrinsics.g(((wag0.a) ((x5a0) this.d).getValue()).b, "ROUND_END_WAIT")) {
            return Unit.a;
        }
        i96 i96Var = this.a;
        wzm wzmVar = i96Var.b;
        Iterable iterable = this.c;
        if (iterable == null) {
            iterable = m2g.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Long tournamentId = ((TournamentUserPlayInfo) it.next()).getTournamentId();
            if (tournamentId != null) {
                long jLongValue = tournamentId.longValue();
                Iterator<T> it2 = this.b.iterator();
                while (true) {
                    lowerCase = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Long id = ((TournamentBannerConfig) next).getId();
                    if (id != null && id.longValue() == jLongValue) {
                        break;
                    }
                }
                TournamentBannerConfig tournamentBannerConfig = (TournamentBannerConfig) next;
                if (tournamentBannerConfig != null) {
                    String status = tournamentBannerConfig.getStatus();
                    if (status != null) {
                        lowerCase = status.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    String startTime = tournamentBannerConfig.getStartTime();
                    if (startTime == null) {
                        startTime = "";
                    }
                    if (t69.a(startTime) && !Intrinsics.g(lowerCase, "stopped") && !Intrinsics.g(lowerCase, "paused") && !Intrinsics.g(lowerCase, "ended") && jLongValue != 0) {
                        wzmVar.getClass();
                        jgg0 jgg0Var = jgg0.a;
                        String strA = d020.a(jLongValue, "{ \"id\": \"", "\" }");
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        wzmVar.i(strA, o2gVar);
                        String strA2 = i96Var.c.a(jgg0Var, i96Var.i, jLongValue, i96Var.v, "");
                        i96Var.N.put(strA2, tournamentId);
                        wzm.g(wzmVar, jgg0Var, strA2);
                    }
                }
            }
        }
        return Unit.a;
    }
}
