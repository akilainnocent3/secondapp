package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z8r {
    public static x8r a(a9r.b bVar, String str, String str2, ResourceUiText resourceUiText) {
        boolean zG = Intrinsics.g(str2, str);
        String str3 = null;
        if (!bVar.equals(a9r.c.a)) {
            if (!(bVar instanceof a9r.d)) {
                uhc.a();
                return null;
            }
            str3 = ((a9r.d) bVar).a;
        }
        return new x8r(resourceUiText, str, str3, zG);
    }
}
