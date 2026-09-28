package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.FeaturedInstantVirtualView;
import com.sportybet.android.instantwin.presentation.buildandgo.d;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ct3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ct3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(((qcn) obj).size());
            default:
                f fVar = ((FeaturedInstantVirtualView) obj).buildAndGoViewModel;
                if (fVar != null) {
                    fVar.y1(d.m.a);
                }
                return Unit.a;
        }
    }
}
