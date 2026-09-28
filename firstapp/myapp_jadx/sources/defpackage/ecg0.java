package defpackage;

import com.sportybet.feature.worldcup.tournament.data.model.TournamentGroupsResponseDto;
import com.sportybet.feature.worldcup.tournament.data.model.TournamentKnockoutsResponseDto;

/* JADX INFO: loaded from: classes6.dex */
public final class ecg0 {
    public final b4g0 a;

    public ecg0(b4g0 b4g0Var) {
        b4g0Var.getClass();
        this.a = b4g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        ccg0 ccg0Var;
        Object objA;
        if (x1bVar instanceof ccg0) {
            ccg0Var = (ccg0) x1bVar;
            int i = ccg0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ccg0Var.c = i - Integer.MIN_VALUE;
            } else {
                ccg0Var = new ccg0(this, x1bVar);
            }
        } else {
            ccg0Var = new ccg0(this, x1bVar);
        }
        Object obj = ccg0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ccg0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            ccg0Var.c = 1;
            objA = this.a.a(str, ccg0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
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
            return l9c.a((TournamentGroupsResponseDto) objA);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, x1b x1bVar) {
        dcg0 dcg0Var;
        Object objB;
        if (x1bVar instanceof dcg0) {
            dcg0Var = (dcg0) x1bVar;
            int i = dcg0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dcg0Var.c = i - Integer.MIN_VALUE;
            } else {
                dcg0Var = new dcg0(this, x1bVar);
            }
        } else {
            dcg0Var = new dcg0(this, x1bVar);
        }
        Object obj = dcg0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = dcg0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            dcg0Var.c = 1;
            objB = this.a.b(str, dcg0Var);
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
            return l9c.b((TournamentKnockoutsResponseDto) objB);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }
}
