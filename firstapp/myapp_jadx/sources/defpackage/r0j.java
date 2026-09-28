package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r0j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xss xssVar;
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                n2j n2jVar = (n2j) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState == null) {
                    return Unit.a;
                }
                int i2 = 1;
                if (loadingState.getStatus() != Status.RUNNING) {
                    n2jVar.w0(loadingState.getStatus(), loadingState.getError(), new sg5(i2, n2jVar, loadingState));
                    return Unit.a;
                }
                fo2 fo2Var = n2jVar.W;
                if (fo2Var != null) {
                    fo2Var.k(true);
                }
                return Unit.a;
            default:
                LivePageActivity livePageActivity = (LivePageActivity) obj2;
                lk50 lk50Var = (lk50) obj;
                int i3 = LivePageActivity.b0;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    uqs uqsVarG1 = livePageActivity.G1();
                    ArrayList arrayList = uqsVarG1.e0;
                    arrayList.clear();
                    ArrayList arrayList2 = uqsVarG1.d0;
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = arrayList2.get(i4);
                        i4++;
                        OrderedSportItem orderedSportItemF1 = uqsVarG1.F1((mfb0) obj3);
                        if (orderedSportItemF1 != null) {
                            arrayList3.add(orderedSportItemF1);
                        }
                    }
                    arrayList.addAll(arrayList3);
                    mfb0 mfb0Var = livePageActivity.G1().B;
                    if (mfb0Var == null) {
                        uqs uqsVarG2 = livePageActivity.G1();
                        String stringExtra = livePageActivity.getIntent().getStringExtra("key_sport_id");
                        String str2 = "";
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        lfb0 lfb0VarD = lfb0.d();
                        if (StringsKt.U(stringExtra)) {
                            OrderedSportItem orderedSportItem = (OrderedSportItem) CollectionsKt.firstOrNull(uqsVarG2.e0);
                            if (orderedSportItem == null || (str = orderedSportItem.id) == null) {
                                mfb0 mfb0Var2 = (mfb0) CollectionsKt.firstOrNull(uqsVarG2.d0);
                                String id = mfb0Var2 != null ? mfb0Var2.getId() : null;
                                if (id != null) {
                                    str2 = id;
                                }
                            } else {
                                str2 = str;
                            }
                            stringExtra = str2;
                        }
                        mfb0 mfb0VarE = lfb0VarD.e(stringExtra);
                        uqsVarG2.B = mfb0VarE;
                        if (mfb0VarE == null) {
                            return Unit.a;
                        }
                        mfb0Var = mfb0VarE;
                    }
                    if (livePageActivity.G1().e0.isEmpty()) {
                        livePageActivity.G1().e0.add(new OrderedSportItem(mfb0Var.getId(), mfb0Var.c(), 0));
                    }
                    if (livePageActivity.z1().i.getTabCount() == 0) {
                        livePageActivity.K1();
                    } else {
                        livePageActivity.O1();
                        livePageActivity.J1();
                    }
                } else if (lk50Var instanceof lk50.a) {
                    livePageActivity.z1().w.setRefreshing(false);
                    xss xssVar2 = livePageActivity.Q;
                    if (xssVar2 != null) {
                        xssVar2.z();
                    }
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_LIVE_PAGE);
                    aVar.b(((lk50.a) lk50Var).a);
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    if (!livePageActivity.z1().w.c && (xssVar = livePageActivity.Q) != null) {
                        xssVar.A();
                    }
                }
                return Unit.a;
        }
    }
}
