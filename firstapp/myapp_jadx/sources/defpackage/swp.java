package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.addnumber.LNAddNumberViewModel$state$1", f = "LNAddNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class swp extends tje0 implements kaj<Boolean, qxp, nwp.a, ijf0, Boolean, v1b<? super mwp>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ nwp.a b;
    public /* synthetic */ ijf0 c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ nwp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swp(nwp nwpVar, v1b<? super swp> v1bVar) {
        super(6, v1bVar);
        this.e = nwpVar;
    }

    @Override // defpackage.kaj
    public final Object f(Boolean bool, qxp qxpVar, nwp.a aVar, ijf0 ijf0Var, Boolean bool2, v1b<? super mwp> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        swp swpVar = new swp(this.e, v1bVar);
        swpVar.a = zBooleanValue;
        swpVar.b = aVar;
        swpVar.c = ijf0Var;
        swpVar.d = zBooleanValue2;
        return swpVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ResourceUiText resourceUiText;
        boolean z = this.a;
        nwp.a aVar = this.b;
        ijf0 ijf0Var = this.c;
        boolean z2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        x0r x0rVar = this.e.d;
        if (x0rVar.e) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_lucky_numbers__add_my_numbers);
        } else {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_lucky_numbers__edit_my_numbers);
        }
        ResourceUiText resourceUiText2 = resourceUiText;
        if (!z) {
            return new mwp.a(resourceUiText2, ijf0Var, z2 ? f8r.c.a : f8r.b.a);
        }
        boolean z3 = aVar.a;
        boolean z4 = aVar.b;
        int i = aVar.e;
        int size = aVar.d.size();
        return new mwp.b(resourceUiText2, z3, z4, aVar.c, (1 > size || size > i) ? f8r.a.a : f8r.b.a, x0rVar.e ? new ResourceUiText(R.string.common_functions__continue) : new ResourceUiText(R.string.page_lucky_numbers__continue_and_edit_name));
    }
}
