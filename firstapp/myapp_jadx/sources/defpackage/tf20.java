package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.sporty.android.book.domain.entity.BetMarketOptionType;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.LiveEventDataInPreMatch;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchLoadMoreData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchLoadingState;
import com.sportybet.plugin.realsports.prematch.data.PreMatchMarketTitleData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData;
import com.sportybet.plugin.realsports.prematch.data.TournamentTitleData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class tf20 extends x<PreMatchSectionData, RecyclerView.d0> implements k0e0.a {
    public static final LinkedHashMap E = new LinkedHashMap();
    public static final LinkedHashMap F = new LinkedHashMap();
    public static final Object G = new Object();
    public RecyclerView A;
    public RegularMarketRule B;
    public List<? extends PreMatchSectionData> C;
    public ezj0 D;
    public final /* synthetic */ vfh0 b;
    public final uqm c;
    public final xhh0 d;
    public final yi20 e;
    public final zi20 f;
    public final a8z i;
    public final muh v;
    public final PreMatchSportActivity.f w;
    public final List<String> y;
    public final ity z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[rhh0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rhh0 rhh0Var = rhh0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[phh0.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                phh0 phh0Var = phh0.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr2;
            int[] iArr3 = new int[BetMarketOptionType.values().length];
            try {
                iArr3[BetMarketOptionType.UP_MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[BetMarketOptionType.OVER_UNDER_EARLY_GOALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr3;
        }
    }

    public static final class b {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:65:0x0141  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
        public final void a(String str, boolean z) {
            Object value;
            lk50.c cVar;
            Object arrayList;
            Object obj;
            Object obj2;
            int iIntValue;
            str.getClass();
            PreMatchSportActivity.f fVar = tf20.this.w;
            fVar.getClass();
            PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
            LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
            jk20 jk20VarI1 = preMatchSportActivity.I1();
            if (!z) {
                jk20VarI1.y1(str);
                return;
            }
            tj20 tj20Var = jk20VarI1.a;
            tj20Var.getClass();
            c9p c9pVar = (c9p) tj20Var.i.get(str);
            if (c9pVar != null) {
                c9pVar.cancel((CancellationException) null);
            }
            wwd0 wwd0Var = jk20VarI1.H;
            do {
                value = wwd0Var.getValue();
                lk50 lk50Var = (lk50) value;
                if (!(lk50Var instanceof lk50.c)) {
                    return;
                }
                cVar = (lk50.c) lk50Var;
                arrayList = (List) cVar.a;
                ArrayList arrayListA = kw5.a(arrayList);
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof TournamentTitleData) {
                        arrayListA.add(obj3);
                    }
                }
                int size = arrayListA.size();
                int i = 0;
                int i2 = 0;
                do {
                    if (i2 >= size) {
                        obj = null;
                        break;
                    } else {
                        obj = arrayListA.get(i2);
                        i2++;
                    }
                } while (!Intrinsics.g(((TournamentTitleData) obj).getTournamentId(), str));
                TournamentTitleData tournamentTitleData = (TournamentTitleData) obj;
                if (tournamentTitleData != null) {
                    int iIndexOf = arrayList.indexOf(tournamentTitleData);
                    Integer numValueOf = Integer.valueOf(iIndexOf);
                    if (iIndexOf < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue2 = numValueOf.intValue();
                        List listSubList = arrayList.subList(iIntValue2, arrayList.size());
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : listSubList) {
                            if (obj4 instanceof TournamentTitleData) {
                                arrayList2.add(obj4);
                            }
                        }
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        do {
                            if (i3 >= size2) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = arrayList2.get(i3);
                                i3++;
                            }
                        } while (Intrinsics.g(((TournamentTitleData) obj2).getTournamentId(), str));
                        TournamentTitleData tournamentTitleData2 = (TournamentTitleData) obj2;
                        if (tournamentTitleData2 != null) {
                            int iIndexOf2 = arrayList.indexOf(tournamentTitleData2);
                            Integer numValueOf2 = Integer.valueOf(iIndexOf2);
                            if (iIndexOf2 < 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                iIntValue = numValueOf2.intValue();
                            } else {
                                iIntValue = -1;
                            }
                        } else {
                            iIntValue = -1;
                        }
                        ArrayList arrayList3 = new ArrayList((Collection) arrayList);
                        arrayList3.set(iIntValue2, TournamentTitleData.copy$default(tournamentTitleData, 0, null, null, null, 0, false, false, false, false, false, false, false, false, false, false, null, null, null, 262111, null));
                        arrayList = new ArrayList();
                        int size3 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Object obj5 = arrayList3.get(i4);
                            i4++;
                            int i5 = i + 1;
                            if (i < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            if (iIntValue == -1) {
                                if (i < iIntValue2 + 1) {
                                    arrayList.add(obj5);
                                }
                            } else if (i < iIntValue2 + 1 || i > iIntValue - 1) {
                                arrayList.add(obj5);
                            }
                            i = i5;
                        }
                    }
                }
            } while (!wwd0Var.g(value, new lk50.c(arrayList, cVar.b)));
        }
    }

    public static final class c {
        public c() {
        }
    }

    public static final class d implements zd20 {
        public d() {
        }

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
        @Override // defpackage.zd20
        public final void a() {
            ity ityVar = tf20.this.z;
            nty.c cVar = nty.c.a;
            ityVar.getClass();
            cVar.getClass();
            if (cVar.equals(cVar)) {
                ety etyVar = ityVar.e;
                avy avyVar = avy.a;
                etyVar.a();
            }
        }
    }

    public static final class e {
        public e() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf20(PreMatchSportActivity preMatchSportActivity, uqm uqmVar, xhh0 xhh0Var, yi20 yi20Var, zi20 zi20Var, a8z a8zVar, muh muhVar, PreMatchSportActivity.f fVar, List list, ity ityVar) {
        super(wi20.a);
        a8zVar.getClass();
        muhVar.getClass();
        ityVar.getClass();
        this.b = new vfh0(preMatchSportActivity, "prematch");
        this.c = uqmVar;
        this.d = xhh0Var;
        this.e = yi20Var;
        this.f = zi20Var;
        this.i = a8zVar;
        this.v = muhVar;
        this.w = fVar;
        this.y = list;
        this.z = ityVar;
        this.C = new ArrayList();
    }

    public static boolean l(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        return bigDecimal.compareTo(bigDecimal3) > 0 && bigDecimal2.compareTo(bigDecimal3) > 0;
    }

    public static boolean m(PreMatchSectionData preMatchSectionData, boolean z, boolean z2) {
        if (preMatchSectionData instanceof LiveEventDataInPreMatch) {
            LiveEventDataInPreMatch liveEventDataInPreMatch = (LiveEventDataInPreMatch) preMatchSectionData;
            if (l(liveEventDataInPreMatch.getOddsMin(), liveEventDataInPreMatch.getOddsMax()) && z2) {
                return true;
            }
            return !l(liveEventDataInPreMatch.getOddsMin(), liveEventDataInPreMatch.getOddsMax()) && z;
        }
        if (preMatchSectionData instanceof PreMatchEventData) {
            PreMatchEventData preMatchEventData = (PreMatchEventData) preMatchSectionData;
            if (l(preMatchEventData.getOddsMin(), preMatchEventData.getOddsMax()) && z2) {
                return true;
            }
            return !l(preMatchEventData.getOddsMin(), preMatchEventData.getOddsMax()) && z;
        }
        if (!(preMatchSectionData instanceof PreMatchMarketTitleData)) {
            return false;
        }
        PreMatchMarketTitleData preMatchMarketTitleData = (PreMatchMarketTitleData) preMatchSectionData;
        if (l(preMatchMarketTitleData.getOddsMin(), preMatchMarketTitleData.getOddsMax()) && z2) {
            return true;
        }
        return !l(preMatchMarketTitleData.getOddsMin(), preMatchMarketTitleData.getOddsMax()) && z;
    }

    @Override // k0e0.a
    public final boolean d(int i) {
        return getItemViewType(i) == 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        if (i < 0 || i >= getItemCount()) {
            return -1;
        }
        return getItem(i).getViewType();
    }

    @Override // androidx.recyclerview.widget.x
    public final void i(List<PreMatchSectionData> list) {
        super.i(n(list));
    }

    @Override // androidx.recyclerview.widget.x
    public final void j(List<PreMatchSectionData> list, Runnable runnable) {
        super.j(n(list), runnable);
    }

    public final ArrayList k(RegularMarketRule regularMarketRule, List list, BetMarketOptionType betMarketOptionType) {
        boolean zM;
        boolean zM2;
        boolean zM3;
        whh0 whh0VarC = this.d.c(regularMarketRule, (String) ld80.e(ld80.j(CollectionsKt.K(list), new sf20())), false);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                if (arrayList.isEmpty()) {
                    arrayList.add(new PreMatchLoadMoreData(3, PreMatchLoadingState.NO_MORE, (whh0VarC != null ? whh0VarC.b : null) != null || yay.f(regularMarketRule), null, null, 24, null));
                }
                return arrayList;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            PreMatchSectionData preMatchSectionData = (PreMatchSectionData) next;
            if (preMatchSectionData instanceof LiveEventDataInPreMatch) {
                int i3 = a.b[betMarketOptionType.ordinal()];
                if (i3 == 1) {
                    phh0 phh0Var = whh0VarC != null ? whh0VarC.b : null;
                    int i4 = phh0Var == null ? -1 : a.a[phh0Var.ordinal()];
                    if (i4 == -1) {
                        zM3 = false;
                    } else if (i4 == 1) {
                        int iOrdinal = whh0VarC.a.ordinal();
                        if (iOrdinal == 0) {
                            LiveEventDataInPreMatch liveEventDataInPreMatch = (LiveEventDataInPreMatch) preMatchSectionData;
                            zM3 = m(liveEventDataInPreMatch, liveEventDataInPreMatch.getHaveOneUpMarket(), liveEventDataInPreMatch.getHaveActiveOneUpMarket());
                        } else {
                            if (iOrdinal != 1) {
                                uhc.a();
                                return null;
                            }
                            LiveEventDataInPreMatch liveEventDataInPreMatch2 = (LiveEventDataInPreMatch) preMatchSectionData;
                            zM3 = m(liveEventDataInPreMatch2, liveEventDataInPreMatch2.getHaveDCOneUpMarket(), liveEventDataInPreMatch2.getHaveActiveDCOneUpMarket());
                        }
                    } else {
                        if (i4 != 2) {
                            uhc.a();
                            return null;
                        }
                        LiveEventDataInPreMatch liveEventDataInPreMatch3 = (LiveEventDataInPreMatch) preMatchSectionData;
                        zM3 = m(liveEventDataInPreMatch3, liveEventDataInPreMatch3.getHaveTwoUpMarket(), liveEventDataInPreMatch3.getHaveActiveTwoUpMarket());
                    }
                    if (zM3) {
                        arrayList.add(preMatchSectionData);
                    }
                } else {
                    if (i3 != 2) {
                        uhc.a();
                        return null;
                    }
                    if (yay.f(regularMarketRule)) {
                        LiveEventDataInPreMatch liveEventDataInPreMatch4 = (LiveEventDataInPreMatch) preMatchSectionData;
                        if (m(liveEventDataInPreMatch4, liveEventDataInPreMatch4.getHaveOUEarlyGoalsMarket(), liveEventDataInPreMatch4.getHaveActiveOUEarlyGoalsMarket())) {
                            arrayList.add(preMatchSectionData);
                        }
                    }
                }
            } else if (preMatchSectionData instanceof PreMatchEventData) {
                int i5 = a.b[betMarketOptionType.ordinal()];
                if (i5 == 1) {
                    phh0 phh0Var2 = whh0VarC != null ? whh0VarC.b : null;
                    int i6 = phh0Var2 == null ? -1 : a.a[phh0Var2.ordinal()];
                    if (i6 == -1) {
                        zM2 = false;
                    } else if (i6 == 1) {
                        int iOrdinal2 = whh0VarC.a.ordinal();
                        if (iOrdinal2 == 0) {
                            PreMatchEventData preMatchEventData = (PreMatchEventData) preMatchSectionData;
                            zM2 = m(preMatchEventData, preMatchEventData.getHaveOneUpMarket(), preMatchEventData.getHaveActiveOneUpMarket());
                        } else {
                            if (iOrdinal2 != 1) {
                                uhc.a();
                                return null;
                            }
                            PreMatchEventData preMatchEventData2 = (PreMatchEventData) preMatchSectionData;
                            zM2 = m(preMatchEventData2, preMatchEventData2.getHaveDCOneUpMarket(), preMatchEventData2.getHaveActiveDCOneUpMarket());
                        }
                    } else {
                        if (i6 != 2) {
                            uhc.a();
                            return null;
                        }
                        PreMatchEventData preMatchEventData3 = (PreMatchEventData) preMatchSectionData;
                        zM2 = m(preMatchEventData3, preMatchEventData3.getHaveTwoUpMarket(), preMatchEventData3.getHaveActiveTwoUpMarket());
                    }
                    if (zM2) {
                        arrayList.add(preMatchSectionData);
                    }
                } else {
                    if (i5 != 2) {
                        uhc.a();
                        return null;
                    }
                    if (yay.f(regularMarketRule)) {
                        PreMatchEventData preMatchEventData4 = (PreMatchEventData) preMatchSectionData;
                        if (m(preMatchEventData4, preMatchEventData4.getHaveOUEarlyGoalsMarket(), preMatchEventData4.getHaveActiveOUEarlyGoalsMarket())) {
                            arrayList.add(preMatchSectionData);
                        }
                    }
                }
            } else if (preMatchSectionData instanceof PreMatchMarketTitleData) {
                int i7 = a.b[betMarketOptionType.ordinal()];
                if (i7 == 1) {
                    phh0 phh0Var3 = whh0VarC != null ? whh0VarC.b : null;
                    int i8 = phh0Var3 == null ? -1 : a.a[phh0Var3.ordinal()];
                    if (i8 == -1) {
                        zM = false;
                    } else if (i8 == 1) {
                        int iOrdinal3 = whh0VarC.a.ordinal();
                        if (iOrdinal3 == 0) {
                            PreMatchMarketTitleData preMatchMarketTitleData = (PreMatchMarketTitleData) preMatchSectionData;
                            zM = m(preMatchMarketTitleData, preMatchMarketTitleData.getHaveOneUpMarket(), preMatchMarketTitleData.getHaveActiveOneUpMarket());
                        } else {
                            if (iOrdinal3 != 1) {
                                uhc.a();
                                return null;
                            }
                            PreMatchMarketTitleData preMatchMarketTitleData2 = (PreMatchMarketTitleData) preMatchSectionData;
                            zM = m(preMatchMarketTitleData2, preMatchMarketTitleData2.getHaveDCOneUpMarket(), preMatchMarketTitleData2.getHaveActiveDCOneUpMarket());
                        }
                    } else {
                        if (i8 != 2) {
                            uhc.a();
                            return null;
                        }
                        PreMatchMarketTitleData preMatchMarketTitleData3 = (PreMatchMarketTitleData) preMatchSectionData;
                        zM = m(preMatchMarketTitleData3, preMatchMarketTitleData3.getHaveTwoUpMarket(), preMatchMarketTitleData3.getHaveActiveTwoUpMarket());
                    }
                    if (zM) {
                        arrayList.add(preMatchSectionData);
                    }
                } else {
                    if (i7 != 2) {
                        uhc.a();
                        return null;
                    }
                    if (yay.f(regularMarketRule)) {
                        PreMatchMarketTitleData preMatchMarketTitleData4 = (PreMatchMarketTitleData) preMatchSectionData;
                        if (m(preMatchMarketTitleData4, preMatchMarketTitleData4.getHaveOUEarlyGoalsMarket(), preMatchMarketTitleData4.getHaveActiveOUEarlyGoalsMarket())) {
                            arrayList.add(preMatchSectionData);
                        }
                    }
                }
            } else {
                if (arrayList.isEmpty() && (preMatchSectionData instanceof PreMatchLoadMoreData)) {
                    PreMatchLoadMoreData preMatchLoadMoreData = (PreMatchLoadMoreData) preMatchSectionData;
                    if ((whh0VarC != null ? whh0VarC.b : null) == null && !yay.f(regularMarketRule)) {
                        z = false;
                    }
                    preMatchLoadMoreData.setShowNoMarketOptionEvent(z);
                }
                arrayList.add(preMatchSectionData);
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX WARN: Code duplicated, block: B:17:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01e5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.g(r2, defpackage.slc.d) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData> n(java.util.List<? extends com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData> r36) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf20.n(java.util.List):java.util.List");
    }

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
    public final void o(final RegularMarketRule regularMarketRule) {
        Object obj;
        androidx.recyclerview.widget.d<T> dVar = this.a;
        List<T> list = dVar.f;
        list.getClass();
        this.b.b(regularMarketRule, list, false);
        Collection collection = dVar.f;
        collection.getClass();
        whh0 whh0VarC = this.d.c(regularMarketRule, (String) ld80.e(ld80.j(CollectionsKt.K(collection), new sf20())), false);
        boolean z = (whh0VarC != null ? whh0VarC.b : null) != null;
        boolean zF = yay.f(regularMarketRule);
        if (z || zF) {
            List list2 = dVar.f;
            list2.getClass();
            super.j(k(regularMarketRule, list2, z ? BetMarketOptionType.UP_MARKET : BetMarketOptionType.OVER_UNDER_EARLY_GOALS), new Runnable() { // from class: qf20
                @Override // java.lang.Runnable
                public final void run() {
                    RegularMarketRule regularMarketRule2 = regularMarketRule;
                    tf20 tf20Var = this.a;
                    tf20Var.p(regularMarketRule2);
                    tf20Var.notifyDataSetChanged();
                }
            });
            return;
        }
        boolean z2 = CollectionsKt.d0(this.C) instanceof PreMatchLoadMoreData;
        List<? extends PreMatchSectionData> list3 = this.C;
        if (z2) {
            obj = list3;
            ArrayList arrayListC0 = CollectionsKt.C0(list3);
            Object objRemove = arrayListC0.remove(arrayListC0.size() - 1);
            objRemove.getClass();
            arrayListC0.add(PreMatchLoadMoreData.copy$default((PreMatchLoadMoreData) objRemove, 0, null, false, null, null, 27, null));
            obj = arrayListC0;
        }
        obj = list3;
        super.j(obj, new Runnable() { // from class: rf20
            @Override // java.lang.Runnable
            public final void run() {
                RegularMarketRule regularMarketRule2 = regularMarketRule;
                tf20 tf20Var = this.a;
                tf20Var.p(regularMarketRule2);
                tf20Var.notifyDataSetChanged();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onAttachedToRecyclerView(recyclerView);
        this.A = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0196  */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        mfb0 mfb0VarE;
        RegularMarketRule selectedMarket;
        int i2;
        RegularMarketRule selectedMarket2;
        int i3;
        RegularMarketRule selectedMarket3;
        RecyclerView.d0 d0Var2 = d0Var;
        d0Var2.getClass();
        PreMatchSectionData item = getItem(i);
        if (item == null) {
            return;
        }
        int viewType = item.getViewType();
        if (viewType == 0) {
            if (!(d0Var2 instanceof ggg0)) {
                d0Var2 = null;
            }
            ggg0 ggg0Var = (ggg0) d0Var2;
            if (ggg0Var != null) {
                boolean z = i != 0;
                TournamentTitleData tournamentTitleData = (TournamentTitleData) (!(item instanceof TournamentTitleData) ? null : item);
                ggg0Var.a(item, z, this.d.c(this.B, tournamentTitleData != null ? tournamentTitleData.getSportId() : null, false), this.D);
                return;
            }
            return;
        }
        if (viewType == 1) {
            if (!(d0Var2 instanceof xms)) {
                d0Var2 = null;
            }
            xms xmsVar = (xms) d0Var2;
            if (xmsVar != null) {
                Context context = xmsVar.c;
                iid0 iid0Var = xmsVar.a;
                if (!(item instanceof LiveEventDataInPreMatch)) {
                    item = null;
                }
                LiveEventDataInPreMatch liveEventDataInPreMatch = (LiveEventDataInPreMatch) item;
                if (liveEventDataInPreMatch == null || (mfb0VarE = lfb0.d().e(liveEventDataInPreMatch.getSportId())) == null || (selectedMarket = liveEventDataInPreMatch.getSelectedMarket()) == null) {
                    return;
                }
                FrameLayout frameLayout = iid0Var.a;
                TextView textView = iid0Var.d;
                AppCompatImageView appCompatImageView = iid0Var.L;
                ImageView imageView = iid0Var.O;
                ImageView imageView2 = iid0Var.B;
                ImageView imageView3 = iid0Var.N;
                ImageView imageView4 = iid0Var.D;
                frameLayout.setTag(liveEventDataInPreMatch.getEvent());
                iid0Var.E.setVisibility(!liveEventDataInPreMatch.getShowTitle() ? 0 : 8);
                imageView4.setVisibility(nkd0.a.a.a(liveEventDataInPreMatch.getEvent()) ? 0 : 8);
                context.getClass();
                imageView4.setImageDrawable(gug0.e(context));
                Context context2 = imageView3.getContext();
                context2.getClass();
                imageView3.setImageDrawable(gug0.f(context2));
                imageView3.setVisibility(liveEventDataInPreMatch.getEvent().topTeam ? 0 : 8);
                Context context3 = iid0Var.a.getContext();
                context3.getClass();
                imageView2.setImageDrawable(gug0.b(context3));
                imageView2.setVisibility(liveEventDataInPreMatch.getEvent().oddsBoost ? 0 : 8);
                Context context4 = imageView.getContext();
                context4.getClass();
                imageView.setImageDrawable(gug0.g(context4));
                imageView.setVisibility(b3.S(liveEventDataInPreMatch.getEvent().eventId) ? 0 : 8);
                appCompatImageView.setVisibility(liveEventDataInPreMatch.getEvent().showStats() ? 0 : 8);
                appCompatImageView.setOnClickListener(new gms(0, xmsVar, liveEventDataInPreMatch));
                ArrayList arrayListA = mfb0VarE.A(liveEventDataInPreMatch.getEvent().setScore, liveEventDataInPreMatch.getEvent().pointScore, liveEventDataInPreMatch.getEvent().gameScore);
                GridLayout gridLayout = iid0Var.C;
                gridLayout.removeAllViews();
                gridLayout.setRowCount(2);
                gridLayout.setColumnCount(arrayListA.size() / 2);
                int iA = sbz.a(0, arrayListA.size() - 1, 2);
                if (iA >= 0) {
                    int i4 = 0;
                    while (true) {
                        Object obj = arrayListA.get(i4);
                        obj.getClass();
                        gridLayout.addView(xmsVar.c(i4, context, (String) obj));
                        if (i4 == iA) {
                            break;
                        } else {
                            i4 += 2;
                        }
                    }
                }
                kotlin.ranges.c cVarL = f.l(2, f.n(1, arrayListA.size()));
                int i5 = cVarL.a;
                int i6 = cVarL.b;
                int i7 = cVarL.c;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        Object obj2 = arrayListA.get(i5);
                        obj2.getClass();
                        gridLayout.addView(xmsVar.c(i5, context, (String) obj2));
                        if (i5 == i6) {
                            break;
                        } else {
                            i5 += i7;
                        }
                    }
                }
                boolean zEquals = "sr:sport:1".equals(mfb0VarE.getId());
                LiveTimerTextView liveTimerTextView = iid0Var.M;
                if (zEquals) {
                    String str = liveEventDataInPreMatch.getEvent().eventId;
                    str.getClass();
                    liveTimerTextView.setLiveTime(str, liveEventDataInPreMatch.getEvent().playedSeconds, liveEventDataInPreMatch.getEvent().matchStatus, liveEventDataInPreMatch.getEvent().status);
                } else {
                    String str2 = liveEventDataInPreMatch.getEvent().playedSeconds;
                    String str3 = liveEventDataInPreMatch.getEvent().period;
                    liveTimerTextView.setStaticLabel(mfb0VarE.p(str2, liveEventDataInPreMatch.getEvent().remainingTimeInPeriod, liveEventDataInPreMatch.getEvent().matchStatus));
                }
                int i8 = liveEventDataInPreMatch.getEvent().commentsNum;
                if (i8 > 0) {
                    textView.setVisibility(0);
                    textView.setText(sn5.b(context, R.string.live__chat_count, i8 > 999 ? "999+" : Integer.valueOf(i8)));
                    i2 = 8;
                } else {
                    i2 = 8;
                    textView.setVisibility(8);
                }
                iid0Var.e.setText(liveEventDataInPreMatch.getEvent().homeTeamName);
                iid0Var.b.setText(liveEventDataInPreMatch.getEvent().awayTeamName);
                TextView textView2 = iid0Var.v;
                Event event = liveEventDataInPreMatch.getEvent();
                liveEventDataInPreMatch.getTournamentId();
                textView2.setText(b3.M(event));
                iid0Var.K.setVisibility(liveEventDataInPreMatch.getEvent().hasLiveStream() ? 0 : i2);
                iid0Var.I.setVisibility(liveEventDataInPreMatch.getEvent().hasAudioStream() ? 0 : i2);
                iid0Var.J.setVisibility(liveEventDataInPreMatch.getEvent().hasGift() ? 0 : i2);
                u8z u8zVar = (u8z) xmsVar.v.getValue();
                ums umsVar = new ums(liveEventDataInPreMatch, xmsVar);
                u8zVar.getClass();
                u8zVar.f = umsVar;
                Event event2 = liveEventDataInPreMatch.getEvent();
                List<Market> filteredMarketList = liveEventDataInPreMatch.getFilteredMarketList();
                if (filteredMarketList == null) {
                    filteredMarketList = liveEventDataInPreMatch.getEvent().markets;
                }
                xmsVar.b(event2, filteredMarketList, selectedMarket, liveEventDataInPreMatch.getOddsMin(), liveEventDataInPreMatch.getOddsMax(), i);
                return;
            }
            return;
        }
        if (viewType != 2) {
            if (viewType == 4) {
                if (!(d0Var2 instanceof mg20)) {
                    d0Var2 = null;
                }
                mg20 mg20Var = (mg20) d0Var2;
                if (mg20Var != null) {
                    tjd0 tjd0Var = mg20Var.a;
                    if (!(item instanceof PreMatchMarketTitleData)) {
                        item = null;
                    }
                    PreMatchMarketTitleData preMatchMarketTitleData = (PreMatchMarketTitleData) item;
                    if (preMatchMarketTitleData == null || (selectedMarket3 = preMatchMarketTitleData.getSelectedMarket()) == null) {
                        return;
                    }
                    TextView textView3 = tjd0Var.b;
                    long startTime = preMatchMarketTitleData.getStartTime();
                    String languageCode = tf20.this.c.getLanguageCode();
                    languageCode.getClass();
                    textView3.setText(bwf0.c(startTime, languageCode));
                    mg20Var.a(selectedMarket3);
                    return;
                }
                return;
            }
            if (!(d0Var2 instanceof exs)) {
                d0Var2 = null;
            }
            exs exsVar = (exs) d0Var2;
            if (exsVar != null) {
                gjd0 gjd0Var = exsVar.a;
                if (!(item instanceof PreMatchLoadMoreData)) {
                    item = null;
                }
                PreMatchLoadMoreData preMatchLoadMoreData = (PreMatchLoadMoreData) item;
                if (preMatchLoadMoreData == null) {
                    return;
                }
                int i9 = exs.a.a[preMatchLoadMoreData.getLoadingState().ordinal()];
                if (i9 == 1) {
                    exsVar.b.invoke(Boolean.FALSE);
                    return;
                }
                if (i9 == 2) {
                    gjd0Var.e.setVisibility(0);
                    gjd0Var.d.setVisibility(8);
                    gjd0Var.c.setVisibility(8);
                    return;
                }
                if (i9 == 3) {
                    TextView textView4 = gjd0Var.d;
                    sn5.f(textView4, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]);
                    textView4.setVisibility(0);
                    textView4.setEnabled(true);
                    gjd0Var.e.setVisibility(8);
                    gjd0Var.c.setVisibility(8);
                    return;
                }
                if (i9 != 4) {
                    gjd0Var.e.setVisibility(8);
                    gjd0Var.d.setVisibility(8);
                    gjd0Var.c.setVisibility(8);
                    return;
                }
                if (preMatchLoadMoreData.getShowNoMarketOptionEvent()) {
                    LinearLayout linearLayout = gjd0Var.c;
                    TextView textView5 = gjd0Var.d;
                    linearLayout.setVisibility(0);
                    textView5.setVisibility(8);
                    textView5.setEnabled(false);
                    gjd0Var.e.setVisibility(8);
                    return;
                }
                LinearLayout linearLayout2 = gjd0Var.c;
                TextView textView6 = gjd0Var.d;
                linearLayout2.setVisibility(8);
                sn5.f(textView6, R.string.common_functions__no_more_games, new Object[0]);
                textView6.setVisibility(0);
                textView6.setEnabled(false);
                gjd0Var.e.setVisibility(8);
                return;
            }
            return;
        }
        if (!(d0Var2 instanceof ue20)) {
            d0Var2 = null;
        }
        final ue20 ue20Var = (ue20) d0Var2;
        if (ue20Var != null) {
            Context context5 = ue20Var.d;
            sjd0 sjd0Var = ue20Var.a;
            lty ltyVar = ue20Var.f;
            ltyVar.a();
            if (!(item instanceof PreMatchEventData)) {
                item = null;
            }
            final PreMatchEventData preMatchEventData = (PreMatchEventData) item;
            if (preMatchEventData == null || (selectedMarket2 = preMatchEventData.getSelectedMarket()) == null) {
                return;
            }
            ue20Var.c.a(ltyVar, preMatchEventData.getEvent(), selectedMarket2, new oe20(0, ue20Var.b, zd20.class, "onOneUpPromoTagClicked", "onOneUpPromoTagClicked()V", 0));
            View view = sjd0Var.E;
            AppCompatImageView appCompatImageView2 = sjd0Var.J;
            TextView textView7 = sjd0Var.c;
            AppCompatImageView appCompatImageView3 = sjd0Var.L;
            ImageView imageView5 = sjd0Var.D;
            view.setVisibility(preMatchEventData.getShowTitle() ? 8 : 0);
            imageView5.setVisibility(nkd0.a.a.a(preMatchEventData.getEvent()) ? 0 : 8);
            context5.getClass();
            int iA2 = fug0.a(hug0.a, context5);
            if (iA2 == 0) {
                i3 = R.drawable.spr_sport_sim_label;
            } else if (iA2 == 1) {
                i3 = R.drawable.spr_sport_sim_label_sw;
            } else if (iA2 == 2) {
                i3 = R.drawable.spr_sport_sim_label_es_mx;
            } else if (iA2 == 3) {
                i3 = R.drawable.spr_sport_sim_label_pt_br;
            } else if (iA2 == 4) {
                i3 = R.drawable.spr_sport_sim_label;
            } else {
                if (iA2 != 5) {
                    uhc.a();
                    return;
                }
                i3 = R.drawable.spr_sport_sim_label_fr_fr;
            }
            imageView5.setImageDrawable(gr0.a(context5, i3));
            sjd0Var.N.setVisibility(preMatchEventData.getEvent().topTeam ? 0 : 8);
            sjd0Var.B.setVisibility(preMatchEventData.getEvent().oddsBoost ? 0 : 8);
            sjd0Var.O.setVisibility(b3.S(preMatchEventData.getEvent().eventId) ? 0 : 8);
            appCompatImageView3.setVisibility(preMatchEventData.getEvent().showStats() ? 0 : 8);
            appCompatImageView3.setOnClickListener(new View.OnClickListener() { // from class: ee20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    tf20.d dVar = ue20Var.b;
                    Event event3 = preMatchEventData.getEvent();
                    dVar.getClass();
                    event3.getClass();
                    tf20.this.w.b(event3);
                }
            });
            sjd0Var.M.setText(bwf0.a.s(preMatchEventData.getEvent().estimateStartTime, false));
            sjd0Var.f.setText(b3.P(preMatchEventData.getEvent()));
            if (preMatchEventData.getHasTournamentTitleBar()) {
                textView7.setVisibility(8);
            } else {
                textView7.setText(sn5.b(context5, R.string.app_common__var_to_var, preMatchEventData.getCategoryName(), preMatchEventData.getTournamentName()));
                textView7.setVisibility(0);
            }
            sjd0Var.e.setText(preMatchEventData.getEvent().homeTeamName);
            sjd0Var.b.setText(preMatchEventData.getEvent().awayTeamName);
            TextView textView8 = sjd0Var.v;
            Event event3 = preMatchEventData.getEvent();
            preMatchEventData.getTournamentId();
            textView8.setText(b3.M(event3));
            sjd0Var.K.setVisibility(preMatchEventData.getEvent().hasLiveStream() ? 0 : 8);
            sjd0Var.I.setVisibility(preMatchEventData.getEvent().hasAudioStream() ? 0 : 8);
            appCompatImageView2.setVisibility(preMatchEventData.getEvent().hasGift() ? 0 : 8);
            if (appCompatImageView2.getVisibility() == 0) {
                LinkedHashSet linkedHashSet = mlk.a;
                String str4 = preMatchEventData.getEvent().eventId;
                str4.getClass();
                if (mlk.b(str4)) {
                    f00 f00Var = vgb0.a;
                    vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
                }
            }
            u8z u8zVar2 = (u8z) ue20Var.i.getValue();
            qe20 qe20Var = new qe20(ue20Var, preMatchEventData);
            u8zVar2.getClass();
            u8zVar2.f = qe20Var;
            Event event4 = preMatchEventData.getEvent();
            List<Market> filteredMarketList2 = preMatchEventData.getFilteredMarketList();
            if (filteredMarketList2 == null) {
                filteredMarketList2 = preMatchEventData.getEvent().markets;
            }
            ue20Var.b(event4, filteredMarketList2, selectedMarket2, preMatchEventData.getOddsMin(), preMatchEventData.getOddsMax(), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 0) {
            if (i == 1) {
                return new xms(iid0.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), new c());
            }
            if (i == 2) {
                return new ue20(sjd0.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), new d(), this.z);
            }
            if (i == 4) {
                return new mg20(tjd0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_sport_event_market_title, viewGroup, false)), new e());
            }
            View viewA = dzc.a(viewGroup, R.layout.spr_pre_match_load_more_item, viewGroup, false);
            int i2 = R.id.diver_line;
            View viewA2 = h5e.a(R.id.diver_line, viewA);
            if (viewA2 != null) {
                i2 = R.id.no_one_two_up_view;
                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.no_one_two_up_view, viewA);
                if (linearLayout != null) {
                    i2 = R.id.results_load_more;
                    TextView textView = (TextView) h5e.a(R.id.results_load_more, viewA);
                    if (textView != null) {
                        i2 = R.id.results_loading_progress;
                        ProgressBar progressBar = (ProgressBar) h5e.a(R.id.results_loading_progress, viewA);
                        if (progressBar != null) {
                            i2 = R.id.sports_no_match;
                            if (((TextView) h5e.a(R.id.sports_no_match, viewA)) != null) {
                                i2 = R.id.sports_no_match_icon;
                                if (((ImageView) h5e.a(R.id.sports_no_match_icon, viewA)) != null) {
                                    return new exs(new gjd0((FrameLayout) viewA, viewA2, linearLayout, textView, progressBar), new jip(this, 1));
                                }
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
            return null;
        }
        View viewA3 = dzc.a(viewGroup, R.layout.spr_sports_event_common_title_bar, viewGroup, false);
        int i3 = R.id.bottom_divider_line;
        View viewA4 = h5e.a(R.id.bottom_divider_line, viewA3);
        if (viewA4 != null) {
            i3 = R.id.delete_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.delete_layout, viewA3);
            if (constraintLayout != null) {
                i3 = R.id.fifa_world_cup_banner;
                ComposeView composeView = (ComposeView) h5e.a(R.id.fifa_world_cup_banner, viewA3);
                if (composeView != null) {
                    i3 = R.id.no_info_del_text;
                    TextView textView2 = (TextView) h5e.a(R.id.no_info_del_text, viewA3);
                    if (textView2 != null) {
                        i3 = R.id.no_info_tip_text;
                        TextView textView3 = (TextView) h5e.a(R.id.no_info_tip_text, viewA3);
                        if (textView3 != null) {
                            i3 = R.id.sports_event_load_view;
                            LoadingView loadingView = (LoadingView) h5e.a(R.id.sports_event_load_view, viewA3);
                            if (loadingView != null) {
                                i3 = R.id.sports_event_size;
                                TextView textView4 = (TextView) h5e.a(R.id.sports_event_size, viewA3);
                                if (textView4 != null) {
                                    i3 = R.id.sports_event_title;
                                    TextView textView5 = (TextView) h5e.a(R.id.sports_event_title, viewA3);
                                    if (textView5 != null) {
                                        i3 = R.id.top_divider_line;
                                        View viewA5 = h5e.a(R.id.top_divider_line, viewA3);
                                        if (viewA5 != null) {
                                            return new ggg0(new ujd0((ConstraintLayout) viewA3, viewA4, constraintLayout, composeView, textView2, textView3, loadingView, textView4, textView5, viewA5), new b(), this.y);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA3.getResources().getResourceName(i3)));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        super.onDetachedFromRecyclerView(recyclerView);
        this.A = null;
    }

    public final void p(RegularMarketRule regularMarketRule) {
        androidx.recyclerview.widget.d<T> dVar = this.a;
        int size = dVar.f.size();
        for (int i = 0; i < size; i++) {
            PreMatchSectionData preMatchSectionData = (PreMatchSectionData) dVar.f.get(i);
            if (preMatchSectionData instanceof LiveEventDataInPreMatch) {
                ((LiveEventDataInPreMatch) preMatchSectionData).setSelectedMarket(regularMarketRule);
            } else if (preMatchSectionData instanceof PreMatchEventData) {
                ((PreMatchEventData) preMatchSectionData).setSelectedMarket(regularMarketRule);
            } else if (preMatchSectionData instanceof PreMatchMarketTitleData) {
                ((PreMatchMarketTitleData) preMatchSectionData).setSelectedMarket(regularMarketRule);
            } else if (preMatchSectionData instanceof TournamentTitleData) {
                ((TournamentTitleData) preMatchSectionData).setSelectedMarket(regularMarketRule);
            }
            notifyItemChanged(i, Integer.valueOf(i));
        }
        this.w.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i, List<Object> list) {
        RegularMarketRule selectedMarket;
        RegularMarketRule selectedMarket2;
        RegularMarketRule selectedMarket3;
        d0Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            super.onBindViewHolder(d0Var, i, list);
            return;
        }
        PreMatchSectionData item = getItem(i);
        if (item == null) {
            return;
        }
        int viewType = item.getViewType();
        if (viewType == 0) {
            ggg0 ggg0Var = (ggg0) (!(d0Var instanceof ggg0) ? null : d0Var);
            if (ggg0Var != null) {
                boolean z = i != 0;
                TournamentTitleData tournamentTitleData = (TournamentTitleData) (!(item instanceof TournamentTitleData) ? null : item);
                ggg0Var.a(item, z, this.d.c(this.B, tournamentTitleData != null ? tournamentTitleData.getSportId() : null, false), this.D);
                return;
            }
            return;
        }
        if (viewType == 1) {
            xms xmsVar = (xms) (!(d0Var instanceof xms) ? null : d0Var);
            if (xmsVar != null) {
                if (!(item instanceof LiveEventDataInPreMatch)) {
                    item = null;
                }
                LiveEventDataInPreMatch liveEventDataInPreMatch = (LiveEventDataInPreMatch) item;
                if (liveEventDataInPreMatch == null || (selectedMarket = liveEventDataInPreMatch.getSelectedMarket()) == null) {
                    return;
                }
                TextView textView = xmsVar.a.v;
                Event event = liveEventDataInPreMatch.getEvent();
                liveEventDataInPreMatch.getTournamentId();
                textView.setText(b3.M(event));
                Event event2 = liveEventDataInPreMatch.getEvent();
                List<Market> filteredMarketList = liveEventDataInPreMatch.getFilteredMarketList();
                if (filteredMarketList == null) {
                    filteredMarketList = liveEventDataInPreMatch.getEvent().markets;
                }
                xmsVar.b(event2, filteredMarketList, selectedMarket, liveEventDataInPreMatch.getOddsMin(), liveEventDataInPreMatch.getOddsMax(), i);
                return;
            }
            return;
        }
        if (viewType != 2) {
            if (viewType != 4) {
                return;
            }
            mg20 mg20Var = (mg20) (!(d0Var instanceof mg20) ? null : d0Var);
            if (mg20Var != null) {
                if (!(item instanceof PreMatchMarketTitleData)) {
                    item = null;
                }
                PreMatchMarketTitleData preMatchMarketTitleData = (PreMatchMarketTitleData) item;
                if (preMatchMarketTitleData == null || (selectedMarket3 = preMatchMarketTitleData.getSelectedMarket()) == null) {
                    return;
                }
                mg20Var.a(selectedMarket3);
                return;
            }
            return;
        }
        ue20 ue20Var = (ue20) (!(d0Var instanceof ue20) ? null : d0Var);
        if (ue20Var != null) {
            lty ltyVar = ue20Var.f;
            ltyVar.a();
            if (!(item instanceof PreMatchEventData)) {
                item = null;
            }
            PreMatchEventData preMatchEventData = (PreMatchEventData) item;
            if (preMatchEventData == null || (selectedMarket2 = preMatchEventData.getSelectedMarket()) == null) {
                return;
            }
            ue20Var.c.a(ltyVar, preMatchEventData.getEvent(), selectedMarket2, new se20(0, ue20Var.b, zd20.class, "onOneUpPromoTagClicked", "onOneUpPromoTagClicked()V", 0));
            TextView textView2 = ue20Var.a.v;
            Event event3 = preMatchEventData.getEvent();
            preMatchEventData.getTournamentId();
            textView2.setText(b3.M(event3));
            Event event4 = preMatchEventData.getEvent();
            List<Market> filteredMarketList2 = preMatchEventData.getFilteredMarketList();
            if (filteredMarketList2 == null) {
                filteredMarketList2 = preMatchEventData.getEvent().markets;
            }
            ue20Var.b(event4, filteredMarketList2, selectedMarket2, preMatchEventData.getOddsMin(), preMatchEventData.getOddsMax(), i);
        }
    }
}
