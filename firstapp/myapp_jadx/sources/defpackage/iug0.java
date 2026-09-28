package defpackage;

import com.sporty.android.core.model.cms.CMSLanguage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iug0 {
    public final mgb0 a;

    public iug0(mgb0 mgb0Var) {
        mgb0Var.getClass();
        this.a = mgb0Var;
    }

    public final hug0 a() {
        String languageCode = this.a.getLanguageCode(null);
        if (Intrinsics.g(languageCode, CMSLanguage.PORTUGUESE_BRAZIL.getLanguageCode())) {
            return hug0.e;
        }
        if (Intrinsics.g(languageCode, CMSLanguage.PORTUGUESE_MOZAMBIQUE.getLanguageCode())) {
            return hug0.f;
        }
        if (Intrinsics.g(languageCode, CMSLanguage.SW.getLanguageCode())) {
            return hug0.c;
        }
        if (Intrinsics.g(languageCode, CMSLanguage.FR.getLanguageCode())) {
            return hug0.i;
        }
        return Intrinsics.g(languageCode, CMSLanguage.SPANISH_MX.getLanguageCode()) ? hug0.d : hug0.b;
    }
}
