package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModelKt$buildTimeBadgeFlow$2", f = "LeaderboardViewModel.kt", l = {195}, m = "invokeSuspend", v = 2)
public final class k2s extends tje0 implements Function2<myh<? super UiText>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k2s k2sVar = new k2s(2, v1bVar);
        k2sVar.b = obj;
        return k2sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super UiText> myhVar, v1b<? super Unit> v1bVar) {
        return ((k2s) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__challenge_time_end);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(resourceUiText, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
