package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment$progressBarVisibility$1$2", f = "EvenOddFragment.kt", l = {3218}, m = "invokeSuspend", v = 1)
public final class ogg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fgg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogg(fgg fggVar, v1b<? super ogg> v1bVar) {
        super(2, v1bVar);
        this.b = fggVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ogg(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ogg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(150L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        fgg fggVar = this.b;
        jhg jhgVar = (jhg) fggVar.b;
        if (jhgVar != null) {
            jhgVar.W.setVisibility(8);
        }
        jhg jhgVar2 = (jhg) fggVar.b;
        if (jhgVar2 != null) {
            jhgVar2.W.N();
        }
        if (fggVar.w0) {
            SharedPreferences sharedPreferences = fggVar.X;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("EVEN_ODD_MUSIC", true)) : null;
            jhg jhgVar3 = (jhg) fggVar.b;
            if (jhgVar3 != null) {
                ProgressMeterComponent progressMeterComponent = jhgVar3.W;
                ypa0 ypa0VarD0 = fggVar.D0();
                String string = fggVar.getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0VarD0, boolValueOf, string);
            }
            jhg jhgVar4 = (jhg) fggVar.b;
            if (jhgVar4 != null) {
                jhgVar4.e.setVisibility(0);
            }
            if (!fggVar.isRemoving()) {
                if (yju.a("br")) {
                    fggVar.O0(true, new ngg(fggVar, 0));
                } else {
                    fggVar.F0();
                }
            }
        }
        return Unit.a;
    }
}
