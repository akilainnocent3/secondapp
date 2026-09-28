package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c5k implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u4c u4cVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                e5k e5kVar = (e5k) obj2;
                List<CMSResponse> list = (List) obj;
                ArrayList arrayListA = kw5.a(list);
                for (CMSResponse cMSResponse : list) {
                    String key = cMSResponse.getKey();
                    String value = cMSResponse.getValue();
                    if (key == null || value == null) {
                        u4cVar = null;
                    } else {
                        Locale locale = Locale.ROOT;
                        String lowerCase = key.toLowerCase(locale);
                        lowerCase.getClass();
                        String lowerCase2 = e5kVar.b.getCountryCode().getCode().toLowerCase(locale);
                        lowerCase2.getClass();
                        if (!StringsKt.U(lowerCase2) && c.k(lowerCase, "__".concat(lowerCase2), false)) {
                            lowerCase = StringsKt.c0(lowerCase, "__".concat(lowerCase2));
                        }
                        u4cVar = new u4c(lowerCase, value);
                    }
                    if (u4cVar != null) {
                        arrayListA.add(u4cVar);
                    }
                }
                return arrayListA;
            case 1:
                uyt uytVar = (uyt) ((uf00) obj2).get(((Integer) obj).intValue());
                return uytVar instanceof uyt.h ? ((uyt.h) uytVar).a.getClass().getName() : uytVar.getClass().getName();
            default:
                String str = (String) obj;
                str.getClass();
                ((kab0) obj2).r0(str);
                return Unit.a;
        }
    }
}
