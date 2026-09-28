package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rxu implements ud, paj {
    public final /* synthetic */ MatchEventActivity a;

    public rxu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        z1v z1vVar = (z1v) obj;
        int i = MatchEventActivity.a0;
        a2v a2vVar = z1vVar != null ? z1vVar.a : null;
        int i2 = a2vVar == null ? -1 : MatchEventActivity.a.b[a2vVar.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return;
        }
        MatchEventActivity matchEventActivity = this.a;
        if (i2 == 2) {
            matchEventActivity.N1();
            return;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                matchEventActivity.I1().x1(false);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        a5o.n nVar = new a5o.n(((n4p) matchEventActivity.C1()).c());
        matchEventActivity.S1("next_round");
        matchEventActivity.U1(nVar);
        matchEventActivity.B1();
        i5s.b(matchEventActivity.getAccountHelper(), matchEventActivity, new nxu(matchEventActivity));
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, MatchEventActivity.class, "onMatchEventDetailResultReceived", "onMatchEventDetailResultReceived(Lcom/sportybet/android/instantwin/router/event/MatchEventDetailResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ud) && (obj instanceof paj)) {
            return Intrinsics.g(c(), ((paj) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
