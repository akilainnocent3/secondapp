package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.adapters.BetHistoryConfigAdapter$BetConfigListViewHolder$bind$1", f = "BetHistoryConfigAdapter.kt", l = {52}, m = "invokeSuspend", v = 1)
public final class gq2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hq2 b;
    public final /* synthetic */ hq2.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq2(hq2 hq2Var, hq2.a aVar, v1b<? super gq2> v1bVar) {
        super(2, v1bVar);
        this.b = hq2Var;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gq2(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gq2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Context context = this.b.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s4u<String, Bitmap> s4uVar = r9n.a;
            this.a = 1;
            obj = r9n.c(this, context, "multiplier_background_png");
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.c.a.c.setBackground(new BitmapDrawable(context.getResources(), (Bitmap) obj));
        return Unit.a;
    }
}
