package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.components.KeepGettingExtraCashoutStripKt$KeepGettingExtraCashoutStrip$1$1", f = "KeepGettingExtraCashoutStrip.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ilp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilp(boolean z, SharedPreferences sharedPreferences, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, v1b<? super ilp> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = sharedPreferences;
        this.c = ytwVar;
        this.d = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ilp(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ilp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a) {
            ytw<Boolean> ytwVar = this.c;
            if (!ytwVar.getValue().booleanValue()) {
                Boolean bool = Boolean.TRUE;
                ytwVar.setValue(bool);
                this.d.setValue(bool);
                SharedPreferences sharedPreferences = this.b;
                if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("sporty_cars_keep_getting_extra_cashout_strip_shown", true)) != null) {
                    editorPutBoolean.apply();
                }
            }
        }
        return Unit.a;
    }
}
