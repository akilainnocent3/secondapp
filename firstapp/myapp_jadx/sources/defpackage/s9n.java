package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.ImageLoader$loadImage$2", f = "ImageLoader.kt", l = {61}, m = "invokeSuspend", v = 1)
public final class s9n extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9n(v1b v1bVar, Context context, String str) {
        super(2, v1bVar);
        this.b = str;
        this.c = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s9n(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
        return ((s9n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = this.b;
        if (i == 0) {
            uj50.b(obj);
            Bitmap bitmapB = r9n.a.b(str);
            if (bitmapB != null) {
                return bitmapB;
            }
            this.a = 1;
            obj = r9n.a(this.c, str, this);
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
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            r9n.a.c(str, bitmap);
            return bitmap;
        }
        ib5.a(inm.a("Failed to load image (primary+fallback): ", str));
        return null;
    }
}
