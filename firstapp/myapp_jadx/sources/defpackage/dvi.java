package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes8.dex */
public final class dvi implements i1k<Object> {
    public volatile imc a;
    public final Object b = new Object();
    public final Fragment c;

    public interface a {
        hmc T2();
    }

    public dvi(Fragment fragment) {
        this.c = fragment;
    }

    public static final Context b(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final imc a() {
        Fragment fragment = this.c;
        if (fragment.getHost() == null) {
            bmy.a("Hilt Fragments must be attached before creating the component.");
            return null;
        }
        z7b.c(fragment.getHost() instanceof j1k, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fragment.getHost().getClass());
        hmc hmcVarT2 = ((a) jm2.a(fragment.getHost(), a.class)).T2();
        return new imc(hmcVarT2.a, hmcVarT2.b, hmcVarT2.c);
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }
}
