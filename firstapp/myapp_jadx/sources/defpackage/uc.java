package defpackage;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes8.dex */
public final class uc implements i1k<Object> {
    public volatile emc a;
    public final Object b = new Object();
    public final Activity c;
    public final ue d;
    public zu60 e;

    public interface a {
        dmc a();
    }

    public uc(Activity activity) {
        this.c = activity;
        this.d = new ue((rn8) activity);
    }

    public final void a() {
        zu60 zu60Var = this.e;
        if (zu60Var != null) {
            zu60Var.a = null;
        }
    }

    public final emc b() {
        String str;
        Activity activity = this.c;
        if (activity.getApplication() instanceof i1k) {
            dmc dmcVarA = ((a) jm2.a(this.d, a.class)).a();
            return new emc(dmcVarA.a, dmcVarA.b, new gl8(), activity);
        }
        if (Application.class.equals(activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }

    public final void c() {
        ue ueVar = this.d;
        rn8 rn8Var = ueVar.a;
        te teVar = new te(ueVar.b);
        rn8Var.getClass();
        v8i0 viewModelStore = rn8Var.getViewModelStore();
        cyb defaultViewModelCreationExtras = rn8Var.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, teVar, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(ue.b.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        zu60 zu60Var = ((ue.b) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI))).b;
        this.e = zu60Var;
        if (zu60Var.a == null) {
            cyb defaultViewModelCreationExtras2 = ((rn8) this.c).getDefaultViewModelCreationExtras();
            z7b.c(zu60Var.b, "setExtras should only be called for an Activity that extends ComponentActivity", new Object[0]);
            zu60Var.a = defaultViewModelCreationExtras2;
        }
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }
}
