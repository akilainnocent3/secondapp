package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.ImageLoader$fetchBitmapWithFailover$2", f = "ImageLoader.kt", l = {}, m = "invokeSuspend", v = 1)
public final class p9n extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9n(v1b v1bVar, Context context, String str) {
        super(2, v1bVar);
        this.a = str;
        this.b = context;
    }

    public static final Bitmap k(Context context, String str, String str2) {
        try {
            ea50<Bitmap> ea50VarA = a.d(context).k().P(str2).a(new hb50().v(new acy(str)));
            ta50 ta50Var = new ta50();
            ea50VarA.L(ta50Var, ta50Var, ea50VarA, fug.b);
            return (Bitmap) ta50Var.get();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p9n(v1bVar, this.b, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
        return ((p9n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapK;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.a;
        if (StringsKt.U(str)) {
            return null;
        }
        x8n.a.getClass();
        boolean zA = x8n.a();
        Context context = this.b;
        if (!zA) {
            try {
                ea50<Bitmap> ea50VarP = a.d(context).k().P(str);
                ta50 ta50Var = new ta50();
                ea50VarP.L(ta50Var, ta50Var, ea50VarP, fug.b);
                return (Bitmap) ta50Var.get();
            } catch (Exception unused) {
                return null;
            }
        }
        String strE = x8n.e(str);
        String strD = x8n.d(str);
        Bitmap bitmapK2 = k(context, strD, str);
        if (bitmapK2 != null) {
            return bitmapK2;
        }
        if (strE.equals(str) || (bitmapK = k(context, strD, strE)) == null) {
            return null;
        }
        return bitmapK;
    }
}
