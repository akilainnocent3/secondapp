package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class x9s {
    protected final dbs mLifecycleFragment;

    public x9s(dbs dbsVar) {
        this.mLifecycleFragment = dbsVar;
    }

    public static dbs getFragment(u9s u9sVar) {
        jmk0 jmk0Var;
        qwk0 qwk0Var;
        Activity activity = u9sVar.a;
        if (!(activity instanceof e)) {
            WeakHashMap weakHashMap = jmk0.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (jmk0Var = (jmk0) weakReference.get()) != null) {
                return jmk0Var;
            }
            try {
                jmk0 jmk0Var2 = (jmk0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (jmk0Var2 == null || jmk0Var2.isRemoving()) {
                    jmk0Var2 = new jmk0();
                    activity.getFragmentManager().beginTransaction().add(jmk0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(jmk0Var2));
                return jmk0Var2;
            } catch (ClassCastException e) {
                rzk.b("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                return null;
            }
        }
        e eVar = (e) activity;
        WeakHashMap weakHashMap2 = qwk0.b;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(eVar);
        if (weakReference2 != null && (qwk0Var = (qwk0) weakReference2.get()) != null) {
            return qwk0Var;
        }
        try {
            qwk0 qwk0Var2 = (qwk0) eVar.getSupportFragmentManager().H("SLifecycleFragmentImpl");
            if (qwk0Var2 == null || qwk0Var2.isRemoving()) {
                qwk0Var2 = new qwk0();
                FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
                a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
                aVarA.e(0, qwk0Var2, "SLifecycleFragmentImpl", 1);
                aVarA.k(true, true);
            }
            weakHashMap2.put(eVar, new WeakReference(qwk0Var2));
            return qwk0Var2;
        } catch (ClassCastException e2) {
            rzk.b("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
            return null;
        }
    }

    public Activity getActivity() {
        Activity activityX = this.mLifecycleFragment.X();
        hm20.h(activityX);
        return activityX;
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public static dbs getFragment(Activity activity) {
        return getFragment(new u9s(activity));
    }

    public static dbs getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
