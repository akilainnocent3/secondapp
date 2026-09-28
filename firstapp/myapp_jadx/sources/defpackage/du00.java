package defpackage;

import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.sportypicks.data.model.PickMarketsResponseDto;
import com.sportybet.plugin.sportypicks.data.model.PickTournamentDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class du00 {
    public final vt00 a;

    public du00(vt00 vt00Var) {
        vt00Var.getClass();
        this.a = vt00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, int i2, x1b x1bVar, List list) {
        bu00 bu00Var;
        Object objA;
        if (x1bVar instanceof bu00) {
            bu00Var = (bu00) x1bVar;
            int i3 = bu00Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bu00Var.c = i3 - Integer.MIN_VALUE;
            } else {
                bu00Var = new bu00(this, x1bVar);
            }
        } else {
            bu00Var = new bu00(this, x1bVar);
        }
        Object obj = bu00Var.a;
        y5b y5bVar = y5b.a;
        int i4 = bu00Var.c;
        if (i4 == 0) {
            uj50.b(obj);
            bu00Var.c = 1;
            objA = this.a.a(list, i, i2, bu00Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objA instanceof zi50.b) {
            return objA;
        }
        try {
            PickMarketsResponseDto pickMarketsResponseDto = (PickMarketsResponseDto) objA;
            List<Tournament> tournaments = pickMarketsResponseDto.getTournaments();
            if (tournaments == null) {
                tournaments = m2g.a;
            }
            return new ht00(wt00.a(tournaments), pickMarketsResponseDto.getMoreEvents());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        cu00 cu00Var;
        Object objB;
        if (x1bVar instanceof cu00) {
            cu00Var = (cu00) x1bVar;
            int i = cu00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cu00Var.c = i - Integer.MIN_VALUE;
            } else {
                cu00Var = new cu00(this, x1bVar);
            }
        } else {
            cu00Var = new cu00(this, x1bVar);
        }
        Object obj = cu00Var.a;
        y5b y5bVar = y5b.a;
        int i2 = cu00Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            cu00Var.c = 1;
            objB = this.a.b(cu00Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objB instanceof zi50.b) {
            return objB;
        }
        try {
            List<PickTournamentDto> list = (List) objB;
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (PickTournamentDto pickTournamentDto : list) {
                String id = pickTournamentDto.getId();
                String name = pickTournamentDto.getName();
                pt00 pt00Var = (id == null || StringsKt.U(id) || name == null || StringsKt.U(name)) ? null : new pt00(id, name);
                if (pt00Var != null) {
                    arrayList.add(pt00Var);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }
}
