package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class edj {
    public final uf00<a> a;

    public static final class a {
        public final ResourceUiText a;
        public final Function1<String, Boolean> b;

        public a(ResourceUiText resourceUiText, Function1 function1) {
            this.a = resourceUiText;
            this.b = function1;
        }
    }

    public edj() {
        StringUiText stringUiText = vch0.a;
        this.a = a4h.a(new a(new ResourceUiText(R.string.component_register__password_rule_minimum_characters, ay0.S(new Object[]{8})), new adj()), new a(new ResourceUiText(R.string.component_register__password_rule_maximum_characters, ay0.S(new Object[]{64})), new bdj()), new a(new ResourceUiText(R.string.component_register__password_rule_one_number), new cdj(0)), new a(new ResourceUiText(R.string.component_register__password_rule_one_uppercase_character), new o9a(1)), new a(new ResourceUiText(R.string.component_register__password_rule_one_lowercase_character), new ddj()));
    }

    public final uf00<xvz> a(String str) {
        str.getClass();
        uf00<a> uf00Var = this.a;
        ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
        for (a aVar : uf00Var) {
            arrayList.add(new xvz(aVar.a, "", aVar.b.invoke(str).booleanValue()));
        }
        return a4h.f(arrayList);
    }
}
