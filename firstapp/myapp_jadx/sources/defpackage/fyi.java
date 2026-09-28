package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class fyi extends FragmentManager.l {
    public static final p80 f = p80.d();
    public final WeakHashMap<Fragment, Trace> a = new WeakHashMap<>();
    public final ts7 b;
    public final avg0 c;
    public final tt0 d;
    public final jzi e;

    public fyi(ts7 ts7Var, avg0 avg0Var, tt0 tt0Var, jzi jziVar) {
        this.b = ts7Var;
        this.c = avg0Var;
        this.d = tt0Var;
        this.e = jziVar;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void a(Fragment fragment) {
        k2z k2zVar;
        Object[] objArr = {fragment.getClass().getSimpleName()};
        p80 p80Var = f;
        p80Var.b("FragmentMonitor %s.onFragmentPaused ", objArr);
        WeakHashMap<Fragment, Trace> weakHashMap = this.a;
        if (!weakHashMap.containsKey(fragment)) {
            p80Var.g("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = weakHashMap.get(fragment);
        weakHashMap.remove(fragment);
        jzi jziVar = this.e;
        HashMap map = jziVar.c;
        p80 p80Var2 = jzi.e;
        if (!jziVar.d) {
            p80Var2.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            k2zVar = new k2z();
        } else if (map.containsKey(fragment)) {
            izi iziVar = (izi) map.remove(fragment);
            k2z<izi> k2zVarA = jziVar.a();
            if (k2zVarA.b()) {
                izi iziVarA = k2zVarA.a();
                k2zVar = new k2z(new izi(iziVarA.a - iziVar.a, iziVarA.b - iziVar.b, iziVarA.c - iziVar.c));
            } else {
                p80Var2.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                k2zVar = new k2z();
            }
        } else {
            p80Var2.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            k2zVar = new k2z();
        }
        if (!k2zVar.b()) {
            p80Var.g("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            so70.a(trace, (izi) k2zVar.a());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void b(Fragment fragment) {
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace("_st_".concat(fragment.getClass().getSimpleName()), this.c, this.b, this.d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.a.put(fragment, trace);
        jzi jziVar = this.e;
        HashMap map = jziVar.c;
        p80 p80Var = jzi.e;
        if (!jziVar.d) {
            p80Var.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (map.containsKey(fragment)) {
            p80Var.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        k2z<izi> k2zVarA = jziVar.a();
        if (k2zVarA.b()) {
            map.put(fragment, k2zVarA.a());
        } else {
            p80Var.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }
}
