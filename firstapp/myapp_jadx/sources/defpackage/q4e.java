package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$depositableStateFlow$1", f = "DepositOtherBanksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q4e extends tje0 implements jaj<ncx, jw1, String, lod, v1b<? super Boolean>, Object> {
    public /* synthetic */ ncx a;
    public /* synthetic */ jw1 b;
    public /* synthetic */ String c;
    public /* synthetic */ lod d;
    public final /* synthetic */ f5e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4e(f5e f5eVar, v1b<? super q4e> v1bVar) {
        super(5, v1bVar);
        this.e = f5eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a300.g gVar = this.e.u0;
        ncx ncxVar = this.a;
        jw1 jw1Var = this.b;
        String str = this.c;
        lod lodVar = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (ncxVar.b) {
            return Boolean.FALSE;
        }
        if (jw1Var == null) {
            return Boolean.FALSE;
        }
        CountryCodeName countryCodeName = gVar.a;
        int[] iArr = a300.g.a.a;
        int i = iArr[countryCodeName.ordinal()];
        int i2 = iArr[gVar.a.ordinal()];
        int length = str.length();
        if (1 > length || length > 10) {
            return Boolean.FALSE;
        }
        return !Intrinsics.g(lodVar, lod.e.a) ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override // defpackage.jaj
    public final Object l(ncx ncxVar, jw1 jw1Var, String str, lod lodVar, v1b<? super Boolean> v1bVar) {
        q4e q4eVar = new q4e(this.e, v1bVar);
        q4eVar.a = ncxVar;
        q4eVar.b = jw1Var;
        q4eVar.c = str;
        q4eVar.d = lodVar;
        return q4eVar.invokeSuspend(Unit.a);
    }
}
