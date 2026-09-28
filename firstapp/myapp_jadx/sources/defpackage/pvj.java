package defpackage;

import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.views.fragment.GamesLobbyMainFragment$setSearchTabDetail$2", f = "GamesLobbyMainFragment.kt", l = {913, 922}, m = "invokeSuspend", v = 1)
public final class pvj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GamesLobbyMainFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvj(GamesLobbyMainFragment gamesLobbyMainFragment, v1b<? super pvj> v1bVar) {
        super(2, v1bVar);
        this.b = gamesLobbyMainFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pvj(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pvj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (defpackage.hkd.b(9000, r8) == r0) goto L36;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            r2 = 0
            r3 = 2
            r4 = 1
            com.sportygames.lobby.views.fragment.GamesLobbyMainFragment r5 = r8.b
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L14
            defpackage.uj50.b(r9)
            goto L94
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L1a:
            defpackage.uj50.b(r9)
            goto L2c
        L1e:
            defpackage.uj50.b(r9)
            r8.a = r4
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = defpackage.hkd.b(r6, r8)
            if (r9 != r0) goto L2c
            goto L93
        L2c:
            ck60 r9 = r5.O
            if (r9 == 0) goto L35
            java.lang.String r1 = "search_visited"
            r9.b(r1, r4)
        L35:
            B extends g6i0 r9 = r5.b
            cn80 r9 = (defpackage.cn80) r9
            if (r9 == 0) goto L43
            tp80 r9 = r9.B
            androidx.constraintlayout.widget.ConstraintLayout r9 = r9.a
            r1 = 0
            r9.setVisibility(r1)
        L43:
            B extends g6i0 r9 = r5.b
            cn80 r9 = (defpackage.cn80) r9
            if (r9 == 0) goto L5d
            tp80 r9 = r9.B
            androidx.constraintlayout.widget.ConstraintLayout r9 = r9.a
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L5a
            r2 = 2130772065(0x7f010061, float:1.7147238E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r1, r2)
        L5a:
            r9.startAnimation(r2)
        L5d:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            com.sportygames.commons.SportyGamesManager r1 = com.sportygames.commons.SportyGamesManager.getInstance()
            xnh0 r1 = r1.getUser()
            if (r1 == 0) goto L6f
            java.lang.String r1 = "logged-in"
            goto L71
        L6f:
            java.lang.String r1 = "non logged-in"
        L71:
            java.lang.String r2 = "user_state"
            r9.putString(r2, r1)
            com.sportygames.commons.SportyGamesManager r1 = com.sportygames.commons.SportyGamesManager.getInstance()
            if (r1 == 0) goto L89
            zj60 r1 = r1.getBridge()
            if (r1 == 0) goto L89
            bk60 r1 = (defpackage.bk60) r1
            java.lang.String r2 = "SearchOnboardingViewed"
            r1.a(r2, r9)
        L89:
            r8.a = r3
            r1 = 9000(0x2328, double:4.4466E-320)
            java.lang.Object r8 = defpackage.hkd.b(r1, r8)
            if (r8 != r0) goto L94
        L93:
            return r0
        L94:
            B extends g6i0 r8 = r5.b
            cn80 r8 = (defpackage.cn80) r8
            if (r8 == 0) goto La3
            tp80 r8 = r8.B
            androidx.constraintlayout.widget.ConstraintLayout r8 = r8.a
            r9 = 8
            r8.setVisibility(r9)
        La3:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
