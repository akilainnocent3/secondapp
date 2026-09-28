package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class p8n {
    public static final p8n a = new p8n();

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(Context context, v6l v6lVar, String str, String str2, x1b x1bVar) {
        n8n n8nVar;
        String str3;
        Context context2;
        String str4;
        Bitmap bitmapA;
        Throwable th;
        Bitmap bitmap;
        if (x1bVar instanceof n8n) {
            n8nVar = (n8n) x1bVar;
            int i = n8nVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                n8nVar.i = i - Integer.MIN_VALUE;
            } else {
                n8nVar = new n8n(this, x1bVar);
            }
        } else {
            n8nVar = new n8n(this, x1bVar);
        }
        Object obj = n8nVar.e;
        Object obj2 = y5b.a;
        int i2 = n8nVar.i;
        try {
            try {
                if (i2 == 0) {
                    uj50.b(obj);
                    n8nVar.a = context;
                    n8nVar.b = str;
                    n8nVar.c = str2;
                    n8nVar.i = 1;
                    Object objI = v6lVar.i(n8nVar);
                    if (objI != obj2) {
                        str3 = str2;
                        context2 = context;
                        obj = objI;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bitmap = n8nVar.d;
                    try {
                        uj50.b(obj);
                        zi50.a aVar = zi50.b;
                        Unit unit = Unit.a;
                        bitmap.recycle();
                        return unit;
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap.recycle();
                        throw th;
                    }
                }
                String str5 = n8nVar.c;
                str = n8nVar.b;
                Context context3 = n8nVar.a;
                uj50.b(obj);
                str3 = str5;
                context2 = context3;
                pfd pfdVar = fse.a;
                odd oddVar = odd.b;
                o8n o8nVar = new o8n(context2, bitmapA, str4, str3, null);
                n8nVar.a = null;
                n8nVar.b = null;
                n8nVar.c = null;
                n8nVar.d = bitmapA;
                n8nVar.i = 2;
                if (ej5.d(oddVar, o8nVar, n8nVar) != obj2) {
                    bitmap = bitmapA;
                    zi50.a aVar2 = zi50.b;
                    Unit unit2 = Unit.a;
                    bitmap.recycle();
                    return unit2;
                }
                return obj2;
            } catch (Throwable th3) {
                th = th3;
                bitmap = bitmapA;
                bitmap.recycle();
                throw th;
            }
            str4 = str;
            bitmapA = w70.a((c8n) obj);
        } catch (Exception e) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(e);
        }
    }
}
