package defpackage;

import com.sporty.android.core.model.bookingcode.TournamentBookingCodeFilterDto;
import java.util.List;
import kotlin.collections.a;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class k15 {
    public final g3z a;

    public k15(g3z g3zVar) {
        g3zVar.getClass();
        this.a = g3zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, List list, String str2, List list2, int i, x1b x1bVar) {
        j15 j15Var;
        if (x1bVar instanceof j15) {
            j15Var = (j15) x1bVar;
            int i2 = j15Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j15Var.c = i2 - Integer.MIN_VALUE;
            } else {
                j15Var = new j15(this, x1bVar);
            }
        } else {
            j15Var = new j15(this, x1bVar);
        }
        Object obj = j15Var.a;
        y5b y5bVar = y5b.a;
        int i3 = j15Var.c;
        if (i3 != 0) {
            if (i3 == 1) {
                uj50.b(obj);
                return ((zi50) obj).a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        TournamentBookingCodeFilterDto tournamentBookingCodeFilterDto = new TournamentBookingCodeFilterDto(a.c(str), list, StringsKt.U(str2) ? null : str2, null, list2, i, 8, null);
        j15Var.c = 1;
        Object objJ = this.a.j(tournamentBookingCodeFilterDto, j15Var);
        return objJ == y5bVar ? y5bVar : objJ;
    }
}
