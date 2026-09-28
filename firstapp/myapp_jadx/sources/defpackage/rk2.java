package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.adapters.BetConfigAdapter$BetConfigListViewHolder$bind$1", f = "BetConfigAdapter.kt", l = {70, 71, 73}, m = "invokeSuspend", v = 1)
public final class rk2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ImageView a;
    public int b;
    public final /* synthetic */ tk2.a c;
    public final /* synthetic */ tk2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk2(tk2.a aVar, tk2 tk2Var, v1b<? super rk2> v1bVar) {
        super(2, v1bVar);
        this.c = aVar;
        this.d = tk2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rk2(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rk2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        ImageView imageView2;
        Object objC;
        ImageView imageView3;
        Context context = this.d.b;
        wk2 wk2Var = this.c.a;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            imageView = wk2Var.b;
            s4u<String, Bitmap> s4uVar = r9n.a;
            this.a = imageView;
            this.b = 1;
            obj = r9n.c(this, context, "crown_webp");
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            imageView = this.a;
            uj50.b(obj);
        } else {
            if (i == 2) {
                uj50.b(obj);
                imageView2 = wk2Var.c;
                s4u<String, Bitmap> s4uVar2 = r9n.a;
                this.a = imageView2;
                this.b = 3;
                objC = r9n.c(this, context, "multiplier_background_png");
                if (objC != y5bVar) {
                    obj = objC;
                    imageView3 = imageView2;
                }
                return y5bVar;
            }
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageView3 = this.a;
            uj50.b(obj);
        }
        imageView3.setImageBitmap((Bitmap) obj);
        return Unit.a;
        imageView.setImageBitmap((Bitmap) obj);
        this.a = null;
        this.b = 2;
        if (hkd.b(100L, this) != y5bVar) {
            imageView2 = wk2Var.c;
            s4u<String, Bitmap> s4uVar3 = r9n.a;
            this.a = imageView2;
            this.b = 3;
            objC = r9n.c(this, context, "multiplier_background_png");
            if (objC != y5bVar) {
                obj = objC;
                imageView3 = imageView2;
                imageView3.setImageBitmap((Bitmap) obj);
                return Unit.a;
            }
        }
        return y5bVar;
    }
}
