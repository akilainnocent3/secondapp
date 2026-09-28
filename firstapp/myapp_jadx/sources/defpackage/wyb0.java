package defpackage;

import com.sportygames.commons.models.TournamentConfigVO;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.tournament.model.TournamentHistoryResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class wyb0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wyb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HTTPResponse hTTPResponse;
        HashMap map;
        Object next;
        String name;
        Long l;
        List list;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                q1c0 q1c0Var = (q1c0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (q1c0.b.a[loadingState.getStatus().ordinal()] == 1 && (hTTPResponse = (HTTPResponse) loadingState.getData()) != null && (map = (HashMap) hTTPResponse.getData()) != null && !map.isEmpty()) {
                    Set setEntrySet = map.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) CollectionsKt.U(setEntrySet);
                    if (entry == null || (list = (List) entry.getValue()) == null || list.isEmpty()) {
                        ssw<TournamentHistoryResponse> sswVar = xag0.d;
                        Long lValueOf = Long.valueOf((entry == null || (l = (Long) entry.getKey()) == null) ? 0L : l.longValue());
                        Iterator<T> it = q1c0Var.c2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            TournamentConfigVO tournamentConfigVO = (TournamentConfigVO) next;
                            name = tournamentConfigVO != null ? tournamentConfigVO.getName() : null;
                            if (name == null) {
                                name = "";
                            }
                            sswVar.j(new TournamentHistoryResponse(lValueOf, name, Double.valueOf(0.0d)));
                        } while (!Intrinsics.g(((TournamentConfigVO) next).getId(), entry != null ? (Long) entry.getKey() : null));
                        TournamentConfigVO tournamentConfigVO2 = (TournamentConfigVO) next;
                        if (tournamentConfigVO2 != null) {
                        }
                        if (name == null) {
                            name = "";
                        }
                        sswVar.j(new TournamentHistoryResponse(lValueOf, name, Double.valueOf(0.0d)));
                    } else {
                        xag0.d.j((TournamentHistoryResponse) ((List) entry.getValue()).get(0));
                    }
                }
                break;
            default:
                ((aq40) obj2).a = 0.0f;
                break;
        }
        return Unit.a;
    }
}
