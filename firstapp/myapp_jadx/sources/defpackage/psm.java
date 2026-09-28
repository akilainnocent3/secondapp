package defpackage;

import android.content.Context;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.service.CountryCodeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public interface psm {

    @c0d(c = "com.sportybet.core.injection.country.ICountryManager$setCurrencyCodeSync$1", f = "ICountryManager.kt", l = {114}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return psm.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (psm.this.T(this.c, this) == y5bVar) {
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

    CMSLanguage A();

    String B();

    List C(ArrayList arrayList);

    Locale D();

    boolean E();

    boolean F();

    boolean G();

    boolean H();

    String I(String str);

    int J();

    @fae
    default void K(String str) {
        dj5.b(new a(str, null));
    }

    int L();

    String M();

    String N(BigDecimal bigDecimal);

    boolean O();

    String P();

    String Q();

    boolean R();

    boolean S();

    Object T(String str, a aVar);

    char U();

    boolean V();

    boolean W();

    int X();

    String Y();

    int Z();

    void a();

    boolean a0();

    String b();

    boolean b0();

    String c();

    int c0();

    String f();

    int g();

    CountryCodeName getCountryCode();

    String getName();

    Object h(CountryCodeName countryCodeName, q57 q57Var);

    boolean i(Context context);

    boolean j();

    String k();

    int l();

    boolean m();

    boolean n();

    boolean o();

    boolean p();

    Integer q();

    boolean r();

    boolean s();

    int t();

    boolean u();

    boolean v();

    CountryCodeName w();

    boolean x();

    boolean y(String str);

    boolean z();
}
