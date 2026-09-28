package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;

/* JADX INFO: loaded from: classes.dex */
public final class qan implements l730 {
    public static a840 a(pan panVar, Context context, str strVar, yi5 yi5Var) {
        strVar.getClass();
        yi5Var.getClass();
        m9n.a aVar = new m9n.a(context);
        ap8.a aVar2 = new ap8.a();
        final oan oanVar = new oan(strVar, 0);
        aVar2.b(new vmx.a(new Function0() { // from class: nmy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new xu5((Call.Factory) oanVar.invoke());
            }
        }), jq40.a(kmh0.class));
        aVar.c = aVar2.d();
        p4h.b<List<osg0>> bVar = uan.a;
        p4h.b<ltg0.a> bVar2 = abn.a;
        aVar.e.a(abn.a, new s3c.a(r.d.DEFAULT_DRAG_ANIMATION_DURATION));
        if (yi5Var.b().i()) {
            kgt.a aVar3 = kgt.a.b;
            b0d b0dVar = new b0d();
            b0dVar.a = aVar3;
            aVar.d = b0dVar;
        }
        return aVar.a();
    }
}
