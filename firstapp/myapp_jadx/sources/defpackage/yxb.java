package defpackage;

import com.sportybet.android.instantwin.newtork.model.error.AdvancedErrorBody;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class yxb {
    public static final uxb a(int i, String str, String str2) {
        Object bVar;
        str.getClass();
        if (str2 == null) {
            return new uxb.h(str);
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = (AdvancedErrorBody) new eal().e(str2, AdvancedErrorBody.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            return new uxb.h(str);
        }
        AdvancedErrorBody advancedErrorBody = (AdvancedErrorBody) bVar;
        String title = advancedErrorBody.getTitle();
        String message = advancedErrorBody.getMessage();
        if (title == null || StringsKt.U(title) || message == null || StringsKt.U(message)) {
            return new uxb.h(str);
        }
        if (i != 19202) {
            return i != 19400 ? new uxb.h(str) : new uxb.d(str, title, message);
        }
        return new uxb.b(str, title, message);
    }
}
