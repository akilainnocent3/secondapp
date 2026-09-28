package defpackage;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class glh implements uih {
    public final kmh0 a;
    public final u2z b;

    public static final class a implements uih.a<kmh0> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            kmh0 kmh0Var = (kmh0) obj;
            String str = kmh0Var.c;
            if ((str != null && !str.equals("file")) || kmh0Var.e == null) {
                return null;
            }
            Bitmap.Config[] configArr = vsh0.a;
            if (Intrinsics.g(kmh0Var.c, "file") && Intrinsics.g(CollectionsKt.firstOrNull(tl9.d(kmh0Var)), "android_asset")) {
                return null;
            }
            return new glh(kmh0Var, u2zVar);
        }
    }

    public glh(kmh0 kmh0Var, u2z u2zVar) {
        this.a = kmh0Var;
        this.b = u2zVar;
    }

    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) {
        String str = cxz.b;
        String strC = tl9.c(this.a);
        String mimeTypeFromExtension = null;
        if (strC == null) {
            ib5.a("filePath == null");
            return null;
        }
        cxz cxzVarA = cxz.a.a(strC);
        dkh dkhVarA = obn.a(cxzVarA, this.b.f, null, null, 28);
        String strL0 = StringsKt.l0('.', cxzVarA.b(), "");
        if (!StringsKt.U(strL0)) {
            String lowerCase = strL0.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            mimeTypeFromExtension = (String) hqv.a.get(lowerCase);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new aqa0(dkhVarA, mimeTypeFromExtension, bqc.c);
    }
}
