package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModelKt$buildTimeBadgeFlow$4", f = "LeaderboardViewModel.kt", l = {213}, m = "invokeSuspend", v = 2)
public final class m2s extends tje0 implements Function2<myh<? super UiText>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2s(long j, v1b<? super m2s> v1bVar) {
        super(2, v1bVar);
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m2s m2sVar = new m2s(this.c, v1bVar);
        m2sVar.b = obj;
        return m2sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super UiText> myhVar, v1b<? super Unit> v1bVar) {
        return ((m2s) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Object[] objArr = {bwf0.n(this.c)};
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__challenge_time_ends_at, ay0.S(objArr));
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
