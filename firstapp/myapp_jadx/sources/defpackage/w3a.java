package defpackage;

import com.sportybet.plugin.realsports.data.Outcome;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w3a implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((mmd) obj).getClass();
                int iB = ycv.b(0.0f);
                return new iwo((((long) ycv.b(0.0f)) & 4294967295L) | (((long) iB) << 32));
            default:
                Outcome outcome = (Outcome) obj;
                outcome.getClass();
                String str = outcome.id;
                str.getClass();
                return str;
        }
    }
}
