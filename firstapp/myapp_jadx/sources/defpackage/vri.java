package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.realsports.event.widget.LiveEventControlsHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vri implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vri(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kl00 kl00Var = (kl00) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                SprThrowable sprThrowable = (SprThrowable) (!(th instanceof SprThrowable) ? null : th);
                String str = kl00Var.a;
                g08 g08Var = g08.UNKNOWN;
                return new qqi.d(new z7a0.b(str, null, sprThrowable != null ? Integer.valueOf(sprThrowable.getD()) : null, sprThrowable != null ? sprThrowable.getE() : null, th, 10));
            case 1:
                mkg mkgVar = (mkg) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = LiveEventControlsHeaderView.f;
                if (zBooleanValue) {
                    iym iymVarF1 = mkgVar.a.F1();
                    PageMeta.INSTANCE.getClass();
                    iymVarF1.f(AnalyticsEvent.EVENT_DETAIL_FM_ICON_CLICK, PageMeta.Companion.a());
                }
                return Unit.a;
            default:
                return Boolean.valueOf(Intrinsics.g(((r8h) obj).a, (j3a0) obj2));
        }
    }
}
