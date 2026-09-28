package defpackage;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ry0 implements uih {
    public final kmh0 a;
    public final u2z b;

    public static final class a implements uih.a<kmh0> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            kmh0 kmh0Var = (kmh0) obj;
            Bitmap.Config[] configArr = vsh0.a;
            if (Intrinsics.g(kmh0Var.c, "file") && Intrinsics.g(CollectionsKt.firstOrNull(tl9.d(kmh0Var)), "android_asset")) {
                return new ry0(kmh0Var, u2zVar);
            }
            return null;
        }
    }

    public ry0(kmh0 kmh0Var, u2z u2zVar) {
        this.a = kmh0Var;
        this.b = u2zVar;
    }

    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) {
        String strA0 = CollectionsKt.a0(CollectionsKt.O(tl9.d(this.a), 1), "/", null, null, null, 62);
        u2z u2zVar = this.b;
        dqa0 dqa0Var = new dqa0(new y740(tmy.c(u2zVar.a.getAssets().open(strA0))), u2zVar.f, new py0(strA0));
        String mimeTypeFromExtension = null;
        if (!StringsKt.U(strA0)) {
            String strQ0 = StringsKt.q0('?', StringsKt.q0('#', strA0));
            String strL0 = StringsKt.l0('.', StringsKt.l0('/', strQ0, strQ0), "");
            if (!StringsKt.U(strL0)) {
                String lowerCase = strL0.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                mimeTypeFromExtension = (String) hqv.a.get(lowerCase);
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                }
            }
        }
        return new aqa0(dqa0Var, mimeTypeFromExtension, bqc.c);
    }
}
