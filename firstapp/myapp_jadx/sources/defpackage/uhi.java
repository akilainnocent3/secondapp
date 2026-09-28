package defpackage;

import android.content.Intent;
import android.util.Base64;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uhi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uhi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String stringExtra;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                Intent intent = (Intent) obj;
                intent.getClass();
                String stringExtra2 = intent.getStringExtra("eventName");
                if (stringExtra2 != null) {
                    int iHashCode = stringExtra2.hashCode();
                    if (iHashCode != 50613137) {
                        if (iHashCode == 1723581670 && stringExtra2.equals("generateImage") && (stringExtra = intent.getStringExtra("data")) != null) {
                            try {
                                if (!StringsKt.U(stringExtra) && stringExtra.length() % 4 == 0) {
                                    Base64.decode(stringExtra, 0);
                                    function1.invoke(new ebi.j(stringExtra));
                                    function1.invoke(new ebi.d(true, null));
                                } else {
                                    function1.invoke(new ebi.d(false, vbp.b));
                                }
                            } catch (IllegalArgumentException e) {
                                itf0.a.d("Error decoding base64 string: " + e, new Object[0]);
                            }
                        }
                    } else if (stringExtra2.equals("generateShareImageJSReturnNull")) {
                        function1.invoke(new ebi.d(false, vbp.a));
                    }
                }
                break;
            case 1:
                ((n6s) obj2).r.b(((acn) obj).a);
                break;
            case 2:
                m410 m410Var = (m410) obj2;
                String str = (String) obj;
                ixi ixiVar = (ixi) m410Var.b;
                if (ixiVar != null) {
                    ixiVar.L.setVisibility(0);
                }
                m410Var.K0(str);
                break;
            default:
                f450 f450Var = (f450) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                List<w550> list = f450Var != null ? f450Var.c : null;
                if (list == null) {
                    list = m2g.a;
                }
                szrVar.d(list.size(), null, new l550(list), new op8(802480018, new m550(list), true));
                break;
        }
        return Unit.a;
    }
}
