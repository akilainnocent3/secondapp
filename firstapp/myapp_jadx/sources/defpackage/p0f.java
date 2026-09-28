package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p0f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                gr5 gr5VarA = ((gr5.a) obj2).a();
                Map map = Collections.EMPTY_MAP;
                Uri uri = Uri.parse(str);
                ly0.h(uri, "The uri must be set.");
                new cs5(gr5VarA, new gqc(uri, 0L, 1, null, map, 0L, -1L, str, 0)).a();
                break;
            default:
                ej5.c((v5b) obj2, null, null, new r2y.c((zzr) obj, null), 3);
                break;
        }
        return Unit.a;
    }
}
