package defpackage;

import androidx.viewpager.widget.ViewPager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.NotificationResponse;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mvj implements ViewPager.i {
    public final /* synthetic */ LoadingState<HTTPResponse<List<NotificationResponse>>> a;
    public final /* synthetic */ GamesLobbyMainFragment b;

    @c0d(c = "com.sportygames.lobby.views.fragment.GamesLobbyMainFragment$getNotificationData$1$2$onPageSelected$1", f = "GamesLobbyMainFragment.kt", l = {374}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ GamesLobbyMainFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GamesLobbyMainFragment gamesLobbyMainFragment, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = gamesLobbyMainFragment;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1600L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            cn80 cn80Var = (cn80) this.b.b;
            if (cn80Var != null) {
                cn80Var.v.setCurrentItem(0, false);
            }
            return Unit.a;
        }
    }

    public mvj(LoadingState<HTTPResponse<List<NotificationResponse>>> loadingState, GamesLobbyMainFragment gamesLobbyMainFragment) {
        this.a = loadingState;
        this.b = gamesLobbyMainFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void N0(int i) {
        List<NotificationResponse> data;
        HTTPResponse<List<NotificationResponse>> data2 = this.a.getData();
        if (i == ((data2 == null || (data = data2.getData()) == null) ? -1 : data.size())) {
            GamesLobbyMainFragment gamesLobbyMainFragment = this.b;
            jct jctVar = gamesLobbyMainFragment.f;
            if (jctVar != null) {
                ej5.c(o8i0.d(jctVar), null, null, new a(gamesLobbyMainFragment, null), 3);
            } else {
                Intrinsics.n("viewModelLobby");
                throw null;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void K0(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void H(float f, int i, int i2) {
    }
}
