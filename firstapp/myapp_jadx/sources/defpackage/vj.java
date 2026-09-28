package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.widgets.SpecificCountryMobileEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.fragment.AddNewMobileNumberDialogFragment$initViewModel$1$2", f = "AddNewMobileNumberDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vj extends tje0 implements Function2<bk, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(pj pjVar, v1b<? super vj> v1bVar) {
        super(2, v1bVar);
        this.b = pjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vj vjVar = new vj(this.b, v1bVar);
        vjVar.a = obj;
        return vjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bk bkVar, v1b<? super Unit> v1bVar) {
        return ((vj) create(bkVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        bk bkVar = (bk) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        pj pjVar = this.b;
        zui zuiVar = pjVar.y;
        if (zuiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        zuiVar.i.setText(bkVar.getNumber());
        if (bkVar instanceof bk.a) {
            zui zuiVar2 = pjVar.y;
            if (zuiVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar2.i.setErrorText(null);
            zui zuiVar3 = pjVar.y;
            if (zuiVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar3.i.setHintText(null);
            zui zuiVar4 = pjVar.y;
            if (zuiVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar4.b.setEnabled(false);
        } else if (bkVar instanceof bk.b) {
            zui zuiVar5 = pjVar.y;
            if (zuiVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar5.i.setErrorText(null);
            zui zuiVar6 = pjVar.y;
            if (zuiVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar6.i.setHintText(null);
            zui zuiVar7 = pjVar.y;
            if (zuiVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar7.b.setEnabled(true);
        } else if (bkVar instanceof bk.c) {
            zui zuiVar8 = pjVar.y;
            if (zuiVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            SpecificCountryMobileEditText specificCountryMobileEditText = zuiVar8.i;
            ResourceUiText resourceUiText = ((bk.c) bkVar).b;
            Context contextRequireContext = pjVar.requireContext();
            contextRequireContext.getClass();
            specificCountryMobileEditText.setErrorText(resourceUiText.e(contextRequireContext));
            zui zuiVar9 = pjVar.y;
            if (zuiVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar9.i.setHintText(null);
            zui zuiVar10 = pjVar.y;
            if (zuiVar10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar10.b.setEnabled(false);
        } else {
            if (!(bkVar instanceof bk.d)) {
                uhc.a();
                return null;
            }
            zui zuiVar11 = pjVar.y;
            if (zuiVar11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zuiVar11.i.setErrorText(null);
            zui zuiVar12 = pjVar.y;
            if (zuiVar12 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            SpecificCountryMobileEditText specificCountryMobileEditText2 = zuiVar12.i;
            ResourceUiText resourceUiText2 = ((bk.d) bkVar).b;
            Context contextRequireContext2 = pjVar.requireContext();
            contextRequireContext2.getClass();
            specificCountryMobileEditText2.setHintText(resourceUiText2.e(contextRequireContext2));
        }
        return Unit.a;
    }
}
