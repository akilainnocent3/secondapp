package defpackage;

import android.graphics.Bitmap;
import androidx.fragment.app.e;
import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.ImageLoader$downloadGenericImage$2", f = "ImageLoader.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class n9n extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9n(String str, e eVar, v1b<? super n9n> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n9n(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
        return ((n9n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        e eVar = this.c;
        String str = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                String strC = op5.c(op5.a, str + ":sg_game_name", "");
                s4u<String, Bitmap> s4uVar = r9n.a;
                this.a = 1;
                obj = r9n.a(eVar, strC, this);
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
                r9n.b.c(str, bitmap);
            }
            if (bitmap != null && bitmap.getByteCount() != 0) {
                return bitmap;
            }
            eVar.finish();
            return bitmap;
        } catch (Exception unused) {
            return null;
        }
    }
}
