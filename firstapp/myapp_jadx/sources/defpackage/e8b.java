package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e8b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e8b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        iny onBackPressedDispatcher;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h8b h8bVar = (h8b) obj;
                g8b g8bVar = new g8b(h8bVar, null);
                e eVar = e.a;
                CountryCodeName countryCodeNameFromCode = CountryCodeName.INSTANCE.fromCode((String) dj5.a(eVar, g8bVar));
                if (countryCodeNameFromCode == CountryCodeName.BRAZIL) {
                    h8bVar.h = new u4c("brl", "R$");
                }
                return x7b.c(countryCodeNameFromCode, (String) dj5.a(eVar, new f8b(h8bVar, null)));
            default:
                kab0 kab0Var = (kab0) obj;
                kab0Var.D0(false);
                androidx.fragment.app.e activity = kab0Var.getActivity();
                if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                    return null;
                }
                onBackPressedDispatcher.d();
                return Unit.a;
        }
    }
}
