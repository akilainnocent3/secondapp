package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.bio.EditBioViewModel$onBioChange$1", f = "EditBioViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hof extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ jof a;
    public final /* synthetic */ ijf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hof(jof jofVar, ijf0 ijf0Var, v1b<? super hof> v1bVar) {
        super(2, v1bVar);
        this.a = jofVar;
        this.b = ijf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hof(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hof) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jof jofVar = this.a;
        int i = ((fof) jofVar.b.a.getValue()).b;
        ijf0 ijf0VarB = this.b;
        nk0 nk0Var = ijf0VarB.a;
        if (nk0Var.b.length() > i) {
            String strK = wae0.K(i, nk0Var.b);
            int length = strK.length();
            ijf0VarB = ijf0.b(ijf0VarB, strK, vlf0.a(length, length), 4);
        }
        Regex regex = jof.i;
        wwd0 wwd0Var = jofVar.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, fof.a((fof) value, ijf0VarB, jof.z1(i, ijf0VarB.a.b), 21)));
        return Unit.a;
    }
}
