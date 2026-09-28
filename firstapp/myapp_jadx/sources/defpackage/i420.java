package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.LoyaltyMissionBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class i420 implements qti {
    public static final AtomicBoolean F = new AtomicBoolean(false);
    public static final Set<String> G = wi80.b("BetslipActivity");
    public static final Set<String> H = ay0.V(new String[]{"BetSuccessfulPageFragment", "BuildAndGoRunningPageDialog"});
    public final ConcurrentHashMap<Class<?>, String> A = new ConcurrentHashMap<>();
    public volatile String B;
    public volatile boolean C;
    public final Set<Activity> D;
    public final wwd0 E;
    public final rym a;
    public final mq00 b;
    public final udh0 c;
    public final k25 d;
    public final j1b e;
    public final psm f;
    public final rdd0 i;
    public final uqm v;
    public final e85 w;
    public final mrm y;
    public final u350 z;

    public static final class a {
        public static void a(boolean z) {
            i420.F.set(z);
        }
    }

    public i420(rym rymVar, mq00 mq00Var, udh0 udh0Var, k25 k25Var, j1b j1bVar, psm psmVar, rdd0 rdd0Var, uqm uqmVar, e85 e85Var, mrm mrmVar, u350 u350Var) {
        this.a = rymVar;
        this.b = mq00Var;
        this.c = udh0Var;
        this.d = k25Var;
        this.e = j1bVar;
        this.f = psmVar;
        this.i = rdd0Var;
        this.v = uqmVar;
        this.w = e85Var;
        this.y = mrmVar;
        this.z = u350Var;
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        this.D = setNewSetFromMap;
        this.E = xwd0.a(0);
    }

    public static boolean b(FragmentManager fragmentManager) {
        for (Fragment fragment : fragmentManager.c.f()) {
            if (fragment.isAdded() && !fragment.isHidden() && (fragment instanceof d)) {
                if (H.contains(fragment.getClass().getSimpleName())) {
                    return true;
                }
            }
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            childFragmentManager.getClass();
            if (b(childFragmentManager)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:350:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v30 java.lang.Object, still in use, count: 2, list:
          (r3v30 java.lang.Object) from 0x008e: PHI (r3 I:??) = (r3v19 java.lang.Object), (r3v30 java.lang.Object) binds: [B:24:0x008d, B:348:0x008e] A[DONT_GENERATE, DONT_INLINE]
          (r3v30 java.lang.Object) from 0x0082: CHECK_CAST (l44) (r3v30 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object a(android.app.Activity r13, final defpackage.m420 r14, defpackage.x1b r15) {
        /*
            Method dump skipped, instruction units count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i420.a(android.app.Activity, m420, x1b):java.lang.Object");
    }

    public final void c(m420 m420Var, cxt cxtVar) {
        Activity activityE = oti.c().e();
        if (activityE == null || activityE.isFinishing()) {
            this.a.k(m420Var.b);
            return;
        }
        by3 by3Var = cxtVar.c.contains(xtv.a) ? by3.c : by3.b;
        f(BetslipThemeMissionBottomSheetActivity.class, m420Var.b);
        int i = BetslipThemeMissionBottomSheetActivity.d;
        Intent intent = new Intent(activityE, (Class<?>) BetslipThemeMissionBottomSheetActivity.class);
        intent.putExtra("mission_variant", by3Var);
        activityE.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public final void d(m420 m420Var, boolean z, cxt cxtVar) {
        Integer numValueOf;
        Object next;
        List<Long> list;
        List<Long> list2;
        Activity activityE = oti.c().e();
        if (activityE == null || activityE.isFinishing()) {
            this.a.k(m420Var.b);
            return;
        }
        f(LoyaltyMissionBottomSheetActivity.class, m420Var.b);
        Long l = cxtVar.a;
        LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument regularMission = null;
        if (l != null) {
            long jLongValue = l.longValue();
            if (-2147483648L > jLongValue || jLongValue >= 2147483648L) {
                l = null;
            }
            if (l != null) {
                numValueOf = Integer.valueOf((int) l.longValue());
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        wsv wsvVar = z ? wsv.b : wsv.a;
        List<pxt> list3 = cxtVar.d;
        if (list3 != null && !list3.isEmpty()) {
            if (!list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    if (!((pxt) it.next()).g) {
                    }
                }
            }
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                pxt pxtVar = (pxt) next;
                if (pxtVar.g && (list2 = pxtVar.f) != null && !list2.isEmpty()) {
                    break;
                }
            }
            pxt pxtVar2 = (pxt) next;
            if (pxtVar2 != null && (list = pxtVar2.f) != null) {
                regularMission = new LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission(pxtVar2.c, list, pxtVar2.b, LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.GamesCarouselMission.b.REWARDS);
            }
            if (regularMission == null) {
                regularMission = new LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.RegularMission(wsvVar, numValueOf);
            }
            int i = LoyaltyMissionBottomSheetActivity.b;
            LoyaltyMissionBottomSheetActivity.a.a(regularMission, activityE);
            return;
        }
        int i2 = LoyaltyMissionBottomSheetActivity.b;
        LoyaltyMissionBottomSheetActivity.a.a(new LoyaltyMissionBottomSheetActivity.MissionBottomSheetArgument.RegularMission(wsvVar, numValueOf), activityE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    public final void e(m420 m420Var, boolean z) {
        Long lValueOf;
        List list;
        ArrayList arrayList;
        pxt pxtVar;
        JSONObject jSONObject = m420Var.c;
        String str = m420Var.b;
        JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("data") : null;
        if (jSONObjectOptJSONObject == null) {
            lValueOf = null;
        } else {
            JSONObject jSONObject2 = jSONObjectOptJSONObject.has("missionId") ? jSONObjectOptJSONObject : null;
            if (jSONObject2 != null) {
                lValueOf = Long.valueOf(jSONObject2.optLong("missionId"));
            } else {
                lValueOf = null;
            }
        }
        boolean zOptBoolean = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("isWorldCupPass", false) : false;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("rewardTypes") : null;
        if (jSONArrayOptJSONArray == null) {
            list = m2g.a;
        } else {
            IntRange intRangeN = f.n(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList2 = new ArrayList(l48.r(intRangeN, 10));
            Iterator<Integer> it = intRangeN.iterator();
            while (((mwo) it).c) {
                String strOptString = jSONArrayOptJSONArray.optString(((zvo) it).nextInt());
                strOptString.getClass();
                arrayList2.add(fjf.b(strOptString));
            }
            list = arrayList2;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("rewardList") : null;
        if (jSONArrayOptJSONArray2 == null) {
            arrayList = null;
        } else {
            IntRange intRangeN2 = f.n(0, jSONArrayOptJSONArray2.length());
            arrayList = new ArrayList();
            Iterator<Integer> it2 = intRangeN2.iterator();
            while (((mwo) it2).c) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(((zvo) it2).nextInt());
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("rewardType");
                    strOptString2.getClass();
                    xtv xtvVarB = fjf.b(strOptString2);
                    long jOptLong = jSONObjectOptJSONObject2.optLong("rewardAmount");
                    String strOptString3 = jSONObjectOptJSONObject2.optString("currency");
                    strOptString3.getClass();
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("realSportBizTypeIdList");
                    ngs ngsVarA = jSONArrayOptJSONArray3 != null ? pxt.a.a(jSONArrayOptJSONArray3) : null;
                    JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject2.optJSONArray("instantVirtualBizTypeIdList");
                    ngs ngsVarA2 = jSONArrayOptJSONArray4 != null ? pxt.a.a(jSONArrayOptJSONArray4) : null;
                    JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject2.optJSONArray("gameBizTypeIdList");
                    pxtVar = new pxt(xtvVarB, jOptLong, strOptString3, ngsVarA, ngsVarA2, jSONArrayOptJSONArray5 != null ? pxt.a.a(jSONArrayOptJSONArray5) : null, jSONObjectOptJSONObject2.optBoolean("onlyGameSupportFreeBetGift", false));
                } else {
                    pxtVar = null;
                }
                if (pxtVar != null) {
                    arrayList.add(pxtVar);
                }
            }
        }
        cxt cxtVar = new cxt(lValueOf, zOptBoolean, list, arrayList);
        rym rymVar = this.a;
        if (z && zOptBoolean) {
            Activity activityE = oti.c().e();
            if (activityE == null || activityE.isFinishing()) {
                rymVar.k(str);
                return;
            }
            f(WorldCupPassAnnouncementActivity.class, str);
            int i = WorldCupPassAnnouncementActivity.d;
            activityE.startActivity(WorldCupPassAnnouncementActivity.a.a(activityE, t1k0.b, null));
            return;
        }
        if (!z && lValueOf != null && this.w.a.get() == lValueOf.longValue()) {
            rymVar.k(str);
            return;
        }
        if (Intrinsics.g(rymVar.a(), u420.l.a)) {
            rymVar.k(str);
            return;
        }
        boolean z2 = z && list.contains(xtv.b);
        if (!m420Var.c.optBoolean("debug", false)) {
            c420 c420Var = new c420(z2, this, m420Var, cxtVar, z);
            mq00 mq00Var = this.b;
            ej5.c(mq00Var.g, null, null, new wq00(mq00Var, z, c420Var, null), 3);
        } else if (z2) {
            c(m420Var, cxtVar);
        } else {
            d(m420Var, z, cxtVar);
        }
    }

    public final void f(Class<?> cls, String str) {
        this.A.put(cls, str);
    }

    @Override // defpackage.qti
    public final void onActivityCreated(Activity activity) {
        activity.getClass();
        this.D.add(activity);
        wwd0 wwd0Var = this.E;
        wwd0Var.k(null, Integer.valueOf(((Number) wwd0Var.getValue()).intValue() + 1));
    }

    @Override // defpackage.qti
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        this.D.remove(activity);
        wwd0 wwd0Var = this.E;
        wwd0Var.k(null, Integer.valueOf(((Number) wwd0Var.getValue()).intValue() + 1));
        String strRemove = this.A.remove(activity.getClass());
        if (strRemove != null) {
            this.a.c(strRemove);
        }
    }

    @Override // defpackage.qti
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        wwd0 wwd0Var = this.E;
        wwd0Var.k(null, Integer.valueOf(((Number) wwd0Var.getValue()).intValue() + 1));
    }

    @Override // defpackage.qti
    public final void onBecameBackground() {
    }

    @Override // defpackage.qti
    public final void onBecameForeground() {
    }
}
