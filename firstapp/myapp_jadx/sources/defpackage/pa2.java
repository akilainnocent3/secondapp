package defpackage;

import com.sportybet.roomcache.SportyBetCacheDB_Impl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pa2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) ((ytw) obj).getValue();
                if (urrVar != null) {
                    return urrVar;
                }
                zkn.d("Required value was null.");
                fkd.a();
                return null;
            default:
                return new khb0((SportyBetCacheDB_Impl) obj);
        }
    }
}
