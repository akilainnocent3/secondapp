package defpackage;

import android.widget.FrameLayout;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.activity.HighLiabilityCodeActivity$observeUiEvents$1", f = "HighLiabilityCodeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yjl extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ HighLiabilityCodeActivity b;
    public final /* synthetic */ FrameLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjl(HighLiabilityCodeActivity highLiabilityCodeActivity, FrameLayout frameLayout, v1b<? super yjl> v1bVar) {
        super(2, v1bVar);
        this.b = highLiabilityCodeActivity;
        this.c = frameLayout;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yjl yjlVar = new yjl(this.b, this.c, v1bVar);
        yjlVar.a = obj;
        return yjlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((yjl) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = aVar instanceof a.m;
        FrameLayout frameLayout = this.c;
        HighLiabilityCodeActivity highLiabilityCodeActivity = this.b;
        if (z) {
            y8j fullStoryCommonManager = highLiabilityCodeActivity.getFullStoryCommonManager();
            d9s.a.getClass();
            fullStoryCommonManager.e(frameLayout, d9s.b);
        }
        e eVar = highLiabilityCodeActivity.c;
        if (eVar != null) {
            eVar.c(aVar, highLiabilityCodeActivity, frameLayout, null);
            return Unit.a;
        }
        Intrinsics.n("commonUiEventProcessor");
        throw null;
    }
}
