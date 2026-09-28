package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class pv70 implements TextWatcher {
    public String a = "";
    public final /* synthetic */ hv70 b;

    @c0d(c = "com.sportygames.lobby.views.fragment.SearchFragment$setSearchInputListener$1$onTextChanged$1", f = "SearchFragment.kt", l = {420}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ dq40<String> b;
        public final /* synthetic */ pv70 c;
        public final /* synthetic */ hv70 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dq40<String> dq40Var, pv70 pv70Var, hv70 hv70Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = dq40Var;
            this.c = pv70Var;
            this.d = hv70Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hv70 hv70Var = this.d;
            HashMap<String, String> map = hv70Var.F;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(300L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            String str = this.b.a;
            pv70 pv70Var = this.c;
            if (!Intrinsics.g(str, pv70Var.a)) {
                return Unit.a;
            }
            if (pv70Var.a.length() >= 3) {
                String str2 = pv70Var.a;
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
                boolean zContainsKey = map.containsKey(lowerCase);
                VM vm = hv70Var.a;
                if (zContainsKey) {
                    jct jctVar = (jct) vm;
                    if (jctVar != null) {
                        String lowerCase2 = pv70Var.a.toLowerCase(locale);
                        lowerCase2.getClass();
                        String str3 = map.get(lowerCase2);
                        if (str3 == null) {
                            str3 = "";
                        }
                        jctVar.D1(str3);
                    }
                } else {
                    jct jctVar2 = (jct) vm;
                    if (jctVar2 != null) {
                        jctVar2.D1(pv70Var.a);
                    }
                }
            } else {
                hv70.d dVar = hv70Var.e;
                if (dVar != null) {
                    dVar.e();
                }
            }
            return Unit.a;
        }
    }

    public pv70(hv70 hv70Var) {
        this.b = hv70Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null || editable.length() == 0) {
            return;
        }
        int i = 0;
        while (i < editable.length() - 1) {
            if (editable.charAt(i) == ' ') {
                int i2 = i + 1;
                if (editable.charAt(i2) == ' ') {
                    editable.delete(i, i2);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Object, java.lang.String] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        dq40 dq40Var = new dq40();
        ?? string = StringsKt.t0(String.valueOf(charSequence)).toString();
        dq40Var.a = string;
        if (Intrinsics.g(string, this.a)) {
            return;
        }
        this.a = (String) dq40Var.a;
        hv70 hv70Var = this.b;
        ej5.c(ebs.a(hv70Var.getLifecycle()), null, null, new a(dq40Var, this, hv70Var, null), 3);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
