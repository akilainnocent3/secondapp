package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.adapters.BetConfigAdapter$BetConfigListViewHolder$bind$2$2", f = "BetConfigAdapter.kt", l = {105}, m = "invokeSuspend", v = 1)
public final class sk2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ImageView a;
    public int b;
    public final /* synthetic */ tk2.a c;
    public final /* synthetic */ tk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk2(tk2.a aVar, tk2 tk2Var, v1b<? super sk2> v1bVar) {
        super(2, v1bVar);
        this.c = aVar;
        this.d = tk2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sk2(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sk2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            ImageView imageView2 = this.c.a.d;
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = this.d.b;
            this.a = imageView2;
            this.b = 1;
            Object objC = r9n.c(this, context, "multiplier_glow_webp");
            if (objC == y5bVar) {
                return y5bVar;
            }
            obj = objC;
            imageView = imageView2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageView = this.a;
            uj50.b(obj);
        }
        imageView.setImageBitmap((Bitmap) obj);
        return Unit.a;
    }
}
