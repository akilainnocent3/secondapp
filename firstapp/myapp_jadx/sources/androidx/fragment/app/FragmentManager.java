package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import defpackage.ae;
import defpackage.bnv;
import defpackage.cbs;
import defpackage.ce;
import defpackage.cgt;
import defpackage.cny;
import defpackage.cyb;
import defpackage.dmv;
import defpackage.dq7;
import defpackage.dwi;
import defpackage.efe0;
import defpackage.evi;
import defpackage.ewi;
import defpackage.fwi;
import defpackage.gwi;
import defpackage.hb5;
import defpackage.he;
import defpackage.hwi;
import defpackage.hyi;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.ie;
import defpackage.inm;
import defpackage.iny;
import defpackage.jq40;
import defpackage.jsa0;
import defpackage.jv60;
import defpackage.kpy;
import defpackage.kwi;
import defpackage.le;
import defpackage.loy;
import defpackage.lx5;
import defpackage.nny;
import defpackage.nrh0;
import defpackage.nv60;
import defpackage.p48;
import defpackage.qxi;
import defpackage.qya;
import defpackage.re;
import defpackage.rh6;
import defpackage.roy;
import defpackage.rui;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.sr1;
import defpackage.tny;
import defpackage.tug;
import defpackage.ud;
import defpackage.uf80;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.vvi;
import defpackage.w8i0;
import defpackage.yk10;
import defpackage.zwi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public Fragment A;
    public le D;
    public le E;
    public le F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList<androidx.fragment.app.a> M;
    public ArrayList<Boolean> N;
    public ArrayList<Fragment> O;
    public androidx.fragment.app.j P;
    public boolean b;
    public ArrayList<Fragment> e;
    public iny g;
    public vvi<?> x;
    public evi y;
    public Fragment z;
    public final ArrayList<o> a = new ArrayList<>();
    public final androidx.fragment.app.m c = new androidx.fragment.app.m();
    public ArrayList<androidx.fragment.app.a> d = new ArrayList<>();
    public final androidx.fragment.app.h f = new androidx.fragment.app.h(this);
    public androidx.fragment.app.a h = null;
    public boolean i = false;
    public final b j = new b();
    public final AtomicInteger k = new AtomicInteger();
    public final Map<String, BackStackState> l = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> m = Collections.synchronizedMap(new HashMap());
    public final Map<String, m> n = Collections.synchronizedMap(new HashMap());
    public final ArrayList<n> o = new ArrayList<>();
    public final androidx.fragment.app.i p = new androidx.fragment.app.i(this);
    public final CopyOnWriteArrayList<zwi> q = new CopyOnWriteArrayList<>();
    public final ewi r = new qya() { // from class: ewi
        @Override // defpackage.qya
        public final void accept(Object obj) {
            Configuration configuration = (Configuration) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.T()) {
                fragmentManager.l(false, configuration);
            }
        }
    };
    public final fwi s = new qya() { // from class: fwi
        @Override // defpackage.qya
        public final void accept(Object obj) {
            Integer num = (Integer) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.T() && num.intValue() == 80) {
                fragmentManager.p(false);
            }
        }
    };
    public final gwi t = new qya() { // from class: gwi
        @Override // defpackage.qya
        public final void accept(Object obj) {
            ylw ylwVar = (ylw) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.T()) {
                fragmentManager.q(ylwVar.a, false);
            }
        }
    };
    public final hwi u = new qya() { // from class: hwi
        @Override // defpackage.qya
        public final void accept(Object obj) {
            fu00 fu00Var = (fu00) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.T()) {
                fragmentManager.v(fu00Var.a, false);
            }
        }
    };
    public final c v = new c();
    public int w = -1;
    public final d B = new d();
    public final e C = new e();
    public ArrayDeque<LaunchedFragmentInfo> G = new ArrayDeque<>();
    public final f Q = new f();

    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String a;
        public int b;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.a = parcel.readString();
                launchedFragmentInfo.b = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }
    }

    public class a implements ud<Map<String, Boolean>> {
        public a() {
        }

        @Override // defpackage.ud
        public final void a(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", oLsIjJCWb.GXXoisKtPReUJS + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.a;
            int i2 = launchedFragmentInfoPollFirst.b;
            Fragment fragmentC = fragmentManager.c.c(str);
            if (fragmentC != null) {
                fragmentC.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends cny {
        public b() {
            super(false);
        }

        @Override // defpackage.cny
        public final void a() {
            boolean zR = FragmentManager.R(3);
            final FragmentManager fragmentManager = FragmentManager.this;
            if (zR) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (FragmentManager.R(3)) {
                Log.d("FragmentManager", "cancelBackStackTransition for transition " + fragmentManager.h);
            }
            androidx.fragment.app.a aVar = fragmentManager.h;
            if (aVar != null) {
                aVar.u = false;
                aVar.j();
                androidx.fragment.app.a aVar2 = fragmentManager.h;
                Runnable runnable = new Runnable() { // from class: jwi
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList<FragmentManager.n> arrayList = fragmentManager.o;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            FragmentManager.n nVar = arrayList.get(i);
                            i++;
                            nVar.getClass();
                        }
                    }
                };
                ArrayList<Runnable> arrayList = aVar2.s;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    aVar2.s = arrayList;
                }
                arrayList.add(runnable);
                fragmentManager.h.d();
                fragmentManager.i = true;
                fragmentManager.C(true);
                fragmentManager.J();
                fragmentManager.i = false;
                fragmentManager.h = null;
            }
        }

        @Override // defpackage.cny
        public final void b() {
            boolean zR = FragmentManager.R(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zR) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            b bVar = fragmentManager.j;
            ArrayList<n> arrayList = fragmentManager.o;
            fragmentManager.i = true;
            fragmentManager.C(true);
            int i = 0;
            fragmentManager.i = false;
            if (fragmentManager.h == null) {
                if (bVar.a) {
                    if (FragmentManager.R(3)) {
                        Log.d("FragmentManager", jbkEboCkTqmGf.kGCzbIPOmD);
                    }
                    fragmentManager.a0();
                    return;
                } else {
                    if (FragmentManager.R(3)) {
                        Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                    }
                    fragmentManager.g.d();
                    return;
                }
            }
            if (!arrayList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(FragmentManager.K(fragmentManager.h));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    n nVar = arrayList.get(i2);
                    i2++;
                    n nVar2 = nVar;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        nVar2.a((Fragment) it.next(), true);
                    }
                }
            }
            ArrayList<androidx.fragment.app.n.a> arrayList2 = fragmentManager.h.c;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                androidx.fragment.app.n.a aVar = arrayList2.get(i3);
                i3++;
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            for (androidx.fragment.app.q qVar : fragmentManager.i(new ArrayList(Collections.singletonList(fragmentManager.h)), 0, 1)) {
                ArrayList arrayList3 = qVar.c;
                if (FragmentManager.R(3)) {
                    Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                }
                qVar.l(arrayList3);
                qVar.c(arrayList3);
            }
            ArrayList<androidx.fragment.app.n.a> arrayList4 = fragmentManager.h.c;
            int size3 = arrayList4.size();
            while (i < size3) {
                androidx.fragment.app.n.a aVar2 = arrayList4.get(i);
                i++;
                Fragment fragment2 = aVar2.b;
                if (fragment2 != null && fragment2.mContainer == null) {
                    fragmentManager.j(fragment2).k();
                }
            }
            fragmentManager.h = null;
            fragmentManager.u0();
            if (FragmentManager.R(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + bVar.a + " for  FragmentManager " + fragmentManager);
            }
        }

        @Override // defpackage.cny
        public final void c(sr1 sr1Var) {
            boolean zR = FragmentManager.R(2);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zR) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            if (fragmentManager.h != null) {
                int i = 0;
                for (androidx.fragment.app.q qVar : fragmentManager.i(new ArrayList(Collections.singletonList(fragmentManager.h)), 0, 1)) {
                    qVar.getClass();
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + sr1Var.c);
                    }
                    ArrayList arrayList = qVar.c;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        p48.w(((androidx.fragment.app.q.c) obj).k, arrayList2);
                    }
                    List listA0 = CollectionsKt.A0(CollectionsKt.E0(arrayList2));
                    int size2 = listA0.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((androidx.fragment.app.q.a) listA0.get(i3)).d(sr1Var, qVar.a);
                    }
                }
                ArrayList<n> arrayList3 = fragmentManager.o;
                int size3 = arrayList3.size();
                while (i < size3) {
                    n nVar = arrayList3.get(i);
                    i++;
                    nVar.getClass();
                }
            }
        }

        @Override // defpackage.cny
        public final void d(sr1 sr1Var) {
            boolean zR = FragmentManager.R(3);
            FragmentManager fragmentManager = FragmentManager.this;
            if (zR) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + fragmentManager);
            }
            fragmentManager.z();
            fragmentManager.A(fragmentManager.new q(), false);
        }
    }

    public class c implements bnv {
        public c() {
        }

        @Override // defpackage.bnv
        public final void a(Menu menu) {
            FragmentManager.this.t(menu);
        }

        @Override // defpackage.bnv
        public final void b(Menu menu) {
            FragmentManager.this.w(menu);
        }

        @Override // defpackage.bnv
        public final boolean c(MenuItem menuItem) {
            return FragmentManager.this.s(menuItem);
        }

        @Override // defpackage.bnv
        public final void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.n(menu, menuInflater);
        }
    }

    public class d extends androidx.fragment.app.g {
        public d() {
        }

        @Override // androidx.fragment.app.g
        public final Fragment a(String str) {
            return Fragment.instantiate(FragmentManager.this.x.b, str, null);
        }
    }

    public class e implements jsa0 {
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.C(true);
        }
    }

    public class g implements cbs {
        public final /* synthetic */ String a;
        public final /* synthetic */ qxi b;
        public final /* synthetic */ s9s c;

        public g(String str, qxi qxiVar, s9s s9sVar) {
            this.a = str;
            this.b = qxiVar;
            this.c = s9sVar;
        }

        @Override // defpackage.cbs
        public final void F0(ibs ibsVar, s9s.a aVar) {
            Bundle bundle;
            s9s.a aVar2 = s9s.a.ON_START;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.a;
            if (aVar == aVar2 && (bundle = fragmentManager.m.get(str)) != null) {
                this.b.a(str, bundle);
                fragmentManager.f(str);
            }
            if (aVar == s9s.a.ON_DESTROY) {
                this.c.d(this);
                fragmentManager.n.remove(str);
            }
        }
    }

    public class h implements zwi {
        public final /* synthetic */ Fragment a;

        public h(Fragment fragment) {
            this.a = fragment;
        }

        @Override // defpackage.zwi
        public final void a(FragmentManager fragmentManager, Fragment fragment) {
            this.a.onAttachFragment(fragment);
        }
    }

    public class i implements ud<ActivityResult> {
        public i() {
        }

        @Override // defpackage.ud
        public final void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollLast = fragmentManager.G.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollLast.a;
            int i = launchedFragmentInfoPollLast.b;
            Fragment fragmentC = fragmentManager.c.c(str);
            if (fragmentC != null) {
                fragmentC.onActivityResult(i, activityResult2.a, activityResult2.b);
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class j implements ud<ActivityResult> {
        public j() {
        }

        @Override // defpackage.ud
        public final void a(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.G.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.a;
            int i = launchedFragmentInfoPollFirst.b;
            Fragment fragmentC = fragmentManager.c.c(str);
            if (fragmentC != null) {
                fragmentC.onActivityResult(i, activityResult2.a, activityResult2.b);
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class k extends vd<IntentSenderRequest, ActivityResult> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest(intentSenderRequest.a, null, intentSenderRequest.c, intentSenderRequest.d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            return new ActivityResult(intent, i);
        }
    }

    public static class m implements qxi {
        public final s9s a;
        public final qxi b;
        public final g c;

        public m(s9s s9sVar, qxi qxiVar, g gVar) {
            this.a = s9sVar;
            this.b = qxiVar;
            this.c = gVar;
        }

        @Override // defpackage.qxi
        public final void a(String str, Bundle bundle) {
            this.b.a(str, bundle);
        }
    }

    public interface n {
        default void a(Fragment fragment, boolean z) {
        }

        default void b(Fragment fragment, boolean z) {
        }

        void onBackStackChanged();
    }

    public interface o {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class p implements o {
        public final String a;
        public final int b;
        public final int c;

        public p(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.A;
            if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().a0()) {
                return false;
            }
            return FragmentManager.this.c0(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    public class q implements o {
        public q() {
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            ArrayList<androidx.fragment.app.a> arrayList3;
            ArrayList<Boolean> arrayList4;
            boolean zC0;
            FragmentManager fragmentManager = FragmentManager.this;
            ArrayList<n> arrayList5 = fragmentManager.o;
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + fragmentManager.a);
            }
            int i = 0;
            if (fragmentManager.d.isEmpty()) {
                Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                zC0 = false;
            } else {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) rh6.a(1, fragmentManager.d);
                fragmentManager.h = aVar;
                ArrayList<androidx.fragment.app.n.a> arrayList6 = aVar.c;
                int size = arrayList6.size();
                int i2 = 0;
                while (i2 < size) {
                    androidx.fragment.app.n.a aVar2 = arrayList6.get(i2);
                    i2++;
                    Fragment fragment = aVar2.b;
                    if (fragment != null) {
                        fragment.mTransitioning = true;
                    }
                }
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                zC0 = fragmentManager.c0(arrayList3, arrayList4, null, -1, 0);
            }
            if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
                boolean zBooleanValue = arrayList4.get(arrayList3.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    androidx.fragment.app.a aVar3 = arrayList3.get(i3);
                    i3++;
                    linkedHashSet.addAll(FragmentManager.K(aVar3));
                }
                int size3 = arrayList5.size();
                while (i < size3) {
                    n nVar = arrayList5.get(i);
                    i++;
                    n nVar2 = nVar;
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        nVar2.b((Fragment) it.next(), zBooleanValue);
                    }
                }
            }
            return zC0;
        }
    }

    public class r implements o {
        public final String a;

        public r(String str) {
            this.a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            BackStackState backStackStateRemove = fragmentManager.l.remove(this.a);
            boolean z = false;
            if (backStackStateRemove == null) {
                return false;
            }
            HashMap map = new HashMap();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                androidx.fragment.app.a aVar = arrayList.get(i);
                i++;
                androidx.fragment.app.a aVar2 = aVar;
                if (aVar2.w) {
                    ArrayList<androidx.fragment.app.n.a> arrayList3 = aVar2.c;
                    int size2 = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        androidx.fragment.app.n.a aVar3 = arrayList3.get(i2);
                        i2++;
                        Fragment fragment = aVar3.b;
                        if (fragment != null) {
                            map.put(fragment.mWho, fragment);
                        }
                    }
                }
            }
            ArrayList arrayList4 = backStackStateRemove.a;
            HashMap map2 = new HashMap(arrayList4.size());
            int size3 = arrayList4.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList4.get(i3);
                i3++;
                String str = (String) obj;
                Fragment fragment2 = (Fragment) map.get(str);
                if (fragment2 != null) {
                    map2.put(fragment2.mWho, fragment2);
                } else {
                    Bundle bundleI = fragmentManager.c.i(str, null);
                    if (bundleI != null) {
                        ClassLoader classLoader = fragmentManager.x.b.getClassLoader();
                        Fragment fragmentA = ((FragmentState) bundleI.getParcelable("state")).a(fragmentManager.O(), classLoader);
                        fragmentA.mSavedFragmentState = bundleI;
                        if (bundleI.getBundle("savedInstanceState") == null) {
                            fragmentA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                        }
                        Bundle bundle = bundleI.getBundle("arguments");
                        if (bundle != null) {
                            bundle.setClassLoader(classLoader);
                        }
                        fragmentA.setArguments(bundle);
                        map2.put(fragmentA.mWho, fragmentA);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = backStackStateRemove.b;
            int size4 = arrayList6.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj2 = arrayList6.get(i4);
                i4++;
                BackStackRecordState backStackRecordState = (BackStackRecordState) obj2;
                ArrayList<String> arrayList7 = backStackRecordState.b;
                androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(fragmentManager);
                backStackRecordState.a(aVar4);
                for (int i5 = 0; i5 < arrayList7.size(); i5++) {
                    String str2 = arrayList7.get(i5);
                    if (str2 != null) {
                        Fragment fragment3 = (Fragment) map2.get(str2);
                        if (fragment3 == null) {
                            ib5.a(kwi.a(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f, " failed due to missing saved state for Fragment (", str2, ")"));
                            return false;
                        }
                        aVar4.c.get(i5).b = fragment3;
                    }
                }
                arrayList5.add(aVar4);
            }
            int size5 = arrayList5.size();
            int i6 = 0;
            while (i6 < size5) {
                Object obj3 = arrayList5.get(i6);
                i6++;
                ((androidx.fragment.app.a) obj3).a(arrayList, arrayList2);
                z = true;
            }
            return z;
        }
    }

    public class s implements o {
        public final String a;

        public s(String str) {
            this.a = str;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
        @Override // androidx.fragment.app.FragmentManager.o
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) throws Throwable {
            int i;
            int i2;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.a;
            int iF = fragmentManager.F(-1, str, true);
            int i3 = 0;
            if (iF < 0) {
                return false;
            }
            int i4 = iF;
            while (true) {
                Throwable th = null;
                if (i4 >= fragmentManager.d.size()) {
                    HashSet hashSet = new HashSet();
                    int i5 = iF;
                    while (i5 < fragmentManager.d.size()) {
                        androidx.fragment.app.a aVar = fragmentManager.d.get(i5);
                        HashSet hashSet2 = new HashSet();
                        HashSet hashSet3 = new HashSet();
                        ArrayList<androidx.fragment.app.n.a> arrayList3 = aVar.c;
                        int size = arrayList3.size();
                        int i6 = i3;
                        while (i6 < size) {
                            androidx.fragment.app.n.a aVar2 = arrayList3.get(i6);
                            i6++;
                            androidx.fragment.app.n.a aVar3 = aVar2;
                            Fragment fragment = aVar3.b;
                            if (fragment != null) {
                                Throwable th2 = th;
                                if (aVar3.c) {
                                    int i7 = aVar3.a;
                                    i = i5;
                                    if (i7 == 1 || i7 == 2 || i7 == 8) {
                                    }
                                    i2 = aVar3.a;
                                    if (i2 != 1 || i2 == 2) {
                                        hashSet3.add(fragment);
                                    }
                                    th = th2;
                                    i5 = i;
                                } else {
                                    i = i5;
                                }
                                hashSet.add(fragment);
                                hashSet2.add(fragment);
                                i2 = aVar3.a;
                                if (i2 != 1) {
                                    hashSet3.add(fragment);
                                } else {
                                    hashSet3.add(fragment);
                                }
                                th = th2;
                                i5 = i;
                            }
                        }
                        int i8 = i5;
                        Throwable th3 = th;
                        hashSet2.removeAll(hashSet3);
                        if (!hashSet2.isEmpty()) {
                            StringBuilder sbA = he.a("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                            sbA.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                            sbA.append(" in ");
                            sbA.append(aVar);
                            sbA.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                            fragmentManager.s0(new IllegalArgumentException(sbA.toString()));
                            throw th3;
                        }
                        i5 = i8 + 1;
                        th = th3;
                        i3 = 0;
                    }
                    Throwable th4 = th;
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
                        if (fragment2.mRetainInstance) {
                            StringBuilder sbA2 = he.a("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                            sbA2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                            sbA2.append("fragment ");
                            sbA2.append(fragment2);
                            fragmentManager.s0(new IllegalArgumentException(sbA2.toString()));
                            throw th4;
                        }
                        ArrayList arrayListE = fragment2.mChildFragmentManager.c.e();
                        int size2 = arrayListE.size();
                        int i9 = 0;
                        while (i9 < size2) {
                            Object obj = arrayListE.get(i9);
                            i9++;
                            Fragment fragment3 = (Fragment) obj;
                            if (fragment3 != null) {
                                arrayDeque.addLast(fragment3);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((Fragment) it.next()).mWho);
                    }
                    ArrayList arrayList5 = new ArrayList(fragmentManager.d.size() - iF);
                    for (int i10 = iF; i10 < fragmentManager.d.size(); i10++) {
                        arrayList5.add(th4);
                    }
                    BackStackState backStackState = new BackStackState(arrayList4, arrayList5);
                    for (int size3 = fragmentManager.d.size() - 1; size3 >= iF; size3--) {
                        androidx.fragment.app.a aVarRemove = fragmentManager.d.remove(size3);
                        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(aVarRemove);
                        aVar4.j();
                        arrayList5.set(size3 - iF, new BackStackRecordState(aVar4));
                        aVarRemove.w = true;
                        arrayList.add(aVarRemove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    fragmentManager.l.put(str, backStackState);
                    return true;
                }
                androidx.fragment.app.a aVar5 = fragmentManager.d.get(i4);
                if (!aVar5.r) {
                    fragmentManager.s0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar5 + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
                i4++;
            }
        }
    }

    public static Fragment I(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static HashSet K(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.c.size(); i2++) {
            Fragment fragment = aVar.c.get(i2).b;
            if (fragment != null && aVar.i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean R(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static boolean S(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        ArrayList arrayListE = fragment.mChildFragmentManager.c.e();
        int size = arrayListE.size();
        boolean zS = false;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListE.get(i2);
            i2++;
            Fragment fragment2 = (Fragment) obj;
            if (fragment2 != null) {
                zS = S(fragment2);
            }
            if (zS) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.A) && U(fragmentManager.z);
    }

    public static void r0(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void A(o oVar, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.K) {
                    ib5.a("FragmentManager has been destroyed");
                    return;
                } else {
                    ib5.a("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (V()) {
                ib5.a("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(oVar);
                    k0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(boolean z) {
        if (this.b) {
            ib5.a("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.K) {
                ib5.a("FragmentManager has been destroyed");
                return;
            } else {
                ib5.a("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.c.getLooper()) {
            ib5.a("Must be called from main thread of fragment host");
            return;
        }
        if (!z && V()) {
            ib5.a("Can not perform this action after onSaveInstanceState");
        } else if (this.M == null) {
            this.M = new ArrayList<>();
            this.N = new ArrayList<>();
        }
    }

    public final boolean C(boolean z) {
        boolean zA;
        ArrayList<o> arrayList;
        androidx.fragment.app.a aVar;
        B(z);
        if (!this.i && (aVar = this.h) != null) {
            aVar.u = false;
            aVar.j();
            if (R(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.k(false, false);
            this.a.add(0, this.h);
            ArrayList<androidx.fragment.app.n.a> arrayList2 = this.h.c;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                androidx.fragment.app.n.a aVar2 = arrayList2.get(i2);
                i2++;
                Fragment fragment = aVar2.b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.M;
            ArrayList<Boolean> arrayList4 = this.N;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        int i3 = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i3 >= size2) {
                                break;
                            }
                            zA |= arrayList.get(i3).a(arrayList3, arrayList4);
                            i3++;
                            throw th;
                        }
                        arrayList.clear();
                        this.x.c.removeCallbacks(this.Q);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.x.c.removeCallbacks(this.Q);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.b = true;
            try {
                g0(this.M, this.N);
                e();
                z2 = true;
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        u0();
        if (this.L) {
            this.L = false;
            ArrayList arrayListD = this.c.d();
            int size3 = arrayListD.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj = arrayListD.get(i4);
                i4++;
                androidx.fragment.app.k kVar = (androidx.fragment.app.k) obj;
                Fragment fragment2 = kVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        kVar.k();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void D(androidx.fragment.app.a aVar, boolean z) {
        if (z && (this.x == null || this.K)) {
            return;
        }
        B(z);
        androidx.fragment.app.a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.u = false;
            aVar2.j();
            if (R(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execSingleAction for action " + aVar);
            }
            this.h.k(false, false);
            this.h.a(this.M, this.N);
            ArrayList<androidx.fragment.app.n.a> arrayList = this.h.c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                androidx.fragment.app.n.a aVar3 = arrayList.get(i2);
                i2++;
                Fragment fragment = aVar3.b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.h = null;
        }
        aVar.a(this.M, this.N);
        this.b = true;
        try {
            g0(this.M, this.N);
            e();
            u0();
            boolean z2 = this.L;
            androidx.fragment.app.m mVar = this.c;
            if (z2) {
                this.L = false;
                ArrayList arrayListD = mVar.d();
                int size2 = arrayListD.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayListD.get(i3);
                    i3++;
                    androidx.fragment.app.k kVar = (androidx.fragment.app.k) obj;
                    Fragment fragment2 = kVar.c;
                    if (fragment2.mDeferStart) {
                        if (this.b) {
                            this.L = true;
                        } else {
                            fragment2.mDeferStart = false;
                            kVar.k();
                        }
                    }
                }
            }
            mVar.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x021b A[PHI: r15
      0x021b: PHI (r15v14 int) = (r15v13 int), (r15v16 int) binds: [B:100:0x0208, B:104:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    public final void E(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        boolean z3 = arrayList.get(i8).r;
        ArrayList<Fragment> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        ArrayList<Fragment> arrayList4 = this.O;
        androidx.fragment.app.m mVar = this.c;
        arrayList4.addAll(mVar.f());
        Fragment fragment = this.A;
        int i9 = i8;
        boolean z4 = false;
        while (true) {
            int i10 = 1;
            if (i9 >= i3) {
                boolean z5 = z3;
                boolean z6 = z4;
                this.O.clear();
                if (!z5 && this.w >= 1) {
                    for (int i11 = i8; i11 < i3; i11++) {
                        ArrayList<androidx.fragment.app.n.a> arrayList5 = arrayList.get(i11).c;
                        int size = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size) {
                            androidx.fragment.app.n.a aVar = arrayList5.get(i12);
                            i12++;
                            Fragment fragment2 = aVar.b;
                            if (fragment2 != null && fragment2.mFragmentManager != null) {
                                mVar.g(j(fragment2));
                            }
                        }
                    }
                }
                int i13 = i8;
                while (i13 < i3) {
                    androidx.fragment.app.a aVar2 = arrayList.get(i13);
                    if (!arrayList2.get(i13).booleanValue()) {
                        aVar2.i(1);
                        FragmentManager fragmentManager = aVar2.t;
                        ArrayList<androidx.fragment.app.n.a> arrayList6 = aVar2.c;
                        int size2 = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            androidx.fragment.app.n.a aVar3 = arrayList6.get(i14);
                            Fragment fragment3 = aVar3.b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = aVar2.w;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(aVar2.h);
                                fragment3.setSharedElementNames(aVar2.p, aVar2.q);
                            }
                            switch (aVar3.a) {
                                case 1:
                                    i13 = i13;
                                    fragment3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager.l0(fragment3, false);
                                    fragmentManager.a(fragment3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 2:
                                default:
                                    dwi.a(aVar3.a, "Unknown cmd: ");
                                    break;
                                case 3:
                                    fragment3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager.f0(fragment3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 4:
                                    fragment3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager.Q(fragment3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 5:
                                    fragment3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager.l0(fragment3, false);
                                    r0(fragment3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 6:
                                    fragment3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager.k(fragment3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 7:
                                    fragment3.setAnimations(aVar3.d, aVar3.e, aVar3.f, aVar3.g);
                                    fragmentManager.l0(fragment3, false);
                                    fragmentManager.c(fragment3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 8:
                                    fragmentManager.p0(fragment3);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 9:
                                    fragmentManager.p0(null);
                                    i14++;
                                    i13 = i13;
                                    break;
                                case 10:
                                    aVar3.h = fragment3.mMaxState;
                                    fragmentManager.o0(fragment3, aVar3.i);
                                    i14++;
                                    i13 = i13;
                                    break;
                            }
                            return;
                        }
                    }
                    aVar2.i(-1);
                    FragmentManager fragmentManager2 = aVar2.t;
                    ArrayList<androidx.fragment.app.n.a> arrayList7 = aVar2.c;
                    boolean z7 = true;
                    for (int size3 = arrayList7.size() - 1; size3 >= 0; size3--) {
                        androidx.fragment.app.n.a aVar4 = arrayList7.get(size3);
                        Fragment fragment4 = aVar4.b;
                        if (fragment4 != null) {
                            fragment4.mBeingSaved = aVar2.w;
                            fragment4.setPopDirection(z7);
                            int i15 = aVar2.h;
                            int i16 = 8194;
                            int i17 = 4097;
                            if (i15 != 4097) {
                                if (i15 != 8194) {
                                    i16 = 4100;
                                    if (i15 != 8197) {
                                        i17 = 4099;
                                        if (i15 != 4099) {
                                            i16 = i15 != 4100 ? 0 : 8197;
                                        } else {
                                            i16 = i17;
                                        }
                                    }
                                } else {
                                    i16 = i17;
                                }
                            }
                            fragment4.setNextTransition(i16);
                            fragment4.setSharedElementNames(aVar2.q, aVar2.p);
                        }
                        switch (aVar4.a) {
                            case 1:
                                fragment4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                z7 = true;
                                fragmentManager2.l0(fragment4, true);
                                fragmentManager2.f0(fragment4);
                                break;
                            case 2:
                            default:
                                dwi.a(aVar4.a, "Unknown cmd: ");
                                break;
                            case 3:
                                fragment4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                fragmentManager2.a(fragment4);
                                z7 = true;
                                break;
                            case 4:
                                fragment4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                fragmentManager2.getClass();
                                r0(fragment4);
                                z7 = true;
                                break;
                            case 5:
                                fragment4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                fragmentManager2.l0(fragment4, true);
                                fragmentManager2.Q(fragment4);
                                z7 = true;
                                break;
                            case 6:
                                fragment4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                fragmentManager2.c(fragment4);
                                z7 = true;
                                break;
                            case 7:
                                fragment4.setAnimations(aVar4.d, aVar4.e, aVar4.f, aVar4.g);
                                fragmentManager2.l0(fragment4, true);
                                fragmentManager2.k(fragment4);
                                z7 = true;
                                break;
                            case 8:
                                fragmentManager2.p0(null);
                                z7 = true;
                                break;
                            case 9:
                                fragmentManager2.p0(fragment4);
                                z7 = true;
                                break;
                            case 10:
                                aVar4.i = fragment4.mMaxState;
                                fragmentManager2.o0(fragment4, aVar4.h);
                                z7 = true;
                                break;
                        }
                        return;
                    }
                    i13++;
                }
                boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
                ArrayList<n> arrayList8 = this.o;
                if (z6 && !arrayList8.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size4 = arrayList.size();
                    int i18 = 0;
                    while (i18 < size4) {
                        androidx.fragment.app.a aVar5 = arrayList.get(i18);
                        i18++;
                        linkedHashSet.addAll(K(aVar5));
                    }
                    if (this.h == null) {
                        int size5 = arrayList8.size();
                        int i19 = 0;
                        while (i19 < size5) {
                            n nVar = arrayList8.get(i19);
                            i19++;
                            n nVar2 = nVar;
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                nVar2.b((Fragment) it.next(), zBooleanValue);
                            }
                        }
                        int size6 = arrayList8.size();
                        int i20 = 0;
                        while (i20 < size6) {
                            n nVar3 = arrayList8.get(i20);
                            i20++;
                            n nVar4 = nVar3;
                            Iterator it2 = linkedHashSet.iterator();
                            while (it2.hasNext()) {
                                nVar4.a((Fragment) it2.next(), zBooleanValue);
                            }
                        }
                    }
                }
                for (int i21 = i8; i21 < i3; i21++) {
                    androidx.fragment.app.a aVar6 = arrayList.get(i21);
                    if (zBooleanValue) {
                        for (int size7 = aVar6.c.size() - 1; size7 >= 0; size7--) {
                            Fragment fragment5 = aVar6.c.get(size7).b;
                            if (fragment5 != null) {
                                j(fragment5).k();
                            }
                        }
                    } else {
                        ArrayList<androidx.fragment.app.n.a> arrayList9 = aVar6.c;
                        int size8 = arrayList9.size();
                        int i22 = 0;
                        while (i22 < size8) {
                            androidx.fragment.app.n.a aVar7 = arrayList9.get(i22);
                            i22++;
                            Fragment fragment6 = aVar7.b;
                            if (fragment6 != null) {
                                j(fragment6).k();
                            }
                        }
                    }
                }
                W(this.w, true);
                for (androidx.fragment.app.q qVar : i(arrayList, i8, i3)) {
                    qVar.e = zBooleanValue;
                    qVar.k();
                    qVar.e();
                }
                while (i8 < i3) {
                    androidx.fragment.app.a aVar8 = arrayList.get(i8);
                    if (arrayList2.get(i8).booleanValue() && aVar8.v >= 0) {
                        aVar8.v = -1;
                    }
                    if (aVar8.s != null) {
                        for (int i23 = 0; i23 < aVar8.s.size(); i23++) {
                            aVar8.s.get(i23).run();
                        }
                        aVar8.s = null;
                    }
                    i8++;
                }
                if (z6) {
                    for (int i24 = 0; i24 < arrayList8.size(); i24++) {
                        arrayList8.get(i24).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
            androidx.fragment.app.a aVar9 = arrayList.get(i9);
            boolean zBooleanValue2 = arrayList2.get(i9).booleanValue();
            ArrayList<Fragment> arrayList10 = this.O;
            if (zBooleanValue2) {
                z = z3;
                i4 = i9;
                z2 = z4;
                int i25 = 1;
                ArrayList<androidx.fragment.app.n.a> arrayList11 = aVar9.c;
                int size9 = arrayList11.size() - 1;
                while (size9 >= 0) {
                    androidx.fragment.app.n.a aVar10 = arrayList11.get(size9);
                    int i26 = aVar10.a;
                    if (i26 == i25) {
                        arrayList10.remove(aVar10.b);
                    } else if (i26 != 3) {
                        switch (i26) {
                            case 6:
                                arrayList10.add(aVar10.b);
                                break;
                            case 7:
                                arrayList10.remove(aVar10.b);
                                break;
                            case 8:
                                fragment = null;
                                break;
                            case 9:
                                fragment = aVar10.b;
                                break;
                            case 10:
                                aVar10.i = aVar10.h;
                                break;
                        }
                    } else {
                        arrayList10.add(aVar10.b);
                    }
                    size9--;
                    i25 = 1;
                }
            } else {
                ArrayList<androidx.fragment.app.n.a> arrayList12 = aVar9.c;
                int i27 = 0;
                while (i27 < arrayList12.size()) {
                    androidx.fragment.app.n.a aVar11 = arrayList12.get(i27);
                    boolean z8 = z3;
                    int i28 = aVar11.a;
                    if (i28 != i10) {
                        i5 = i9;
                        if (i28 != 2) {
                            if (i28 == 3 || i28 == 6) {
                                arrayList10.remove(aVar11.b);
                                Fragment fragment7 = aVar11.b;
                                if (fragment7 == fragment) {
                                    arrayList12.add(i27, new androidx.fragment.app.n.a(fragment7, 9));
                                    i27++;
                                    fragment = null;
                                }
                                i6 = 1;
                            } else if (i28 == 7) {
                                i6 = 1;
                            } else if (i28 == 8) {
                                arrayList12.add(i27, new androidx.fragment.app.n.a(9, 0, fragment));
                                aVar11.c = true;
                                i27++;
                                fragment = aVar11.b;
                            }
                            i6 = 1;
                        } else {
                            Fragment fragment8 = aVar11.b;
                            int i29 = fragment8.mContainerId;
                            int size10 = arrayList10.size() - 1;
                            boolean z9 = false;
                            while (size10 >= 0) {
                                int i30 = size10;
                                Fragment fragment9 = arrayList10.get(size10);
                                boolean z10 = z4;
                                if (fragment9.mContainerId != i29) {
                                    i29 = i29;
                                } else if (fragment9 == fragment8) {
                                    i29 = i29;
                                    z9 = true;
                                } else {
                                    if (fragment9 == fragment) {
                                        i7 = 0;
                                        arrayList12.add(i27, new androidx.fragment.app.n.a(9, 0, fragment9));
                                        i27++;
                                        fragment = null;
                                    } else {
                                        i7 = 0;
                                    }
                                    androidx.fragment.app.n.a aVar12 = new androidx.fragment.app.n.a(3, i7, fragment9);
                                    aVar12.d = aVar11.d;
                                    aVar12.f = aVar11.f;
                                    aVar12.e = aVar11.e;
                                    aVar12.g = aVar11.g;
                                    arrayList12.add(i27, aVar12);
                                    arrayList10.remove(fragment9);
                                    i27++;
                                    fragment = fragment;
                                }
                                size10 = i30 - 1;
                                i29 = i29;
                                z4 = z10;
                            }
                            z4 = z4;
                            i6 = 1;
                            if (z9) {
                                arrayList12.remove(i27);
                                i27--;
                            } else {
                                aVar11.a = 1;
                                aVar11.c = true;
                                arrayList10.add(fragment8);
                            }
                        }
                        i27 += i6;
                        i10 = i6;
                        z3 = z8;
                        i9 = i5;
                        z4 = z4;
                    } else {
                        i5 = i9;
                        i6 = i10;
                    }
                    z4 = z4;
                    arrayList10.add(aVar11.b);
                    i27 += i6;
                    i10 = i6;
                    z3 = z8;
                    i9 = i5;
                    z4 = z4;
                }
                z = z3;
                i4 = i9;
                z2 = z4;
            }
            z4 = z2 || aVar9.i;
            i9 = i4 + 1;
            z3 = z;
        }
    }

    public final int F(int i2, String str, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.d.get(size);
            if ((str != null && str.equals(aVar.k)) || (i2 >= 0 && i2 == aVar.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.d.get(size - 1);
            if ((str == null || !str.equals(aVar2.k)) && (i2 < 0 || i2 != aVar2.v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment G(int i2) {
        androidx.fragment.app.m mVar = this.c;
        ArrayList<Fragment> arrayList = mVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (androidx.fragment.app.k kVar : mVar.b.values()) {
            if (kVar != null) {
                Fragment fragment2 = kVar.c;
                if (fragment2.mFragmentId == i2) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment H(String str) {
        androidx.fragment.app.m mVar = this.c;
        ArrayList<Fragment> arrayList = mVar.a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.k kVar : mVar.b.values()) {
            if (kVar != null) {
                Fragment fragment2 = kVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void J() {
        for (androidx.fragment.app.q qVar : h()) {
            if (qVar.f) {
                if (R(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                qVar.f = false;
                qVar.e();
            }
        }
    }

    public final int L() {
        return this.d.size() + (this.h != null ? 1 : 0);
    }

    public final Fragment M(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentB = this.c.b(string);
        if (fragmentB != null) {
            return fragmentB;
        }
        s0(new IllegalStateException(lx5.a("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup N(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.y.c()) {
            return null;
        }
        View viewB = this.y.b(fragment.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final androidx.fragment.app.g O() {
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.O() : this.B;
    }

    public final jsa0 P() {
        Fragment fragment = this.z;
        return fragment != null ? fragment.mFragmentManager.P() : this.C;
    }

    public final void Q(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        q0(fragment);
    }

    public final boolean T() {
        Fragment fragment = this.z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.z.getParentFragmentManager().T();
    }

    public final boolean V() {
        return this.I || this.J;
    }

    public final void W(int i2, boolean z) {
        vvi<?> vviVar;
        if (this.x == null && i2 != -1) {
            ib5.a("No activity");
            return;
        }
        if (z || i2 != this.w) {
            this.w = i2;
            androidx.fragment.app.m mVar = this.c;
            HashMap<String, androidx.fragment.app.k> map = mVar.b;
            ArrayList<Fragment> arrayList = mVar.a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Fragment fragment = arrayList.get(i3);
                i3++;
                androidx.fragment.app.k kVar = map.get(fragment.mWho);
                if (kVar != null) {
                    kVar.k();
                }
            }
            for (androidx.fragment.app.k kVar2 : map.values()) {
                if (kVar2 != null) {
                    kVar2.k();
                    Fragment fragment2 = kVar2.c;
                    if (fragment2.mRemoving && !fragment2.isInBackStack()) {
                        if (fragment2.mBeingSaved && !mVar.c.containsKey(fragment2.mWho)) {
                            mVar.i(fragment2.mWho, kVar2.n());
                        }
                        mVar.h(kVar2);
                    }
                }
            }
            ArrayList arrayListD = mVar.d();
            int size2 = arrayListD.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj = arrayListD.get(i4);
                i4++;
                androidx.fragment.app.k kVar3 = (androidx.fragment.app.k) obj;
                Fragment fragment3 = kVar3.c;
                if (fragment3.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragment3.mDeferStart = false;
                        kVar3.k();
                    }
                }
            }
            if (this.H && (vviVar = this.x) != null && this.w == 7) {
                vviVar.h();
                this.H = false;
            }
        }
    }

    public final void X() {
        if (this.x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.f = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void Y() {
        A(new p(null, -1, 0), false);
    }

    public final void Z(int i2, String str) {
        A(new p(str, -1, i2), false);
    }

    public final androidx.fragment.app.k a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            hyi.d(fragment, str);
        }
        if (R(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        androidx.fragment.app.k kVarJ = j(fragment);
        fragment.mFragmentManager = this;
        androidx.fragment.app.m mVar = this.c;
        mVar.g(kVarJ);
        if (!fragment.mDetached) {
            mVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (S(fragment)) {
                this.H = true;
            }
        }
        return kVarJ;
    }

    public final boolean a0() {
        return b0(-1, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(vvi<?> vviVar, evi eviVar, Fragment fragment) {
        androidx.fragment.app.j jVar;
        ibs ibsVar;
        if (this.x != null) {
            ib5.a("Already attached");
            return;
        }
        this.x = vviVar;
        this.y = eviVar;
        this.z = fragment;
        CopyOnWriteArrayList<zwi> copyOnWriteArrayList = this.q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new h(fragment));
        } else if (vviVar instanceof zwi) {
            copyOnWriteArrayList.add((zwi) vviVar);
        }
        if (this.z != null) {
            u0();
        }
        if (vviVar instanceof nny) {
            nny nnyVar = (nny) vviVar;
            iny onBackPressedDispatcher = nnyVar.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            if (fragment != null) {
                ibsVar = nnyVar;
                ibsVar = fragment;
            }
            ibsVar = nnyVar;
            onBackPressedDispatcher.a(ibsVar, this.j);
        }
        if (fragment != null) {
            androidx.fragment.app.j jVar2 = fragment.mFragmentManager.P;
            HashMap<String, androidx.fragment.app.j> map = jVar2.b;
            jVar = map.get(fragment.mWho);
            if (jVar == null) {
                jVar = new androidx.fragment.app.j(jVar2.d);
                map.put(fragment.mWho, jVar);
            }
            this.P = jVar;
        } else if (vviVar instanceof w8i0) {
            v8i0 viewModelStore = ((w8i0) vviVar).getViewModelStore();
            viewModelStore.getClass();
            cyb.a aVar = cyb.a.b;
            aVar.getClass();
            s8i0 s8i0Var = new s8i0(viewModelStore, androidx.fragment.app.j.i, aVar);
            dq7 dq7VarA = jq40.a(androidx.fragment.app.j.class);
            String strI = dq7VarA.i();
            if (strI == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                jVar = (androidx.fragment.app.j) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
                this.P = jVar;
            }
        } else {
            jVar = new androidx.fragment.app.j(false);
            this.P = jVar;
        }
        jVar.f = V();
        this.c.d = this.P;
        Object obj = this.x;
        if ((obj instanceof nv60) && fragment == null) {
            jv60 savedStateRegistry = ((nv60) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new jv60.b() { // from class: iwi
                @Override // jv60.b
                public final Bundle a() {
                    return this.a.i0();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                h0(bundleA);
            }
        }
        Object obj2 = this.x;
        if (obj2 instanceof re) {
            ie activityResultRegistry = ((re) obj2).getActivityResultRegistry();
            String strConcat = "FragmentManager:".concat(fragment != null ? uf80.a(new StringBuilder(), fragment.mWho, ":") : "");
            this.D = activityResultRegistry.d(strConcat.concat("StartActivityForResult"), new ce(), new i());
            this.E = activityResultRegistry.d(strConcat.concat("StartIntentSenderForResult"), new k(), new j());
            this.F = activityResultRegistry.d(strConcat.concat("RequestPermissions"), new ae(), new a());
        }
        Object obj3 = this.x;
        if (obj3 instanceof tny) {
            ((tny) obj3).addOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof kpy) {
            ((kpy) obj4).addOnTrimMemoryListener(this.s);
        }
        Object obj5 = this.x;
        if (obj5 instanceof loy) {
            ((loy) obj5).addOnMultiWindowModeChangedListener(this.t);
        }
        Object obj6 = this.x;
        if (obj6 instanceof roy) {
            ((roy) obj6).addOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj7 = this.x;
        if ((obj7 instanceof dmv) && fragment == null) {
            ((dmv) obj7).addMenuProvider(this.v);
        }
    }

    public final boolean b0(int i2, int i3, String str) {
        C(false);
        B(true);
        Fragment fragment = this.A;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().a0()) {
            return true;
        }
        boolean zC0 = c0(this.M, this.N, str, i2, i3);
        if (zC0) {
            this.b = true;
            try {
                g0(this.M, this.N);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        u0();
        boolean z = this.L;
        androidx.fragment.app.m mVar = this.c;
        if (z) {
            this.L = false;
            ArrayList arrayListD = mVar.d();
            int size = arrayListD.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListD.get(i4);
                i4++;
                androidx.fragment.app.k kVar = (androidx.fragment.app.k) obj;
                Fragment fragment2 = kVar.c;
                if (fragment2.mDeferStart) {
                    if (this.b) {
                        this.L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        kVar.k();
                    }
                }
            }
        }
        mVar.b.values().removeAll(Collections.singleton(null));
        return zC0;
    }

    public final void c(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (R(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (S(fragment)) {
                this.H = true;
            }
        }
    }

    public final boolean c0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int iF = F(i2, str, (i3 & 1) != 0);
        if (iF < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iF; size--) {
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final androidx.fragment.app.a d() {
        return new androidx.fragment.app.a(this);
    }

    public final void d0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            s0(new IllegalStateException(rui.a("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void e() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void e0(l lVar, boolean z) {
        androidx.fragment.app.i iVar = this.p;
        iVar.getClass();
        iVar.b.add(new androidx.fragment.app.i.a(lVar, z));
    }

    public final void f(String str) {
        this.m.remove(str);
        if (R(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
        }
    }

    public final void f0(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        androidx.fragment.app.m mVar = this.c;
        synchronized (mVar.a) {
            mVar.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (S(fragment)) {
            this.H = true;
        }
        fragment.mRemoving = true;
        q0(fragment);
    }

    public final void g(String str) {
        m mVarRemove = this.n.remove(str);
        if (mVarRemove != null) {
            mVarRemove.a.d(mVarRemove.c);
        }
        if (R(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key ".concat(str));
        }
    }

    public final void g0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            ib5.a("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).r) {
                if (i3 != i2) {
                    E(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                        i3++;
                    }
                }
                E(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            E(arrayList, arrayList2, i3, size);
        }
    }

    public final HashSet h() {
        Object bVar;
        HashSet hashSet = new HashSet();
        ArrayList arrayListD = this.c.d();
        int size = arrayListD.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListD.get(i2);
            i2++;
            ViewGroup viewGroup = ((androidx.fragment.app.k) obj).c.mContainer;
            if (viewGroup != null) {
                P().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof androidx.fragment.app.q) {
                    bVar = (androidx.fragment.app.q) tag;
                } else {
                    bVar = new androidx.fragment.app.b(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, bVar);
                }
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public final HashSet i(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            ArrayList<androidx.fragment.app.n.a> arrayList2 = ((androidx.fragment.app.a) arrayList.get(i2)).c;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                androidx.fragment.app.n.a aVar = arrayList2.get(i4);
                i4++;
                Fragment fragment = aVar.b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(androidx.fragment.app.q.i(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public final Bundle i0() {
        int i2;
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        J();
        z();
        C(true);
        this.I = true;
        this.P.f = true;
        androidx.fragment.app.m mVar = this.c;
        mVar.getClass();
        HashMap<String, androidx.fragment.app.k> map = mVar.b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (androidx.fragment.app.k kVar : map.values()) {
            if (kVar != null) {
                Fragment fragment = kVar.c;
                mVar.i(fragment.mWho, kVar.n());
                arrayList2.add(fragment.mWho);
                if (R(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.c.c;
        if (!map2.isEmpty()) {
            androidx.fragment.app.m mVar2 = this.c;
            synchronized (mVar2.a) {
                try {
                    backStackRecordStateArr = null;
                    if (mVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(mVar2.a.size());
                        ArrayList<Fragment> arrayList3 = mVar2.a;
                        int size = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Fragment fragment2 = arrayList3.get(i3);
                            i3++;
                            Fragment fragment3 = fragment2;
                            arrayList.add(fragment3.mWho);
                            if (R(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment3.mWho + "): " + fragment3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                backStackRecordStateArr = new BackStackRecordState[size2];
                for (i2 = 0; i2 < size2; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState(this.d.get(i2));
                    if (R(2)) {
                        StringBuilder sbA = efe0.a(i2, "saveAllState: adding back stack #", ": ");
                        sbA.append(this.d.get(i2));
                        Log.v("FragmentManager", sbA.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.k.get();
            Fragment fragment4 = this.A;
            if (fragment4 != null) {
                fragmentManagerState.e = fragment4.mWho;
            }
            fragmentManagerState.f.addAll(this.l.keySet());
            fragmentManagerState.i.addAll(this.l.values());
            fragmentManagerState.v = new ArrayList<>(this.G);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.m.keySet()) {
                bundle.putBundle(inm.a("result_", str), this.m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(inm.a("fragment_", str2), map2.get(str2));
            }
        } else if (R(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final androidx.fragment.app.k j(Fragment fragment) {
        String str = fragment.mWho;
        androidx.fragment.app.m mVar = this.c;
        androidx.fragment.app.k kVar = mVar.b.get(str);
        if (kVar != null) {
            return kVar;
        }
        androidx.fragment.app.k kVar2 = new androidx.fragment.app.k(this.p, mVar, fragment);
        kVar2.l(this.x.b.getClassLoader());
        kVar2.e = this.w;
        return kVar2;
    }

    public final Fragment.SavedState j0(Fragment fragment) {
        androidx.fragment.app.k kVar = this.c.b.get(fragment.mWho);
        if (kVar != null) {
            Fragment fragment2 = kVar.c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(kVar.n());
                }
                return null;
            }
        }
        s0(new IllegalStateException(rui.a("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void k(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (R(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            androidx.fragment.app.m mVar = this.c;
            synchronized (mVar.a) {
                mVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (S(fragment)) {
                this.H = true;
            }
            q0(fragment);
        }
    }

    public final void k0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.c.removeCallbacks(this.Q);
                    this.x.c.post(this.Q);
                    u0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(boolean z, Configuration configuration) {
        if (z && (this.x instanceof tny)) {
            s0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.l(true, configuration);
                }
            }
        }
    }

    public final void l0(Fragment fragment, boolean z) {
        ViewGroup viewGroupN = N(fragment);
        if (viewGroupN == null || !(viewGroupN instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupN).setDrawDisappearingViewsLast(!z);
    }

    public final boolean m(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final void m0(String str, Bundle bundle) {
        m mVar = this.n.get(str);
        if (mVar != null) {
            if (mVar.a.b().compareTo(s9s.b.d) >= 0) {
                mVar.a(str, bundle);
            } else {
                this.m.put(str, bundle);
            }
        } else {
            this.m.put(str, bundle);
        }
        if (R(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final boolean n(Menu menu, MenuInflater menuInflater) {
        if (this.w < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void n0(String str, ibs ibsVar, qxi qxiVar) {
        s9s lifecycle = ibsVar.getLifecycle();
        if (lifecycle.b() == s9s.b.a) {
            return;
        }
        g gVar = new g(str, qxiVar, lifecycle);
        m mVarPut = this.n.put(str, new m(lifecycle, qxiVar, gVar));
        if (mVarPut != null) {
            mVarPut.a.d(mVarPut.c);
        }
        if (R(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + qxiVar);
        }
        lifecycle.a(gVar);
    }

    public final void o() {
        boolean zIsChangingConfigurations = true;
        this.K = true;
        C(true);
        z();
        vvi<?> vviVar = this.x;
        boolean z = vviVar instanceof w8i0;
        androidx.fragment.app.m mVar = this.c;
        if (z) {
            zIsChangingConfigurations = mVar.d.e;
        } else {
            Context context = vviVar.b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = it.next().a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    mVar.d.z1((String) obj, false);
                }
            }
        }
        x(-1);
        Object obj2 = this.x;
        if (obj2 instanceof kpy) {
            ((kpy) obj2).removeOnTrimMemoryListener(this.s);
        }
        Object obj3 = this.x;
        if (obj3 instanceof tny) {
            ((tny) obj3).removeOnConfigurationChangedListener(this.r);
        }
        Object obj4 = this.x;
        if (obj4 instanceof loy) {
            ((loy) obj4).removeOnMultiWindowModeChangedListener(this.t);
        }
        Object obj5 = this.x;
        if (obj5 instanceof roy) {
            ((roy) obj5).removeOnPictureInPictureModeChangedListener(this.u);
        }
        Object obj6 = this.x;
        if ((obj6 instanceof dmv) && this.z == null) {
            ((dmv) obj6).removeMenuProvider(this.v);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        le leVar = this.D;
        if (leVar != null) {
            leVar.c();
            this.E.c();
            this.F.c();
        }
    }

    public final void o0(Fragment fragment, s9s.b bVar) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
        } else {
            nrh0.a(fragment, "Fragment ", " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void p(boolean z) {
        if (z && (this.x instanceof kpy)) {
            s0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.p(true);
                }
            }
        }
    }

    public final void p0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                nrh0.a(fragment, "Fragment ", " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.A;
        this.A = fragment;
        u(fragment2);
        u(this.A);
    }

    public final void q(boolean z, boolean z2) {
        if (z2 && (this.x instanceof loy)) {
            s0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.q(z, true);
                }
            }
        }
    }

    public final void q0(Fragment fragment) {
        ViewGroup viewGroupN = N(fragment);
        if (viewGroupN != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupN.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupN.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupN.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void r() {
        ArrayList arrayListE = this.c.e();
        int size = arrayListE.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListE.get(i2);
            i2++;
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.r();
            }
        }
    }

    public final boolean s(MenuItem menuItem) {
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void s0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new cgt());
        vvi<?> vviVar = this.x;
        if (vviVar != null) {
            try {
                vviVar.d(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            y("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    public final void t(Menu menu) {
        if (this.w < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void t0(l lVar) {
        androidx.fragment.app.i iVar = this.p;
        iVar.getClass();
        lVar.getClass();
        synchronized (iVar.b) {
            try {
                int size = iVar.b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (iVar.b.get(i2).a == lVar) {
                        iVar.b.remove(i2);
                        break;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.z;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            vvi<?> vviVar = this.x;
            if (vviVar != null) {
                sb.append(vviVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void u0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (R(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = L() > 0 && U(this.z);
                if (R(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.f(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(boolean z, boolean z2) {
        if (z2 && (this.x instanceof roy)) {
            s0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.v(z, true);
                }
            }
        }
    }

    public final boolean w(Menu menu) {
        boolean z = false;
        if (this.w < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void x(int i2) {
        try {
            this.b = true;
            for (androidx.fragment.app.k kVar : this.c.b.values()) {
                if (kVar != null) {
                    kVar.e = i2;
                }
            }
            W(i2, false);
            Iterator it = h().iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.q) it.next()).h();
            }
            this.b = false;
            C(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strA = yk10.a(str, "    ");
        androidx.fragment.app.m mVar = this.c;
        ArrayList<Fragment> arrayList = mVar.a;
        String strA2 = yk10.a(str, "    ");
        HashMap<String, androidx.fragment.app.k> map = mVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.k kVar : map.values()) {
                printWriter.print(str);
                if (kVar != null) {
                    Fragment fragment = kVar.c;
                    printWriter.println(fragment);
                    fragment.dump(strA2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment2 = arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment3 = this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.n(strA, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (o) this.a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void z() {
        Iterator it = h().iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.q) it.next()).h();
        }
    }

    public final void h0(Bundle bundle) {
        androidx.fragment.app.i iVar;
        Bundle bundle2;
        androidx.fragment.app.k kVar;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.x.b.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.x.b.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        androidx.fragment.app.m mVar = this.c;
        HashMap<String, Bundle> map2 = mVar.c;
        HashMap<String, androidx.fragment.app.k> map3 = mVar.b;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        ArrayList<String> arrayList = fragmentManagerState.a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            iVar = this.p;
            int i3 = 2;
            if (i2 >= size) {
                break;
            }
            String str3 = arrayList.get(i2);
            i2++;
            Bundle bundleI = mVar.i(str3, null);
            if (bundleI != null) {
                Fragment fragment = this.P.a.get(((FragmentState) bundleI.getParcelable("state")).b);
                if (fragment != null) {
                    if (R(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    kVar = new androidx.fragment.app.k(iVar, mVar, fragment, bundleI);
                    bundle2 = bundleI;
                } else {
                    i3 = 2;
                    bundle2 = bundleI;
                    kVar = new androidx.fragment.app.k(this.p, this.c, this.x.b.getClassLoader(), O(), bundleI);
                }
                Fragment fragment2 = kVar.c;
                fragment2.mSavedFragmentState = bundle2;
                fragment2.mFragmentManager = this;
                if (R(i3)) {
                    Log.v("FragmentManager", ACKxwYRsuWyGz.ZCXzqhFyx + fragment2.mWho + "): " + fragment2);
                }
                kVar.l(this.x.b.getClassLoader());
                mVar.g(kVar);
                kVar.e = this.w;
            }
        }
        androidx.fragment.app.j jVar = this.P;
        jVar.getClass();
        ArrayList arrayList2 = new ArrayList(jVar.a.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList2.get(i4);
            i4++;
            Fragment fragment3 = (Fragment) obj;
            if (map3.get(fragment3.mWho) == null) {
                if (R(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.a);
                }
                this.P.B1(fragment3);
                fragment3.mFragmentManager = this;
                androidx.fragment.app.k kVar2 = new androidx.fragment.app.k(iVar, mVar, fragment3);
                kVar2.e = 1;
                kVar2.k();
                fragment3.mRemoving = true;
                kVar2.k();
            }
        }
        ArrayList<String> arrayList3 = fragmentManagerState.b;
        mVar.a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                String str4 = arrayList3.get(i5);
                i5++;
                String str5 = str4;
                Fragment fragmentB = mVar.b(str5);
                if (fragmentB == null) {
                    ib5.a(tug.a("No instantiated fragment for (", str5, ")"));
                    return;
                }
                if (R(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str5 + "): " + fragmentB);
                }
                mVar.a(fragmentB);
            }
        }
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList<>(fragmentManagerState.c.length);
            int i6 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i6 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i6];
                ArrayList<String> arrayList4 = backStackRecordState.b;
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                backStackRecordState.a(aVar);
                aVar.v = backStackRecordState.i;
                for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                    String str6 = arrayList4.get(i7);
                    if (str6 != null) {
                        aVar.c.get(i7).b = mVar.b(str6);
                    }
                }
                aVar.i(1);
                if (R(2)) {
                    StringBuilder sbA = efe0.a(i6, "restoreAllState: back stack #", " (index ");
                    sbA.append(aVar.v);
                    sbA.append("): ");
                    sbA.append(aVar);
                    Log.v("FragmentManager", sbA.toString());
                    PrintWriter printWriter = new PrintWriter(new cgt());
                    aVar.n("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i6++;
            }
        } else {
            this.d = new ArrayList<>();
        }
        this.k.set(fragmentManagerState.d);
        String str7 = fragmentManagerState.e;
        if (str7 != null) {
            Fragment fragmentB2 = mVar.b(str7);
            this.A = fragmentB2;
            u(fragmentB2);
        }
        ArrayList<String> arrayList5 = fragmentManagerState.f;
        if (arrayList5 != null) {
            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                this.l.put(arrayList5.get(i8), fragmentManagerState.i.get(i8));
            }
        }
        this.G = new ArrayDeque<>(fragmentManagerState.v);
    }

    public static abstract class l {
        public void c(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void d(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void a(Fragment fragment) {
        }

        public void b(Fragment fragment) {
        }

        public void e(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }
}
