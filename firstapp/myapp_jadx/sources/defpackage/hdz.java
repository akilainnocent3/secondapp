package defpackage;

import com.sportygames.sportyherov2.components.OverUnderComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hdz implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hdz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SHKeypadContainer sHKeypadContainer;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj;
                int i2 = OverUnderComponent.b0;
                try {
                    overUnderComponent.o();
                    overUnderComponent.q();
                    sHKeypadContainer = overUnderComponent.R;
                    if (sHKeypadContainer == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                } catch (Exception unused) {
                    overUnderComponent.q();
                    sHKeypadContainer = overUnderComponent.R;
                    if (sHKeypadContainer == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                } catch (Throwable th) {
                    overUnderComponent.q();
                    SHKeypadContainer sHKeypadContainer2 = overUnderComponent.R;
                    if (sHKeypadContainer2 == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                    sHKeypadContainer2.setVisibility(8);
                    overUnderComponent.z = 0;
                    throw th;
                }
                sHKeypadContainer.setVisibility(8);
                overUnderComponent.z = 0;
                return Unit.a;
            default:
                mfb0 mfb0VarE = ((t0k0) obj).d.e("sr:sport:1");
                mfb0VarE.getClass();
                return mfb0VarE;
        }
    }
}
