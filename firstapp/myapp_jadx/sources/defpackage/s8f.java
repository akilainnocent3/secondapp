package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.sporty.android.platform.features.loyalty.LoyaltyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s8f implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s8f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj2).floatValue();
                ((m020) obj).a();
                ((aq40) obj3).a = fFloatValue;
                return Unit.a;
            default:
                LoyaltyActivity loyaltyActivity = (LoyaltyActivity) obj3;
                String str = (String) obj;
                Bundle bundle = (Bundle) obj2;
                int i2 = LoyaltyActivity.f;
                str.getClass();
                bnh0 bnh0Var = loyaltyActivity.b;
                if (bnh0Var == null) {
                    Intrinsics.n("urlCreator");
                    throw null;
                }
                Uri uri = Uri.parse(bnh0Var.h(str));
                azm azmVar = loyaltyActivity.c;
                if (azmVar != null) {
                    azmVar.l(uri, bundle);
                    return Unit.a;
                }
                Intrinsics.n("iRouter");
                throw null;
        }
    }
}
