package defpackage;

import com.sportybet.feature.worldcup.WorldCupActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gjb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gjb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zqy) obj).R0();
                break;
            default:
                int i2 = WorldCupActivity.b;
                ((WorldCupActivity) obj).finish();
                break;
        }
        return Unit.a;
    }
}
