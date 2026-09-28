package defpackage;

import com.sportybet.android.router.Sender;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ogm implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ogm(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                Sender[] senderArrValues = Sender.values();
                senderArrValues.getClass();
                return new wag("com.sportybet.android.router.Sender", senderArrValues);
            default:
                return Unit.a;
        }
    }
}
