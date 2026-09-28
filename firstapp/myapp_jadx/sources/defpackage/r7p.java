package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class r7p implements uih {
    public final kmh0 a;
    public final u2z b;

    public static final class a implements uih.a<kmh0> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            kmh0 kmh0Var = (kmh0) obj;
            if (Intrinsics.g(kmh0Var.c, "jar:file")) {
                return new r7p(kmh0Var, u2zVar);
            }
            return null;
        }
    }

    public r7p(kmh0 kmh0Var, u2z u2zVar) {
        this.a = kmh0Var;
        this.b = u2zVar;
    }

    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) {
        kmh0 kmh0Var = this.a;
        String str = kmh0Var.e;
        if (str == null) {
            str = "";
        }
        int iS = StringsKt.S(str, '!', 0, 6);
        String mimeTypeFromExtension = null;
        if (iS == -1) {
            dmy.a(kmh0Var, "Invalid jar:file URI: ");
            return null;
        }
        String str2 = cxz.b;
        cxz cxzVarA = cxz.a.a(str.substring(0, iS));
        cxz cxzVarA2 = cxz.a.a(str.substring(iS + 1, str.length()));
        blh blhVar = this.b.f;
        blhVar.getClass();
        dkh dkhVarA = obn.a(cxzVarA2, ick0.c(cxzVarA, blhVar, new dck0()), null, null, 28);
        String strL0 = StringsKt.l0('.', cxzVarA2.b(), "");
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
