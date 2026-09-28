package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.settings.BioAuthSettingsScreenKt$BioAuthSettingsScreen$9$1", f = "BioAuthSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b94 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ytw<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b94(Context context, ytw<Boolean> ytwVar, v1b<? super b94> v1bVar) {
        super(2, v1bVar);
        this.a = context;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b94(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b94) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw<Boolean> ytwVar = this.b;
        if (ytwVar.getValue().booleanValue()) {
            Toast.makeText(this.a, R.string.biometrics_authentication__biometrics_authentication_is_now_turned_off, 1).show();
            ytwVar.setValue(Boolean.FALSE);
        }
        return Unit.a;
    }
}
