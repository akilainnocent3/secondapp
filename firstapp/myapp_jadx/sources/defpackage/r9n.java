package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes7.dex */
public final class r9n {
    public static final s4u<String, Bitmap> a;
    public static final s4u<String, Bitmap> b;

    @c0d(c = "com.sportygames.commons.utils.ImageLoader$loadGenericImage$2", f = "ImageLoader.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, Context context, String str) {
            super(2, v1bVar);
            this.b = str;
            this.c = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.c, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    s4u<String, Bitmap> s4uVar = r9n.b;
                    String str = this.b;
                    Bitmap bitmapB = s4uVar.b(str);
                    if (bitmapB != null) {
                        return bitmapB;
                    }
                    Context context = this.c;
                    if (context == null) {
                        return null;
                    }
                    String strC = op5.c(op5.a, str.concat(":sg_game_name"), "");
                    this.a = 1;
                    obj = r9n.a(context, strC, this);
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
                return (Bitmap) obj;
            } catch (Exception unused) {
            }
        }
    }

    static {
        int iMaxMemory = ((int) (Runtime.getRuntime().maxMemory() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) / 8;
        a = new s4u<>(iMaxMemory);
        b = new s4u<>(iMaxMemory);
    }

    public static Object a(Context context, String str, tje0 tje0Var) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new p9n(null, context, str), tje0Var);
    }

    public static Object b(Context context, String str, x1b x1bVar) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new q9n(null, context, str), x1bVar);
    }

    public static Object c(v1b v1bVar, Context context, String str) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new a(null, context, str), v1bVar);
    }
}
