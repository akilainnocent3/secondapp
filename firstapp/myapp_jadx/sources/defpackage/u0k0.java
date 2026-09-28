package defpackage;

import com.sportybet.feature.worldcup.config.domain.model.WorldCupTournamentConfig;
import com.sportybet.plugin.realsports.data.Event;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$loadAllEvents$1", f = "WorldCupPanelViewModel.kt", l = {186}, m = "invokeSuspend", v = 2)
public final class u0k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public t0k0 a;
    public t0k0 b;
    public boolean c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ t0k0 f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0k0(t0k0 t0k0Var, boolean z, v1b<? super u0k0> v1bVar) {
        super(2, v1bVar);
        this.f = t0k0Var;
        this.i = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u0k0 u0k0Var = new u0k0(this.f, this.i, v1bVar);
        u0k0Var.e = obj;
        return u0k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u0k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        boolean z;
        t0k0 t0k0Var;
        t0k0 t0k0Var2;
        y5b y5bVar = y5b.a;
        int i = this.d;
        t0k0 t0k0Var3 = this.f;
        try {
            if (i == 0) {
                uj50.b(obj);
                boolean z2 = this.i;
                zi50.a aVar = zi50.b;
                bhk bhkVar = t0k0Var3.b;
                WorldCupTournamentConfig worldCupTournamentConfig = t0k0Var3.D;
                if (worldCupTournamentConfig == null) {
                    Intrinsics.n("config");
                    throw null;
                }
                String tournamentId = worldCupTournamentConfig.getTournamentId();
                String str = t0k0Var3.z1().a;
                str.getClass();
                this.e = null;
                this.a = t0k0Var3;
                this.b = t0k0Var3;
                this.c = z2;
                this.d = 1;
                Serializable serializableA = bhkVar.a.a(tournamentId, str, null, this);
                if (serializableA == y5bVar) {
                    return y5bVar;
                }
                z = z2;
                t0k0Var = t0k0Var3;
                obj = serializableA;
                t0k0Var2 = t0k0Var;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.c;
                t0k0Var = this.b;
                t0k0Var2 = this.a;
                uj50.b(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new dtg((Event) it.next()));
            }
            t0k0Var.G = new ArrayList(arrayList);
            if (z) {
                t0k0Var2.F = !t0k0Var2.y1().isEmpty() ? l0k0.LIVE : l0k0.PRE_MATCH;
            }
            t0k0Var2.L1();
            t0k0Var2.x1();
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            t0k0Var3.K1(f1k0.a);
        }
        return Unit.a;
    }
}
