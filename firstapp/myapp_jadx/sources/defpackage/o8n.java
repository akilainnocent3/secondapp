package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.presentation.util.ImageCaptureUtil$captureGraphicsLayerAndSave$2", f = "ImageCaptureUtil.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o8n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8n(Context context, Bitmap bitmap, String str, String str2, v1b<? super o8n> v1bVar) {
        super(2, v1bVar);
        this.a = context;
        this.b = bitmap;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o8n(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o8n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object bVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        p8n p8nVar = p8n.a;
        Bitmap bitmap = this.b;
        String strA = yk10.a(this.c, ".jpg");
        p8nVar.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", strA);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/" + this.d);
        Context context = this.a;
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            ib5.a("Failed to create media store entry");
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalStateException("Failed to open output stream");
            }
            try {
                if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStreamOpenOutputStream)) {
                    throw new IllegalStateException("Failed to compress bitmap");
                }
                Unit unit = Unit.a;
                outputStreamOpenOutputStream.close();
                bVar = Unit.a;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(outputStreamOpenOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th3);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            return Unit.a;
        }
        context.getContentResolver().delete(uriInsert, null, null);
        throw thA;
    }
}
