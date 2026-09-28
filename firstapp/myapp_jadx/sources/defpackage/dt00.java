package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class dt00 {
    public final wwd0 a;
    public final b77 b;

    @c0d(c = "com.sportybet.android.account.latam.signup.domain.PhoneValidator$validationResult$1", f = "PhoneValidator.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super UiText>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = dt00.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super UiText> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            str.getClass();
            String string = StringsKt.t0(str).toString();
            string.getClass();
            if (!StringsKt.U(string)) {
                for (int i = 0; i < string.length(); i++) {
                    if (Character.isDigit(string.charAt(i))) {
                    }
                }
                if (string.length() == 10 || string.length() == 11) {
                    return null;
                }
            }
            return new ResourceUiText(R.string.common_feedback__please_enter_a_valid_mobile_number);
        }
    }

    public dt00() {
        wwd0 wwd0VarA = xwd0.a("");
        this.a = wwd0VarA;
        this.b = r0i.d(szh.a(wwd0VarA, 500L), new a(null));
    }
}
