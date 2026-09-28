package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.showoff.InstantVirtualShowOffDialogFragment$saveBitmapToInternalStorage$2", f = "InstantVirtualShowOffDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f6o extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ File a;
    public final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6o(File file, Bitmap bitmap, v1b<? super f6o> v1bVar) {
        super(2, v1bVar);
        this.a = file;
        this.b = bitmap;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f6o(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f6o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws IOException {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        FileOutputStream fileOutputStream = new FileOutputStream(this.a);
        Bitmap bitmap = this.b;
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            bitmap.recycle();
            Unit unit = Unit.a;
            fileOutputStream.close();
            return Unit.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ft7.a(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
