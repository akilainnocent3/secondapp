package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$imageLoad$1", f = "FruitHuntBase.kt", l = {2042}, m = "invokeSuspend", v = 1)
public final class o2j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public AppCompatImageView a;
    public int b;
    public final /* synthetic */ n2j c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2j(n2j n2jVar, v1b<? super o2j> v1bVar) {
        super(2, v1bVar);
        this.c = n2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o2j(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o2j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        y5b y5bVar = y5b.a;
        int i = this.b;
        n2j n2jVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            djh djhVar = n2jVar.b;
            if (djhVar != null) {
                AppCompatImageView appCompatImageView2 = djhVar.w.i;
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = n2jVar.getContext();
                this.a = appCompatImageView2;
                this.b = 1;
                Object objC = r9n.c(this, context, "win_wheel_webp");
                if (objC == y5bVar) {
                    return y5bVar;
                }
                obj = objC;
                appCompatImageView = appCompatImageView2;
            }
            n2jVar.E0();
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        appCompatImageView = this.a;
        uj50.b(obj);
        appCompatImageView.setImageBitmap((Bitmap) obj);
        n2jVar.E0();
        return Unit.a;
    }
}
