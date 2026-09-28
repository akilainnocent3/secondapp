package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ued implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ued(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object obj2 = ((List) obj).get(2);
                obj2.getClass();
                return (Integer) obj2;
            default:
                m410 m410Var = (m410) obj;
                SharedPreferences sharedPreferences = m410Var.V;
                Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("PING_PONG_MUSIC", true)) : null;
                if (boolValueOf == null || boolValueOf.equals(Boolean.TRUE)) {
                    ypa0 ypa0Var = m410Var.v;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    String string = m410Var.getString(R.string.bg_music);
                    string.getClass();
                    ypa0Var.A1(0L, string);
                }
                return Unit.a;
        }
    }
}
