package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function0;
import okhttp3.Call;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oan implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oan(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object obj2 = ((str) obj).get();
                obj2.getClass();
                return (Call.Factory) obj2;
            default:
                return gr0.a(((ngw) obj).a(), R.drawable.spr_ic_locked);
        }
    }
}
