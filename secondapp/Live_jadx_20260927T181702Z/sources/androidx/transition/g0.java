package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f2.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g0 implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<y0> mEndValuesList;
    private f mEpicenterCallback;
    private j[] mListenersCache;
    private f0.a<String, String> mNameOverrides;
    u0 mPropagation;
    i mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<y0> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final w STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<f0.a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private z0 mStartValues = new z0();
    private z0 mEndValues = new z0();
    w0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private g0 mCloneParent = null;
    private ArrayList<j> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private w mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends w {
        @Override // androidx.transition.w
        @NonNull
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0.a f19522b;

        public b(f0.a aVar) {
            this.f19522b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19522b.remove(animator);
            g0.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.mCurrentAnimators.add(animator);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.end();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f19525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f19526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y0 f19527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WindowId f19528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g0 f19529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Animator f19530f;

        public d(View view, String str, g0 g0Var, WindowId windowId, y0 y0Var, Animator animator) {
            this.f19525a = view;
            this.f19526b = str;
            this.f19527c = y0Var;
            this.f19528d = windowId;
            this.f19529e = g0Var;
            this.f19530f = animator;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {
        public static <T> ArrayList<T> a(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t10)) {
                arrayList.add(t10);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> b(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t10);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class f {
        @Nullable
        public abstract Rect a(@NonNull g0 g0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static class g {
        @k.t
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        @k.t
        public static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public @interface h {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(34)
    public class i extends s0 implements v0, g3.b.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f19535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public g3.j f19536g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Runnable f19539j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f19531b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<e2.e<v0>> f19532c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<e2.e<v0>> f19533d = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public e2.e<v0>[] f19537h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final b1 f19538i = new b1();

        public i() {
        }

        public static /* synthetic */ void n(i iVar, g3.b bVar, boolean z10, float f10, float f11) {
            if (z10) {
                iVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                g0.this.notifyListeners(k.f19542b, false);
                return;
            }
            long jH = iVar.h();
            g0 g0VarC = ((w0) g0.this).C(0);
            g0 g0Var = g0VarC.mCloneParent;
            g0VarC.mCloneParent = null;
            g0.this.setCurrentPlayTimeMillis(-1L, iVar.f19531b);
            g0.this.setCurrentPlayTimeMillis(jH, -1L);
            iVar.f19531b = jH;
            Runnable runnable = iVar.f19539j;
            if (runnable != null) {
                runnable.run();
            }
            g0.this.mAnimators.clear();
            if (g0Var != null) {
                g0Var.notifyListeners(k.f19542b, true);
            }
        }

        @Override // androidx.transition.v0
        public void a(@NonNull e2.e<v0> eVar) {
            ArrayList<e2.e<v0>> arrayList = this.f19532c;
            if (arrayList != null) {
                arrayList.remove(eVar);
                if (this.f19532c.isEmpty()) {
                    this.f19532c = null;
                }
            }
        }

        @Override // androidx.transition.v0
        public void b(float f10) {
            if (this.f19536g != null) {
                throw new IllegalStateException("setCurrentFraction() called after animation has been started");
            }
            j((long) (f10 * h()));
        }

        @Override // androidx.transition.v0
        public void c(@NonNull e2.e<v0> eVar) {
            if (this.f19533d == null) {
                this.f19533d = new ArrayList<>();
            }
            this.f19533d.add(eVar);
        }

        @Override // androidx.transition.v0
        public long d() {
            return Math.min(h(), Math.max(0L, this.f19531b));
        }

        @Override // androidx.transition.v0
        public void e(@NonNull e2.e<v0> eVar) {
            ArrayList<e2.e<v0>> arrayList = this.f19533d;
            if (arrayList != null) {
                arrayList.remove(eVar);
            }
        }

        @Override // androidx.transition.v0
        public void f() {
            p();
            this.f19536g.z(h() + 1);
        }

        @Override // g3.b.r
        public void g(g3.b bVar, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(h() + 1, Math.round(f10)));
            g0.this.setCurrentPlayTimeMillis(jMax, this.f19531b);
            this.f19531b = jMax;
            o();
        }

        @Override // androidx.transition.v0
        public float getCurrentFraction() {
            return d() / h();
        }

        @Override // androidx.transition.v0
        public long h() {
            return g0.this.getTotalDurationMillis();
        }

        @Override // androidx.transition.v0
        public void i(@NonNull e2.e<v0> eVar) {
            if (isReady()) {
                eVar.accept(this);
                return;
            }
            if (this.f19532c == null) {
                this.f19532c = new ArrayList<>();
            }
            this.f19532c.add(eVar);
        }

        @Override // androidx.transition.v0
        public boolean isReady() {
            return this.f19534e;
        }

        @Override // androidx.transition.v0
        public void j(long j10) {
            if (this.f19536g != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f19531b || !isReady()) {
                return;
            }
            if (!this.f19535f) {
                if (j10 != 0 || this.f19531b <= 0) {
                    long jH = h();
                    if (j10 == jH && this.f19531b < jH) {
                        j10 = 1 + jH;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f19531b;
                if (j10 != j11) {
                    g0.this.setCurrentPlayTimeMillis(j10, j11);
                    this.f19531b = j10;
                }
            }
            o();
            this.f19538i.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // androidx.transition.v0
        public void l(@NonNull Runnable runnable) {
            this.f19539j = runnable;
            p();
            this.f19536g.z(0.0f);
        }

        public final void o() {
            ArrayList<e2.e<v0>> arrayList = this.f19533d;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f19533d.size();
            if (this.f19537h == null) {
                this.f19537h = new e2.e[size];
            }
            e2.e<v0>[] eVarArr = (e2.e[]) this.f19533d.toArray(this.f19537h);
            this.f19537h = null;
            for (int i10 = 0; i10 < size; i10++) {
                eVarArr[i10].accept(this);
                eVarArr[i10] = null;
            }
            this.f19537h = eVarArr;
        }

        @Override // androidx.transition.s0, androidx.transition.g0.j
        public void onTransitionCancel(@NonNull g0 g0Var) {
            this.f19535f = true;
        }

        public final void p() {
            if (this.f19536g != null) {
                return;
            }
            this.f19538i.a(AnimationUtils.currentAnimationTimeMillis(), this.f19531b);
            this.f19536g = new g3.j(new g3.h());
            g3.k kVar = new g3.k();
            kVar.g(1.0f);
            kVar.i(200.0f);
            this.f19536g.D(kVar);
            this.f19536g.t(this.f19531b);
            this.f19536g.c(this);
            this.f19536g.u(this.f19538i.b());
            this.f19536g.p(h() + 1);
            this.f19536g.q(-1.0f);
            this.f19536g.r(4.0f);
            this.f19536g.b(new g3.b.q() { // from class: androidx.transition.j0
                @Override // g3.b.q
                public final void a(g3.b bVar, boolean z10, float f10, float f11) {
                    g0.i.n(this.f19595a, bVar, z10, f10, f11);
                }
            });
        }

        public void q() {
            long j10 = h() == 0 ? 1L : 0L;
            g0.this.setCurrentPlayTimeMillis(j10, this.f19531b);
            this.f19531b = j10;
        }

        public void r() {
            this.f19534e = true;
            ArrayList<e2.e<v0>> arrayList = this.f19532c;
            if (arrayList != null) {
                this.f19532c = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface j {
        void k(@NonNull g0 g0Var, boolean z10);

        void m(@NonNull g0 g0Var, boolean z10);

        void onTransitionCancel(@NonNull g0 g0Var);

        void onTransitionEnd(@NonNull g0 g0Var);

        void onTransitionPause(@NonNull g0 g0Var);

        void onTransitionResume(@NonNull g0 g0Var);

        void onTransitionStart(@NonNull g0 g0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f19541a = new k() { // from class: androidx.transition.l0
            @Override // androidx.transition.g0.k
            public final void a(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.m(g0Var, z10);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f19542b = new k() { // from class: androidx.transition.m0
            @Override // androidx.transition.g0.k
            public final void a(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.k(g0Var, z10);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f19543c = new k() { // from class: androidx.transition.n0
            @Override // androidx.transition.g0.k
            public final void a(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.onTransitionCancel(g0Var);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k f19544d = new k() { // from class: androidx.transition.o0
            @Override // androidx.transition.g0.k
            public final void a(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.onTransitionPause(g0Var);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final k f19545e = new k() { // from class: androidx.transition.p0
            @Override // androidx.transition.g0.k
            public final void a(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.onTransitionResume(g0Var);
            }
        };

        void a(@NonNull j jVar, @NonNull g0 g0Var, boolean z10);
    }

    public g0() {
    }

    public static void b(z0 z0Var, View view, y0 y0Var) {
        z0Var.f19713a.put(view, y0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (z0Var.f19714b.indexOfKey(id2) >= 0) {
                z0Var.f19714b.put(id2, null);
            } else {
                z0Var.f19714b.put(id2, view);
            }
        }
        String strA0 = z1.A0(view);
        if (strA0 != null) {
            if (z0Var.f19716d.containsKey(strA0)) {
                z0Var.f19716d.put(strA0, null);
            } else {
                z0Var.f19716d.put(strA0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (z0Var.f19715c.j(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    z0Var.f19715c.n(itemIdAtPosition, view);
                    return;
                }
                View viewG = z0Var.f19715c.g(itemIdAtPosition);
                if (viewG != null) {
                    viewG.setHasTransientState(false);
                    z0Var.f19715c.n(itemIdAtPosition, null);
                }
            }
        }
    }

    public static boolean c(int[] iArr, int i10) {
        int i11 = iArr[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    public static <T> ArrayList<T> f(ArrayList<T> arrayList, T t10, boolean z10) {
        if (t10 != null) {
            return z10 ? e.a(arrayList, t10) : e.b(arrayList, t10);
        }
        return arrayList;
    }

    public static f0.a<Animator, d> j() {
        f0.a<Animator, d> aVar = sRunningAnimators.get();
        if (aVar != null) {
            return aVar;
        }
        f0.a<Animator, d> aVar2 = new f0.a<>();
        sRunningAnimators.set(aVar2);
        return aVar2;
    }

    public static boolean k(int i10) {
        return i10 >= 1 && i10 <= 4;
    }

    public static boolean l(y0 y0Var, y0 y0Var2, String str) {
        Object obj = y0Var.f19710a.get(str);
        Object obj2 = y0Var2.f19710a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static int[] s(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 3;
            } else if ("instance".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                i10--;
                iArr = iArr2;
            }
            i10++;
        }
        return iArr;
    }

    public final void a(f0.a<View, y0> aVar, f0.a<View, y0> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            y0 y0VarL = aVar.l(i10);
            if (isValidTarget(y0VarL.f19711b)) {
                this.mStartValuesList.add(y0VarL);
                this.mEndValuesList.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            y0 y0VarL2 = aVar2.l(i11);
            if (isValidTarget(y0VarL2.f19711b)) {
                this.mEndValuesList.add(y0VarL2);
                this.mStartValuesList.add(null);
            }
        }
    }

    @NonNull
    public g0 addListener(@NonNull j jVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(jVar);
        return this;
    }

    @NonNull
    public g0 addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void animate(@Nullable Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(k.f19543c, false);
    }

    public abstract void captureEndValues(@NonNull y0 y0Var);

    public void capturePropagationValues(y0 y0Var) {
        String[] strArrB;
        if (this.mPropagation == null || y0Var.f19710a.isEmpty() || (strArrB = this.mPropagation.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!y0Var.f19710a.containsKey(str)) {
                this.mPropagation.a(y0Var);
                return;
            }
        }
    }

    public abstract void captureStartValues(@NonNull y0 y0Var);

    public void captureValues(@NonNull ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        f0.a<String, String> aVar;
        clearValues(z10);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.mTargetIds.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i10).intValue());
                if (viewFindViewById != null) {
                    y0 y0Var = new y0(viewFindViewById);
                    if (z10) {
                        captureStartValues(y0Var);
                    } else {
                        captureEndValues(y0Var);
                    }
                    y0Var.f19712c.add(this);
                    capturePropagationValues(y0Var);
                    if (z10) {
                        b(this.mStartValues, viewFindViewById, y0Var);
                    } else {
                        b(this.mEndValues, viewFindViewById, y0Var);
                    }
                }
            }
            for (int i11 = 0; i11 < this.mTargets.size(); i11++) {
                View view = this.mTargets.get(i11);
                y0 y0Var2 = new y0(view);
                if (z10) {
                    captureStartValues(y0Var2);
                } else {
                    captureEndValues(y0Var2);
                }
                y0Var2.f19712c.add(this);
                capturePropagationValues(y0Var2);
                if (z10) {
                    b(this.mStartValues, view, y0Var2);
                } else {
                    b(this.mEndValues, view, y0Var2);
                }
            }
        } else {
            d(viewGroup, z10);
        }
        if (z10 || (aVar = this.mNameOverrides) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.mStartValues.f19716d.remove(this.mNameOverrides.g(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.mStartValues.f19716d.put(this.mNameOverrides.l(i13), view2);
            }
        }
    }

    public void clearValues(boolean z10) {
        if (z10) {
            this.mStartValues.f19713a.clear();
            this.mStartValues.f19714b.clear();
            this.mStartValues.f19715c.b();
        } else {
            this.mEndValues.f19713a.clear();
            this.mEndValues.f19714b.clear();
            this.mEndValues.f19715c.b();
        }
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable y0 y0Var, @Nullable y0 y0Var2) {
        return null;
    }

    public void createAnimators(@NonNull ViewGroup viewGroup, @NonNull z0 z0Var, @NonNull z0 z0Var2, @NonNull ArrayList<y0> arrayList, @NonNull ArrayList<y0> arrayList2) {
        Animator animatorCreateAnimator;
        Animator animator;
        int i10;
        boolean z10;
        int i11;
        View view;
        y0 y0Var;
        Animator animator2;
        View view2;
        Animator animator3;
        f0.a<Animator, d> aVarJ = j();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = getRootTransition().mSeekController != null;
        long jMin = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            y0 y0Var2 = arrayList.get(i12);
            y0 y0Var3 = arrayList2.get(i12);
            if (y0Var2 != null && !y0Var2.f19712c.contains(this)) {
                y0Var2 = null;
            }
            if (y0Var3 != null && !y0Var3.f19712c.contains(this)) {
                y0Var3 = null;
            }
            if (!(y0Var2 == null && y0Var3 == null) && ((y0Var2 == null || y0Var3 == null || isTransitionRequired(y0Var2, y0Var3)) && (animatorCreateAnimator = createAnimator(viewGroup, y0Var2, y0Var3)) != null)) {
                if (y0Var3 != null) {
                    View view3 = y0Var3.f19711b;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        y0Var = new y0(view3);
                        i10 = size;
                        z10 = z11;
                        y0 y0Var4 = z0Var2.f19713a.get(view3);
                        i11 = i12;
                        if (y0Var4 != null) {
                            int i13 = 0;
                            while (i13 < transitionProperties.length) {
                                Map<String, Object> map = y0Var.f19710a;
                                int i14 = i13;
                                String str = transitionProperties[i14];
                                map.put(str, y0Var4.f19710a.get(str));
                                i13 = i14 + 1;
                                transitionProperties = transitionProperties;
                            }
                        }
                        int size2 = aVarJ.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                view2 = view3;
                                animator3 = animatorCreateAnimator;
                                break;
                            }
                            d dVar = aVarJ.get(aVarJ.g(i15));
                            if (dVar.f19527c != null && dVar.f19525a == view3) {
                                view2 = view3;
                                if (dVar.f19526b.equals(getName()) && dVar.f19527c.equals(y0Var)) {
                                    animator3 = null;
                                    break;
                                }
                            } else {
                                view2 = view3;
                            }
                            i15++;
                            view3 = view2;
                        }
                    } else {
                        view2 = view3;
                        i10 = size;
                        z10 = z11;
                        i11 = i12;
                        animator3 = animatorCreateAnimator;
                        y0Var = null;
                    }
                    animator = animator3;
                    view = view2;
                } else {
                    animator = animatorCreateAnimator;
                    i10 = size;
                    z10 = z11;
                    i11 = i12;
                    view = y0Var2.f19711b;
                    y0Var = null;
                }
                if (animator != null) {
                    u0 u0Var = this.mPropagation;
                    if (u0Var != null) {
                        long jC = u0Var.c(viewGroup, this, y0Var2, y0Var3);
                        sparseIntArray.put(this.mAnimators.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    long j10 = jMin;
                    View view4 = view;
                    y0 y0Var5 = y0Var;
                    Animator animator4 = animator;
                    d dVar2 = new d(view4, getName(), this, viewGroup.getWindowId(), y0Var5, animator4);
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator4);
                        animator2 = animatorSet;
                    } else {
                        animator2 = animator4;
                    }
                    aVarJ.put(animator2, dVar2);
                    this.mAnimators.add(animator2);
                    jMin = j10;
                }
            } else {
                i10 = size;
                z10 = z11;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = aVarJ.get(this.mAnimators.get(sparseIntArray.keyAt(i16)));
                dVar3.f19530f.setStartDelay((((long) sparseIntArray.valueAt(i16)) - jMin) + dVar3.f19530f.getStartDelay());
            }
        }
    }

    @NonNull
    @k.t0(34)
    public v0 createSeekController() {
        i iVar = new i();
        this.mSeekController = iVar;
        addListener(iVar);
        return this.mSeekController;
    }

    public final void d(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.mTargetTypeExcludes.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    y0 y0Var = new y0(view);
                    if (z10) {
                        captureStartValues(y0Var);
                    } else {
                        captureEndValues(y0Var);
                    }
                    y0Var.f19712c.add(this);
                    capturePropagationValues(y0Var);
                    if (z10) {
                        b(this.mStartValues, view, y0Var);
                    } else {
                        b(this.mEndValues, view, y0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.mTargetTypeChildExcludes.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                d(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public final ArrayList<Integer> e(ArrayList<Integer> arrayList, int i10, boolean z10) {
        if (i10 > 0) {
            return z10 ? e.a(arrayList, Integer.valueOf(i10)) : e.b(arrayList, Integer.valueOf(i10));
        }
        return arrayList;
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i10 = this.mNumInstances - 1;
        this.mNumInstances = i10;
        if (i10 == 0) {
            notifyListeners(k.f19542b, false);
            for (int i11 = 0; i11 < this.mStartValues.f19715c.w(); i11++) {
                View viewX = this.mStartValues.f19715c.x(i11);
                if (viewX != null) {
                    viewX.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.mEndValues.f19715c.w(); i12++) {
                View viewX2 = this.mEndValues.f19715c.x(i12);
                if (viewX2 != null) {
                    viewX2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public g0 excludeChildren(@NonNull View view, boolean z10) {
        this.mTargetChildExcludes = i(this.mTargetChildExcludes, view, z10);
        return this;
    }

    @NonNull
    public g0 excludeTarget(@NonNull View view, boolean z10) {
        this.mTargetExcludes = i(this.mTargetExcludes, view, z10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(@Nullable ViewGroup viewGroup) {
        f0.a<Animator, d> aVarJ = j();
        int size = aVarJ.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        f0.a aVar = new f0.a(aVarJ);
        aVarJ.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d dVar = (d) aVar.l(i10);
            if (dVar.f19525a != null && windowId.equals(dVar.f19528d)) {
                ((Animator) aVar.g(i10)).end();
            }
        }
    }

    public final ArrayList<Class<?>> g(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z10) {
        if (cls != null) {
            return z10 ? e.a(arrayList, cls) : e.b(arrayList, cls);
        }
        return arrayList;
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @Nullable
    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public y0 getMatchedTransitionValues(View view, boolean z10) {
        w0 w0Var = this.mParent;
        if (w0Var != null) {
            return w0Var.getMatchedTransitionValues(view, z10);
        }
        ArrayList<y0> arrayList = z10 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            y0 y0Var = arrayList.get(i10);
            if (y0Var == null) {
                return null;
            }
            if (y0Var.f19711b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.mEndValuesList : this.mStartValuesList).get(i10);
        }
        return null;
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public w getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable
    public u0 getPropagation() {
        return this.mPropagation;
    }

    @NonNull
    public final g0 getRootTransition() {
        w0 w0Var = this.mParent;
        return w0Var != null ? w0Var.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public y0 getTransitionValues(@NonNull View view, boolean z10) {
        w0 w0Var = this.mParent;
        if (w0Var != null) {
            return w0Var.getTransitionValues(view, z10);
        }
        return (z10 ? this.mStartValues : this.mEndValues).f19713a.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public final ArrayList<View> i(ArrayList<View> arrayList, View view, boolean z10) {
        if (view != null) {
            return z10 ? e.a(arrayList, view) : e.b(arrayList, view);
        }
        return arrayList;
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(@Nullable y0 y0Var, @Nullable y0 y0Var2) {
        if (y0Var != null && y0Var2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (l(y0Var, y0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = y0Var.f19710a.keySet().iterator();
                while (it.hasNext()) {
                    if (l(y0Var, y0Var2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.mTargetTypeExcludes.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && z1.A0(view) != null && this.mTargetNameExcludes.contains(z1.A0(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(z1.A0(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i11 = 0; i11 < this.mTargetTypes.size(); i11++) {
                if (this.mTargetTypes.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m(f0.a<View, y0> aVar, f0.a<View, y0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && isValidTarget(view)) {
                y0 y0Var = aVar.get(viewValueAt);
                y0 y0Var2 = aVar2.get(view);
                if (y0Var != null && y0Var2 != null) {
                    this.mStartValuesList.add(y0Var);
                    this.mEndValuesList.add(y0Var2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void n(f0.a<View, y0> aVar, f0.a<View, y0> aVar2) {
        y0 y0VarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewG = aVar.g(size);
            if (viewG != null && isValidTarget(viewG) && (y0VarRemove = aVar2.remove(viewG)) != null && isValidTarget(y0VarRemove.f19711b)) {
                this.mStartValuesList.add(aVar.j(size));
                this.mEndValuesList.add(y0VarRemove);
            }
        }
    }

    public void notifyListeners(k kVar, boolean z10) {
        r(this, kVar, z10);
    }

    public final void o(f0.a<View, y0> aVar, f0.a<View, y0> aVar2, f0.d1<View> d1Var, f0.d1<View> d1Var2) {
        View viewG;
        int iW = d1Var.w();
        for (int i10 = 0; i10 < iW; i10++) {
            View viewX = d1Var.x(i10);
            if (viewX != null && isValidTarget(viewX) && (viewG = d1Var2.g(d1Var.m(i10))) != null && isValidTarget(viewG)) {
                y0 y0Var = aVar.get(viewX);
                y0 y0Var2 = aVar2.get(viewG);
                if (y0Var != null && y0Var2 != null) {
                    this.mStartValuesList.add(y0Var);
                    this.mEndValuesList.add(y0Var2);
                    aVar.remove(viewX);
                    aVar2.remove(viewG);
                }
            }
        }
    }

    public final void p(f0.a<View, y0> aVar, f0.a<View, y0> aVar2, f0.a<String, View> aVar3, f0.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewL = aVar3.l(i10);
            if (viewL != null && isValidTarget(viewL) && (view = aVar4.get(aVar3.g(i10))) != null && isValidTarget(view)) {
                y0 y0Var = aVar.get(viewL);
                y0 y0Var2 = aVar2.get(view);
                if (y0Var != null && y0Var2 != null) {
                    this.mStartValuesList.add(y0Var);
                    this.mEndValuesList.add(y0Var2);
                    aVar.remove(viewL);
                    aVar2.remove(view);
                }
            }
        }
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void pause(@Nullable View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(k.f19544d, false);
        this.mPaused = true;
    }

    public void playTransition(@NonNull ViewGroup viewGroup) {
        d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        q(this.mStartValues, this.mEndValues);
        f0.a<Animator, d> aVarJ = j();
        int size = aVarJ.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorG = aVarJ.g(i10);
            if (animatorG != null && (dVar = aVarJ.get(animatorG)) != null && dVar.f19525a != null && windowId.equals(dVar.f19528d)) {
                y0 y0Var = dVar.f19527c;
                View view = dVar.f19525a;
                y0 transitionValues = getTransitionValues(view, true);
                y0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f19713a.get(view);
                }
                if ((transitionValues != null || matchedTransitionValues != null) && dVar.f19529e.isTransitionRequired(y0Var, matchedTransitionValues)) {
                    g0 g0Var = dVar.f19529e;
                    if (g0Var.getRootTransition().mSeekController != null) {
                        animatorG.cancel();
                        g0Var.mCurrentAnimators.remove(animatorG);
                        aVarJ.remove(animatorG);
                        if (g0Var.mCurrentAnimators.size() == 0) {
                            g0Var.notifyListeners(k.f19543c, false);
                            if (!g0Var.mEnded) {
                                g0Var.mEnded = true;
                                g0Var.notifyListeners(k.f19542b, false);
                            }
                        }
                    } else if (animatorG.isRunning() || animatorG.isStarted()) {
                        animatorG.cancel();
                    } else {
                        aVarJ.remove(animatorG);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
        } else if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            this.mSeekController.q();
            this.mSeekController.r();
        }
    }

    @k.t0(34)
    public void prepareAnimatorsForSeeking() {
        f0.a<Animator, d> aVarJ = j();
        this.mTotalDuration = 0L;
        for (int i10 = 0; i10 < this.mAnimators.size(); i10++) {
            Animator animator = this.mAnimators.get(i10);
            d dVar = aVarJ.get(animator);
            if (animator != null && dVar != null) {
                if (getDuration() >= 0) {
                    dVar.f19530f.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    dVar.f19530f.setStartDelay(getStartDelay() + dVar.f19530f.getStartDelay());
                }
                if (getInterpolator() != null) {
                    dVar.f19530f.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, g.a(animator));
            }
        }
        this.mAnimators.clear();
    }

    public final void q(z0 z0Var, z0 z0Var2) {
        f0.a<View, y0> aVar = new f0.a<>(z0Var.f19713a);
        f0.a<View, y0> aVar2 = new f0.a<>(z0Var2.f19713a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i10 >= iArr.length) {
                a(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                n(aVar, aVar2);
            } else if (i11 == 2) {
                p(aVar, aVar2, z0Var.f19716d, z0Var2.f19716d);
            } else if (i11 == 3) {
                m(aVar, aVar2, z0Var.f19714b, z0Var2.f19714b);
            } else if (i11 == 4) {
                o(aVar, aVar2, z0Var.f19715c, z0Var2.f19715c);
            }
            i10++;
        }
    }

    public final void r(g0 g0Var, k kVar, boolean z10) {
        g0 g0Var2 = this.mCloneParent;
        if (g0Var2 != null) {
            g0Var2.r(g0Var, kVar, z10);
        }
        ArrayList<j> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        j[] jVarArr = this.mListenersCache;
        if (jVarArr == null) {
            jVarArr = new j[size];
        }
        this.mListenersCache = null;
        j[] jVarArr2 = (j[]) this.mListeners.toArray(jVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            kVar.a(jVarArr2[i10], g0Var, z10);
            jVarArr2[i10] = null;
        }
        this.mListenersCache = jVarArr2;
    }

    @NonNull
    public g0 removeListener(@NonNull j jVar) {
        g0 g0Var;
        ArrayList<j> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(jVar) && (g0Var = this.mCloneParent) != null) {
                g0Var.removeListener(jVar);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public g0 removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void resume(@Nullable View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(k.f19545e, false);
            }
            this.mPaused = false;
        }
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        f0.a<Animator, d> aVarJ = j();
        for (Animator animator : this.mAnimators) {
            if (aVarJ.containsKey(animator)) {
                start();
                t(animator, aVarJ);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z10) {
        this.mCanRemoveViews = z10;
    }

    @k.t0(34)
    public void setCurrentPlayTimeMillis(long j10, long j11) {
        long totalDurationMillis = getTotalDurationMillis();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > totalDurationMillis && j10 <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(k.f19541a, z10);
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            g.b(animator, Math.min(Math.max(0L, j10), g.a(animator)));
            i10++;
            totalDurationMillis = totalDurationMillis;
        }
        long j12 = totalDurationMillis;
        this.mAnimatorCache = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.mEnded = true;
        }
        notifyListeners(k.f19542b, z10);
    }

    @NonNull
    public g0 setDuration(long j10) {
        this.mDuration = j10;
        return this;
    }

    public void setEpicenterCallback(@Nullable f fVar) {
        this.mEpicenterCallback = fVar;
    }

    @NonNull
    public g0 setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(@Nullable int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!k(iArr[i10])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (c(iArr, i10)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable w wVar) {
        if (wVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = wVar;
        }
    }

    public void setPropagation(@Nullable u0 u0Var) {
        this.mPropagation = u0Var;
    }

    @NonNull
    public g0 setStartDelay(long j10) {
        this.mStartDelay = j10;
        return this;
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(k.f19541a, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public final void t(Animator animator, f0.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            animate(animator);
        }
    }

    @NonNull
    public String toString() {
        return toString("");
    }

    @NonNull
    public g0 addTarget(@k.c0 int i10) {
        if (i10 != 0) {
            this.mTargetIds.add(Integer.valueOf(i10));
        }
        return this;
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public g0 mo1clone() {
        try {
            g0 g0Var = (g0) super.clone();
            g0Var.mAnimators = new ArrayList<>();
            g0Var.mStartValues = new z0();
            g0Var.mEndValues = new z0();
            g0Var.mStartValuesList = null;
            g0Var.mEndValuesList = null;
            g0Var.mSeekController = null;
            g0Var.mCloneParent = this;
            g0Var.mListeners = null;
            return g0Var;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @NonNull
    public g0 excludeChildren(@k.c0 int i10, boolean z10) {
        this.mTargetIdChildExcludes = e(this.mTargetIdChildExcludes, i10, z10);
        return this;
    }

    @NonNull
    public g0 excludeTarget(@k.c0 int i10, boolean z10) {
        this.mTargetIdExcludes = e(this.mTargetIdExcludes, i10, z10);
        return this;
    }

    @NonNull
    public g0 removeTarget(@k.c0 int i10) {
        if (i10 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i10));
        }
        return this;
    }

    public String toString(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append(to.c.phraseDel);
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.mDuration != -1) {
            sb2.append("dur(");
            sb2.append(this.mDuration);
            sb2.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb2.append("dly(");
            sb2.append(this.mStartDelay);
            sb2.append(") ");
        }
        if (this.mInterpolator != null) {
            sb2.append("interp(");
            sb2.append(this.mInterpolator);
            sb2.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb2.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i10 = 0; i10 < this.mTargetIds.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.mTargetIds.get(i10));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i11 = 0; i11 < this.mTargets.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.mTargets.get(i11));
                }
            }
            sb2.append(gi.j.f86771d);
        }
        return sb2.toString();
    }

    @NonNull
    public g0 addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @NonNull
    public g0 excludeChildren(@NonNull Class<?> cls, boolean z10) {
        this.mTargetTypeChildExcludes = g(this.mTargetTypeChildExcludes, cls, z10);
        return this;
    }

    @NonNull
    public g0 excludeTarget(@NonNull String str, boolean z10) {
        this.mTargetNameExcludes = f(this.mTargetNameExcludes, str, z10);
        return this;
    }

    @NonNull
    public g0 removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public g0 excludeTarget(@NonNull Class<?> cls, boolean z10) {
        this.mTargetTypeExcludes = g(this.mTargetTypeExcludes, cls, z10);
        return this;
    }

    @NonNull
    public g0 removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public g0 addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public g0(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f19486c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jK = h1.n.k(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jK >= 0) {
            setDuration(jK);
        }
        long jK2 = h1.n.k(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jK2 > 0) {
            setStartDelay(jK2);
        }
        int iL = h1.n.l(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iL > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, iL));
        }
        String strM = h1.n.m(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM != null) {
            setMatchOrder(s(strM));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
