package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.bio.EditBioViewModel$buildUI$1", f = "EditBioViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gof extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ jof b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gof(v1b v1bVar, jof jofVar, String str) {
        super(2, v1bVar);
        this.a = str;
        this.b = jofVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gof(v1bVar, this.b, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gof) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        String strK = wae0.K(100, str);
        int length = strK.length();
        ijf0 ijf0Var = new ijf0(strK, vlf0.a(length, length), 4);
        Regex regex = jof.i;
        wwd0 wwd0Var = this.b.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, fof.a((fof) value, ijf0Var, jof.z1(100, strK), 17)));
        return Unit.a;
    }
}
