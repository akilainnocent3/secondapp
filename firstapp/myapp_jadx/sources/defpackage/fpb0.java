package defpackage;

import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.RoundBetResponse;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.vip.data.UserTopCoeffResponse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fpb0 {
    public final Fragment a;
    public final vt2 b;
    public final m28 c;
    public final gn2 d;
    public final lei0 e;
    public final gsb0 f;
    public final hbq g;
    public final uqb0 h;
    public final ytw<String> i;
    public final ytw<String> j;
    public final ytw<String> k;
    public final ytw<String> l;
    public final ytw<Boolean> m;
    public ArrayList n;
    public UserTopCoeffResponse o;
    public boolean p;
    public boolean q;

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[wqb0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                wqb0 wqb0Var = wqb0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                wqb0 wqb0Var2 = wqb0.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                wqb0 wqb0Var3 = wqb0.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Status.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr2;
            int[] iArr3 = new int[uzd0.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                uzd0 uzd0Var = uzd0.a;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Double.valueOf(((TopBets) t2).getStakeAmount()).compareTo(Double.valueOf(((TopBets) t).getStakeAmount()));
        }
    }

    public final void a(RoundBetResponse roundBetResponse) {
        if (((xqb0) this.h.b.getValue()).a != wqb0.a) {
            return;
        }
        try {
            if (Intrinsics.g(roundBetResponse.getMessageType(), "CASHOUT_RECORD")) {
                final TopBets bet = roundBetResponse.getBet();
                this.n.replaceAll(new UnaryOperator() { // from class: cpb0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        TopBets topBets = (TopBets) obj;
                        topBets.getClass();
                        TopBets topBets2 = bet;
                        return (topBets2 == null || topBets.getBetId() != topBets2.getBetId()) ? topBets : topBets2;
                    }
                });
                b();
                return;
            }
            List<TopBets> topBets = roundBetResponse.getTopBets();
            ArrayList arrayList = topBets != null ? new ArrayList(topBets) : null;
            if (arrayList != null) {
                this.n = arrayList;
            }
            ArrayList arrayList2 = this.n;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                if (Intrinsics.g(((TopBets) obj).getUserId(), SportyGamesManager.getInstance().getUserId())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = this.n;
            if (arrayList4.size() > 1) {
                o48.v(new b(), arrayList4);
            }
            if (!arrayList3.isEmpty()) {
                this.n.removeAll(CollectionsKt.E0(arrayList3));
                this.n.addAll(0, arrayList3);
            }
            if (this.n.isEmpty()) {
                b();
            } else {
                b();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b() {
        Object value;
        boolean zIsEmpty = this.n.isEmpty();
        uqb0 uqb0Var = this.h;
        if (!zIsEmpty) {
            uqb0Var.x1(CollectionsKt.A0(this.n), true);
            uqb0Var.y1(this.p ? Integer.valueOf(this.n.size()) : null);
        } else {
            wwd0 wwd0Var = uqb0Var.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, xqb0.a((xqb0) value, null, vqb0.b.a, null, 5)));
            uqb0Var.y1(null);
        }
    }

    public fpb0(Fragment fragment, ComposeView composeView, vt2 vt2Var, m28 m28Var, gn2 gn2Var, lei0 lei0Var, rrb0 rrb0Var, q930 q930Var, xq2 xq2Var, gsb0 gsb0Var, hbq hbqVar) {
        fragment.getClass();
        vt2Var.getClass();
        m28Var.getClass();
        lei0Var.getClass();
        this.a = fragment;
        this.b = vt2Var;
        this.c = m28Var;
        this.d = gn2Var;
        this.e = lei0Var;
        this.f = gsb0Var;
        this.g = hbqVar;
        v8i0 viewModelStore = fragment.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(uqb0.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.h = (uqb0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            String str = iKBWavCysVP.lYDyRkTMfwf;
            this.i = m.b(str);
            this.j = m.b(str);
            this.k = m.b(str);
            this.l = m.b(str);
            this.m = m.b(Boolean.FALSE);
            this.n = new ArrayList();
            return;
        }
        hb5.a("Local and anonymous classes can not be ViewModels");
        throw null;
    }
}
