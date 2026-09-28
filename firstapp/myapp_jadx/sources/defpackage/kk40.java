package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes.dex */
public final class kk40 implements cbs {
    public final nv60 a;

    public static final class a implements jv60.b {
        public final LinkedHashSet a = new LinkedHashSet();

        public a(jv60 jv60Var) {
            jv60Var.c("androidx.savedstate.Restarter", this);
        }

        @Override // jv60.b
        public final Bundle a() {
            o2g.a.getClass();
            Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            qv60.a(bundleA, "classes_to_restore", CollectionsKt.A0(this.a));
            return bundleA;
        }
    }

    public kk40(nv60 nv60Var) {
        this.a = nv60Var;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        if (aVar != s9s.a.ON_CREATE) {
            jb5.a("Next event must be ON_CREATE");
            return;
        }
        ibsVar.getLifecycle().d(this);
        nv60 nv60Var = this.a;
        Bundle bundleA = nv60Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            ib5.a("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, kk40.class.getClassLoader()).asSubclass(jv60.a.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ((jv60.a) objNewInstance).a(nv60Var);
                    } catch (Exception e) {
                        jk40.a(inm.a("Failed to instantiate ", str2), e);
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + Chyeyik.DQyJej, e2);
                }
            } catch (ClassNotFoundException e3) {
                jk40.a(tug.a("Class ", str2, " wasn't found"), e3);
                return;
            }
        }
    }
}
