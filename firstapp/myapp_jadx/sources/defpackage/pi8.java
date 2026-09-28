package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.bookingcode.presentation.activity.CustomCodeComposeUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pi8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pi8(a.i iVar, e eVar) {
        this.a = 0;
        this.b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a.i) obj).e.invoke();
                return Unit.a;
            case 1:
                return CustomCodeComposeUtil.k((CustomCodeComposeUtil) obj);
            default:
                ((ytw) obj).setValue(null);
                return Unit.a;
        }
    }

    public /* synthetic */ pi8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
