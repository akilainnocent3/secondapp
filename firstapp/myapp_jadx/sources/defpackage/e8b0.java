package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e8b0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e8b0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b8b0 b8b0Var = (b8b0) obj;
                SharedPreferences sharedPreferences = b8b0Var.Z;
                Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPIN_DA_BOTTLE_MUSIC", true)) : null;
                if (boolValueOf == null || boolValueOf.equals(Boolean.TRUE)) {
                    ypa0 ypa0Var = b8b0Var.J;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    String string = b8b0Var.getString(R.string.bg_music);
                    string.getClass();
                    ypa0Var.A1(0L, string);
                }
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(qve0.n.a);
                return Unit.a;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
