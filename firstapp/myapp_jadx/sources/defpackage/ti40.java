package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.event.comment.RecommendCodeShareBetImageProcessor$getShareImageBitmap$2", f = "RecommendCodeShareBetImageProcessor.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ti40 extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti40(Context context, Uri uri, v1b<? super ti40> v1bVar) {
        super(2, v1bVar);
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ti40 ti40Var = new ti40(this.b, this.c, v1bVar);
        ti40Var.a = obj;
        return ti40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
        return ((ti40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Context context = this.b;
        Uri uri = this.c;
        try {
            zi50.a aVar = zi50.b;
            int iF = zch0.f(context);
            Bitmap bitmapI = zch0.i(context, uri, iF, true);
            bVar = bitmapI != null ? Bitmap.createBitmap(bitmapI, 0, 0, iF, Math.min(bitmapI.getHeight(), iF)) : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            return null;
        }
        return bVar;
    }
}
