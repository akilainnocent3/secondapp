package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.buildandgo.FeaturedInstantVirtualView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class at3 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jt3.c((hs3) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                return FeaturedInstantVirtualView.b((FeaturedInstantVirtualView) obj3, (a) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ at3(FeaturedInstantVirtualView featuredInstantVirtualView) {
        this.b = featuredInstantVirtualView;
    }
}
