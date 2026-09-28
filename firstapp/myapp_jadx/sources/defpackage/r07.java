package defpackage;

import com.sportybet.android.activity.oddsformat.OddsFormatPreferenceActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r07 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r07(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(rw6.h.a);
                return Unit.a;
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            case 2:
                return new gv7(((r4k) obj).a);
            default:
                int i2 = OddsFormatPreferenceActivity.c;
                ((OddsFormatPreferenceActivity) obj).finish();
                return Unit.a;
        }
    }
}
