package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.a;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bv10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ bv10(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        int i = this.a;
        fragmentG = null;
        Fragment fragmentG = null;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) fragment;
                zy10Var.z0 = false;
                zy10Var.H0();
                zy10Var.s1();
                SharedPreferences sharedPreferences = zy10Var.w;
                Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("ROCKET_MUSIC", true)) : null;
                zt50 zt50Var = zy10Var.b;
                if (zt50Var != null) {
                    ProgressMeterComponent progressMeterComponent = zt50Var.Q;
                    ypa0 ypa0VarA1 = zy10Var.a1();
                    String string = zy10Var.getString(R.string.bg_music);
                    string.getClass();
                    progressMeterComponent.K(ypa0VarA1, boolValueOf, string);
                }
                break;
            default:
                l560 l560Var = (l560) fragment;
                GameDetails gameDetails = l560Var.S;
                wz.a("HTPClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                e activity = l560Var.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    fragmentG = supportFragmentManager.G(R.id.flContent);
                }
                if (!(fragmentG instanceof a)) {
                    l560Var.k1(false, new tm0(2));
                }
                break;
        }
        return Unit.a;
    }
}
