package defpackage;

import android.content.Intent;
import com.sportybet.feature.remixbet.presentation.RemixBetActivity;
import com.sportybet.feature.remixbet.presentation.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.presentation.RemixBetActivity$observeUiEvents$1", f = "RemixBetActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r350 extends tje0 implements Function2<c, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ RemixBetActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r350(RemixBetActivity remixBetActivity, v1b<? super r350> v1bVar) {
        super(2, v1bVar);
        this.b = remixBetActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r350 r350Var = new r350(this.b, v1bVar);
        r350Var.a = obj;
        return r350Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c cVar, v1b<? super Unit> v1bVar) {
        return ((r350) create(cVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        c cVar = (c) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = RemixBetActivity.d;
        boolean z = cVar instanceof c.b;
        RemixBetActivity remixBetActivity = this.b;
        if (z) {
            remixBetActivity.finish();
        } else {
            if (!(cVar instanceof c.a)) {
                uhc.a();
                return null;
            }
            remixBetActivity.setResult(-1, new Intent().putExtra("extra_remix_bet_share_code", ((c.a) cVar).a));
            remixBetActivity.finish();
        }
        return Unit.a;
    }
}
