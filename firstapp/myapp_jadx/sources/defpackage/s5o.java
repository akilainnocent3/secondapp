package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffDialogFragment$generateBitmapWithPicture$2", f = "InstantVirtualShowOffDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s5o extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
    public final /* synthetic */ Picture a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5o(Picture picture, v1b<? super s5o> v1bVar) {
        super(2, v1bVar);
        this.a = picture;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s5o(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
        return ((s5o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Picture picture = this.a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(picture.getWidth(), picture.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawPicture(new Picture(picture));
        return bitmapCreateBitmap;
    }
}
