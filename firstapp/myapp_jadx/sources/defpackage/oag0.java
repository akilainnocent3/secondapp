package defpackage;

import com.sportygames.campaign.data.model.HeaderPayload;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentKt$Tournament$20$1", f = "Tournament.kt", l = {1603}, m = "invokeSuspend", v = 1)
public final class oag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i96 b;
    public final /* synthetic */ ytw<HeaderPayload> c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ ytw<Boolean> e;
    public final /* synthetic */ b5 f;
    public final /* synthetic */ String i;

    @c0d(c = "com.sportygames.campaign.presentation.TournamentKt$Tournament$20$1$2", f = "Tournament.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ i96 b;
        public final /* synthetic */ ytw<HeaderPayload> c;
        public final /* synthetic */ ytw<Boolean> d;
        public final /* synthetic */ ytw<Boolean> e;
        public final /* synthetic */ b5 f;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i96 i96Var, ytw<HeaderPayload> ytwVar, ytw<Boolean> ytwVar2, ytw<Boolean> ytwVar3, b5 b5Var, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = i96Var;
            this.c = ytwVar;
            this.d = ytwVar2;
            this.e = ytwVar3;
            this.f = b5Var;
            this.i = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            i96 i96Var = this.b;
            i96Var.Q.j(str);
            if (str.length() > 0) {
                HeaderPayload headerPayload = (HeaderPayload) new eal().e(StringsKt.a0(str, "\nuser-name:"), HeaderPayload.class);
                hfs hfsVar = kag0.a;
                ytw<HeaderPayload> ytwVar = this.c;
                ytwVar.setValue(headerPayload);
                this.d.setValue(Boolean.TRUE);
                ytw<Boolean> ytwVar2 = this.e;
                if (ytwVar2.getValue().booleanValue()) {
                    ytwVar2.setValue(Boolean.FALSE);
                    HeaderPayload value = ytwVar.getValue();
                    if (value != null) {
                        String nullableCountry = this.f.getNullableCountry();
                        if (nullableCountry == null) {
                            nullableCountry = "";
                        }
                        String lowerCase = nullableCountry.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        String strB = qhg0.a.b(this.i);
                        if (lowerCase.equals("int")) {
                            lowerCase = "br";
                        }
                        String str2 = lowerCase;
                        Integer id = value.getId();
                        String strValueOf = id != null ? String.valueOf(id.intValue()) : null;
                        String str3 = strValueOf == null ? "" : strValueOf;
                        wzm wzmVar = i96Var.b;
                        jgg0 jgg0Var = jgg0.d;
                        wzm.g(wzmVar, jgg0Var, i96Var.c.a(jgg0Var, str2, 0L, str3, strB));
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oag0(i96 i96Var, ytw<HeaderPayload> ytwVar, ytw<Boolean> ytwVar2, ytw<Boolean> ytwVar3, b5 b5Var, String str, v1b<? super oag0> v1bVar) {
        super(2, v1bVar);
        this.b = i96Var;
        this.c = ytwVar;
        this.d = ytwVar2;
        this.e = ytwVar3;
        this.f = b5Var;
        this.i = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oag0(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            or60 or60VarC = n95.c(new bz30(this.b, 3));
            a aVar = new a(this.b, this.c, this.d, this.e, this.f, this.i, null);
            this.a = 1;
            if (kzh.b(or60VarC, aVar, this) == y5bVar) {
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
