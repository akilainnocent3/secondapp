package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nc10 extends saj implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        str2.getClass();
        h hVar = (h) this.receiver;
        hVar.getClass();
        Object value = hVar.G.getValue();
        vhn vhnVar = value instanceof vhn ? (vhn) value : null;
        if (vhnVar != null) {
            hVar.C1(str2, vhnVar.c);
        }
        return Unit.a;
    }
}
