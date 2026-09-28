package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pkg extends saj implements Function1 {
    public final /* synthetic */ int a = 1;

    public pkg(Object obj) {
        super(1, obj, zyf0.class, "showError", "showError(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                zyf0.d((String) obj);
                break;
            default:
                pdd0 pdd0Var = (pdd0) obj;
                pdd0Var.getClass();
                MatchEventActivity matchEventActivity = (MatchEventActivity) this.receiver;
                int i = MatchEventActivity.a0;
                matchEventActivity.U1(pdd0Var);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pkg(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
