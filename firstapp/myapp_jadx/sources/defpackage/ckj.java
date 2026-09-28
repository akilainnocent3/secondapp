package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.adapters.GameLimitAdapter$BetConfigListViewHolder$bind$1", f = "GameLimitAdapter.kt", l = {50}, m = "invokeSuspend", v = 1)
public final class ckj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dkj b;
    public final /* synthetic */ dkj.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckj(dkj dkjVar, dkj.a aVar, v1b<? super ckj> v1bVar) {
        super(2, v1bVar);
        this.b = dkjVar;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ckj(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ckj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        this.c.a.d.setBackground(new BitmapDrawable(context.getResources(), (Bitmap) obj));
        return Unit.a;
    }
}
