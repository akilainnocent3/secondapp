package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.book.domain.entity.Selection;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class th2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ th2(d dVar, Selection selection, Function0 function0, int i) {
        this.d = dVar;
        this.e = selection;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(this.c | 1);
                uh2.a((d) this.d, (Selection) this.e, this.b, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(this.c | 1);
                r8z.c((BetBuilderInRound) this.d, this.b, (ytw) this.e, (a) obj, iA2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ th2(BetBuilderInRound betBuilderInRound, Function0 function0, ytw ytwVar, int i) {
        this.d = betBuilderInRound;
        this.b = function0;
        this.e = ytwVar;
        this.c = i;
    }
}
