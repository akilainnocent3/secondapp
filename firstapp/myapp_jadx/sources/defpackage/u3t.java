package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.components.screens.LobbyV2FeaturedMatchesComponentKt$LobbyV2FeaturedMatchesComponent$1$1", f = "LobbyV2FeaturedMatchesComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class u3t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ibs a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ytw<View> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3t(ibs ibsVar, Fragment fragment, Context context, ytw<View> ytwVar, v1b<? super u3t> v1bVar) {
        super(2, v1bVar);
        this.a = ibsVar;
        this.b = fragment;
        this.c = context;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u3t(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u3t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SportyGamesManager.getInstance().getUserSegmentOnce(new t3t(this.a, this.b, this.c, this.d));
        return Unit.a;
    }
}
