package defpackage;

import android.net.Uri;
import com.sportybet.android.globalpay.pixBtg.deposit.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d710 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d710(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.m.a);
                return Unit.a;
            default:
                List<String> list = ((bnh0) obj).a.b().m;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Uri.parse((String) it.next()).getHost());
                }
                return arrayList;
        }
    }
}
