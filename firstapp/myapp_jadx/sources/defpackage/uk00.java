package defpackage;

import android.util.Pair;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onDeleteCode$1", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uk00 extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ el00 b;
    public final /* synthetic */ kl00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk00(v1b v1bVar, el00 el00Var, kl00 kl00Var) {
        super(2, v1bVar);
        this.b = el00Var;
        this.c = kl00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uk00 uk00Var = new uk00(v1bVar, this.b, this.c);
        uk00Var.a = obj;
        return uk00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
        return ((uk00) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String code;
        String str = this.c.a;
        el00 el00Var = this.b;
        wwd0 wwd0Var = el00Var.B;
        v340 v340Var = el00Var.y;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            if (((Boolean) ((lk50.c) lk50Var).a).booleanValue()) {
                LinkedHashSet linkedHashSetD0 = CollectionsKt.D0((Iterable) wwd0Var.getValue());
                linkedHashSetD0.add(str);
                wwd0Var.getClass();
                wwd0Var.k(null, linkedHashSetD0);
                el00Var.A1((SocialRouter$PersonalSocial.Data) v340Var.a.getValue(), true, false);
            }
        } else if (lk50Var instanceof lk50.a) {
            Pair pair = new Pair("shareCode", str);
            Pair pair2 = new Pair("username", ((SocialRouter$PersonalSocial.Data) v340Var.a.getValue()).getUsername());
            CountryCodeName region = ((SocialRouter$PersonalSocial.Data) v340Var.a.getValue()).getRegion();
            if (region == null || (code = region.getCode()) == null) {
                code = "";
            }
            w950.a("PersonalCodeViewModel", "SocialDeleteShareCodeUseCase.deleteShareCode", ((lk50.a) lk50Var).a, b.k(pair, pair2, new Pair("countryCode", code)));
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
