package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.sportygames.sportyherov2.components.ShMultiplierContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$removeValentine$2", f = "ShMultiplierContainer.kt", l = {971}, m = "invokeSuspend", v = 1)
public final class mu80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ImageView a;
    public int b;
    public final /* synthetic */ ShMultiplierContainer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu80(ShMultiplierContainer shMultiplierContainer, v1b<? super mu80> v1bVar) {
        super(2, v1bVar);
        this.c = shMultiplierContainer;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mu80(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mu80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            ShMultiplierContainer shMultiplierContainer = this.c;
            qu80 binding = shMultiplierContainer.getBinding();
            if (binding != null) {
                ImageView imageView2 = binding.O;
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = shMultiplierContainer.a;
                this.a = imageView2;
                this.b = 1;
                obj = r9n.c(this, context, "militao_idle_png");
                if (obj == y5bVar) {
                    return y5bVar;
                }
                imageView = imageView2;
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        imageView = this.a;
        uj50.b(obj);
        imageView.setImageBitmap((Bitmap) obj);
        return Unit.a;
    }
}
