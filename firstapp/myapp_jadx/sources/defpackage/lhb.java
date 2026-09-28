package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lhb implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ lhb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                map.putAll(mhb.d.c);
                map.putAll(mhb.f);
                return map;
            default:
                return w5b.b();
        }
    }
}
