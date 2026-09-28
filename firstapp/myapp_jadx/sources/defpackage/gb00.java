package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class gb00 implements Function0<tlw<Object, hmp>> {
    public final /* synthetic */ hb00 a;

    public gb00(hb00 hb00Var) {
        this.a = hb00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final tlw<Object, hmp> invoke() {
        ArrayList arrayList = this.a.a;
        rtw rtwVar = new rtw(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hmp hmpVar = (hmp) arrayList.get(i);
            Object obj = hmpVar.b;
            int i2 = hmpVar.a;
            tlw.a(rtwVar, obj != null ? new v9p(Integer.valueOf(i2), hmpVar.b) : Integer.valueOf(i2), hmpVar);
        }
        return new tlw<>(rtwVar);
    }
}
