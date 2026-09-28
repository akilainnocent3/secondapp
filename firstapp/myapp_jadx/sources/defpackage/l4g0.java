package defpackage;

import androidx.fragment.app.Fragment;
import com.sportygames.commons.models.TournamentConfigVO;
import com.sportygames.commons.models.UserPlayInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l4g0 extends yxi {
    public czb0 A;
    public dzb0 B;
    public ezb0 C;
    public ArrayList y;
    public List<UserPlayInfo> z;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.y.size();
    }

    @Override // defpackage.yxi, androidx.recyclerview.widget.RecyclerView.f
    public final long getItemId(int i) {
        Long id = ((TournamentConfigVO) this.y.get(i)).getId();
        return id != null ? id.longValue() : i;
    }

    @Override // defpackage.yxi
    public final boolean j(long j) {
        ArrayList arrayList = this.y;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Long id = ((TournamentConfigVO) obj).getId();
                if (id != null && id.longValue() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.yxi
    public final Fragment k(int i) {
        ArrayList arrayList = this.y;
        TournamentConfigVO tournamentConfigVO = (TournamentConfigVO) arrayList.get(i);
        List<UserPlayInfo> list = this.z;
        UserPlayInfo userPlayInfo = null;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (Intrinsics.g(((UserPlayInfo) obj2).getTournamentId(), ((TournamentConfigVO) arrayList.get(i)).getId())) {
                    obj = obj2;
                    break;
                }
            }
            userPlayInfo = (UserPlayInfo) obj;
        }
        czb0 czb0Var = this.A;
        dzb0 dzb0Var = this.B;
        ezb0 ezb0Var = this.C;
        tournamentConfigVO.getClass();
        czb0Var.getClass();
        dzb0Var.getClass();
        ezb0Var.getClass();
        h4g0 h4g0Var = new h4g0();
        h4g0Var.b = tournamentConfigVO;
        h4g0Var.c = userPlayInfo;
        h4g0Var.f = czb0Var;
        h4g0Var.i = dzb0Var;
        h4g0Var.v = ezb0Var;
        return h4g0Var;
    }
}
