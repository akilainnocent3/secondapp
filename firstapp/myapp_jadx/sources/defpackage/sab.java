package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.auth.SportyAccountManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sab implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sab(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ((x5a0) fgbVar.c1().i0).setValue(Boolean.FALSE);
                    e activity = fgbVar.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        supportFragmentManager.Y();
                    }
                } else {
                    ((x5a0) fgbVar.c1().i0).setValue(Boolean.FALSE);
                    fgbVar.M0();
                }
                return Unit.a;
            default:
                return SportyAccountManagerImpl.setLanguageCode$lambda$0((String) obj2, (t8) obj);
        }
    }
}
