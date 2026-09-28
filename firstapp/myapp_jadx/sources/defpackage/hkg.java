package defpackage;

import android.util.SparseArray;
import com.sportybet.plugin.event.EventActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hkg implements kuj {
    public final Object a;

    public hkg() {
        this.a = new SparseArray();
    }

    @Override // defpackage.kuj
    public void a() {
        EventActivity eventActivity = (EventActivity) this.a;
        int i = EventActivity.U0;
        svj svjVar = eventActivity.Q;
        if (svjVar != null) {
            eventActivity.Z1(svjVar.b(true), true);
        } else {
            Intrinsics.n("gamesLobbyManager");
            throw null;
        }
    }

    @Override // defpackage.kuj
    public void b() {
        EventActivity eventActivity = (EventActivity) this.a;
        eventActivity.o0 = false;
        agd0 agd0Var = eventActivity.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var.d.setGamesActivated(false);
        eventActivity.Z1(null, false);
    }

    public hkg(EventActivity eventActivity) {
        this.a = eventActivity;
    }
}
