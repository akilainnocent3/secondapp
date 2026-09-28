package defpackage;

import com.sportybet.roomcache.SportyBetCacheDB_Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ybb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ybb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgb) obj).U2("");
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(x8u.e.a);
                return Unit.a;
            default:
                return new qlg((SportyBetCacheDB_Impl) obj);
        }
    }
}
