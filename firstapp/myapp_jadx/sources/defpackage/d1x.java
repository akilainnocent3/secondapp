package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.social.domain.SocialRouter$MySocialCreation;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld1x;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d1x extends c82 {
    public final uga0 d;
    public final cb e;
    public final uqm f;
    public final mgb0 i;
    public final odd v;
    public final SocialRouter$MySocialCreation.Data w;
    public final wwd0 y;
    public final v340 z;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.MySocialCreationViewModel$setUsername$1", f = "MySocialCreationViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d1x b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, d1x d1xVar, String str) {
            super(2, v1bVar);
            this.b = d1xVar;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list;
            int length;
            d1x d1xVar = this.b;
            wwd0 wwd0Var = d1xVar.y;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                k8a0 k8a0Var = (k8a0) wwd0Var.getValue();
                if (k8a0Var instanceof k8a0.c) {
                    list = ((k8a0.c) k8a0Var).c;
                } else {
                    list = k8a0Var instanceof k8a0.e ? ((k8a0.e) k8a0Var).e : m2g.a;
                }
                List list2 = list;
                k8a0 k8a0Var2 = (k8a0) wwd0Var.getValue();
                String str = k8a0Var2 instanceof k8a0.e ? ((k8a0.e) k8a0Var2).f : null;
                String str2 = this.c;
                String str3 = (str == null || !str.equals(str2)) ? null : str;
                d1xVar.e.getClass();
                k8a0.e eVar = new k8a0.e(str2, cb.a(str2), str2 != null && 4 <= (length = str2.length()) && length < 16, str2 != null ? ogx.a("^[a-zA-Z0-9]+$", str2) : false, list2, str3);
                this.a = 1;
                wwd0Var.getClass();
                wwd0Var.k(null, eVar);
                if (Unit.a == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public d1x(vu60 vu60Var, uga0 uga0Var, cb cbVar, uqm uqmVar, mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        Object bVar;
        Object bVar2;
        vu60Var.getClass();
        cbVar.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        this.d = uga0Var;
        this.e = cbVar;
        this.f = uqmVar;
        this.i = mgb0Var;
        this.v = oddVar;
        SocialRouter$MySocialCreation.a.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = (SocialRouter$MySocialCreation.Data) vu60Var.b("arg_my_social_creation_data");
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        SocialRouter$MySocialCreation.Data data = (SocialRouter$MySocialCreation.Data) (bVar instanceof zi50.b ? null : bVar);
        if (data == null) {
            SocialRouter$MySocialCreation.Data.INSTANCE.getClass();
            data = SocialRouter$MySocialCreation.Data.EMPTY;
        }
        this.w = data;
        wwd0 wwd0VarA = xwd0.a(k8a0.d.a);
        this.y = wwd0VarA;
        this.z = e1i.b(wwd0VarA);
        try {
            String username = data.getUsername();
            username = username == null ? "" : username;
            Locale locale = Locale.US;
            locale.getClass();
            bVar2 = username.toLowerCase(locale);
            bVar2.getClass();
        } catch (Throwable th2) {
            zi50.a aVar3 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        x1((String) (zi50.a(bVar2) == null ? bVar2 : ""));
    }

    public static ResourceUiText y1(Integer num) {
        if (num != null && num.intValue() == 11011) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.personal_page__username_already_taken_title);
        }
        if (num == null || num.intValue() != 11017) {
            return null;
        }
        StringUiText stringUiText2 = vch0.a;
        return new ResourceUiText(R.string.personal_page__username_contains_restricted_words_inline);
    }

    public final void x1(String str) {
        str.getClass();
        ej5.c(o8i0.d(this), null, null, new a(null, this, str), 3);
    }
}
