package defpackage;

import com.sportybet.android.home.MainActivity;
import com.sportygames.pocketrocket.component.BetContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fl2 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ fl2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = BetContainer.R;
                return Unit.a;
            case 1:
                return Unit.a;
            default:
                int i2 = MainActivity.m0;
                return null;
        }
    }
}
