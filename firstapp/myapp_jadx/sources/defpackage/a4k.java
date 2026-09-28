package defpackage;

import android.view.View;
import com.sporty.android.core.model.cms.CMSResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a4k implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a4k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        CMSResponse cMSResponse;
        String key;
        String lowerCase;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        key = ((CMSResponse) next).getKey();
                        String string = StringsKt.t0(str).toString();
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        lowerCase = string.toLowerCase(locale);
                        lowerCase.getClass();
                    } else {
                        next = null;
                    }
                    cMSResponse = (CMSResponse) next;
                    if (cMSResponse != null || cMSResponse.getKey() == null || cMSResponse.getValue() == null) {
                        return null;
                    }
                    String key2 = cMSResponse.getKey();
                    key2.getClass();
                    String value = cMSResponse.getValue();
                    value.getClass();
                    return new u4c(key2, value);
                } while (!Intrinsics.g(key, lowerCase));
                cMSResponse = (CMSResponse) next;
                return cMSResponse != null ? null : null;
            default:
                ((View) obj).getClass();
                ((kab0) obj2).N0(false);
                return Unit.a;
        }
    }
}
