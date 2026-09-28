package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.ImageLoader$loadGenericDrawable$2", f = "ImageLoader.kt", l = {91}, m = "invokeSuspend", v = 1)
public final class q9n extends tje0 implements Function2<v5b, v1b<? super BitmapDrawable>, Object> {
    public Context a;
    public int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9n(v1b v1bVar, Context context, String str) {
        super(2, v1bVar);
        this.c = context;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q9n(v1bVar, this.c, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BitmapDrawable> v1bVar) {
        return ((q9n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Context context;
        y5b y5bVar = y5b.a;
        int i = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                Context context2 = this.c;
                if (context2 != null) {
                    s4u<String, Bitmap> s4uVar = r9n.a;
                    String str = this.d;
                    this.a = context2;
                    this.b = 1;
                    Object objC = r9n.c(this, context2, str);
                    if (objC == y5bVar) {
                        return y5bVar;
                    }
                    obj = objC;
                    context = context2;
                }
                return null;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = this.a;
            uj50.b(obj);
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
