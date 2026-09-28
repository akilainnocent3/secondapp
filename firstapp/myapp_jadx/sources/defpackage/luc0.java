package defpackage;

import android.widget.TextView;
import androidx.media3.exoplayer.d;
import com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment$updatePlayerTime$1", f = "SportyNewsVideoDetailFragment.kt", l = {612}, m = "invokeSuspend", v = 2)
public final class luc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SportyNewsVideoDetailFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luc0(SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment, v1b<? super luc0> v1bVar) {
        super(2, v1bVar);
        this.c = sportyNewsVideoDetailFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        luc0 luc0Var = new luc0(this.c, v1bVar);
        luc0Var.b = obj;
        return luc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((luc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        while (w5b.e(v5bVar)) {
            SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = this.c;
            d dVar = sportyNewsVideoDetailFragment.B;
            if (dVar == null) {
                Intrinsics.n("exoPlayer");
                throw null;
            }
            long jE0 = dVar.e0();
            d dVar2 = sportyNewsVideoDetailFragment.B;
            if (dVar2 == null) {
                Intrinsics.n("exoPlayer");
                throw null;
            }
            long jY0 = dVar2.y0();
            TextView textView = sportyNewsVideoDetailFragment.E;
            if (textView == null) {
                Intrinsics.n("currentTimeTextView");
                throw null;
            }
            textView.setText(SportyNewsVideoDetailFragment.m0(jE0));
            TextView textView2 = sportyNewsVideoDetailFragment.F;
            if (textView2 == null) {
                Intrinsics.n("totalDurationTextView");
                throw null;
            }
            textView2.setText(SportyNewsVideoDetailFragment.m0(jY0));
            this.b = v5bVar;
            this.a = 1;
            if (hkd.b(1000L, this) == y5bVar) {
                return y5bVar;
            }
        }
        return Unit.a;
    }
}
