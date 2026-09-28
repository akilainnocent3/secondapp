package defpackage;

import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import idf.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hdf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hdf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((idf) obj).new a();
            case 1:
                nay.a aVar = nay.j0;
                String string = ((nay) obj).requireArguments().getString("EXTRA_BANK_CODE");
                return string == null ? "" : string;
            case 2:
                int i2 = PreMatchEventActivity.a2;
                ((PreMatchEventActivity) obj).A1();
                return Unit.a;
            default:
                ((b8b0) obj).t0(null);
                return Unit.a;
        }
    }
}
