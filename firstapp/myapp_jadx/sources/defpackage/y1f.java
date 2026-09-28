package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingKickPointSelectingCountdownHandlerImpl$init$1", f = "DoubleOrNothingKickPointSelectingCountdownHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y1f extends tje0 implements iaj<m4f, Boolean, Float, v1b<? super q5f>, Object> {
    public /* synthetic */ m4f a;
    public /* synthetic */ boolean b;
    public /* synthetic */ float c;

    @Override // defpackage.iaj
    public final Object d(m4f m4fVar, Boolean bool, Float f, v1b<? super q5f> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        float fFloatValue = f.floatValue();
        y1f y1fVar = new y1f(4, v1bVar);
        y1fVar.a = m4fVar;
        y1fVar.b = zBooleanValue;
        y1fVar.c = fFloatValue;
        return y1fVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        m4f m4fVar = this.a;
        boolean z = this.b;
        float f = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!Intrinsics.g(m4fVar, m4f.d.a) || !z) {
            return q5f.c;
        }
        StringUiText stringUiText = vch0.a;
        return new q5f(new ResourceUiText(R.string.page_instant_virtual__don_choose_where_to_attack), f.d(f, 0.0f, 1.0f));
    }
}
