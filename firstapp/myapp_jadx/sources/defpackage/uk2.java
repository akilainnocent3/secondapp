package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.adapters.BetConfigAdapter$addGlowOnSpecificItem$1", f = "BetConfigAdapter.kt", l = {135}, m = "invokeSuspend", v = 1)
public final class uk2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ImageView a;
    public int b;
    public final /* synthetic */ tk2 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk2(tk2 tk2Var, int i, v1b<? super uk2> v1bVar) {
        super(2, v1bVar);
        this.c = tk2Var;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uk2(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uk2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            tk2 tk2Var = this.c;
            RecyclerView recyclerView = tk2Var.c;
            RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(this.d));
            d0VarQ.getClass();
            ImageView imageView2 = ((tk2.a) d0VarQ).a.d;
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = tk2Var.b;
            this.a = imageView2;
            this.b = 1;
            obj = r9n.c(this, context, "multiplier_glow_webp");
            if (obj == y5bVar) {
                return y5bVar;
            }
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
