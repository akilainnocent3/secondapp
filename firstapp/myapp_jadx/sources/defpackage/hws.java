package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.realsports.widget.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.fragment.LoadCodeFragment$initLoadCodeViewModel$4", f = "LoadCodeFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hws extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ iws b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hws(iws iwsVar, v1b<? super hws> v1bVar) {
        super(2, v1bVar);
        this.b = iwsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hws hwsVar = new hws(this.b, v1bVar);
        hwsVar.a = obj;
        return hwsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
        return ((hws) create(uiText, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String string;
        UiText uiText = (UiText) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        iws iwsVar = this.b;
        cwi cwiVar = iwsVar.H;
        if (cwiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ClearEditText clearEditText = cwiVar.c;
        if (uiText != null) {
            Context contextRequireContext = iwsVar.requireContext();
            contextRequireContext.getClass();
            string = uiText.e(contextRequireContext).toString();
        } else {
            string = null;
        }
        clearEditText.setError(string);
        cwi cwiVar2 = iwsVar.H;
        if (cwiVar2 != null) {
            cwiVar2.b.setActivated(uiText != null);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
